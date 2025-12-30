package Visitor;

import antlr.HtmlCssParser;
import antlr.HtmlCssParserBaseVisitor;
import symbol_tabel.SymbolTable;

public class SemanticVisitor extends HtmlCssParserBaseVisitor<Void> {

    private final SymbolTable symbolTable = new SymbolTable();

    // ================= Program (Global Scope) =================
    @Override
    public Void visitDocumentRule(HtmlCssParser.DocumentRuleContext ctx) {
        symbolTable.allocate();          // Global symbol table
        visitChildren(ctx);              // Traverse AST
        symbolTable.print();             // Print at end
        return null;
    }

    // ================= HTML =================

    @Override
    public Void visitHtmlElement(HtmlCssParser.HtmlElementContext ctx) {

        String openTagText = ctx.OPEN_TAG().getText();
        int line = ctx.getStart().getLine();

        // -------- class="a b c" --------
        if (openTagText.contains("class=")) {
            String classPart = openTagText.split("class=")[1];
            String classValue = classPart.split("\"")[1]; // a b c

            for (String cls : classValue.split("\\s+")) {
                SymbolTable.SymbolEntry entry = symbolTable.lookup(cls);
                if (entry == null) {
                    entry = symbolTable.insert(cls);
                    entry.setAttribute("type", "css_class");
                    entry.setAttribute("line", line);
                    entry.setAttribute("value", null);
                }
            }
        }

        // -------- id="myId" --------
        if (openTagText.contains("id=")) {
            String idPart = openTagText.split("id=")[1];
            String idValue = idPart.split("\"")[1];

            SymbolTable.SymbolEntry entry = symbolTable.lookup(idValue);
            if (entry == null) {
                entry = symbolTable.insert(idValue);
                entry.setAttribute("type", "css_id");
                entry.setAttribute("line", line);
                entry.setAttribute("value", null);
            }
        }

        return visitChildren(ctx);
    }

    // ================= JINJA =================

    // {% set x = ... %}
    @Override
    public Void visitJinjaSetBlock(HtmlCssParser.JinjaSetBlockContext ctx) {
        String name = ctx.IDENTIFIER_STMT().getText();
        String value = ctx.stmt_expr(0).getText();

        SymbolTable.SymbolEntry entry = symbolTable.lookup(name);
        if (entry == null) {
            entry = symbolTable.insert(name);
            entry.setAttribute("type", "jinja_variable");
            entry.setAttribute("line", ctx.getStart().getLine());
        }
        entry.setAttribute("value", value);

        visitChildren(ctx);
        return null;
    }

    // {% for item in list %}
    @Override
    public Void visitJinjaForBlock(HtmlCssParser.JinjaForBlockContext ctx) {
        String varName = ctx.IDENTIFIER_STMT().getText();
        String iterable = ctx.stmt_expr(0).getText();

        SymbolTable.SymbolEntry entry = symbolTable.lookup(varName);
        if (entry == null) {
            entry = symbolTable.insert(varName);
            entry.setAttribute("type", "loop_variable");
            entry.setAttribute("line", ctx.getStart().getLine());
        }
        entry.setAttribute("value", iterable);

        visitChildren(ctx);
        return null;
    }

    // {% macro myMacro(a,b) %}
    @Override
    public Void visitJinjaMacroBlock(HtmlCssParser.JinjaMacroBlockContext ctx) {
        String macroName = ctx.IDENTIFIER_STMT(0).getText();

        SymbolTable.SymbolEntry entry = symbolTable.lookup(macroName);
        if (entry == null) {
            entry = symbolTable.insert(macroName);
            entry.setAttribute("type", "macro");
            entry.setAttribute("line", ctx.getStart().getLine());
        }
        entry.setAttribute("value", "<macro_body>");

        for (int i = 1; i < ctx.IDENTIFIER_STMT().size(); i++) {
            String param = ctx.IDENTIFIER_STMT(i).getText();
            SymbolTable.SymbolEntry pEntry = symbolTable.lookup(param);
            if (pEntry == null) {
                pEntry = symbolTable.insert(param);
                pEntry.setAttribute("type", "macro_param");
                pEntry.setAttribute("line", ctx.getStart().getLine());
                pEntry.setAttribute("value", null);
            }
        }

        visitChildren(ctx);
        return null;
    }

    // {% block content %}
    @Override
    public Void visitJinjaBlockBlock(HtmlCssParser.JinjaBlockBlockContext ctx) {
        String name = ctx.IDENTIFIER_STMT().getText();

        SymbolTable.SymbolEntry entry = symbolTable.lookup(name);
        if (entry == null) {
            entry = symbolTable.insert(name);
            entry.setAttribute("type", "jinja_block");
            entry.setAttribute("line", ctx.getStart().getLine());
            entry.setAttribute("value", "<block_body>");
        }

        visitChildren(ctx);
        return null;
    }

    // ================= CSS =================

    @Override
    public Void visitCssVariableDeclaration(HtmlCssParser.CssVariableDeclarationContext ctx) {
        String name = ctx.CSS_VAR().getText();
        String value = ctx.css_value().getText();

        SymbolTable.SymbolEntry entry = symbolTable.lookup(name);
        if (entry == null) {
            entry = symbolTable.insert(name);
            entry.setAttribute("type", "css_variable");
            entry.setAttribute("line", ctx.getStart().getLine());
        }
        entry.setAttribute("value", value);

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitClassSelector(HtmlCssParser.ClassSelectorContext ctx) {
        String name = ctx.IDENT().getText();

        SymbolTable.SymbolEntry entry = symbolTable.lookup(name);
        if (entry == null) {
            entry = symbolTable.insert(name);
            entry.setAttribute("type", "css_class");
            entry.setAttribute("line", ctx.getStart().getLine());
            entry.setAttribute("value", null);
        }
        return null;
    }

    @Override
    public Void visitIdSelector(HtmlCssParser.IdSelectorContext ctx) {
        String name = ctx.IDENT().getText();

        SymbolTable.SymbolEntry entry = symbolTable.lookup(name);
        if (entry == null) {
            entry = symbolTable.insert(name);
            entry.setAttribute("type", "css_id");
            entry.setAttribute("line", ctx.getStart().getLine());
            entry.setAttribute("value", null);
        }
        return null;
    }
}

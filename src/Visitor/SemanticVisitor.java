package Visitor;

import antlr.HtmlCssParser;
import antlr.HtmlCssParserBaseVisitor;
import symbol_tabel.SymbolTable;

public class SemanticVisitor extends HtmlCssParserBaseVisitor<Void> {

    private final SymbolTable symbolTable = new SymbolTable();

    // ================= Program (Global Scope) =================
    @Override
    public Void visitDocumentRule(HtmlCssParser.DocumentRuleContext ctx) {
       // symbolTable.allocate();          // Global symbol table
        visitChildren(ctx);              // Traverse AST
       // symbolTable.print();             // Print at end
        return null;
    }

    // ================= HTML =================

    @Override
    public Void visitHtmlElement(HtmlCssParser.HtmlElementContext ctx) {
        String openTagText = ctx.OPEN_TAG().getText();
        int line = ctx.getStart().getLine();

        // class="..."
        if (openTagText.contains("class=")) {
            String classValue = openTagText.split("class=")[1].split("\"")[1];
            for (String cls : classValue.trim().split("\\s+")) {
                SymbolTable.SymbolEntry entry = symbolTable.lookup(cls);
                if (entry == null) {
                    entry = symbolTable.insert(cls);
                    entry.setAttribute("type", "css_class");
                    entry.setAttribute("line", line);
                }
            }
        }

        // id="..."
        if (openTagText.contains("id=")) {
            String idValue = openTagText.split("id=")[1].split("\"")[1];
            SymbolTable.SymbolEntry entry = symbolTable.lookup(idValue);
            if (entry == null) {
                entry = symbolTable.insert(idValue);
                entry.setAttribute("type", "css_id");
                entry.setAttribute("line", line);
            }
        }

        // href="..."
        if (openTagText.contains("href=")) {
            String hrefValue = openTagText.split("href=")[1].split("\"")[1];
            SymbolTable.SymbolEntry entry = symbolTable.insert("href@" + line);
            entry.setAttribute("type", "html_href");
            entry.setAttribute("line", line);
            entry.setAttribute("value", hrefValue);
        }

        // form element
        if (openTagText.startsWith("<form")) {
            SymbolTable.SymbolEntry entry = symbolTable.insert("form@" + line);
            entry.setAttribute("type", "form_element");
            if (openTagText.contains("method=")) {
                entry.setAttribute("method", openTagText.split("method=")[1].split("\"")[1]);
            }
            if (openTagText.contains("action=")) {
                entry.setAttribute("action", openTagText.split("action=")[1].split("\"")[1]);
            }
        }

        if (openTagText.startsWith("<input")) {
            SymbolTable.SymbolEntry entry = symbolTable.insert("input@" + line);
            entry.setAttribute("type", "form_field");
            if (openTagText.contains("name=")) {
                entry.setAttribute("name", openTagText.split("name=")[1].split("\"")[1]);
            }
            if (openTagText.contains("type=")) {
                entry.setAttribute("field_type", openTagText.split("type=")[1].split("\"")[1]);
            }
            if (openTagText.contains("placeholder=")) {
                entry.setAttribute("placeholder", openTagText.split("placeholder=")[1].split("\"")[1]);
            }
        }

        if (openTagText.startsWith("<button")) {
            SymbolTable.SymbolEntry entry = symbolTable.insert("button@" + line);
            entry.setAttribute("type", "form_button");
            if (openTagText.contains("type=")) {
                entry.setAttribute("button_type", openTagText.split("type=")[1].split("\"")[1]);
            }
        }


        return visitChildren(ctx);
    }

    @Override
    public Void visitSelfTag(HtmlCssParser.SelfTagContext ctx) {
        String tagText = ctx.SELF_TAG().getText();
        int line = ctx.getStart().getLine();

        if (tagText.startsWith("<img")) {
            SymbolTable.SymbolEntry entry = symbolTable.insert("img@" + line);
            entry.setAttribute("type", "image_tag");
            if (tagText.contains("src=")) {
                entry.setAttribute("src", tagText.split("src=")[1].split("\"")[1]);
            }
        }

        if (tagText.startsWith("<input")) {
            SymbolTable.SymbolEntry entry = symbolTable.insert("input@" + line);
            entry.setAttribute("type", "form_field");
            if (tagText.contains("name=")) {
                entry.setAttribute("name", tagText.split("name=")[1].split("\"")[1]);
            }
            if (tagText.contains("type=")) {
                entry.setAttribute("field_type", tagText.split("type=")[1].split("\"")[1]);
            }
        }

        return null;
    }

    @Override
    public Void visitJinjaExpr(HtmlCssParser.JinjaExprContext ctx) {
        String exprText = ctx.getText();
        int line = ctx.getStart().getLine();

        String cleaned = exprText.replaceAll("[\\{\\}\\s]", "");
        if (cleaned.contains(".")) {
            SymbolTable.SymbolEntry entry = symbolTable.lookup(cleaned);
            if (entry == null) {
                entry = symbolTable.insert(cleaned);
                entry.setAttribute("type", "field_access");
                entry.setAttribute("line", line);
            }
        } else {
            SymbolTable.SymbolEntry entry = symbolTable.lookup(cleaned);
            if (entry == null) {
                entry = symbolTable.insert(cleaned);
                entry.setAttribute("type", "jinja_variable");
                entry.setAttribute("line", line);
            }
        }

        return visitChildren(ctx);
    }



    // {% set x = ... %}
    @Override
    public Void visitJinjaSetBlock(HtmlCssParser.JinjaSetBlockContext ctx) {
        String name = ctx.IDENTIFIER_STMT().getText();
        String value = ctx.stmt_expr().getText();

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

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

}

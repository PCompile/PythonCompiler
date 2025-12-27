package Visitor;

import AST.*;
import AST.selector.*;
import AST.value.*;
import gen.antlr.HtmlCssParser;
import gen.antlr.HtmlCssParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

public class JinjaVisitor extends HtmlCssParserBaseVisitor<Node> {

    // ===== Document =====
    @Override
    public Node visitDocumentRule(HtmlCssParser.DocumentRuleContext ctx) {
        Document doc = new Document(ctx.getStart().getLine());
        for (var nCtx : ctx.node()) {
            Node n = nCtx.accept(this);
            if (n != null) doc.addChild(n);
        }
        return doc;
    }

    // ===== HtmlElement =====
    @Override
    public Node visitHtmlElementNode(HtmlCssParser.HtmlElementNodeContext ctx) {
        HtmlCssParser.HtmlElementContext inner = (HtmlCssParser.HtmlElementContext) ctx.html_element();
        String openTagText = inner.OPEN_TAG().getText();
        String tagName = extractTagName(openTagText);

        HtmlElement element = new HtmlElement(tagName, ctx.getStart().getLine());
        for (var childCtx : inner.node()) {
            Node child = childCtx.accept(this);
            if (child != null) element.addChild(child);
        }
        return element;
    }

    // ===== SelfTag =====
    @Override
    public Node visitSelfTagNode(HtmlCssParser.SelfTagNodeContext ctx) {
        HtmlCssParser.SelfTagContext inner = (HtmlCssParser.SelfTagContext) ctx.self_tag();
        String tagText = inner.SELF_TAG().getText();
        String tagName = extractTagName(tagText.replace("/>", ">"));
        return new SelfTag(tagName, ctx.getStart().getLine());
    }

    // ===== TextHtml =====
    @Override
    public Node visitTextHtmlNode(HtmlCssParser.TextHtmlNodeContext ctx) {
        HtmlCssParser.TextHtmlContext inner = (HtmlCssParser.TextHtmlContext) ctx.text_html();
        String text = inner.TEXT_HTML().getText();
        return new TextHtml(text, ctx.getStart().getLine());
    }

    // ===== StyleBlock =====
    @Override
    public Node visitStyleElementNode(HtmlCssParser.StyleElementNodeContext ctx) {
        StyleBlock block = new StyleBlock(ctx.getStart().getLine());

        HtmlCssParser.Style_elementContext inner = ctx.style_element();
        if (inner instanceof HtmlCssParser.StyleBlockContext styleBlock) {
            HtmlCssParser.CssRulesListContext rulesCtx = (HtmlCssParser.CssRulesListContext) styleBlock.css_rules();
            for (HtmlCssParser.Css_ruleContext ruleCtx : rulesCtx.css_rule()) {
                Node rule = ruleCtx.accept(this);
                if (rule instanceof CssRule cssRule) {
                    block.addRule(cssRule);
                }
            }
        }

        return block;
    }



    // ===== RootRule =====
    @Override
    public Node visitRootRule(HtmlCssParser.RootRuleContext ctx) {
        SelectorRule rule = new SelectorRule(ctx.getStart().getLine());
        Selector selector = new Selector(ctx.getStart().getLine());
        SelectorPart part = new SelectorPart(ctx.getStart().getLine());
        part.addItem(new PseudoSelector(ctx.getStart().getLine(), "root"));
        selector.addPart(part);
        rule.setSelector(selector);

        HtmlCssParser.Css_bodyContext bodyCtx = ctx.css_body();
        if (bodyCtx instanceof HtmlCssParser.CssBodyContext cssBody) {
            for (HtmlCssParser.Css_declContext declCtx : cssBody.css_decl()) {
                CssDeclaration decl = (CssDeclaration) visit(declCtx);
                rule.addDeclaration(decl);
            }
        }
        return rule;
    }

    // ===== SelectorRule =====
    @Override
    public Node visitSelectorRule(HtmlCssParser.SelectorRuleContext ctx) {
        SelectorRule rule = new SelectorRule(ctx.getStart().getLine());
        Selector selector = (Selector) visit(ctx.selector());
        rule.setSelector(selector);

        HtmlCssParser.Css_bodyContext bodyCtx = ctx.css_body();
        if (bodyCtx instanceof HtmlCssParser.CssBodyContext cssBody) {
            for (HtmlCssParser.Css_declContext declCtx : cssBody.css_decl()) {
                CssDeclaration decl = (CssDeclaration) visit(declCtx);
                rule.addDeclaration(decl);
            }
        }
        return rule;
    }

    // ===== CssDeclaration =====
    @Override
    public Node visitCssPropertyDeclaration(HtmlCssParser.CssPropertyDeclarationContext ctx) {
        String prop = ctx.IDENT().getText();
        CssDeclaration decl = new CssDeclaration(ctx.getStart().getLine(), prop);
        CssValue val = (CssValue) ctx.css_value().accept(this);
        decl.addValue(val);
        return decl;
    }

    @Override
    public Node visitCssVariableDeclaration(HtmlCssParser.CssVariableDeclarationContext ctx) {
        String prop = ctx.CSS_VAR().getText();
        CssDeclaration decl = new CssDeclaration(ctx.getStart().getLine(), prop);
        CssValue val = (CssValue) ctx.css_value().accept(this);
        decl.addValue(val);
        return decl;
    }

    // ===== Values =====
    @Override
    public Node visitValueNumber(HtmlCssParser.ValueNumberContext ctx) {
        return new NumberValue(ctx.getStart().getLine(), ctx.NUMBER().getText());
    }

    @Override
    public Node visitValueString(HtmlCssParser.ValueStringContext ctx) {
        String s = stripQuotes(ctx.STRING().getText());
        return new StringValue(ctx.getStart().getLine(), s);
    }

    @Override
    public Node visitValueIdentifier(HtmlCssParser.ValueIdentifierContext ctx) {
        return new IdentValue(ctx.getStart().getLine(), ctx.IDENTIFIER().getText());
    }

    @Override
    public Node visitValueFunctionCall(HtmlCssParser.ValueFunctionCallContext ctx) {
        HtmlCssParser.Function_callContext funcCtx = ctx.function_call();

        // اسم الدالة باستخدام getToken بدل IDENTIFIER()
        String funcName = funcCtx.getToken(HtmlCssParser.IDENTIFIER, 0).getText();
        FunctionCallValue func = new FunctionCallValue(ctx.getStart().getLine(), funcName);

        // الوسائط من expr()
        for (HtmlCssParser.ExprContext argCtx : funcCtx.getRuleContexts(HtmlCssParser.ExprContext.class)) {
            CssValue arg = (CssValue) visit(argCtx);
            func.addArgument(arg);
        }

        return func;
    }



    @Override
    public Node visitValueParen(HtmlCssParser.ValueParenContext ctx) {
        CssValue inner = (CssValue) visit(ctx.expr());
        return new ParenValue(ctx.getStart().getLine(), inner);
    }

    // ===== Selectors =====
    @Override
    public Node visitTypeSelector(HtmlCssParser.TypeSelectorContext ctx) {
        return new TypeSelector(ctx.getStart().getLine(), ctx.IDENT().getText());
    }

    @Override
    public Node visitClassSelector(HtmlCssParser.ClassSelectorContext ctx) {
        return new ClassSelector(ctx.getStart().getLine(), ctx.IDENT().getText());
    }

    @Override
    public Node visitIdSelector(HtmlCssParser.IdSelectorContext ctx) {
        return new IdSelector(ctx.getStart().getLine(), ctx.IDENT().getText());
    }

    @Override
    public Node visitPseudoClassSelector(HtmlCssParser.PseudoClassSelectorContext ctx) {
        return new PseudoSelector(ctx.getStart().getLine(), ctx.IDENT().getText());
    }
    @Override
    public Node visitChildCombinator(HtmlCssParser.ChildCombinatorContext ctx) {
        return new Combinator(ctx.getStart().getLine(), ">");
    }

    @Override
    public Node visitAdjacentSiblingCombinator(HtmlCssParser.AdjacentSiblingCombinatorContext ctx) {
        return new Combinator(ctx.getStart().getLine(), "+");
    }

    @Override
    public Node visitGeneralSiblingCombinator(HtmlCssParser.GeneralSiblingCombinatorContext ctx) {
        return new Combinator(ctx.getStart().getLine(), "~");
    }

    @Override
    public Node visitHexColorValue(HtmlCssParser.HexColorValueContext ctx) {
        return new HexColorValue(ctx.getStart().getLine(), ctx.HEX_COLOR().getText());
    }

    @Override
    public Node visitVariableReference(HtmlCssParser.VariableReferenceContext ctx) {
        return new VariableReference(ctx.getStart().getLine(), ctx.CSS_VAR().getText());
    }


    @Override
    public Node visitPercentValue(HtmlCssParser.PercentValueContext ctx) {
        String raw = ctx.PERCENTCsd().getText().replace("%", "");
        return new PercentValue(ctx.getStart().getLine(), raw);
    }

    @Override
    public Node visitCommaSeparator(HtmlCssParser.CommaSeparatorContext ctx) {
        return new CommaSeparator(ctx.getStart().getLine());
    }


    @Override
    public Node visitCssValueSequence(HtmlCssParser.CssValueSequenceContext ctx) {
        CssValueSequence sequence = new CssValueSequence(ctx.getStart().getLine());
        for (HtmlCssParser.Css_value_atomContext atomCtx : ctx.css_value_atom()) {
            CssValue atom = (CssValue) visit(atomCtx);
            sequence.addValue(atom);
        }
        return sequence;
    }





    @Override
    public Node visitSelectorGroup(HtmlCssParser.SelectorGroupContext ctx) {
        Selector selector = new Selector(ctx.getStart().getLine());
        for (HtmlCssParser.Selector_partContext partCtx : ctx.selector_part()) {
            SelectorPart part = (SelectorPart) visit(partCtx);
            selector.addPart(part);
        }
        return selector;
    }

    @Override
    public Node visitSelectorSequence(HtmlCssParser.SelectorSequenceContext ctx) {
        SelectorPart part = new SelectorPart(ctx.getStart().getLine());
        for (ParseTree child : ctx.children) {
            Node item = visit(child);
            if (item instanceof SelectorItem selectorItem) {
                part.addItem(selectorItem);
            }
        }
        return part;
    }






    @Override
    public Node visitValueListRule(HtmlCssParser.ValueListRuleContext ctx) {
        ListLiteralExpr list = new ListLiteralExpr(ctx.getStart().getLine());

        for (HtmlCssParser.ExprContext exprCtx : ctx.getRuleContexts(HtmlCssParser.ExprContext.class)) {
            Expr item = (Expr) visit(exprCtx); // ✅ لازم يكون Expr مش CssValue
            list.addElement(item);
        }

        return list;
    }







    // ===== Helpers =====
    private String extractTagName(String openTagText) {
        if (openTagText == null || openTagText.length() < 3) return "";
        String inner = openTagText.substring(1, openTagText.length() - 1).trim();
        int spaceIdx = inner.indexOf(' ');
        return (spaceIdx == -1) ? inner : inner.substring(0, spaceIdx);
    }

    private String stripQuotes(String s) {
        if (s == null) return "";
        if ((s.startsWith("\"") && s.endsWith("\"")) || (s.startsWith("'") && s.endsWith("'"))) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}

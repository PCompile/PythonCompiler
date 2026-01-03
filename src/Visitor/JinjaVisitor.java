package Visitor;
import AST.*;
import AST.selector.*;
import AST.value.*;
import antlr.HtmlCssParser;
import antlr.HtmlCssParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



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
    public Node visitHtmlElement(HtmlCssParser.HtmlElementContext ctx) {
        String openTagText = ctx.OPEN_TAG().getText(); // مثل "<li style="color: red;">"
        String tagName = extractTagName(openTagText);

        HtmlElement element = new HtmlElement(tagName, ctx.getStart().getLine());

        Map<String, String> attrs = extractAttributes(openTagText);
        for (Map.Entry<String, String> attr : attrs.entrySet()) {
            element.addAttribute(attr.getKey(), attr.getValue());
        }

        for (HtmlCssParser.NodeContext childCtx : ctx.node()) {
            Node child = visit(childCtx);
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

    @Override
    public Node visitSelfTag(HtmlCssParser.SelfTagContext ctx) {
        String tagName = extractTagName(ctx.SELF_TAG().getText().replace("/>", ">"));
        return new SelfTag(tagName, ctx.getStart().getLine());
    }

    // ===== TextHtml =====
    @Override
    public Node visitTextHtml(HtmlCssParser.TextHtmlContext ctx) {
        return new TextHtml(ctx.TEXT_HTML().getText(), ctx.getStart().getLine());
    }

    // ===== Content =====
    @Override
    public Node visitContentRule(HtmlCssParser.ContentRuleContext ctx) {
        Content content = new Content(ctx.getStart().getLine());
        for (HtmlCssParser.NodeContext nctx : ctx.node()) {
            Node n = visit(nctx);
            if (n != null) content.addChild(n);
        }
        return content;
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

    @Override
    public Node visitStyleBlock(HtmlCssParser.StyleBlockContext ctx) {
        StyleBlock block = new StyleBlock(ctx.getStart().getLine());
        HtmlCssParser.CssRulesListContext rulesCtx = (HtmlCssParser.CssRulesListContext) ctx.css_rules();
        for (HtmlCssParser.Css_ruleContext ruleCtx : rulesCtx.css_rule()) {
            CssRule rule = (CssRule) visit(ruleCtx);
            block.addRule(rule);
        }
        return block;
    }

    // ===== RootRule =====
    @Override
    public Node visitRootRule(HtmlCssParser.RootRuleContext ctx) {
        Selector selector = new Selector(ctx.getStart().getLine());
        SelectorPart part = new SelectorPart(ctx.getStart().getLine());
        part.addItem(new PseudoSelector(ctx.getStart().getLine(), "root"));
        selector.addPart(part);

        SelectorRule rule = new SelectorRule(ctx.getStart().getLine(), selector);

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
        Selector selector = (Selector) visit(ctx.selector());

        SelectorRule rule = new SelectorRule(ctx.getStart().getLine(), selector);

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

    // ===== Css values sequence =====
    @Override
    public Node visitCssValueSequence(HtmlCssParser.CssValueSequenceContext ctx) {
        CssValueSequence sequence = new CssValueSequence(ctx.getStart().getLine());
        for (HtmlCssParser.Css_value_atomContext atomCtx : ctx.css_value_atom()) {
            CssValue atom = (CssValue) visit(atomCtx);
            if (atom != null) sequence.addValue(atom);
        }
        return sequence;
    }

    // ===== CSS value atoms =====
    @Override
    public Node visitIdentValue(HtmlCssParser.IdentValueContext ctx) {
        return new IdentValue(ctx.getStart().getLine(), ctx.IDENT().getText());
    }

    @Override
    public Node visitNumberValue(HtmlCssParser.NumberValueContext ctx) {
        return new NumberValue(ctx.getStart().getLine(), ctx.NUMBERCSS().getText());
    }

    @Override
    public Node visitStringValue(HtmlCssParser.StringValueContext ctx) {
        String raw = ctx.STRING_CSS().getText();
        String unquoted = raw.substring(1, raw.length() - 1);
        return new StringValue(ctx.getStart().getLine(), unquoted);
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
    public Node visitCssFunctionCall(HtmlCssParser.CssFunctionCallContext ctx) {
        String funcName =
                (ctx.getToken(HtmlCssParser.IDENT, 0) != null) ? ctx.getToken(HtmlCssParser.IDENT, 0).getText() :
                        (ctx.getToken(HtmlCssParser.VAR_FUNC, 0) != null) ? ctx.getToken(HtmlCssParser.VAR_FUNC, 0).getText() :
                                ctx.getToken(HtmlCssParser.RGBA_FUNC, 0).getText();

        FunctionCallValue func = new FunctionCallValue(ctx.getStart().getLine(), funcName);

        HtmlCssParser.Css_valueContext inner = ctx.css_value();
        if (inner != null) {
            CssValue valueSeq = (CssValue) visit(inner); // CssValue
            func.addArgument(valueSeq);
        }
        return func; // CssValue
    }







    // ===== Selectors =====
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

    // ===== Jinja: value in {{ ... }} =====
    @Override
    public Node visitValueNumber(HtmlCssParser.ValueNumberContext ctx) {
        return new LiteralExpr(ctx.getStart().getLine(), ctx.NUMBER().getText());
    }

    @Override
    public Node visitValueString(HtmlCssParser.ValueStringContext ctx) {
        String raw = ctx.STRING().getText();
        String unquoted = raw.substring(1, raw.length() - 1);
        return new LiteralExpr(ctx.getStart().getLine(), "\"" + unquoted + "\"");
    }

    @Override
    public Node visitValueIdentifier(HtmlCssParser.ValueIdentifierContext ctx) {
        Expr current = new IdentifierExpr(ctx.getStart().getLine(), ctx.IDENTIFIER().getText());

        for (HtmlCssParser.Value_suffixContext sctx : ctx.value_suffix()) {
            if (sctx instanceof HtmlCssParser.DotSuffixContext dotCtx) {
                current = new DotAccess(ctx.getStart().getLine(), current, dotCtx.IDENTIFIER().getText());
            } else if (sctx instanceof HtmlCssParser.IndexSuffixContext idxCtx) {
                Expr index = (Expr) visit(idxCtx.expr());
                current = new IndexAccess(ctx.getStart().getLine(), current, index);
            }
        }

        return current;
    }


    @Override
    public Node visitDotSuffix(HtmlCssParser.DotSuffixContext ctx) {
        return new DotAccess(ctx.getStart().getLine(), null, ctx.IDENTIFIER().getText());
    }

    @Override
    public Node visitIndexSuffix(HtmlCssParser.IndexSuffixContext ctx) {
        Expr index = (Expr) visit(ctx.expr());
        return new IndexAccess(ctx.getStart().getLine(), null, index);
    }

    @Override
    public Node visitFunctionCall(HtmlCssParser.FunctionCallContext ctx) {
        FunctionCallExpr func = new FunctionCallExpr(ctx.IDENTIFIER().getText(), ctx.getStart().getLine());
        for (HtmlCssParser.ExprContext argCtx : ctx.expr()) {
            func.addArg((Expr) visit(argCtx));
        }
        return func;
    }


    @Override
    public Node visitListLiteral(HtmlCssParser.ListLiteralContext ctx) {
        ListLiteralExpr list = new ListLiteralExpr(ctx.getStart().getLine());
        for (HtmlCssParser.Filter_exprContext exprCtx : ctx.filter_expr()) {
            list.addElement((Expr) visit(exprCtx));
        }
        return list;
    }


    @Override
    public Node visitValueParen(HtmlCssParser.ValueParenContext ctx) {
        Node inner = visit(ctx.expr());
        if (inner instanceof CssValue cssVal) {
            return new ParenValue(ctx.getStart().getLine(), cssVal);
        } else {
            return new ParenExpr(ctx.getStart().getLine(), (Expr) inner);
        }
    }

    @Override
    public Node visitFilterExpr(HtmlCssParser.FilterExprContext ctx) {
        Expr base = (Expr) visit(ctx.value());

        if (ctx.IDENTIFIER().isEmpty()) {
            return base;
        }

        FilterExpr chain = new FilterExpr(ctx.getStart().getLine(), base);
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String fname = ctx.IDENTIFIER(i).getText();
            List<Expr> args = new ArrayList<>();
            if (ctx.expr(i) != null) {
                args.add((Expr) visit(ctx.expr(i)));
            }
            chain.addFilter(fname, args);
        }
        return chain;
    }





    // ===== Jinja: precedence chain (expr) =====
    @Override
    public Node visitExprRule(HtmlCssParser.ExprRuleContext ctx) {
        return visit(ctx.or_expr());
    }

    @Override
    public Node visitOrSingle(HtmlCssParser.OrSingleContext ctx) {
        return visit(ctx.and_expr());
    }

    @Override
    public Node visitOrBinary(HtmlCssParser.OrBinaryContext ctx) {
        Expr left = (Expr) visit(ctx.or_expr());
        Expr right = (Expr) visit(ctx.and_expr());
        return new BinaryExpr("or",left, right,ctx.getStart().getLine());
    }

    @Override
    public Node visitAndSingle(HtmlCssParser.AndSingleContext ctx) {
        return visit(ctx.equality_expr());
    }

    @Override
    public Node visitAndBinary(HtmlCssParser.AndBinaryContext ctx) {
        Expr left = (Expr) visit(ctx.and_expr());
        Expr right = (Expr) visit(ctx.equality_expr());
        return new BinaryExpr("and", left,right,ctx.getStart().getLine());
    }

    @Override
    public Node visitEqualitySingle(HtmlCssParser.EqualitySingleContext ctx) {
        return visit(ctx.additive_expr());
    }

    @Override
    public Node visitEqualityBinary(HtmlCssParser.EqualityBinaryContext ctx) {
        Expr left = (Expr) visit(ctx.equality_expr());
        Expr right = (Expr) visit(ctx.additive_expr());
        String op = ctx.getChild(1).getText(); // EQ, NEQ, LT, GT, LTE, GTE, IN
        return new BinaryExpr(mapOp(op), left, right,ctx.getStart().getLine());
    }

    @Override
    public Node visitAdditiveSingle(HtmlCssParser.AdditiveSingleContext ctx) {
        return visit(ctx.multiplicative_expr());
    }

    @Override public Node visitAdditiveBinary(HtmlCssParser.AdditiveBinaryContext ctx) {
        Expr left = (Expr) visit(ctx.additive_expr());
        Expr right = (Expr) visit(ctx.multiplicative_expr());
        String op = ctx.getChild(1).getText();  // PLUS | MINUS | TILDE
               return new BinaryExpr(mapOp(op), left, right, ctx.getStart().getLine());
    }



    @Override
    public Node visitMultiplicativeSingle(HtmlCssParser.MultiplicativeSingleContext ctx) {
        return visit(ctx.unary_expr());
    }

    @Override public Node visitMultiplicativeBinary(HtmlCssParser.MultiplicativeBinaryContext ctx) {
        Expr left = (Expr) visit(ctx.multiplicative_expr());
        Expr right = (Expr) visit(ctx.unary_expr());
        String op = ctx.getChild(1).getText(); // STAR | SLASH | PERCENT | FLOORDIV
        return new BinaryExpr(mapOp(op), left, right, ctx.getStart().getLine()); }

    @Override
    public Node visitUnaryNot(HtmlCssParser.UnaryNotContext ctx) {
        Expr inner = (Expr) visit(ctx.unary_expr());
        return new UnaryExpr( "not", inner,ctx.getStart().getLine());
    }

    @Override
    public Node visitUnaryPlus(HtmlCssParser.UnaryPlusContext ctx) {
        Expr inner = (Expr) visit(ctx.unary_expr());
        return new UnaryExpr("+", inner,ctx.getStart().getLine());
    }

    @Override
    public Node visitUnaryMinus(HtmlCssParser.UnaryMinusContext ctx) {
        Expr inner = (Expr) visit(ctx.unary_expr());
        return new UnaryExpr( "-", inner, ctx.getStart().getLine());
    }

    @Override
    public Node visitUnaryPrimary(HtmlCssParser.UnaryPrimaryContext ctx) {
        return visit(ctx.primary());
    }

    @Override
    public Node visitPrimaryRule(HtmlCssParser.PrimaryRuleContext ctx) {
        return visit(ctx.filter_expr());
    }

    // ===== Jinja {{ ... }} top-level node =====
    @Override
    public Node visitJinjaExpr(HtmlCssParser.JinjaExprContext ctx) {
        return new JinjaExpr( (Expr) visit(ctx.expr()),ctx.getStart().getLine());
    }
    @Override
    public Node visitJinjaExprNode(HtmlCssParser.JinjaExprNodeContext ctx) {
        return visit(ctx.jinja_expr()); // بيرجع JinjaExpr (Node)
    }


    // ===== BinOp token mapping (for equality and arithmetic) =====
    private String mapOp(String tokenText) {
        return switch (tokenText) {
            case "==" -> "==";
            case "!=" -> "!=";
            case "<" -> "<";
            case ">" -> ">";
            case "<=" -> "<=";
            case ">=" -> ">=";
            case "in" -> "in";
            case "+" -> "+";
            case "-" -> "-";
            case "~" -> "~";
            case "*" -> "*";
            case "/" -> "/";
            case "%" -> "%";
            case "//" -> "//";
            default -> tokenText;
        };
    }

    // ================= JINJA: STATEMENTS & BLOCKS =================

    @Override
    public Node visitJinjaIfBlock(HtmlCssParser.JinjaIfBlockContext ctx) {
        Expr condition = (Expr) visit(ctx.stmt_expr(0));

        // then-content
        List<Node> thenContent = new ArrayList<>();
        for (HtmlCssParser.NodeContext nctx : ctx.content(0).getRuleContexts(HtmlCssParser.NodeContext.class)) {
            thenContent.add(visit(nctx));
        }

        // elif blocks
        List<JinjaElseIf> elifBranches = new ArrayList<>();
        int elifCount = ctx.ELIF().size();
        for (int i = 0; i < elifCount; i++) {
            Expr cond = (Expr) visit(ctx.stmt_expr(i + 1));
            List<Node> elifContent = new ArrayList<>();
            for (HtmlCssParser.NodeContext nctx : ctx.content(i + 1).getRuleContexts(HtmlCssParser.NodeContext.class)) {
                elifContent.add(visit(nctx));
            }
            elifBranches.add(new JinjaElseIf(cond, elifContent));
        }

        // else-content
        List<Node> elseContent = new ArrayList<>();
        if (ctx.ELSE() != null) {
            for (HtmlCssParser.NodeContext nctx : ctx.content(ctx.content().size() - 1)
                    .getRuleContexts(HtmlCssParser.NodeContext.class)) {
                elseContent.add(visit(nctx));
            }
        }

        return new JinjaIfBlock(ctx.getStart().getLine(), condition, thenContent, elifBranches, elseContent);
    }


    @Override
    public Node visitJinjaForBlock(HtmlCssParser.JinjaForBlockContext ctx) {
        String varName = ctx.IDENTIFIER_STMT().getText();

        Expr iterable = (Expr) visit(ctx.stmt_expr(0));

        List<Node> body = new ArrayList<>();
        for (HtmlCssParser.NodeContext nctx : ctx.content().getRuleContexts(HtmlCssParser.NodeContext.class)) {
            Node child = visit(nctx);
            if (child != null) body.add(child);
        }


        JinjaFor forNode = new JinjaFor(ctx.getStart().getLine(), varName, iterable, body);

        if (ctx.IF() != null) {
            Expr ifCond = (Expr) visit(ctx.stmt_expr(1));
            forNode.setIfCondition(ifCond); 
        }

        return forNode;
    }

    @Override
    public Node visitJinjaBlockBlock(HtmlCssParser.JinjaBlockBlockContext ctx) {
        String name = ctx.IDENTIFIER_STMT().getText();

        List<Node> body = new ArrayList<>();
        Node contentNode = visit(ctx.content());
        if (contentNode instanceof Content content) {
            body.addAll(content.getChildren()); 
        } else if (contentNode != null) {
            body.add(contentNode);
        }

        return new JinjaBlock(ctx.getStart().getLine(), name, body);
    }



    @Override
    public Node visitJinjaMacroBlock(HtmlCssParser.JinjaMacroBlockContext ctx) {
        String name = ctx.IDENTIFIER_STMT(0).getText();
        List<String> params = new ArrayList<>();
        // (LPAREN_STMT (IDENTIFIER_STMT (COMMA_STMT IDENTIFIER_STMT)*)? RPAREN_STMT)?
        for (int i = 1; i < ctx.IDENTIFIER_STMT().size(); i++) {
            params.add(ctx.IDENTIFIER_STMT(i).getText());
        }

        List<Node>  body = new ArrayList<>();
        Node contentNode = visit (ctx.content());
        if (contentNode instanceof Content content){

            body.addAll(content.getChildren());
        }

        else if (contentNode!=null){

            body.add(contentNode);
        }
        return new JinjaMacro(ctx.getStart().getLine(), name, params, body);
    }

    @Override
    public Node visitJinjaInclude(HtmlCssParser.JinjaIncludeContext ctx) {
        String file = stripQuotes(ctx.STRING_STMT().getText());
        return new JinjaInclude(ctx.getStart().getLine(), file);
    }

    @Override
    public Node visitJinjaSetBlock(HtmlCssParser.JinjaSetBlockContext ctx) {
        String name = ctx.IDENTIFIER_STMT().getText();
        Expr value = (Expr) visit(ctx.stmt_expr()); 
        return new JinjaSet(ctx.getStart().getLine(), name, value);
    }

    @Override
    public Node visitJinjaFilterBlock(HtmlCssParser.JinjaFilterBlockContext ctx) {
        String filterName = ctx.IDENTIFIER_STMT().getText();

        List<Node> body = new ArrayList<>();
        Node contentNode = visit(ctx.content());
        if (contentNode instanceof Content content) {
            body.addAll(content.getChildren()); // إذا عندك Content فيه children
        } else if (contentNode != null) {
            body.add(contentNode);
        }

        return new JinjaFilter(ctx.getStart().getLine(), filterName, body);
    }

    @Override
    public Node visitJinjaCallBlock(HtmlCssParser.JinjaCallBlockContext ctx) {
        String macroName = ctx.IDENTIFIER_STMT().getText();

        List<Expr> args = new ArrayList<>();
        if (ctx.LPAREN_STMT() != null) {
            for (HtmlCssParser.Stmt_or_exprContext sox : ctx.stmt_or_expr()) {
                args.add((Expr) visit(sox)); 
            }
        }

     
        List<Node> body = new ArrayList<>();
        Node contentNode = visit(ctx.content());
        if (contentNode instanceof Content content) {
            body.addAll(content.getChildren());
        } else if (contentNode != null) {
            body.add(contentNode);
        }

        return new JinjaCall(ctx.getStart().getLine(), macroName, args, body);
    }


    @Override
    public Node visitJinjaExtends(HtmlCssParser.JinjaExtendsContext ctx) {
        String file = stripQuotes(ctx.STRING_STMT().getText());
        return new JinjaExtends(ctx.getStart().getLine(), file);
    }

    @Override
    public Node visitJinjaWithBlock(HtmlCssParser.JinjaWithBlockContext ctx) {
        String varName = ctx.IDENTIFIER_STMT().getText();
        Node value = visit(ctx.stmt_expr());

        List<Node> body = new ArrayList<>();
        Node contentNode = visit(ctx.content());
        if (contentNode instanceof Content content) {
            body.addAll(content.getChildren());
        } else if (contentNode != null) {
            body.add(contentNode);
        }

        return new JinjaWith(ctx.getStart().getLine(), varName, value, body);
    }


    // ================= JINJA: stmt_expr family =================

    @Override
    public Node visitStmtExpr(HtmlCssParser.StmtExprContext ctx) {
        return visit(ctx.stmt_or_expr());
    }

    @Override
    public Node visitStmtPrimaryExpr(HtmlCssParser.StmtPrimaryExprContext ctx) {
        return visit(ctx.stmt_primary());
    }

    @Override
    public Node visitStmtIdentifier(HtmlCssParser.StmtIdentifierContext ctx) {
        Expr current = new IdentifierExpr(ctx.getStart().getLine(), ctx.IDENTIFIER_STMT(0).getText());
        for (int i = 1; i < ctx.IDENTIFIER_STMT().size(); i++) {
            current = new DotAccess(ctx.getStart().getLine(), current, ctx.IDENTIFIER_STMT(i).getText());
        }

        return current;
    }


    @Override
    public Node visitStmtNumber(HtmlCssParser.StmtNumberContext ctx) {
        return new LiteralExpr(ctx.getStart().getLine(), ctx.NUMBER_STMT().getText());
    }

    @Override
    public Node visitStmtString(HtmlCssParser.StmtStringContext ctx) {
        return new LiteralExpr(ctx.getStart().getLine(), stripQuotes(ctx.STRING_STMT().getText()));
    }

    @Override
    public Node visitStmtList(HtmlCssParser.StmtListContext ctx) {
        return visit(ctx.stmt_list_literal());
    }

    @Override
    public Node visitStmtListLiteral(HtmlCssParser.StmtListLiteralContext ctx) {
        ListLiteralExpr list = new ListLiteralExpr(ctx.getStart().getLine());
        for (HtmlCssParser.ExprContext sox : ctx.expr()) {
            list.addElement((Expr) visit(sox));
        }
        return list;
    }

    @Override
    public Node visitStmtCall(HtmlCssParser.StmtCallContext ctx) {
        return visit(ctx.stmt_call());
    }

    @Override
    public Node visitStmtFunctionCall(HtmlCssParser.StmtFunctionCallContext ctx) {
        FunctionCallExpr func = new FunctionCallExpr( ctx.IDENTIFIER_STMT().getText(),ctx.getStart().getLine());
        for (HtmlCssParser.Stmt_or_exprContext arg : ctx.stmt_or_expr()) {
            func.addArg((Expr) visit(arg));
        }
        return func;
    }

    @Override
    public Node visitStmtNot(HtmlCssParser.StmtNotContext ctx) {
        return new UnaryExpr( "not", (Expr) visit(ctx.stmt_or_expr()),ctx.getStart().getLine());
    }

    @Override
    public Node visitStmtParen(HtmlCssParser.StmtParenContext ctx) {
        return new ParenExpr(ctx.getStart().getLine(), (Expr) visit(ctx.stmt_or_expr()));
    }

    @Override
    public Node visitStmtPipeCall(HtmlCssParser.StmtPipeCallContext ctx) {
        Expr base = (Expr) visit(ctx.stmt_or_expr(0));
        FilterExpr chain = new FilterExpr(ctx.getStart().getLine(), base);
        String fname = ctx.IDENTIFIER_STMT().getText();
        List<Expr> args = new ArrayList<>();
        for (int i = 1; i < ctx.stmt_or_expr().size(); i++) {
            args.add((Expr) visit(ctx.stmt_or_expr(i)));
        }
        chain.addFilter(fname, args);
        return chain;
    }

    @Override
    public Node visitStmtBinOp(HtmlCssParser.StmtBinOpContext ctx) {
        Expr left = (Expr) visit(ctx.stmt_or_expr(0));
        Expr right = (Expr) visit(ctx.stmt_or_expr(1));
        String op = ctx.bin_op_stmt().getText();
        return new BinaryExpr(mapOp(op),left, right,ctx.getStart().getLine());
    }

    @Override
    public Node visitStmtLogicalOp(HtmlCssParser.StmtLogicalOpContext ctx) {
        Expr left = (Expr) visit(ctx.stmt_or_expr(0));
        Expr right = (Expr) visit(ctx.stmt_or_expr(1));
        String op = ctx.logical_op_stmt().getText(); // AND_STMT | OR_STMT
        return new BinaryExpr(mapOp(op), left, right, ctx.getStart().getLine());    }

    // ===== Helpers =====
    private String extractTagName(String openTagText) {
        if (openTagText == null || openTagText.length() < 3) return "";
        String inner = openTagText.substring(1, openTagText.length() - 1).trim();
        int spaceIdx = inner.indexOf(' ');
        return (spaceIdx == -1) ? inner : inner.substring(0, spaceIdx);
    }

    private Map<String, String> extractAttributes(String openTagText) {
        Map<String, String> attrs = new LinkedHashMap<>();
        // مثال: <li style="color: red;">
        Pattern pattern = Pattern.compile("(\\w+)\\s*=\\s*\"([^\"]*)\"");
        Matcher matcher = pattern.matcher(openTagText);
        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);
            attrs.put(key, value);
        }
        return attrs;
    }



    private String stripQuotes(String s) {
        if (s == null) return "";
        if ((s.startsWith("\"") && s.endsWith("\"")) || (s.startsWith("'") && s.endsWith("'"))) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}

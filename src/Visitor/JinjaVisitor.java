package Visitor;

import AST.*;
import AST.selector.*;
import AST.value.*;
import gen.antlr.HtmlCssParser;
import gen.antlr.HtmlCssParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

// ملاحظة: قد تحتاجين هذه الكلاسات في AST إذا غير موجودة
// import AST.jinja.*; // IfBlock, ForBlock, BlockBlock, MacroBlock, IncludeNode, SetBlock, FilterBlock, CallBlock
// import AST.expr.*;  // Expr, IdentifierExpr, LiteralExpr, BinaryExpr, UnaryExpr, FilterExpr, FunctionCallExpr, ParenExpr, ListLiteralExpr

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

    @Override
    public Node visitHtmlElement(HtmlCssParser.HtmlElementContext ctx) {
        String tagName = extractTagName(ctx.OPEN_TAG().getText());
        HtmlElement element = new HtmlElement(tagName, ctx.getStart().getLine());
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
    public Node visitTextHtmlNode(HtmlCssParser.TextHtmlNodeContext ctx) {
        HtmlCssParser.TextHtmlContext inner = (HtmlCssParser.TextHtmlContext) ctx.text_html();
        String text = inner.TEXT_HTML().getText();
        return new TextHtml(text, ctx.getStart().getLine());
    }

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
        return new StringValue(ctx.getStart().getLine(), stripQuotes(ctx.STRING_CSS().getText()));
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
        return new LiteralExpr(ctx.getStart().getLine(), stripQuotes(ctx.STRING().getText()));
    }
    @Override
    public Node visitValueIdentifier(HtmlCssParser.ValueIdentifierContext ctx) {
        // نرجع IdentifierExpr كـ base
        IdentifierExpr base = new IdentifierExpr(ctx.getStart().getLine(), ctx.IDENTIFIER().getText());

        // إذا في suffix (DOT أو INDEX)، نبني DotAccess أو IndexAccess فوق الـ base
        Node current = base;
        for (HtmlCssParser.Value_suffixContext sctx : ctx.value_suffix()) {
            if (sctx instanceof HtmlCssParser.DotSuffixContext dotCtx) {
                current = new DotAccess(ctx.getStart().getLine(), (CssValue) current, dotCtx.IDENTIFIER().getText());
            } else if (sctx instanceof HtmlCssParser.IndexSuffixContext idxCtx) {
                CssValue index = (CssValue) visit(idxCtx.expr());
                current = new IndexAccess(ctx.getStart().getLine(), (CssValue) current, index);
            }
        }
        return current;
    }

    @Override
    public Node visitDotSuffix(HtmlCssParser.DotSuffixContext ctx) {
        // عادةً ما نستخدمها داخل ValueIdentifier، بس نخليها ترجع DotAccess لوحدها
        return new DotAccess(ctx.getStart().getLine(), null, ctx.IDENTIFIER().getText());
    }

    @Override
    public Node visitIndexSuffix(HtmlCssParser.IndexSuffixContext ctx) {
        CssValue index = (CssValue) visit(ctx.expr());
        return new IndexAccess(ctx.getStart().getLine(), null, index);
    }

    @Override
    public Node visitFunctionCall(HtmlCssParser.FunctionCallContext ctx) {
        FunctionCallExpr func = new FunctionCallExpr(ctx.IDENTIFIER().getText(), ctx.getStart().getLine());
        for (HtmlCssParser.ExprContext argCtx : ctx.expr()) {
            func.addArg((Expr) visit(argCtx)); // ✅ استخدم addArg بدل addArgument
        }
        return func;
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


    @Override
    public Node visitValueParen(HtmlCssParser.ValueParenContext ctx) {
        // إذا داخل CSS → ParenValue، إذا داخل Jinja → ParenExpr
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
        String op = ctx.getStart().getText(); // EQ, NEQ, LT, GT, LTE, GTE, IN
        return new BinaryExpr(mapOp(op), left, right,ctx.getStart().getLine());
    }

    @Override
    public Node visitAdditiveSingle(HtmlCssParser.AdditiveSingleContext ctx) {
        return visit(ctx.multiplicative_expr());
    }

    @Override
    public Node visitAdditiveBinary(HtmlCssParser.AdditiveBinaryContext ctx) {
        Expr left = (Expr) visit(ctx.additive_expr());
        Expr right = (Expr) visit(ctx.multiplicative_expr());
        String op = ctx.getChild(1).getText(); // PLUS | MINUS | TILDE
        return new BinaryExpr( mapOp(op),left,  right ,ctx.getStart().getLine());
    }

    @Override
    public Node visitMultiplicativeSingle(HtmlCssParser.MultiplicativeSingleContext ctx) {
        return visit(ctx.unary_expr());
    }

    @Override
    public Node visitMultiplicativeBinary(HtmlCssParser.MultiplicativeBinaryContext ctx) {
        Expr left = (Expr) visit(ctx.multiplicative_expr());
        Expr right = (Expr) visit(ctx.unary_expr());
        String op = ctx.getChild(1).getText(); // STAR | SLASH | PERCENT | FLOORDIV
        return new BinaryExpr( mapOp(op), left, right,ctx.getStart().getLine());
    }

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
        // الشرط الأساسي
        Expr condition = (Expr) visit(ctx.stmt_expr(0));

        // جسم الـ if
        List<Node> body = new ArrayList<>();
        body.add(visit(ctx.content(0)));

        // نبني كائن JinjaIf
        JinjaIf ifNode = new JinjaIf(ctx.getStart().getLine(), condition, body);

        // elif*
        int elifCount = ctx.ELIF().size();
        for (int i = 0; i < elifCount; i++) {
            Expr cond = (Expr) visit(ctx.stmt_expr(i + 1));
            Node cont = visit(ctx.content(i + 1));
            // ممكن تضيفي طريقة addElif(cond, cont) داخل JinjaIf إذا بدك تدعمي elif
            body.add(new JinjaIf(ctx.getStart().getLine(), cond, List.of(cont)));
        }

        // else?
        if (ctx.ELSE() != null) {
            Node elseContent = visit(ctx.content(ctx.content().size() - 1));
            // نفس الشي: يا إما تضيفي خاصية elseContent داخل JinjaIf، أو تعتبريه JinjaIf جديد بشرط null
            body.add(new JinjaIf(ctx.getStart().getLine(), null, List.of(elseContent)));
        }

        return ifNode;
    }

    @Override
    public Node visitJinjaForBlock(HtmlCssParser.JinjaForBlockContext ctx) {
        String varName = ctx.IDENTIFIER_STMT().getText();
        Node iterable = visit(ctx.stmt_expr(0));

        List<Node> body = new ArrayList<>();
        body.add(visit(ctx.content()));

        JinjaFor forNode = new JinjaFor(ctx.getStart().getLine(), varName, iterable, body);

        // إذا عندك شرط IF داخل الـ for
        if (ctx.IF() != null) {
            Node ifCond = visit(ctx.stmt_expr(1));
            body.add(new JinjaIf(ctx.getStart().getLine(), ifCond, List.of(visit(ctx.content()))));
        }

        return forNode;
    }

    @Override
    public Node visitJinjaBlockBlock(HtmlCssParser.JinjaBlockBlockContext ctx) {
        String name = ctx.IDENTIFIER_STMT().getText();
        List<Node> body = new ArrayList<>();
        body.add(visit(ctx.content()));

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
        Node value = visit(ctx.stmt_expr(0)); // Expr أو أي Node
        return new JinjaSet(ctx.getStart().getLine(), name, value);
    }

    @Override
    public Node visitJinjaFilterBlock(HtmlCssParser.JinjaFilterBlockContext ctx) {
        String filterName = ctx.IDENTIFIER_STMT().getText();

        // نبني body كـ List<Node>
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

        // args لازم تكون List<Node> حسب الـ AST
        List<Node> args = new ArrayList<>();
        if (ctx.LPAREN_STMT() != null) {
            for (HtmlCssParser.Stmt_or_exprContext sox : ctx.stmt_or_expr()) {
                args.add(visit(sox)); // رجع Node بدل Expr
            }
        }

        // body كـ List<Node>
        List<Node> body = new ArrayList<>();
        Node contentNode = visit(ctx.content());
        if (contentNode instanceof Content content) {
            body.addAll(content.getChildren());
        } else if (contentNode != null) {
            body.add(contentNode);
        }

        return new JinjaCall(ctx.getStart().getLine(), macroName, args, body);
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
        // البداية: المتغير الأساسي
        Node current = new IdentifierExpr(ctx.getStart().getLine(), ctx.IDENTIFIER_STMT(0).getText());

        // كل DOT لاحق → نبني DotAccess فوق العقدة الحالية
        for (int i = 1; i < ctx.IDENTIFIER_STMT().size(); i++) {
            current = new DotAccess(ctx.getStart().getLine(), (CssValue) current, ctx.IDENTIFIER_STMT(i).getText());
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
        for (HtmlCssParser.Stmt_or_exprContext sox : ctx.stmt_or_expr()) {
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
        String op = ctx.bin_op_stmt().getStart().getText();
        return new BinaryExpr(mapOp(op),left, right,ctx.getStart().getLine());
    }

    @Override
    public Node visitStmtLogicalOp(HtmlCssParser.StmtLogicalOpContext ctx) {
        Expr left = (Expr) visit(ctx.stmt_or_expr(0));
        Expr right = (Expr) visit(ctx.stmt_or_expr(1));
        String op = ctx.logical_op_stmt().getStart().getText(); // AND_STMT | OR_STMT
        return new BinaryExpr( mapOp(op.equals("and") ? "and" : "or"),left, right,ctx.getStart().getLine());
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

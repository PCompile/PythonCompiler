// Generated from C:/Users/mayas/PythonCompiler/src/antlr/HtmlCssParser.g4 by ANTLR 4.13.2
package gen.antlr;
import gen.antlr.HtmlCssParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlCssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlCssParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code DocumentRule}
	 * labeled alternative in {@link HtmlCssParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentRule(HtmlCssParser.DocumentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlElementNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementNode(HtmlCssParser.HtmlElementNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfTagNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfTagNode(HtmlCssParser.SelfTagNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleElementNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElementNode(HtmlCssParser.StyleElementNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textHtmlNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextHtmlNode(HtmlCssParser.TextHtmlNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaExprNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprNode(HtmlCssParser.JinjaExprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaIfBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfBlockNode(HtmlCssParser.JinjaIfBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaForBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForBlockNode(HtmlCssParser.JinjaForBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaBlockBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockBlockNode(HtmlCssParser.JinjaBlockBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaMacroBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaMacroBlockNode(HtmlCssParser.JinjaMacroBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaIncludeNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIncludeNode(HtmlCssParser.JinjaIncludeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaSetBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSetBlockNode(HtmlCssParser.JinjaSetBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaFilterBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFilterBlockNode(HtmlCssParser.JinjaFilterBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaCallBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCallBlockNode(HtmlCssParser.JinjaCallBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlElement}
	 * labeled alternative in {@link HtmlCssParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HtmlCssParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfTag}
	 * labeled alternative in {@link HtmlCssParser#self_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfTag(HtmlCssParser.SelfTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contentRule}
	 * labeled alternative in {@link HtmlCssParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentRule(HtmlCssParser.ContentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textHtml}
	 * labeled alternative in {@link HtmlCssParser#text_html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextHtml(HtmlCssParser.TextHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaExpr}
	 * labeled alternative in {@link HtmlCssParser#jinja_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpr(HtmlCssParser.JinjaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRule}
	 * labeled alternative in {@link HtmlCssParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRule(HtmlCssParser.ExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orBinary}
	 * labeled alternative in {@link HtmlCssParser#or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrBinary(HtmlCssParser.OrBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orSingle}
	 * labeled alternative in {@link HtmlCssParser#or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrSingle(HtmlCssParser.OrSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andBinary}
	 * labeled alternative in {@link HtmlCssParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndBinary(HtmlCssParser.AndBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andSingle}
	 * labeled alternative in {@link HtmlCssParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndSingle(HtmlCssParser.AndSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalitySingle}
	 * labeled alternative in {@link HtmlCssParser#equality_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualitySingle(HtmlCssParser.EqualitySingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityBinary}
	 * labeled alternative in {@link HtmlCssParser#equality_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityBinary(HtmlCssParser.EqualityBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveBinary}
	 * labeled alternative in {@link HtmlCssParser#additive_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveBinary(HtmlCssParser.AdditiveBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveSingle}
	 * labeled alternative in {@link HtmlCssParser#additive_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveSingle(HtmlCssParser.AdditiveSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeSingle}
	 * labeled alternative in {@link HtmlCssParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeSingle(HtmlCssParser.MultiplicativeSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeBinary}
	 * labeled alternative in {@link HtmlCssParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeBinary(HtmlCssParser.MultiplicativeBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryNot}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNot(HtmlCssParser.UnaryNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryPlus}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlus(HtmlCssParser.UnaryPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(HtmlCssParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryPrimary}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrimary(HtmlCssParser.UnaryPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryRule}
	 * labeled alternative in {@link HtmlCssParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryRule(HtmlCssParser.PrimaryRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterExpr}
	 * labeled alternative in {@link HtmlCssParser#filter_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExpr(HtmlCssParser.FilterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueFunctionCall}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFunctionCall(HtmlCssParser.ValueFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueIdentifier}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueIdentifier(HtmlCssParser.ValueIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueNumber}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueNumber(HtmlCssParser.ValueNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueString(HtmlCssParser.ValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueListRule}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueListRule(HtmlCssParser.ValueListRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueParen}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueParen(HtmlCssParser.ValueParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HtmlCssParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HtmlCssParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotSuffix}
	 * labeled alternative in {@link HtmlCssParser#value_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotSuffix(HtmlCssParser.DotSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexSuffix}
	 * labeled alternative in {@link HtmlCssParser#value_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexSuffix(HtmlCssParser.IndexSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listLiteral}
	 * labeled alternative in {@link HtmlCssParser#list_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(HtmlCssParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpPlus}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpPlus(HtmlCssParser.BinOpPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpMinus}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpMinus(HtmlCssParser.BinOpMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStar}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStar(HtmlCssParser.BinOpStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpSlash}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpSlash(HtmlCssParser.BinOpSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpPercent}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpPercent(HtmlCssParser.BinOpPercentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpFloorDiv}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpFloorDiv(HtmlCssParser.BinOpFloorDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpEq}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpEq(HtmlCssParser.BinOpEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpNeq}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpNeq(HtmlCssParser.BinOpNeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpLt}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpLt(HtmlCssParser.BinOpLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpGt}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpGt(HtmlCssParser.BinOpGtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpLte}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpLte(HtmlCssParser.BinOpLteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpGte}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpGte(HtmlCssParser.BinOpGteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpAnd}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpAnd(HtmlCssParser.BinOpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpOr}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpOr(HtmlCssParser.BinOpOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpIn}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpIn(HtmlCssParser.BinOpInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpTilde}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpTilde(HtmlCssParser.BinOpTildeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaIfBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfBlock(HtmlCssParser.JinjaIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExpr}
	 * labeled alternative in {@link HtmlCssParser#stmt_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpr(HtmlCssParser.StmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtBinOp}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBinOp(HtmlCssParser.StmtBinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPipeCall}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPipeCall(HtmlCssParser.StmtPipeCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtParen}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtParen(HtmlCssParser.StmtParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtLogicalOp}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtLogicalOp(HtmlCssParser.StmtLogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPrimaryExpr}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrimaryExpr(HtmlCssParser.StmtPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtNot}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtNot(HtmlCssParser.StmtNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIdentifier}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIdentifier(HtmlCssParser.StmtIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtNumber}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtNumber(HtmlCssParser.StmtNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtString}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtString(HtmlCssParser.StmtStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtList}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(HtmlCssParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtCall}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtCall(HtmlCssParser.StmtCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtListLiteral}
	 * labeled alternative in {@link HtmlCssParser#stmt_list_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtListLiteral(HtmlCssParser.StmtListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtFunctionCall}
	 * labeled alternative in {@link HtmlCssParser#stmt_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFunctionCall(HtmlCssParser.StmtFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtPlus}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtPlus(HtmlCssParser.BinOpStmtPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtMinus}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtMinus(HtmlCssParser.BinOpStmtMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtStar}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtStar(HtmlCssParser.BinOpStmtStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtSlash}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtSlash(HtmlCssParser.BinOpStmtSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtPercent}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtPercent(HtmlCssParser.BinOpStmtPercentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtFloorDiv}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtFloorDiv(HtmlCssParser.BinOpStmtFloorDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtEq}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtEq(HtmlCssParser.BinOpStmtEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtNeq}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtNeq(HtmlCssParser.BinOpStmtNeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtLt}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtLt(HtmlCssParser.BinOpStmtLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtGt}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtGt(HtmlCssParser.BinOpStmtGtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtLte}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtLte(HtmlCssParser.BinOpStmtLteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtGte}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtGte(HtmlCssParser.BinOpStmtGteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpStmtIn}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpStmtIn(HtmlCssParser.BinOpStmtInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOpStmtAnd}
	 * labeled alternative in {@link HtmlCssParser#logical_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOpStmtAnd(HtmlCssParser.LogicalOpStmtAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOpStmtOr}
	 * labeled alternative in {@link HtmlCssParser#logical_op_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOpStmtOr(HtmlCssParser.LogicalOpStmtOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaForBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForBlock(HtmlCssParser.JinjaForBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaBlockBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_block_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockBlock(HtmlCssParser.JinjaBlockBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaMacroBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_macro_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaMacroBlock(HtmlCssParser.JinjaMacroBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaInclude}
	 * labeled alternative in {@link HtmlCssParser#jinja_include_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaInclude(HtmlCssParser.JinjaIncludeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaSetBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_set_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSetBlock(HtmlCssParser.JinjaSetBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaFilterBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_filter_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFilterBlock(HtmlCssParser.JinjaFilterBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaCallBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_call_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCallBlock(HtmlCssParser.JinjaCallBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleBlock}
	 * labeled alternative in {@link HtmlCssParser#style_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBlock(HtmlCssParser.StyleBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssRulesList}
	 * labeled alternative in {@link HtmlCssParser#css_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRulesList(HtmlCssParser.CssRulesListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rootRule}
	 * labeled alternative in {@link HtmlCssParser#css_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootRule(HtmlCssParser.RootRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectorRule}
	 * labeled alternative in {@link HtmlCssParser#css_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorRule(HtmlCssParser.SelectorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectorGroup}
	 * labeled alternative in {@link HtmlCssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(HtmlCssParser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectorSequence}
	 * labeled alternative in {@link HtmlCssParser#selector_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorSequence(HtmlCssParser.SelectorSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildCombinator(HtmlCssParser.ChildCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code adjacentSiblingCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjacentSiblingCombinator(HtmlCssParser.AdjacentSiblingCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generalSiblingCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralSiblingCombinator(HtmlCssParser.GeneralSiblingCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexSimpleSelector}
	 * labeled alternative in {@link HtmlCssParser#simple_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexSimpleSelector(HtmlCssParser.ComplexSimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link HtmlCssParser#simple_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(HtmlCssParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link HtmlCssParser#class_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(HtmlCssParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link HtmlCssParser#id_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(HtmlCssParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoClassSelector}
	 * labeled alternative in {@link HtmlCssParser#pseudo_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClassSelector(HtmlCssParser.PseudoClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssBody}
	 * labeled alternative in {@link HtmlCssParser#css_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBody(HtmlCssParser.CssBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssVariableDeclaration}
	 * labeled alternative in {@link HtmlCssParser#css_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssVariableDeclaration(HtmlCssParser.CssVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssPropertyDeclaration}
	 * labeled alternative in {@link HtmlCssParser#css_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPropertyDeclaration(HtmlCssParser.CssPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssValueSequence}
	 * labeled alternative in {@link HtmlCssParser#css_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueSequence(HtmlCssParser.CssValueSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentValue(HtmlCssParser.IdentValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(HtmlCssParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(HtmlCssParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hexColorValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexColorValue(HtmlCssParser.HexColorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(HtmlCssParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code percentValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentValue(HtmlCssParser.PercentValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaSeparator}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaSeparator(HtmlCssParser.CommaSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallValue(HtmlCssParser.FunctionCallValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssFunctionCall}
	 * labeled alternative in {@link HtmlCssParser#function_call2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunctionCall(HtmlCssParser.CssFunctionCallContext ctx);
}
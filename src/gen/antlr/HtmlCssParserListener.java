// Generated from C:/Users/mayas/PythonCompiler/src/antlr/HtmlCssParser.g4 by ANTLR 4.13.2
package gen.antlr;
import gen.antlr.HtmlCssParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlCssParser}.
 */
public interface HtmlCssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code DocumentRule}
	 * labeled alternative in {@link HtmlCssParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocumentRule(HtmlCssParser.DocumentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocumentRule}
	 * labeled alternative in {@link HtmlCssParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocumentRule(HtmlCssParser.DocumentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlElementNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementNode(HtmlCssParser.HtmlElementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlElementNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementNode(HtmlCssParser.HtmlElementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfTagNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterSelfTagNode(HtmlCssParser.SelfTagNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfTagNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitSelfTagNode(HtmlCssParser.SelfTagNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleElementNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterStyleElementNode(HtmlCssParser.StyleElementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleElementNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitStyleElementNode(HtmlCssParser.StyleElementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textHtmlNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterTextHtmlNode(HtmlCssParser.TextHtmlNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textHtmlNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitTextHtmlNode(HtmlCssParser.TextHtmlNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaExprNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprNode(HtmlCssParser.JinjaExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaExprNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprNode(HtmlCssParser.JinjaExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaIfBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfBlockNode(HtmlCssParser.JinjaIfBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaIfBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfBlockNode(HtmlCssParser.JinjaIfBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaForBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForBlockNode(HtmlCssParser.JinjaForBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaForBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForBlockNode(HtmlCssParser.JinjaForBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaBlockBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockBlockNode(HtmlCssParser.JinjaBlockBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaBlockBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockBlockNode(HtmlCssParser.JinjaBlockBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaMacroBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaMacroBlockNode(HtmlCssParser.JinjaMacroBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaMacroBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaMacroBlockNode(HtmlCssParser.JinjaMacroBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaIncludeNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIncludeNode(HtmlCssParser.JinjaIncludeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaIncludeNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIncludeNode(HtmlCssParser.JinjaIncludeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaSetBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSetBlockNode(HtmlCssParser.JinjaSetBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaSetBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSetBlockNode(HtmlCssParser.JinjaSetBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaFilterBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFilterBlockNode(HtmlCssParser.JinjaFilterBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaFilterBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFilterBlockNode(HtmlCssParser.JinjaFilterBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaCallBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCallBlockNode(HtmlCssParser.JinjaCallBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaCallBlockNode}
	 * labeled alternative in {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCallBlockNode(HtmlCssParser.JinjaCallBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlElement}
	 * labeled alternative in {@link HtmlCssParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HtmlCssParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlElement}
	 * labeled alternative in {@link HtmlCssParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HtmlCssParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfTag}
	 * labeled alternative in {@link HtmlCssParser#self_tag}.
	 * @param ctx the parse tree
	 */
	void enterSelfTag(HtmlCssParser.SelfTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfTag}
	 * labeled alternative in {@link HtmlCssParser#self_tag}.
	 * @param ctx the parse tree
	 */
	void exitSelfTag(HtmlCssParser.SelfTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contentRule}
	 * labeled alternative in {@link HtmlCssParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContentRule(HtmlCssParser.ContentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contentRule}
	 * labeled alternative in {@link HtmlCssParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContentRule(HtmlCssParser.ContentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textHtml}
	 * labeled alternative in {@link HtmlCssParser#text_html}.
	 * @param ctx the parse tree
	 */
	void enterTextHtml(HtmlCssParser.TextHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textHtml}
	 * labeled alternative in {@link HtmlCssParser#text_html}.
	 * @param ctx the parse tree
	 */
	void exitTextHtml(HtmlCssParser.TextHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaExpr}
	 * labeled alternative in {@link HtmlCssParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpr(HtmlCssParser.JinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaExpr}
	 * labeled alternative in {@link HtmlCssParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpr(HtmlCssParser.JinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRule}
	 * labeled alternative in {@link HtmlCssParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRule(HtmlCssParser.ExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRule}
	 * labeled alternative in {@link HtmlCssParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRule(HtmlCssParser.ExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orBinary}
	 * labeled alternative in {@link HtmlCssParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrBinary(HtmlCssParser.OrBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orBinary}
	 * labeled alternative in {@link HtmlCssParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrBinary(HtmlCssParser.OrBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orSingle}
	 * labeled alternative in {@link HtmlCssParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrSingle(HtmlCssParser.OrSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orSingle}
	 * labeled alternative in {@link HtmlCssParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrSingle(HtmlCssParser.OrSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andBinary}
	 * labeled alternative in {@link HtmlCssParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAndBinary(HtmlCssParser.AndBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andBinary}
	 * labeled alternative in {@link HtmlCssParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAndBinary(HtmlCssParser.AndBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andSingle}
	 * labeled alternative in {@link HtmlCssParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAndSingle(HtmlCssParser.AndSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andSingle}
	 * labeled alternative in {@link HtmlCssParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAndSingle(HtmlCssParser.AndSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalitySingle}
	 * labeled alternative in {@link HtmlCssParser#equality_expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualitySingle(HtmlCssParser.EqualitySingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalitySingle}
	 * labeled alternative in {@link HtmlCssParser#equality_expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualitySingle(HtmlCssParser.EqualitySingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityBinary}
	 * labeled alternative in {@link HtmlCssParser#equality_expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityBinary(HtmlCssParser.EqualityBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityBinary}
	 * labeled alternative in {@link HtmlCssParser#equality_expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityBinary(HtmlCssParser.EqualityBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveBinary}
	 * labeled alternative in {@link HtmlCssParser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveBinary(HtmlCssParser.AdditiveBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveBinary}
	 * labeled alternative in {@link HtmlCssParser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveBinary(HtmlCssParser.AdditiveBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveSingle}
	 * labeled alternative in {@link HtmlCssParser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveSingle(HtmlCssParser.AdditiveSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveSingle}
	 * labeled alternative in {@link HtmlCssParser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveSingle(HtmlCssParser.AdditiveSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeSingle}
	 * labeled alternative in {@link HtmlCssParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeSingle(HtmlCssParser.MultiplicativeSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeSingle}
	 * labeled alternative in {@link HtmlCssParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeSingle(HtmlCssParser.MultiplicativeSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeBinary}
	 * labeled alternative in {@link HtmlCssParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeBinary(HtmlCssParser.MultiplicativeBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeBinary}
	 * labeled alternative in {@link HtmlCssParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeBinary(HtmlCssParser.MultiplicativeBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryNot}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNot(HtmlCssParser.UnaryNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryNot}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNot(HtmlCssParser.UnaryNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPlus}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlus(HtmlCssParser.UnaryPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPlus}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlus(HtmlCssParser.UnaryPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(HtmlCssParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(HtmlCssParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPrimary}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrimary(HtmlCssParser.UnaryPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPrimary}
	 * labeled alternative in {@link HtmlCssParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrimary(HtmlCssParser.UnaryPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryRule}
	 * labeled alternative in {@link HtmlCssParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryRule(HtmlCssParser.PrimaryRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryRule}
	 * labeled alternative in {@link HtmlCssParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryRule(HtmlCssParser.PrimaryRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterExpr}
	 * labeled alternative in {@link HtmlCssParser#filter_expr}.
	 * @param ctx the parse tree
	 */
	void enterFilterExpr(HtmlCssParser.FilterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterExpr}
	 * labeled alternative in {@link HtmlCssParser#filter_expr}.
	 * @param ctx the parse tree
	 */
	void exitFilterExpr(HtmlCssParser.FilterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueFunctionCall}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueFunctionCall(HtmlCssParser.ValueFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueFunctionCall}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueFunctionCall(HtmlCssParser.ValueFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueIdentifier}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueIdentifier(HtmlCssParser.ValueIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueIdentifier}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueIdentifier(HtmlCssParser.ValueIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueNumber}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueNumber(HtmlCssParser.ValueNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueNumber}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueNumber(HtmlCssParser.ValueNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueString(HtmlCssParser.ValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueString(HtmlCssParser.ValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueListRule}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueListRule(HtmlCssParser.ValueListRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueListRule}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueListRule(HtmlCssParser.ValueListRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueParen}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueParen(HtmlCssParser.ValueParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueParen}
	 * labeled alternative in {@link HtmlCssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueParen(HtmlCssParser.ValueParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HtmlCssParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HtmlCssParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HtmlCssParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HtmlCssParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotSuffix}
	 * labeled alternative in {@link HtmlCssParser#value_suffix}.
	 * @param ctx the parse tree
	 */
	void enterDotSuffix(HtmlCssParser.DotSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotSuffix}
	 * labeled alternative in {@link HtmlCssParser#value_suffix}.
	 * @param ctx the parse tree
	 */
	void exitDotSuffix(HtmlCssParser.DotSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexSuffix}
	 * labeled alternative in {@link HtmlCssParser#value_suffix}.
	 * @param ctx the parse tree
	 */
	void enterIndexSuffix(HtmlCssParser.IndexSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexSuffix}
	 * labeled alternative in {@link HtmlCssParser#value_suffix}.
	 * @param ctx the parse tree
	 */
	void exitIndexSuffix(HtmlCssParser.IndexSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listLiteral}
	 * labeled alternative in {@link HtmlCssParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(HtmlCssParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listLiteral}
	 * labeled alternative in {@link HtmlCssParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(HtmlCssParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpPlus}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpPlus(HtmlCssParser.BinOpPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpPlus}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpPlus(HtmlCssParser.BinOpPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpMinus}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpMinus(HtmlCssParser.BinOpMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpMinus}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpMinus(HtmlCssParser.BinOpMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStar}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStar(HtmlCssParser.BinOpStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStar}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStar(HtmlCssParser.BinOpStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpSlash}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpSlash(HtmlCssParser.BinOpSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpSlash}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpSlash(HtmlCssParser.BinOpSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpPercent}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpPercent(HtmlCssParser.BinOpPercentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpPercent}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpPercent(HtmlCssParser.BinOpPercentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpFloorDiv}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpFloorDiv(HtmlCssParser.BinOpFloorDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpFloorDiv}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpFloorDiv(HtmlCssParser.BinOpFloorDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpEq}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpEq(HtmlCssParser.BinOpEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpEq}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpEq(HtmlCssParser.BinOpEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpNeq}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpNeq(HtmlCssParser.BinOpNeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpNeq}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpNeq(HtmlCssParser.BinOpNeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpLt}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpLt(HtmlCssParser.BinOpLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpLt}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpLt(HtmlCssParser.BinOpLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpGt}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpGt(HtmlCssParser.BinOpGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpGt}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpGt(HtmlCssParser.BinOpGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpLte}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpLte(HtmlCssParser.BinOpLteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpLte}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpLte(HtmlCssParser.BinOpLteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpGte}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpGte(HtmlCssParser.BinOpGteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpGte}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpGte(HtmlCssParser.BinOpGteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpAnd}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpAnd(HtmlCssParser.BinOpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpAnd}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpAnd(HtmlCssParser.BinOpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpOr}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpOr(HtmlCssParser.BinOpOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpOr}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpOr(HtmlCssParser.BinOpOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpIn}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpIn(HtmlCssParser.BinOpInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpIn}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpIn(HtmlCssParser.BinOpInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpTilde}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOpTilde(HtmlCssParser.BinOpTildeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpTilde}
	 * labeled alternative in {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOpTilde(HtmlCssParser.BinOpTildeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaIfBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_if_block}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfBlock(HtmlCssParser.JinjaIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaIfBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_if_block}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfBlock(HtmlCssParser.JinjaIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtExpr}
	 * labeled alternative in {@link HtmlCssParser#stmt_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmtExpr(HtmlCssParser.StmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtExpr}
	 * labeled alternative in {@link HtmlCssParser#stmt_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmtExpr(HtmlCssParser.StmtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtBinOp}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmtBinOp(HtmlCssParser.StmtBinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtBinOp}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmtBinOp(HtmlCssParser.StmtBinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtPipeCall}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmtPipeCall(HtmlCssParser.StmtPipeCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtPipeCall}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmtPipeCall(HtmlCssParser.StmtPipeCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtParen}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmtParen(HtmlCssParser.StmtParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtParen}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmtParen(HtmlCssParser.StmtParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtLogicalOp}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmtLogicalOp(HtmlCssParser.StmtLogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtLogicalOp}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmtLogicalOp(HtmlCssParser.StmtLogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtPrimaryExpr}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmtPrimaryExpr(HtmlCssParser.StmtPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtPrimaryExpr}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmtPrimaryExpr(HtmlCssParser.StmtPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtNot}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmtNot(HtmlCssParser.StmtNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtNot}
	 * labeled alternative in {@link HtmlCssParser#stmt_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmtNot(HtmlCssParser.StmtNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIdentifier}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void enterStmtIdentifier(HtmlCssParser.StmtIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIdentifier}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void exitStmtIdentifier(HtmlCssParser.StmtIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtNumber}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void enterStmtNumber(HtmlCssParser.StmtNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtNumber}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void exitStmtNumber(HtmlCssParser.StmtNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtString}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void enterStmtString(HtmlCssParser.StmtStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtString}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void exitStmtString(HtmlCssParser.StmtStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtList}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(HtmlCssParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtList}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(HtmlCssParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtCall}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void enterStmtCall(HtmlCssParser.StmtCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtCall}
	 * labeled alternative in {@link HtmlCssParser#stmt_primary}.
	 * @param ctx the parse tree
	 */
	void exitStmtCall(HtmlCssParser.StmtCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtListLiteral}
	 * labeled alternative in {@link HtmlCssParser#stmt_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterStmtListLiteral(HtmlCssParser.StmtListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtListLiteral}
	 * labeled alternative in {@link HtmlCssParser#stmt_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitStmtListLiteral(HtmlCssParser.StmtListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtFunctionCall}
	 * labeled alternative in {@link HtmlCssParser#stmt_call}.
	 * @param ctx the parse tree
	 */
	void enterStmtFunctionCall(HtmlCssParser.StmtFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtFunctionCall}
	 * labeled alternative in {@link HtmlCssParser#stmt_call}.
	 * @param ctx the parse tree
	 */
	void exitStmtFunctionCall(HtmlCssParser.StmtFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtPlus}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtPlus(HtmlCssParser.BinOpStmtPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtPlus}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtPlus(HtmlCssParser.BinOpStmtPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtMinus}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtMinus(HtmlCssParser.BinOpStmtMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtMinus}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtMinus(HtmlCssParser.BinOpStmtMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtStar}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtStar(HtmlCssParser.BinOpStmtStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtStar}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtStar(HtmlCssParser.BinOpStmtStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtSlash}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtSlash(HtmlCssParser.BinOpStmtSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtSlash}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtSlash(HtmlCssParser.BinOpStmtSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtPercent}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtPercent(HtmlCssParser.BinOpStmtPercentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtPercent}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtPercent(HtmlCssParser.BinOpStmtPercentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtFloorDiv}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtFloorDiv(HtmlCssParser.BinOpStmtFloorDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtFloorDiv}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtFloorDiv(HtmlCssParser.BinOpStmtFloorDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtEq}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtEq(HtmlCssParser.BinOpStmtEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtEq}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtEq(HtmlCssParser.BinOpStmtEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtNeq}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtNeq(HtmlCssParser.BinOpStmtNeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtNeq}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtNeq(HtmlCssParser.BinOpStmtNeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtLt}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtLt(HtmlCssParser.BinOpStmtLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtLt}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtLt(HtmlCssParser.BinOpStmtLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtGt}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtGt(HtmlCssParser.BinOpStmtGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtGt}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtGt(HtmlCssParser.BinOpStmtGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtLte}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtLte(HtmlCssParser.BinOpStmtLteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtLte}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtLte(HtmlCssParser.BinOpStmtLteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtGte}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtGte(HtmlCssParser.BinOpStmtGteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtGte}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtGte(HtmlCssParser.BinOpStmtGteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpStmtIn}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBinOpStmtIn(HtmlCssParser.BinOpStmtInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpStmtIn}
	 * labeled alternative in {@link HtmlCssParser#bin_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBinOpStmtIn(HtmlCssParser.BinOpStmtInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOpStmtAnd}
	 * labeled alternative in {@link HtmlCssParser#logical_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOpStmtAnd(HtmlCssParser.LogicalOpStmtAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOpStmtAnd}
	 * labeled alternative in {@link HtmlCssParser#logical_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOpStmtAnd(HtmlCssParser.LogicalOpStmtAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOpStmtOr}
	 * labeled alternative in {@link HtmlCssParser#logical_op_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOpStmtOr(HtmlCssParser.LogicalOpStmtOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOpStmtOr}
	 * labeled alternative in {@link HtmlCssParser#logical_op_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOpStmtOr(HtmlCssParser.LogicalOpStmtOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaForBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_for_block}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForBlock(HtmlCssParser.JinjaForBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaForBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_for_block}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForBlock(HtmlCssParser.JinjaForBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaBlockBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_block_block}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockBlock(HtmlCssParser.JinjaBlockBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaBlockBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_block_block}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockBlock(HtmlCssParser.JinjaBlockBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaMacroBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_macro_block}.
	 * @param ctx the parse tree
	 */
	void enterJinjaMacroBlock(HtmlCssParser.JinjaMacroBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaMacroBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_macro_block}.
	 * @param ctx the parse tree
	 */
	void exitJinjaMacroBlock(HtmlCssParser.JinjaMacroBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaInclude}
	 * labeled alternative in {@link HtmlCssParser#jinja_include_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaInclude(HtmlCssParser.JinjaIncludeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaInclude}
	 * labeled alternative in {@link HtmlCssParser#jinja_include_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaInclude(HtmlCssParser.JinjaIncludeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaSetBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_set_block}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSetBlock(HtmlCssParser.JinjaSetBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaSetBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_set_block}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSetBlock(HtmlCssParser.JinjaSetBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaFilterBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_filter_block}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFilterBlock(HtmlCssParser.JinjaFilterBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaFilterBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_filter_block}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFilterBlock(HtmlCssParser.JinjaFilterBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaCallBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_call_block}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCallBlock(HtmlCssParser.JinjaCallBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaCallBlock}
	 * labeled alternative in {@link HtmlCssParser#jinja_call_block}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCallBlock(HtmlCssParser.JinjaCallBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleBlock}
	 * labeled alternative in {@link HtmlCssParser#style_element}.
	 * @param ctx the parse tree
	 */
	void enterStyleBlock(HtmlCssParser.StyleBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleBlock}
	 * labeled alternative in {@link HtmlCssParser#style_element}.
	 * @param ctx the parse tree
	 */
	void exitStyleBlock(HtmlCssParser.StyleBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssRulesList}
	 * labeled alternative in {@link HtmlCssParser#css_rules}.
	 * @param ctx the parse tree
	 */
	void enterCssRulesList(HtmlCssParser.CssRulesListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssRulesList}
	 * labeled alternative in {@link HtmlCssParser#css_rules}.
	 * @param ctx the parse tree
	 */
	void exitCssRulesList(HtmlCssParser.CssRulesListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rootRule}
	 * labeled alternative in {@link HtmlCssParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void enterRootRule(HtmlCssParser.RootRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rootRule}
	 * labeled alternative in {@link HtmlCssParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void exitRootRule(HtmlCssParser.RootRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectorRule}
	 * labeled alternative in {@link HtmlCssParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void enterSelectorRule(HtmlCssParser.SelectorRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectorRule}
	 * labeled alternative in {@link HtmlCssParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void exitSelectorRule(HtmlCssParser.SelectorRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectorGroup}
	 * labeled alternative in {@link HtmlCssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(HtmlCssParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectorGroup}
	 * labeled alternative in {@link HtmlCssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(HtmlCssParser.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectorSequence}
	 * labeled alternative in {@link HtmlCssParser#selector_part}.
	 * @param ctx the parse tree
	 */
	void enterSelectorSequence(HtmlCssParser.SelectorSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectorSequence}
	 * labeled alternative in {@link HtmlCssParser#selector_part}.
	 * @param ctx the parse tree
	 */
	void exitSelectorSequence(HtmlCssParser.SelectorSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterChildCombinator(HtmlCssParser.ChildCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitChildCombinator(HtmlCssParser.ChildCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code adjacentSiblingCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterAdjacentSiblingCombinator(HtmlCssParser.AdjacentSiblingCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code adjacentSiblingCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitAdjacentSiblingCombinator(HtmlCssParser.AdjacentSiblingCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generalSiblingCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterGeneralSiblingCombinator(HtmlCssParser.GeneralSiblingCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generalSiblingCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitGeneralSiblingCombinator(HtmlCssParser.GeneralSiblingCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexSimpleSelector}
	 * labeled alternative in {@link HtmlCssParser#simple_selector}.
	 * @param ctx the parse tree
	 */
	void enterComplexSimpleSelector(HtmlCssParser.ComplexSimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexSimpleSelector}
	 * labeled alternative in {@link HtmlCssParser#simple_selector}.
	 * @param ctx the parse tree
	 */
	void exitComplexSimpleSelector(HtmlCssParser.ComplexSimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link HtmlCssParser#simple_selector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(HtmlCssParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link HtmlCssParser#simple_selector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(HtmlCssParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link HtmlCssParser#class_selector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(HtmlCssParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link HtmlCssParser#class_selector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(HtmlCssParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link HtmlCssParser#id_selector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(HtmlCssParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link HtmlCssParser#id_selector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(HtmlCssParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoClassSelector}
	 * labeled alternative in {@link HtmlCssParser#pseudo_selector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClassSelector(HtmlCssParser.PseudoClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoClassSelector}
	 * labeled alternative in {@link HtmlCssParser#pseudo_selector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClassSelector(HtmlCssParser.PseudoClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssBody}
	 * labeled alternative in {@link HtmlCssParser#css_body}.
	 * @param ctx the parse tree
	 */
	void enterCssBody(HtmlCssParser.CssBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssBody}
	 * labeled alternative in {@link HtmlCssParser#css_body}.
	 * @param ctx the parse tree
	 */
	void exitCssBody(HtmlCssParser.CssBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssVariableDeclaration}
	 * labeled alternative in {@link HtmlCssParser#css_decl}.
	 * @param ctx the parse tree
	 */
	void enterCssVariableDeclaration(HtmlCssParser.CssVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssVariableDeclaration}
	 * labeled alternative in {@link HtmlCssParser#css_decl}.
	 * @param ctx the parse tree
	 */
	void exitCssVariableDeclaration(HtmlCssParser.CssVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssPropertyDeclaration}
	 * labeled alternative in {@link HtmlCssParser#css_decl}.
	 * @param ctx the parse tree
	 */
	void enterCssPropertyDeclaration(HtmlCssParser.CssPropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssPropertyDeclaration}
	 * labeled alternative in {@link HtmlCssParser#css_decl}.
	 * @param ctx the parse tree
	 */
	void exitCssPropertyDeclaration(HtmlCssParser.CssPropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssValueSequence}
	 * labeled alternative in {@link HtmlCssParser#css_value}.
	 * @param ctx the parse tree
	 */
	void enterCssValueSequence(HtmlCssParser.CssValueSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssValueSequence}
	 * labeled alternative in {@link HtmlCssParser#css_value}.
	 * @param ctx the parse tree
	 */
	void exitCssValueSequence(HtmlCssParser.CssValueSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentValue(HtmlCssParser.IdentValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentValue(HtmlCssParser.IdentValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(HtmlCssParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(HtmlCssParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(HtmlCssParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(HtmlCssParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hexColorValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterHexColorValue(HtmlCssParser.HexColorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hexColorValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitHexColorValue(HtmlCssParser.HexColorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(HtmlCssParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableReference}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(HtmlCssParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percentValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterPercentValue(HtmlCssParser.PercentValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percentValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitPercentValue(HtmlCssParser.PercentValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaSeparator}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterCommaSeparator(HtmlCssParser.CommaSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaSeparator}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitCommaSeparator(HtmlCssParser.CommaSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallValue(HtmlCssParser.FunctionCallValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallValue(HtmlCssParser.FunctionCallValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssFunctionCall}
	 * labeled alternative in {@link HtmlCssParser#function_call2}.
	 * @param ctx the parse tree
	 */
	void enterCssFunctionCall(HtmlCssParser.CssFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssFunctionCall}
	 * labeled alternative in {@link HtmlCssParser#function_call2}.
	 * @param ctx the parse tree
	 */
	void exitCssFunctionCall(HtmlCssParser.CssFunctionCallContext ctx);
}
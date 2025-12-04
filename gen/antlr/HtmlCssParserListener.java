// Generated from C:/PythonCompiler/src/antlr/HtmlCssParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlCssParser}.
 */
public interface HtmlCssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HtmlCssParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HtmlCssParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HtmlCssParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HtmlCssParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HtmlCssParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HtmlCssParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HtmlCssParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HtmlCssParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void enterStyleContent(HtmlCssParser.StyleContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void exitStyleContent(HtmlCssParser.StyleContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(HtmlCssParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(HtmlCssParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(HtmlCssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(HtmlCssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HtmlCssParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HtmlCssParser.DeclarationContext ctx);
}
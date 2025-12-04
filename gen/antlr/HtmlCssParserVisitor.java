// Generated from C:/PythonCompiler/src/antlr/HtmlCssParser.g4 by ANTLR 4.13.2
package antlr;
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
	 * Visit a parse tree produced by {@link HtmlCssParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HtmlCssParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HtmlCssParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HtmlCssParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(HtmlCssParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#styleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleContent(HtmlCssParser.StyleContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(HtmlCssParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(HtmlCssParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(HtmlCssParser.DeclarationContext ctx);
}
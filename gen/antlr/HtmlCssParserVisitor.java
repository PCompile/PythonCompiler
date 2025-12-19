// Generated from C:/Users/Asus/IdeaProjects/PythonCompiler/src/antlr/HtmlCssParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link HtmlCssParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(HtmlCssParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(HtmlCssParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_element(HtmlCssParser.Html_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#self_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_tag(HtmlCssParser.Self_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HtmlCssParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#text_html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_html(HtmlCssParser.Text_htmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#jinja_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_expr(HtmlCssParser.Jinja_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HtmlCssParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(HtmlCssParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#list_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_literal(HtmlCssParser.List_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(HtmlCssParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#jinja_if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_if_block(HtmlCssParser.Jinja_if_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#jinja_for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_for_block(HtmlCssParser.Jinja_for_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#jinja_block_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_block_block(HtmlCssParser.Jinja_block_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#jinja_macro_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_macro_block(HtmlCssParser.Jinja_macro_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#jinja_include_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_include_stmt(HtmlCssParser.Jinja_include_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#jinja_set_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_set_block(HtmlCssParser.Jinja_set_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#jinja_filter_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_filter_block(HtmlCssParser.Jinja_filter_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssParser#jinja_call_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_call_block(HtmlCssParser.Jinja_call_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link HtmlCssParser#style_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(HtmlCssParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRules}
	 * labeled alternative in {@link HtmlCssParser#css_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRules(HtmlCssParser.CssRulesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRule}
	 * labeled alternative in {@link HtmlCssParser#css_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(HtmlCssParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorGroup}
	 * labeled alternative in {@link HtmlCssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(HtmlCssParser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorChain}
	 * labeled alternative in {@link HtmlCssParser#selector_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorChain(HtmlCssParser.SelectorChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleSelector}
	 * labeled alternative in {@link HtmlCssParser#simple_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(HtmlCssParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link HtmlCssParser#class_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(HtmlCssParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link HtmlCssParser#id_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(HtmlCssParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoSelector}
	 * labeled alternative in {@link HtmlCssParser#pseudo_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoSelector(HtmlCssParser.PseudoSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChildCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildCombinator(HtmlCssParser.ChildCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdjacentCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjacentCombinator(HtmlCssParser.AdjacentCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SiblingCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiblingCombinator(HtmlCssParser.SiblingCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBody}
	 * labeled alternative in {@link HtmlCssParser#css_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBody(HtmlCssParser.CssBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDeclaration}
	 * labeled alternative in {@link HtmlCssParser#css_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(HtmlCssParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link HtmlCssParser#css_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(HtmlCssParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentValue(HtmlCssParser.IdentValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(HtmlCssParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(HtmlCssParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexValue(HtmlCssParser.HexValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaSeparator}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaSeparator(HtmlCssParser.CommaSeparatorContext ctx);
}
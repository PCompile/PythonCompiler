// Generated from C:/Users/Asus/IdeaProjects/PythonCompiler/src/antlr/HtmlCssParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlCssParser}.
 */
public interface HtmlCssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HtmlCssParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HtmlCssParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(HtmlCssParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(HtmlCssParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterHtml_element(HtmlCssParser.Html_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitHtml_element(HtmlCssParser.Html_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#self_tag}.
	 * @param ctx the parse tree
	 */
	void enterSelf_tag(HtmlCssParser.Self_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#self_tag}.
	 * @param ctx the parse tree
	 */
	void exitSelf_tag(HtmlCssParser.Self_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HtmlCssParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HtmlCssParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#text_html}.
	 * @param ctx the parse tree
	 */
	void enterText_html(HtmlCssParser.Text_htmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#text_html}.
	 * @param ctx the parse tree
	 */
	void exitText_html(HtmlCssParser.Text_htmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinja_expr(HtmlCssParser.Jinja_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinja_expr(HtmlCssParser.Jinja_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HtmlCssParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HtmlCssParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(HtmlCssParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(HtmlCssParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterList_literal(HtmlCssParser.List_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitList_literal(HtmlCssParser.List_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(HtmlCssParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(HtmlCssParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#jinja_if_block}.
	 * @param ctx the parse tree
	 */
	void enterJinja_if_block(HtmlCssParser.Jinja_if_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#jinja_if_block}.
	 * @param ctx the parse tree
	 */
	void exitJinja_if_block(HtmlCssParser.Jinja_if_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#jinja_for_block}.
	 * @param ctx the parse tree
	 */
	void enterJinja_for_block(HtmlCssParser.Jinja_for_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#jinja_for_block}.
	 * @param ctx the parse tree
	 */
	void exitJinja_for_block(HtmlCssParser.Jinja_for_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#jinja_block_block}.
	 * @param ctx the parse tree
	 */
	void enterJinja_block_block(HtmlCssParser.Jinja_block_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#jinja_block_block}.
	 * @param ctx the parse tree
	 */
	void exitJinja_block_block(HtmlCssParser.Jinja_block_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#jinja_macro_block}.
	 * @param ctx the parse tree
	 */
	void enterJinja_macro_block(HtmlCssParser.Jinja_macro_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#jinja_macro_block}.
	 * @param ctx the parse tree
	 */
	void exitJinja_macro_block(HtmlCssParser.Jinja_macro_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#jinja_include_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJinja_include_stmt(HtmlCssParser.Jinja_include_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#jinja_include_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJinja_include_stmt(HtmlCssParser.Jinja_include_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#jinja_set_block}.
	 * @param ctx the parse tree
	 */
	void enterJinja_set_block(HtmlCssParser.Jinja_set_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#jinja_set_block}.
	 * @param ctx the parse tree
	 */
	void exitJinja_set_block(HtmlCssParser.Jinja_set_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#jinja_filter_block}.
	 * @param ctx the parse tree
	 */
	void enterJinja_filter_block(HtmlCssParser.Jinja_filter_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#jinja_filter_block}.
	 * @param ctx the parse tree
	 */
	void exitJinja_filter_block(HtmlCssParser.Jinja_filter_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlCssParser#jinja_call_block}.
	 * @param ctx the parse tree
	 */
	void enterJinja_call_block(HtmlCssParser.Jinja_call_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssParser#jinja_call_block}.
	 * @param ctx the parse tree
	 */
	void exitJinja_call_block(HtmlCssParser.Jinja_call_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link HtmlCssParser#style_element}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(HtmlCssParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link HtmlCssParser#style_element}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(HtmlCssParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRules}
	 * labeled alternative in {@link HtmlCssParser#css_rules}.
	 * @param ctx the parse tree
	 */
	void enterCssRules(HtmlCssParser.CssRulesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRules}
	 * labeled alternative in {@link HtmlCssParser#css_rules}.
	 * @param ctx the parse tree
	 */
	void exitCssRules(HtmlCssParser.CssRulesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRule}
	 * labeled alternative in {@link HtmlCssParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(HtmlCssParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRule}
	 * labeled alternative in {@link HtmlCssParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(HtmlCssParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorGroup}
	 * labeled alternative in {@link HtmlCssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(HtmlCssParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorGroup}
	 * labeled alternative in {@link HtmlCssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(HtmlCssParser.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorChain}
	 * labeled alternative in {@link HtmlCssParser#selector_part}.
	 * @param ctx the parse tree
	 */
	void enterSelectorChain(HtmlCssParser.SelectorChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorChain}
	 * labeled alternative in {@link HtmlCssParser#selector_part}.
	 * @param ctx the parse tree
	 */
	void exitSelectorChain(HtmlCssParser.SelectorChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleSelector}
	 * labeled alternative in {@link HtmlCssParser#simple_selector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(HtmlCssParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleSelector}
	 * labeled alternative in {@link HtmlCssParser#simple_selector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(HtmlCssParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link HtmlCssParser#class_selector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(HtmlCssParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link HtmlCssParser#class_selector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(HtmlCssParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link HtmlCssParser#id_selector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(HtmlCssParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link HtmlCssParser#id_selector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(HtmlCssParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoSelector}
	 * labeled alternative in {@link HtmlCssParser#pseudo_selector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoSelector(HtmlCssParser.PseudoSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoSelector}
	 * labeled alternative in {@link HtmlCssParser#pseudo_selector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoSelector(HtmlCssParser.PseudoSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterChildCombinator(HtmlCssParser.ChildCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitChildCombinator(HtmlCssParser.ChildCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdjacentCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterAdjacentCombinator(HtmlCssParser.AdjacentCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdjacentCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitAdjacentCombinator(HtmlCssParser.AdjacentCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SiblingCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterSiblingCombinator(HtmlCssParser.SiblingCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SiblingCombinator}
	 * labeled alternative in {@link HtmlCssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitSiblingCombinator(HtmlCssParser.SiblingCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBody}
	 * labeled alternative in {@link HtmlCssParser#css_body}.
	 * @param ctx the parse tree
	 */
	void enterCssBody(HtmlCssParser.CssBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBody}
	 * labeled alternative in {@link HtmlCssParser#css_body}.
	 * @param ctx the parse tree
	 */
	void exitCssBody(HtmlCssParser.CssBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDeclaration}
	 * labeled alternative in {@link HtmlCssParser#css_decl}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(HtmlCssParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDeclaration}
	 * labeled alternative in {@link HtmlCssParser#css_decl}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(HtmlCssParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link HtmlCssParser#css_value}.
	 * @param ctx the parse tree
	 */
	void enterValueList(HtmlCssParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link HtmlCssParser#css_value}.
	 * @param ctx the parse tree
	 */
	void exitValueList(HtmlCssParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentValue(HtmlCssParser.IdentValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentValue(HtmlCssParser.IdentValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(HtmlCssParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(HtmlCssParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(HtmlCssParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(HtmlCssParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterHexValue(HtmlCssParser.HexValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexValue}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitHexValue(HtmlCssParser.HexValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommaSeparator}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterCommaSeparator(HtmlCssParser.CommaSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaSeparator}
	 * labeled alternative in {@link HtmlCssParser#css_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitCommaSeparator(HtmlCssParser.CommaSeparatorContext ctx);
}
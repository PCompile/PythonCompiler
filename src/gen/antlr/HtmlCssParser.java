// Generated from C:/Users/mayas/PythonCompiler/src/antlr/HtmlCssParser.g4 by ANTLR 4.13.2
package gen.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlCssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, STYLE_OPEN=2, WS_HTML=3, SELF_TAG=4, OPEN_TAG=5, CLOSE_TAG=6, 
		TEXT_HTML=7, JINJA_EXPR_START=8, JINJA_STMT_START=9, JINJA_COMMENT_START=10, 
		COMMENT_TEXT=11, JINJA_COMMENT_END=12, JINJA_EXPR_END=13, STRING=14, PLUS=15, 
		MINUS=16, STAR=17, SLASH=18, PERCENT=19, FLOORDIV=20, EQ=21, NEQ=22, LT=23, 
		GT=24, LTE=25, GTE=26, AND=27, OR=28, NOT=29, IN=30, LPAREN=31, RPAREN=32, 
		LBRACKET=33, RBRACKET=34, COMMA=35, COLON=36, DOT=37, PIPE=38, TILDE=39, 
		IDENTIFIER=40, NUMBER=41, WS_EXPR=42, JINJA_STMT_END=43, IF=44, ELSE=45, 
		ELIF=46, ENDIF=47, FOR=48, ENDFOR=49, BLOCK=50, ENDBLOCK=51, EXTENDS=52, 
		INCLUDE=53, SET=54, ENDSET=55, FILTER=56, ENDFILTER=57, MACRO=58, ENDMACRO=59, 
		CALL=60, ENDCALL=61, ENDWITH=62, STRING_STMT=63, PLUS_STMT=64, MINUS_STMT=65, 
		STAR_STMT=66, SLASH_STMT=67, PERCENT_STMT=68, FLOORDIV_STMT=69, EQ_STMT=70, 
		NEQ_STMT=71, LT_STMT=72, GT_STMT=73, LTE_STMT=74, GTE_STMT=75, AND_STMT=76, 
		OR_STMT=77, NOT_STMT=78, IN_STMT=79, LPAREN_STMT=80, RPAREN_STMT=81, LBRACKET_STMT=82, 
		RBRACKET_STMT=83, COMMA_STMT=84, COLON_STMT=85, DOT_STMT=86, PIPE_STMT=87, 
		TILDE_STMT=88, IDENTIFIER_STMT=89, NUMBER_STMT=90, WS_STMT=91, STYLE_CLOSE_CSS=92, 
		CSS_COMMENT=93, WS_CSS=94, LBRACE_CSS=95, RBRACE_CSS=96, COLON_CSS=97, 
		SEMI_CSS=98, COMMA_CSS=99, SPACE=100, DOTCSS=101, HASH=102, GTCSS=103, 
		PLUSCSS=104, TILDECSS=105, ROOT=106, CSS_VAR=107, HEX_COLOR=108, LPAREN_CSS=109, 
		RPAREN_CSS=110, PERCENTCsd=111, IDENT=112, VAR_FUNC=113, RGBA_FUNC=114, 
		NUMBERCSS=115, STRING_CSS=116;
	public static final int
		RULE_document = 0, RULE_node = 1, RULE_html_element = 2, RULE_self_tag = 3, 
		RULE_content = 4, RULE_text_html = 5, RULE_jinja_expr = 6, RULE_expr = 7, 
		RULE_or_expr = 8, RULE_and_expr = 9, RULE_equality_expr = 10, RULE_additive_expr = 11, 
		RULE_multiplicative_expr = 12, RULE_unary_expr = 13, RULE_primary = 14, 
		RULE_filter_expr = 15, RULE_value = 16, RULE_function_call = 17, RULE_value_suffix = 18, 
		RULE_list_literal = 19, RULE_bin_op = 20, RULE_jinja_if_block = 21, RULE_stmt_expr = 22, 
		RULE_stmt_or_expr = 23, RULE_stmt_primary = 24, RULE_stmt_list_literal = 25, 
		RULE_stmt_call = 26, RULE_bin_op_stmt = 27, RULE_logical_op_stmt = 28, 
		RULE_jinja_for_block = 29, RULE_jinja_block_block = 30, RULE_jinja_macro_block = 31, 
		RULE_jinja_include_stmt = 32, RULE_jinja_set_block = 33, RULE_jinja_filter_block = 34, 
		RULE_jinja_call_block = 35, RULE_style_element = 36, RULE_css_rules = 37, 
		RULE_css_rule = 38, RULE_selector = 39, RULE_selector_part = 40, RULE_combinator = 41, 
		RULE_simple_selector = 42, RULE_class_selector = 43, RULE_id_selector = 44, 
		RULE_pseudo_selector = 45, RULE_css_body = 46, RULE_css_decl = 47, RULE_css_value = 48, 
		RULE_css_value_atom = 49, RULE_function_call2 = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "node", "html_element", "self_tag", "content", "text_html", 
			"jinja_expr", "expr", "or_expr", "and_expr", "equality_expr", "additive_expr", 
			"multiplicative_expr", "unary_expr", "primary", "filter_expr", "value", 
			"function_call", "value_suffix", "list_literal", "bin_op", "jinja_if_block", 
			"stmt_expr", "stmt_or_expr", "stmt_primary", "stmt_list_literal", "stmt_call", 
			"bin_op_stmt", "logical_op_stmt", "jinja_for_block", "jinja_block_block", 
			"jinja_macro_block", "jinja_include_stmt", "jinja_set_block", "jinja_filter_block", 
			"jinja_call_block", "style_element", "css_rules", "css_rule", "selector", 
			"selector_part", "combinator", "simple_selector", "class_selector", "id_selector", 
			"pseudo_selector", "css_body", "css_decl", "css_value", "css_value_atom", 
			"function_call2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<style>'", null, null, null, null, null, "'{{'", "'{%'", 
			"'{#'", null, "'#}'", "'}}'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'%}'", "'if'", 
			"'else'", "'elif'", "'endif'", "'for'", "'endfor'", "'block'", "'endblock'", 
			"'extends'", "'include'", "'set'", "'endset'", "'filter'", "'endfilter'", 
			"'macro'", "'endmacro'", "'call'", "'endcall'", "'endwith'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'</style>'", null, null, "'{'", "'}'", null, "';'", 
			null, "'\\n'", null, "'#'", null, null, null, "':root'", null, null, 
			null, null, null, null, "'var'", "'rgba'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "STYLE_OPEN", "WS_HTML", "SELF_TAG", "OPEN_TAG", "CLOSE_TAG", 
			"TEXT_HTML", "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_COMMENT_START", 
			"COMMENT_TEXT", "JINJA_COMMENT_END", "JINJA_EXPR_END", "STRING", "PLUS", 
			"MINUS", "STAR", "SLASH", "PERCENT", "FLOORDIV", "EQ", "NEQ", "LT", "GT", 
			"LTE", "GTE", "AND", "OR", "NOT", "IN", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "COMMA", "COLON", "DOT", "PIPE", "TILDE", "IDENTIFIER", "NUMBER", 
			"WS_EXPR", "JINJA_STMT_END", "IF", "ELSE", "ELIF", "ENDIF", "FOR", "ENDFOR", 
			"BLOCK", "ENDBLOCK", "EXTENDS", "INCLUDE", "SET", "ENDSET", "FILTER", 
			"ENDFILTER", "MACRO", "ENDMACRO", "CALL", "ENDCALL", "ENDWITH", "STRING_STMT", 
			"PLUS_STMT", "MINUS_STMT", "STAR_STMT", "SLASH_STMT", "PERCENT_STMT", 
			"FLOORDIV_STMT", "EQ_STMT", "NEQ_STMT", "LT_STMT", "GT_STMT", "LTE_STMT", 
			"GTE_STMT", "AND_STMT", "OR_STMT", "NOT_STMT", "IN_STMT", "LPAREN_STMT", 
			"RPAREN_STMT", "LBRACKET_STMT", "RBRACKET_STMT", "COMMA_STMT", "COLON_STMT", 
			"DOT_STMT", "PIPE_STMT", "TILDE_STMT", "IDENTIFIER_STMT", "NUMBER_STMT", 
			"WS_STMT", "STYLE_CLOSE_CSS", "CSS_COMMENT", "WS_CSS", "LBRACE_CSS", 
			"RBRACE_CSS", "COLON_CSS", "SEMI_CSS", "COMMA_CSS", "SPACE", "DOTCSS", 
			"HASH", "GTCSS", "PLUSCSS", "TILDECSS", "ROOT", "CSS_VAR", "HEX_COLOR", 
			"LPAREN_CSS", "RPAREN_CSS", "PERCENTCsd", "IDENT", "VAR_FUNC", "RGBA_FUNC", 
			"NUMBERCSS", "STRING_CSS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HtmlCssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlCssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	 
		public DocumentContext() { }
		public void copyFrom(DocumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DocumentRuleContext extends DocumentContext {
		public TerminalNode EOF() { return getToken(HtmlCssParser.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public DocumentRuleContext(DocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterDocumentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitDocumentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitDocumentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			_localctx = new DocumentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 948L) != 0)) {
				{
				{
				setState(102);
				node();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ParserRuleContext {
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	 
		public NodeContext() { }
		public void copyFrom(NodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForBlockNodeContext extends NodeContext {
		public Jinja_for_blockContext jinja_for_block() {
			return getRuleContext(Jinja_for_blockContext.class,0);
		}
		public JinjaForBlockNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener) ((HtmlCssParserListener)listener).enterJinjaForBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaForBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaForBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementNodeContext extends NodeContext {
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public HtmlElementNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterHtmlElementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitHtmlElementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitHtmlElementNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSetBlockNodeContext extends NodeContext {
		public Jinja_set_blockContext jinja_set_block() {
			return getRuleContext(Jinja_set_blockContext.class,0);
		}
		public JinjaSetBlockNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaSetBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaSetBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaSetBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfBlockNodeContext extends NodeContext {
		public Jinja_if_blockContext jinja_if_block() {
			return getRuleContext(Jinja_if_blockContext.class,0);
		}
		public JinjaIfBlockNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaIfBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaIfBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaIfBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIncludeNodeContext extends NodeContext {
		public Jinja_include_stmtContext jinja_include_stmt() {
			return getRuleContext(Jinja_include_stmtContext.class,0);
		}
		public JinjaIncludeNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaIncludeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaIncludeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaIncludeNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCallBlockNodeContext extends NodeContext {
		public Jinja_call_blockContext jinja_call_block() {
			return getRuleContext(Jinja_call_blockContext.class,0);
		}
		public JinjaCallBlockNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaCallBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaCallBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaCallBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementNodeContext extends NodeContext {
		public Style_elementContext style_element() {
			return getRuleContext(Style_elementContext.class,0);
		}
		public StyleElementNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStyleElementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStyleElementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStyleElementNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFilterBlockNodeContext extends NodeContext {
		public Jinja_filter_blockContext jinja_filter_block() {
			return getRuleContext(Jinja_filter_blockContext.class,0);
		}
		public JinjaFilterBlockNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaFilterBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaFilterBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaFilterBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextHtmlNodeContext extends NodeContext {
		public Text_htmlContext text_html() {
			return getRuleContext(Text_htmlContext.class,0);
		}
		public TextHtmlNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterTextHtmlNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitTextHtmlNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitTextHtmlNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprNodeContext extends NodeContext {
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public JinjaExprNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaExprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaExprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaExprNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfTagNodeContext extends NodeContext {
		public Self_tagContext self_tag() {
			return getRuleContext(Self_tagContext.class,0);
		}
		public SelfTagNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSelfTagNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSelfTagNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSelfTagNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockBlockNodeContext extends NodeContext {
		public Jinja_block_blockContext jinja_block_block() {
			return getRuleContext(Jinja_block_blockContext.class,0);
		}
		public JinjaBlockBlockNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaBlockBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaBlockBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaBlockBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaMacroBlockNodeContext extends NodeContext {
		public Jinja_macro_blockContext jinja_macro_block() {
			return getRuleContext(Jinja_macro_blockContext.class,0);
		}
		public JinjaMacroBlockNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaMacroBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaMacroBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaMacroBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new HtmlElementNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				html_element();
				}
				break;
			case 2:
				_localctx = new SelfTagNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				self_tag();
				}
				break;
			case 3:
				_localctx = new StyleElementNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				style_element();
				}
				break;
			case 4:
				_localctx = new TextHtmlNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				text_html();
				}
				break;
			case 5:
				_localctx = new JinjaExprNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				jinja_expr();
				}
				break;
			case 6:
				_localctx = new JinjaIfBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				jinja_if_block();
				}
				break;
			case 7:
				_localctx = new JinjaForBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				jinja_for_block();
				}
				break;
			case 8:
				_localctx = new JinjaBlockBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				jinja_block_block();
				}
				break;
			case 9:
				_localctx = new JinjaMacroBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				jinja_macro_block();
				}
				break;
			case 10:
				_localctx = new JinjaIncludeNodeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				jinja_include_stmt();
				}
				break;
			case 11:
				_localctx = new JinjaSetBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				jinja_set_block();
				}
				break;
			case 12:
				_localctx = new JinjaFilterBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(121);
				jinja_filter_block();
				}
				break;
			case 13:
				_localctx = new JinjaCallBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(122);
				jinja_call_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_elementContext extends ParserRuleContext {
		public Html_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_element; }
	 
		public Html_elementContext() { }
		public void copyFrom(Html_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends Html_elementContext {
		public TerminalNode OPEN_TAG() { return getToken(HtmlCssParser.OPEN_TAG, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(HtmlCssParser.CLOSE_TAG, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public HtmlElementContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_html_element);
		int _la;
		try {
			_localctx = new HtmlElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(OPEN_TAG);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 948L) != 0)) {
				{
				{
				setState(126);
				node();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Self_tagContext extends ParserRuleContext {
		public Self_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_tag; }
	 
		public Self_tagContext() { }
		public void copyFrom(Self_tagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfTagContext extends Self_tagContext {
		public TerminalNode SELF_TAG() { return getToken(HtmlCssParser.SELF_TAG, 0); }
		public SelfTagContext(Self_tagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSelfTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSelfTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSelfTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_tagContext self_tag() throws RecognitionException {
		Self_tagContext _localctx = new Self_tagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_self_tag);
		try {
			_localctx = new SelfTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(SELF_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContentRuleContext extends ContentContext {
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ContentRuleContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterContentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitContentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitContentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_content);
		try {
			int _alt;
			_localctx = new ContentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					node();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Text_htmlContext extends ParserRuleContext {
		public Text_htmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_html; }
	 
		public Text_htmlContext() { }
		public void copyFrom(Text_htmlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextHtmlContext extends Text_htmlContext {
		public TerminalNode TEXT_HTML() { return getToken(HtmlCssParser.TEXT_HTML, 0); }
		public TextHtmlContext(Text_htmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterTextHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitTextHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitTextHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_htmlContext text_html() throws RecognitionException {
		Text_htmlContext _localctx = new Text_htmlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_text_html);
		try {
			_localctx = new TextHtmlContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(TEXT_HTML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_exprContext extends ParserRuleContext {
		public Jinja_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_expr; }
	 
		public Jinja_exprContext() { }
		public void copyFrom(Jinja_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprContext extends Jinja_exprContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(HtmlCssParser.JINJA_EXPR_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(HtmlCssParser.JINJA_EXPR_END, 0); }
		public JinjaExprContext(Jinja_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_exprContext jinja_expr() throws RecognitionException {
		Jinja_exprContext _localctx = new Jinja_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jinja_expr);
		try {
			_localctx = new JinjaExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(JINJA_EXPR_START);
			setState(145);
			expr();
			setState(146);
			match(JINJA_EXPR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRuleContext extends ExprContext {
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public ExprRuleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterExprRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitExprRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitExprRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			_localctx = new ExprRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			or_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Or_exprContext extends ParserRuleContext {
		public Or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expr; }
	 
		public Or_exprContext() { }
		public void copyFrom(Or_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrBinaryContext extends Or_exprContext {
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public TerminalNode OR() { return getToken(HtmlCssParser.OR, 0); }
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public OrBinaryContext(Or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterOrBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitOrBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitOrBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrSingleContext extends Or_exprContext {
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public OrSingleContext(Or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterOrSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitOrSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitOrSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_exprContext or_expr() throws RecognitionException {
		return or_expr(0);
	}

	private Or_exprContext or_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Or_exprContext _localctx = new Or_exprContext(_ctx, _parentState);
		Or_exprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_or_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OrSingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(151);
			and_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrBinaryContext(new Or_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_or_expr);
					setState(153);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(154);
					match(OR);
					setState(155);
					and_expr(0);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class And_exprContext extends ParserRuleContext {
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
	 
		public And_exprContext() { }
		public void copyFrom(And_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndBinaryContext extends And_exprContext {
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public TerminalNode AND() { return getToken(HtmlCssParser.AND, 0); }
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public AndBinaryContext(And_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterAndBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitAndBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitAndBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndSingleContext extends And_exprContext {
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public AndSingleContext(And_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterAndSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitAndSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitAndSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		return and_expr(0);
	}

	private And_exprContext and_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_exprContext _localctx = new And_exprContext(_ctx, _parentState);
		And_exprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_and_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndSingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(162);
			equality_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndBinaryContext(new And_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_and_expr);
					setState(164);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(165);
					match(AND);
					setState(166);
					equality_expr(0);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Equality_exprContext extends ParserRuleContext {
		public Equality_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expr; }
	 
		public Equality_exprContext() { }
		public void copyFrom(Equality_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualitySingleContext extends Equality_exprContext {
		public Additive_exprContext additive_expr() {
			return getRuleContext(Additive_exprContext.class,0);
		}
		public EqualitySingleContext(Equality_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterEqualitySingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitEqualitySingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitEqualitySingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityBinaryContext extends Equality_exprContext {
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public Additive_exprContext additive_expr() {
			return getRuleContext(Additive_exprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(HtmlCssParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(HtmlCssParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(HtmlCssParser.LT, 0); }
		public TerminalNode GT() { return getToken(HtmlCssParser.GT, 0); }
		public TerminalNode LTE() { return getToken(HtmlCssParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(HtmlCssParser.GTE, 0); }
		public TerminalNode IN() { return getToken(HtmlCssParser.IN, 0); }
		public EqualityBinaryContext(Equality_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterEqualityBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitEqualityBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitEqualityBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_exprContext equality_expr() throws RecognitionException {
		return equality_expr(0);
	}

	private Equality_exprContext equality_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_exprContext _localctx = new Equality_exprContext(_ctx, _parentState);
		Equality_exprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_equality_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualitySingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(173);
			additive_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityBinaryContext(new Equality_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equality_expr);
					setState(175);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(176);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1205862400L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(177);
					additive_expr(0);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Additive_exprContext extends ParserRuleContext {
		public Additive_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expr; }
	 
		public Additive_exprContext() { }
		public void copyFrom(Additive_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveBinaryContext extends Additive_exprContext {
		public Additive_exprContext additive_expr() {
			return getRuleContext(Additive_exprContext.class,0);
		}
		public Multiplicative_exprContext multiplicative_expr() {
			return getRuleContext(Multiplicative_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(HtmlCssParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HtmlCssParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(HtmlCssParser.TILDE, 0); }
		public AdditiveBinaryContext(Additive_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterAdditiveBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitAdditiveBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitAdditiveBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveSingleContext extends Additive_exprContext {
		public Multiplicative_exprContext multiplicative_expr() {
			return getRuleContext(Multiplicative_exprContext.class,0);
		}
		public AdditiveSingleContext(Additive_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterAdditiveSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitAdditiveSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitAdditiveSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_exprContext additive_expr() throws RecognitionException {
		return additive_expr(0);
	}

	private Additive_exprContext additive_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_exprContext _localctx = new Additive_exprContext(_ctx, _parentState);
		Additive_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_additive_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveSingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(184);
			multiplicative_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveBinaryContext(new Additive_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additive_expr);
					setState(186);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(187);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 549755912192L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(188);
					multiplicative_expr(0);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multiplicative_exprContext extends ParserRuleContext {
		public Multiplicative_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expr; }
	 
		public Multiplicative_exprContext() { }
		public void copyFrom(Multiplicative_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeSingleContext extends Multiplicative_exprContext {
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public MultiplicativeSingleContext(Multiplicative_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterMultiplicativeSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitMultiplicativeSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitMultiplicativeSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeBinaryContext extends Multiplicative_exprContext {
		public Multiplicative_exprContext multiplicative_expr() {
			return getRuleContext(Multiplicative_exprContext.class,0);
		}
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public TerminalNode STAR() { return getToken(HtmlCssParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(HtmlCssParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(HtmlCssParser.PERCENT, 0); }
		public TerminalNode FLOORDIV() { return getToken(HtmlCssParser.FLOORDIV, 0); }
		public MultiplicativeBinaryContext(Multiplicative_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterMultiplicativeBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitMultiplicativeBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitMultiplicativeBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_exprContext multiplicative_expr() throws RecognitionException {
		return multiplicative_expr(0);
	}

	private Multiplicative_exprContext multiplicative_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_exprContext _localctx = new Multiplicative_exprContext(_ctx, _parentState);
		Multiplicative_exprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_multiplicative_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiplicativeSingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(195);
			unary_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeBinaryContext(new Multiplicative_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expr);
					setState(197);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(198);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(199);
					unary_expr();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_exprContext extends ParserRuleContext {
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
	 
		public Unary_exprContext() { }
		public void copyFrom(Unary_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPlusContext extends Unary_exprContext {
		public TerminalNode PLUS() { return getToken(HtmlCssParser.PLUS, 0); }
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public UnaryPlusContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterUnaryPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitUnaryPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitUnaryPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPrimaryContext extends Unary_exprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryPrimaryContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterUnaryPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitUnaryPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitUnaryPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusContext extends Unary_exprContext {
		public TerminalNode MINUS() { return getToken(HtmlCssParser.MINUS, 0); }
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public UnaryMinusContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryNotContext extends Unary_exprContext {
		public TerminalNode NOT() { return getToken(HtmlCssParser.NOT, 0); }
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public UnaryNotContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterUnaryNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitUnaryNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitUnaryNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary_expr);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new UnaryNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(NOT);
				setState(206);
				unary_expr();
				}
				break;
			case PLUS:
				_localctx = new UnaryPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(PLUS);
				setState(208);
				unary_expr();
				}
				break;
			case MINUS:
				_localctx = new UnaryMinusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(MINUS);
				setState(210);
				unary_expr();
				}
				break;
			case STRING:
			case LPAREN:
			case LBRACKET:
			case IDENTIFIER:
			case NUMBER:
				_localctx = new UnaryPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryRuleContext extends PrimaryContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public PrimaryRuleContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterPrimaryRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitPrimaryRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitPrimaryRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		try {
			_localctx = new PrimaryRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			filter_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Filter_exprContext extends ParserRuleContext {
		public Filter_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_expr; }
	 
		public Filter_exprContext() { }
		public void copyFrom(Filter_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterExprContext extends Filter_exprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> PIPE() { return getTokens(HtmlCssParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(HtmlCssParser.PIPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HtmlCssParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HtmlCssParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HtmlCssParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HtmlCssParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HtmlCssParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HtmlCssParser.RPAREN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtmlCssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtmlCssParser.COMMA, i);
		}
		public FilterExprContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterFilterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitFilterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitFilterExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_exprContext filter_expr() throws RecognitionException {
		Filter_exprContext _localctx = new Filter_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_filter_expr);
		int _la;
		try {
			int _alt;
			_localctx = new FilterExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			value();
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(PIPE);
					setState(218);
					match(IDENTIFIER);
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(219);
						match(LPAREN);
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3309809287168L) != 0)) {
							{
							setState(220);
							expr();
							setState(225);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(221);
								match(COMMA);
								setState(222);
								expr();
								}
								}
								setState(227);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(230);
						match(RPAREN);
						}
						break;
					}
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueIdentifierContext extends ValueContext {
		public TerminalNode IDENTIFIER() { return getToken(HtmlCssParser.IDENTIFIER, 0); }
		public List<Value_suffixContext> value_suffix() {
			return getRuleContexts(Value_suffixContext.class);
		}
		public Value_suffixContext value_suffix(int i) {
			return getRuleContext(Value_suffixContext.class,i);
		}
		public ValueIdentifierContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterValueIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitValueIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitValueIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueNumberContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(HtmlCssParser.NUMBER, 0); }
		public ValueNumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterValueNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitValueNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitValueNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueStringContext extends ValueContext {
		public TerminalNode STRING() { return getToken(HtmlCssParser.STRING, 0); }
		public ValueStringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitValueString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitValueString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueListRuleContext extends ValueContext {
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public ValueListRuleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterValueListRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitValueListRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitValueListRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueParenContext extends ValueContext {
		public TerminalNode LPAREN() { return getToken(HtmlCssParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HtmlCssParser.RPAREN, 0); }
		public ValueParenContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterValueParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitValueParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitValueParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueFunctionCallContext extends ValueContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ValueFunctionCallContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterValueFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitValueFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitValueFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			int _alt;
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ValueFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				function_call();
				}
				break;
			case 2:
				_localctx = new ValueIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(IDENTIFIER);
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(240);
						value_suffix();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ValueNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new ValueListRuleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				list_literal();
				}
				break;
			case 6:
				_localctx = new ValueParenContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				match(LPAREN);
				setState(250);
				expr();
				setState(251);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends Function_callContext {
		public TerminalNode IDENTIFIER() { return getToken(HtmlCssParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HtmlCssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HtmlCssParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtmlCssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtmlCssParser.COMMA, i);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IDENTIFIER);
			setState(256);
			match(LPAREN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3309809287168L) != 0)) {
				{
				setState(257);
				expr();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(258);
					match(COMMA);
					setState(259);
					expr();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(267);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value_suffixContext extends ParserRuleContext {
		public Value_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_suffix; }
	 
		public Value_suffixContext() { }
		public void copyFrom(Value_suffixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotSuffixContext extends Value_suffixContext {
		public TerminalNode DOT() { return getToken(HtmlCssParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtmlCssParser.IDENTIFIER, 0); }
		public DotSuffixContext(Value_suffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterDotSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitDotSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitDotSuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexSuffixContext extends Value_suffixContext {
		public TerminalNode LBRACKET() { return getToken(HtmlCssParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(HtmlCssParser.RBRACKET, 0); }
		public IndexSuffixContext(Value_suffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterIndexSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitIndexSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitIndexSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_suffixContext value_suffix() throws RecognitionException {
		Value_suffixContext _localctx = new Value_suffixContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value_suffix);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new DotSuffixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(DOT);
				setState(270);
				match(IDENTIFIER);
				}
				break;
			case LBRACKET:
				_localctx = new IndexSuffixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(LBRACKET);
				setState(272);
				expr();
				setState(273);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_literalContext extends ParserRuleContext {
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
	 
		public List_literalContext() { }
		public void copyFrom(List_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends List_literalContext {
		public TerminalNode LBRACKET() { return getToken(HtmlCssParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(HtmlCssParser.RBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtmlCssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtmlCssParser.COMMA, i);
		}
		public ListLiteralContext(List_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_list_literal);
		int _la;
		try {
			_localctx = new ListLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LBRACKET);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3309809287168L) != 0)) {
				{
				setState(278);
				expr();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(279);
					match(COMMA);
					setState(280);
					expr();
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(288);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_opContext extends ParserRuleContext {
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
	 
		public Bin_opContext() { }
		public void copyFrom(Bin_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpMinusContext extends Bin_opContext {
		public TerminalNode MINUS() { return getToken(HtmlCssParser.MINUS, 0); }
		public BinOpMinusContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStarContext extends Bin_opContext {
		public TerminalNode STAR() { return getToken(HtmlCssParser.STAR, 0); }
		public BinOpStarContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpOrContext extends Bin_opContext {
		public TerminalNode OR() { return getToken(HtmlCssParser.OR, 0); }
		public BinOpOrContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpSlashContext extends Bin_opContext {
		public TerminalNode SLASH() { return getToken(HtmlCssParser.SLASH, 0); }
		public BinOpSlashContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpAndContext extends Bin_opContext {
		public TerminalNode AND() { return getToken(HtmlCssParser.AND, 0); }
		public BinOpAndContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpInContext extends Bin_opContext {
		public TerminalNode IN() { return getToken(HtmlCssParser.IN, 0); }
		public BinOpInContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpIn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpNeqContext extends Bin_opContext {
		public TerminalNode NEQ() { return getToken(HtmlCssParser.NEQ, 0); }
		public BinOpNeqContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpNeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpNeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpLtContext extends Bin_opContext {
		public TerminalNode LT() { return getToken(HtmlCssParser.LT, 0); }
		public BinOpLtContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpGteContext extends Bin_opContext {
		public TerminalNode GTE() { return getToken(HtmlCssParser.GTE, 0); }
		public BinOpGteContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpGte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpGte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpGte(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpGtContext extends Bin_opContext {
		public TerminalNode GT() { return getToken(HtmlCssParser.GT, 0); }
		public BinOpGtContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpGt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpLteContext extends Bin_opContext {
		public TerminalNode LTE() { return getToken(HtmlCssParser.LTE, 0); }
		public BinOpLteContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpLte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpLte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpLte(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpEqContext extends Bin_opContext {
		public TerminalNode EQ() { return getToken(HtmlCssParser.EQ, 0); }
		public BinOpEqContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpPlusContext extends Bin_opContext {
		public TerminalNode PLUS() { return getToken(HtmlCssParser.PLUS, 0); }
		public BinOpPlusContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpTildeContext extends Bin_opContext {
		public TerminalNode TILDE() { return getToken(HtmlCssParser.TILDE, 0); }
		public BinOpTildeContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpTilde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpTilde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpTilde(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpPercentContext extends Bin_opContext {
		public TerminalNode PERCENT() { return getToken(HtmlCssParser.PERCENT, 0); }
		public BinOpPercentContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpPercent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpFloorDivContext extends Bin_opContext {
		public TerminalNode FLOORDIV() { return getToken(HtmlCssParser.FLOORDIV, 0); }
		public BinOpFloorDivContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpFloorDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpFloorDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpFloorDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bin_op);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new BinOpPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new BinOpMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new BinOpStarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(STAR);
				}
				break;
			case SLASH:
				_localctx = new BinOpSlashContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(SLASH);
				}
				break;
			case PERCENT:
				_localctx = new BinOpPercentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				match(PERCENT);
				}
				break;
			case FLOORDIV:
				_localctx = new BinOpFloorDivContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
				match(FLOORDIV);
				}
				break;
			case EQ:
				_localctx = new BinOpEqContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				match(EQ);
				}
				break;
			case NEQ:
				_localctx = new BinOpNeqContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				match(NEQ);
				}
				break;
			case LT:
				_localctx = new BinOpLtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(298);
				match(LT);
				}
				break;
			case GT:
				_localctx = new BinOpGtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(299);
				match(GT);
				}
				break;
			case LTE:
				_localctx = new BinOpLteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(300);
				match(LTE);
				}
				break;
			case GTE:
				_localctx = new BinOpGteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(301);
				match(GTE);
				}
				break;
			case AND:
				_localctx = new BinOpAndContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(302);
				match(AND);
				}
				break;
			case OR:
				_localctx = new BinOpOrContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(303);
				match(OR);
				}
				break;
			case IN:
				_localctx = new BinOpInContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(304);
				match(IN);
				}
				break;
			case TILDE:
				_localctx = new BinOpTildeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(305);
				match(TILDE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_if_blockContext extends ParserRuleContext {
		public Jinja_if_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_if_block; }
	 
		public Jinja_if_blockContext() { }
		public void copyFrom(Jinja_if_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfBlockContext extends Jinja_if_blockContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode IF() { return getToken(HtmlCssParser.IF, 0); }
		public List<Stmt_exprContext> stmt_expr() {
			return getRuleContexts(Stmt_exprContext.class);
		}
		public Stmt_exprContext stmt_expr(int i) {
			return getRuleContext(Stmt_exprContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(HtmlCssParser.ENDIF, 0); }
		public List<TerminalNode> ELIF() { return getTokens(HtmlCssParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(HtmlCssParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(HtmlCssParser.ELSE, 0); }
		public JinjaIfBlockContext(Jinja_if_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_if_blockContext jinja_if_block() throws RecognitionException {
		Jinja_if_blockContext _localctx = new Jinja_if_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jinja_if_block);
		try {
			int _alt;
			_localctx = new JinjaIfBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(JINJA_STMT_START);
			setState(309);
			match(IF);
			setState(310);
			stmt_expr();
			setState(311);
			match(JINJA_STMT_END);
			setState(312);
			content();
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					match(JINJA_STMT_START);
					setState(314);
					match(ELIF);
					setState(315);
					stmt_expr();
					setState(316);
					match(JINJA_STMT_END);
					setState(317);
					content();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(324);
				match(JINJA_STMT_START);
				setState(325);
				match(ELSE);
				setState(326);
				match(JINJA_STMT_END);
				setState(327);
				content();
				}
				break;
			}
			setState(330);
			match(JINJA_STMT_START);
			setState(331);
			match(ENDIF);
			setState(332);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_exprContext extends ParserRuleContext {
		public Stmt_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_expr; }
	 
		public Stmt_exprContext() { }
		public void copyFrom(Stmt_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtExprContext extends Stmt_exprContext {
		public Stmt_or_exprContext stmt_or_expr() {
			return getRuleContext(Stmt_or_exprContext.class,0);
		}
		public StmtExprContext(Stmt_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_exprContext stmt_expr() throws RecognitionException {
		Stmt_exprContext _localctx = new Stmt_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stmt_expr);
		try {
			_localctx = new StmtExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			stmt_or_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_or_exprContext extends ParserRuleContext {
		public Stmt_or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_or_expr; }
	 
		public Stmt_or_exprContext() { }
		public void copyFrom(Stmt_or_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtBinOpContext extends Stmt_or_exprContext {
		public List<Stmt_or_exprContext> stmt_or_expr() {
			return getRuleContexts(Stmt_or_exprContext.class);
		}
		public Stmt_or_exprContext stmt_or_expr(int i) {
			return getRuleContext(Stmt_or_exprContext.class,i);
		}
		public Bin_op_stmtContext bin_op_stmt() {
			return getRuleContext(Bin_op_stmtContext.class,0);
		}
		public StmtBinOpContext(Stmt_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtPipeCallContext extends Stmt_or_exprContext {
		public List<Stmt_or_exprContext> stmt_or_expr() {
			return getRuleContexts(Stmt_or_exprContext.class);
		}
		public Stmt_or_exprContext stmt_or_expr(int i) {
			return getRuleContext(Stmt_or_exprContext.class,i);
		}
		public TerminalNode PIPE_STMT() { return getToken(HtmlCssParser.PIPE_STMT, 0); }
		public TerminalNode IDENTIFIER_STMT() { return getToken(HtmlCssParser.IDENTIFIER_STMT, 0); }
		public TerminalNode LPAREN_STMT() { return getToken(HtmlCssParser.LPAREN_STMT, 0); }
		public TerminalNode RPAREN_STMT() { return getToken(HtmlCssParser.RPAREN_STMT, 0); }
		public List<TerminalNode> COMMA_STMT() { return getTokens(HtmlCssParser.COMMA_STMT); }
		public TerminalNode COMMA_STMT(int i) {
			return getToken(HtmlCssParser.COMMA_STMT, i);
		}
		public StmtPipeCallContext(Stmt_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtPipeCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtPipeCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtPipeCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtParenContext extends Stmt_or_exprContext {
		public TerminalNode LPAREN_STMT() { return getToken(HtmlCssParser.LPAREN_STMT, 0); }
		public Stmt_or_exprContext stmt_or_expr() {
			return getRuleContext(Stmt_or_exprContext.class,0);
		}
		public TerminalNode RPAREN_STMT() { return getToken(HtmlCssParser.RPAREN_STMT, 0); }
		public StmtParenContext(Stmt_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtLogicalOpContext extends Stmt_or_exprContext {
		public List<Stmt_or_exprContext> stmt_or_expr() {
			return getRuleContexts(Stmt_or_exprContext.class);
		}
		public Stmt_or_exprContext stmt_or_expr(int i) {
			return getRuleContext(Stmt_or_exprContext.class,i);
		}
		public Logical_op_stmtContext logical_op_stmt() {
			return getRuleContext(Logical_op_stmtContext.class,0);
		}
		public StmtLogicalOpContext(Stmt_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtPrimaryExprContext extends Stmt_or_exprContext {
		public Stmt_primaryContext stmt_primary() {
			return getRuleContext(Stmt_primaryContext.class,0);
		}
		public StmtPrimaryExprContext(Stmt_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtNotContext extends Stmt_or_exprContext {
		public TerminalNode NOT_STMT() { return getToken(HtmlCssParser.NOT_STMT, 0); }
		public Stmt_or_exprContext stmt_or_expr() {
			return getRuleContext(Stmt_or_exprContext.class,0);
		}
		public StmtNotContext(Stmt_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_or_exprContext stmt_or_expr() throws RecognitionException {
		return stmt_or_expr(0);
	}

	private Stmt_or_exprContext stmt_or_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Stmt_or_exprContext _localctx = new Stmt_or_exprContext(_ctx, _parentState);
		Stmt_or_exprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_stmt_or_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_STMT:
			case LBRACKET_STMT:
			case IDENTIFIER_STMT:
			case NUMBER_STMT:
				{
				_localctx = new StmtPrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(337);
				stmt_primary();
				}
				break;
			case NOT_STMT:
				{
				_localctx = new StmtNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(NOT_STMT);
				setState(339);
				stmt_or_expr(4);
				}
				break;
			case LPAREN_STMT:
				{
				_localctx = new StmtParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(LPAREN_STMT);
				setState(341);
				stmt_or_expr(0);
				setState(342);
				match(RPAREN_STMT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new StmtBinOpContext(new Stmt_or_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt_or_expr);
						setState(346);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(347);
						bin_op_stmt();
						setState(348);
						stmt_or_expr(3);
						}
						break;
					case 2:
						{
						_localctx = new StmtLogicalOpContext(new Stmt_or_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt_or_expr);
						setState(350);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(351);
						logical_op_stmt();
						setState(352);
						stmt_or_expr(2);
						}
						break;
					case 3:
						{
						_localctx = new StmtPipeCallContext(new Stmt_or_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt_or_expr);
						setState(354);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(355);
						match(PIPE_STMT);
						setState(356);
						match(IDENTIFIER_STMT);
						setState(369);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(357);
							match(LPAREN_STMT);
							setState(366);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 202014721L) != 0)) {
								{
								setState(358);
								stmt_or_expr(0);
								setState(363);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA_STMT) {
									{
									{
									setState(359);
									match(COMMA_STMT);
									setState(360);
									stmt_or_expr(0);
									}
									}
									setState(365);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
							}

							setState(368);
							match(RPAREN_STMT);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_primaryContext extends ParserRuleContext {
		public Stmt_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_primary; }
	 
		public Stmt_primaryContext() { }
		public void copyFrom(Stmt_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtNumberContext extends Stmt_primaryContext {
		public TerminalNode NUMBER_STMT() { return getToken(HtmlCssParser.NUMBER_STMT, 0); }
		public StmtNumberContext(Stmt_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtStringContext extends Stmt_primaryContext {
		public TerminalNode STRING_STMT() { return getToken(HtmlCssParser.STRING_STMT, 0); }
		public StmtStringContext(Stmt_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtListContext extends Stmt_primaryContext {
		public Stmt_list_literalContext stmt_list_literal() {
			return getRuleContext(Stmt_list_literalContext.class,0);
		}
		public StmtListContext(Stmt_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtCallContext extends Stmt_primaryContext {
		public Stmt_callContext stmt_call() {
			return getRuleContext(Stmt_callContext.class,0);
		}
		public StmtCallContext(Stmt_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIdentifierContext extends Stmt_primaryContext {
		public List<TerminalNode> IDENTIFIER_STMT() { return getTokens(HtmlCssParser.IDENTIFIER_STMT); }
		public TerminalNode IDENTIFIER_STMT(int i) {
			return getToken(HtmlCssParser.IDENTIFIER_STMT, i);
		}
		public List<TerminalNode> DOT_STMT() { return getTokens(HtmlCssParser.DOT_STMT); }
		public TerminalNode DOT_STMT(int i) {
			return getToken(HtmlCssParser.DOT_STMT, i);
		}
		public StmtIdentifierContext(Stmt_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_primaryContext stmt_primary() throws RecognitionException {
		Stmt_primaryContext _localctx = new Stmt_primaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stmt_primary);
		try {
			int _alt;
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new StmtIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(IDENTIFIER_STMT);
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(377);
						match(DOT_STMT);
						setState(378);
						match(IDENTIFIER_STMT);
						}
						} 
					}
					setState(383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new StmtNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(NUMBER_STMT);
				}
				break;
			case 3:
				_localctx = new StmtStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(STRING_STMT);
				}
				break;
			case 4:
				_localctx = new StmtListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				stmt_list_literal();
				}
				break;
			case 5:
				_localctx = new StmtCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				stmt_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_list_literalContext extends ParserRuleContext {
		public Stmt_list_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list_literal; }
	 
		public Stmt_list_literalContext() { }
		public void copyFrom(Stmt_list_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtListLiteralContext extends Stmt_list_literalContext {
		public TerminalNode LBRACKET_STMT() { return getToken(HtmlCssParser.LBRACKET_STMT, 0); }
		public TerminalNode RBRACKET_STMT() { return getToken(HtmlCssParser.RBRACKET_STMT, 0); }
		public List<Stmt_or_exprContext> stmt_or_expr() {
			return getRuleContexts(Stmt_or_exprContext.class);
		}
		public Stmt_or_exprContext stmt_or_expr(int i) {
			return getRuleContext(Stmt_or_exprContext.class,i);
		}
		public List<TerminalNode> COMMA_STMT() { return getTokens(HtmlCssParser.COMMA_STMT); }
		public TerminalNode COMMA_STMT(int i) {
			return getToken(HtmlCssParser.COMMA_STMT, i);
		}
		public StmtListLiteralContext(Stmt_list_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_list_literalContext stmt_list_literal() throws RecognitionException {
		Stmt_list_literalContext _localctx = new Stmt_list_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stmt_list_literal);
		int _la;
		try {
			_localctx = new StmtListLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(LBRACKET_STMT);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 202014721L) != 0)) {
				{
				setState(391);
				stmt_or_expr(0);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_STMT) {
					{
					{
					setState(392);
					match(COMMA_STMT);
					setState(393);
					stmt_or_expr(0);
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(401);
			match(RBRACKET_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_callContext extends ParserRuleContext {
		public Stmt_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_call; }
	 
		public Stmt_callContext() { }
		public void copyFrom(Stmt_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtFunctionCallContext extends Stmt_callContext {
		public TerminalNode IDENTIFIER_STMT() { return getToken(HtmlCssParser.IDENTIFIER_STMT, 0); }
		public TerminalNode LPAREN_STMT() { return getToken(HtmlCssParser.LPAREN_STMT, 0); }
		public TerminalNode RPAREN_STMT() { return getToken(HtmlCssParser.RPAREN_STMT, 0); }
		public List<Stmt_or_exprContext> stmt_or_expr() {
			return getRuleContexts(Stmt_or_exprContext.class);
		}
		public Stmt_or_exprContext stmt_or_expr(int i) {
			return getRuleContext(Stmt_or_exprContext.class,i);
		}
		public List<TerminalNode> COMMA_STMT() { return getTokens(HtmlCssParser.COMMA_STMT); }
		public TerminalNode COMMA_STMT(int i) {
			return getToken(HtmlCssParser.COMMA_STMT, i);
		}
		public StmtFunctionCallContext(Stmt_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStmtFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStmtFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStmtFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_callContext stmt_call() throws RecognitionException {
		Stmt_callContext _localctx = new Stmt_callContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_stmt_call);
		int _la;
		try {
			_localctx = new StmtFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(IDENTIFIER_STMT);
			setState(404);
			match(LPAREN_STMT);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 202014721L) != 0)) {
				{
				setState(405);
				stmt_or_expr(0);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_STMT) {
					{
					{
					setState(406);
					match(COMMA_STMT);
					setState(407);
					stmt_or_expr(0);
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(415);
			match(RPAREN_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_op_stmtContext extends ParserRuleContext {
		public Bin_op_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op_stmt; }
	 
		public Bin_op_stmtContext() { }
		public void copyFrom(Bin_op_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtStarContext extends Bin_op_stmtContext {
		public TerminalNode STAR_STMT() { return getToken(HtmlCssParser.STAR_STMT, 0); }
		public BinOpStmtStarContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtLteContext extends Bin_op_stmtContext {
		public TerminalNode LTE_STMT() { return getToken(HtmlCssParser.LTE_STMT, 0); }
		public BinOpStmtLteContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtLte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtLte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtLte(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtFloorDivContext extends Bin_op_stmtContext {
		public TerminalNode FLOORDIV_STMT() { return getToken(HtmlCssParser.FLOORDIV_STMT, 0); }
		public BinOpStmtFloorDivContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtFloorDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtFloorDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtFloorDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtGteContext extends Bin_op_stmtContext {
		public TerminalNode GTE_STMT() { return getToken(HtmlCssParser.GTE_STMT, 0); }
		public BinOpStmtGteContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtGte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtGte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtGte(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtNeqContext extends Bin_op_stmtContext {
		public TerminalNode NEQ_STMT() { return getToken(HtmlCssParser.NEQ_STMT, 0); }
		public BinOpStmtNeqContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtNeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtNeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtSlashContext extends Bin_op_stmtContext {
		public TerminalNode SLASH_STMT() { return getToken(HtmlCssParser.SLASH_STMT, 0); }
		public BinOpStmtSlashContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtPlusContext extends Bin_op_stmtContext {
		public TerminalNode PLUS_STMT() { return getToken(HtmlCssParser.PLUS_STMT, 0); }
		public BinOpStmtPlusContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtMinusContext extends Bin_op_stmtContext {
		public TerminalNode MINUS_STMT() { return getToken(HtmlCssParser.MINUS_STMT, 0); }
		public BinOpStmtMinusContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtPercentContext extends Bin_op_stmtContext {
		public TerminalNode PERCENT_STMT() { return getToken(HtmlCssParser.PERCENT_STMT, 0); }
		public BinOpStmtPercentContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtPercent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtInContext extends Bin_op_stmtContext {
		public TerminalNode IN_STMT() { return getToken(HtmlCssParser.IN_STMT, 0); }
		public BinOpStmtInContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtIn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtLtContext extends Bin_op_stmtContext {
		public TerminalNode LT_STMT() { return getToken(HtmlCssParser.LT_STMT, 0); }
		public BinOpStmtLtContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtEqContext extends Bin_op_stmtContext {
		public TerminalNode EQ_STMT() { return getToken(HtmlCssParser.EQ_STMT, 0); }
		public BinOpStmtEqContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpStmtGtContext extends Bin_op_stmtContext {
		public TerminalNode GT_STMT() { return getToken(HtmlCssParser.GT_STMT, 0); }
		public BinOpStmtGtContext(Bin_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBinOpStmtGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBinOpStmtGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBinOpStmtGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_op_stmtContext bin_op_stmt() throws RecognitionException {
		Bin_op_stmtContext _localctx = new Bin_op_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bin_op_stmt);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_STMT:
				_localctx = new BinOpStmtPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(PLUS_STMT);
				}
				break;
			case MINUS_STMT:
				_localctx = new BinOpStmtMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(MINUS_STMT);
				}
				break;
			case STAR_STMT:
				_localctx = new BinOpStmtStarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(STAR_STMT);
				}
				break;
			case SLASH_STMT:
				_localctx = new BinOpStmtSlashContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				match(SLASH_STMT);
				}
				break;
			case PERCENT_STMT:
				_localctx = new BinOpStmtPercentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				match(PERCENT_STMT);
				}
				break;
			case FLOORDIV_STMT:
				_localctx = new BinOpStmtFloorDivContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
				match(FLOORDIV_STMT);
				}
				break;
			case EQ_STMT:
				_localctx = new BinOpStmtEqContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(423);
				match(EQ_STMT);
				}
				break;
			case NEQ_STMT:
				_localctx = new BinOpStmtNeqContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(424);
				match(NEQ_STMT);
				}
				break;
			case LT_STMT:
				_localctx = new BinOpStmtLtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(425);
				match(LT_STMT);
				}
				break;
			case GT_STMT:
				_localctx = new BinOpStmtGtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(426);
				match(GT_STMT);
				}
				break;
			case LTE_STMT:
				_localctx = new BinOpStmtLteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(427);
				match(LTE_STMT);
				}
				break;
			case GTE_STMT:
				_localctx = new BinOpStmtGteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(428);
				match(GTE_STMT);
				}
				break;
			case IN_STMT:
				_localctx = new BinOpStmtInContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(429);
				match(IN_STMT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_op_stmtContext extends ParserRuleContext {
		public Logical_op_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op_stmt; }
	 
		public Logical_op_stmtContext() { }
		public void copyFrom(Logical_op_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOpStmtOrContext extends Logical_op_stmtContext {
		public TerminalNode OR_STMT() { return getToken(HtmlCssParser.OR_STMT, 0); }
		public LogicalOpStmtOrContext(Logical_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterLogicalOpStmtOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitLogicalOpStmtOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitLogicalOpStmtOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOpStmtAndContext extends Logical_op_stmtContext {
		public TerminalNode AND_STMT() { return getToken(HtmlCssParser.AND_STMT, 0); }
		public LogicalOpStmtAndContext(Logical_op_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterLogicalOpStmtAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitLogicalOpStmtAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitLogicalOpStmtAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_op_stmtContext logical_op_stmt() throws RecognitionException {
		Logical_op_stmtContext _localctx = new Logical_op_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logical_op_stmt);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND_STMT:
				_localctx = new LogicalOpStmtAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(AND_STMT);
				}
				break;
			case OR_STMT:
				_localctx = new LogicalOpStmtOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(OR_STMT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_for_blockContext extends ParserRuleContext {
		public Jinja_for_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_for_block; }
	 
		public Jinja_for_blockContext() { }
		public void copyFrom(Jinja_for_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForBlockContext extends Jinja_for_blockContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode FOR() { return getToken(HtmlCssParser.FOR, 0); }
		public TerminalNode IDENTIFIER_STMT() { return getToken(HtmlCssParser.IDENTIFIER_STMT, 0); }
		public TerminalNode IN_STMT() { return getToken(HtmlCssParser.IN_STMT, 0); }
		public List<Stmt_exprContext> stmt_expr() {
			return getRuleContexts(Stmt_exprContext.class);
		}
		public Stmt_exprContext stmt_expr(int i) {
			return getRuleContext(Stmt_exprContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(HtmlCssParser.ENDFOR, 0); }
		public TerminalNode IF() { return getToken(HtmlCssParser.IF, 0); }
		public JinjaForBlockContext(Jinja_for_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_for_blockContext jinja_for_block() throws RecognitionException {
		Jinja_for_blockContext _localctx = new Jinja_for_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jinja_for_block);
		int _la;
		try {
			_localctx = new JinjaForBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(JINJA_STMT_START);
			setState(437);
			match(FOR);
			setState(438);
			match(IDENTIFIER_STMT);
			setState(439);
			match(IN_STMT);
			setState(440);
			stmt_expr();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(441);
				match(IF);
				setState(442);
				stmt_expr();
				}
			}

			setState(445);
			match(JINJA_STMT_END);
			setState(446);
			content();
			setState(447);
			match(JINJA_STMT_START);
			setState(448);
			match(ENDFOR);
			setState(449);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_block_blockContext extends ParserRuleContext {
		public Jinja_block_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_block_block; }
	 
		public Jinja_block_blockContext() { }
		public void copyFrom(Jinja_block_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockBlockContext extends Jinja_block_blockContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode BLOCK() { return getToken(HtmlCssParser.BLOCK, 0); }
		public TerminalNode IDENTIFIER_STMT() { return getToken(HtmlCssParser.IDENTIFIER_STMT, 0); }
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDBLOCK() { return getToken(HtmlCssParser.ENDBLOCK, 0); }
		public JinjaBlockBlockContext(Jinja_block_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaBlockBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaBlockBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaBlockBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_block_blockContext jinja_block_block() throws RecognitionException {
		Jinja_block_blockContext _localctx = new Jinja_block_blockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jinja_block_block);
		try {
			_localctx = new JinjaBlockBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(JINJA_STMT_START);
			setState(452);
			match(BLOCK);
			setState(453);
			match(IDENTIFIER_STMT);
			setState(454);
			match(JINJA_STMT_END);
			setState(455);
			content();
			setState(456);
			match(JINJA_STMT_START);
			setState(457);
			match(ENDBLOCK);
			setState(458);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_macro_blockContext extends ParserRuleContext {
		public Jinja_macro_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_macro_block; }
	 
		public Jinja_macro_blockContext() { }
		public void copyFrom(Jinja_macro_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaMacroBlockContext extends Jinja_macro_blockContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode MACRO() { return getToken(HtmlCssParser.MACRO, 0); }
		public List<TerminalNode> IDENTIFIER_STMT() { return getTokens(HtmlCssParser.IDENTIFIER_STMT); }
		public TerminalNode IDENTIFIER_STMT(int i) {
			return getToken(HtmlCssParser.IDENTIFIER_STMT, i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDMACRO() { return getToken(HtmlCssParser.ENDMACRO, 0); }
		public TerminalNode LPAREN_STMT() { return getToken(HtmlCssParser.LPAREN_STMT, 0); }
		public TerminalNode RPAREN_STMT() { return getToken(HtmlCssParser.RPAREN_STMT, 0); }
		public List<TerminalNode> COMMA_STMT() { return getTokens(HtmlCssParser.COMMA_STMT); }
		public TerminalNode COMMA_STMT(int i) {
			return getToken(HtmlCssParser.COMMA_STMT, i);
		}
		public JinjaMacroBlockContext(Jinja_macro_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaMacroBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaMacroBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaMacroBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_macro_blockContext jinja_macro_block() throws RecognitionException {
		Jinja_macro_blockContext _localctx = new Jinja_macro_blockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_jinja_macro_block);
		int _la;
		try {
			_localctx = new JinjaMacroBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(JINJA_STMT_START);
			setState(461);
			match(MACRO);
			setState(462);
			match(IDENTIFIER_STMT);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN_STMT) {
				{
				setState(463);
				match(LPAREN_STMT);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_STMT) {
					{
					setState(464);
					match(IDENTIFIER_STMT);
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA_STMT) {
						{
						{
						setState(465);
						match(COMMA_STMT);
						setState(466);
						match(IDENTIFIER_STMT);
						}
						}
						setState(471);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(474);
				match(RPAREN_STMT);
				}
			}

			setState(477);
			match(JINJA_STMT_END);
			setState(478);
			content();
			setState(479);
			match(JINJA_STMT_START);
			setState(480);
			match(ENDMACRO);
			setState(481);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_include_stmtContext extends ParserRuleContext {
		public Jinja_include_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_include_stmt; }
	 
		public Jinja_include_stmtContext() { }
		public void copyFrom(Jinja_include_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIncludeContext extends Jinja_include_stmtContext {
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlCssParser.JINJA_STMT_START, 0); }
		public TerminalNode INCLUDE() { return getToken(HtmlCssParser.INCLUDE, 0); }
		public TerminalNode STRING_STMT() { return getToken(HtmlCssParser.STRING_STMT, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(HtmlCssParser.JINJA_STMT_END, 0); }
		public JinjaIncludeContext(Jinja_include_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_include_stmtContext jinja_include_stmt() throws RecognitionException {
		Jinja_include_stmtContext _localctx = new Jinja_include_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_jinja_include_stmt);
		try {
			_localctx = new JinjaIncludeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(JINJA_STMT_START);
			setState(484);
			match(INCLUDE);
			setState(485);
			match(STRING_STMT);
			setState(486);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_set_blockContext extends ParserRuleContext {
		public Jinja_set_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_set_block; }
	 
		public Jinja_set_blockContext() { }
		public void copyFrom(Jinja_set_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSetBlockContext extends Jinja_set_blockContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode SET() { return getToken(HtmlCssParser.SET, 0); }
		public TerminalNode IDENTIFIER_STMT() { return getToken(HtmlCssParser.IDENTIFIER_STMT, 0); }
		public TerminalNode EQ_STMT() { return getToken(HtmlCssParser.EQ_STMT, 0); }
		public Stmt_exprContext stmt_expr() {
			return getRuleContext(Stmt_exprContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDSET() { return getToken(HtmlCssParser.ENDSET, 0); }
		public JinjaSetBlockContext(Jinja_set_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaSetBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaSetBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaSetBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_set_blockContext jinja_set_block() throws RecognitionException {
		Jinja_set_blockContext _localctx = new Jinja_set_blockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_jinja_set_block);
		try {
			_localctx = new JinjaSetBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(JINJA_STMT_START);
			setState(489);
			match(SET);
			setState(490);
			match(IDENTIFIER_STMT);
			setState(491);
			match(EQ_STMT);
			setState(492);
			stmt_expr();
			setState(493);
			match(JINJA_STMT_END);
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(494);
				content();
				setState(495);
				match(JINJA_STMT_START);
				setState(496);
				match(ENDSET);
				setState(497);
				match(JINJA_STMT_END);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_filter_blockContext extends ParserRuleContext {
		public Jinja_filter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_filter_block; }
	 
		public Jinja_filter_blockContext() { }
		public void copyFrom(Jinja_filter_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFilterBlockContext extends Jinja_filter_blockContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode FILTER() { return getToken(HtmlCssParser.FILTER, 0); }
		public TerminalNode IDENTIFIER_STMT() { return getToken(HtmlCssParser.IDENTIFIER_STMT, 0); }
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDFILTER() { return getToken(HtmlCssParser.ENDFILTER, 0); }
		public JinjaFilterBlockContext(Jinja_filter_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaFilterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaFilterBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaFilterBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_filter_blockContext jinja_filter_block() throws RecognitionException {
		Jinja_filter_blockContext _localctx = new Jinja_filter_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_jinja_filter_block);
		try {
			_localctx = new JinjaFilterBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(JINJA_STMT_START);
			setState(502);
			match(FILTER);
			setState(503);
			match(IDENTIFIER_STMT);
			setState(504);
			match(JINJA_STMT_END);
			setState(505);
			content();
			setState(506);
			match(JINJA_STMT_START);
			setState(507);
			match(ENDFILTER);
			setState(508);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_call_blockContext extends ParserRuleContext {
		public Jinja_call_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_call_block; }
	 
		public Jinja_call_blockContext() { }
		public void copyFrom(Jinja_call_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCallBlockContext extends Jinja_call_blockContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode CALL() { return getToken(HtmlCssParser.CALL, 0); }
		public TerminalNode IDENTIFIER_STMT() { return getToken(HtmlCssParser.IDENTIFIER_STMT, 0); }
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDCALL() { return getToken(HtmlCssParser.ENDCALL, 0); }
		public TerminalNode LPAREN_STMT() { return getToken(HtmlCssParser.LPAREN_STMT, 0); }
		public TerminalNode RPAREN_STMT() { return getToken(HtmlCssParser.RPAREN_STMT, 0); }
		public List<Stmt_or_exprContext> stmt_or_expr() {
			return getRuleContexts(Stmt_or_exprContext.class);
		}
		public Stmt_or_exprContext stmt_or_expr(int i) {
			return getRuleContext(Stmt_or_exprContext.class,i);
		}
		public List<TerminalNode> COMMA_STMT() { return getTokens(HtmlCssParser.COMMA_STMT); }
		public TerminalNode COMMA_STMT(int i) {
			return getToken(HtmlCssParser.COMMA_STMT, i);
		}
		public JinjaCallBlockContext(Jinja_call_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinjaCallBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinjaCallBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinjaCallBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_call_blockContext jinja_call_block() throws RecognitionException {
		Jinja_call_blockContext _localctx = new Jinja_call_blockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_jinja_call_block);
		int _la;
		try {
			_localctx = new JinjaCallBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(JINJA_STMT_START);
			setState(511);
			match(CALL);
			setState(512);
			match(IDENTIFIER_STMT);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN_STMT) {
				{
				setState(513);
				match(LPAREN_STMT);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 202014721L) != 0)) {
					{
					setState(514);
					stmt_or_expr(0);
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA_STMT) {
						{
						{
						setState(515);
						match(COMMA_STMT);
						setState(516);
						stmt_or_expr(0);
						}
						}
						setState(521);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(524);
				match(RPAREN_STMT);
				}
			}

			setState(527);
			match(JINJA_STMT_END);
			setState(528);
			content();
			setState(529);
			match(JINJA_STMT_START);
			setState(530);
			match(ENDCALL);
			setState(531);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Style_elementContext extends ParserRuleContext {
		public Style_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_element; }
	 
		public Style_elementContext() { }
		public void copyFrom(Style_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleBlockContext extends Style_elementContext {
		public TerminalNode STYLE_OPEN() { return getToken(HtmlCssParser.STYLE_OPEN, 0); }
		public Css_rulesContext css_rules() {
			return getRuleContext(Css_rulesContext.class,0);
		}
		public TerminalNode STYLE_CLOSE_CSS() { return getToken(HtmlCssParser.STYLE_CLOSE_CSS, 0); }
		public StyleBlockContext(Style_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStyleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStyleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStyleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_elementContext style_element() throws RecognitionException {
		Style_elementContext _localctx = new Style_elementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_style_element);
		try {
			_localctx = new StyleBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(STYLE_OPEN);
			setState(534);
			css_rules();
			setState(535);
			match(STYLE_CLOSE_CSS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_rulesContext extends ParserRuleContext {
		public Css_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_rules; }
	 
		public Css_rulesContext() { }
		public void copyFrom(Css_rulesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRulesListContext extends Css_rulesContext {
		public List<Css_ruleContext> css_rule() {
			return getRuleContexts(Css_ruleContext.class);
		}
		public Css_ruleContext css_rule(int i) {
			return getRuleContext(Css_ruleContext.class,i);
		}
		public CssRulesListContext(Css_rulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCssRulesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCssRulesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCssRulesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_rulesContext css_rules() throws RecognitionException {
		Css_rulesContext _localctx = new Css_rulesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_css_rules);
		int _la;
		try {
			_localctx = new CssRulesListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 33329L) != 0)) {
				{
				{
				setState(537);
				css_rule();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_ruleContext extends ParserRuleContext {
		public Css_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_rule; }
	 
		public Css_ruleContext() { }
		public void copyFrom(Css_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RootRuleContext extends Css_ruleContext {
		public TerminalNode ROOT() { return getToken(HtmlCssParser.ROOT, 0); }
		public TerminalNode LBRACE_CSS() { return getToken(HtmlCssParser.LBRACE_CSS, 0); }
		public Css_bodyContext css_body() {
			return getRuleContext(Css_bodyContext.class,0);
		}
		public TerminalNode RBRACE_CSS() { return getToken(HtmlCssParser.RBRACE_CSS, 0); }
		public RootRuleContext(Css_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterRootRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitRootRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitRootRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorRuleContext extends Css_ruleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE_CSS() { return getToken(HtmlCssParser.LBRACE_CSS, 0); }
		public Css_bodyContext css_body() {
			return getRuleContext(Css_bodyContext.class,0);
		}
		public TerminalNode RBRACE_CSS() { return getToken(HtmlCssParser.RBRACE_CSS, 0); }
		public SelectorRuleContext(Css_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSelectorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSelectorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSelectorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_ruleContext css_rule() throws RecognitionException {
		Css_ruleContext _localctx = new Css_ruleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_css_rule);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROOT:
				_localctx = new RootRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(ROOT);
				setState(544);
				match(LBRACE_CSS);
				setState(545);
				css_body();
				setState(546);
				match(RBRACE_CSS);
				}
				break;
			case COLON_CSS:
			case DOTCSS:
			case HASH:
			case IDENT:
				_localctx = new SelectorRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				selector();
				setState(549);
				match(LBRACE_CSS);
				setState(550);
				css_body();
				setState(551);
				match(RBRACE_CSS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorGroupContext extends SelectorContext {
		public List<Selector_partContext> selector_part() {
			return getRuleContexts(Selector_partContext.class);
		}
		public Selector_partContext selector_part(int i) {
			return getRuleContext(Selector_partContext.class,i);
		}
		public List<TerminalNode> COMMA_CSS() { return getTokens(HtmlCssParser.COMMA_CSS); }
		public TerminalNode COMMA_CSS(int i) {
			return getToken(HtmlCssParser.COMMA_CSS, i);
		}
		public SelectorGroupContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_selector);
		int _la;
		try {
			_localctx = new SelectorGroupContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			selector_part();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_CSS) {
				{
				{
				setState(556);
				match(COMMA_CSS);
				setState(557);
				selector_part();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Selector_partContext extends ParserRuleContext {
		public Selector_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_part; }
	 
		public Selector_partContext() { }
		public void copyFrom(Selector_partContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorSequenceContext extends Selector_partContext {
		public List<Simple_selectorContext> simple_selector() {
			return getRuleContexts(Simple_selectorContext.class);
		}
		public Simple_selectorContext simple_selector(int i) {
			return getRuleContext(Simple_selectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorSequenceContext(Selector_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSelectorSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSelectorSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSelectorSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_partContext selector_part() throws RecognitionException {
		Selector_partContext _localctx = new Selector_partContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_selector_part);
		int _la;
		try {
			_localctx = new SelectorSequenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			simple_selector();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 33265L) != 0)) {
				{
				setState(568);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON_CSS:
				case DOTCSS:
				case HASH:
				case IDENT:
					{
					setState(564);
					simple_selector();
					}
					break;
				case GTCSS:
				case PLUSCSS:
				case TILDECSS:
					{
					setState(565);
					combinator();
					setState(566);
					simple_selector();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorContext extends ParserRuleContext {
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	 
		public CombinatorContext() { }
		public void copyFrom(CombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdjacentSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode PLUSCSS() { return getToken(HtmlCssParser.PLUSCSS, 0); }
		public AdjacentSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterAdjacentSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitAdjacentSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitAdjacentSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildCombinatorContext extends CombinatorContext {
		public TerminalNode GTCSS() { return getToken(HtmlCssParser.GTCSS, 0); }
		public ChildCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterChildCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitChildCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitChildCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneralSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode TILDECSS() { return getToken(HtmlCssParser.TILDECSS, 0); }
		public GeneralSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterGeneralSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitGeneralSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitGeneralSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_combinator);
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GTCSS:
				_localctx = new ChildCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(GTCSS);
				}
				break;
			case PLUSCSS:
				_localctx = new AdjacentSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(PLUSCSS);
				}
				break;
			case TILDECSS:
				_localctx = new GeneralSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				match(TILDECSS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_selectorContext extends ParserRuleContext {
		public Simple_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_selector; }
	 
		public Simple_selectorContext() { }
		public void copyFrom(Simple_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends Simple_selectorContext {
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public TypeSelectorContext(Simple_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexSimpleSelectorContext extends Simple_selectorContext {
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public List<Class_selectorContext> class_selector() {
			return getRuleContexts(Class_selectorContext.class);
		}
		public Class_selectorContext class_selector(int i) {
			return getRuleContext(Class_selectorContext.class,i);
		}
		public List<Id_selectorContext> id_selector() {
			return getRuleContexts(Id_selectorContext.class);
		}
		public Id_selectorContext id_selector(int i) {
			return getRuleContext(Id_selectorContext.class,i);
		}
		public List<Pseudo_selectorContext> pseudo_selector() {
			return getRuleContexts(Pseudo_selectorContext.class);
		}
		public Pseudo_selectorContext pseudo_selector(int i) {
			return getRuleContext(Pseudo_selectorContext.class,i);
		}
		public ComplexSimpleSelectorContext(Simple_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterComplexSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitComplexSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitComplexSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_selectorContext simple_selector() throws RecognitionException {
		Simple_selectorContext _localctx = new Simple_selectorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_simple_selector);
		int _la;
		try {
			int _alt;
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new ComplexSimpleSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(578);
					match(IDENT);
					}
				}

				setState(584); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(584);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOTCSS:
							{
							setState(581);
							class_selector();
							}
							break;
						case HASH:
							{
							setState(582);
							id_selector();
							}
							break;
						case COLON_CSS:
							{
							setState(583);
							pseudo_selector();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(586); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new TypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(IDENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_selectorContext extends ParserRuleContext {
		public Class_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_selector; }
	 
		public Class_selectorContext() { }
		public void copyFrom(Class_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends Class_selectorContext {
		public TerminalNode DOTCSS() { return getToken(HtmlCssParser.DOTCSS, 0); }
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public ClassSelectorContext(Class_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_selectorContext class_selector() throws RecognitionException {
		Class_selectorContext _localctx = new Class_selectorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_class_selector);
		try {
			_localctx = new ClassSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(DOTCSS);
			setState(592);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_selectorContext extends ParserRuleContext {
		public Id_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_selector; }
	 
		public Id_selectorContext() { }
		public void copyFrom(Id_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends Id_selectorContext {
		public TerminalNode HASH() { return getToken(HtmlCssParser.HASH, 0); }
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public IdSelectorContext(Id_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_selectorContext id_selector() throws RecognitionException {
		Id_selectorContext _localctx = new Id_selectorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_id_selector);
		try {
			_localctx = new IdSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(HASH);
			setState(595);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pseudo_selectorContext extends ParserRuleContext {
		public Pseudo_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo_selector; }
	 
		public Pseudo_selectorContext() { }
		public void copyFrom(Pseudo_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassSelectorContext extends Pseudo_selectorContext {
		public TerminalNode COLON_CSS() { return getToken(HtmlCssParser.COLON_CSS, 0); }
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public PseudoClassSelectorContext(Pseudo_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterPseudoClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitPseudoClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitPseudoClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pseudo_selectorContext pseudo_selector() throws RecognitionException {
		Pseudo_selectorContext _localctx = new Pseudo_selectorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pseudo_selector);
		try {
			_localctx = new PseudoClassSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(COLON_CSS);
			setState(598);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_bodyContext extends ParserRuleContext {
		public Css_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_body; }
	 
		public Css_bodyContext() { }
		public void copyFrom(Css_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBodyContext extends Css_bodyContext {
		public List<Css_declContext> css_decl() {
			return getRuleContexts(Css_declContext.class);
		}
		public Css_declContext css_decl(int i) {
			return getRuleContext(Css_declContext.class,i);
		}
		public CssBodyContext(Css_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCssBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCssBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCssBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_bodyContext css_body() throws RecognitionException {
		Css_bodyContext _localctx = new Css_bodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_css_body);
		int _la;
		try {
			_localctx = new CssBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_VAR || _la==IDENT) {
				{
				{
				setState(600);
				css_decl();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_declContext extends ParserRuleContext {
		public Css_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_decl; }
	 
		public Css_declContext() { }
		public void copyFrom(Css_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyDeclarationContext extends Css_declContext {
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public TerminalNode COLON_CSS() { return getToken(HtmlCssParser.COLON_CSS, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public TerminalNode SEMI_CSS() { return getToken(HtmlCssParser.SEMI_CSS, 0); }
		public CssPropertyDeclarationContext(Css_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCssPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCssPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCssPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssVariableDeclarationContext extends Css_declContext {
		public TerminalNode CSS_VAR() { return getToken(HtmlCssParser.CSS_VAR, 0); }
		public TerminalNode COLON_CSS() { return getToken(HtmlCssParser.COLON_CSS, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public TerminalNode SEMI_CSS() { return getToken(HtmlCssParser.SEMI_CSS, 0); }
		public CssVariableDeclarationContext(Css_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCssVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCssVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCssVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_declContext css_decl() throws RecognitionException {
		Css_declContext _localctx = new Css_declContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_css_decl);
		int _la;
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_VAR:
				_localctx = new CssVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(CSS_VAR);
				setState(607);
				match(COLON_CSS);
				setState(608);
				css_value();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_CSS) {
					{
					setState(609);
					match(SEMI_CSS);
					}
				}

				}
				break;
			case IDENT:
				_localctx = new CssPropertyDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(IDENT);
				setState(613);
				match(COLON_CSS);
				setState(614);
				css_value();
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_CSS) {
					{
					setState(615);
					match(SEMI_CSS);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_valueContext extends ParserRuleContext {
		public Css_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_value; }
	 
		public Css_valueContext() { }
		public void copyFrom(Css_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueSequenceContext extends Css_valueContext {
		public List<Css_value_atomContext> css_value_atom() {
			return getRuleContexts(Css_value_atomContext.class);
		}
		public Css_value_atomContext css_value_atom(int i) {
			return getRuleContext(Css_value_atomContext.class,i);
		}
		public CssValueSequenceContext(Css_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCssValueSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCssValueSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCssValueSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_css_value);
		try {
			int _alt;
			_localctx = new CssValueSequenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(621); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(620);
					css_value_atom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(623); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_value_atomContext extends ParserRuleContext {
		public Css_value_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_value_atom; }
	 
		public Css_value_atomContext() { }
		public void copyFrom(Css_value_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallValueContext extends Css_value_atomContext {
		public Function_call2Context function_call2() {
			return getRuleContext(Function_call2Context.class,0);
		}
		public FunctionCallValueContext(Css_value_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterFunctionCallValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitFunctionCallValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitFunctionCallValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends Css_value_atomContext {
		public TerminalNode STRING_CSS() { return getToken(HtmlCssParser.STRING_CSS, 0); }
		public StringValueContext(Css_value_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PercentValueContext extends Css_value_atomContext {
		public TerminalNode PERCENTCsd() { return getToken(HtmlCssParser.PERCENTCsd, 0); }
		public PercentValueContext(Css_value_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterPercentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitPercentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitPercentValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexColorValueContext extends Css_value_atomContext {
		public TerminalNode HEX_COLOR() { return getToken(HtmlCssParser.HEX_COLOR, 0); }
		public HexColorValueContext(Css_value_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterHexColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitHexColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitHexColorValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaSeparatorContext extends Css_value_atomContext {
		public TerminalNode COMMA_CSS() { return getToken(HtmlCssParser.COMMA_CSS, 0); }
		public CommaSeparatorContext(Css_value_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCommaSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCommaSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCommaSeparator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferenceContext extends Css_value_atomContext {
		public TerminalNode CSS_VAR() { return getToken(HtmlCssParser.CSS_VAR, 0); }
		public VariableReferenceContext(Css_value_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentValueContext extends Css_value_atomContext {
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public IdentValueContext(Css_value_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterIdentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitIdentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitIdentValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberValueContext extends Css_value_atomContext {
		public TerminalNode NUMBERCSS() { return getToken(HtmlCssParser.NUMBERCSS, 0); }
		public NumberValueContext(Css_value_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_value_atomContext css_value_atom() throws RecognitionException {
		Css_value_atomContext _localctx = new Css_value_atomContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_css_value_atom);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new IdentValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(IDENT);
				}
				break;
			case 2:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(NUMBERCSS);
				}
				break;
			case 3:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				match(STRING_CSS);
				}
				break;
			case 4:
				_localctx = new HexColorValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				match(HEX_COLOR);
				}
				break;
			case 5:
				_localctx = new VariableReferenceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(629);
				match(CSS_VAR);
				}
				break;
			case 6:
				_localctx = new PercentValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(630);
				match(PERCENTCsd);
				}
				break;
			case 7:
				_localctx = new CommaSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(631);
				match(COMMA_CSS);
				}
				break;
			case 8:
				_localctx = new FunctionCallValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(632);
				function_call2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call2Context extends ParserRuleContext {
		public Function_call2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call2; }
	 
		public Function_call2Context() { }
		public void copyFrom(Function_call2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionCallContext extends Function_call2Context {
		public TerminalNode LPAREN_CSS() { return getToken(HtmlCssParser.LPAREN_CSS, 0); }
		public TerminalNode RPAREN_CSS() { return getToken(HtmlCssParser.RPAREN_CSS, 0); }
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public TerminalNode VAR_FUNC() { return getToken(HtmlCssParser.VAR_FUNC, 0); }
		public TerminalNode RGBA_FUNC() { return getToken(HtmlCssParser.RGBA_FUNC, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public CssFunctionCallContext(Function_call2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCssFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCssFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCssFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call2Context function_call2() throws RecognitionException {
		Function_call2Context _localctx = new Function_call2Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_function_call2);
		int _la;
		try {
			_localctx = new CssFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(636);
			match(LPAREN_CSS);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 258817L) != 0)) {
				{
				setState(637);
				css_value();
				}
			}

			setState(640);
			match(RPAREN_CSS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return or_expr_sempred((Or_exprContext)_localctx, predIndex);
		case 9:
			return and_expr_sempred((And_exprContext)_localctx, predIndex);
		case 10:
			return equality_expr_sempred((Equality_exprContext)_localctx, predIndex);
		case 11:
			return additive_expr_sempred((Additive_exprContext)_localctx, predIndex);
		case 12:
			return multiplicative_expr_sempred((Multiplicative_exprContext)_localctx, predIndex);
		case 23:
			return stmt_or_expr_sempred((Stmt_or_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean or_expr_sempred(Or_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean and_expr_sempred(And_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_expr_sempred(Equality_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_expr_sempred(Additive_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_expr_sempred(Multiplicative_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean stmt_or_expr_sempred(Stmt_or_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001t\u0283\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0005\u0000h\b\u0000\n\u0000\f\u0000k\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001|\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u0080\b\u0002\n\u0002\f\u0002\u0083\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004\u008a\b\u0004"+
		"\n\u0004\f\u0004\u008d\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u009d\b\b\n\b\f\b\u00a0\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a8\b\t\n\t\f\t\u00ab"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b3\b\n"+
		"\n\n\f\n\u00b6\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00be\b\u000b\n\u000b\f\u000b\u00c1\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c9\b\f\n\f"+
		"\f\f\u00cc\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00d5\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e0"+
		"\b\u000f\n\u000f\f\u000f\u00e3\t\u000f\u0003\u000f\u00e5\b\u000f\u0001"+
		"\u000f\u0003\u000f\u00e8\b\u000f\u0005\u000f\u00ea\b\u000f\n\u000f\f\u000f"+
		"\u00ed\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00f2\b"+
		"\u0010\n\u0010\f\u0010\u00f5\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00fe\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0105\b\u0011\n\u0011\f\u0011\u0108\t\u0011\u0003\u0011\u010a\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0114\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u011a\b\u0013\n\u0013\f\u0013\u011d"+
		"\t\u0013\u0003\u0013\u011f\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0133\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0140\b\u0015"+
		"\n\u0015\f\u0015\u0143\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0149\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0159"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u016a\b\u0017\n"+
		"\u0017\f\u0017\u016d\t\u0017\u0003\u0017\u016f\b\u0017\u0001\u0017\u0003"+
		"\u0017\u0172\b\u0017\u0005\u0017\u0174\b\u0017\n\u0017\f\u0017\u0177\t"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u017c\b\u0018\n"+
		"\u0018\f\u0018\u017f\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0185\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u018b\b\u0019\n\u0019\f\u0019\u018e\t\u0019\u0003\u0019"+
		"\u0190\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0199\b\u001a\n\u001a\f\u001a\u019c"+
		"\t\u001a\u0003\u001a\u019e\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01af\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u01b3\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01bc\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01d4\b\u001f\n\u001f\f\u001f\u01d7\t\u001f"+
		"\u0003\u001f\u01d9\b\u001f\u0001\u001f\u0003\u001f\u01dc\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01f4\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0005#\u0206\b#\n#\f#\u0209\t#\u0003#\u020b"+
		"\b#\u0001#\u0003#\u020e\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0005%\u021b\b%\n%\f%\u021e\t%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u022a"+
		"\b&\u0001\'\u0001\'\u0001\'\u0005\'\u022f\b\'\n\'\f\'\u0232\t\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0005(\u0239\b(\n(\f(\u023c\t(\u0001)\u0001"+
		")\u0001)\u0003)\u0241\b)\u0001*\u0003*\u0244\b*\u0001*\u0001*\u0001*\u0004"+
		"*\u0249\b*\u000b*\f*\u024a\u0001*\u0003*\u024e\b*\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0005.\u025a\b.\n."+
		"\f.\u025d\t.\u0001/\u0001/\u0001/\u0001/\u0003/\u0263\b/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u0269\b/\u0003/\u026b\b/\u00010\u00040\u026e\b"+
		"0\u000b0\f0\u026f\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u027a\b1\u00012\u00012\u00012\u00032\u027f\b2\u00012\u00012\u0001"+
		"2\u0000\u0006\u0010\u0012\u0014\u0016\u0018.3\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0004\u0002\u0000\u0015\u001a\u001e"+
		"\u001e\u0002\u0000\u000f\u0010\'\'\u0001\u0000\u0011\u0014\u0001\u0000"+
		"pr\u02c5\u0000i\u0001\u0000\u0000\u0000\u0002{\u0001\u0000\u0000\u0000"+
		"\u0004}\u0001\u0000\u0000\u0000\u0006\u0086\u0001\u0000\u0000\u0000\b"+
		"\u008b\u0001\u0000\u0000\u0000\n\u008e\u0001\u0000\u0000\u0000\f\u0090"+
		"\u0001\u0000\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u0096"+
		"\u0001\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00ac"+
		"\u0001\u0000\u0000\u0000\u0016\u00b7\u0001\u0000\u0000\u0000\u0018\u00c2"+
		"\u0001\u0000\u0000\u0000\u001a\u00d4\u0001\u0000\u0000\u0000\u001c\u00d6"+
		"\u0001\u0000\u0000\u0000\u001e\u00d8\u0001\u0000\u0000\u0000 \u00fd\u0001"+
		"\u0000\u0000\u0000\"\u00ff\u0001\u0000\u0000\u0000$\u0113\u0001\u0000"+
		"\u0000\u0000&\u0115\u0001\u0000\u0000\u0000(\u0132\u0001\u0000\u0000\u0000"+
		"*\u0134\u0001\u0000\u0000\u0000,\u014e\u0001\u0000\u0000\u0000.\u0158"+
		"\u0001\u0000\u0000\u00000\u0184\u0001\u0000\u0000\u00002\u0186\u0001\u0000"+
		"\u0000\u00004\u0193\u0001\u0000\u0000\u00006\u01ae\u0001\u0000\u0000\u0000"+
		"8\u01b2\u0001\u0000\u0000\u0000:\u01b4\u0001\u0000\u0000\u0000<\u01c3"+
		"\u0001\u0000\u0000\u0000>\u01cc\u0001\u0000\u0000\u0000@\u01e3\u0001\u0000"+
		"\u0000\u0000B\u01e8\u0001\u0000\u0000\u0000D\u01f5\u0001\u0000\u0000\u0000"+
		"F\u01fe\u0001\u0000\u0000\u0000H\u0215\u0001\u0000\u0000\u0000J\u021c"+
		"\u0001\u0000\u0000\u0000L\u0229\u0001\u0000\u0000\u0000N\u022b\u0001\u0000"+
		"\u0000\u0000P\u0233\u0001\u0000\u0000\u0000R\u0240\u0001\u0000\u0000\u0000"+
		"T\u024d\u0001\u0000\u0000\u0000V\u024f\u0001\u0000\u0000\u0000X\u0252"+
		"\u0001\u0000\u0000\u0000Z\u0255\u0001\u0000\u0000\u0000\\\u025b\u0001"+
		"\u0000\u0000\u0000^\u026a\u0001\u0000\u0000\u0000`\u026d\u0001\u0000\u0000"+
		"\u0000b\u0279\u0001\u0000\u0000\u0000d\u027b\u0001\u0000\u0000\u0000f"+
		"h\u0003\u0002\u0001\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0000\u0000\u0001m\u0001"+
		"\u0001\u0000\u0000\u0000n|\u0003\u0004\u0002\u0000o|\u0003\u0006\u0003"+
		"\u0000p|\u0003H$\u0000q|\u0003\n\u0005\u0000r|\u0003\f\u0006\u0000s|\u0003"+
		"*\u0015\u0000t|\u0003:\u001d\u0000u|\u0003<\u001e\u0000v|\u0003>\u001f"+
		"\u0000w|\u0003@ \u0000x|\u0003B!\u0000y|\u0003D\"\u0000z|\u0003F#\u0000"+
		"{n\u0001\u0000\u0000\u0000{o\u0001\u0000\u0000\u0000{p\u0001\u0000\u0000"+
		"\u0000{q\u0001\u0000\u0000\u0000{r\u0001\u0000\u0000\u0000{s\u0001\u0000"+
		"\u0000\u0000{t\u0001\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000{v\u0001"+
		"\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0003\u0001\u0000"+
		"\u0000\u0000}\u0081\u0005\u0005\u0000\u0000~\u0080\u0003\u0002\u0001\u0000"+
		"\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\u0006\u0000\u0000\u0085\u0005\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u0004\u0000\u0000\u0087\u0007\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0003\u0002\u0001\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\t\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0007\u0000\u0000\u008f\u000b"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091\u0092\u0003"+
		"\u000e\u0007\u0000\u0092\u0093\u0005\r\u0000\u0000\u0093\r\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0003\u0010\b\u0000\u0095\u000f\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0006\b\uffff\uffff\u0000\u0097\u0098\u0003\u0012\t"+
		"\u0000\u0098\u009e\u0001\u0000\u0000\u0000\u0099\u009a\n\u0001\u0000\u0000"+
		"\u009a\u009b\u0005\u001c\u0000\u0000\u009b\u009d\u0003\u0012\t\u0000\u009c"+
		"\u0099\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u0011\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0006\t\uffff\uffff\u0000\u00a2\u00a3\u0003\u0014\n\u0000\u00a3"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a4\u00a5\n\u0001\u0000\u0000\u00a5\u00a6"+
		"\u0005\u001b\u0000\u0000\u00a6\u00a8\u0003\u0014\n\u0000\u00a7\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0013\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006"+
		"\n\uffff\uffff\u0000\u00ad\u00ae\u0003\u0016\u000b\u0000\u00ae\u00b4\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\n\u0001\u0000\u0000\u00b0\u00b1\u0007\u0000"+
		"\u0000\u0000\u00b1\u00b3\u0003\u0016\u000b\u0000\u00b2\u00af\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u0015\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\u000b"+
		"\uffff\uffff\u0000\u00b8\u00b9\u0003\u0018\f\u0000\u00b9\u00bf\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\n\u0001\u0000\u0000\u00bb\u00bc\u0007\u0001\u0000"+
		"\u0000\u00bc\u00be\u0003\u0018\f\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u0017\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0006\f\uffff\uffff\u0000"+
		"\u00c3\u00c4\u0003\u001a\r\u0000\u00c4\u00ca\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\n\u0001\u0000\u0000\u00c6\u00c7\u0007\u0002\u0000\u0000\u00c7\u00c9"+
		"\u0003\u001a\r\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u0019\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005\u001d\u0000\u0000\u00ce\u00d5\u0003"+
		"\u001a\r\u0000\u00cf\u00d0\u0005\u000f\u0000\u0000\u00d0\u00d5\u0003\u001a"+
		"\r\u0000\u00d1\u00d2\u0005\u0010\u0000\u0000\u00d2\u00d5\u0003\u001a\r"+
		"\u0000\u00d3\u00d5\u0003\u001c\u000e\u0000\u00d4\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u001b\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0003\u001e\u000f\u0000\u00d7\u001d\u0001\u0000\u0000"+
		"\u0000\u00d8\u00eb\u0003 \u0010\u0000\u00d9\u00da\u0005&\u0000\u0000\u00da"+
		"\u00e7\u0005(\u0000\u0000\u00db\u00e4\u0005\u001f\u0000\u0000\u00dc\u00e1"+
		"\u0003\u000e\u0007\u0000\u00dd\u00de\u0005#\u0000\u0000\u00de\u00e0\u0003"+
		"\u000e\u0007\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00dc\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0005"+
		" \u0000\u0000\u00e7\u00db\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00d9\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u001f\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00fe\u0003\"\u0011"+
		"\u0000\u00ef\u00f3\u0005(\u0000\u0000\u00f0\u00f2\u0003$\u0012\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00fe\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6"+
		"\u00fe\u0005)\u0000\u0000\u00f7\u00fe\u0005\u000e\u0000\u0000\u00f8\u00fe"+
		"\u0003&\u0013\u0000\u00f9\u00fa\u0005\u001f\u0000\u0000\u00fa\u00fb\u0003"+
		"\u000e\u0007\u0000\u00fb\u00fc\u0005 \u0000\u0000\u00fc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fd\u00ee\u0001\u0000\u0000\u0000\u00fd\u00ef\u0001\u0000"+
		"\u0000\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fe!\u0001\u0000\u0000\u0000\u00ff\u0100\u0005(\u0000\u0000"+
		"\u0100\u0109\u0005\u001f\u0000\u0000\u0101\u0106\u0003\u000e\u0007\u0000"+
		"\u0102\u0103\u0005#\u0000\u0000\u0103\u0105\u0003\u000e\u0007\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109"+
		"\u0101\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0005 \u0000\u0000\u010c#\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005%\u0000\u0000\u010e\u0114\u0005(\u0000"+
		"\u0000\u010f\u0110\u0005!\u0000\u0000\u0110\u0111\u0003\u000e\u0007\u0000"+
		"\u0111\u0112\u0005\"\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113"+
		"\u010d\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0114"+
		"%\u0001\u0000\u0000\u0000\u0115\u011e\u0005!\u0000\u0000\u0116\u011b\u0003"+
		"\u000e\u0007\u0000\u0117\u0118\u0005#\u0000\u0000\u0118\u011a\u0003\u000e"+
		"\u0007\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000"+
		"\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011e\u0116\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0005\"\u0000"+
		"\u0000\u0121\'\u0001\u0000\u0000\u0000\u0122\u0133\u0005\u000f\u0000\u0000"+
		"\u0123\u0133\u0005\u0010\u0000\u0000\u0124\u0133\u0005\u0011\u0000\u0000"+
		"\u0125\u0133\u0005\u0012\u0000\u0000\u0126\u0133\u0005\u0013\u0000\u0000"+
		"\u0127\u0133\u0005\u0014\u0000\u0000\u0128\u0133\u0005\u0015\u0000\u0000"+
		"\u0129\u0133\u0005\u0016\u0000\u0000\u012a\u0133\u0005\u0017\u0000\u0000"+
		"\u012b\u0133\u0005\u0018\u0000\u0000\u012c\u0133\u0005\u0019\u0000\u0000"+
		"\u012d\u0133\u0005\u001a\u0000\u0000\u012e\u0133\u0005\u001b\u0000\u0000"+
		"\u012f\u0133\u0005\u001c\u0000\u0000\u0130\u0133\u0005\u001e\u0000\u0000"+
		"\u0131\u0133\u0005\'\u0000\u0000\u0132\u0122\u0001\u0000\u0000\u0000\u0132"+
		"\u0123\u0001\u0000\u0000\u0000\u0132\u0124\u0001\u0000\u0000\u0000\u0132"+
		"\u0125\u0001\u0000\u0000\u0000\u0132\u0126\u0001\u0000\u0000\u0000\u0132"+
		"\u0127\u0001\u0000\u0000\u0000\u0132\u0128\u0001\u0000\u0000\u0000\u0132"+
		"\u0129\u0001\u0000\u0000\u0000\u0132\u012a\u0001\u0000\u0000\u0000\u0132"+
		"\u012b\u0001\u0000\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0132"+
		"\u012d\u0001\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0132"+
		"\u012f\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u0131\u0001\u0000\u0000\u0000\u0133)\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0005\t\u0000\u0000\u0135\u0136\u0005,\u0000\u0000\u0136\u0137\u0003"+
		",\u0016\u0000\u0137\u0138\u0005+\u0000\u0000\u0138\u0141\u0003\b\u0004"+
		"\u0000\u0139\u013a\u0005\t\u0000\u0000\u013a\u013b\u0005.\u0000\u0000"+
		"\u013b\u013c\u0003,\u0016\u0000\u013c\u013d\u0005+\u0000\u0000\u013d\u013e"+
		"\u0003\b\u0004\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u0139\u0001"+
		"\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0148\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"\t\u0000\u0000\u0145\u0146\u0005-\u0000\u0000\u0146\u0147\u0005+\u0000"+
		"\u0000\u0147\u0149\u0003\b\u0004\u0000\u0148\u0144\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0005\t\u0000\u0000\u014b\u014c\u0005/\u0000\u0000\u014c"+
		"\u014d\u0005+\u0000\u0000\u014d+\u0001\u0000\u0000\u0000\u014e\u014f\u0003"+
		".\u0017\u0000\u014f-\u0001\u0000\u0000\u0000\u0150\u0151\u0006\u0017\uffff"+
		"\uffff\u0000\u0151\u0159\u00030\u0018\u0000\u0152\u0153\u0005N\u0000\u0000"+
		"\u0153\u0159\u0003.\u0017\u0004\u0154\u0155\u0005P\u0000\u0000\u0155\u0156"+
		"\u0003.\u0017\u0000\u0156\u0157\u0005Q\u0000\u0000\u0157\u0159\u0001\u0000"+
		"\u0000\u0000\u0158\u0150\u0001\u0000\u0000\u0000\u0158\u0152\u0001\u0000"+
		"\u0000\u0000\u0158\u0154\u0001\u0000\u0000\u0000\u0159\u0175\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\n\u0002\u0000\u0000\u015b\u015c\u00036\u001b"+
		"\u0000\u015c\u015d\u0003.\u0017\u0003\u015d\u0174\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\n\u0001\u0000\u0000\u015f\u0160\u00038\u001c\u0000\u0160"+
		"\u0161\u0003.\u0017\u0002\u0161\u0174\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\n\u0006\u0000\u0000\u0163\u0164\u0005W\u0000\u0000\u0164\u0171\u0005"+
		"Y\u0000\u0000\u0165\u016e\u0005P\u0000\u0000\u0166\u016b\u0003.\u0017"+
		"\u0000\u0167\u0168\u0005T\u0000\u0000\u0168\u016a\u0003.\u0017\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c"+
		"\u016f\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e"+
		"\u0166\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u0170\u0172\u0005Q\u0000\u0000\u0171\u0165"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174"+
		"\u0001\u0000\u0000\u0000\u0173\u015a\u0001\u0000\u0000\u0000\u0173\u015e"+
		"\u0001\u0000\u0000\u0000\u0173\u0162\u0001\u0000\u0000\u0000\u0174\u0177"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176/\u0001\u0000\u0000\u0000\u0177\u0175\u0001"+
		"\u0000\u0000\u0000\u0178\u017d\u0005Y\u0000\u0000\u0179\u017a\u0005V\u0000"+
		"\u0000\u017a\u017c\u0005Y\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000"+
		"\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0185\u0001\u0000\u0000\u0000"+
		"\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0185\u0005Z\u0000\u0000\u0181"+
		"\u0185\u0005?\u0000\u0000\u0182\u0185\u00032\u0019\u0000\u0183\u0185\u0003"+
		"4\u001a\u0000\u0184\u0178\u0001\u0000\u0000\u0000\u0184\u0180\u0001\u0000"+
		"\u0000\u0000\u0184\u0181\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u01851\u0001\u0000\u0000"+
		"\u0000\u0186\u018f\u0005R\u0000\u0000\u0187\u018c\u0003.\u0017\u0000\u0188"+
		"\u0189\u0005T\u0000\u0000\u0189\u018b\u0003.\u0017\u0000\u018a\u0188\u0001"+
		"\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0190\u0001"+
		"\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0187\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0005S\u0000\u0000\u01923\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0005Y\u0000\u0000\u0194\u019d\u0005P\u0000\u0000\u0195"+
		"\u019a\u0003.\u0017\u0000\u0196\u0197\u0005T\u0000\u0000\u0197\u0199\u0003"+
		".\u0017\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000"+
		"\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000"+
		"\u0000\u0000\u019d\u0195\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0005Q\u0000"+
		"\u0000\u01a05\u0001\u0000\u0000\u0000\u01a1\u01af\u0005@\u0000\u0000\u01a2"+
		"\u01af\u0005A\u0000\u0000\u01a3\u01af\u0005B\u0000\u0000\u01a4\u01af\u0005"+
		"C\u0000\u0000\u01a5\u01af\u0005D\u0000\u0000\u01a6\u01af\u0005E\u0000"+
		"\u0000\u01a7\u01af\u0005F\u0000\u0000\u01a8\u01af\u0005G\u0000\u0000\u01a9"+
		"\u01af\u0005H\u0000\u0000\u01aa\u01af\u0005I\u0000\u0000\u01ab\u01af\u0005"+
		"J\u0000\u0000\u01ac\u01af\u0005K\u0000\u0000\u01ad\u01af\u0005O\u0000"+
		"\u0000\u01ae\u01a1\u0001\u0000\u0000\u0000\u01ae\u01a2\u0001\u0000\u0000"+
		"\u0000\u01ae\u01a3\u0001\u0000\u0000\u0000\u01ae\u01a4\u0001\u0000\u0000"+
		"\u0000\u01ae\u01a5\u0001\u0000\u0000\u0000\u01ae\u01a6\u0001\u0000\u0000"+
		"\u0000\u01ae\u01a7\u0001\u0000\u0000\u0000\u01ae\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ae\u01a9\u0001\u0000\u0000\u0000\u01ae\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af7\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b3\u0005L\u0000\u0000\u01b1\u01b3\u0005M\u0000\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b39\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0005\t\u0000\u0000\u01b5\u01b6\u00050"+
		"\u0000\u0000\u01b6\u01b7\u0005Y\u0000\u0000\u01b7\u01b8\u0005O\u0000\u0000"+
		"\u01b8\u01bb\u0003,\u0016\u0000\u01b9\u01ba\u0005,\u0000\u0000\u01ba\u01bc"+
		"\u0003,\u0016\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0005"+
		"+\u0000\u0000\u01be\u01bf\u0003\b\u0004\u0000\u01bf\u01c0\u0005\t\u0000"+
		"\u0000\u01c0\u01c1\u00051\u0000\u0000\u01c1\u01c2\u0005+\u0000\u0000\u01c2"+
		";\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\t\u0000\u0000\u01c4\u01c5"+
		"\u00052\u0000\u0000\u01c5\u01c6\u0005Y\u0000\u0000\u01c6\u01c7\u0005+"+
		"\u0000\u0000\u01c7\u01c8\u0003\b\u0004\u0000\u01c8\u01c9\u0005\t\u0000"+
		"\u0000\u01c9\u01ca\u00053\u0000\u0000\u01ca\u01cb\u0005+\u0000\u0000\u01cb"+
		"=\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\t\u0000\u0000\u01cd\u01ce"+
		"\u0005:\u0000\u0000\u01ce\u01db\u0005Y\u0000\u0000\u01cf\u01d8\u0005P"+
		"\u0000\u0000\u01d0\u01d5\u0005Y\u0000\u0000\u01d1\u01d2\u0005T\u0000\u0000"+
		"\u01d2\u01d4\u0005Y\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d8\u01d0\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da"+
		"\u01dc\u0005Q\u0000\u0000\u01db\u01cf\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0005+\u0000\u0000\u01de\u01df\u0003\b\u0004\u0000\u01df\u01e0\u0005"+
		"\t\u0000\u0000\u01e0\u01e1\u0005;\u0000\u0000\u01e1\u01e2\u0005+\u0000"+
		"\u0000\u01e2?\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\t\u0000\u0000"+
		"\u01e4\u01e5\u00055\u0000\u0000\u01e5\u01e6\u0005?\u0000\u0000\u01e6\u01e7"+
		"\u0005+\u0000\u0000\u01e7A\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005\t"+
		"\u0000\u0000\u01e9\u01ea\u00056\u0000\u0000\u01ea\u01eb\u0005Y\u0000\u0000"+
		"\u01eb\u01ec\u0005F\u0000\u0000\u01ec\u01ed\u0003,\u0016\u0000\u01ed\u01f3"+
		"\u0005+\u0000\u0000\u01ee\u01ef\u0003\b\u0004\u0000\u01ef\u01f0\u0005"+
		"\t\u0000\u0000\u01f0\u01f1\u00057\u0000\u0000\u01f1\u01f2\u0005+\u0000"+
		"\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4C\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0005\t\u0000\u0000\u01f6\u01f7\u00058\u0000\u0000\u01f7"+
		"\u01f8\u0005Y\u0000\u0000\u01f8\u01f9\u0005+\u0000\u0000\u01f9\u01fa\u0003"+
		"\b\u0004\u0000\u01fa\u01fb\u0005\t\u0000\u0000\u01fb\u01fc\u00059\u0000"+
		"\u0000\u01fc\u01fd\u0005+\u0000\u0000\u01fdE\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0005\t\u0000\u0000\u01ff\u0200\u0005<\u0000\u0000\u0200\u020d"+
		"\u0005Y\u0000\u0000\u0201\u020a\u0005P\u0000\u0000\u0202\u0207\u0003."+
		"\u0017\u0000\u0203\u0204\u0005T\u0000\u0000\u0204\u0206\u0003.\u0017\u0000"+
		"\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0209\u0001\u0000\u0000\u0000"+
		"\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000"+
		"\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000"+
		"\u020a\u0202\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020e\u0005Q\u0000\u0000\u020d"+
		"\u0201\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0005+\u0000\u0000\u0210\u0211"+
		"\u0003\b\u0004\u0000\u0211\u0212\u0005\t\u0000\u0000\u0212\u0213\u0005"+
		"=\u0000\u0000\u0213\u0214\u0005+\u0000\u0000\u0214G\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0005\u0002\u0000\u0000\u0216\u0217\u0003J%\u0000\u0217"+
		"\u0218\u0005\\\u0000\u0000\u0218I\u0001\u0000\u0000\u0000\u0219\u021b"+
		"\u0003L&\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000"+
		"\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000"+
		"\u0000\u0000\u021dK\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0005j\u0000\u0000\u0220\u0221\u0005_\u0000\u0000\u0221"+
		"\u0222\u0003\\.\u0000\u0222\u0223\u0005`\u0000\u0000\u0223\u022a\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0003N\'\u0000\u0225\u0226\u0005_\u0000"+
		"\u0000\u0226\u0227\u0003\\.\u0000\u0227\u0228\u0005`\u0000\u0000\u0228"+
		"\u022a\u0001\u0000\u0000\u0000\u0229\u021f\u0001\u0000\u0000\u0000\u0229"+
		"\u0224\u0001\u0000\u0000\u0000\u022aM\u0001\u0000\u0000\u0000\u022b\u0230"+
		"\u0003P(\u0000\u022c\u022d\u0005c\u0000\u0000\u022d\u022f\u0003P(\u0000"+
		"\u022e\u022c\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000"+
		"\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000"+
		"\u0231O\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233"+
		"\u023a\u0003T*\u0000\u0234\u0239\u0003T*\u0000\u0235\u0236\u0003R)\u0000"+
		"\u0236\u0237\u0003T*\u0000\u0237\u0239\u0001\u0000\u0000\u0000\u0238\u0234"+
		"\u0001\u0000\u0000\u0000\u0238\u0235\u0001\u0000\u0000\u0000\u0239\u023c"+
		"\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0001\u0000\u0000\u0000\u023bQ\u0001\u0000\u0000\u0000\u023c\u023a\u0001"+
		"\u0000\u0000\u0000\u023d\u0241\u0005g\u0000\u0000\u023e\u0241\u0005h\u0000"+
		"\u0000\u023f\u0241\u0005i\u0000\u0000\u0240\u023d\u0001\u0000\u0000\u0000"+
		"\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000"+
		"\u0241S\u0001\u0000\u0000\u0000\u0242\u0244\u0005p\u0000\u0000\u0243\u0242"+
		"\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0248"+
		"\u0001\u0000\u0000\u0000\u0245\u0249\u0003V+\u0000\u0246\u0249\u0003X"+
		",\u0000\u0247\u0249\u0003Z-\u0000\u0248\u0245\u0001\u0000\u0000\u0000"+
		"\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000"+
		"\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000"+
		"\u024c\u024e\u0005p\u0000\u0000\u024d\u0243\u0001\u0000\u0000\u0000\u024d"+
		"\u024c\u0001\u0000\u0000\u0000\u024eU\u0001\u0000\u0000\u0000\u024f\u0250"+
		"\u0005e\u0000\u0000\u0250\u0251\u0005p\u0000\u0000\u0251W\u0001\u0000"+
		"\u0000\u0000\u0252\u0253\u0005f\u0000\u0000\u0253\u0254\u0005p\u0000\u0000"+
		"\u0254Y\u0001\u0000\u0000\u0000\u0255\u0256\u0005a\u0000\u0000\u0256\u0257"+
		"\u0005p\u0000\u0000\u0257[\u0001\u0000\u0000\u0000\u0258\u025a\u0003^"+
		"/\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000\u0000"+
		"\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000"+
		"\u0000\u025c]\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0005k\u0000\u0000\u025f\u0260\u0005a\u0000\u0000\u0260\u0262"+
		"\u0003`0\u0000\u0261\u0263\u0005b\u0000\u0000\u0262\u0261\u0001\u0000"+
		"\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u026b\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0005p\u0000\u0000\u0265\u0266\u0005a\u0000\u0000"+
		"\u0266\u0268\u0003`0\u0000\u0267\u0269\u0005b\u0000\u0000\u0268\u0267"+
		"\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026b"+
		"\u0001\u0000\u0000\u0000\u026a\u025e\u0001\u0000\u0000\u0000\u026a\u0264"+
		"\u0001\u0000\u0000\u0000\u026b_\u0001\u0000\u0000\u0000\u026c\u026e\u0003"+
		"b1\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000"+
		"\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000"+
		"\u0000\u0270a\u0001\u0000\u0000\u0000\u0271\u027a\u0005p\u0000\u0000\u0272"+
		"\u027a\u0005s\u0000\u0000\u0273\u027a\u0005t\u0000\u0000\u0274\u027a\u0005"+
		"l\u0000\u0000\u0275\u027a\u0005k\u0000\u0000\u0276\u027a\u0005o\u0000"+
		"\u0000\u0277\u027a\u0005c\u0000\u0000\u0278\u027a\u0003d2\u0000\u0279"+
		"\u0271\u0001\u0000\u0000\u0000\u0279\u0272\u0001\u0000\u0000\u0000\u0279"+
		"\u0273\u0001\u0000\u0000\u0000\u0279\u0274\u0001\u0000\u0000\u0000\u0279"+
		"\u0275\u0001\u0000\u0000\u0000\u0279\u0276\u0001\u0000\u0000\u0000\u0279"+
		"\u0277\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a"+
		"c\u0001\u0000\u0000\u0000\u027b\u027c\u0007\u0003\u0000\u0000\u027c\u027e"+
		"\u0005m\u0000\u0000\u027d\u027f\u0003`0\u0000\u027e\u027d\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0005n\u0000\u0000\u0281e\u0001\u0000\u0000\u0000"+
		"?i{\u0081\u008b\u009e\u00a9\u00b4\u00bf\u00ca\u00d4\u00e1\u00e4\u00e7"+
		"\u00eb\u00f3\u00fd\u0106\u0109\u0113\u011b\u011e\u0132\u0141\u0148\u0158"+
		"\u016b\u016e\u0171\u0173\u0175\u017d\u0184\u018c\u018f\u019a\u019d\u01ae"+
		"\u01b2\u01bb\u01d5\u01d8\u01db\u01f3\u0207\u020a\u020d\u021c\u0229\u0230"+
		"\u0238\u023a\u0240\u0243\u0248\u024a\u024d\u025b\u0262\u0268\u026a\u026f"+
		"\u0279\u027e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Users/Asus/IdeaProjects/PythonCompiler/src/antlr/HtmlCssParser.g4 by ANTLR 4.13.2
package antlr;
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
		HTML_COMMENT=1, DOCTYPE=2, CDATA=3, PI=4, TAG_OPEN=5, HTML_ENTITY=6, HTML_TEXT=7, 
		WS_TAG=8, SLASH=9, TAG_NAME=10, GT_AFTER_NAME=11, WS_ATTR=12, ATTR_NAME=13, 
		EQ=14, ATTR_VALUE_DOUBLE=15, ATTR_VALUE_SINGLE=16, SLASH_GT=17, GT=18, 
		END_STYLE=19, CSS_WS=20, CSS_COMMENT=21, HASH=22, DOT=23, LBRACE=24, RBRACE=25, 
		COLON=26, SEMI=27, COMMA=28, STAR=29, PLUS=30, GT_SEL=31, TILDE=32, LBRACKET=33, 
		RBRACKET=34, LPAREN=35, RPAREN=36, AT=37, NUMBER=38, PERCENT=39, DIMENSION=40, 
		STRING=41, URL=42, IDENT=43, OPEN_TAG=44, CLOSE_TAG=45, SELF_TAG=46, TEXT_HTML=47, 
		JINJA_EXPR_START=48, JINJA_EXPR_END=49, PIPE=50, IDENTIFIER=51, NOT=52, 
		MINUS=53, FLOORDIV=54, NEQ=55, LT=56, LTE=57, GTE=58, AND=59, OR=60, IN=61, 
		JINJA_STMT_START=62, IF=63, JINJA_STMT_END=64, ELIF=65, ELSE=66, ENDIF=67, 
		FOR=68, ENDFOR=69, BLOCK=70, ENDBLOCK=71, MACRO=72, ENDMACRO=73, INCLUDE=74, 
		STRING_STMT=75, SET=76, ENDSET=77, FILTER=78, ENDFILTER=79, CALL=80, ENDCALL=81, 
		STYLE_OPEN=82, STYLE_CLOSE_CSS=83, LBRACE_CSS=84, RBRACE_CSS=85, COMMA_CSS=86, 
		DOTCSS=87, COLON_CSS=88, GTCSS=89, PLUSCSS=90, TILDECSS=91, SEMI_CSS=92, 
		NUMBERCSS=93, STRING_CSS=94;
	public static final int
		RULE_document = 0, RULE_node = 1, RULE_html_element = 2, RULE_self_tag = 3, 
		RULE_content = 4, RULE_text_html = 5, RULE_jinja_expr = 6, RULE_expr = 7, 
		RULE_primary = 8, RULE_list_literal = 9, RULE_bin_op = 10, RULE_jinja_if_block = 11, 
		RULE_jinja_for_block = 12, RULE_jinja_block_block = 13, RULE_jinja_macro_block = 14, 
		RULE_jinja_include_stmt = 15, RULE_jinja_set_block = 16, RULE_jinja_filter_block = 17, 
		RULE_jinja_call_block = 18, RULE_style_element = 19, RULE_css_rules = 20, 
		RULE_css_rule = 21, RULE_selector = 22, RULE_selector_part = 23, RULE_simple_selector = 24, 
		RULE_class_selector = 25, RULE_id_selector = 26, RULE_pseudo_selector = 27, 
		RULE_combinator = 28, RULE_css_body = 29, RULE_css_decl = 30, RULE_css_value = 31, 
		RULE_css_value_atom = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "node", "html_element", "self_tag", "content", "text_html", 
			"jinja_expr", "expr", "primary", "list_literal", "bin_op", "jinja_if_block", 
			"jinja_for_block", "jinja_block_block", "jinja_macro_block", "jinja_include_stmt", 
			"jinja_set_block", "jinja_filter_block", "jinja_call_block", "style_element", 
			"css_rules", "css_rule", "selector", "selector_part", "simple_selector", 
			"class_selector", "id_selector", "pseudo_selector", "combinator", "css_body", 
			"css_decl", "css_value", "css_value_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<'", null, null, null, "'/'", null, null, 
			null, null, "'='", null, null, null, null, "'</style>'", null, null, 
			"'#'", "'.'", "'{'", "'}'", "':'", "';'", "','", "'*'", "'+'", "'>'", 
			"'~'", "'['", "']'", "'('", "')'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "DOCTYPE", "CDATA", "PI", "TAG_OPEN", "HTML_ENTITY", 
			"HTML_TEXT", "WS_TAG", "SLASH", "TAG_NAME", "GT_AFTER_NAME", "WS_ATTR", 
			"ATTR_NAME", "EQ", "ATTR_VALUE_DOUBLE", "ATTR_VALUE_SINGLE", "SLASH_GT", 
			"GT", "END_STYLE", "CSS_WS", "CSS_COMMENT", "HASH", "DOT", "LBRACE", 
			"RBRACE", "COLON", "SEMI", "COMMA", "STAR", "PLUS", "GT_SEL", "TILDE", 
			"LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "AT", "NUMBER", "PERCENT", 
			"DIMENSION", "STRING", "URL", "IDENT", "OPEN_TAG", "CLOSE_TAG", "SELF_TAG", 
			"TEXT_HTML", "JINJA_EXPR_START", "JINJA_EXPR_END", "PIPE", "IDENTIFIER", 
			"NOT", "MINUS", "FLOORDIV", "NEQ", "LT", "LTE", "GTE", "AND", "OR", "IN", 
			"JINJA_STMT_START", "IF", "JINJA_STMT_END", "ELIF", "ELSE", "ENDIF", 
			"FOR", "ENDFOR", "BLOCK", "ENDBLOCK", "MACRO", "ENDMACRO", "INCLUDE", 
			"STRING_STMT", "SET", "ENDSET", "FILTER", "ENDFILTER", "CALL", "ENDCALL", 
			"STYLE_OPEN", "STYLE_CLOSE_CSS", "LBRACE_CSS", "RBRACE_CSS", "COMMA_CSS", 
			"DOTCSS", "COLON_CSS", "GTCSS", "PLUSCSS", "TILDECSS", "SEMI_CSS", "NUMBERCSS", 
			"STRING_CSS"
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
		public TerminalNode EOF() { return getToken(HtmlCssParser.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 274878169117L) != 0)) {
				{
				{
				setState(66);
				node();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public Self_tagContext self_tag() {
			return getRuleContext(Self_tagContext.class,0);
		}
		public Style_elementContext style_element() {
			return getRuleContext(Style_elementContext.class,0);
		}
		public Text_htmlContext text_html() {
			return getRuleContext(Text_htmlContext.class,0);
		}
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public Jinja_if_blockContext jinja_if_block() {
			return getRuleContext(Jinja_if_blockContext.class,0);
		}
		public Jinja_for_blockContext jinja_for_block() {
			return getRuleContext(Jinja_for_blockContext.class,0);
		}
		public Jinja_block_blockContext jinja_block_block() {
			return getRuleContext(Jinja_block_blockContext.class,0);
		}
		public Jinja_macro_blockContext jinja_macro_block() {
			return getRuleContext(Jinja_macro_blockContext.class,0);
		}
		public Jinja_include_stmtContext jinja_include_stmt() {
			return getRuleContext(Jinja_include_stmtContext.class,0);
		}
		public Jinja_set_blockContext jinja_set_block() {
			return getRuleContext(Jinja_set_blockContext.class,0);
		}
		public Jinja_filter_blockContext jinja_filter_block() {
			return getRuleContext(Jinja_filter_blockContext.class,0);
		}
		public Jinja_call_blockContext jinja_call_block() {
			return getRuleContext(Jinja_call_blockContext.class,0);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				html_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				self_tag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				style_element();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				text_html();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				jinja_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				jinja_if_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				jinja_for_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				jinja_block_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(82);
				jinja_macro_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(83);
				jinja_include_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
				jinja_set_block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(85);
				jinja_filter_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(86);
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
		public TerminalNode OPEN_TAG() { return getToken(HtmlCssParser.OPEN_TAG, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(HtmlCssParser.CLOSE_TAG, 0); }
		public Html_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterHtml_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitHtml_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitHtml_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_html_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(OPEN_TAG);
			setState(90);
			content();
			setState(91);
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
		public TerminalNode SELF_TAG() { return getToken(HtmlCssParser.SELF_TAG, 0); }
		public Self_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSelf_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSelf_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSelf_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_tagContext self_tag() throws RecognitionException {
		Self_tagContext _localctx = new Self_tagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_self_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					node();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public TerminalNode TEXT_HTML() { return getToken(HtmlCssParser.TEXT_HTML, 0); }
		public Text_htmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterText_html(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitText_html(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitText_html(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_htmlContext text_html() throws RecognitionException {
		Text_htmlContext _localctx = new Text_htmlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_text_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		public TerminalNode JINJA_EXPR_START() { return getToken(HtmlCssParser.JINJA_EXPR_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(HtmlCssParser.JINJA_EXPR_END, 0); }
		public Jinja_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinja_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinja_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinja_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_exprContext jinja_expr() throws RecognitionException {
		Jinja_exprContext _localctx = new Jinja_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jinja_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(JINJA_EXPR_START);
			setState(104);
			expr(0);
			setState(105);
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
		public TerminalNode NOT() { return getToken(HtmlCssParser.NOT, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
			case NUMBER:
			case STRING:
			case IDENTIFIER:
				{
				setState(108);
				primary();
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						match(PIPE);
						setState(110);
						match(IDENTIFIER);
						setState(123);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(111);
							match(LPAREN);
							setState(120);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6757916291891200L) != 0)) {
								{
								setState(112);
								expr(0);
								setState(117);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(113);
									match(COMMA);
									setState(114);
									expr(0);
									}
									}
									setState(119);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
							}

							setState(122);
							match(RPAREN);
							}
							break;
						}
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case NOT:
				{
				setState(130);
				match(NOT);
				setState(131);
				expr(2);
				}
				break;
			case LPAREN:
				{
				setState(132);
				match(LPAREN);
				setState(133);
				expr(0);
				setState(134);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(138);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(139);
					bin_op();
					setState(140);
					expr(4);
					}
					} 
				}
				setState(146);
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
	public static class PrimaryContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HtmlCssParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HtmlCssParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HtmlCssParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HtmlCssParser.DOT, i);
		}
		public TerminalNode NUMBER() { return getToken(HtmlCssParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(HtmlCssParser.STRING, 0); }
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primary);
		try {
			int _alt;
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(IDENTIFIER);
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(148);
						match(DOT);
						setState(149);
						match(IDENTIFIER);
						}
						} 
					}
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(STRING);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				list_literal();
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
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterList_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitList_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitList_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LBRACKET);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6757916291891200L) != 0)) {
				{
				setState(161);
				expr(0);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(162);
					match(COMMA);
					setState(163);
					expr(0);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(171);
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
		public TerminalNode PLUS() { return getToken(HtmlCssParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HtmlCssParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(HtmlCssParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(HtmlCssParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(HtmlCssParser.PERCENT, 0); }
		public TerminalNode FLOORDIV() { return getToken(HtmlCssParser.FLOORDIV, 0); }
		public TerminalNode EQ() { return getToken(HtmlCssParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(HtmlCssParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(HtmlCssParser.LT, 0); }
		public TerminalNode GT() { return getToken(HtmlCssParser.GT, 0); }
		public TerminalNode LTE() { return getToken(HtmlCssParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(HtmlCssParser.GTE, 0); }
		public TerminalNode AND() { return getToken(HtmlCssParser.AND, 0); }
		public TerminalNode OR() { return getToken(HtmlCssParser.OR, 0); }
		public TerminalNode IN() { return getToken(HtmlCssParser.IN, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitBin_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4602679370539352576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Jinja_if_blockContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode IF() { return getToken(HtmlCssParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public Jinja_if_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinja_if_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinja_if_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinja_if_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_if_blockContext jinja_if_block() throws RecognitionException {
		Jinja_if_blockContext _localctx = new Jinja_if_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinja_if_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(JINJA_STMT_START);
			setState(176);
			match(IF);
			setState(177);
			expr(0);
			setState(178);
			match(JINJA_STMT_END);
			setState(179);
			content();
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					match(JINJA_STMT_START);
					setState(181);
					match(ELIF);
					setState(182);
					expr(0);
					setState(183);
					match(JINJA_STMT_END);
					setState(184);
					content();
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(191);
				match(JINJA_STMT_START);
				setState(192);
				match(ELSE);
				setState(193);
				match(JINJA_STMT_END);
				setState(194);
				content();
				}
				break;
			}
			setState(197);
			match(JINJA_STMT_START);
			setState(198);
			match(ENDIF);
			setState(199);
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
	public static class Jinja_for_blockContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode FOR() { return getToken(HtmlCssParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtmlCssParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(HtmlCssParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(HtmlCssParser.ENDFOR, 0); }
		public Jinja_for_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinja_for_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinja_for_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinja_for_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_for_blockContext jinja_for_block() throws RecognitionException {
		Jinja_for_blockContext _localctx = new Jinja_for_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinja_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(JINJA_STMT_START);
			setState(202);
			match(FOR);
			setState(203);
			match(IDENTIFIER);
			setState(204);
			match(IN);
			setState(205);
			expr(0);
			setState(206);
			match(JINJA_STMT_END);
			setState(207);
			content();
			setState(208);
			match(JINJA_STMT_START);
			setState(209);
			match(ENDFOR);
			setState(210);
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
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode BLOCK() { return getToken(HtmlCssParser.BLOCK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtmlCssParser.IDENTIFIER, 0); }
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDBLOCK() { return getToken(HtmlCssParser.ENDBLOCK, 0); }
		public Jinja_block_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_block_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinja_block_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinja_block_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinja_block_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_block_blockContext jinja_block_block() throws RecognitionException {
		Jinja_block_blockContext _localctx = new Jinja_block_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinja_block_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(JINJA_STMT_START);
			setState(213);
			match(BLOCK);
			setState(214);
			match(IDENTIFIER);
			setState(215);
			match(JINJA_STMT_END);
			setState(216);
			content();
			setState(217);
			match(JINJA_STMT_START);
			setState(218);
			match(ENDBLOCK);
			setState(219);
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
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode MACRO() { return getToken(HtmlCssParser.MACRO, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HtmlCssParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HtmlCssParser.IDENTIFIER, i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDMACRO() { return getToken(HtmlCssParser.ENDMACRO, 0); }
		public TerminalNode LPAREN() { return getToken(HtmlCssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HtmlCssParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HtmlCssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtmlCssParser.COMMA, i);
		}
		public Jinja_macro_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_macro_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinja_macro_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinja_macro_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinja_macro_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_macro_blockContext jinja_macro_block() throws RecognitionException {
		Jinja_macro_blockContext _localctx = new Jinja_macro_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jinja_macro_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(JINJA_STMT_START);
			setState(222);
			match(MACRO);
			setState(223);
			match(IDENTIFIER);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(224);
				match(LPAREN);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(225);
					match(IDENTIFIER);
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(226);
						match(COMMA);
						setState(227);
						match(IDENTIFIER);
						}
						}
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(235);
				match(RPAREN);
				}
			}

			setState(238);
			match(JINJA_STMT_END);
			setState(239);
			content();
			setState(240);
			match(JINJA_STMT_START);
			setState(241);
			match(ENDMACRO);
			setState(242);
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
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlCssParser.JINJA_STMT_START, 0); }
		public TerminalNode INCLUDE() { return getToken(HtmlCssParser.INCLUDE, 0); }
		public TerminalNode STRING_STMT() { return getToken(HtmlCssParser.STRING_STMT, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(HtmlCssParser.JINJA_STMT_END, 0); }
		public Jinja_include_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_include_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinja_include_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinja_include_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinja_include_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_include_stmtContext jinja_include_stmt() throws RecognitionException {
		Jinja_include_stmtContext _localctx = new Jinja_include_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jinja_include_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(JINJA_STMT_START);
			setState(245);
			match(INCLUDE);
			setState(246);
			match(STRING_STMT);
			setState(247);
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
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode SET() { return getToken(HtmlCssParser.SET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtmlCssParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(HtmlCssParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDSET() { return getToken(HtmlCssParser.ENDSET, 0); }
		public Jinja_set_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_set_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinja_set_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinja_set_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinja_set_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_set_blockContext jinja_set_block() throws RecognitionException {
		Jinja_set_blockContext _localctx = new Jinja_set_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinja_set_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(JINJA_STMT_START);
			setState(250);
			match(SET);
			setState(251);
			match(IDENTIFIER);
			setState(252);
			match(EQ);
			setState(253);
			expr(0);
			setState(254);
			match(JINJA_STMT_END);
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(255);
				content();
				setState(256);
				match(JINJA_STMT_START);
				setState(257);
				match(ENDSET);
				setState(258);
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
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode FILTER() { return getToken(HtmlCssParser.FILTER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtmlCssParser.IDENTIFIER, 0); }
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDFILTER() { return getToken(HtmlCssParser.ENDFILTER, 0); }
		public Jinja_filter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_filter_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinja_filter_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinja_filter_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinja_filter_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_filter_blockContext jinja_filter_block() throws RecognitionException {
		Jinja_filter_blockContext _localctx = new Jinja_filter_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinja_filter_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(JINJA_STMT_START);
			setState(263);
			match(FILTER);
			setState(264);
			match(IDENTIFIER);
			setState(265);
			match(JINJA_STMT_END);
			setState(266);
			content();
			setState(267);
			match(JINJA_STMT_START);
			setState(268);
			match(ENDFILTER);
			setState(269);
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
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlCssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_START, i);
		}
		public TerminalNode CALL() { return getToken(HtmlCssParser.CALL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtmlCssParser.IDENTIFIER, 0); }
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlCssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlCssParser.JINJA_STMT_END, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDCALL() { return getToken(HtmlCssParser.ENDCALL, 0); }
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
		public Jinja_call_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_call_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterJinja_call_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitJinja_call_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitJinja_call_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_call_blockContext jinja_call_block() throws RecognitionException {
		Jinja_call_blockContext _localctx = new Jinja_call_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jinja_call_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(JINJA_STMT_START);
			setState(272);
			match(CALL);
			setState(273);
			match(IDENTIFIER);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(274);
				match(LPAREN);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6757916291891200L) != 0)) {
					{
					setState(275);
					expr(0);
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(276);
						match(COMMA);
						setState(277);
						expr(0);
						}
						}
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(285);
				match(RPAREN);
				}
			}

			setState(288);
			match(JINJA_STMT_END);
			setState(289);
			content();
			setState(290);
			match(JINJA_STMT_START);
			setState(291);
			match(ENDCALL);
			setState(292);
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
	public static class StyleElementContext extends Style_elementContext {
		public TerminalNode STYLE_OPEN() { return getToken(HtmlCssParser.STYLE_OPEN, 0); }
		public Css_rulesContext css_rules() {
			return getRuleContext(Css_rulesContext.class,0);
		}
		public TerminalNode STYLE_CLOSE_CSS() { return getToken(HtmlCssParser.STYLE_CLOSE_CSS, 0); }
		public StyleElementContext(Style_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_elementContext style_element() throws RecognitionException {
		Style_elementContext _localctx = new Style_elementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_style_element);
		try {
			_localctx = new StyleElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(STYLE_OPEN);
			setState(295);
			css_rules();
			setState(296);
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
	public static class CssRulesContext extends Css_rulesContext {
		public List<Css_ruleContext> css_rule() {
			return getRuleContexts(Css_ruleContext.class);
		}
		public Css_ruleContext css_rule(int i) {
			return getRuleContext(Css_ruleContext.class,i);
		}
		public CssRulesContext(Css_rulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCssRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCssRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCssRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_rulesContext css_rules() throws RecognitionException {
		Css_rulesContext _localctx = new Css_rulesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_css_rules);
		int _la;
		try {
			_localctx = new CssRulesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH || _la==IDENT || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 253L) != 0)) {
				{
				{
				setState(298);
				css_rule();
				}
				}
				setState(303);
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
	public static class CssRuleContext extends Css_ruleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE_CSS() { return getToken(HtmlCssParser.LBRACE_CSS, 0); }
		public Css_bodyContext css_body() {
			return getRuleContext(Css_bodyContext.class,0);
		}
		public TerminalNode RBRACE_CSS() { return getToken(HtmlCssParser.RBRACE_CSS, 0); }
		public CssRuleContext(Css_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_ruleContext css_rule() throws RecognitionException {
		Css_ruleContext _localctx = new Css_ruleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_css_rule);
		try {
			_localctx = new CssRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			selector();
			setState(305);
			match(LBRACE_CSS);
			setState(306);
			css_body();
			setState(307);
			match(RBRACE_CSS);
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
		enterRule(_localctx, 44, RULE_selector);
		int _la;
		try {
			_localctx = new SelectorGroupContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			selector_part();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_CSS) {
				{
				{
				setState(310);
				match(COMMA_CSS);
				setState(311);
				selector_part();
				}
				}
				setState(316);
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
	public static class SelectorChainContext extends Selector_partContext {
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
		public SelectorChainContext(Selector_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSelectorChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSelectorChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSelectorChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_partContext selector_part() throws RecognitionException {
		Selector_partContext _localctx = new Selector_partContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_selector_part);
		int _la;
		try {
			_localctx = new SelectorChainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			simple_selector();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 7L) != 0)) {
				{
				{
				setState(318);
				combinator();
				setState(319);
				simple_selector();
				}
				}
				setState(325);
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
	public static class SimpleSelectorContext extends Simple_selectorContext {
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
		public SimpleSelectorContext(Simple_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_selectorContext simple_selector() throws RecognitionException {
		Simple_selectorContext _localctx = new Simple_selectorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simple_selector);
		int _la;
		try {
			_localctx = new SimpleSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(326);
				match(IDENT);
				}
			}

			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH || _la==DOTCSS || _la==COLON_CSS) {
				{
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOTCSS:
					{
					setState(329);
					class_selector();
					}
					break;
				case HASH:
					{
					setState(330);
					id_selector();
					}
					break;
				case COLON_CSS:
					{
					setState(331);
					pseudo_selector();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(336);
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
		enterRule(_localctx, 50, RULE_class_selector);
		try {
			_localctx = new ClassSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(DOTCSS);
			setState(338);
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
		enterRule(_localctx, 52, RULE_id_selector);
		try {
			_localctx = new IdSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(HASH);
			setState(341);
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
	public static class PseudoSelectorContext extends Pseudo_selectorContext {
		public TerminalNode COLON_CSS() { return getToken(HtmlCssParser.COLON_CSS, 0); }
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public PseudoSelectorContext(Pseudo_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterPseudoSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitPseudoSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitPseudoSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pseudo_selectorContext pseudo_selector() throws RecognitionException {
		Pseudo_selectorContext _localctx = new Pseudo_selectorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pseudo_selector);
		try {
			_localctx = new PseudoSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(COLON_CSS);
			setState(344);
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
	public static class SiblingCombinatorContext extends CombinatorContext {
		public TerminalNode TILDECSS() { return getToken(HtmlCssParser.TILDECSS, 0); }
		public SiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSiblingCombinator(this);
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
	public static class AdjacentCombinatorContext extends CombinatorContext {
		public TerminalNode PLUSCSS() { return getToken(HtmlCssParser.PLUSCSS, 0); }
		public AdjacentCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterAdjacentCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitAdjacentCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitAdjacentCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_combinator);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GTCSS:
				_localctx = new ChildCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(GTCSS);
				}
				break;
			case PLUSCSS:
				_localctx = new AdjacentCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(PLUSCSS);
				}
				break;
			case TILDECSS:
				_localctx = new SiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
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
		enterRule(_localctx, 58, RULE_css_body);
		int _la;
		try {
			_localctx = new CssBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(351);
				css_decl();
				}
				}
				setState(356);
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
	public static class CssDeclarationContext extends Css_declContext {
		public TerminalNode IDENT() { return getToken(HtmlCssParser.IDENT, 0); }
		public TerminalNode COLON_CSS() { return getToken(HtmlCssParser.COLON_CSS, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public TerminalNode SEMI_CSS() { return getToken(HtmlCssParser.SEMI_CSS, 0); }
		public CssDeclarationContext(Css_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_declContext css_decl() throws RecognitionException {
		Css_declContext _localctx = new Css_declContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_css_decl);
		int _la;
		try {
			_localctx = new CssDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(IDENT);
			setState(358);
			match(COLON_CSS);
			setState(359);
			css_value();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_CSS) {
				{
				setState(360);
				match(SEMI_CSS);
				}
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
	public static class ValueListContext extends Css_valueContext {
		public List<Css_value_atomContext> css_value_atom() {
			return getRuleContexts(Css_value_atomContext.class);
		}
		public Css_value_atomContext css_value_atom(int i) {
			return getRuleContext(Css_value_atomContext.class,i);
		}
		public ValueListContext(Css_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_css_value);
		try {
			int _alt;
			_localctx = new ValueListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(364); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(363);
					css_value_atom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(366); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class HexValueContext extends Css_value_atomContext {
		public TerminalNode HASH() { return getToken(HtmlCssParser.HASH, 0); }
		public HexValueContext(Css_value_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterHexValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitHexValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitHexValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_value_atomContext css_value_atom() throws RecognitionException {
		Css_value_atomContext _localctx = new Css_value_atomContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_css_value_atom);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new IdentValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(IDENT);
				}
				break;
			case NUMBERCSS:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(NUMBERCSS);
				}
				break;
			case STRING_CSS:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(STRING_CSS);
				}
				break;
			case HASH:
				_localctx = new HexValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(HASH);
				}
				break;
			case COMMA_CSS:
				_localctx = new CommaSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				match(COMMA_CSS);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001^\u0178\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"X\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0005\u0004a\b\u0004\n\u0004\f\u0004d\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007t\b\u0007\n\u0007\f\u0007w\t\u0007"+
		"\u0003\u0007y\b\u0007\u0001\u0007\u0003\u0007|\b\u0007\u0005\u0007~\b"+
		"\u0007\n\u0007\f\u0007\u0081\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0089\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008f\b\u0007\n\u0007"+
		"\f\u0007\u0092\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0097\b\b\n\b\f"+
		"\b\u009a\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u009f\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u00a5\b\t\n\t\f\t\u00a8\t\t\u0003\t\u00aa\b\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00bb\b\u000b\n\u000b\f\u000b\u00be\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c4\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00e5\b\u000e\n\u000e\f\u000e\u00e8\t\u000e\u0003\u000e"+
		"\u00ea\b\u000e\u0001\u000e\u0003\u000e\u00ed\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0105\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0117\b\u0012\n\u0012\f\u0012"+
		"\u011a\t\u0012\u0003\u0012\u011c\b\u0012\u0001\u0012\u0003\u0012\u011f"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0005"+
		"\u0014\u012c\b\u0014\n\u0014\f\u0014\u012f\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0139\b\u0016\n\u0016\f\u0016\u013c\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0142\b\u0017\n\u0017\f\u0017"+
		"\u0145\t\u0017\u0001\u0018\u0003\u0018\u0148\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u014d\b\u0018\n\u0018\f\u0018\u0150\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u015e\b\u001c\u0001\u001d\u0005\u001d\u0161\b\u001d\n\u001d"+
		"\f\u001d\u0164\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u016a\b\u001e\u0001\u001f\u0004\u001f\u016d\b\u001f\u000b"+
		"\u001f\f\u001f\u016e\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0176\b"+
		" \u0001 \u0000\u0001\u000e!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0001"+
		"\u0006\u0000\t\t\u000e\u000e\u0012\u0012\u001d\u001e\'\'5=\u018a\u0000"+
		"E\u0001\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004Y\u0001"+
		"\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000"+
		"\u0000\ne\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000e\u0088"+
		"\u0001\u0000\u0000\u0000\u0010\u009e\u0001\u0000\u0000\u0000\u0012\u00a0"+
		"\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000\u0000\u0000\u0016\u00af"+
		"\u0001\u0000\u0000\u0000\u0018\u00c9\u0001\u0000\u0000\u0000\u001a\u00d4"+
		"\u0001\u0000\u0000\u0000\u001c\u00dd\u0001\u0000\u0000\u0000\u001e\u00f4"+
		"\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000\u0000\u0000\"\u0106\u0001"+
		"\u0000\u0000\u0000$\u010f\u0001\u0000\u0000\u0000&\u0126\u0001\u0000\u0000"+
		"\u0000(\u012d\u0001\u0000\u0000\u0000*\u0130\u0001\u0000\u0000\u0000,"+
		"\u0135\u0001\u0000\u0000\u0000.\u013d\u0001\u0000\u0000\u00000\u0147\u0001"+
		"\u0000\u0000\u00002\u0151\u0001\u0000\u0000\u00004\u0154\u0001\u0000\u0000"+
		"\u00006\u0157\u0001\u0000\u0000\u00008\u015d\u0001\u0000\u0000\u0000:"+
		"\u0162\u0001\u0000\u0000\u0000<\u0165\u0001\u0000\u0000\u0000>\u016c\u0001"+
		"\u0000\u0000\u0000@\u0175\u0001\u0000\u0000\u0000BD\u0003\u0002\u0001"+
		"\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0000\u0000\u0001I\u0001\u0001\u0000\u0000"+
		"\u0000JX\u0003\u0004\u0002\u0000KX\u0003\u0006\u0003\u0000LX\u0003&\u0013"+
		"\u0000MX\u0003\n\u0005\u0000NX\u0003\f\u0006\u0000OX\u0003\u0016\u000b"+
		"\u0000PX\u0003\u0018\f\u0000QX\u0003\u001a\r\u0000RX\u0003\u001c\u000e"+
		"\u0000SX\u0003\u001e\u000f\u0000TX\u0003 \u0010\u0000UX\u0003\"\u0011"+
		"\u0000VX\u0003$\u0012\u0000WJ\u0001\u0000\u0000\u0000WK\u0001\u0000\u0000"+
		"\u0000WL\u0001\u0000\u0000\u0000WM\u0001\u0000\u0000\u0000WN\u0001\u0000"+
		"\u0000\u0000WO\u0001\u0000\u0000\u0000WP\u0001\u0000\u0000\u0000WQ\u0001"+
		"\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000"+
		"WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000X\u0003\u0001\u0000\u0000\u0000YZ\u0005,\u0000\u0000Z[\u0003\b\u0004"+
		"\u0000[\\\u0005-\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000]^\u0005."+
		"\u0000\u0000^\u0007\u0001\u0000\u0000\u0000_a\u0003\u0002\u0001\u0000"+
		"`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\t\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000ef\u0005/\u0000\u0000f\u000b\u0001\u0000\u0000\u0000gh\u0005"+
		"0\u0000\u0000hi\u0003\u000e\u0007\u0000ij\u00051\u0000\u0000j\r\u0001"+
		"\u0000\u0000\u0000kl\u0006\u0007\uffff\uffff\u0000l\u007f\u0003\u0010"+
		"\b\u0000mn\u00052\u0000\u0000n{\u00053\u0000\u0000ox\u0005#\u0000\u0000"+
		"pu\u0003\u000e\u0007\u0000qr\u0005\u001c\u0000\u0000rt\u0003\u000e\u0007"+
		"\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000xp\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z|\u0005$\u0000\u0000{o\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}m\u0001\u0000\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0089\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u00054\u0000\u0000\u0083\u0089"+
		"\u0003\u000e\u0007\u0002\u0084\u0085\u0005#\u0000\u0000\u0085\u0086\u0003"+
		"\u000e\u0007\u0000\u0086\u0087\u0005$\u0000\u0000\u0087\u0089\u0001\u0000"+
		"\u0000\u0000\u0088k\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000\u0000"+
		"\u0000\u0088\u0084\u0001\u0000\u0000\u0000\u0089\u0090\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\n\u0003\u0000\u0000\u008b\u008c\u0003\u0014\n\u0000"+
		"\u008c\u008d\u0003\u000e\u0007\u0004\u008d\u008f\u0001\u0000\u0000\u0000"+
		"\u008e\u008a\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u000f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0098\u00053\u0000\u0000\u0094\u0095\u0005\u0017\u0000\u0000\u0095"+
		"\u0097\u00053\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009f\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009b\u009f\u0005&\u0000\u0000\u009c\u009f\u0005"+
		")\u0000\u0000\u009d\u009f\u0003\u0012\t\u0000\u009e\u0093\u0001\u0000"+
		"\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u0011\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a9\u0005!\u0000\u0000\u00a1\u00a6\u0003\u000e\u0007"+
		"\u0000\u00a2\u00a3\u0005\u001c\u0000\u0000\u00a3\u00a5\u0003\u000e\u0007"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\"\u0000\u0000"+
		"\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007\u0000\u0000\u0000"+
		"\u00ae\u0015\u0001\u0000\u0000\u0000\u00af\u00b0\u0005>\u0000\u0000\u00b0"+
		"\u00b1\u0005?\u0000\u0000\u00b1\u00b2\u0003\u000e\u0007\u0000\u00b2\u00b3"+
		"\u0005@\u0000\u0000\u00b3\u00bc\u0003\b\u0004\u0000\u00b4\u00b5\u0005"+
		">\u0000\u0000\u00b5\u00b6\u0005A\u0000\u0000\u00b6\u00b7\u0003\u000e\u0007"+
		"\u0000\u00b7\u00b8\u0005@\u0000\u0000\u00b8\u00b9\u0003\b\u0004\u0000"+
		"\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000"+
		"\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c3\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005>\u0000\u0000\u00c0"+
		"\u00c1\u0005B\u0000\u0000\u00c1\u00c2\u0005@\u0000\u0000\u00c2\u00c4\u0003"+
		"\b\u0004\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005>\u0000"+
		"\u0000\u00c6\u00c7\u0005C\u0000\u0000\u00c7\u00c8\u0005@\u0000\u0000\u00c8"+
		"\u0017\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005>\u0000\u0000\u00ca\u00cb"+
		"\u0005D\u0000\u0000\u00cb\u00cc\u00053\u0000\u0000\u00cc\u00cd\u0005="+
		"\u0000\u0000\u00cd\u00ce\u0003\u000e\u0007\u0000\u00ce\u00cf\u0005@\u0000"+
		"\u0000\u00cf\u00d0\u0003\b\u0004\u0000\u00d0\u00d1\u0005>\u0000\u0000"+
		"\u00d1\u00d2\u0005E\u0000\u0000\u00d2\u00d3\u0005@\u0000\u0000\u00d3\u0019"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005>\u0000\u0000\u00d5\u00d6\u0005"+
		"F\u0000\u0000\u00d6\u00d7\u00053\u0000\u0000\u00d7\u00d8\u0005@\u0000"+
		"\u0000\u00d8\u00d9\u0003\b\u0004\u0000\u00d9\u00da\u0005>\u0000\u0000"+
		"\u00da\u00db\u0005G\u0000\u0000\u00db\u00dc\u0005@\u0000\u0000\u00dc\u001b"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0005>\u0000\u0000\u00de\u00df\u0005"+
		"H\u0000\u0000\u00df\u00ec\u00053\u0000\u0000\u00e0\u00e9\u0005#\u0000"+
		"\u0000\u00e1\u00e6\u00053\u0000\u0000\u00e2\u00e3\u0005\u001c\u0000\u0000"+
		"\u00e3\u00e5\u00053\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e1\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ed\u0005$\u0000\u0000\u00ec\u00e0\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005@\u0000\u0000\u00ef\u00f0\u0003\b\u0004\u0000\u00f0\u00f1\u0005"+
		">\u0000\u0000\u00f1\u00f2\u0005I\u0000\u0000\u00f2\u00f3\u0005@\u0000"+
		"\u0000\u00f3\u001d\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005>\u0000\u0000"+
		"\u00f5\u00f6\u0005J\u0000\u0000\u00f6\u00f7\u0005K\u0000\u0000\u00f7\u00f8"+
		"\u0005@\u0000\u0000\u00f8\u001f\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		">\u0000\u0000\u00fa\u00fb\u0005L\u0000\u0000\u00fb\u00fc\u00053\u0000"+
		"\u0000\u00fc\u00fd\u0005\u000e\u0000\u0000\u00fd\u00fe\u0003\u000e\u0007"+
		"\u0000\u00fe\u0104\u0005@\u0000\u0000\u00ff\u0100\u0003\b\u0004\u0000"+
		"\u0100\u0101\u0005>\u0000\u0000\u0101\u0102\u0005M\u0000\u0000\u0102\u0103"+
		"\u0005@\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00ff\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105!\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005>\u0000\u0000\u0107\u0108\u0005N\u0000\u0000"+
		"\u0108\u0109\u00053\u0000\u0000\u0109\u010a\u0005@\u0000\u0000\u010a\u010b"+
		"\u0003\b\u0004\u0000\u010b\u010c\u0005>\u0000\u0000\u010c\u010d\u0005"+
		"O\u0000\u0000\u010d\u010e\u0005@\u0000\u0000\u010e#\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0005>\u0000\u0000\u0110\u0111\u0005P\u0000\u0000\u0111"+
		"\u011e\u00053\u0000\u0000\u0112\u011b\u0005#\u0000\u0000\u0113\u0118\u0003"+
		"\u000e\u0007\u0000\u0114\u0115\u0005\u001c\u0000\u0000\u0115\u0117\u0003"+
		"\u000e\u0007\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0005"+
		"$\u0000\u0000\u011e\u0112\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0005@\u0000"+
		"\u0000\u0121\u0122\u0003\b\u0004\u0000\u0122\u0123\u0005>\u0000\u0000"+
		"\u0123\u0124\u0005Q\u0000\u0000\u0124\u0125\u0005@\u0000\u0000\u0125%"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0005R\u0000\u0000\u0127\u0128\u0003"+
		"(\u0014\u0000\u0128\u0129\u0005S\u0000\u0000\u0129\'\u0001\u0000\u0000"+
		"\u0000\u012a\u012c\u0003*\u0015\u0000\u012b\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e)\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0003,\u0016\u0000\u0131\u0132"+
		"\u0005T\u0000\u0000\u0132\u0133\u0003:\u001d\u0000\u0133\u0134\u0005U"+
		"\u0000\u0000\u0134+\u0001\u0000\u0000\u0000\u0135\u013a\u0003.\u0017\u0000"+
		"\u0136\u0137\u0005V\u0000\u0000\u0137\u0139\u0003.\u0017\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b-\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0143\u0003"+
		"0\u0018\u0000\u013e\u013f\u00038\u001c\u0000\u013f\u0140\u00030\u0018"+
		"\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013e\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144/\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u0005+\u0000\u0000\u0147"+
		"\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148"+
		"\u014e\u0001\u0000\u0000\u0000\u0149\u014d\u00032\u0019\u0000\u014a\u014d"+
		"\u00034\u001a\u0000\u014b\u014d\u00036\u001b\u0000\u014c\u0149\u0001\u0000"+
		"\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f1\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0152\u0005W\u0000\u0000"+
		"\u0152\u0153\u0005+\u0000\u0000\u01533\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0005\u0016\u0000\u0000\u0155\u0156\u0005+\u0000\u0000\u01565\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0005X\u0000\u0000\u0158\u0159\u0005+\u0000\u0000"+
		"\u01597\u0001\u0000\u0000\u0000\u015a\u015e\u0005Y\u0000\u0000\u015b\u015e"+
		"\u0005Z\u0000\u0000\u015c\u015e\u0005[\u0000\u0000\u015d\u015a\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015e9\u0001\u0000\u0000\u0000\u015f\u0161\u0003<\u001e\u0000"+
		"\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163;\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0005+\u0000\u0000\u0166\u0167\u0005X\u0000\u0000\u0167\u0169\u0003"+
		">\u001f\u0000\u0168\u016a\u0005\\\u0000\u0000\u0169\u0168\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a=\u0001\u0000\u0000"+
		"\u0000\u016b\u016d\u0003@ \u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f?\u0001\u0000\u0000\u0000\u0170\u0176"+
		"\u0005+\u0000\u0000\u0171\u0176\u0005]\u0000\u0000\u0172\u0176\u0005^"+
		"\u0000\u0000\u0173\u0176\u0005\u0016\u0000\u0000\u0174\u0176\u0005V\u0000"+
		"\u0000\u0175\u0170\u0001\u0000\u0000\u0000\u0175\u0171\u0001\u0000\u0000"+
		"\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000"+
		"\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176A\u0001\u0000\u0000\u0000"+
		"!EWbux{\u007f\u0088\u0090\u0098\u009e\u00a6\u00a9\u00bc\u00c3\u00e6\u00e9"+
		"\u00ec\u0104\u0118\u011b\u011e\u012d\u013a\u0143\u0147\u014c\u014e\u015d"+
		"\u0162\u0169\u016e\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/PythonCompiler/src/antlr/HtmlCssParser.g4 by ANTLR 4.13.2
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
		STRING=41, URL=42, IDENT=43;
	public static final int
		RULE_htmlDocument = 0, RULE_element = 1, RULE_htmlContent = 2, RULE_attribute = 3, 
		RULE_styleContent = 4, RULE_cssRule = 5, RULE_selector = 6, RULE_declaration = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "element", "htmlContent", "attribute", "styleContent", 
			"cssRule", "selector", "declaration"
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
			"DIMENSION", "STRING", "URL", "IDENT"
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
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HtmlCssParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> HTML_TEXT() { return getTokens(HtmlCssParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(HtmlCssParser.HTML_TEXT, i);
		}
		public List<TerminalNode> HTML_ENTITY() { return getTokens(HtmlCssParser.HTML_ENTITY); }
		public TerminalNode HTML_ENTITY(int i) {
			return getToken(HtmlCssParser.HTML_ENTITY, i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
				{
				setState(19);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_OPEN:
					{
					setState(16);
					element();
					}
					break;
				case HTML_TEXT:
					{
					setState(17);
					match(HTML_TEXT);
					}
					break;
				case HTML_ENTITY:
					{
					setState(18);
					match(HTML_ENTITY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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
	public static class ElementContext extends ParserRuleContext {
		public Token TAG_NAME;
		public List<TerminalNode> TAG_OPEN() { return getTokens(HtmlCssParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HtmlCssParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HtmlCssParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HtmlCssParser.TAG_NAME, i);
		}
		public List<TerminalNode> GT() { return getTokens(HtmlCssParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HtmlCssParser.GT, i);
		}
		public StyleContentContext styleContent() {
			return getRuleContext(StyleContentContext.class,0);
		}
		public TerminalNode END_STYLE() { return getToken(HtmlCssParser.END_STYLE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(HtmlCssParser.SLASH, 0); }
		public TerminalNode SLASH_GT() { return getToken(HtmlCssParser.SLASH_GT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(TAG_OPEN);
				setState(27);
				((ElementContext)_localctx).TAG_NAME = match(TAG_NAME);
				setState(28);
				if (!( (((ElementContext)_localctx).TAG_NAME!=null?((ElementContext)_localctx).TAG_NAME.getText():null).equalsIgnoreCase("style") )) throw new FailedPredicateException(this, " $TAG_NAME.text.equalsIgnoreCase(\"style\") ");
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_NAME) {
					{
					{
					setState(29);
					attribute();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35);
				match(GT);
				setState(36);
				styleContent();
				setState(37);
				match(END_STYLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(TAG_OPEN);
				setState(40);
				match(TAG_NAME);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_NAME) {
					{
					{
					setState(41);
					attribute();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				match(GT);
				setState(48);
				htmlContent();
				setState(49);
				match(TAG_OPEN);
				setState(50);
				match(SLASH);
				setState(51);
				match(TAG_NAME);
				setState(52);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(TAG_OPEN);
				setState(55);
				match(TAG_NAME);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_NAME) {
					{
					{
					setState(56);
					attribute();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(SLASH_GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(TAG_OPEN);
				setState(64);
				match(TAG_NAME);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_NAME) {
					{
					{
					setState(65);
					attribute();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(GT);
				setState(72);
				match(TAG_OPEN);
				setState(73);
				match(SLASH);
				setState(74);
				match(TAG_NAME);
				setState(75);
				match(GT);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> HTML_TEXT() { return getTokens(HtmlCssParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(HtmlCssParser.HTML_TEXT, i);
		}
		public List<TerminalNode> HTML_ENTITY() { return getTokens(HtmlCssParser.HTML_ENTITY); }
		public TerminalNode HTML_ENTITY(int i) {
			return getToken(HtmlCssParser.HTML_ENTITY, i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(81);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_OPEN:
						{
						setState(78);
						element();
						}
						break;
					case HTML_TEXT:
						{
						setState(79);
						match(HTML_TEXT);
						}
						break;
					case HTML_ENTITY:
						{
						setState(80);
						match(HTML_ENTITY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(85);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTR_NAME() { return getToken(HtmlCssParser.ATTR_NAME, 0); }
		public TerminalNode EQ() { return getToken(HtmlCssParser.EQ, 0); }
		public TerminalNode ATTR_VALUE_DOUBLE() { return getToken(HtmlCssParser.ATTR_VALUE_DOUBLE, 0); }
		public TerminalNode ATTR_VALUE_SINGLE() { return getToken(HtmlCssParser.ATTR_VALUE_SINGLE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ATTR_NAME);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(87);
				match(EQ);
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==ATTR_VALUE_DOUBLE || _la==ATTR_VALUE_SINGLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class StyleContentContext extends ParserRuleContext {
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public List<TerminalNode> CSS_WS() { return getTokens(HtmlCssParser.CSS_WS); }
		public TerminalNode CSS_WS(int i) {
			return getToken(HtmlCssParser.CSS_WS, i);
		}
		public List<TerminalNode> CSS_COMMENT() { return getTokens(HtmlCssParser.CSS_COMMENT); }
		public TerminalNode CSS_COMMENT(int i) {
			return getToken(HtmlCssParser.CSS_COMMENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(HtmlCssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(HtmlCssParser.IDENT, i);
		}
		public List<TerminalNode> HASH() { return getTokens(HtmlCssParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(HtmlCssParser.HASH, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HtmlCssParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HtmlCssParser.DOT, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(HtmlCssParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HtmlCssParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HtmlCssParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HtmlCssParser.RBRACE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(HtmlCssParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HtmlCssParser.COLON, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HtmlCssParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HtmlCssParser.SEMI, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtmlCssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtmlCssParser.COMMA, i);
		}
		public List<TerminalNode> STAR() { return getTokens(HtmlCssParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(HtmlCssParser.STAR, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HtmlCssParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HtmlCssParser.PLUS, i);
		}
		public List<TerminalNode> GT_SEL() { return getTokens(HtmlCssParser.GT_SEL); }
		public TerminalNode GT_SEL(int i) {
			return getToken(HtmlCssParser.GT_SEL, i);
		}
		public List<TerminalNode> TILDE() { return getTokens(HtmlCssParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(HtmlCssParser.TILDE, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(HtmlCssParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HtmlCssParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HtmlCssParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HtmlCssParser.RBRACKET, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HtmlCssParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HtmlCssParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HtmlCssParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HtmlCssParser.RPAREN, i);
		}
		public List<TerminalNode> AT() { return getTokens(HtmlCssParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(HtmlCssParser.AT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(HtmlCssParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HtmlCssParser.NUMBER, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(HtmlCssParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(HtmlCssParser.PERCENT, i);
		}
		public List<TerminalNode> DIMENSION() { return getTokens(HtmlCssParser.DIMENSION); }
		public TerminalNode DIMENSION(int i) {
			return getToken(HtmlCssParser.DIMENSION, i);
		}
		public List<TerminalNode> STRING() { return getTokens(HtmlCssParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HtmlCssParser.STRING, i);
		}
		public List<TerminalNode> URL() { return getTokens(HtmlCssParser.URL); }
		public TerminalNode URL(int i) {
			return getToken(HtmlCssParser.URL, i);
		}
		public StyleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterStyleContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitStyleContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitStyleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContentContext styleContent() throws RecognitionException {
		StyleContentContext _localctx = new StyleContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_styleContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592184995840L) != 0)) {
				{
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(91);
					cssRule();
					}
					break;
				case 2:
					{
					setState(92);
					match(CSS_WS);
					}
					break;
				case 3:
					{
					setState(93);
					match(CSS_COMMENT);
					}
					break;
				case 4:
					{
					setState(94);
					match(IDENT);
					}
					break;
				case 5:
					{
					setState(95);
					match(HASH);
					}
					break;
				case 6:
					{
					setState(96);
					match(DOT);
					}
					break;
				case 7:
					{
					setState(97);
					match(LBRACE);
					}
					break;
				case 8:
					{
					setState(98);
					match(RBRACE);
					}
					break;
				case 9:
					{
					setState(99);
					match(COLON);
					}
					break;
				case 10:
					{
					setState(100);
					match(SEMI);
					}
					break;
				case 11:
					{
					setState(101);
					match(COMMA);
					}
					break;
				case 12:
					{
					setState(102);
					match(STAR);
					}
					break;
				case 13:
					{
					setState(103);
					match(PLUS);
					}
					break;
				case 14:
					{
					setState(104);
					match(GT_SEL);
					}
					break;
				case 15:
					{
					setState(105);
					match(TILDE);
					}
					break;
				case 16:
					{
					setState(106);
					match(LBRACKET);
					}
					break;
				case 17:
					{
					setState(107);
					match(RBRACKET);
					}
					break;
				case 18:
					{
					setState(108);
					match(LPAREN);
					}
					break;
				case 19:
					{
					setState(109);
					match(RPAREN);
					}
					break;
				case 20:
					{
					setState(110);
					match(AT);
					}
					break;
				case 21:
					{
					setState(111);
					match(NUMBER);
					}
					break;
				case 22:
					{
					setState(112);
					match(PERCENT);
					}
					break;
				case 23:
					{
					setState(113);
					match(DIMENSION);
					}
					break;
				case 24:
					{
					setState(114);
					match(STRING);
					}
					break;
				case 25:
					{
					setState(115);
					match(URL);
					}
					break;
				}
				}
				setState(120);
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
	public static class CssRuleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(HtmlCssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HtmlCssParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
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

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			selector();
			setState(122);
			match(LBRACE);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(123);
				declaration();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(RBRACE);
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
		public List<TerminalNode> IDENT() { return getTokens(HtmlCssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(HtmlCssParser.IDENT, i);
		}
		public List<TerminalNode> HASH() { return getTokens(HtmlCssParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(HtmlCssParser.HASH, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HtmlCssParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HtmlCssParser.DOT, i);
		}
		public List<TerminalNode> STAR() { return getTokens(HtmlCssParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(HtmlCssParser.STAR, i);
		}
		public List<TerminalNode> GT_SEL() { return getTokens(HtmlCssParser.GT_SEL); }
		public TerminalNode GT_SEL(int i) {
			return getToken(HtmlCssParser.GT_SEL, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HtmlCssParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HtmlCssParser.PLUS, i);
		}
		public List<TerminalNode> TILDE() { return getTokens(HtmlCssParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(HtmlCssParser.TILDE, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(HtmlCssParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HtmlCssParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HtmlCssParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HtmlCssParser.RBRACKET, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtmlCssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtmlCssParser.COMMA, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HtmlCssParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HtmlCssParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HtmlCssParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HtmlCssParser.RPAREN, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(HtmlCssParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HtmlCssParser.NUMBER, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(HtmlCssParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(HtmlCssParser.PERCENT, i);
		}
		public List<TerminalNode> DIMENSION() { return getTokens(HtmlCssParser.DIMENSION); }
		public TerminalNode DIMENSION(int i) {
			return getToken(HtmlCssParser.DIMENSION, i);
		}
		public List<TerminalNode> STRING() { return getTokens(HtmlCssParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HtmlCssParser.STRING, i);
		}
		public List<TerminalNode> URL() { return getTokens(HtmlCssParser.URL); }
		public TerminalNode URL(int i) {
			return getToken(HtmlCssParser.URL, i);
		}
		public List<TerminalNode> AT() { return getTokens(HtmlCssParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(HtmlCssParser.AT, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17591930191872L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17591930191872L) != 0) );
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
	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(HtmlCssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(HtmlCssParser.IDENT, i);
		}
		public TerminalNode COLON() { return getToken(HtmlCssParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(HtmlCssParser.SEMI, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(HtmlCssParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HtmlCssParser.NUMBER, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(HtmlCssParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(HtmlCssParser.PERCENT, i);
		}
		public List<TerminalNode> DIMENSION() { return getTokens(HtmlCssParser.DIMENSION); }
		public TerminalNode DIMENSION(int i) {
			return getToken(HtmlCssParser.DIMENSION, i);
		}
		public List<TerminalNode> STRING() { return getTokens(HtmlCssParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HtmlCssParser.STRING, i);
		}
		public List<TerminalNode> URL() { return getTokens(HtmlCssParser.URL); }
		public TerminalNode URL(int i) {
			return getToken(HtmlCssParser.URL, i);
		}
		public List<TerminalNode> HASH() { return getTokens(HtmlCssParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(HtmlCssParser.HASH, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HtmlCssParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HtmlCssParser.DOT, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HtmlCssParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HtmlCssParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HtmlCssParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HtmlCssParser.RPAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtmlCssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtmlCssParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssParserListener ) ((HtmlCssParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssParserVisitor ) return ((HtmlCssParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(IDENT);
			setState(137);
			match(COLON);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17420668370944L) != 0)) {
				{
				{
				setState(138);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17420668370944L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(SEMI);
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
		case 1:
			return element_sempred((ElementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean element_sempred(ElementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  (((ElementContext)_localctx).TAG_NAME!=null?((ElementContext)_localctx).TAG_NAME.getText():null).equalsIgnoreCase("style") ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001C\b"+
		"\u0001\n\u0001\f\u0001F\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004u\b"+
		"\u0004\n\u0004\f\u0004x\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005}\b\u0005\n\u0005\f\u0005\u0080\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0004\u0006\u0085\b\u0006\u000b\u0006\f\u0006\u0086\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008c\b\u0007\n\u0007\f\u0007"+
		"\u008f\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0003\u0001\u0000\u000f\u0010\u0002"+
		"\u0000\u0016\u0017\u001c+\u0004\u0000\u0016\u0017\u001c\u001c#$&+\u00b4"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0002L\u0001\u0000\u0000\u0000\u0004"+
		"S\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\bv\u0001\u0000"+
		"\u0000\u0000\ny\u0001\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000"+
		"\u000e\u0088\u0001\u0000\u0000\u0000\u0010\u0014\u0003\u0002\u0001\u0000"+
		"\u0011\u0014\u0005\u0007\u0000\u0000\u0012\u0014\u0005\u0006\u0000\u0000"+
		"\u0013\u0010\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000"+
		"\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0005\u0005\u0000\u0000\u001b\u001c\u0005\n\u0000\u0000\u001c"+
		" \u0004\u0001\u0000\u0001\u001d\u001f\u0003\u0006\u0003\u0000\u001e\u001d"+
		"\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000"+
		"\" \u0001\u0000\u0000\u0000#$\u0005\u0012\u0000\u0000$%\u0003\b\u0004"+
		"\u0000%&\u0005\u0013\u0000\u0000&M\u0001\u0000\u0000\u0000\'(\u0005\u0005"+
		"\u0000\u0000(,\u0005\n\u0000\u0000)+\u0003\u0006\u0003\u0000*)\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0012\u0000\u000001\u0003\u0004\u0002\u000012\u0005\u0005\u0000"+
		"\u000023\u0005\t\u0000\u000034\u0005\n\u0000\u000045\u0005\u0012\u0000"+
		"\u00005M\u0001\u0000\u0000\u000067\u0005\u0005\u0000\u00007;\u0005\n\u0000"+
		"\u00008:\u0003\u0006\u0003\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>M\u0005\u0011\u0000\u0000"+
		"?@\u0005\u0005\u0000\u0000@D\u0005\n\u0000\u0000AC\u0003\u0006\u0003\u0000"+
		"BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000GH\u0005\u0012\u0000\u0000HI\u0005\u0005\u0000\u0000IJ\u0005"+
		"\t\u0000\u0000JK\u0005\n\u0000\u0000KM\u0005\u0012\u0000\u0000L\u001a"+
		"\u0001\u0000\u0000\u0000L\'\u0001\u0000\u0000\u0000L6\u0001\u0000\u0000"+
		"\u0000L?\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NR\u0003"+
		"\u0002\u0001\u0000OR\u0005\u0007\u0000\u0000PR\u0005\u0006\u0000\u0000"+
		"QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000T\u0005\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VY\u0005\r\u0000\u0000WX\u0005\u000e\u0000\u0000XZ\u0007\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0007\u0001\u0000"+
		"\u0000\u0000[u\u0003\n\u0005\u0000\\u\u0005\u0014\u0000\u0000]u\u0005"+
		"\u0015\u0000\u0000^u\u0005+\u0000\u0000_u\u0005\u0016\u0000\u0000`u\u0005"+
		"\u0017\u0000\u0000au\u0005\u0018\u0000\u0000bu\u0005\u0019\u0000\u0000"+
		"cu\u0005\u001a\u0000\u0000du\u0005\u001b\u0000\u0000eu\u0005\u001c\u0000"+
		"\u0000fu\u0005\u001d\u0000\u0000gu\u0005\u001e\u0000\u0000hu\u0005\u001f"+
		"\u0000\u0000iu\u0005 \u0000\u0000ju\u0005!\u0000\u0000ku\u0005\"\u0000"+
		"\u0000lu\u0005#\u0000\u0000mu\u0005$\u0000\u0000nu\u0005%\u0000\u0000"+
		"ou\u0005&\u0000\u0000pu\u0005\'\u0000\u0000qu\u0005(\u0000\u0000ru\u0005"+
		")\u0000\u0000su\u0005*\u0000\u0000t[\u0001\u0000\u0000\u0000t\\\u0001"+
		"\u0000\u0000\u0000t]\u0001\u0000\u0000\u0000t^\u0001\u0000\u0000\u0000"+
		"t_\u0001\u0000\u0000\u0000t`\u0001\u0000\u0000\u0000ta\u0001\u0000\u0000"+
		"\u0000tb\u0001\u0000\u0000\u0000tc\u0001\u0000\u0000\u0000td\u0001\u0000"+
		"\u0000\u0000te\u0001\u0000\u0000\u0000tf\u0001\u0000\u0000\u0000tg\u0001"+
		"\u0000\u0000\u0000th\u0001\u0000\u0000\u0000ti\u0001\u0000\u0000\u0000"+
		"tj\u0001\u0000\u0000\u0000tk\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000"+
		"\u0000tm\u0001\u0000\u0000\u0000tn\u0001\u0000\u0000\u0000to\u0001\u0000"+
		"\u0000\u0000tp\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\t\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000yz\u0003\f\u0006\u0000z~\u0005\u0018\u0000"+
		"\u0000{}\u0003\u000e\u0007\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u0019\u0000\u0000\u0082\u000b\u0001\u0000\u0000\u0000"+
		"\u0083\u0085\u0007\u0001\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005+\u0000\u0000\u0089\u008d\u0005\u001a\u0000\u0000\u008a\u008c"+
		"\u0007\u0002\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u001b\u0000\u0000\u0091\u000f"+
		"\u0001\u0000\u0000\u0000\u000f\u0013\u0015 ,;DLQSYtv~\u0086\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
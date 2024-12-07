// Generated from /Users/code/gitcode/shardingsphere/kernel/transaction/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/TransactionDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TransactionDistSQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND_=1, OR_=2, NOT_=3, TILDE_=4, VERTICALBAR_=5, AMPERSAND_=6, SIGNEDLEFTSHIFT_=7, 
		SIGNEDRIGHTSHIFT_=8, CARET_=9, MOD_=10, COLON_=11, PLUS_=12, MINUS_=13, 
		ASTERISK_=14, SLASH_=15, BACKSLASH_=16, DOT_=17, DOTASTERISK_=18, SAFEEQ_=19, 
		DEQ_=20, EQ_=21, NEQ_=22, GT_=23, GTE_=24, LT_=25, LTE_=26, POUND_=27, 
		LP_=28, RP_=29, LBE_=30, RBE_=31, LBT_=32, RBT_=33, COMMA_=34, DQ_=35, 
		SQ_=36, BQ_=37, QUESTION_=38, AT_=39, SEMI_=40, JSONSEPARATOR_=41, UL_=42, 
		DL_=43, WS=44, SHOW=45, RULE=46, TRANSACTION=47, ALTER=48, DEFAULT=49, 
		TYPE=50, NAME=51, PROPERTIES=52, LOCAL=53, XA=54, BASE=55, ATOMIKOS=56, 
		NARAYANA=57, TRUE=58, FALSE=59, FOR_GENERATOR=60, IDENTIFIER_=61, STRING_=62, 
		INT_=63;
	public static final int
		RULE_execute = 0, RULE_showTransactionRule = 1, RULE_alterTransactionRule = 2, 
		RULE_transactionRuleDefinition = 3, RULE_providerDefinition = 4, RULE_defaultType = 5, 
		RULE_buildInDefaultTransactionType = 6, RULE_providerName = 7, RULE_buildInProviderTypeName = 8, 
		RULE_propertiesDefinition = 9, RULE_properties = 10, RULE_property = 11, 
		RULE_literal = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "showTransactionRule", "alterTransactionRule", "transactionRuleDefinition", 
			"providerDefinition", "defaultType", "buildInDefaultTransactionType", 
			"providerName", "buildInProviderTypeName", "propertiesDefinition", "properties", 
			"property", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", 
			"';'", "'->>'", "'_'", "'$'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICALBAR_", "AMPERSAND_", 
			"SIGNEDLEFTSHIFT_", "SIGNEDRIGHTSHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOTASTERISK_", 
			"SAFEEQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"BQ_", "QUESTION_", "AT_", "SEMI_", "JSONSEPARATOR_", "UL_", "DL_", "WS", 
			"SHOW", "RULE", "TRANSACTION", "ALTER", "DEFAULT", "TYPE", "NAME", "PROPERTIES", 
			"LOCAL", "XA", "BASE", "ATOMIKOS", "NARAYANA", "TRUE", "FALSE", "FOR_GENERATOR", 
			"IDENTIFIER_", "STRING_", "INT_"
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
	public String getGrammarFileName() { return "TransactionDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TransactionDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TransactionDistSQLStatementParser.EOF, 0); }
		public ShowTransactionRuleContext showTransactionRule() {
			return getRuleContext(ShowTransactionRuleContext.class,0);
		}
		public AlterTransactionRuleContext alterTransactionRule() {
			return getRuleContext(AlterTransactionRuleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(TransactionDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHOW:
				{
				setState(26);
				showTransactionRule();
				}
				break;
			case ALTER:
				{
				setState(27);
				alterTransactionRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(30);
				match(SEMI_);
				}
			}

			setState(33);
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
	public static class ShowTransactionRuleContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(TransactionDistSQLStatementParser.SHOW, 0); }
		public TerminalNode TRANSACTION() { return getToken(TransactionDistSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode RULE() { return getToken(TransactionDistSQLStatementParser.RULE, 0); }
		public ShowTransactionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTransactionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterShowTransactionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitShowTransactionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitShowTransactionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTransactionRuleContext showTransactionRule() throws RecognitionException {
		ShowTransactionRuleContext _localctx = new ShowTransactionRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_showTransactionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(SHOW);
			setState(36);
			match(TRANSACTION);
			setState(37);
			match(RULE);
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
	public static class AlterTransactionRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(TransactionDistSQLStatementParser.ALTER, 0); }
		public TerminalNode TRANSACTION() { return getToken(TransactionDistSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode RULE() { return getToken(TransactionDistSQLStatementParser.RULE, 0); }
		public TransactionRuleDefinitionContext transactionRuleDefinition() {
			return getRuleContext(TransactionRuleDefinitionContext.class,0);
		}
		public AlterTransactionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTransactionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterAlterTransactionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitAlterTransactionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitAlterTransactionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTransactionRuleContext alterTransactionRule() throws RecognitionException {
		AlterTransactionRuleContext _localctx = new AlterTransactionRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterTransactionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ALTER);
			setState(40);
			match(TRANSACTION);
			setState(41);
			match(RULE);
			setState(42);
			transactionRuleDefinition();
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
	public static class TransactionRuleDefinitionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(TransactionDistSQLStatementParser.LP_, 0); }
		public TerminalNode DEFAULT() { return getToken(TransactionDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode EQ_() { return getToken(TransactionDistSQLStatementParser.EQ_, 0); }
		public DefaultTypeContext defaultType() {
			return getRuleContext(DefaultTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(TransactionDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(TransactionDistSQLStatementParser.COMMA_, 0); }
		public ProviderDefinitionContext providerDefinition() {
			return getRuleContext(ProviderDefinitionContext.class,0);
		}
		public TransactionRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterTransactionRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitTransactionRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitTransactionRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionRuleDefinitionContext transactionRuleDefinition() throws RecognitionException {
		TransactionRuleDefinitionContext _localctx = new TransactionRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_transactionRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(LP_);
			setState(45);
			match(DEFAULT);
			setState(46);
			match(EQ_);
			setState(47);
			defaultType();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(48);
				match(COMMA_);
				setState(49);
				providerDefinition();
				}
			}

			setState(52);
			match(RP_);
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
	public static class ProviderDefinitionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(TransactionDistSQLStatementParser.TYPE, 0); }
		public TerminalNode LP_() { return getToken(TransactionDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(TransactionDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(TransactionDistSQLStatementParser.EQ_, 0); }
		public ProviderNameContext providerName() {
			return getRuleContext(ProviderNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(TransactionDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(TransactionDistSQLStatementParser.COMMA_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public ProviderDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_providerDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterProviderDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitProviderDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitProviderDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProviderDefinitionContext providerDefinition() throws RecognitionException {
		ProviderDefinitionContext _localctx = new ProviderDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_providerDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(TYPE);
			setState(55);
			match(LP_);
			setState(56);
			match(NAME);
			setState(57);
			match(EQ_);
			setState(58);
			providerName();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(59);
				match(COMMA_);
				setState(60);
				propertiesDefinition();
				}
			}

			setState(63);
			match(RP_);
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
	public static class DefaultTypeContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(TransactionDistSQLStatementParser.STRING_, 0); }
		public BuildInDefaultTransactionTypeContext buildInDefaultTransactionType() {
			return getRuleContext(BuildInDefaultTransactionTypeContext.class,0);
		}
		public DefaultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterDefaultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitDefaultType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitDefaultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultTypeContext defaultType() throws RecognitionException {
		DefaultTypeContext _localctx = new DefaultTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defaultType);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(STRING_);
				}
				break;
			case LOCAL:
			case XA:
			case BASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				buildInDefaultTransactionType();
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
	public static class BuildInDefaultTransactionTypeContext extends ParserRuleContext {
		public TerminalNode LOCAL() { return getToken(TransactionDistSQLStatementParser.LOCAL, 0); }
		public TerminalNode XA() { return getToken(TransactionDistSQLStatementParser.XA, 0); }
		public TerminalNode BASE() { return getToken(TransactionDistSQLStatementParser.BASE, 0); }
		public BuildInDefaultTransactionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInDefaultTransactionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterBuildInDefaultTransactionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitBuildInDefaultTransactionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitBuildInDefaultTransactionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInDefaultTransactionTypeContext buildInDefaultTransactionType() throws RecognitionException {
		BuildInDefaultTransactionTypeContext _localctx = new BuildInDefaultTransactionTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_buildInDefaultTransactionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63050394783186944L) != 0)) ) {
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
	public static class ProviderNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(TransactionDistSQLStatementParser.STRING_, 0); }
		public BuildInProviderTypeNameContext buildInProviderTypeName() {
			return getRuleContext(BuildInProviderTypeNameContext.class,0);
		}
		public ProviderNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_providerName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterProviderName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitProviderName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitProviderName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProviderNameContext providerName() throws RecognitionException {
		ProviderNameContext _localctx = new ProviderNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_providerName);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(STRING_);
				}
				break;
			case ATOMIKOS:
			case NARAYANA:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				buildInProviderTypeName();
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
	public static class BuildInProviderTypeNameContext extends ParserRuleContext {
		public TerminalNode ATOMIKOS() { return getToken(TransactionDistSQLStatementParser.ATOMIKOS, 0); }
		public TerminalNode NARAYANA() { return getToken(TransactionDistSQLStatementParser.NARAYANA, 0); }
		public BuildInProviderTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInProviderTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterBuildInProviderTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitBuildInProviderTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitBuildInProviderTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInProviderTypeNameContext buildInProviderTypeName() throws RecognitionException {
		BuildInProviderTypeNameContext _localctx = new BuildInProviderTypeNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_buildInProviderTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==ATOMIKOS || _la==NARAYANA) ) {
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
	public static class PropertiesDefinitionContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(TransactionDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(TransactionDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(TransactionDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefinitionContext propertiesDefinition() throws RecognitionException {
		PropertiesDefinitionContext _localctx = new PropertiesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propertiesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PROPERTIES);
			setState(78);
			match(LP_);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(79);
				properties();
				}
			}

			setState(82);
			match(RP_);
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
	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(TransactionDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(TransactionDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			property();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(85);
				match(COMMA_);
				setState(86);
				property();
				}
				}
				setState(91);
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
	public static class PropertyContext extends ParserRuleContext {
		public Token key;
		public LiteralContext value;
		public TerminalNode EQ_() { return getToken(TransactionDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(TransactionDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(93);
			match(EQ_);
			setState(94);
			((PropertyContext)_localctx).value = literal();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(TransactionDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(TransactionDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(TransactionDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(TransactionDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TransactionDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransactionDistSQLStatementListener ) ((TransactionDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TransactionDistSQLStatementVisitor ) return ((TransactionDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(97);
					match(MINUS_);
					}
				}

				setState(100);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(FALSE);
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

	public static final String _serializedATN =
		"\u0004\u0001?j\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001\u0000\u0003"+
		"\u0000 \b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00033\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004>\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005D\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007J\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\tQ\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\nX\b\n\n\n\f\n[\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\fc\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\fh\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0001\u0000"+
		"57\u0001\u000089h\u0000\u001c\u0001\u0000\u0000\u0000\u0002#\u0001\u0000"+
		"\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000"+
		"\u0000\b6\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\fE\u0001"+
		"\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010K\u0001\u0000\u0000"+
		"\u0000\u0012M\u0001\u0000\u0000\u0000\u0014T\u0001\u0000\u0000\u0000\u0016"+
		"\\\u0001\u0000\u0000\u0000\u0018g\u0001\u0000\u0000\u0000\u001a\u001d"+
		"\u0003\u0002\u0001\u0000\u001b\u001d\u0003\u0004\u0002\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001f"+
		"\u0001\u0000\u0000\u0000\u001e \u0005(\u0000\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#$\u0005-\u0000"+
		"\u0000$%\u0005/\u0000\u0000%&\u0005.\u0000\u0000&\u0003\u0001\u0000\u0000"+
		"\u0000\'(\u00050\u0000\u0000()\u0005/\u0000\u0000)*\u0005.\u0000\u0000"+
		"*+\u0003\u0006\u0003\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005\u001c"+
		"\u0000\u0000-.\u00051\u0000\u0000./\u0005\u0015\u0000\u0000/2\u0003\n"+
		"\u0005\u000001\u0005\"\u0000\u000013\u0003\b\u0004\u000020\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005"+
		"\u001d\u0000\u00005\u0007\u0001\u0000\u0000\u000067\u00052\u0000\u0000"+
		"78\u0005\u001c\u0000\u000089\u00053\u0000\u00009:\u0005\u0015\u0000\u0000"+
		":=\u0003\u000e\u0007\u0000;<\u0005\"\u0000\u0000<>\u0003\u0012\t\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0005\u001d\u0000\u0000@\t\u0001\u0000\u0000\u0000AD\u0005>\u0000"+
		"\u0000BD\u0003\f\u0006\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000"+
		"\u0000D\u000b\u0001\u0000\u0000\u0000EF\u0007\u0000\u0000\u0000F\r\u0001"+
		"\u0000\u0000\u0000GJ\u0005>\u0000\u0000HJ\u0003\u0010\b\u0000IG\u0001"+
		"\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u000f\u0001\u0000\u0000"+
		"\u0000KL\u0007\u0001\u0000\u0000L\u0011\u0001\u0000\u0000\u0000MN\u0005"+
		"4\u0000\u0000NP\u0005\u001c\u0000\u0000OQ\u0003\u0014\n\u0000PO\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RS\u0005\u001d\u0000\u0000S\u0013\u0001\u0000\u0000\u0000TY\u0003\u0016"+
		"\u000b\u0000UV\u0005\"\u0000\u0000VX\u0003\u0016\u000b\u0000WU\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\u0015\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\]\u0005>\u0000\u0000]^\u0005\u0015\u0000\u0000^_\u0003\u0018\f"+
		"\u0000_\u0017\u0001\u0000\u0000\u0000`h\u0005>\u0000\u0000ac\u0005\r\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000dh\u0005?\u0000\u0000eh\u0005:\u0000\u0000fh\u0005;\u0000"+
		"\u0000g`\u0001\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0019\u0001\u0000\u0000\u0000"+
		"\n\u001c\u001f2=CIPYbg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
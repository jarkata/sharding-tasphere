// Generated from /Users/code/gitcode/shardingsphere/kernel/global-clock/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/GlobalClockDistSQLStatement.g4 by ANTLR 4.13.2
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
public class GlobalClockDistSQLStatementParser extends Parser {
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
		DL_=43, WS=44, SHOW=45, ALTER=46, RULE=47, GLOBAL=48, CLOCK=49, TYPE=50, 
		PROVIDER=51, ENABLED=52, PROPERTIES=53, TRUE=54, FALSE=55, FOR_GENERATOR=56, 
		IDENTIFIER_=57, STRING_=58, INT_=59;
	public static final int
		RULE_execute = 0, RULE_showGlobalClockRule = 1, RULE_alterGlobalClockRule = 2, 
		RULE_globalClockRuleDefinition = 3, RULE_typeDefinition = 4, RULE_providerDefinition = 5, 
		RULE_enabledDefinition = 6, RULE_typeName = 7, RULE_providerName = 8, 
		RULE_enabled = 9, RULE_propertiesDefinition = 10, RULE_properties = 11, 
		RULE_property = 12, RULE_literal = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "showGlobalClockRule", "alterGlobalClockRule", "globalClockRuleDefinition", 
			"typeDefinition", "providerDefinition", "enabledDefinition", "typeName", 
			"providerName", "enabled", "propertiesDefinition", "properties", "property", 
			"literal"
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
			null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"SHOW", "ALTER", "RULE", "GLOBAL", "CLOCK", "TYPE", "PROVIDER", "ENABLED", 
			"PROPERTIES", "TRUE", "FALSE", "FOR_GENERATOR", "IDENTIFIER_", "STRING_", 
			"INT_"
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
	public String getGrammarFileName() { return "GlobalClockDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GlobalClockDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GlobalClockDistSQLStatementParser.EOF, 0); }
		public ShowGlobalClockRuleContext showGlobalClockRule() {
			return getRuleContext(ShowGlobalClockRuleContext.class,0);
		}
		public AlterGlobalClockRuleContext alterGlobalClockRule() {
			return getRuleContext(AlterGlobalClockRuleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(GlobalClockDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHOW:
				{
				setState(28);
				showGlobalClockRule();
				}
				break;
			case ALTER:
				{
				setState(29);
				alterGlobalClockRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(32);
				match(SEMI_);
				}
			}

			setState(35);
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
	public static class ShowGlobalClockRuleContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GlobalClockDistSQLStatementParser.SHOW, 0); }
		public TerminalNode GLOBAL() { return getToken(GlobalClockDistSQLStatementParser.GLOBAL, 0); }
		public TerminalNode CLOCK() { return getToken(GlobalClockDistSQLStatementParser.CLOCK, 0); }
		public TerminalNode RULE() { return getToken(GlobalClockDistSQLStatementParser.RULE, 0); }
		public ShowGlobalClockRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showGlobalClockRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterShowGlobalClockRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitShowGlobalClockRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitShowGlobalClockRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowGlobalClockRuleContext showGlobalClockRule() throws RecognitionException {
		ShowGlobalClockRuleContext _localctx = new ShowGlobalClockRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_showGlobalClockRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(SHOW);
			setState(38);
			match(GLOBAL);
			setState(39);
			match(CLOCK);
			setState(40);
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
	public static class AlterGlobalClockRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(GlobalClockDistSQLStatementParser.ALTER, 0); }
		public TerminalNode GLOBAL() { return getToken(GlobalClockDistSQLStatementParser.GLOBAL, 0); }
		public TerminalNode CLOCK() { return getToken(GlobalClockDistSQLStatementParser.CLOCK, 0); }
		public TerminalNode RULE() { return getToken(GlobalClockDistSQLStatementParser.RULE, 0); }
		public GlobalClockRuleDefinitionContext globalClockRuleDefinition() {
			return getRuleContext(GlobalClockRuleDefinitionContext.class,0);
		}
		public AlterGlobalClockRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterGlobalClockRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterAlterGlobalClockRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitAlterGlobalClockRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitAlterGlobalClockRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterGlobalClockRuleContext alterGlobalClockRule() throws RecognitionException {
		AlterGlobalClockRuleContext _localctx = new AlterGlobalClockRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterGlobalClockRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ALTER);
			setState(43);
			match(GLOBAL);
			setState(44);
			match(CLOCK);
			setState(45);
			match(RULE);
			setState(46);
			globalClockRuleDefinition();
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
	public static class GlobalClockRuleDefinitionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(GlobalClockDistSQLStatementParser.LP_, 0); }
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(GlobalClockDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(GlobalClockDistSQLStatementParser.COMMA_, i);
		}
		public ProviderDefinitionContext providerDefinition() {
			return getRuleContext(ProviderDefinitionContext.class,0);
		}
		public EnabledDefinitionContext enabledDefinition() {
			return getRuleContext(EnabledDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(GlobalClockDistSQLStatementParser.RP_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public GlobalClockRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalClockRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterGlobalClockRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitGlobalClockRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitGlobalClockRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalClockRuleDefinitionContext globalClockRuleDefinition() throws RecognitionException {
		GlobalClockRuleDefinitionContext _localctx = new GlobalClockRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalClockRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(LP_);
			setState(49);
			typeDefinition();
			setState(50);
			match(COMMA_);
			setState(51);
			providerDefinition();
			setState(52);
			match(COMMA_);
			setState(53);
			enabledDefinition();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(54);
				match(COMMA_);
				setState(55);
				propertiesDefinition();
				}
			}

			setState(58);
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
	public static class TypeDefinitionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GlobalClockDistSQLStatementParser.TYPE, 0); }
		public TerminalNode EQ_() { return getToken(GlobalClockDistSQLStatementParser.EQ_, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(TYPE);
			setState(61);
			match(EQ_);
			setState(62);
			typeName();
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
		public TerminalNode PROVIDER() { return getToken(GlobalClockDistSQLStatementParser.PROVIDER, 0); }
		public TerminalNode EQ_() { return getToken(GlobalClockDistSQLStatementParser.EQ_, 0); }
		public ProviderNameContext providerName() {
			return getRuleContext(ProviderNameContext.class,0);
		}
		public ProviderDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_providerDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterProviderDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitProviderDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitProviderDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProviderDefinitionContext providerDefinition() throws RecognitionException {
		ProviderDefinitionContext _localctx = new ProviderDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_providerDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(PROVIDER);
			setState(65);
			match(EQ_);
			setState(66);
			providerName();
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
	public static class EnabledDefinitionContext extends ParserRuleContext {
		public TerminalNode ENABLED() { return getToken(GlobalClockDistSQLStatementParser.ENABLED, 0); }
		public TerminalNode EQ_() { return getToken(GlobalClockDistSQLStatementParser.EQ_, 0); }
		public EnabledContext enabled() {
			return getRuleContext(EnabledContext.class,0);
		}
		public EnabledDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enabledDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterEnabledDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitEnabledDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitEnabledDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnabledDefinitionContext enabledDefinition() throws RecognitionException {
		EnabledDefinitionContext _localctx = new EnabledDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enabledDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ENABLED);
			setState(69);
			match(EQ_);
			setState(70);
			enabled();
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
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(GlobalClockDistSQLStatementParser.STRING_, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(STRING_);
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
		public TerminalNode STRING_() { return getToken(GlobalClockDistSQLStatementParser.STRING_, 0); }
		public ProviderNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_providerName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterProviderName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitProviderName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitProviderName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProviderNameContext providerName() throws RecognitionException {
		ProviderNameContext _localctx = new ProviderNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_providerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(STRING_);
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
	public static class EnabledContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GlobalClockDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GlobalClockDistSQLStatementParser.FALSE, 0); }
		public EnabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enabled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterEnabled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitEnabled(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitEnabled(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnabledContext enabled() throws RecognitionException {
		EnabledContext _localctx = new EnabledContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enabled);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
		public TerminalNode PROPERTIES() { return getToken(GlobalClockDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(GlobalClockDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(GlobalClockDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefinitionContext propertiesDefinition() throws RecognitionException {
		PropertiesDefinitionContext _localctx = new PropertiesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propertiesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(PROPERTIES);
			setState(79);
			match(LP_);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(80);
				properties();
				}
			}

			setState(83);
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
		public List<TerminalNode> COMMA_() { return getTokens(GlobalClockDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(GlobalClockDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			property();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(86);
				match(COMMA_);
				setState(87);
				property();
				}
				}
				setState(92);
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
		public TerminalNode EQ_() { return getToken(GlobalClockDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(GlobalClockDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(94);
			match(EQ_);
			setState(95);
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
		public TerminalNode STRING_() { return getToken(GlobalClockDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(GlobalClockDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(GlobalClockDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(GlobalClockDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GlobalClockDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalClockDistSQLStatementListener ) ((GlobalClockDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalClockDistSQLStatementVisitor ) return ((GlobalClockDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(98);
					match(MINUS_);
					}
				}

				setState(101);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
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
		"\u0004\u0001;k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0003\u0000\u001f\b\u0000\u0001"+
		"\u0000\u0003\u0000\"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00039\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\nR\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bY\b\u000b\n"+
		"\u000b\f\u000b\\\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0003\rd\b\r\u0001\r\u0001\r\u0001\r\u0003\ri\b\r\u0001\r\u0000\u0000"+
		"\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u0000\u0001\u0001\u000067e\u0000\u001e\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u00060"+
		"\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000"+
		"\u0000\fD\u0001\u0000\u0000\u0000\u000eH\u0001\u0000\u0000\u0000\u0010"+
		"J\u0001\u0000\u0000\u0000\u0012L\u0001\u0000\u0000\u0000\u0014N\u0001"+
		"\u0000\u0000\u0000\u0016U\u0001\u0000\u0000\u0000\u0018]\u0001\u0000\u0000"+
		"\u0000\u001ah\u0001\u0000\u0000\u0000\u001c\u001f\u0003\u0002\u0001\u0000"+
		"\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001d\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \""+
		"\u0005(\u0000\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000"+
		"\u0000\u0000%&\u0005-\u0000\u0000&\'\u00050\u0000\u0000\'(\u00051\u0000"+
		"\u0000()\u0005/\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0005.\u0000"+
		"\u0000+,\u00050\u0000\u0000,-\u00051\u0000\u0000-.\u0005/\u0000\u0000"+
		"./\u0003\u0006\u0003\u0000/\u0005\u0001\u0000\u0000\u000001\u0005\u001c"+
		"\u0000\u000012\u0003\b\u0004\u000023\u0005\"\u0000\u000034\u0003\n\u0005"+
		"\u000045\u0005\"\u0000\u000058\u0003\f\u0006\u000067\u0005\"\u0000\u0000"+
		"79\u0003\u0014\n\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:;\u0005\u001d\u0000\u0000;\u0007\u0001\u0000"+
		"\u0000\u0000<=\u00052\u0000\u0000=>\u0005\u0015\u0000\u0000>?\u0003\u000e"+
		"\u0007\u0000?\t\u0001\u0000\u0000\u0000@A\u00053\u0000\u0000AB\u0005\u0015"+
		"\u0000\u0000BC\u0003\u0010\b\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0005"+
		"4\u0000\u0000EF\u0005\u0015\u0000\u0000FG\u0003\u0012\t\u0000G\r\u0001"+
		"\u0000\u0000\u0000HI\u0005:\u0000\u0000I\u000f\u0001\u0000\u0000\u0000"+
		"JK\u0005:\u0000\u0000K\u0011\u0001\u0000\u0000\u0000LM\u0007\u0000\u0000"+
		"\u0000M\u0013\u0001\u0000\u0000\u0000NO\u00055\u0000\u0000OQ\u0005\u001c"+
		"\u0000\u0000PR\u0003\u0016\u000b\u0000QP\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\u001d\u0000\u0000"+
		"T\u0015\u0001\u0000\u0000\u0000UZ\u0003\u0018\f\u0000VW\u0005\"\u0000"+
		"\u0000WY\u0003\u0018\f\u0000XV\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0017"+
		"\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005:\u0000\u0000"+
		"^_\u0005\u0015\u0000\u0000_`\u0003\u001a\r\u0000`\u0019\u0001\u0000\u0000"+
		"\u0000ai\u0005:\u0000\u0000bd\u0005\r\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ei\u0005;\u0000"+
		"\u0000fi\u00056\u0000\u0000gi\u00057\u0000\u0000ha\u0001\u0000\u0000\u0000"+
		"hc\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000i\u001b\u0001\u0000\u0000\u0000\u0007\u001e!8QZch";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
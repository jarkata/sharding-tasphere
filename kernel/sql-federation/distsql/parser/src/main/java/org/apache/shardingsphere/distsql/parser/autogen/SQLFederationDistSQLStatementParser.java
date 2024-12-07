// Generated from /Users/code/gitcode/shardingsphere/kernel/sql-federation/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SQLFederationDistSQLStatement.g4 by ANTLR 4.13.2
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
public class SQLFederationDistSQLStatementParser extends Parser {
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
		DL_=43, WS=44, SHOW=45, ALTER=46, RULE=47, SQL_FEDERATION=48, SQL_FEDERATION_ENABLED=49, 
		ALL_QUERY_USE_SQL_FEDERATION=50, EXECUTION_PLAN_CACHE=51, INITIAL_CAPACITY=52, 
		MAXIMUM_SIZE=53, TRUE=54, FALSE=55, FOR_GENERATOR=56, IDENTIFIER_=57, 
		STRING_=58, INT_=59;
	public static final int
		RULE_execute = 0, RULE_showSQLFederationRule = 1, RULE_alterSQLFederationRule = 2, 
		RULE_sqlFederationRuleDefinition = 3, RULE_sqlFederationEnabled = 4, RULE_allQueryUseSQLFederation = 5, 
		RULE_executionPlanCache = 6, RULE_boolean_ = 7, RULE_cacheOption = 8, 
		RULE_initialCapacity = 9, RULE_maximumSize = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "showSQLFederationRule", "alterSQLFederationRule", "sqlFederationRuleDefinition", 
			"sqlFederationEnabled", "allQueryUseSQLFederation", "executionPlanCache", 
			"boolean_", "cacheOption", "initialCapacity", "maximumSize"
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
			"SHOW", "ALTER", "RULE", "SQL_FEDERATION", "SQL_FEDERATION_ENABLED", 
			"ALL_QUERY_USE_SQL_FEDERATION", "EXECUTION_PLAN_CACHE", "INITIAL_CAPACITY", 
			"MAXIMUM_SIZE", "TRUE", "FALSE", "FOR_GENERATOR", "IDENTIFIER_", "STRING_", 
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
	public String getGrammarFileName() { return "SQLFederationDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLFederationDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLFederationDistSQLStatementParser.EOF, 0); }
		public ShowSQLFederationRuleContext showSQLFederationRule() {
			return getRuleContext(ShowSQLFederationRuleContext.class,0);
		}
		public AlterSQLFederationRuleContext alterSQLFederationRule() {
			return getRuleContext(AlterSQLFederationRuleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQLFederationDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHOW:
				{
				setState(22);
				showSQLFederationRule();
				}
				break;
			case ALTER:
				{
				setState(23);
				alterSQLFederationRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(26);
				match(SEMI_);
				}
			}

			setState(29);
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
	public static class ShowSQLFederationRuleContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SQLFederationDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SQL_FEDERATION() { return getToken(SQLFederationDistSQLStatementParser.SQL_FEDERATION, 0); }
		public TerminalNode RULE() { return getToken(SQLFederationDistSQLStatementParser.RULE, 0); }
		public ShowSQLFederationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showSQLFederationRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterShowSQLFederationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitShowSQLFederationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitShowSQLFederationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowSQLFederationRuleContext showSQLFederationRule() throws RecognitionException {
		ShowSQLFederationRuleContext _localctx = new ShowSQLFederationRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_showSQLFederationRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(SHOW);
			setState(32);
			match(SQL_FEDERATION);
			setState(33);
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
	public static class AlterSQLFederationRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLFederationDistSQLStatementParser.ALTER, 0); }
		public TerminalNode SQL_FEDERATION() { return getToken(SQLFederationDistSQLStatementParser.SQL_FEDERATION, 0); }
		public TerminalNode RULE() { return getToken(SQLFederationDistSQLStatementParser.RULE, 0); }
		public SqlFederationRuleDefinitionContext sqlFederationRuleDefinition() {
			return getRuleContext(SqlFederationRuleDefinitionContext.class,0);
		}
		public AlterSQLFederationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSQLFederationRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterAlterSQLFederationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitAlterSQLFederationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitAlterSQLFederationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSQLFederationRuleContext alterSQLFederationRule() throws RecognitionException {
		AlterSQLFederationRuleContext _localctx = new AlterSQLFederationRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterSQLFederationRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(ALTER);
			setState(36);
			match(SQL_FEDERATION);
			setState(37);
			match(RULE);
			setState(38);
			sqlFederationRuleDefinition();
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
	public static class SqlFederationRuleDefinitionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLFederationDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLFederationDistSQLStatementParser.RP_, 0); }
		public SqlFederationEnabledContext sqlFederationEnabled() {
			return getRuleContext(SqlFederationEnabledContext.class,0);
		}
		public AllQueryUseSQLFederationContext allQueryUseSQLFederation() {
			return getRuleContext(AllQueryUseSQLFederationContext.class,0);
		}
		public ExecutionPlanCacheContext executionPlanCache() {
			return getRuleContext(ExecutionPlanCacheContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLFederationDistSQLStatementParser.COMMA_, 0); }
		public SqlFederationRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFederationRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterSqlFederationRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitSqlFederationRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitSqlFederationRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlFederationRuleDefinitionContext sqlFederationRuleDefinition() throws RecognitionException {
		SqlFederationRuleDefinitionContext _localctx = new SqlFederationRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sqlFederationRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(LP_);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL_FEDERATION_ENABLED) {
				{
				setState(41);
				sqlFederationEnabled();
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL_QUERY_USE_SQL_FEDERATION) {
				{
				setState(44);
				allQueryUseSQLFederation();
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==EXECUTION_PLAN_CACHE) {
				{
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(47);
					match(COMMA_);
					}
				}

				setState(50);
				executionPlanCache();
				}
			}

			setState(53);
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
	public static class SqlFederationEnabledContext extends ParserRuleContext {
		public TerminalNode SQL_FEDERATION_ENABLED() { return getToken(SQLFederationDistSQLStatementParser.SQL_FEDERATION_ENABLED, 0); }
		public TerminalNode EQ_() { return getToken(SQLFederationDistSQLStatementParser.EQ_, 0); }
		public Boolean_Context boolean_() {
			return getRuleContext(Boolean_Context.class,0);
		}
		public SqlFederationEnabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFederationEnabled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterSqlFederationEnabled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitSqlFederationEnabled(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitSqlFederationEnabled(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlFederationEnabledContext sqlFederationEnabled() throws RecognitionException {
		SqlFederationEnabledContext _localctx = new SqlFederationEnabledContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sqlFederationEnabled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(SQL_FEDERATION_ENABLED);
			setState(56);
			match(EQ_);
			setState(57);
			boolean_();
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
	public static class AllQueryUseSQLFederationContext extends ParserRuleContext {
		public TerminalNode ALL_QUERY_USE_SQL_FEDERATION() { return getToken(SQLFederationDistSQLStatementParser.ALL_QUERY_USE_SQL_FEDERATION, 0); }
		public TerminalNode EQ_() { return getToken(SQLFederationDistSQLStatementParser.EQ_, 0); }
		public Boolean_Context boolean_() {
			return getRuleContext(Boolean_Context.class,0);
		}
		public AllQueryUseSQLFederationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allQueryUseSQLFederation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterAllQueryUseSQLFederation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitAllQueryUseSQLFederation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitAllQueryUseSQLFederation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllQueryUseSQLFederationContext allQueryUseSQLFederation() throws RecognitionException {
		AllQueryUseSQLFederationContext _localctx = new AllQueryUseSQLFederationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_allQueryUseSQLFederation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ALL_QUERY_USE_SQL_FEDERATION);
			setState(60);
			match(EQ_);
			setState(61);
			boolean_();
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
	public static class ExecutionPlanCacheContext extends ParserRuleContext {
		public TerminalNode EXECUTION_PLAN_CACHE() { return getToken(SQLFederationDistSQLStatementParser.EXECUTION_PLAN_CACHE, 0); }
		public TerminalNode LP_() { return getToken(SQLFederationDistSQLStatementParser.LP_, 0); }
		public CacheOptionContext cacheOption() {
			return getRuleContext(CacheOptionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLFederationDistSQLStatementParser.RP_, 0); }
		public ExecutionPlanCacheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executionPlanCache; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterExecutionPlanCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitExecutionPlanCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitExecutionPlanCache(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecutionPlanCacheContext executionPlanCache() throws RecognitionException {
		ExecutionPlanCacheContext _localctx = new ExecutionPlanCacheContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_executionPlanCache);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(EXECUTION_PLAN_CACHE);
			setState(64);
			match(LP_);
			setState(65);
			cacheOption();
			setState(66);
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
	public static class Boolean_Context extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQLFederationDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLFederationDistSQLStatementParser.FALSE, 0); }
		public Boolean_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterBoolean_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitBoolean_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitBoolean_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_Context boolean_() throws RecognitionException {
		Boolean_Context _localctx = new Boolean_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolean_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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
	public static class CacheOptionContext extends ParserRuleContext {
		public TerminalNode INITIAL_CAPACITY() { return getToken(SQLFederationDistSQLStatementParser.INITIAL_CAPACITY, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLFederationDistSQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLFederationDistSQLStatementParser.EQ_, i);
		}
		public InitialCapacityContext initialCapacity() {
			return getRuleContext(InitialCapacityContext.class,0);
		}
		public TerminalNode MAXIMUM_SIZE() { return getToken(SQLFederationDistSQLStatementParser.MAXIMUM_SIZE, 0); }
		public MaximumSizeContext maximumSize() {
			return getRuleContext(MaximumSizeContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLFederationDistSQLStatementParser.COMMA_, 0); }
		public CacheOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cacheOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterCacheOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitCacheOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitCacheOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CacheOptionContext cacheOption() throws RecognitionException {
		CacheOptionContext _localctx = new CacheOptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cacheOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL_CAPACITY) {
				{
				setState(70);
				match(INITIAL_CAPACITY);
				setState(71);
				match(EQ_);
				setState(72);
				initialCapacity();
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==MAXIMUM_SIZE) {
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(75);
					match(COMMA_);
					}
				}

				setState(78);
				match(MAXIMUM_SIZE);
				setState(79);
				match(EQ_);
				setState(80);
				maximumSize();
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
	public static class InitialCapacityContext extends ParserRuleContext {
		public TerminalNode INT_() { return getToken(SQLFederationDistSQLStatementParser.INT_, 0); }
		public InitialCapacityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialCapacity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterInitialCapacity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitInitialCapacity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitInitialCapacity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialCapacityContext initialCapacity() throws RecognitionException {
		InitialCapacityContext _localctx = new InitialCapacityContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_initialCapacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(INT_);
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
	public static class MaximumSizeContext extends ParserRuleContext {
		public TerminalNode INT_() { return getToken(SQLFederationDistSQLStatementParser.INT_, 0); }
		public MaximumSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximumSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).enterMaximumSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLFederationDistSQLStatementListener ) ((SQLFederationDistSQLStatementListener)listener).exitMaximumSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLFederationDistSQLStatementVisitor ) return ((SQLFederationDistSQLStatementVisitor<? extends T>)visitor).visitMaximumSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaximumSizeContext maximumSize() throws RecognitionException {
		MaximumSizeContext _localctx = new MaximumSizeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_maximumSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(INT_);
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
		"\u0004\u0001;X\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0019\b\u0000\u0001\u0000\u0003\u0000\u001c\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003+\b\u0003\u0001\u0003\u0003\u0003.\b\u0003\u0001\u0003\u0003\u0003"+
		"1\b\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\bJ\b\b\u0001"+
		"\b\u0003\bM\b\b\u0001\b\u0001\b\u0001\b\u0003\bR\b\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0001\u0001\u000067U\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000"+
		"\u0000\u0006(\u0001\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\n;\u0001"+
		"\u0000\u0000\u0000\f?\u0001\u0000\u0000\u0000\u000eD\u0001\u0000\u0000"+
		"\u0000\u0010I\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000\u0000\u0014"+
		"U\u0001\u0000\u0000\u0000\u0016\u0019\u0003\u0002\u0001\u0000\u0017\u0019"+
		"\u0003\u0004\u0002\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u001c"+
		"\u0005(\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\u0000\u0000\u0001\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0005-\u0000"+
		"\u0000 !\u00050\u0000\u0000!\"\u0005/\u0000\u0000\"\u0003\u0001\u0000"+
		"\u0000\u0000#$\u0005.\u0000\u0000$%\u00050\u0000\u0000%&\u0005/\u0000"+
		"\u0000&\'\u0003\u0006\u0003\u0000\'\u0005\u0001\u0000\u0000\u0000(*\u0005"+
		"\u001c\u0000\u0000)+\u0003\b\u0004\u0000*)\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,.\u0003\n\u0005\u0000-,\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.3\u0001\u0000\u0000\u0000"+
		"/1\u0005\"\u0000\u00000/\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000024\u0003\f\u0006\u000030\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005\u001d\u0000"+
		"\u00006\u0007\u0001\u0000\u0000\u000078\u00051\u0000\u000089\u0005\u0015"+
		"\u0000\u00009:\u0003\u000e\u0007\u0000:\t\u0001\u0000\u0000\u0000;<\u0005"+
		"2\u0000\u0000<=\u0005\u0015\u0000\u0000=>\u0003\u000e\u0007\u0000>\u000b"+
		"\u0001\u0000\u0000\u0000?@\u00053\u0000\u0000@A\u0005\u001c\u0000\u0000"+
		"AB\u0003\u0010\b\u0000BC\u0005\u001d\u0000\u0000C\r\u0001\u0000\u0000"+
		"\u0000DE\u0007\u0000\u0000\u0000E\u000f\u0001\u0000\u0000\u0000FG\u0005"+
		"4\u0000\u0000GH\u0005\u0015\u0000\u0000HJ\u0003\u0012\t\u0000IF\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JQ\u0001\u0000\u0000\u0000"+
		"KM\u0005\"\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NO\u00055\u0000\u0000OP\u0005\u0015\u0000\u0000"+
		"PR\u0003\u0014\n\u0000QL\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"R\u0011\u0001\u0000\u0000\u0000ST\u0005;\u0000\u0000T\u0013\u0001\u0000"+
		"\u0000\u0000UV\u0005;\u0000\u0000V\u0015\u0001\u0000\u0000\u0000\t\u0018"+
		"\u001b*-03ILQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
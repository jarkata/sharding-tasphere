// Generated from /Users/code/gitcode/shardingsphere/kernel/sql-parser/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SQLParserDistSQLStatement.g4 by ANTLR 4.13.2
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
public class SQLParserDistSQLStatementParser extends Parser {
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
		DL_=43, WS=44, SHOW=45, ALTER=46, RULE=47, SQL_PARSER=48, PARSE_TREE_CACHE=49, 
		SQL_STATEMENT_CACHE=50, INITIAL_CAPACITY=51, MAXIMUM_SIZE=52, TRUE=53, 
		FALSE=54, FOR_GENERATOR=55, IDENTIFIER_=56, STRING_=57, INT_=58;
	public static final int
		RULE_execute = 0, RULE_showSQLParserRule = 1, RULE_alterSQLParserRule = 2, 
		RULE_sqlParserRuleDefinition = 3, RULE_parseTreeCacheDefinition = 4, RULE_sqlStatementCacheDefinition = 5, 
		RULE_cacheOption = 6, RULE_initialCapacity = 7, RULE_maximumSize = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "showSQLParserRule", "alterSQLParserRule", "sqlParserRuleDefinition", 
			"parseTreeCacheDefinition", "sqlStatementCacheDefinition", "cacheOption", 
			"initialCapacity", "maximumSize"
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
			null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"SHOW", "ALTER", "RULE", "SQL_PARSER", "PARSE_TREE_CACHE", "SQL_STATEMENT_CACHE", 
			"INITIAL_CAPACITY", "MAXIMUM_SIZE", "TRUE", "FALSE", "FOR_GENERATOR", 
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
	public String getGrammarFileName() { return "SQLParserDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParserDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParserDistSQLStatementParser.EOF, 0); }
		public ShowSQLParserRuleContext showSQLParserRule() {
			return getRuleContext(ShowSQLParserRuleContext.class,0);
		}
		public AlterSQLParserRuleContext alterSQLParserRule() {
			return getRuleContext(AlterSQLParserRuleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQLParserDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserDistSQLStatementVisitor ) return ((SQLParserDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHOW:
				{
				setState(18);
				showSQLParserRule();
				}
				break;
			case ALTER:
				{
				setState(19);
				alterSQLParserRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(22);
				match(SEMI_);
				}
			}

			setState(25);
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
	public static class ShowSQLParserRuleContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SQLParserDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SQL_PARSER() { return getToken(SQLParserDistSQLStatementParser.SQL_PARSER, 0); }
		public TerminalNode RULE() { return getToken(SQLParserDistSQLStatementParser.RULE, 0); }
		public ShowSQLParserRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showSQLParserRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).enterShowSQLParserRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).exitShowSQLParserRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserDistSQLStatementVisitor ) return ((SQLParserDistSQLStatementVisitor<? extends T>)visitor).visitShowSQLParserRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowSQLParserRuleContext showSQLParserRule() throws RecognitionException {
		ShowSQLParserRuleContext _localctx = new ShowSQLParserRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_showSQLParserRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(SHOW);
			setState(28);
			match(SQL_PARSER);
			setState(29);
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
	public static class AlterSQLParserRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLParserDistSQLStatementParser.ALTER, 0); }
		public TerminalNode SQL_PARSER() { return getToken(SQLParserDistSQLStatementParser.SQL_PARSER, 0); }
		public TerminalNode RULE() { return getToken(SQLParserDistSQLStatementParser.RULE, 0); }
		public SqlParserRuleDefinitionContext sqlParserRuleDefinition() {
			return getRuleContext(SqlParserRuleDefinitionContext.class,0);
		}
		public AlterSQLParserRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSQLParserRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).enterAlterSQLParserRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).exitAlterSQLParserRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserDistSQLStatementVisitor ) return ((SQLParserDistSQLStatementVisitor<? extends T>)visitor).visitAlterSQLParserRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSQLParserRuleContext alterSQLParserRule() throws RecognitionException {
		AlterSQLParserRuleContext _localctx = new AlterSQLParserRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterSQLParserRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(ALTER);
			setState(32);
			match(SQL_PARSER);
			setState(33);
			match(RULE);
			setState(34);
			sqlParserRuleDefinition();
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
	public static class SqlParserRuleDefinitionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLParserDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLParserDistSQLStatementParser.RP_, 0); }
		public ParseTreeCacheDefinitionContext parseTreeCacheDefinition() {
			return getRuleContext(ParseTreeCacheDefinitionContext.class,0);
		}
		public SqlStatementCacheDefinitionContext sqlStatementCacheDefinition() {
			return getRuleContext(SqlStatementCacheDefinitionContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLParserDistSQLStatementParser.COMMA_, 0); }
		public SqlParserRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlParserRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).enterSqlParserRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).exitSqlParserRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserDistSQLStatementVisitor ) return ((SQLParserDistSQLStatementVisitor<? extends T>)visitor).visitSqlParserRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlParserRuleDefinitionContext sqlParserRuleDefinition() throws RecognitionException {
		SqlParserRuleDefinitionContext _localctx = new SqlParserRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sqlParserRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(LP_);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARSE_TREE_CACHE) {
				{
				setState(37);
				parseTreeCacheDefinition();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==SQL_STATEMENT_CACHE) {
				{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(40);
					match(COMMA_);
					}
				}

				setState(43);
				sqlStatementCacheDefinition();
				}
			}

			setState(46);
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
	public static class ParseTreeCacheDefinitionContext extends ParserRuleContext {
		public TerminalNode PARSE_TREE_CACHE() { return getToken(SQLParserDistSQLStatementParser.PARSE_TREE_CACHE, 0); }
		public TerminalNode LP_() { return getToken(SQLParserDistSQLStatementParser.LP_, 0); }
		public CacheOptionContext cacheOption() {
			return getRuleContext(CacheOptionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLParserDistSQLStatementParser.RP_, 0); }
		public ParseTreeCacheDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseTreeCacheDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).enterParseTreeCacheDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).exitParseTreeCacheDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserDistSQLStatementVisitor ) return ((SQLParserDistSQLStatementVisitor<? extends T>)visitor).visitParseTreeCacheDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseTreeCacheDefinitionContext parseTreeCacheDefinition() throws RecognitionException {
		ParseTreeCacheDefinitionContext _localctx = new ParseTreeCacheDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parseTreeCacheDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(PARSE_TREE_CACHE);
			setState(49);
			match(LP_);
			setState(50);
			cacheOption();
			setState(51);
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
	public static class SqlStatementCacheDefinitionContext extends ParserRuleContext {
		public TerminalNode SQL_STATEMENT_CACHE() { return getToken(SQLParserDistSQLStatementParser.SQL_STATEMENT_CACHE, 0); }
		public TerminalNode LP_() { return getToken(SQLParserDistSQLStatementParser.LP_, 0); }
		public CacheOptionContext cacheOption() {
			return getRuleContext(CacheOptionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLParserDistSQLStatementParser.RP_, 0); }
		public SqlStatementCacheDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatementCacheDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).enterSqlStatementCacheDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).exitSqlStatementCacheDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserDistSQLStatementVisitor ) return ((SQLParserDistSQLStatementVisitor<? extends T>)visitor).visitSqlStatementCacheDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementCacheDefinitionContext sqlStatementCacheDefinition() throws RecognitionException {
		SqlStatementCacheDefinitionContext _localctx = new SqlStatementCacheDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sqlStatementCacheDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(SQL_STATEMENT_CACHE);
			setState(54);
			match(LP_);
			setState(55);
			cacheOption();
			setState(56);
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
	public static class CacheOptionContext extends ParserRuleContext {
		public TerminalNode INITIAL_CAPACITY() { return getToken(SQLParserDistSQLStatementParser.INITIAL_CAPACITY, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLParserDistSQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLParserDistSQLStatementParser.EQ_, i);
		}
		public InitialCapacityContext initialCapacity() {
			return getRuleContext(InitialCapacityContext.class,0);
		}
		public TerminalNode MAXIMUM_SIZE() { return getToken(SQLParserDistSQLStatementParser.MAXIMUM_SIZE, 0); }
		public MaximumSizeContext maximumSize() {
			return getRuleContext(MaximumSizeContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLParserDistSQLStatementParser.COMMA_, 0); }
		public CacheOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cacheOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).enterCacheOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).exitCacheOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserDistSQLStatementVisitor ) return ((SQLParserDistSQLStatementVisitor<? extends T>)visitor).visitCacheOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CacheOptionContext cacheOption() throws RecognitionException {
		CacheOptionContext _localctx = new CacheOptionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cacheOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL_CAPACITY) {
				{
				setState(58);
				match(INITIAL_CAPACITY);
				setState(59);
				match(EQ_);
				setState(60);
				initialCapacity();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==MAXIMUM_SIZE) {
				{
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(63);
					match(COMMA_);
					}
				}

				setState(66);
				match(MAXIMUM_SIZE);
				setState(67);
				match(EQ_);
				setState(68);
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
		public TerminalNode INT_() { return getToken(SQLParserDistSQLStatementParser.INT_, 0); }
		public InitialCapacityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialCapacity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).enterInitialCapacity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).exitInitialCapacity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserDistSQLStatementVisitor ) return ((SQLParserDistSQLStatementVisitor<? extends T>)visitor).visitInitialCapacity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialCapacityContext initialCapacity() throws RecognitionException {
		InitialCapacityContext _localctx = new InitialCapacityContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initialCapacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
		public TerminalNode INT_() { return getToken(SQLParserDistSQLStatementParser.INT_, 0); }
		public MaximumSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximumSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).enterMaximumSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserDistSQLStatementListener ) ((SQLParserDistSQLStatementListener)listener).exitMaximumSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserDistSQLStatementVisitor ) return ((SQLParserDistSQLStatementVisitor<? extends T>)visitor).visitMaximumSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaximumSizeContext maximumSize() throws RecognitionException {
		MaximumSizeContext _localctx = new MaximumSizeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_maximumSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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
		"\u0004\u0001:L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001\u0000\u0003"+
		"\u0000\u0018\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001\u0003\u0003"+
		"\u0003*\b\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006>\b\u0006\u0001\u0006\u0003\u0006A\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006F\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0000\u0000J\u0000\u0014\u0001\u0000\u0000\u0000\u0002"+
		"\u001b\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006"+
		"$\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000"+
		"\u0000\f=\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010"+
		"I\u0001\u0000\u0000\u0000\u0012\u0015\u0003\u0002\u0001\u0000\u0013\u0015"+
		"\u0003\u0004\u0002\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0017\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\u0005(\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"-\u0000\u0000\u001c\u001d\u00050\u0000\u0000\u001d\u001e\u0005/\u0000"+
		"\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005.\u0000\u0000 "+
		"!\u00050\u0000\u0000!\"\u0005/\u0000\u0000\"#\u0003\u0006\u0003\u0000"+
		"#\u0005\u0001\u0000\u0000\u0000$&\u0005\u001c\u0000\u0000%\'\u0003\b\u0004"+
		"\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\',\u0001\u0000"+
		"\u0000\u0000(*\u0005\"\u0000\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0003\n\u0005\u0000,)\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005"+
		"\u001d\u0000\u0000/\u0007\u0001\u0000\u0000\u000001\u00051\u0000\u0000"+
		"12\u0005\u001c\u0000\u000023\u0003\f\u0006\u000034\u0005\u001d\u0000\u0000"+
		"4\t\u0001\u0000\u0000\u000056\u00052\u0000\u000067\u0005\u001c\u0000\u0000"+
		"78\u0003\f\u0006\u000089\u0005\u001d\u0000\u00009\u000b\u0001\u0000\u0000"+
		"\u0000:;\u00053\u0000\u0000;<\u0005\u0015\u0000\u0000<>\u0003\u000e\u0007"+
		"\u0000=:\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>E\u0001\u0000"+
		"\u0000\u0000?A\u0005\"\u0000\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u00054\u0000\u0000CD\u0005\u0015"+
		"\u0000\u0000DF\u0003\u0010\b\u0000E@\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000F\r\u0001\u0000\u0000\u0000GH\u0005:\u0000\u0000H\u000f\u0001"+
		"\u0000\u0000\u0000IJ\u0005:\u0000\u0000J\u0011\u0001\u0000\u0000\u0000"+
		"\b\u0014\u0017&),=@E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
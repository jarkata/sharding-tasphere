// Generated from /Users/code/gitcode/shardingsphere/kernel/sql-translator/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SQLTranslatorDistSQLStatement.g4 by ANTLR 4.13.2
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
public class SQLTranslatorDistSQLStatementParser extends Parser {
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
		DL_=43, WS=44, SHOW=45, RULE=46, SQL_TRANSLATOR=47, USE_ORIGINAL_SQL_WHEN_TRANSLATING_FAILED=48, 
		ALTER=49, TYPE=50, NATIVE=51, NAME=52, PROPERTIES=53, TRUE=54, FALSE=55, 
		FOR_GENERATOR=56, IDENTIFIER_=57, STRING_=58, INT_=59;
	public static final int
		RULE_execute = 0, RULE_showSQLTranslatorRule = 1, RULE_alterSQLTranslatorRule = 2, 
		RULE_sqlTranslatorRuleDefinition = 3, RULE_useOriginalSQLDefinition = 4, 
		RULE_useOriginalSQL = 5, RULE_algorithmDefinition = 6, RULE_algorithmTypeName = 7, 
		RULE_buildInProviderTypeName = 8, RULE_propertiesDefinition = 9, RULE_properties = 10, 
		RULE_property = 11, RULE_literal = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "showSQLTranslatorRule", "alterSQLTranslatorRule", "sqlTranslatorRuleDefinition", 
			"useOriginalSQLDefinition", "useOriginalSQL", "algorithmDefinition", 
			"algorithmTypeName", "buildInProviderTypeName", "propertiesDefinition", 
			"properties", "property", "literal"
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
			"SHOW", "RULE", "SQL_TRANSLATOR", "USE_ORIGINAL_SQL_WHEN_TRANSLATING_FAILED", 
			"ALTER", "TYPE", "NATIVE", "NAME", "PROPERTIES", "TRUE", "FALSE", "FOR_GENERATOR", 
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
	public String getGrammarFileName() { return "SQLTranslatorDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLTranslatorDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLTranslatorDistSQLStatementParser.EOF, 0); }
		public ShowSQLTranslatorRuleContext showSQLTranslatorRule() {
			return getRuleContext(ShowSQLTranslatorRuleContext.class,0);
		}
		public AlterSQLTranslatorRuleContext alterSQLTranslatorRule() {
			return getRuleContext(AlterSQLTranslatorRuleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQLTranslatorDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
				showSQLTranslatorRule();
				}
				break;
			case ALTER:
				{
				setState(27);
				alterSQLTranslatorRule();
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
	public static class ShowSQLTranslatorRuleContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SQLTranslatorDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SQL_TRANSLATOR() { return getToken(SQLTranslatorDistSQLStatementParser.SQL_TRANSLATOR, 0); }
		public TerminalNode RULE() { return getToken(SQLTranslatorDistSQLStatementParser.RULE, 0); }
		public ShowSQLTranslatorRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showSQLTranslatorRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterShowSQLTranslatorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitShowSQLTranslatorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitShowSQLTranslatorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowSQLTranslatorRuleContext showSQLTranslatorRule() throws RecognitionException {
		ShowSQLTranslatorRuleContext _localctx = new ShowSQLTranslatorRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_showSQLTranslatorRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(SHOW);
			setState(36);
			match(SQL_TRANSLATOR);
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
	public static class AlterSQLTranslatorRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLTranslatorDistSQLStatementParser.ALTER, 0); }
		public TerminalNode SQL_TRANSLATOR() { return getToken(SQLTranslatorDistSQLStatementParser.SQL_TRANSLATOR, 0); }
		public TerminalNode RULE() { return getToken(SQLTranslatorDistSQLStatementParser.RULE, 0); }
		public TerminalNode LP_() { return getToken(SQLTranslatorDistSQLStatementParser.LP_, 0); }
		public SqlTranslatorRuleDefinitionContext sqlTranslatorRuleDefinition() {
			return getRuleContext(SqlTranslatorRuleDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLTranslatorDistSQLStatementParser.RP_, 0); }
		public AlterSQLTranslatorRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSQLTranslatorRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterAlterSQLTranslatorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitAlterSQLTranslatorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitAlterSQLTranslatorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSQLTranslatorRuleContext alterSQLTranslatorRule() throws RecognitionException {
		AlterSQLTranslatorRuleContext _localctx = new AlterSQLTranslatorRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterSQLTranslatorRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ALTER);
			setState(40);
			match(SQL_TRANSLATOR);
			setState(41);
			match(RULE);
			setState(42);
			match(LP_);
			setState(43);
			sqlTranslatorRuleDefinition();
			setState(44);
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
	public static class SqlTranslatorRuleDefinitionContext extends ParserRuleContext {
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLTranslatorDistSQLStatementParser.COMMA_, 0); }
		public UseOriginalSQLDefinitionContext useOriginalSQLDefinition() {
			return getRuleContext(UseOriginalSQLDefinitionContext.class,0);
		}
		public SqlTranslatorRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTranslatorRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterSqlTranslatorRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitSqlTranslatorRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitSqlTranslatorRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTranslatorRuleDefinitionContext sqlTranslatorRuleDefinition() throws RecognitionException {
		SqlTranslatorRuleDefinitionContext _localctx = new SqlTranslatorRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sqlTranslatorRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			algorithmDefinition();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(47);
				match(COMMA_);
				setState(48);
				useOriginalSQLDefinition();
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
	public static class UseOriginalSQLDefinitionContext extends ParserRuleContext {
		public TerminalNode USE_ORIGINAL_SQL_WHEN_TRANSLATING_FAILED() { return getToken(SQLTranslatorDistSQLStatementParser.USE_ORIGINAL_SQL_WHEN_TRANSLATING_FAILED, 0); }
		public TerminalNode EQ_() { return getToken(SQLTranslatorDistSQLStatementParser.EQ_, 0); }
		public UseOriginalSQLContext useOriginalSQL() {
			return getRuleContext(UseOriginalSQLContext.class,0);
		}
		public UseOriginalSQLDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useOriginalSQLDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterUseOriginalSQLDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitUseOriginalSQLDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitUseOriginalSQLDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseOriginalSQLDefinitionContext useOriginalSQLDefinition() throws RecognitionException {
		UseOriginalSQLDefinitionContext _localctx = new UseOriginalSQLDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_useOriginalSQLDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(USE_ORIGINAL_SQL_WHEN_TRANSLATING_FAILED);
			setState(52);
			match(EQ_);
			setState(53);
			useOriginalSQL();
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
	public static class UseOriginalSQLContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQLTranslatorDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLTranslatorDistSQLStatementParser.FALSE, 0); }
		public UseOriginalSQLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useOriginalSQL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterUseOriginalSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitUseOriginalSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitUseOriginalSQL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseOriginalSQLContext useOriginalSQL() throws RecognitionException {
		UseOriginalSQLContext _localctx = new UseOriginalSQLContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_useOriginalSQL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
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
	public static class AlgorithmDefinitionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SQLTranslatorDistSQLStatementParser.TYPE, 0); }
		public TerminalNode LP_() { return getToken(SQLTranslatorDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(SQLTranslatorDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(SQLTranslatorDistSQLStatementParser.EQ_, 0); }
		public AlgorithmTypeNameContext algorithmTypeName() {
			return getRuleContext(AlgorithmTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLTranslatorDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(SQLTranslatorDistSQLStatementParser.COMMA_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public AlgorithmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterAlgorithmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitAlgorithmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDefinitionContext algorithmDefinition() throws RecognitionException {
		AlgorithmDefinitionContext _localctx = new AlgorithmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_algorithmDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(TYPE);
			setState(58);
			match(LP_);
			setState(59);
			match(NAME);
			setState(60);
			match(EQ_);
			setState(61);
			algorithmTypeName();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(62);
				match(COMMA_);
				setState(63);
				propertiesDefinition();
				}
			}

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
	public static class AlgorithmTypeNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQLTranslatorDistSQLStatementParser.STRING_, 0); }
		public BuildInProviderTypeNameContext buildInProviderTypeName() {
			return getRuleContext(BuildInProviderTypeNameContext.class,0);
		}
		public AlgorithmTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterAlgorithmTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitAlgorithmTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmTypeNameContext algorithmTypeName() throws RecognitionException {
		AlgorithmTypeNameContext _localctx = new AlgorithmTypeNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_algorithmTypeName);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(STRING_);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
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
		public TerminalNode NATIVE() { return getToken(SQLTranslatorDistSQLStatementParser.NATIVE, 0); }
		public BuildInProviderTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInProviderTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterBuildInProviderTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitBuildInProviderTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitBuildInProviderTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInProviderTypeNameContext buildInProviderTypeName() throws RecognitionException {
		BuildInProviderTypeNameContext _localctx = new BuildInProviderTypeNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_buildInProviderTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(NATIVE);
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
		public TerminalNode PROPERTIES() { return getToken(SQLTranslatorDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(SQLTranslatorDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLTranslatorDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
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
			setState(74);
			match(PROPERTIES);
			setState(75);
			match(LP_);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(76);
				properties();
				}
			}

			setState(79);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLTranslatorDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLTranslatorDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
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
			setState(81);
			property();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(82);
				match(COMMA_);
				setState(83);
				property();
				}
				}
				setState(88);
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
		public TerminalNode EQ_() { return getToken(SQLTranslatorDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(SQLTranslatorDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(90);
			match(EQ_);
			setState(91);
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
		public TerminalNode STRING_() { return getToken(SQLTranslatorDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(SQLTranslatorDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLTranslatorDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(SQLTranslatorDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLTranslatorDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLTranslatorDistSQLStatementListener ) ((SQLTranslatorDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLTranslatorDistSQLStatementVisitor ) return ((SQLTranslatorDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(94);
					match(MINUS_);
					}
				}

				setState(97);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
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
		"\u0004\u0001;g\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001\u0000\u0003"+
		"\u0000 \b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00032\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006A\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0003\u0007G\b\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0003\tN\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\nU\b\n\n\n\f\nX\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0003\f`\b\f\u0001\f\u0001\f\u0001\f\u0003\fe\b"+
		"\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0001\u0001\u000067d\u0000\u001c\u0001\u0000"+
		"\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000"+
		"\u0000\u0006.\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n7\u0001"+
		"\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000eF\u0001\u0000\u0000"+
		"\u0000\u0010H\u0001\u0000\u0000\u0000\u0012J\u0001\u0000\u0000\u0000\u0014"+
		"Q\u0001\u0000\u0000\u0000\u0016Y\u0001\u0000\u0000\u0000\u0018d\u0001"+
		"\u0000\u0000\u0000\u001a\u001d\u0003\u0002\u0001\u0000\u001b\u001d\u0003"+
		"\u0004\u0002\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e \u0005(\u0000"+
		"\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000"+
		"\u0000\u0000#$\u0005-\u0000\u0000$%\u0005/\u0000\u0000%&\u0005.\u0000"+
		"\u0000&\u0003\u0001\u0000\u0000\u0000\'(\u00051\u0000\u0000()\u0005/\u0000"+
		"\u0000)*\u0005.\u0000\u0000*+\u0005\u001c\u0000\u0000+,\u0003\u0006\u0003"+
		"\u0000,-\u0005\u001d\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.1\u0003"+
		"\f\u0006\u0000/0\u0005\"\u0000\u000002\u0003\b\u0004\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u0000"+
		"34\u00050\u0000\u000045\u0005\u0015\u0000\u000056\u0003\n\u0005\u0000"+
		"6\t\u0001\u0000\u0000\u000078\u0007\u0000\u0000\u00008\u000b\u0001\u0000"+
		"\u0000\u00009:\u00052\u0000\u0000:;\u0005\u001c\u0000\u0000;<\u00054\u0000"+
		"\u0000<=\u0005\u0015\u0000\u0000=@\u0003\u000e\u0007\u0000>?\u0005\"\u0000"+
		"\u0000?A\u0003\u0012\t\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BC\u0005\u001d\u0000\u0000C\r\u0001\u0000"+
		"\u0000\u0000DG\u0005:\u0000\u0000EG\u0003\u0010\b\u0000FD\u0001\u0000"+
		"\u0000\u0000FE\u0001\u0000\u0000\u0000G\u000f\u0001\u0000\u0000\u0000"+
		"HI\u00053\u0000\u0000I\u0011\u0001\u0000\u0000\u0000JK\u00055\u0000\u0000"+
		"KM\u0005\u001c\u0000\u0000LN\u0003\u0014\n\u0000ML\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u001d\u0000"+
		"\u0000P\u0013\u0001\u0000\u0000\u0000QV\u0003\u0016\u000b\u0000RS\u0005"+
		"\"\u0000\u0000SU\u0003\u0016\u000b\u0000TR\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"W\u0015\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005:\u0000"+
		"\u0000Z[\u0005\u0015\u0000\u0000[\\\u0003\u0018\f\u0000\\\u0017\u0001"+
		"\u0000\u0000\u0000]e\u0005:\u0000\u0000^`\u0005\r\u0000\u0000_^\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ae\u0005;\u0000\u0000be\u00056\u0000\u0000ce\u00057\u0000\u0000d]\u0001"+
		"\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000e\u0019\u0001\u0000\u0000\u0000\t\u001c\u001f"+
		"1@FMV_d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
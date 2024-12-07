// Generated from /Users/code/gitcode/shardingsphere/parser/distsql/engine/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/UtilityDistSQLStatement.g4 by ANTLR 4.13.2
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
public class UtilityDistSQLStatementParser extends Parser {
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
		DL_=43, WS=44, PREVIEW=45, PARSE=46, FORMAT=47, SQLString=48, FOR_GENERATOR=49;
	public static final int
		RULE_execute = 0, RULE_previewSQL = 1, RULE_parseSQL = 2, RULE_formatSQL = 3, 
		RULE_sql = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "previewSQL", "parseSQL", "formatSQL", "sql"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", 
			"';'", "'->>'", "'_'", "'$'", null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"PREVIEW", "PARSE", "FORMAT", "SQLString", "FOR_GENERATOR"
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
	public String getGrammarFileName() { return "UtilityDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UtilityDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UtilityDistSQLStatementParser.EOF, 0); }
		public PreviewSQLContext previewSQL() {
			return getRuleContext(PreviewSQLContext.class,0);
		}
		public ParseSQLContext parseSQL() {
			return getRuleContext(ParseSQLContext.class,0);
		}
		public FormatSQLContext formatSQL() {
			return getRuleContext(FormatSQLContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(UtilityDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UtilityDistSQLStatementVisitor ) return ((UtilityDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(13);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREVIEW:
				{
				setState(10);
				previewSQL();
				}
				break;
			case PARSE:
				{
				setState(11);
				parseSQL();
				}
				break;
			case FORMAT:
				{
				setState(12);
				formatSQL();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(15);
				match(SEMI_);
				}
			}

			setState(18);
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
	public static class PreviewSQLContext extends ParserRuleContext {
		public TerminalNode PREVIEW() { return getToken(UtilityDistSQLStatementParser.PREVIEW, 0); }
		public SqlContext sql() {
			return getRuleContext(SqlContext.class,0);
		}
		public PreviewSQLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_previewSQL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).enterPreviewSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).exitPreviewSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UtilityDistSQLStatementVisitor ) return ((UtilityDistSQLStatementVisitor<? extends T>)visitor).visitPreviewSQL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreviewSQLContext previewSQL() throws RecognitionException {
		PreviewSQLContext _localctx = new PreviewSQLContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_previewSQL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(PREVIEW);
			setState(21);
			sql();
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
	public static class ParseSQLContext extends ParserRuleContext {
		public TerminalNode PARSE() { return getToken(UtilityDistSQLStatementParser.PARSE, 0); }
		public SqlContext sql() {
			return getRuleContext(SqlContext.class,0);
		}
		public ParseSQLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseSQL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).enterParseSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).exitParseSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UtilityDistSQLStatementVisitor ) return ((UtilityDistSQLStatementVisitor<? extends T>)visitor).visitParseSQL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseSQLContext parseSQL() throws RecognitionException {
		ParseSQLContext _localctx = new ParseSQLContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parseSQL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(PARSE);
			setState(24);
			sql();
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
	public static class FormatSQLContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(UtilityDistSQLStatementParser.FORMAT, 0); }
		public SqlContext sql() {
			return getRuleContext(SqlContext.class,0);
		}
		public FormatSQLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatSQL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).enterFormatSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).exitFormatSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UtilityDistSQLStatementVisitor ) return ((UtilityDistSQLStatementVisitor<? extends T>)visitor).visitFormatSQL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatSQLContext formatSQL() throws RecognitionException {
		FormatSQLContext _localctx = new FormatSQLContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formatSQL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(FORMAT);
			setState(27);
			sql();
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
	public static class SqlContext extends ParserRuleContext {
		public TerminalNode SQLString() { return getToken(UtilityDistSQLStatementParser.SQLString, 0); }
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UtilityDistSQLStatementListener ) ((UtilityDistSQLStatementListener)listener).exitSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UtilityDistSQLStatementVisitor ) return ((UtilityDistSQLStatementVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(SQLString);
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
		"\u0004\u00011 \u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0003\u0000"+
		"\u0011\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004"+
		"\u0006\b\u0000\u0000\u001d\u0000\r\u0001\u0000\u0000\u0000\u0002\u0014"+
		"\u0001\u0000\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000\u0006\u001a"+
		"\u0001\u0000\u0000\u0000\b\u001d\u0001\u0000\u0000\u0000\n\u000e\u0003"+
		"\u0002\u0001\u0000\u000b\u000e\u0003\u0004\u0002\u0000\f\u000e\u0003\u0006"+
		"\u0003\u0000\r\n\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000"+
		"\r\f\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f"+
		"\u0011\u0005(\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0005-\u0000\u0000\u0015\u0016\u0003\b\u0004\u0000\u0016\u0003\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005.\u0000\u0000\u0018\u0019\u0003\b"+
		"\u0004\u0000\u0019\u0005\u0001\u0000\u0000\u0000\u001a\u001b\u0005/\u0000"+
		"\u0000\u001b\u001c\u0003\b\u0004\u0000\u001c\u0007\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u00050\u0000\u0000\u001e\t\u0001\u0000\u0000\u0000\u0002"+
		"\r\u0010";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
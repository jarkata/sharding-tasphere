// Generated from /Users/code/gitcode/shardingsphere/features/broadcast/distsql/parser/src/main/antlr4/broadcast/org/apache/shardingsphere/distsql/parser/autogen/BroadcastDistSQLStatement.g4 by ANTLR 4.13.2
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
public class BroadcastDistSQLStatementParser extends Parser {
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
		WS=43, TRUE=44, FALSE=45, CREATE=46, DROP=47, SHOW=48, BROADCAST=49, RULE=50, 
		RULES=51, FROM=52, TABLE=53, IF=54, NOT=55, EXISTS=56, COUNT=57, FOR_GENERATOR=58, 
		IDENTIFIER_=59, STRING_=60, INT_=61;
	public static final int
		RULE_execute = 0, RULE_createBroadcastTableRule = 1, RULE_dropBroadcastTableRule = 2, 
		RULE_literal = 3, RULE_databaseName = 4, RULE_tableName = 5, RULE_ifExists = 6, 
		RULE_ifNotExists = 7, RULE_showBroadcastTableRules = 8, RULE_countBroadcastRule = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "createBroadcastTableRule", "dropBroadcastTableRule", "literal", 
			"databaseName", "tableName", "ifExists", "ifNotExists", "showBroadcastTableRules", 
			"countBroadcastRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", 
			"';'", "'->>'", "'_'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"BQ_", "QUESTION_", "AT_", "SEMI_", "JSONSEPARATOR_", "UL_", "WS", "TRUE", 
			"FALSE", "CREATE", "DROP", "SHOW", "BROADCAST", "RULE", "RULES", "FROM", 
			"TABLE", "IF", "NOT", "EXISTS", "COUNT", "FOR_GENERATOR", "IDENTIFIER_", 
			"STRING_", "INT_"
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
	public String getGrammarFileName() { return "BroadcastDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BroadcastDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BroadcastDistSQLStatementParser.EOF, 0); }
		public CreateBroadcastTableRuleContext createBroadcastTableRule() {
			return getRuleContext(CreateBroadcastTableRuleContext.class,0);
		}
		public DropBroadcastTableRuleContext dropBroadcastTableRule() {
			return getRuleContext(DropBroadcastTableRuleContext.class,0);
		}
		public ShowBroadcastTableRulesContext showBroadcastTableRules() {
			return getRuleContext(ShowBroadcastTableRulesContext.class,0);
		}
		public CountBroadcastRuleContext countBroadcastRule() {
			return getRuleContext(CountBroadcastRuleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(BroadcastDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			case CREATE:
				{
				setState(20);
				createBroadcastTableRule();
				}
				break;
			case DROP:
				{
				setState(21);
				dropBroadcastTableRule();
				}
				break;
			case SHOW:
				{
				setState(22);
				showBroadcastTableRules();
				}
				break;
			case COUNT:
				{
				setState(23);
				countBroadcastRule();
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
	public static class CreateBroadcastTableRuleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BroadcastDistSQLStatementParser.CREATE, 0); }
		public TerminalNode BROADCAST() { return getToken(BroadcastDistSQLStatementParser.BROADCAST, 0); }
		public TerminalNode TABLE() { return getToken(BroadcastDistSQLStatementParser.TABLE, 0); }
		public TerminalNode RULE() { return getToken(BroadcastDistSQLStatementParser.RULE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BroadcastDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BroadcastDistSQLStatementParser.COMMA_, i);
		}
		public CreateBroadcastTableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createBroadcastTableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterCreateBroadcastTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitCreateBroadcastTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitCreateBroadcastTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateBroadcastTableRuleContext createBroadcastTableRule() throws RecognitionException {
		CreateBroadcastTableRuleContext _localctx = new CreateBroadcastTableRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createBroadcastTableRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(CREATE);
			setState(32);
			match(BROADCAST);
			setState(33);
			match(TABLE);
			setState(34);
			match(RULE);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(35);
				ifNotExists();
				}
			}

			setState(38);
			tableName();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(39);
				match(COMMA_);
				setState(40);
				tableName();
				}
				}
				setState(45);
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
	public static class DropBroadcastTableRuleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(BroadcastDistSQLStatementParser.DROP, 0); }
		public TerminalNode BROADCAST() { return getToken(BroadcastDistSQLStatementParser.BROADCAST, 0); }
		public TerminalNode TABLE() { return getToken(BroadcastDistSQLStatementParser.TABLE, 0); }
		public TerminalNode RULE() { return getToken(BroadcastDistSQLStatementParser.RULE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BroadcastDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BroadcastDistSQLStatementParser.COMMA_, i);
		}
		public DropBroadcastTableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropBroadcastTableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterDropBroadcastTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitDropBroadcastTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitDropBroadcastTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropBroadcastTableRuleContext dropBroadcastTableRule() throws RecognitionException {
		DropBroadcastTableRuleContext _localctx = new DropBroadcastTableRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dropBroadcastTableRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DROP);
			setState(47);
			match(BROADCAST);
			setState(48);
			match(TABLE);
			setState(49);
			match(RULE);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(50);
				ifExists();
				}
			}

			setState(53);
			tableName();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(54);
				match(COMMA_);
				setState(55);
				tableName();
				}
				}
				setState(60);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BroadcastDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(BroadcastDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(BroadcastDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(BroadcastDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BroadcastDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(62);
					match(MINUS_);
					}
				}

				setState(65);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DatabaseNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(BroadcastDistSQLStatementParser.IDENTIFIER_, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENTIFIER_);
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
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(BroadcastDistSQLStatementParser.IDENTIFIER_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IDENTIFIER_);
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
	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BroadcastDistSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(BroadcastDistSQLStatementParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IF);
			setState(75);
			match(EXISTS);
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
	public static class IfNotExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BroadcastDistSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(BroadcastDistSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(BroadcastDistSQLStatementParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IF);
			setState(78);
			match(NOT);
			setState(79);
			match(EXISTS);
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
	public static class ShowBroadcastTableRulesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(BroadcastDistSQLStatementParser.SHOW, 0); }
		public TerminalNode BROADCAST() { return getToken(BroadcastDistSQLStatementParser.BROADCAST, 0); }
		public TerminalNode TABLE() { return getToken(BroadcastDistSQLStatementParser.TABLE, 0); }
		public TerminalNode RULES() { return getToken(BroadcastDistSQLStatementParser.RULES, 0); }
		public TerminalNode FROM() { return getToken(BroadcastDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowBroadcastTableRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showBroadcastTableRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterShowBroadcastTableRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitShowBroadcastTableRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitShowBroadcastTableRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowBroadcastTableRulesContext showBroadcastTableRules() throws RecognitionException {
		ShowBroadcastTableRulesContext _localctx = new ShowBroadcastTableRulesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_showBroadcastTableRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(SHOW);
			setState(82);
			match(BROADCAST);
			setState(83);
			match(TABLE);
			setState(84);
			match(RULES);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(85);
				match(FROM);
				setState(86);
				databaseName();
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
	public static class CountBroadcastRuleContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(BroadcastDistSQLStatementParser.COUNT, 0); }
		public TerminalNode BROADCAST() { return getToken(BroadcastDistSQLStatementParser.BROADCAST, 0); }
		public TerminalNode RULE() { return getToken(BroadcastDistSQLStatementParser.RULE, 0); }
		public TerminalNode FROM() { return getToken(BroadcastDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public CountBroadcastRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countBroadcastRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).enterCountBroadcastRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroadcastDistSQLStatementListener ) ((BroadcastDistSQLStatementListener)listener).exitCountBroadcastRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroadcastDistSQLStatementVisitor ) return ((BroadcastDistSQLStatementVisitor<? extends T>)visitor).visitCountBroadcastRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountBroadcastRuleContext countBroadcastRule() throws RecognitionException {
		CountBroadcastRuleContext _localctx = new CountBroadcastRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_countBroadcastRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(COUNT);
			setState(90);
			match(BROADCAST);
			setState(91);
			match(RULE);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(92);
				match(FROM);
				setState(93);
				databaseName();
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

	public static final String _serializedATN =
		"\u0004\u0001=a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0019\b\u0000\u0001\u0000\u0003\u0000\u001c\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"*\b\u0001\n\u0001\f\u0001-\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00029\b\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003@\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003E\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bX"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t_\b\t\u0001\t\u0000"+
		"\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000d"+
		"\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000"+
		"\u0004.\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bF\u0001"+
		"\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000"+
		"\u000eM\u0001\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012Y"+
		"\u0001\u0000\u0000\u0000\u0014\u0019\u0003\u0002\u0001\u0000\u0015\u0019"+
		"\u0003\u0004\u0002\u0000\u0016\u0019\u0003\u0010\b\u0000\u0017\u0019\u0003"+
		"\u0012\t\u0000\u0018\u0014\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000"+
		"\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000"+
		"\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u001c\u0005(\u0000"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0000\u0000"+
		"\u0001\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0005.\u0000\u0000 "+
		"!\u00051\u0000\u0000!\"\u00055\u0000\u0000\"$\u00052\u0000\u0000#%\u0003"+
		"\u000e\u0007\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&+\u0003\n\u0005\u0000\'(\u0005\"\u0000\u0000"+
		"(*\u0003\n\u0005\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0003\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005/\u0000\u0000/0\u0005"+
		"1\u0000\u000001\u00055\u0000\u000013\u00052\u0000\u000024\u0003\f\u0006"+
		"\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u00005:\u0003\n\u0005\u000067\u0005\"\u0000\u000079\u0003\n\u0005"+
		"\u000086\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0005\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000=E\u0005<\u0000\u0000>@\u0005\r\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AE\u0005=\u0000\u0000BE\u0005,\u0000\u0000CE\u0005-\u0000\u0000"+
		"D=\u0001\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0005"+
		";\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0005;\u0000\u0000I\u000b\u0001"+
		"\u0000\u0000\u0000JK\u00056\u0000\u0000KL\u00058\u0000\u0000L\r\u0001"+
		"\u0000\u0000\u0000MN\u00056\u0000\u0000NO\u00057\u0000\u0000OP\u00058"+
		"\u0000\u0000P\u000f\u0001\u0000\u0000\u0000QR\u00050\u0000\u0000RS\u0005"+
		"1\u0000\u0000ST\u00055\u0000\u0000TW\u00053\u0000\u0000UV\u00054\u0000"+
		"\u0000VX\u0003\b\u0004\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X\u0011\u0001\u0000\u0000\u0000YZ\u00059\u0000\u0000Z[\u00051\u0000"+
		"\u0000[^\u00052\u0000\u0000\\]\u00054\u0000\u0000]_\u0003\b\u0004\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0013\u0001\u0000"+
		"\u0000\u0000\n\u0018\u001b$+3:?DW^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
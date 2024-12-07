// Generated from /Users/code/gitcode/shardingsphere/kernel/single/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SingleDistSQLStatement.g4 by ANTLR 4.13.2
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
public class SingleDistSQLStatementParser extends Parser {
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
		DL_=43, WS=44, SHOW=45, SET=46, DEFAULT=47, SINGLE=48, TABLE=49, TABLES=50, 
		ALL=51, STORAGE=52, UNIT=53, RANDOM=54, FROM=55, COUNT=56, LIKE=57, SCHEMA=58, 
		INTO=59, LOAD=60, UNLOAD=61, UNLOADED=62, FOR_GENERATOR=63, IDENTIFIER_=64, 
		STRING_=65, INT_=66;
	public static final int
		RULE_execute = 0, RULE_setDefaultSingleTableStorageUnit = 1, RULE_loadSingleTable = 2, 
		RULE_unloadSingleTable = 3, RULE_tableDefinition = 4, RULE_tableNames = 5, 
		RULE_tableIdentifier = 6, RULE_storageUnitName = 7, RULE_databaseName = 8, 
		RULE_schemaName = 9, RULE_tableName = 10, RULE_showDefaultSingleTableStorageUnit = 11, 
		RULE_showSingleTables = 12, RULE_showUnloadedSingleTables = 13, RULE_fromClause = 14, 
		RULE_countSingleTable = 15, RULE_showLike = 16, RULE_likePattern = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "setDefaultSingleTableStorageUnit", "loadSingleTable", "unloadSingleTable", 
			"tableDefinition", "tableNames", "tableIdentifier", "storageUnitName", 
			"databaseName", "schemaName", "tableName", "showDefaultSingleTableStorageUnit", 
			"showSingleTables", "showUnloadedSingleTables", "fromClause", "countSingleTable", 
			"showLike", "likePattern"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"SHOW", "SET", "DEFAULT", "SINGLE", "TABLE", "TABLES", "ALL", "STORAGE", 
			"UNIT", "RANDOM", "FROM", "COUNT", "LIKE", "SCHEMA", "INTO", "LOAD", 
			"UNLOAD", "UNLOADED", "FOR_GENERATOR", "IDENTIFIER_", "STRING_", "INT_"
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
	public String getGrammarFileName() { return "SingleDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SingleDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SingleDistSQLStatementParser.EOF, 0); }
		public SetDefaultSingleTableStorageUnitContext setDefaultSingleTableStorageUnit() {
			return getRuleContext(SetDefaultSingleTableStorageUnitContext.class,0);
		}
		public ShowDefaultSingleTableStorageUnitContext showDefaultSingleTableStorageUnit() {
			return getRuleContext(ShowDefaultSingleTableStorageUnitContext.class,0);
		}
		public ShowSingleTablesContext showSingleTables() {
			return getRuleContext(ShowSingleTablesContext.class,0);
		}
		public CountSingleTableContext countSingleTable() {
			return getRuleContext(CountSingleTableContext.class,0);
		}
		public LoadSingleTableContext loadSingleTable() {
			return getRuleContext(LoadSingleTableContext.class,0);
		}
		public UnloadSingleTableContext unloadSingleTable() {
			return getRuleContext(UnloadSingleTableContext.class,0);
		}
		public ShowUnloadedSingleTablesContext showUnloadedSingleTables() {
			return getRuleContext(ShowUnloadedSingleTablesContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SingleDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(36);
				setDefaultSingleTableStorageUnit();
				}
				break;
			case 2:
				{
				setState(37);
				showDefaultSingleTableStorageUnit();
				}
				break;
			case 3:
				{
				setState(38);
				showSingleTables();
				}
				break;
			case 4:
				{
				setState(39);
				countSingleTable();
				}
				break;
			case 5:
				{
				setState(40);
				loadSingleTable();
				}
				break;
			case 6:
				{
				setState(41);
				unloadSingleTable();
				}
				break;
			case 7:
				{
				setState(42);
				showUnloadedSingleTables();
				}
				break;
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(45);
				match(SEMI_);
				}
			}

			setState(48);
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
	public static class SetDefaultSingleTableStorageUnitContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SingleDistSQLStatementParser.SET, 0); }
		public TerminalNode DEFAULT() { return getToken(SingleDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SINGLE() { return getToken(SingleDistSQLStatementParser.SINGLE, 0); }
		public TerminalNode TABLE() { return getToken(SingleDistSQLStatementParser.TABLE, 0); }
		public TerminalNode STORAGE() { return getToken(SingleDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode UNIT() { return getToken(SingleDistSQLStatementParser.UNIT, 0); }
		public TerminalNode EQ_() { return getToken(SingleDistSQLStatementParser.EQ_, 0); }
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public TerminalNode RANDOM() { return getToken(SingleDistSQLStatementParser.RANDOM, 0); }
		public SetDefaultSingleTableStorageUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setDefaultSingleTableStorageUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterSetDefaultSingleTableStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitSetDefaultSingleTableStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitSetDefaultSingleTableStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetDefaultSingleTableStorageUnitContext setDefaultSingleTableStorageUnit() throws RecognitionException {
		SetDefaultSingleTableStorageUnitContext _localctx = new SetDefaultSingleTableStorageUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setDefaultSingleTableStorageUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(SET);
			setState(51);
			match(DEFAULT);
			setState(52);
			match(SINGLE);
			setState(53);
			match(TABLE);
			setState(54);
			match(STORAGE);
			setState(55);
			match(UNIT);
			setState(56);
			match(EQ_);
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				{
				setState(57);
				storageUnitName();
				}
				break;
			case RANDOM:
				{
				setState(58);
				match(RANDOM);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class LoadSingleTableContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(SingleDistSQLStatementParser.LOAD, 0); }
		public TerminalNode SINGLE() { return getToken(SingleDistSQLStatementParser.SINGLE, 0); }
		public TerminalNode TABLE() { return getToken(SingleDistSQLStatementParser.TABLE, 0); }
		public TableDefinitionContext tableDefinition() {
			return getRuleContext(TableDefinitionContext.class,0);
		}
		public LoadSingleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadSingleTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterLoadSingleTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitLoadSingleTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitLoadSingleTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadSingleTableContext loadSingleTable() throws RecognitionException {
		LoadSingleTableContext _localctx = new LoadSingleTableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_loadSingleTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(LOAD);
			setState(62);
			match(SINGLE);
			setState(63);
			match(TABLE);
			setState(64);
			tableDefinition();
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
	public static class UnloadSingleTableContext extends ParserRuleContext {
		public TerminalNode UNLOAD() { return getToken(SingleDistSQLStatementParser.UNLOAD, 0); }
		public TerminalNode SINGLE() { return getToken(SingleDistSQLStatementParser.SINGLE, 0); }
		public TerminalNode TABLE() { return getToken(SingleDistSQLStatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(SingleDistSQLStatementParser.ASTERISK_, 0); }
		public TerminalNode ALL() { return getToken(SingleDistSQLStatementParser.ALL, 0); }
		public TerminalNode TABLES() { return getToken(SingleDistSQLStatementParser.TABLES, 0); }
		public UnloadSingleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unloadSingleTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterUnloadSingleTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitUnloadSingleTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitUnloadSingleTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnloadSingleTableContext unloadSingleTable() throws RecognitionException {
		UnloadSingleTableContext _localctx = new UnloadSingleTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unloadSingleTable);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(UNLOAD);
				setState(67);
				match(SINGLE);
				setState(68);
				match(TABLE);
				setState(69);
				tableNames();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(UNLOAD);
				setState(71);
				match(SINGLE);
				setState(72);
				match(TABLE);
				setState(73);
				match(ASTERISK_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(UNLOAD);
				setState(75);
				match(ALL);
				setState(76);
				match(SINGLE);
				setState(77);
				match(TABLES);
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
	public static class TableDefinitionContext extends ParserRuleContext {
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SingleDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SingleDistSQLStatementParser.COMMA_, i);
		}
		public TableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterTableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitTableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitTableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableDefinitionContext tableDefinition() throws RecognitionException {
		TableDefinitionContext _localctx = new TableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			tableIdentifier();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(81);
				match(COMMA_);
				setState(82);
				tableIdentifier();
				}
				}
				setState(87);
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
	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SingleDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SingleDistSQLStatementParser.COMMA_, i);
		}
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterTableNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitTableNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			tableName();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(89);
				match(COMMA_);
				setState(90);
				tableName();
				}
				}
				setState(95);
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
	public static class TableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
	 
		public TableIdentifierContext() { }
		public void copyFrom(TableIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableFromSchemaContext extends TableIdentifierContext {
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public List<TerminalNode> DOT_() { return getTokens(SingleDistSQLStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(SingleDistSQLStatementParser.DOT_, i);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableFromSchemaContext(TableIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterTableFromSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitTableFromSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitTableFromSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllTablesFromStorageUnitContext extends TableIdentifierContext {
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public TerminalNode DOTASTERISK_() { return getToken(SingleDistSQLStatementParser.DOTASTERISK_, 0); }
		public AllTablesFromStorageUnitContext(TableIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterAllTablesFromStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitAllTablesFromStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitAllTablesFromStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllTablesFromSchemaContext extends TableIdentifierContext {
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(SingleDistSQLStatementParser.DOT_, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOTASTERISK_() { return getToken(SingleDistSQLStatementParser.DOTASTERISK_, 0); }
		public AllTablesFromSchemaContext(TableIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterAllTablesFromSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitAllTablesFromSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitAllTablesFromSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableFromStorageUnitContext extends TableIdentifierContext {
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(SingleDistSQLStatementParser.DOT_, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableFromStorageUnitContext(TableIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterTableFromStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitTableFromStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitTableFromStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllTablesContext extends TableIdentifierContext {
		public TerminalNode ASTERISK_() { return getToken(SingleDistSQLStatementParser.ASTERISK_, 0); }
		public TerminalNode DOTASTERISK_() { return getToken(SingleDistSQLStatementParser.DOTASTERISK_, 0); }
		public AllTablesContext(TableIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterAllTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitAllTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitAllTables(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllTablesWithSchemaContext extends TableIdentifierContext {
		public TerminalNode ASTERISK_() { return getToken(SingleDistSQLStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> DOTASTERISK_() { return getTokens(SingleDistSQLStatementParser.DOTASTERISK_); }
		public TerminalNode DOTASTERISK_(int i) {
			return getToken(SingleDistSQLStatementParser.DOTASTERISK_, i);
		}
		public AllTablesWithSchemaContext(TableIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterAllTablesWithSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitAllTablesWithSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitAllTablesWithSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllSchamesAndTablesFromStorageUnitContext extends TableIdentifierContext {
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public List<TerminalNode> DOTASTERISK_() { return getTokens(SingleDistSQLStatementParser.DOTASTERISK_); }
		public TerminalNode DOTASTERISK_(int i) {
			return getToken(SingleDistSQLStatementParser.DOTASTERISK_, i);
		}
		public AllSchamesAndTablesFromStorageUnitContext(TableIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterAllSchamesAndTablesFromStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitAllSchamesAndTablesFromStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitAllSchamesAndTablesFromStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableIdentifier);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AllTablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(ASTERISK_);
				setState(97);
				match(DOTASTERISK_);
				}
				break;
			case 2:
				_localctx = new AllTablesWithSchemaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ASTERISK_);
				setState(99);
				match(DOTASTERISK_);
				setState(100);
				match(DOTASTERISK_);
				}
				break;
			case 3:
				_localctx = new AllTablesFromStorageUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				storageUnitName();
				setState(102);
				match(DOTASTERISK_);
				}
				break;
			case 4:
				_localctx = new AllSchamesAndTablesFromStorageUnitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				storageUnitName();
				setState(105);
				match(DOTASTERISK_);
				setState(106);
				match(DOTASTERISK_);
				}
				break;
			case 5:
				_localctx = new AllTablesFromSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				storageUnitName();
				setState(109);
				match(DOT_);
				setState(110);
				schemaName();
				setState(111);
				match(DOTASTERISK_);
				}
				break;
			case 6:
				_localctx = new TableFromStorageUnitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				storageUnitName();
				setState(114);
				match(DOT_);
				setState(115);
				tableName();
				}
				break;
			case 7:
				_localctx = new TableFromSchemaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				storageUnitName();
				setState(118);
				match(DOT_);
				setState(119);
				schemaName();
				setState(120);
				match(DOT_);
				setState(121);
				tableName();
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
	public static class StorageUnitNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SingleDistSQLStatementParser.IDENTIFIER_, 0); }
		public StorageUnitNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageUnitName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterStorageUnitName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitStorageUnitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitStorageUnitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageUnitNameContext storageUnitName() throws RecognitionException {
		StorageUnitNameContext _localctx = new StorageUnitNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_storageUnitName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
	public static class DatabaseNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SingleDistSQLStatementParser.IDENTIFIER_, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SingleDistSQLStatementParser.IDENTIFIER_, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		public TerminalNode IDENTIFIER_() { return getToken(SingleDistSQLStatementParser.IDENTIFIER_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
	public static class ShowDefaultSingleTableStorageUnitContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SingleDistSQLStatementParser.SHOW, 0); }
		public TerminalNode DEFAULT() { return getToken(SingleDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SINGLE() { return getToken(SingleDistSQLStatementParser.SINGLE, 0); }
		public TerminalNode TABLE() { return getToken(SingleDistSQLStatementParser.TABLE, 0); }
		public TerminalNode STORAGE() { return getToken(SingleDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode UNIT() { return getToken(SingleDistSQLStatementParser.UNIT, 0); }
		public TerminalNode FROM() { return getToken(SingleDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowDefaultSingleTableStorageUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDefaultSingleTableStorageUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterShowDefaultSingleTableStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitShowDefaultSingleTableStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitShowDefaultSingleTableStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDefaultSingleTableStorageUnitContext showDefaultSingleTableStorageUnit() throws RecognitionException {
		ShowDefaultSingleTableStorageUnitContext _localctx = new ShowDefaultSingleTableStorageUnitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_showDefaultSingleTableStorageUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SHOW);
			setState(134);
			match(DEFAULT);
			setState(135);
			match(SINGLE);
			setState(136);
			match(TABLE);
			setState(137);
			match(STORAGE);
			setState(138);
			match(UNIT);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(139);
				match(FROM);
				setState(140);
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
	public static class ShowSingleTablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SingleDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SINGLE() { return getToken(SingleDistSQLStatementParser.SINGLE, 0); }
		public TerminalNode TABLES() { return getToken(SingleDistSQLStatementParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SingleDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowLikeContext showLike() {
			return getRuleContext(ShowLikeContext.class,0);
		}
		public ShowSingleTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showSingleTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterShowSingleTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitShowSingleTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitShowSingleTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowSingleTablesContext showSingleTables() throws RecognitionException {
		ShowSingleTablesContext _localctx = new ShowSingleTablesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_showSingleTables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(SHOW);
			setState(144);
			match(SINGLE);
			setState(145);
			match(TABLES);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(146);
				match(FROM);
				setState(147);
				databaseName();
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(150);
				showLike();
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
	public static class ShowUnloadedSingleTablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SingleDistSQLStatementParser.SHOW, 0); }
		public TerminalNode UNLOADED() { return getToken(SingleDistSQLStatementParser.UNLOADED, 0); }
		public TerminalNode SINGLE() { return getToken(SingleDistSQLStatementParser.SINGLE, 0); }
		public TerminalNode TABLES() { return getToken(SingleDistSQLStatementParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SingleDistSQLStatementParser.FROM, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public ShowUnloadedSingleTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showUnloadedSingleTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterShowUnloadedSingleTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitShowUnloadedSingleTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitShowUnloadedSingleTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowUnloadedSingleTablesContext showUnloadedSingleTables() throws RecognitionException {
		ShowUnloadedSingleTablesContext _localctx = new ShowUnloadedSingleTablesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_showUnloadedSingleTables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(SHOW);
			setState(154);
			match(UNLOADED);
			setState(155);
			match(SINGLE);
			setState(156);
			match(TABLES);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(157);
				match(FROM);
				setState(158);
				fromClause();
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
	public static class FromClauseContext extends ParserRuleContext {
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public TerminalNode STORAGE() { return getToken(SingleDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode UNIT() { return getToken(SingleDistSQLStatementParser.UNIT, 0); }
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public TerminalNode SCHEMA() { return getToken(SingleDistSQLStatementParser.SCHEMA, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fromClause);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				databaseName();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(162);
					match(STORAGE);
					setState(163);
					match(UNIT);
					setState(164);
					storageUnitName();
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SCHEMA) {
						{
						setState(165);
						match(SCHEMA);
						setState(166);
						schemaName();
						}
					}

					}
				}

				}
				break;
			case STORAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(STORAGE);
				setState(172);
				match(UNIT);
				setState(173);
				storageUnitName();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCHEMA) {
					{
					setState(174);
					match(SCHEMA);
					setState(175);
					schemaName();
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
	public static class CountSingleTableContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(SingleDistSQLStatementParser.COUNT, 0); }
		public TerminalNode SINGLE() { return getToken(SingleDistSQLStatementParser.SINGLE, 0); }
		public TerminalNode TABLE() { return getToken(SingleDistSQLStatementParser.TABLE, 0); }
		public TerminalNode FROM() { return getToken(SingleDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public CountSingleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countSingleTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterCountSingleTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitCountSingleTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitCountSingleTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountSingleTableContext countSingleTable() throws RecognitionException {
		CountSingleTableContext _localctx = new CountSingleTableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_countSingleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(COUNT);
			setState(181);
			match(SINGLE);
			setState(182);
			match(TABLE);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(183);
				match(FROM);
				setState(184);
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
	public static class ShowLikeContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(SingleDistSQLStatementParser.LIKE, 0); }
		public LikePatternContext likePattern() {
			return getRuleContext(LikePatternContext.class,0);
		}
		public ShowLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showLike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterShowLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitShowLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitShowLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowLikeContext showLike() throws RecognitionException {
		ShowLikeContext _localctx = new ShowLikeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_showLike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(LIKE);
			setState(188);
			likePattern();
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
	public static class LikePatternContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SingleDistSQLStatementParser.STRING_, 0); }
		public LikePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).enterLikePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SingleDistSQLStatementListener ) ((SingleDistSQLStatementListener)listener).exitLikePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleDistSQLStatementVisitor ) return ((SingleDistSQLStatementVisitor<? extends T>)visitor).visitLikePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikePatternContext likePattern() throws RecognitionException {
		LikePatternContext _localctx = new LikePatternContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_likePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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

	public static final String _serializedATN =
		"\u0004\u0001B\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		",\b\u0000\u0001\u0000\u0003\u0000/\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004T\b\u0004\n\u0004\f\u0004W\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\\\b\u0005\n\u0005"+
		"\f\u0005_\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008e\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0095\b\f\u0001\f\u0003\f\u0098\b\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a0\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a8\b\u000e\u0003\u000e\u00aa\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b1\b\u000e\u0003\u000e"+
		"\u00b3\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00ba\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0000"+
		"\u00c9\u0000+\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004"+
		"=\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bP\u0001\u0000"+
		"\u0000\u0000\nX\u0001\u0000\u0000\u0000\f{\u0001\u0000\u0000\u0000\u000e"+
		"}\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012\u0081"+
		"\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0085"+
		"\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000\u0000\u001a\u0099"+
		"\u0001\u0000\u0000\u0000\u001c\u00b2\u0001\u0000\u0000\u0000\u001e\u00b4"+
		"\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000\u0000\u0000\"\u00be\u0001"+
		"\u0000\u0000\u0000$,\u0003\u0002\u0001\u0000%,\u0003\u0016\u000b\u0000"+
		"&,\u0003\u0018\f\u0000\',\u0003\u001e\u000f\u0000(,\u0003\u0004\u0002"+
		"\u0000),\u0003\u0006\u0003\u0000*,\u0003\u001a\r\u0000+$\u0001\u0000\u0000"+
		"\u0000+%\u0001\u0000\u0000\u0000+&\u0001\u0000\u0000\u0000+\'\u0001\u0000"+
		"\u0000\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-/\u0005(\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0005\u0000\u0000\u00011\u0001\u0001\u0000\u0000\u000023\u0005.\u0000"+
		"\u000034\u0005/\u0000\u000045\u00050\u0000\u000056\u00051\u0000\u0000"+
		"67\u00054\u0000\u000078\u00055\u0000\u00008;\u0005\u0015\u0000\u00009"+
		"<\u0003\u000e\u0007\u0000:<\u00056\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=>\u0005<\u0000"+
		"\u0000>?\u00050\u0000\u0000?@\u00051\u0000\u0000@A\u0003\b\u0004\u0000"+
		"A\u0005\u0001\u0000\u0000\u0000BC\u0005=\u0000\u0000CD\u00050\u0000\u0000"+
		"DE\u00051\u0000\u0000EO\u0003\n\u0005\u0000FG\u0005=\u0000\u0000GH\u0005"+
		"0\u0000\u0000HI\u00051\u0000\u0000IO\u0005\u000e\u0000\u0000JK\u0005="+
		"\u0000\u0000KL\u00053\u0000\u0000LM\u00050\u0000\u0000MO\u00052\u0000"+
		"\u0000NB\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000\u0000NJ\u0001\u0000"+
		"\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PU\u0003\f\u0006\u0000QR\u0005"+
		"\"\u0000\u0000RT\u0003\f\u0006\u0000SQ\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\t\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000X]\u0003\u0014\n"+
		"\u0000YZ\u0005\"\u0000\u0000Z\\\u0003\u0014\n\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\u000b\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"`a\u0005\u000e\u0000\u0000a|\u0005\u0012\u0000\u0000bc\u0005\u000e\u0000"+
		"\u0000cd\u0005\u0012\u0000\u0000d|\u0005\u0012\u0000\u0000ef\u0003\u000e"+
		"\u0007\u0000fg\u0005\u0012\u0000\u0000g|\u0001\u0000\u0000\u0000hi\u0003"+
		"\u000e\u0007\u0000ij\u0005\u0012\u0000\u0000jk\u0005\u0012\u0000\u0000"+
		"k|\u0001\u0000\u0000\u0000lm\u0003\u000e\u0007\u0000mn\u0005\u0011\u0000"+
		"\u0000no\u0003\u0012\t\u0000op\u0005\u0012\u0000\u0000p|\u0001\u0000\u0000"+
		"\u0000qr\u0003\u000e\u0007\u0000rs\u0005\u0011\u0000\u0000st\u0003\u0014"+
		"\n\u0000t|\u0001\u0000\u0000\u0000uv\u0003\u000e\u0007\u0000vw\u0005\u0011"+
		"\u0000\u0000wx\u0003\u0012\t\u0000xy\u0005\u0011\u0000\u0000yz\u0003\u0014"+
		"\n\u0000z|\u0001\u0000\u0000\u0000{`\u0001\u0000\u0000\u0000{b\u0001\u0000"+
		"\u0000\u0000{e\u0001\u0000\u0000\u0000{h\u0001\u0000\u0000\u0000{l\u0001"+
		"\u0000\u0000\u0000{q\u0001\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000"+
		"|\r\u0001\u0000\u0000\u0000}~\u0005@\u0000\u0000~\u000f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005@\u0000\u0000\u0080\u0011\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005@\u0000\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005@\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005-\u0000\u0000\u0086\u0087\u0005/\u0000\u0000\u0087\u0088\u00050"+
		"\u0000\u0000\u0088\u0089\u00051\u0000\u0000\u0089\u008a\u00054\u0000\u0000"+
		"\u008a\u008d\u00055\u0000\u0000\u008b\u008c\u00057\u0000\u0000\u008c\u008e"+
		"\u0003\u0010\b\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0017\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"-\u0000\u0000\u0090\u0091\u00050\u0000\u0000\u0091\u0094\u00052\u0000"+
		"\u0000\u0092\u0093\u00057\u0000\u0000\u0093\u0095\u0003\u0010\b\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0098\u0003 \u0010\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0019\u0001\u0000\u0000\u0000\u0099\u009a\u0005-\u0000\u0000\u009a\u009b"+
		"\u0005>\u0000\u0000\u009b\u009c\u00050\u0000\u0000\u009c\u009f\u00052"+
		"\u0000\u0000\u009d\u009e\u00057\u0000\u0000\u009e\u00a0\u0003\u001c\u000e"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u001b\u0001\u0000\u0000\u0000\u00a1\u00a9\u0003\u0010\b\u0000"+
		"\u00a2\u00a3\u00054\u0000\u0000\u00a3\u00a4\u00055\u0000\u0000\u00a4\u00a7"+
		"\u0003\u000e\u0007\u0000\u00a5\u00a6\u0005:\u0000\u0000\u00a6\u00a8\u0003"+
		"\u0012\t\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00b3\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u00054\u0000\u0000\u00ac\u00ad\u00055\u0000\u0000"+
		"\u00ad\u00b0\u0003\u000e\u0007\u0000\u00ae\u00af\u0005:\u0000\u0000\u00af"+
		"\u00b1\u0003\u0012\t\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00b2\u00ab\u0001\u0000\u0000\u0000\u00b3\u001d"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u00058\u0000\u0000\u00b5\u00b6\u0005"+
		"0\u0000\u0000\u00b6\u00b9\u00051\u0000\u0000\u00b7\u00b8\u00057\u0000"+
		"\u0000\u00b8\u00ba\u0003\u0010\b\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u001f\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u00059\u0000\u0000\u00bc\u00bd\u0003\"\u0011\u0000\u00bd"+
		"!\u0001\u0000\u0000\u0000\u00be\u00bf\u0005A\u0000\u0000\u00bf#\u0001"+
		"\u0000\u0000\u0000\u0010+.;NU]{\u008d\u0094\u0097\u009f\u00a7\u00a9\u00b0"+
		"\u00b2\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
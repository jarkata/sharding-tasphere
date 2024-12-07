// Generated from /Users/code/gitcode/shardingsphere/features/readwrite-splitting/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/ReadwriteSplittingDistSQLStatement.g4 by ANTLR 4.13.2
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
public class ReadwriteSplittingDistSQLStatementParser extends Parser {
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
		WS=43, TRUE=44, FALSE=45, CREATE=46, ALTER=47, DROP=48, SHOW=49, RULE=50, 
		FROM=51, READWRITE_SPLITTING=52, WRITE_STORAGE_UNIT=53, READ_STORAGE_UNITS=54, 
		TRANSACTIONAL_READ_QUERY_STRATEGY=55, TYPE=56, NAME=57, PROPERTIES=58, 
		RULES=59, RESOURCES=60, STATUS=61, ENABLE=62, DISABLE=63, READ=64, IF=65, 
		EXISTS=66, COUNT=67, ROUND_ROBIN=68, RANDOM=69, WEIGHT=70, NOT=71, FOR_GENERATOR=72, 
		IDENTIFIER_=73, STRING_=74, INT_=75, HEX_=76, NUMBER_=77, HEXDIGIT_=78, 
		BITNUM_=79;
	public static final int
		RULE_execute = 0, RULE_alterReadwriteSplittingStorageUnitStatus = 1, RULE_showStatusFromReadwriteSplittingRules = 2, 
		RULE_literal = 3, RULE_algorithmDefinition = 4, RULE_algorithmTypeName = 5, 
		RULE_buildInReadQueryLoadBalanceAlgorithmType = 6, RULE_propertiesDefinition = 7, 
		RULE_properties = 8, RULE_property = 9, RULE_databaseName = 10, RULE_ruleName = 11, 
		RULE_storageUnitName = 12, RULE_createReadwriteSplittingRule = 13, RULE_alterReadwriteSplittingRule = 14, 
		RULE_dropReadwriteSplittingRule = 15, RULE_readwriteSplittingRuleDefinition = 16, 
		RULE_dataSourceDefinition = 17, RULE_writeStorageUnit = 18, RULE_readStorageUnits = 19, 
		RULE_transactionalReadQueryStrategy = 20, RULE_writeStorageUnitName = 21, 
		RULE_readStorageUnitsNames = 22, RULE_transactionalReadQueryStrategyName = 23, 
		RULE_ifExists = 24, RULE_ifNotExists = 25, RULE_showReadwriteSplittingRules = 26, 
		RULE_countReadwriteSplittingRule = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "alterReadwriteSplittingStorageUnitStatus", "showStatusFromReadwriteSplittingRules", 
			"literal", "algorithmDefinition", "algorithmTypeName", "buildInReadQueryLoadBalanceAlgorithmType", 
			"propertiesDefinition", "properties", "property", "databaseName", "ruleName", 
			"storageUnitName", "createReadwriteSplittingRule", "alterReadwriteSplittingRule", 
			"dropReadwriteSplittingRule", "readwriteSplittingRuleDefinition", "dataSourceDefinition", 
			"writeStorageUnit", "readStorageUnits", "transactionalReadQueryStrategy", 
			"writeStorageUnitName", "readStorageUnitsNames", "transactionalReadQueryStrategyName", 
			"ifExists", "ifNotExists", "showReadwriteSplittingRules", "countReadwriteSplittingRule"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
			"BQ_", "QUESTION_", "AT_", "SEMI_", "JSONSEPARATOR_", "UL_", "WS", "TRUE", 
			"FALSE", "CREATE", "ALTER", "DROP", "SHOW", "RULE", "FROM", "READWRITE_SPLITTING", 
			"WRITE_STORAGE_UNIT", "READ_STORAGE_UNITS", "TRANSACTIONAL_READ_QUERY_STRATEGY", 
			"TYPE", "NAME", "PROPERTIES", "RULES", "RESOURCES", "STATUS", "ENABLE", 
			"DISABLE", "READ", "IF", "EXISTS", "COUNT", "ROUND_ROBIN", "RANDOM", 
			"WEIGHT", "NOT", "FOR_GENERATOR", "IDENTIFIER_", "STRING_", "INT_", "HEX_", 
			"NUMBER_", "HEXDIGIT_", "BITNUM_"
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
	public String getGrammarFileName() { return "ReadwriteSplittingDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReadwriteSplittingDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReadwriteSplittingDistSQLStatementParser.EOF, 0); }
		public CreateReadwriteSplittingRuleContext createReadwriteSplittingRule() {
			return getRuleContext(CreateReadwriteSplittingRuleContext.class,0);
		}
		public AlterReadwriteSplittingRuleContext alterReadwriteSplittingRule() {
			return getRuleContext(AlterReadwriteSplittingRuleContext.class,0);
		}
		public DropReadwriteSplittingRuleContext dropReadwriteSplittingRule() {
			return getRuleContext(DropReadwriteSplittingRuleContext.class,0);
		}
		public ShowReadwriteSplittingRulesContext showReadwriteSplittingRules() {
			return getRuleContext(ShowReadwriteSplittingRulesContext.class,0);
		}
		public AlterReadwriteSplittingStorageUnitStatusContext alterReadwriteSplittingStorageUnitStatus() {
			return getRuleContext(AlterReadwriteSplittingStorageUnitStatusContext.class,0);
		}
		public ShowStatusFromReadwriteSplittingRulesContext showStatusFromReadwriteSplittingRules() {
			return getRuleContext(ShowStatusFromReadwriteSplittingRulesContext.class,0);
		}
		public CountReadwriteSplittingRuleContext countReadwriteSplittingRule() {
			return getRuleContext(CountReadwriteSplittingRuleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(ReadwriteSplittingDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(56);
				createReadwriteSplittingRule();
				}
				break;
			case 2:
				{
				setState(57);
				alterReadwriteSplittingRule();
				}
				break;
			case 3:
				{
				setState(58);
				dropReadwriteSplittingRule();
				}
				break;
			case 4:
				{
				setState(59);
				showReadwriteSplittingRules();
				}
				break;
			case 5:
				{
				setState(60);
				alterReadwriteSplittingStorageUnitStatus();
				}
				break;
			case 6:
				{
				setState(61);
				showStatusFromReadwriteSplittingRules();
				}
				break;
			case 7:
				{
				setState(62);
				countReadwriteSplittingRule();
				}
				break;
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(65);
				match(SEMI_);
				}
			}

			setState(68);
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
	public static class AlterReadwriteSplittingStorageUnitStatusContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ReadwriteSplittingDistSQLStatementParser.ALTER, 0); }
		public TerminalNode READWRITE_SPLITTING() { return getToken(ReadwriteSplittingDistSQLStatementParser.READWRITE_SPLITTING, 0); }
		public TerminalNode RULE() { return getToken(ReadwriteSplittingDistSQLStatementParser.RULE, 0); }
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(ReadwriteSplittingDistSQLStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(ReadwriteSplittingDistSQLStatementParser.DISABLE, 0); }
		public TerminalNode FROM() { return getToken(ReadwriteSplittingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public AlterReadwriteSplittingStorageUnitStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterReadwriteSplittingStorageUnitStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterAlterReadwriteSplittingStorageUnitStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitAlterReadwriteSplittingStorageUnitStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitAlterReadwriteSplittingStorageUnitStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterReadwriteSplittingStorageUnitStatusContext alterReadwriteSplittingStorageUnitStatus() throws RecognitionException {
		AlterReadwriteSplittingStorageUnitStatusContext _localctx = new AlterReadwriteSplittingStorageUnitStatusContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alterReadwriteSplittingStorageUnitStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ALTER);
			setState(71);
			match(READWRITE_SPLITTING);
			setState(72);
			match(RULE);
			setState(73);
			ruleName();
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==ENABLE || _la==DISABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			storageUnitName();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(76);
				match(FROM);
				setState(77);
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
	public static class ShowStatusFromReadwriteSplittingRulesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ReadwriteSplittingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode STATUS() { return getToken(ReadwriteSplittingDistSQLStatementParser.STATUS, 0); }
		public List<TerminalNode> FROM() { return getTokens(ReadwriteSplittingDistSQLStatementParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(ReadwriteSplittingDistSQLStatementParser.FROM, i);
		}
		public TerminalNode READWRITE_SPLITTING() { return getToken(ReadwriteSplittingDistSQLStatementParser.READWRITE_SPLITTING, 0); }
		public TerminalNode RULES() { return getToken(ReadwriteSplittingDistSQLStatementParser.RULES, 0); }
		public TerminalNode RULE() { return getToken(ReadwriteSplittingDistSQLStatementParser.RULE, 0); }
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowStatusFromReadwriteSplittingRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStatusFromReadwriteSplittingRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterShowStatusFromReadwriteSplittingRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitShowStatusFromReadwriteSplittingRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitShowStatusFromReadwriteSplittingRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStatusFromReadwriteSplittingRulesContext showStatusFromReadwriteSplittingRules() throws RecognitionException {
		ShowStatusFromReadwriteSplittingRulesContext _localctx = new ShowStatusFromReadwriteSplittingRulesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_showStatusFromReadwriteSplittingRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(SHOW);
			setState(81);
			match(STATUS);
			setState(82);
			match(FROM);
			setState(83);
			match(READWRITE_SPLITTING);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULES:
				{
				setState(84);
				match(RULES);
				}
				break;
			case RULE:
				{
				setState(85);
				match(RULE);
				setState(86);
				ruleName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(89);
				match(FROM);
				setState(90);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(ReadwriteSplittingDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(ReadwriteSplittingDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(ReadwriteSplittingDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(ReadwriteSplittingDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ReadwriteSplittingDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlgorithmDefinitionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ReadwriteSplittingDistSQLStatementParser.TYPE, 0); }
		public TerminalNode LP_() { return getToken(ReadwriteSplittingDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(ReadwriteSplittingDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(ReadwriteSplittingDistSQLStatementParser.EQ_, 0); }
		public AlgorithmTypeNameContext algorithmTypeName() {
			return getRuleContext(AlgorithmTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ReadwriteSplittingDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(ReadwriteSplittingDistSQLStatementParser.COMMA_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public AlgorithmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterAlgorithmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitAlgorithmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDefinitionContext algorithmDefinition() throws RecognitionException {
		AlgorithmDefinitionContext _localctx = new AlgorithmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_algorithmDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(TYPE);
			setState(103);
			match(LP_);
			setState(104);
			match(NAME);
			setState(105);
			match(EQ_);
			setState(106);
			algorithmTypeName();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(107);
				match(COMMA_);
				setState(108);
				propertiesDefinition();
				}
			}

			setState(111);
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
		public TerminalNode STRING_() { return getToken(ReadwriteSplittingDistSQLStatementParser.STRING_, 0); }
		public BuildInReadQueryLoadBalanceAlgorithmTypeContext buildInReadQueryLoadBalanceAlgorithmType() {
			return getRuleContext(BuildInReadQueryLoadBalanceAlgorithmTypeContext.class,0);
		}
		public AlgorithmTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterAlgorithmTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitAlgorithmTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmTypeNameContext algorithmTypeName() throws RecognitionException {
		AlgorithmTypeNameContext _localctx = new AlgorithmTypeNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_algorithmTypeName);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(STRING_);
				}
				break;
			case ROUND_ROBIN:
			case RANDOM:
			case WEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				buildInReadQueryLoadBalanceAlgorithmType();
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
	public static class BuildInReadQueryLoadBalanceAlgorithmTypeContext extends ParserRuleContext {
		public TerminalNode ROUND_ROBIN() { return getToken(ReadwriteSplittingDistSQLStatementParser.ROUND_ROBIN, 0); }
		public TerminalNode RANDOM() { return getToken(ReadwriteSplittingDistSQLStatementParser.RANDOM, 0); }
		public TerminalNode WEIGHT() { return getToken(ReadwriteSplittingDistSQLStatementParser.WEIGHT, 0); }
		public BuildInReadQueryLoadBalanceAlgorithmTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInReadQueryLoadBalanceAlgorithmType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterBuildInReadQueryLoadBalanceAlgorithmType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitBuildInReadQueryLoadBalanceAlgorithmType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitBuildInReadQueryLoadBalanceAlgorithmType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInReadQueryLoadBalanceAlgorithmTypeContext buildInReadQueryLoadBalanceAlgorithmType() throws RecognitionException {
		BuildInReadQueryLoadBalanceAlgorithmTypeContext _localctx = new BuildInReadQueryLoadBalanceAlgorithmTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_buildInReadQueryLoadBalanceAlgorithmType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 7L) != 0)) ) {
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
		public TerminalNode PROPERTIES() { return getToken(ReadwriteSplittingDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(ReadwriteSplittingDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(ReadwriteSplittingDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefinitionContext propertiesDefinition() throws RecognitionException {
		PropertiesDefinitionContext _localctx = new PropertiesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertiesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PROPERTIES);
			setState(120);
			match(LP_);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(121);
				properties();
				}
			}

			setState(124);
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
		public List<TerminalNode> COMMA_() { return getTokens(ReadwriteSplittingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ReadwriteSplittingDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			property();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(127);
				match(COMMA_);
				setState(128);
				property();
				}
				}
				setState(133);
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
		public TerminalNode EQ_() { return getToken(ReadwriteSplittingDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(ReadwriteSplittingDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(135);
			match(EQ_);
			setState(136);
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
	public static class DatabaseNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ReadwriteSplittingDistSQLStatementParser.IDENTIFIER_, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
	public static class RuleNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ReadwriteSplittingDistSQLStatementParser.IDENTIFIER_, 0); }
		public RuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitRuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitRuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleNameContext ruleName() throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ruleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
	public static class StorageUnitNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ReadwriteSplittingDistSQLStatementParser.IDENTIFIER_, 0); }
		public StorageUnitNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageUnitName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterStorageUnitName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitStorageUnitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitStorageUnitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageUnitNameContext storageUnitName() throws RecognitionException {
		StorageUnitNameContext _localctx = new StorageUnitNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_storageUnitName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
	public static class CreateReadwriteSplittingRuleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ReadwriteSplittingDistSQLStatementParser.CREATE, 0); }
		public TerminalNode READWRITE_SPLITTING() { return getToken(ReadwriteSplittingDistSQLStatementParser.READWRITE_SPLITTING, 0); }
		public TerminalNode RULE() { return getToken(ReadwriteSplittingDistSQLStatementParser.RULE, 0); }
		public List<ReadwriteSplittingRuleDefinitionContext> readwriteSplittingRuleDefinition() {
			return getRuleContexts(ReadwriteSplittingRuleDefinitionContext.class);
		}
		public ReadwriteSplittingRuleDefinitionContext readwriteSplittingRuleDefinition(int i) {
			return getRuleContext(ReadwriteSplittingRuleDefinitionContext.class,i);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ReadwriteSplittingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ReadwriteSplittingDistSQLStatementParser.COMMA_, i);
		}
		public CreateReadwriteSplittingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createReadwriteSplittingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterCreateReadwriteSplittingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitCreateReadwriteSplittingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitCreateReadwriteSplittingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateReadwriteSplittingRuleContext createReadwriteSplittingRule() throws RecognitionException {
		CreateReadwriteSplittingRuleContext _localctx = new CreateReadwriteSplittingRuleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_createReadwriteSplittingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(CREATE);
			setState(145);
			match(READWRITE_SPLITTING);
			setState(146);
			match(RULE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(147);
				ifNotExists();
				}
			}

			setState(150);
			readwriteSplittingRuleDefinition();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(151);
				match(COMMA_);
				setState(152);
				readwriteSplittingRuleDefinition();
				}
				}
				setState(157);
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
	public static class AlterReadwriteSplittingRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ReadwriteSplittingDistSQLStatementParser.ALTER, 0); }
		public TerminalNode READWRITE_SPLITTING() { return getToken(ReadwriteSplittingDistSQLStatementParser.READWRITE_SPLITTING, 0); }
		public TerminalNode RULE() { return getToken(ReadwriteSplittingDistSQLStatementParser.RULE, 0); }
		public List<ReadwriteSplittingRuleDefinitionContext> readwriteSplittingRuleDefinition() {
			return getRuleContexts(ReadwriteSplittingRuleDefinitionContext.class);
		}
		public ReadwriteSplittingRuleDefinitionContext readwriteSplittingRuleDefinition(int i) {
			return getRuleContext(ReadwriteSplittingRuleDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ReadwriteSplittingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ReadwriteSplittingDistSQLStatementParser.COMMA_, i);
		}
		public AlterReadwriteSplittingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterReadwriteSplittingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterAlterReadwriteSplittingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitAlterReadwriteSplittingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitAlterReadwriteSplittingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterReadwriteSplittingRuleContext alterReadwriteSplittingRule() throws RecognitionException {
		AlterReadwriteSplittingRuleContext _localctx = new AlterReadwriteSplittingRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alterReadwriteSplittingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ALTER);
			setState(159);
			match(READWRITE_SPLITTING);
			setState(160);
			match(RULE);
			setState(161);
			readwriteSplittingRuleDefinition();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(162);
				match(COMMA_);
				setState(163);
				readwriteSplittingRuleDefinition();
				}
				}
				setState(168);
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
	public static class DropReadwriteSplittingRuleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ReadwriteSplittingDistSQLStatementParser.DROP, 0); }
		public TerminalNode READWRITE_SPLITTING() { return getToken(ReadwriteSplittingDistSQLStatementParser.READWRITE_SPLITTING, 0); }
		public TerminalNode RULE() { return getToken(ReadwriteSplittingDistSQLStatementParser.RULE, 0); }
		public List<RuleNameContext> ruleName() {
			return getRuleContexts(RuleNameContext.class);
		}
		public RuleNameContext ruleName(int i) {
			return getRuleContext(RuleNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ReadwriteSplittingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ReadwriteSplittingDistSQLStatementParser.COMMA_, i);
		}
		public DropReadwriteSplittingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropReadwriteSplittingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterDropReadwriteSplittingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitDropReadwriteSplittingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitDropReadwriteSplittingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropReadwriteSplittingRuleContext dropReadwriteSplittingRule() throws RecognitionException {
		DropReadwriteSplittingRuleContext _localctx = new DropReadwriteSplittingRuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dropReadwriteSplittingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(DROP);
			setState(170);
			match(READWRITE_SPLITTING);
			setState(171);
			match(RULE);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(172);
				ifExists();
				}
			}

			setState(175);
			ruleName();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(176);
				match(COMMA_);
				setState(177);
				ruleName();
				}
				}
				setState(182);
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
	public static class ReadwriteSplittingRuleDefinitionContext extends ParserRuleContext {
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(ReadwriteSplittingDistSQLStatementParser.LP_, 0); }
		public DataSourceDefinitionContext dataSourceDefinition() {
			return getRuleContext(DataSourceDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ReadwriteSplittingDistSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(ReadwriteSplittingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ReadwriteSplittingDistSQLStatementParser.COMMA_, i);
		}
		public TransactionalReadQueryStrategyContext transactionalReadQueryStrategy() {
			return getRuleContext(TransactionalReadQueryStrategyContext.class,0);
		}
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public ReadwriteSplittingRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readwriteSplittingRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterReadwriteSplittingRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitReadwriteSplittingRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitReadwriteSplittingRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadwriteSplittingRuleDefinitionContext readwriteSplittingRuleDefinition() throws RecognitionException {
		ReadwriteSplittingRuleDefinitionContext _localctx = new ReadwriteSplittingRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_readwriteSplittingRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			ruleName();
			setState(184);
			match(LP_);
			setState(185);
			dataSourceDefinition();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(186);
				match(COMMA_);
				setState(187);
				transactionalReadQueryStrategy();
				}
				break;
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(190);
				match(COMMA_);
				setState(191);
				algorithmDefinition();
				}
			}

			setState(194);
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
	public static class DataSourceDefinitionContext extends ParserRuleContext {
		public WriteStorageUnitContext writeStorageUnit() {
			return getRuleContext(WriteStorageUnitContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(ReadwriteSplittingDistSQLStatementParser.COMMA_, 0); }
		public ReadStorageUnitsContext readStorageUnits() {
			return getRuleContext(ReadStorageUnitsContext.class,0);
		}
		public DataSourceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSourceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterDataSourceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitDataSourceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitDataSourceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSourceDefinitionContext dataSourceDefinition() throws RecognitionException {
		DataSourceDefinitionContext _localctx = new DataSourceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dataSourceDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			writeStorageUnit();
			setState(197);
			match(COMMA_);
			setState(198);
			readStorageUnits();
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
	public static class WriteStorageUnitContext extends ParserRuleContext {
		public TerminalNode WRITE_STORAGE_UNIT() { return getToken(ReadwriteSplittingDistSQLStatementParser.WRITE_STORAGE_UNIT, 0); }
		public TerminalNode EQ_() { return getToken(ReadwriteSplittingDistSQLStatementParser.EQ_, 0); }
		public WriteStorageUnitNameContext writeStorageUnitName() {
			return getRuleContext(WriteStorageUnitNameContext.class,0);
		}
		public WriteStorageUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStorageUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterWriteStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitWriteStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitWriteStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStorageUnitContext writeStorageUnit() throws RecognitionException {
		WriteStorageUnitContext _localctx = new WriteStorageUnitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_writeStorageUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(WRITE_STORAGE_UNIT);
			setState(201);
			match(EQ_);
			setState(202);
			writeStorageUnitName();
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
	public static class ReadStorageUnitsContext extends ParserRuleContext {
		public TerminalNode READ_STORAGE_UNITS() { return getToken(ReadwriteSplittingDistSQLStatementParser.READ_STORAGE_UNITS, 0); }
		public TerminalNode LP_() { return getToken(ReadwriteSplittingDistSQLStatementParser.LP_, 0); }
		public ReadStorageUnitsNamesContext readStorageUnitsNames() {
			return getRuleContext(ReadStorageUnitsNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ReadwriteSplittingDistSQLStatementParser.RP_, 0); }
		public ReadStorageUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStorageUnits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterReadStorageUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitReadStorageUnits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitReadStorageUnits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStorageUnitsContext readStorageUnits() throws RecognitionException {
		ReadStorageUnitsContext _localctx = new ReadStorageUnitsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_readStorageUnits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(READ_STORAGE_UNITS);
			setState(205);
			match(LP_);
			setState(206);
			readStorageUnitsNames();
			setState(207);
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
	public static class TransactionalReadQueryStrategyContext extends ParserRuleContext {
		public TerminalNode TRANSACTIONAL_READ_QUERY_STRATEGY() { return getToken(ReadwriteSplittingDistSQLStatementParser.TRANSACTIONAL_READ_QUERY_STRATEGY, 0); }
		public TerminalNode EQ_() { return getToken(ReadwriteSplittingDistSQLStatementParser.EQ_, 0); }
		public TransactionalReadQueryStrategyNameContext transactionalReadQueryStrategyName() {
			return getRuleContext(TransactionalReadQueryStrategyNameContext.class,0);
		}
		public TransactionalReadQueryStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionalReadQueryStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterTransactionalReadQueryStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitTransactionalReadQueryStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitTransactionalReadQueryStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionalReadQueryStrategyContext transactionalReadQueryStrategy() throws RecognitionException {
		TransactionalReadQueryStrategyContext _localctx = new TransactionalReadQueryStrategyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_transactionalReadQueryStrategy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(TRANSACTIONAL_READ_QUERY_STRATEGY);
			setState(210);
			match(EQ_);
			setState(211);
			transactionalReadQueryStrategyName();
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
	public static class WriteStorageUnitNameContext extends ParserRuleContext {
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public WriteStorageUnitNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStorageUnitName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterWriteStorageUnitName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitWriteStorageUnitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitWriteStorageUnitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStorageUnitNameContext writeStorageUnitName() throws RecognitionException {
		WriteStorageUnitNameContext _localctx = new WriteStorageUnitNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_writeStorageUnitName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			storageUnitName();
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
	public static class ReadStorageUnitsNamesContext extends ParserRuleContext {
		public List<StorageUnitNameContext> storageUnitName() {
			return getRuleContexts(StorageUnitNameContext.class);
		}
		public StorageUnitNameContext storageUnitName(int i) {
			return getRuleContext(StorageUnitNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ReadwriteSplittingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ReadwriteSplittingDistSQLStatementParser.COMMA_, i);
		}
		public ReadStorageUnitsNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStorageUnitsNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterReadStorageUnitsNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitReadStorageUnitsNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitReadStorageUnitsNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStorageUnitsNamesContext readStorageUnitsNames() throws RecognitionException {
		ReadStorageUnitsNamesContext _localctx = new ReadStorageUnitsNamesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_readStorageUnitsNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			storageUnitName();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(216);
				match(COMMA_);
				setState(217);
				storageUnitName();
				}
				}
				setState(222);
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
	public static class TransactionalReadQueryStrategyNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(ReadwriteSplittingDistSQLStatementParser.STRING_, 0); }
		public TransactionalReadQueryStrategyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionalReadQueryStrategyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterTransactionalReadQueryStrategyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitTransactionalReadQueryStrategyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitTransactionalReadQueryStrategyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionalReadQueryStrategyNameContext transactionalReadQueryStrategyName() throws RecognitionException {
		TransactionalReadQueryStrategyNameContext _localctx = new TransactionalReadQueryStrategyNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_transactionalReadQueryStrategyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ReadwriteSplittingDistSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ReadwriteSplittingDistSQLStatementParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IF);
			setState(226);
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
		public TerminalNode IF() { return getToken(ReadwriteSplittingDistSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ReadwriteSplittingDistSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ReadwriteSplittingDistSQLStatementParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(IF);
			setState(229);
			match(NOT);
			setState(230);
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
	public static class ShowReadwriteSplittingRulesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ReadwriteSplittingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode READWRITE_SPLITTING() { return getToken(ReadwriteSplittingDistSQLStatementParser.READWRITE_SPLITTING, 0); }
		public TerminalNode RULE() { return getToken(ReadwriteSplittingDistSQLStatementParser.RULE, 0); }
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public TerminalNode RULES() { return getToken(ReadwriteSplittingDistSQLStatementParser.RULES, 0); }
		public TerminalNode FROM() { return getToken(ReadwriteSplittingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowReadwriteSplittingRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showReadwriteSplittingRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterShowReadwriteSplittingRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitShowReadwriteSplittingRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitShowReadwriteSplittingRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowReadwriteSplittingRulesContext showReadwriteSplittingRules() throws RecognitionException {
		ShowReadwriteSplittingRulesContext _localctx = new ShowReadwriteSplittingRulesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_showReadwriteSplittingRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(SHOW);
			setState(233);
			match(READWRITE_SPLITTING);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE:
				{
				setState(234);
				match(RULE);
				setState(235);
				ruleName();
				}
				break;
			case RULES:
				{
				setState(236);
				match(RULES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(239);
				match(FROM);
				setState(240);
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
	public static class CountReadwriteSplittingRuleContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(ReadwriteSplittingDistSQLStatementParser.COUNT, 0); }
		public TerminalNode READWRITE_SPLITTING() { return getToken(ReadwriteSplittingDistSQLStatementParser.READWRITE_SPLITTING, 0); }
		public TerminalNode RULE() { return getToken(ReadwriteSplittingDistSQLStatementParser.RULE, 0); }
		public TerminalNode FROM() { return getToken(ReadwriteSplittingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public CountReadwriteSplittingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countReadwriteSplittingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).enterCountReadwriteSplittingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadwriteSplittingDistSQLStatementListener ) ((ReadwriteSplittingDistSQLStatementListener)listener).exitCountReadwriteSplittingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadwriteSplittingDistSQLStatementVisitor ) return ((ReadwriteSplittingDistSQLStatementVisitor<? extends T>)visitor).visitCountReadwriteSplittingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountReadwriteSplittingRuleContext countReadwriteSplittingRule() throws RecognitionException {
		CountReadwriteSplittingRuleContext _localctx = new CountReadwriteSplittingRuleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_countReadwriteSplittingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(COUNT);
			setState(244);
			match(READWRITE_SPLITTING);
			setState(245);
			match(RULE);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(246);
				match(FROM);
				setState(247);
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
		"\u0004\u0001O\u00fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000@\b\u0000\u0001\u0000\u0003\u0000C\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002X\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003e\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004n\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005t\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"{\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0082"+
		"\b\b\n\b\f\b\u0085\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0095\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u009a\b\r\n\r\f\r"+
		"\u009d\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00a5\b\u000e\n\u000e\f\u000e\u00a8\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ae\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b3\b\u000f\n\u000f\f\u000f"+
		"\u00b6\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00bd\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c1\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u00db\b\u0016\n\u0016\f\u0016\u00de\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u00ee\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u00f2\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u00f9\b\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.0246\u0000\u0002\u0001\u0000>?\u0001\u0000DF\u00fb\u0000?\u0001"+
		"\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004P\u0001\u0000\u0000"+
		"\u0000\u0006d\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000\u0000\ns\u0001"+
		"\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000"+
		"\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000"+
		"\u0014\u008a\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000"+
		"\u0018\u008e\u0001\u0000\u0000\u0000\u001a\u0090\u0001\u0000\u0000\u0000"+
		"\u001c\u009e\u0001\u0000\u0000\u0000\u001e\u00a9\u0001\u0000\u0000\u0000"+
		" \u00b7\u0001\u0000\u0000\u0000\"\u00c4\u0001\u0000\u0000\u0000$\u00c8"+
		"\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000\u0000\u0000(\u00d1\u0001\u0000"+
		"\u0000\u0000*\u00d5\u0001\u0000\u0000\u0000,\u00d7\u0001\u0000\u0000\u0000"+
		".\u00df\u0001\u0000\u0000\u00000\u00e1\u0001\u0000\u0000\u00002\u00e4"+
		"\u0001\u0000\u0000\u00004\u00e8\u0001\u0000\u0000\u00006\u00f3\u0001\u0000"+
		"\u0000\u00008@\u0003\u001a\r\u00009@\u0003\u001c\u000e\u0000:@\u0003\u001e"+
		"\u000f\u0000;@\u00034\u001a\u0000<@\u0003\u0002\u0001\u0000=@\u0003\u0004"+
		"\u0002\u0000>@\u00036\u001b\u0000?8\u0001\u0000\u0000\u0000?9\u0001\u0000"+
		"\u0000\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000AC\u0005(\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005\u0000\u0000"+
		"\u0001E\u0001\u0001\u0000\u0000\u0000FG\u0005/\u0000\u0000GH\u00054\u0000"+
		"\u0000HI\u00052\u0000\u0000IJ\u0003\u0016\u000b\u0000JK\u0007\u0000\u0000"+
		"\u0000KN\u0003\u0018\f\u0000LM\u00053\u0000\u0000MO\u0003\u0014\n\u0000"+
		"NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0003\u0001\u0000"+
		"\u0000\u0000PQ\u00051\u0000\u0000QR\u0005=\u0000\u0000RS\u00053\u0000"+
		"\u0000SW\u00054\u0000\u0000TX\u0005;\u0000\u0000UV\u00052\u0000\u0000"+
		"VX\u0003\u0016\u000b\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000X[\u0001\u0000\u0000\u0000YZ\u00053\u0000\u0000Z\\\u0003\u0014\n"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0005\u0001"+
		"\u0000\u0000\u0000]e\u0005J\u0000\u0000^`\u0005\r\u0000\u0000_^\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ae\u0005K\u0000\u0000be\u0005,\u0000\u0000ce\u0005-\u0000\u0000d]\u0001"+
		"\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000e\u0007\u0001\u0000\u0000\u0000fg\u00058\u0000"+
		"\u0000gh\u0005\u001c\u0000\u0000hi\u00059\u0000\u0000ij\u0005\u0015\u0000"+
		"\u0000jm\u0003\n\u0005\u0000kl\u0005\"\u0000\u0000ln\u0003\u000e\u0007"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000op\u0005\u001d\u0000\u0000p\t\u0001\u0000\u0000\u0000qt\u0005"+
		"J\u0000\u0000rt\u0003\f\u0006\u0000sq\u0001\u0000\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000t\u000b\u0001\u0000\u0000\u0000uv\u0007\u0001\u0000"+
		"\u0000v\r\u0001\u0000\u0000\u0000wx\u0005:\u0000\u0000xz\u0005\u001c\u0000"+
		"\u0000y{\u0003\u0010\b\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u001d\u0000\u0000}\u000f\u0001"+
		"\u0000\u0000\u0000~\u0083\u0003\u0012\t\u0000\u007f\u0080\u0005\"\u0000"+
		"\u0000\u0080\u0082\u0003\u0012\t\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0011\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005J\u0000\u0000\u0087"+
		"\u0088\u0005\u0015\u0000\u0000\u0088\u0089\u0003\u0006\u0003\u0000\u0089"+
		"\u0013\u0001\u0000\u0000\u0000\u008a\u008b\u0005I\u0000\u0000\u008b\u0015"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005I\u0000\u0000\u008d\u0017\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005I\u0000\u0000\u008f\u0019\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005.\u0000\u0000\u0091\u0092\u00054\u0000\u0000"+
		"\u0092\u0094\u00052\u0000\u0000\u0093\u0095\u00032\u0019\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u009b\u0003 \u0010\u0000\u0097\u0098\u0005"+
		"\"\u0000\u0000\u0098\u009a\u0003 \u0010\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u001b\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005/\u0000"+
		"\u0000\u009f\u00a0\u00054\u0000\u0000\u00a0\u00a1\u00052\u0000\u0000\u00a1"+
		"\u00a6\u0003 \u0010\u0000\u00a2\u00a3\u0005\"\u0000\u0000\u00a3\u00a5"+
		"\u0003 \u0010\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u001d\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u00050\u0000\u0000\u00aa\u00ab\u00054\u0000"+
		"\u0000\u00ab\u00ad\u00052\u0000\u0000\u00ac\u00ae\u00030\u0018\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b4\u0003\u0016\u000b\u0000\u00b0"+
		"\u00b1\u0005\"\u0000\u0000\u00b1\u00b3\u0003\u0016\u000b\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u001f"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0003\u0016\u000b\u0000\u00b8\u00b9\u0005\u001c\u0000\u0000\u00b9\u00bc"+
		"\u0003\"\u0011\u0000\u00ba\u00bb\u0005\"\u0000\u0000\u00bb\u00bd\u0003"+
		"(\u0014\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\"\u0000"+
		"\u0000\u00bf\u00c1\u0003\b\u0004\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005\u001d\u0000\u0000\u00c3!\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0003$\u0012\u0000\u00c5\u00c6\u0005\"\u0000\u0000\u00c6\u00c7"+
		"\u0003&\u0013\u0000\u00c7#\u0001\u0000\u0000\u0000\u00c8\u00c9\u00055"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0015\u0000\u0000\u00ca\u00cb\u0003*\u0015"+
		"\u0000\u00cb%\u0001\u0000\u0000\u0000\u00cc\u00cd\u00056\u0000\u0000\u00cd"+
		"\u00ce\u0005\u001c\u0000\u0000\u00ce\u00cf\u0003,\u0016\u0000\u00cf\u00d0"+
		"\u0005\u001d\u0000\u0000\u00d0\'\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"7\u0000\u0000\u00d2\u00d3\u0005\u0015\u0000\u0000\u00d3\u00d4\u0003.\u0017"+
		"\u0000\u00d4)\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003\u0018\f\u0000"+
		"\u00d6+\u0001\u0000\u0000\u0000\u00d7\u00dc\u0003\u0018\f\u0000\u00d8"+
		"\u00d9\u0005\"\u0000\u0000\u00d9\u00db\u0003\u0018\f\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd-\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"J\u0000\u0000\u00e0/\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005A\u0000"+
		"\u0000\u00e2\u00e3\u0005B\u0000\u0000\u00e31\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005A\u0000\u0000\u00e5\u00e6\u0005G\u0000\u0000\u00e6\u00e7\u0005"+
		"B\u0000\u0000\u00e73\u0001\u0000\u0000\u0000\u00e8\u00e9\u00051\u0000"+
		"\u0000\u00e9\u00ed\u00054\u0000\u0000\u00ea\u00eb\u00052\u0000\u0000\u00eb"+
		"\u00ee\u0003\u0016\u000b\u0000\u00ec\u00ee\u0005;\u0000\u0000\u00ed\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u00053\u0000\u0000\u00f0\u00f2\u0003"+
		"\u0014\n\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f25\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005C\u0000\u0000"+
		"\u00f4\u00f5\u00054\u0000\u0000\u00f5\u00f8\u00052\u0000\u0000\u00f6\u00f7"+
		"\u00053\u0000\u0000\u00f7\u00f9\u0003\u0014\n\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f97\u0001\u0000"+
		"\u0000\u0000\u0016?BNW[_dmsz\u0083\u0094\u009b\u00a6\u00ad\u00b4\u00bc"+
		"\u00c0\u00dc\u00ed\u00f1\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
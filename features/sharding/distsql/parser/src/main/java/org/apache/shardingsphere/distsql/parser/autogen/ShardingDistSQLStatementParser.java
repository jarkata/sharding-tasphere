// Generated from /Users/code/gitcode/shardingsphere/features/sharding/distsql/parser/src/main/antlr4/sharding/org/apache/shardingsphere/distsql/parser/autogen/ShardingDistSQLStatement.g4 by ANTLR 4.13.2
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
public class ShardingDistSQLStatementParser extends Parser {
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
		WS=43, CREATE=44, ALTER=45, DROP=46, SHOW=47, SHARDING=48, RULE=49, FROM=50, 
		STORAGE_UNITS=51, KEY_GENERATE_STRATEGY=52, DEFAULT_TABLE_STRATEGY=53, 
		TABLE=54, SHARDING_COLUMN=55, SHARDING_COLUMNS=56, TYPE=57, NAME=58, PROPERTIES=59, 
		COLUMN=60, REFERENCE=61, RULES=62, COLUMNS=63, ALGORITHM=64, ALGORITHMS=65, 
		HINT=66, DEFAULT=67, DATABASE=68, SHARDING_ALGORITHM=69, STRATEGY=70, 
		DATANODES=71, DATABASE_STRATEGY=72, TABLE_STRATEGY=73, NODES=74, KEY=75, 
		GENERATOR=76, GENERATORS=77, KEY_GENERATOR=78, UNUSED=79, USED=80, IF=81, 
		EXISTS=82, WITH=83, COUNT=84, AUDITOR=85, AUDITORS=86, AUDIT_STRATEGY=87, 
		ALLOW_HINT_DISABLE=88, TRUE=89, FALSE=90, MOD=91, HASH_MOD=92, VOLUME_RANGE=93, 
		BOUNDARY_RANGE=94, AUTO_INTERVAL=95, INLINE=96, INTERVAL=97, COMPLEX_INLINE=98, 
		HINT_INLINE=99, CLASS_BASED=100, SNOWFLAKE=101, UUID=102, STANDARD=103, 
		COMPLEX=104, DML_SHARDING_CONDITIONS=105, NOT=106, NONE=107, PLUGINS=108, 
		FOR_GENERATOR=109, IDENTIFIER_=110, STRING_=111, INT_=112;
	public static final int
		RULE_execute = 0, RULE_createShardingTableRule = 1, RULE_alterShardingTableRule = 2, 
		RULE_dropShardingTableRule = 3, RULE_createShardingTableReferenceRule = 4, 
		RULE_alterShardingTableReferenceRule = 5, RULE_dropShardingTableReferenceRule = 6, 
		RULE_dropShardingAlgorithm = 7, RULE_createDefaultShardingStrategy = 8, 
		RULE_alterDefaultShardingStrategy = 9, RULE_dropDefaultShardingStrategy = 10, 
		RULE_dropShardingKeyGenerator = 11, RULE_dropShardingAuditor = 12, RULE_shardingTableRuleDefinition = 13, 
		RULE_shardingAutoTableRule = 14, RULE_shardingTableRule = 15, RULE_keyGeneratorName = 16, 
		RULE_auditorDefinition = 17, RULE_auditorName = 18, RULE_storageUnits = 19, 
		RULE_storageUnit = 20, RULE_dataNodes = 21, RULE_dataNode = 22, RULE_autoShardingColumnDefinition = 23, 
		RULE_shardingColumnDefinition = 24, RULE_shardingColumn = 25, RULE_shardingColumns = 26, 
		RULE_shardingAlgorithm = 27, RULE_shardingStrategy = 28, RULE_databaseStrategy = 29, 
		RULE_tableStrategy = 30, RULE_keyGenerateDefinition = 31, RULE_auditDefinition = 32, 
		RULE_multiAuditDefinition = 33, RULE_singleAuditDefinition = 34, RULE_auditAllowHintDisable = 35, 
		RULE_columnName = 36, RULE_tableReferenceRuleDefinition = 37, RULE_strategyType = 38, 
		RULE_buildInStrategyType = 39, RULE_ifExists = 40, RULE_ifNotExists = 41, 
		RULE_literal = 42, RULE_algorithmDefinition = 43, RULE_algorithmTypeName = 44, 
		RULE_buildInShardingAlgorithmType = 45, RULE_buildInKeyGenerateAlgorithmType = 46, 
		RULE_buildInShardingAuditAlgorithmType = 47, RULE_propertiesDefinition = 48, 
		RULE_properties = 49, RULE_property = 50, RULE_tableName = 51, RULE_shardingAlgorithmName = 52, 
		RULE_ruleName = 53, RULE_showShardingTableRules = 54, RULE_showShardingTableReferenceRules = 55, 
		RULE_showShardingAlgorithms = 56, RULE_showShardingAuditors = 57, RULE_showShardingTableNodes = 58, 
		RULE_showShardingKeyGenerators = 59, RULE_showDefaultShardingStrategy = 60, 
		RULE_showUnusedShardingAlgorithms = 61, RULE_showUnusedShardingKeyGenerators = 62, 
		RULE_showUnusedShardingAuditors = 63, RULE_showShardingTableRulesUsedAlgorithm = 64, 
		RULE_showShardingTableRulesUsedKeyGenerator = 65, RULE_showShardingTableRulesUsedAuditor = 66, 
		RULE_countShardingRule = 67, RULE_tableRule = 68, RULE_databaseName = 69, 
		RULE_showShardingAlgorithmPlugins = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "createShardingTableRule", "alterShardingTableRule", "dropShardingTableRule", 
			"createShardingTableReferenceRule", "alterShardingTableReferenceRule", 
			"dropShardingTableReferenceRule", "dropShardingAlgorithm", "createDefaultShardingStrategy", 
			"alterDefaultShardingStrategy", "dropDefaultShardingStrategy", "dropShardingKeyGenerator", 
			"dropShardingAuditor", "shardingTableRuleDefinition", "shardingAutoTableRule", 
			"shardingTableRule", "keyGeneratorName", "auditorDefinition", "auditorName", 
			"storageUnits", "storageUnit", "dataNodes", "dataNode", "autoShardingColumnDefinition", 
			"shardingColumnDefinition", "shardingColumn", "shardingColumns", "shardingAlgorithm", 
			"shardingStrategy", "databaseStrategy", "tableStrategy", "keyGenerateDefinition", 
			"auditDefinition", "multiAuditDefinition", "singleAuditDefinition", "auditAllowHintDisable", 
			"columnName", "tableReferenceRuleDefinition", "strategyType", "buildInStrategyType", 
			"ifExists", "ifNotExists", "literal", "algorithmDefinition", "algorithmTypeName", 
			"buildInShardingAlgorithmType", "buildInKeyGenerateAlgorithmType", "buildInShardingAuditAlgorithmType", 
			"propertiesDefinition", "properties", "property", "tableName", "shardingAlgorithmName", 
			"ruleName", "showShardingTableRules", "showShardingTableReferenceRules", 
			"showShardingAlgorithms", "showShardingAuditors", "showShardingTableNodes", 
			"showShardingKeyGenerators", "showDefaultShardingStrategy", "showUnusedShardingAlgorithms", 
			"showUnusedShardingKeyGenerators", "showUnusedShardingAuditors", "showShardingTableRulesUsedAlgorithm", 
			"showShardingTableRulesUsedKeyGenerator", "showShardingTableRulesUsedAuditor", 
			"countShardingRule", "tableRule", "databaseName", "showShardingAlgorithmPlugins"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"BQ_", "QUESTION_", "AT_", "SEMI_", "JSONSEPARATOR_", "UL_", "WS", "CREATE", 
			"ALTER", "DROP", "SHOW", "SHARDING", "RULE", "FROM", "STORAGE_UNITS", 
			"KEY_GENERATE_STRATEGY", "DEFAULT_TABLE_STRATEGY", "TABLE", "SHARDING_COLUMN", 
			"SHARDING_COLUMNS", "TYPE", "NAME", "PROPERTIES", "COLUMN", "REFERENCE", 
			"RULES", "COLUMNS", "ALGORITHM", "ALGORITHMS", "HINT", "DEFAULT", "DATABASE", 
			"SHARDING_ALGORITHM", "STRATEGY", "DATANODES", "DATABASE_STRATEGY", "TABLE_STRATEGY", 
			"NODES", "KEY", "GENERATOR", "GENERATORS", "KEY_GENERATOR", "UNUSED", 
			"USED", "IF", "EXISTS", "WITH", "COUNT", "AUDITOR", "AUDITORS", "AUDIT_STRATEGY", 
			"ALLOW_HINT_DISABLE", "TRUE", "FALSE", "MOD", "HASH_MOD", "VOLUME_RANGE", 
			"BOUNDARY_RANGE", "AUTO_INTERVAL", "INLINE", "INTERVAL", "COMPLEX_INLINE", 
			"HINT_INLINE", "CLASS_BASED", "SNOWFLAKE", "UUID", "STANDARD", "COMPLEX", 
			"DML_SHARDING_CONDITIONS", "NOT", "NONE", "PLUGINS", "FOR_GENERATOR", 
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
	public String getGrammarFileName() { return "ShardingDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShardingDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ShardingDistSQLStatementParser.EOF, 0); }
		public CreateShardingTableRuleContext createShardingTableRule() {
			return getRuleContext(CreateShardingTableRuleContext.class,0);
		}
		public CreateDefaultShardingStrategyContext createDefaultShardingStrategy() {
			return getRuleContext(CreateDefaultShardingStrategyContext.class,0);
		}
		public CreateShardingTableReferenceRuleContext createShardingTableReferenceRule() {
			return getRuleContext(CreateShardingTableReferenceRuleContext.class,0);
		}
		public AlterShardingTableRuleContext alterShardingTableRule() {
			return getRuleContext(AlterShardingTableRuleContext.class,0);
		}
		public AlterShardingTableReferenceRuleContext alterShardingTableReferenceRule() {
			return getRuleContext(AlterShardingTableReferenceRuleContext.class,0);
		}
		public DropShardingTableRuleContext dropShardingTableRule() {
			return getRuleContext(DropShardingTableRuleContext.class,0);
		}
		public DropShardingTableReferenceRuleContext dropShardingTableReferenceRule() {
			return getRuleContext(DropShardingTableReferenceRuleContext.class,0);
		}
		public DropShardingAlgorithmContext dropShardingAlgorithm() {
			return getRuleContext(DropShardingAlgorithmContext.class,0);
		}
		public ShowShardingTableRulesUsedAlgorithmContext showShardingTableRulesUsedAlgorithm() {
			return getRuleContext(ShowShardingTableRulesUsedAlgorithmContext.class,0);
		}
		public ShowShardingTableRulesUsedKeyGeneratorContext showShardingTableRulesUsedKeyGenerator() {
			return getRuleContext(ShowShardingTableRulesUsedKeyGeneratorContext.class,0);
		}
		public ShowShardingTableRulesUsedAuditorContext showShardingTableRulesUsedAuditor() {
			return getRuleContext(ShowShardingTableRulesUsedAuditorContext.class,0);
		}
		public ShowShardingTableRulesContext showShardingTableRules() {
			return getRuleContext(ShowShardingTableRulesContext.class,0);
		}
		public ShowShardingTableReferenceRulesContext showShardingTableReferenceRules() {
			return getRuleContext(ShowShardingTableReferenceRulesContext.class,0);
		}
		public ShowShardingAlgorithmsContext showShardingAlgorithms() {
			return getRuleContext(ShowShardingAlgorithmsContext.class,0);
		}
		public ShowShardingTableNodesContext showShardingTableNodes() {
			return getRuleContext(ShowShardingTableNodesContext.class,0);
		}
		public ShowShardingKeyGeneratorsContext showShardingKeyGenerators() {
			return getRuleContext(ShowShardingKeyGeneratorsContext.class,0);
		}
		public DropShardingKeyGeneratorContext dropShardingKeyGenerator() {
			return getRuleContext(DropShardingKeyGeneratorContext.class,0);
		}
		public ShowShardingAuditorsContext showShardingAuditors() {
			return getRuleContext(ShowShardingAuditorsContext.class,0);
		}
		public DropShardingAuditorContext dropShardingAuditor() {
			return getRuleContext(DropShardingAuditorContext.class,0);
		}
		public ShowDefaultShardingStrategyContext showDefaultShardingStrategy() {
			return getRuleContext(ShowDefaultShardingStrategyContext.class,0);
		}
		public AlterDefaultShardingStrategyContext alterDefaultShardingStrategy() {
			return getRuleContext(AlterDefaultShardingStrategyContext.class,0);
		}
		public DropDefaultShardingStrategyContext dropDefaultShardingStrategy() {
			return getRuleContext(DropDefaultShardingStrategyContext.class,0);
		}
		public ShowUnusedShardingAlgorithmsContext showUnusedShardingAlgorithms() {
			return getRuleContext(ShowUnusedShardingAlgorithmsContext.class,0);
		}
		public ShowUnusedShardingKeyGeneratorsContext showUnusedShardingKeyGenerators() {
			return getRuleContext(ShowUnusedShardingKeyGeneratorsContext.class,0);
		}
		public ShowUnusedShardingAuditorsContext showUnusedShardingAuditors() {
			return getRuleContext(ShowUnusedShardingAuditorsContext.class,0);
		}
		public CountShardingRuleContext countShardingRule() {
			return getRuleContext(CountShardingRuleContext.class,0);
		}
		public ShowShardingAlgorithmPluginsContext showShardingAlgorithmPlugins() {
			return getRuleContext(ShowShardingAlgorithmPluginsContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(ShardingDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(142);
				createShardingTableRule();
				}
				break;
			case 2:
				{
				setState(143);
				createDefaultShardingStrategy();
				}
				break;
			case 3:
				{
				setState(144);
				createShardingTableReferenceRule();
				}
				break;
			case 4:
				{
				setState(145);
				alterShardingTableRule();
				}
				break;
			case 5:
				{
				setState(146);
				alterShardingTableReferenceRule();
				}
				break;
			case 6:
				{
				setState(147);
				dropShardingTableRule();
				}
				break;
			case 7:
				{
				setState(148);
				dropShardingTableReferenceRule();
				}
				break;
			case 8:
				{
				setState(149);
				dropShardingAlgorithm();
				}
				break;
			case 9:
				{
				setState(150);
				showShardingTableRulesUsedAlgorithm();
				}
				break;
			case 10:
				{
				setState(151);
				showShardingTableRulesUsedKeyGenerator();
				}
				break;
			case 11:
				{
				setState(152);
				showShardingTableRulesUsedAuditor();
				}
				break;
			case 12:
				{
				setState(153);
				showShardingTableRules();
				}
				break;
			case 13:
				{
				setState(154);
				showShardingTableReferenceRules();
				}
				break;
			case 14:
				{
				setState(155);
				showShardingAlgorithms();
				}
				break;
			case 15:
				{
				setState(156);
				showShardingTableNodes();
				}
				break;
			case 16:
				{
				setState(157);
				showShardingKeyGenerators();
				}
				break;
			case 17:
				{
				setState(158);
				dropShardingKeyGenerator();
				}
				break;
			case 18:
				{
				setState(159);
				showShardingAuditors();
				}
				break;
			case 19:
				{
				setState(160);
				dropShardingAuditor();
				}
				break;
			case 20:
				{
				setState(161);
				showDefaultShardingStrategy();
				}
				break;
			case 21:
				{
				setState(162);
				alterDefaultShardingStrategy();
				}
				break;
			case 22:
				{
				setState(163);
				dropDefaultShardingStrategy();
				}
				break;
			case 23:
				{
				setState(164);
				showUnusedShardingAlgorithms();
				}
				break;
			case 24:
				{
				setState(165);
				showUnusedShardingKeyGenerators();
				}
				break;
			case 25:
				{
				setState(166);
				showUnusedShardingAuditors();
				}
				break;
			case 26:
				{
				setState(167);
				countShardingRule();
				}
				break;
			case 27:
				{
				setState(168);
				showShardingAlgorithmPlugins();
				}
				break;
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(171);
				match(SEMI_);
				}
			}

			setState(174);
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
	public static class CreateShardingTableRuleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ShardingDistSQLStatementParser.CREATE, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode RULE() { return getToken(ShardingDistSQLStatementParser.RULE, 0); }
		public List<ShardingTableRuleDefinitionContext> shardingTableRuleDefinition() {
			return getRuleContexts(ShardingTableRuleDefinitionContext.class);
		}
		public ShardingTableRuleDefinitionContext shardingTableRuleDefinition(int i) {
			return getRuleContext(ShardingTableRuleDefinitionContext.class,i);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public CreateShardingTableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createShardingTableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterCreateShardingTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitCreateShardingTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitCreateShardingTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateShardingTableRuleContext createShardingTableRule() throws RecognitionException {
		CreateShardingTableRuleContext _localctx = new CreateShardingTableRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createShardingTableRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(CREATE);
			setState(177);
			match(SHARDING);
			setState(178);
			match(TABLE);
			setState(179);
			match(RULE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(180);
				ifNotExists();
				}
			}

			setState(183);
			shardingTableRuleDefinition();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(184);
				match(COMMA_);
				setState(185);
				shardingTableRuleDefinition();
				}
				}
				setState(190);
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
	public static class AlterShardingTableRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ShardingDistSQLStatementParser.ALTER, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode RULE() { return getToken(ShardingDistSQLStatementParser.RULE, 0); }
		public List<ShardingTableRuleDefinitionContext> shardingTableRuleDefinition() {
			return getRuleContexts(ShardingTableRuleDefinitionContext.class);
		}
		public ShardingTableRuleDefinitionContext shardingTableRuleDefinition(int i) {
			return getRuleContext(ShardingTableRuleDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public AlterShardingTableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterShardingTableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAlterShardingTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAlterShardingTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAlterShardingTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterShardingTableRuleContext alterShardingTableRule() throws RecognitionException {
		AlterShardingTableRuleContext _localctx = new AlterShardingTableRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterShardingTableRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ALTER);
			setState(192);
			match(SHARDING);
			setState(193);
			match(TABLE);
			setState(194);
			match(RULE);
			setState(195);
			shardingTableRuleDefinition();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(196);
				match(COMMA_);
				setState(197);
				shardingTableRuleDefinition();
				}
				}
				setState(202);
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
	public static class DropShardingTableRuleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ShardingDistSQLStatementParser.DROP, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode RULE() { return getToken(ShardingDistSQLStatementParser.RULE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public DropShardingTableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropShardingTableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDropShardingTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDropShardingTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDropShardingTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropShardingTableRuleContext dropShardingTableRule() throws RecognitionException {
		DropShardingTableRuleContext _localctx = new DropShardingTableRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropShardingTableRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(DROP);
			setState(204);
			match(SHARDING);
			setState(205);
			match(TABLE);
			setState(206);
			match(RULE);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(207);
				ifExists();
				}
			}

			setState(210);
			tableName();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(211);
				match(COMMA_);
				setState(212);
				tableName();
				}
				}
				setState(217);
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
	public static class CreateShardingTableReferenceRuleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ShardingDistSQLStatementParser.CREATE, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode REFERENCE() { return getToken(ShardingDistSQLStatementParser.REFERENCE, 0); }
		public TerminalNode RULE() { return getToken(ShardingDistSQLStatementParser.RULE, 0); }
		public List<TableReferenceRuleDefinitionContext> tableReferenceRuleDefinition() {
			return getRuleContexts(TableReferenceRuleDefinitionContext.class);
		}
		public TableReferenceRuleDefinitionContext tableReferenceRuleDefinition(int i) {
			return getRuleContext(TableReferenceRuleDefinitionContext.class,i);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public CreateShardingTableReferenceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createShardingTableReferenceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterCreateShardingTableReferenceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitCreateShardingTableReferenceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitCreateShardingTableReferenceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateShardingTableReferenceRuleContext createShardingTableReferenceRule() throws RecognitionException {
		CreateShardingTableReferenceRuleContext _localctx = new CreateShardingTableReferenceRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createShardingTableReferenceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(CREATE);
			setState(219);
			match(SHARDING);
			setState(220);
			match(TABLE);
			setState(221);
			match(REFERENCE);
			setState(222);
			match(RULE);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(223);
				ifNotExists();
				}
			}

			setState(226);
			tableReferenceRuleDefinition();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(227);
				match(COMMA_);
				setState(228);
				tableReferenceRuleDefinition();
				}
				}
				setState(233);
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
	public static class AlterShardingTableReferenceRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ShardingDistSQLStatementParser.ALTER, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode REFERENCE() { return getToken(ShardingDistSQLStatementParser.REFERENCE, 0); }
		public TerminalNode RULE() { return getToken(ShardingDistSQLStatementParser.RULE, 0); }
		public List<TableReferenceRuleDefinitionContext> tableReferenceRuleDefinition() {
			return getRuleContexts(TableReferenceRuleDefinitionContext.class);
		}
		public TableReferenceRuleDefinitionContext tableReferenceRuleDefinition(int i) {
			return getRuleContext(TableReferenceRuleDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public AlterShardingTableReferenceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterShardingTableReferenceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAlterShardingTableReferenceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAlterShardingTableReferenceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAlterShardingTableReferenceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterShardingTableReferenceRuleContext alterShardingTableReferenceRule() throws RecognitionException {
		AlterShardingTableReferenceRuleContext _localctx = new AlterShardingTableReferenceRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alterShardingTableReferenceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ALTER);
			setState(235);
			match(SHARDING);
			setState(236);
			match(TABLE);
			setState(237);
			match(REFERENCE);
			setState(238);
			match(RULE);
			setState(239);
			tableReferenceRuleDefinition();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(240);
				match(COMMA_);
				setState(241);
				tableReferenceRuleDefinition();
				}
				}
				setState(246);
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
	public static class DropShardingTableReferenceRuleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ShardingDistSQLStatementParser.DROP, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode REFERENCE() { return getToken(ShardingDistSQLStatementParser.REFERENCE, 0); }
		public TerminalNode RULE() { return getToken(ShardingDistSQLStatementParser.RULE, 0); }
		public List<RuleNameContext> ruleName() {
			return getRuleContexts(RuleNameContext.class);
		}
		public RuleNameContext ruleName(int i) {
			return getRuleContext(RuleNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public DropShardingTableReferenceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropShardingTableReferenceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDropShardingTableReferenceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDropShardingTableReferenceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDropShardingTableReferenceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropShardingTableReferenceRuleContext dropShardingTableReferenceRule() throws RecognitionException {
		DropShardingTableReferenceRuleContext _localctx = new DropShardingTableReferenceRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dropShardingTableReferenceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(DROP);
			setState(248);
			match(SHARDING);
			setState(249);
			match(TABLE);
			setState(250);
			match(REFERENCE);
			setState(251);
			match(RULE);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(252);
				ifExists();
				}
			}

			setState(255);
			ruleName();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(256);
				match(COMMA_);
				setState(257);
				ruleName();
				}
				}
				setState(262);
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
	public static class DropShardingAlgorithmContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ShardingDistSQLStatementParser.DROP, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode ALGORITHM() { return getToken(ShardingDistSQLStatementParser.ALGORITHM, 0); }
		public List<ShardingAlgorithmNameContext> shardingAlgorithmName() {
			return getRuleContexts(ShardingAlgorithmNameContext.class);
		}
		public ShardingAlgorithmNameContext shardingAlgorithmName(int i) {
			return getRuleContext(ShardingAlgorithmNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public DropShardingAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropShardingAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDropShardingAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDropShardingAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDropShardingAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropShardingAlgorithmContext dropShardingAlgorithm() throws RecognitionException {
		DropShardingAlgorithmContext _localctx = new DropShardingAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dropShardingAlgorithm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(DROP);
			setState(264);
			match(SHARDING);
			setState(265);
			match(ALGORITHM);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(266);
				ifExists();
				}
			}

			setState(269);
			shardingAlgorithmName();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(270);
				match(COMMA_);
				setState(271);
				shardingAlgorithmName();
				}
				}
				setState(276);
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
	public static class CreateDefaultShardingStrategyContext extends ParserRuleContext {
		public Token type;
		public TerminalNode CREATE() { return getToken(ShardingDistSQLStatementParser.CREATE, 0); }
		public TerminalNode DEFAULT() { return getToken(ShardingDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode STRATEGY() { return getToken(ShardingDistSQLStatementParser.STRATEGY, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public ShardingStrategyContext shardingStrategy() {
			return getRuleContext(ShardingStrategyContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public TerminalNode DATABASE() { return getToken(ShardingDistSQLStatementParser.DATABASE, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public CreateDefaultShardingStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefaultShardingStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterCreateDefaultShardingStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitCreateDefaultShardingStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitCreateDefaultShardingStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefaultShardingStrategyContext createDefaultShardingStrategy() throws RecognitionException {
		CreateDefaultShardingStrategyContext _localctx = new CreateDefaultShardingStrategyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createDefaultShardingStrategy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(CREATE);
			setState(278);
			match(DEFAULT);
			setState(279);
			match(SHARDING);
			setState(280);
			((CreateDefaultShardingStrategyContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==DATABASE) ) {
				((CreateDefaultShardingStrategyContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(281);
			match(STRATEGY);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(282);
				ifNotExists();
				}
			}

			setState(285);
			match(LP_);
			setState(286);
			shardingStrategy();
			setState(287);
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
	public static class AlterDefaultShardingStrategyContext extends ParserRuleContext {
		public Token type;
		public TerminalNode ALTER() { return getToken(ShardingDistSQLStatementParser.ALTER, 0); }
		public TerminalNode DEFAULT() { return getToken(ShardingDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode STRATEGY() { return getToken(ShardingDistSQLStatementParser.STRATEGY, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public ShardingStrategyContext shardingStrategy() {
			return getRuleContext(ShardingStrategyContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public TerminalNode DATABASE() { return getToken(ShardingDistSQLStatementParser.DATABASE, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public AlterDefaultShardingStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefaultShardingStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAlterDefaultShardingStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAlterDefaultShardingStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAlterDefaultShardingStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefaultShardingStrategyContext alterDefaultShardingStrategy() throws RecognitionException {
		AlterDefaultShardingStrategyContext _localctx = new AlterDefaultShardingStrategyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alterDefaultShardingStrategy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ALTER);
			setState(290);
			match(DEFAULT);
			setState(291);
			match(SHARDING);
			setState(292);
			((AlterDefaultShardingStrategyContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==DATABASE) ) {
				((AlterDefaultShardingStrategyContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(293);
			match(STRATEGY);
			setState(294);
			match(LP_);
			setState(295);
			shardingStrategy();
			setState(296);
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
	public static class DropDefaultShardingStrategyContext extends ParserRuleContext {
		public Token type;
		public TerminalNode DROP() { return getToken(ShardingDistSQLStatementParser.DROP, 0); }
		public TerminalNode DEFAULT() { return getToken(ShardingDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode STRATEGY() { return getToken(ShardingDistSQLStatementParser.STRATEGY, 0); }
		public TerminalNode DATABASE() { return getToken(ShardingDistSQLStatementParser.DATABASE, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public DropDefaultShardingStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDefaultShardingStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDropDefaultShardingStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDropDefaultShardingStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDropDefaultShardingStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDefaultShardingStrategyContext dropDefaultShardingStrategy() throws RecognitionException {
		DropDefaultShardingStrategyContext _localctx = new DropDefaultShardingStrategyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dropDefaultShardingStrategy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(DROP);
			setState(299);
			match(DEFAULT);
			setState(300);
			match(SHARDING);
			setState(301);
			((DropDefaultShardingStrategyContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==DATABASE) ) {
				((DropDefaultShardingStrategyContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(302);
			match(STRATEGY);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(303);
				ifExists();
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
	public static class DropShardingKeyGeneratorContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ShardingDistSQLStatementParser.DROP, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode KEY() { return getToken(ShardingDistSQLStatementParser.KEY, 0); }
		public TerminalNode GENERATOR() { return getToken(ShardingDistSQLStatementParser.GENERATOR, 0); }
		public List<KeyGeneratorNameContext> keyGeneratorName() {
			return getRuleContexts(KeyGeneratorNameContext.class);
		}
		public KeyGeneratorNameContext keyGeneratorName(int i) {
			return getRuleContext(KeyGeneratorNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public DropShardingKeyGeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropShardingKeyGenerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDropShardingKeyGenerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDropShardingKeyGenerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDropShardingKeyGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropShardingKeyGeneratorContext dropShardingKeyGenerator() throws RecognitionException {
		DropShardingKeyGeneratorContext _localctx = new DropShardingKeyGeneratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dropShardingKeyGenerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(DROP);
			setState(307);
			match(SHARDING);
			setState(308);
			match(KEY);
			setState(309);
			match(GENERATOR);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(310);
				ifExists();
				}
			}

			setState(313);
			keyGeneratorName();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(314);
				match(COMMA_);
				setState(315);
				keyGeneratorName();
				}
				}
				setState(320);
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
	public static class DropShardingAuditorContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ShardingDistSQLStatementParser.DROP, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode AUDITOR() { return getToken(ShardingDistSQLStatementParser.AUDITOR, 0); }
		public List<AuditorNameContext> auditorName() {
			return getRuleContexts(AuditorNameContext.class);
		}
		public AuditorNameContext auditorName(int i) {
			return getRuleContext(AuditorNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public DropShardingAuditorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropShardingAuditor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDropShardingAuditor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDropShardingAuditor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDropShardingAuditor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropShardingAuditorContext dropShardingAuditor() throws RecognitionException {
		DropShardingAuditorContext _localctx = new DropShardingAuditorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dropShardingAuditor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(DROP);
			setState(322);
			match(SHARDING);
			setState(323);
			match(AUDITOR);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(324);
				ifExists();
				}
			}

			setState(327);
			auditorName();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(328);
				match(COMMA_);
				setState(329);
				auditorName();
				}
				}
				setState(334);
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
	public static class ShardingTableRuleDefinitionContext extends ParserRuleContext {
		public ShardingAutoTableRuleContext shardingAutoTableRule() {
			return getRuleContext(ShardingAutoTableRuleContext.class,0);
		}
		public ShardingTableRuleContext shardingTableRule() {
			return getRuleContext(ShardingTableRuleContext.class,0);
		}
		public ShardingTableRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingTableRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShardingTableRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShardingTableRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShardingTableRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingTableRuleDefinitionContext shardingTableRuleDefinition() throws RecognitionException {
		ShardingTableRuleDefinitionContext _localctx = new ShardingTableRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_shardingTableRuleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(335);
				shardingAutoTableRule();
				}
				break;
			case 2:
				{
				setState(336);
				shardingTableRule();
				}
				break;
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
	public static class ShardingAutoTableRuleContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public StorageUnitsContext storageUnits() {
			return getRuleContext(StorageUnitsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public AutoShardingColumnDefinitionContext autoShardingColumnDefinition() {
			return getRuleContext(AutoShardingColumnDefinitionContext.class,0);
		}
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public KeyGenerateDefinitionContext keyGenerateDefinition() {
			return getRuleContext(KeyGenerateDefinitionContext.class,0);
		}
		public AuditDefinitionContext auditDefinition() {
			return getRuleContext(AuditDefinitionContext.class,0);
		}
		public ShardingAutoTableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingAutoTableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShardingAutoTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShardingAutoTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShardingAutoTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingAutoTableRuleContext shardingAutoTableRule() throws RecognitionException {
		ShardingAutoTableRuleContext _localctx = new ShardingAutoTableRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_shardingAutoTableRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			tableName();
			setState(340);
			match(LP_);
			setState(341);
			storageUnits();
			setState(342);
			match(COMMA_);
			setState(343);
			autoShardingColumnDefinition();
			setState(344);
			match(COMMA_);
			setState(345);
			algorithmDefinition();
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(346);
				match(COMMA_);
				setState(347);
				keyGenerateDefinition();
				}
				break;
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(350);
				match(COMMA_);
				setState(351);
				auditDefinition();
				}
			}

			setState(354);
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
	public static class ShardingTableRuleContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public DataNodesContext dataNodes() {
			return getRuleContext(DataNodesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public DatabaseStrategyContext databaseStrategy() {
			return getRuleContext(DatabaseStrategyContext.class,0);
		}
		public TableStrategyContext tableStrategy() {
			return getRuleContext(TableStrategyContext.class,0);
		}
		public KeyGenerateDefinitionContext keyGenerateDefinition() {
			return getRuleContext(KeyGenerateDefinitionContext.class,0);
		}
		public AuditDefinitionContext auditDefinition() {
			return getRuleContext(AuditDefinitionContext.class,0);
		}
		public ShardingTableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingTableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShardingTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShardingTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShardingTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingTableRuleContext shardingTableRule() throws RecognitionException {
		ShardingTableRuleContext _localctx = new ShardingTableRuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_shardingTableRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			tableName();
			setState(357);
			match(LP_);
			setState(358);
			dataNodes();
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(359);
				match(COMMA_);
				setState(360);
				databaseStrategy();
				}
				break;
			}
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(363);
				match(COMMA_);
				setState(364);
				tableStrategy();
				}
				break;
			}
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(367);
				match(COMMA_);
				setState(368);
				keyGenerateDefinition();
				}
				break;
			}
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(371);
				match(COMMA_);
				setState(372);
				auditDefinition();
				}
			}

			setState(375);
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
	public static class KeyGeneratorNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShardingDistSQLStatementParser.IDENTIFIER_, 0); }
		public KeyGeneratorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyGeneratorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterKeyGeneratorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitKeyGeneratorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitKeyGeneratorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyGeneratorNameContext keyGeneratorName() throws RecognitionException {
		KeyGeneratorNameContext _localctx = new KeyGeneratorNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_keyGeneratorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
	public static class AuditorDefinitionContext extends ParserRuleContext {
		public AuditorNameContext auditorName() {
			return getRuleContext(AuditorNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public AuditorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auditorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAuditorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAuditorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAuditorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuditorDefinitionContext auditorDefinition() throws RecognitionException {
		AuditorDefinitionContext _localctx = new AuditorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_auditorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			auditorName();
			setState(380);
			match(LP_);
			setState(381);
			algorithmDefinition();
			setState(382);
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
	public static class AuditorNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShardingDistSQLStatementParser.IDENTIFIER_, 0); }
		public AuditorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auditorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAuditorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAuditorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAuditorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuditorNameContext auditorName() throws RecognitionException {
		AuditorNameContext _localctx = new AuditorNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_auditorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
	public static class StorageUnitsContext extends ParserRuleContext {
		public TerminalNode STORAGE_UNITS() { return getToken(ShardingDistSQLStatementParser.STORAGE_UNITS, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public List<StorageUnitContext> storageUnit() {
			return getRuleContexts(StorageUnitContext.class);
		}
		public StorageUnitContext storageUnit(int i) {
			return getRuleContext(StorageUnitContext.class,i);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public StorageUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageUnits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterStorageUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitStorageUnits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitStorageUnits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageUnitsContext storageUnits() throws RecognitionException {
		StorageUnitsContext _localctx = new StorageUnitsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_storageUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(STORAGE_UNITS);
			setState(387);
			match(LP_);
			setState(388);
			storageUnit();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(389);
				match(COMMA_);
				setState(390);
				storageUnit();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
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
	public static class StorageUnitContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShardingDistSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(ShardingDistSQLStatementParser.STRING_, 0); }
		public StorageUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageUnitContext storageUnit() throws RecognitionException {
		StorageUnitContext _localctx = new StorageUnitContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_storageUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER_ || _la==STRING_) ) {
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
	public static class DataNodesContext extends ParserRuleContext {
		public TerminalNode DATANODES() { return getToken(ShardingDistSQLStatementParser.DATANODES, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public List<DataNodeContext> dataNode() {
			return getRuleContexts(DataNodeContext.class);
		}
		public DataNodeContext dataNode(int i) {
			return getRuleContext(DataNodeContext.class,i);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public DataNodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataNodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDataNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDataNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDataNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataNodesContext dataNodes() throws RecognitionException {
		DataNodesContext _localctx = new DataNodesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dataNodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(DATANODES);
			setState(401);
			match(LP_);
			setState(402);
			dataNode();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(403);
				match(COMMA_);
				setState(404);
				dataNode();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
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
	public static class DataNodeContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(ShardingDistSQLStatementParser.STRING_, 0); }
		public DataNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDataNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDataNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDataNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataNodeContext dataNode() throws RecognitionException {
		DataNodeContext _localctx = new DataNodeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dataNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
	public static class AutoShardingColumnDefinitionContext extends ParserRuleContext {
		public ShardingColumnContext shardingColumn() {
			return getRuleContext(ShardingColumnContext.class,0);
		}
		public AutoShardingColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoShardingColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAutoShardingColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAutoShardingColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAutoShardingColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoShardingColumnDefinitionContext autoShardingColumnDefinition() throws RecognitionException {
		AutoShardingColumnDefinitionContext _localctx = new AutoShardingColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_autoShardingColumnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			shardingColumn();
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
	public static class ShardingColumnDefinitionContext extends ParserRuleContext {
		public ShardingColumnContext shardingColumn() {
			return getRuleContext(ShardingColumnContext.class,0);
		}
		public ShardingColumnsContext shardingColumns() {
			return getRuleContext(ShardingColumnsContext.class,0);
		}
		public ShardingColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShardingColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShardingColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShardingColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingColumnDefinitionContext shardingColumnDefinition() throws RecognitionException {
		ShardingColumnDefinitionContext _localctx = new ShardingColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_shardingColumnDefinition);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHARDING_COLUMN:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				shardingColumn();
				}
				break;
			case SHARDING_COLUMNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				shardingColumns();
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
	public static class ShardingColumnContext extends ParserRuleContext {
		public TerminalNode SHARDING_COLUMN() { return getToken(ShardingDistSQLStatementParser.SHARDING_COLUMN, 0); }
		public TerminalNode EQ_() { return getToken(ShardingDistSQLStatementParser.EQ_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ShardingColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShardingColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShardingColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShardingColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingColumnContext shardingColumn() throws RecognitionException {
		ShardingColumnContext _localctx = new ShardingColumnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_shardingColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(SHARDING_COLUMN);
			setState(421);
			match(EQ_);
			setState(422);
			columnName();
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
	public static class ShardingColumnsContext extends ParserRuleContext {
		public TerminalNode SHARDING_COLUMNS() { return getToken(ShardingDistSQLStatementParser.SHARDING_COLUMNS, 0); }
		public TerminalNode EQ_() { return getToken(ShardingDistSQLStatementParser.EQ_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public ShardingColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShardingColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShardingColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShardingColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingColumnsContext shardingColumns() throws RecognitionException {
		ShardingColumnsContext _localctx = new ShardingColumnsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_shardingColumns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(SHARDING_COLUMNS);
			setState(425);
			match(EQ_);
			setState(426);
			columnName();
			setState(427);
			match(COMMA_);
			setState(428);
			columnName();
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(429);
					match(COMMA_);
					setState(430);
					columnName();
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class ShardingAlgorithmContext extends ParserRuleContext {
		public TerminalNode SHARDING_ALGORITHM() { return getToken(ShardingDistSQLStatementParser.SHARDING_ALGORITHM, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public ShardingAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShardingAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShardingAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShardingAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingAlgorithmContext shardingAlgorithm() throws RecognitionException {
		ShardingAlgorithmContext _localctx = new ShardingAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shardingAlgorithm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(SHARDING_ALGORITHM);
			setState(437);
			match(LP_);
			setState(438);
			algorithmDefinition();
			setState(439);
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
	public static class ShardingStrategyContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ShardingDistSQLStatementParser.TYPE, 0); }
		public TerminalNode EQ_() { return getToken(ShardingDistSQLStatementParser.EQ_, 0); }
		public StrategyTypeContext strategyType() {
			return getRuleContext(StrategyTypeContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public ShardingAlgorithmContext shardingAlgorithm() {
			return getRuleContext(ShardingAlgorithmContext.class,0);
		}
		public ShardingColumnDefinitionContext shardingColumnDefinition() {
			return getRuleContext(ShardingColumnDefinitionContext.class,0);
		}
		public ShardingStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShardingStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShardingStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShardingStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingStrategyContext shardingStrategy() throws RecognitionException {
		ShardingStrategyContext _localctx = new ShardingStrategyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shardingStrategy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(TYPE);
			setState(442);
			match(EQ_);
			setState(443);
			strategyType();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(444);
					match(COMMA_);
					setState(445);
					shardingColumnDefinition();
					}
					break;
				}
				setState(448);
				match(COMMA_);
				setState(449);
				shardingAlgorithm();
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
	public static class DatabaseStrategyContext extends ParserRuleContext {
		public TerminalNode DATABASE_STRATEGY() { return getToken(ShardingDistSQLStatementParser.DATABASE_STRATEGY, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public ShardingStrategyContext shardingStrategy() {
			return getRuleContext(ShardingStrategyContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public DatabaseStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDatabaseStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDatabaseStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDatabaseStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseStrategyContext databaseStrategy() throws RecognitionException {
		DatabaseStrategyContext _localctx = new DatabaseStrategyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_databaseStrategy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(DATABASE_STRATEGY);
			setState(453);
			match(LP_);
			setState(454);
			shardingStrategy();
			setState(455);
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
	public static class TableStrategyContext extends ParserRuleContext {
		public TerminalNode TABLE_STRATEGY() { return getToken(ShardingDistSQLStatementParser.TABLE_STRATEGY, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public ShardingStrategyContext shardingStrategy() {
			return getRuleContext(ShardingStrategyContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public TableStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterTableStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitTableStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitTableStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableStrategyContext tableStrategy() throws RecognitionException {
		TableStrategyContext _localctx = new TableStrategyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableStrategy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(TABLE_STRATEGY);
			setState(458);
			match(LP_);
			setState(459);
			shardingStrategy();
			setState(460);
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
	public static class KeyGenerateDefinitionContext extends ParserRuleContext {
		public TerminalNode KEY_GENERATE_STRATEGY() { return getToken(ShardingDistSQLStatementParser.KEY_GENERATE_STRATEGY, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public TerminalNode COLUMN() { return getToken(ShardingDistSQLStatementParser.COLUMN, 0); }
		public TerminalNode EQ_() { return getToken(ShardingDistSQLStatementParser.EQ_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(ShardingDistSQLStatementParser.COMMA_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public KeyGenerateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyGenerateDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterKeyGenerateDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitKeyGenerateDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitKeyGenerateDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyGenerateDefinitionContext keyGenerateDefinition() throws RecognitionException {
		KeyGenerateDefinitionContext _localctx = new KeyGenerateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_keyGenerateDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(KEY_GENERATE_STRATEGY);
			setState(463);
			match(LP_);
			setState(464);
			match(COLUMN);
			setState(465);
			match(EQ_);
			setState(466);
			columnName();
			setState(467);
			match(COMMA_);
			setState(468);
			algorithmDefinition();
			setState(469);
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
	public static class AuditDefinitionContext extends ParserRuleContext {
		public TerminalNode AUDIT_STRATEGY() { return getToken(ShardingDistSQLStatementParser.AUDIT_STRATEGY, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public MultiAuditDefinitionContext multiAuditDefinition() {
			return getRuleContext(MultiAuditDefinitionContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(ShardingDistSQLStatementParser.COMMA_, 0); }
		public TerminalNode ALLOW_HINT_DISABLE() { return getToken(ShardingDistSQLStatementParser.ALLOW_HINT_DISABLE, 0); }
		public TerminalNode EQ_() { return getToken(ShardingDistSQLStatementParser.EQ_, 0); }
		public AuditAllowHintDisableContext auditAllowHintDisable() {
			return getRuleContext(AuditAllowHintDisableContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public AuditDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auditDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAuditDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAuditDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAuditDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuditDefinitionContext auditDefinition() throws RecognitionException {
		AuditDefinitionContext _localctx = new AuditDefinitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_auditDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(AUDIT_STRATEGY);
			setState(472);
			match(LP_);
			setState(473);
			multiAuditDefinition();
			setState(474);
			match(COMMA_);
			setState(475);
			match(ALLOW_HINT_DISABLE);
			setState(476);
			match(EQ_);
			setState(477);
			auditAllowHintDisable();
			setState(478);
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
	public static class MultiAuditDefinitionContext extends ParserRuleContext {
		public List<SingleAuditDefinitionContext> singleAuditDefinition() {
			return getRuleContexts(SingleAuditDefinitionContext.class);
		}
		public SingleAuditDefinitionContext singleAuditDefinition(int i) {
			return getRuleContext(SingleAuditDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public MultiAuditDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiAuditDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterMultiAuditDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitMultiAuditDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitMultiAuditDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiAuditDefinitionContext multiAuditDefinition() throws RecognitionException {
		MultiAuditDefinitionContext _localctx = new MultiAuditDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiAuditDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			singleAuditDefinition();
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(481);
					match(COMMA_);
					setState(482);
					singleAuditDefinition();
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
	public static class SingleAuditDefinitionContext extends ParserRuleContext {
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public SingleAuditDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleAuditDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterSingleAuditDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitSingleAuditDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitSingleAuditDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleAuditDefinitionContext singleAuditDefinition() throws RecognitionException {
		SingleAuditDefinitionContext _localctx = new SingleAuditDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_singleAuditDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			algorithmDefinition();
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
	public static class AuditAllowHintDisableContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ShardingDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ShardingDistSQLStatementParser.FALSE, 0); }
		public AuditAllowHintDisableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auditAllowHintDisable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAuditAllowHintDisable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAuditAllowHintDisable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAuditAllowHintDisable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuditAllowHintDisableContext auditAllowHintDisable() throws RecognitionException {
		AuditAllowHintDisableContext _localctx = new AuditAllowHintDisableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_auditAllowHintDisable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShardingDistSQLStatementParser.IDENTIFIER_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
	public static class TableReferenceRuleDefinitionContext extends ParserRuleContext {
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public TableReferenceRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferenceRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterTableReferenceRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitTableReferenceRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitTableReferenceRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceRuleDefinitionContext tableReferenceRuleDefinition() throws RecognitionException {
		TableReferenceRuleDefinitionContext _localctx = new TableReferenceRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tableReferenceRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			ruleName();
			setState(495);
			match(LP_);
			setState(496);
			tableName();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(497);
				match(COMMA_);
				setState(498);
				tableName();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
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
	public static class StrategyTypeContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(ShardingDistSQLStatementParser.STRING_, 0); }
		public BuildInStrategyTypeContext buildInStrategyType() {
			return getRuleContext(BuildInStrategyTypeContext.class,0);
		}
		public StrategyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strategyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterStrategyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitStrategyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitStrategyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrategyTypeContext strategyType() throws RecognitionException {
		StrategyTypeContext _localctx = new StrategyTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_strategyType);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(STRING_);
				}
				break;
			case HINT:
			case STANDARD:
			case COMPLEX:
			case NONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				buildInStrategyType();
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
	public static class BuildInStrategyTypeContext extends ParserRuleContext {
		public TerminalNode STANDARD() { return getToken(ShardingDistSQLStatementParser.STANDARD, 0); }
		public TerminalNode COMPLEX() { return getToken(ShardingDistSQLStatementParser.COMPLEX, 0); }
		public TerminalNode HINT() { return getToken(ShardingDistSQLStatementParser.HINT, 0); }
		public TerminalNode NONE() { return getToken(ShardingDistSQLStatementParser.NONE, 0); }
		public BuildInStrategyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInStrategyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterBuildInStrategyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitBuildInStrategyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitBuildInStrategyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInStrategyTypeContext buildInStrategyType() throws RecognitionException {
		BuildInStrategyTypeContext _localctx = new BuildInStrategyTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_buildInStrategyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2611340115969L) != 0)) ) {
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
	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ShardingDistSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ShardingDistSQLStatementParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(IF);
			setState(513);
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
		public TerminalNode IF() { return getToken(ShardingDistSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ShardingDistSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ShardingDistSQLStatementParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(IF);
			setState(516);
			match(NOT);
			setState(517);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(ShardingDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(ShardingDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(ShardingDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(ShardingDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ShardingDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(520);
					match(MINUS_);
					}
				}

				setState(523);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
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
		public TerminalNode TYPE() { return getToken(ShardingDistSQLStatementParser.TYPE, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(ShardingDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(ShardingDistSQLStatementParser.EQ_, 0); }
		public AlgorithmTypeNameContext algorithmTypeName() {
			return getRuleContext(AlgorithmTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(ShardingDistSQLStatementParser.COMMA_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public AlgorithmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAlgorithmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAlgorithmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDefinitionContext algorithmDefinition() throws RecognitionException {
		AlgorithmDefinitionContext _localctx = new AlgorithmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_algorithmDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(TYPE);
			setState(529);
			match(LP_);
			setState(530);
			match(NAME);
			setState(531);
			match(EQ_);
			setState(532);
			algorithmTypeName();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(533);
				match(COMMA_);
				setState(534);
				propertiesDefinition();
				}
			}

			setState(537);
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
		public TerminalNode STRING_() { return getToken(ShardingDistSQLStatementParser.STRING_, 0); }
		public BuildInShardingAlgorithmTypeContext buildInShardingAlgorithmType() {
			return getRuleContext(BuildInShardingAlgorithmTypeContext.class,0);
		}
		public BuildInKeyGenerateAlgorithmTypeContext buildInKeyGenerateAlgorithmType() {
			return getRuleContext(BuildInKeyGenerateAlgorithmTypeContext.class,0);
		}
		public BuildInShardingAuditAlgorithmTypeContext buildInShardingAuditAlgorithmType() {
			return getRuleContext(BuildInShardingAuditAlgorithmTypeContext.class,0);
		}
		public AlgorithmTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterAlgorithmTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitAlgorithmTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmTypeNameContext algorithmTypeName() throws RecognitionException {
		AlgorithmTypeNameContext _localctx = new AlgorithmTypeNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_algorithmTypeName);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(STRING_);
				}
				break;
			case MOD:
			case HASH_MOD:
			case VOLUME_RANGE:
			case BOUNDARY_RANGE:
			case AUTO_INTERVAL:
			case INLINE:
			case INTERVAL:
			case COMPLEX_INLINE:
			case HINT_INLINE:
			case CLASS_BASED:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				buildInShardingAlgorithmType();
				}
				break;
			case SNOWFLAKE:
			case UUID:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				buildInKeyGenerateAlgorithmType();
				}
				break;
			case DML_SHARDING_CONDITIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				buildInShardingAuditAlgorithmType();
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
	public static class BuildInShardingAlgorithmTypeContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(ShardingDistSQLStatementParser.MOD, 0); }
		public TerminalNode HASH_MOD() { return getToken(ShardingDistSQLStatementParser.HASH_MOD, 0); }
		public TerminalNode VOLUME_RANGE() { return getToken(ShardingDistSQLStatementParser.VOLUME_RANGE, 0); }
		public TerminalNode BOUNDARY_RANGE() { return getToken(ShardingDistSQLStatementParser.BOUNDARY_RANGE, 0); }
		public TerminalNode AUTO_INTERVAL() { return getToken(ShardingDistSQLStatementParser.AUTO_INTERVAL, 0); }
		public TerminalNode INLINE() { return getToken(ShardingDistSQLStatementParser.INLINE, 0); }
		public TerminalNode INTERVAL() { return getToken(ShardingDistSQLStatementParser.INTERVAL, 0); }
		public TerminalNode COMPLEX_INLINE() { return getToken(ShardingDistSQLStatementParser.COMPLEX_INLINE, 0); }
		public TerminalNode HINT_INLINE() { return getToken(ShardingDistSQLStatementParser.HINT_INLINE, 0); }
		public TerminalNode CLASS_BASED() { return getToken(ShardingDistSQLStatementParser.CLASS_BASED, 0); }
		public BuildInShardingAlgorithmTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInShardingAlgorithmType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterBuildInShardingAlgorithmType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitBuildInShardingAlgorithmType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitBuildInShardingAlgorithmType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInShardingAlgorithmTypeContext buildInShardingAlgorithmType() throws RecognitionException {
		BuildInShardingAlgorithmTypeContext _localctx = new BuildInShardingAlgorithmTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_buildInShardingAlgorithmType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 1023L) != 0)) ) {
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
	public static class BuildInKeyGenerateAlgorithmTypeContext extends ParserRuleContext {
		public TerminalNode SNOWFLAKE() { return getToken(ShardingDistSQLStatementParser.SNOWFLAKE, 0); }
		public TerminalNode UUID() { return getToken(ShardingDistSQLStatementParser.UUID, 0); }
		public BuildInKeyGenerateAlgorithmTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInKeyGenerateAlgorithmType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterBuildInKeyGenerateAlgorithmType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitBuildInKeyGenerateAlgorithmType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitBuildInKeyGenerateAlgorithmType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInKeyGenerateAlgorithmTypeContext buildInKeyGenerateAlgorithmType() throws RecognitionException {
		BuildInKeyGenerateAlgorithmTypeContext _localctx = new BuildInKeyGenerateAlgorithmTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_buildInKeyGenerateAlgorithmType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_la = _input.LA(1);
			if ( !(_la==SNOWFLAKE || _la==UUID) ) {
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
	public static class BuildInShardingAuditAlgorithmTypeContext extends ParserRuleContext {
		public TerminalNode DML_SHARDING_CONDITIONS() { return getToken(ShardingDistSQLStatementParser.DML_SHARDING_CONDITIONS, 0); }
		public BuildInShardingAuditAlgorithmTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInShardingAuditAlgorithmType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterBuildInShardingAuditAlgorithmType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitBuildInShardingAuditAlgorithmType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitBuildInShardingAuditAlgorithmType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInShardingAuditAlgorithmTypeContext buildInShardingAuditAlgorithmType() throws RecognitionException {
		BuildInShardingAuditAlgorithmTypeContext _localctx = new BuildInShardingAuditAlgorithmTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_buildInShardingAuditAlgorithmType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(DML_SHARDING_CONDITIONS);
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
		public TerminalNode PROPERTIES() { return getToken(ShardingDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(ShardingDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(ShardingDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefinitionContext propertiesDefinition() throws RecognitionException {
		PropertiesDefinitionContext _localctx = new PropertiesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_propertiesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(PROPERTIES);
			setState(552);
			match(LP_);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(553);
				properties();
				}
			}

			setState(556);
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
		public List<TerminalNode> COMMA_() { return getTokens(ShardingDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShardingDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			property();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(559);
				match(COMMA_);
				setState(560);
				property();
				}
				}
				setState(565);
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
		public TerminalNode EQ_() { return getToken(ShardingDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(ShardingDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(567);
			match(EQ_);
			setState(568);
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
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShardingDistSQLStatementParser.IDENTIFIER_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
	public static class ShardingAlgorithmNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShardingDistSQLStatementParser.IDENTIFIER_, 0); }
		public ShardingAlgorithmNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingAlgorithmName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShardingAlgorithmName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShardingAlgorithmName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShardingAlgorithmName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingAlgorithmNameContext shardingAlgorithmName() throws RecognitionException {
		ShardingAlgorithmNameContext _localctx = new ShardingAlgorithmNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_shardingAlgorithmName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		public TerminalNode IDENTIFIER_() { return getToken(ShardingDistSQLStatementParser.IDENTIFIER_, 0); }
		public RuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitRuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitRuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleNameContext ruleName() throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ruleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
	public static class ShowShardingTableRulesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TableRuleContext tableRule() {
			return getRuleContext(TableRuleContext.class,0);
		}
		public TerminalNode RULES() { return getToken(ShardingDistSQLStatementParser.RULES, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShardingTableRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingTableRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingTableRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingTableRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingTableRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingTableRulesContext showShardingTableRules() throws RecognitionException {
		ShowShardingTableRulesContext _localctx = new ShowShardingTableRulesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_showShardingTableRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(SHOW);
			setState(577);
			match(SHARDING);
			setState(578);
			match(TABLE);
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE:
				{
				setState(579);
				tableRule();
				}
				break;
			case RULES:
				{
				setState(580);
				match(RULES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(583);
				match(FROM);
				setState(584);
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
	public static class ShowShardingTableReferenceRulesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode REFERENCE() { return getToken(ShardingDistSQLStatementParser.REFERENCE, 0); }
		public TerminalNode RULE() { return getToken(ShardingDistSQLStatementParser.RULE, 0); }
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public TerminalNode RULES() { return getToken(ShardingDistSQLStatementParser.RULES, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShardingTableReferenceRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingTableReferenceRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingTableReferenceRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingTableReferenceRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingTableReferenceRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingTableReferenceRulesContext showShardingTableReferenceRules() throws RecognitionException {
		ShowShardingTableReferenceRulesContext _localctx = new ShowShardingTableReferenceRulesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_showShardingTableReferenceRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(SHOW);
			setState(588);
			match(SHARDING);
			setState(589);
			match(TABLE);
			setState(590);
			match(REFERENCE);
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE:
				{
				setState(591);
				match(RULE);
				setState(592);
				ruleName();
				}
				break;
			case RULES:
				{
				setState(593);
				match(RULES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(596);
				match(FROM);
				setState(597);
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
	public static class ShowShardingAlgorithmsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode ALGORITHMS() { return getToken(ShardingDistSQLStatementParser.ALGORITHMS, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShardingAlgorithmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingAlgorithms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingAlgorithms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingAlgorithms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingAlgorithms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingAlgorithmsContext showShardingAlgorithms() throws RecognitionException {
		ShowShardingAlgorithmsContext _localctx = new ShowShardingAlgorithmsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_showShardingAlgorithms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(SHOW);
			setState(601);
			match(SHARDING);
			setState(602);
			match(ALGORITHMS);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(603);
				match(FROM);
				setState(604);
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
	public static class ShowShardingAuditorsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode AUDITORS() { return getToken(ShardingDistSQLStatementParser.AUDITORS, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShardingAuditorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingAuditors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingAuditors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingAuditors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingAuditors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingAuditorsContext showShardingAuditors() throws RecognitionException {
		ShowShardingAuditorsContext _localctx = new ShowShardingAuditorsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_showShardingAuditors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(SHOW);
			setState(608);
			match(SHARDING);
			setState(609);
			match(AUDITORS);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(610);
				match(FROM);
				setState(611);
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
	public static class ShowShardingTableNodesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode NODES() { return getToken(ShardingDistSQLStatementParser.NODES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShardingTableNodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingTableNodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingTableNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingTableNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingTableNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingTableNodesContext showShardingTableNodes() throws RecognitionException {
		ShowShardingTableNodesContext _localctx = new ShowShardingTableNodesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_showShardingTableNodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(SHOW);
			setState(615);
			match(SHARDING);
			setState(616);
			match(TABLE);
			setState(617);
			match(NODES);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(618);
				tableName();
				}
			}

			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(621);
				match(FROM);
				setState(622);
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
	public static class ShowShardingKeyGeneratorsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode KEY() { return getToken(ShardingDistSQLStatementParser.KEY, 0); }
		public TerminalNode GENERATORS() { return getToken(ShardingDistSQLStatementParser.GENERATORS, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShardingKeyGeneratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingKeyGenerators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingKeyGenerators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingKeyGenerators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingKeyGenerators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingKeyGeneratorsContext showShardingKeyGenerators() throws RecognitionException {
		ShowShardingKeyGeneratorsContext _localctx = new ShowShardingKeyGeneratorsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_showShardingKeyGenerators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(SHOW);
			setState(626);
			match(SHARDING);
			setState(627);
			match(KEY);
			setState(628);
			match(GENERATORS);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(629);
				match(FROM);
				setState(630);
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
	public static class ShowDefaultShardingStrategyContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode DEFAULT() { return getToken(ShardingDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode STRATEGY() { return getToken(ShardingDistSQLStatementParser.STRATEGY, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowDefaultShardingStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDefaultShardingStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowDefaultShardingStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowDefaultShardingStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowDefaultShardingStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDefaultShardingStrategyContext showDefaultShardingStrategy() throws RecognitionException {
		ShowDefaultShardingStrategyContext _localctx = new ShowDefaultShardingStrategyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_showDefaultShardingStrategy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(SHOW);
			setState(634);
			match(DEFAULT);
			setState(635);
			match(SHARDING);
			setState(636);
			match(STRATEGY);
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(637);
				match(FROM);
				setState(638);
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
	public static class ShowUnusedShardingAlgorithmsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode UNUSED() { return getToken(ShardingDistSQLStatementParser.UNUSED, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode ALGORITHMS() { return getToken(ShardingDistSQLStatementParser.ALGORITHMS, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowUnusedShardingAlgorithmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showUnusedShardingAlgorithms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowUnusedShardingAlgorithms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowUnusedShardingAlgorithms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowUnusedShardingAlgorithms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowUnusedShardingAlgorithmsContext showUnusedShardingAlgorithms() throws RecognitionException {
		ShowUnusedShardingAlgorithmsContext _localctx = new ShowUnusedShardingAlgorithmsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_showUnusedShardingAlgorithms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(SHOW);
			setState(642);
			match(UNUSED);
			setState(643);
			match(SHARDING);
			setState(644);
			match(ALGORITHMS);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(645);
				match(FROM);
				setState(646);
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
	public static class ShowUnusedShardingKeyGeneratorsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode UNUSED() { return getToken(ShardingDistSQLStatementParser.UNUSED, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode KEY() { return getToken(ShardingDistSQLStatementParser.KEY, 0); }
		public TerminalNode GENERATORS() { return getToken(ShardingDistSQLStatementParser.GENERATORS, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowUnusedShardingKeyGeneratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showUnusedShardingKeyGenerators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowUnusedShardingKeyGenerators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowUnusedShardingKeyGenerators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowUnusedShardingKeyGenerators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowUnusedShardingKeyGeneratorsContext showUnusedShardingKeyGenerators() throws RecognitionException {
		ShowUnusedShardingKeyGeneratorsContext _localctx = new ShowUnusedShardingKeyGeneratorsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_showUnusedShardingKeyGenerators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(SHOW);
			setState(650);
			match(UNUSED);
			setState(651);
			match(SHARDING);
			setState(652);
			match(KEY);
			setState(653);
			match(GENERATORS);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(654);
				match(FROM);
				setState(655);
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
	public static class ShowUnusedShardingAuditorsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode UNUSED() { return getToken(ShardingDistSQLStatementParser.UNUSED, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode AUDITORS() { return getToken(ShardingDistSQLStatementParser.AUDITORS, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowUnusedShardingAuditorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showUnusedShardingAuditors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowUnusedShardingAuditors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowUnusedShardingAuditors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowUnusedShardingAuditors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowUnusedShardingAuditorsContext showUnusedShardingAuditors() throws RecognitionException {
		ShowUnusedShardingAuditorsContext _localctx = new ShowUnusedShardingAuditorsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_showUnusedShardingAuditors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(SHOW);
			setState(659);
			match(UNUSED);
			setState(660);
			match(SHARDING);
			setState(661);
			match(AUDITORS);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(662);
				match(FROM);
				setState(663);
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
	public static class ShowShardingTableRulesUsedAlgorithmContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode RULES() { return getToken(ShardingDistSQLStatementParser.RULES, 0); }
		public TerminalNode USED() { return getToken(ShardingDistSQLStatementParser.USED, 0); }
		public TerminalNode ALGORITHM() { return getToken(ShardingDistSQLStatementParser.ALGORITHM, 0); }
		public ShardingAlgorithmNameContext shardingAlgorithmName() {
			return getRuleContext(ShardingAlgorithmNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShardingTableRulesUsedAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingTableRulesUsedAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingTableRulesUsedAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingTableRulesUsedAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingTableRulesUsedAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingTableRulesUsedAlgorithmContext showShardingTableRulesUsedAlgorithm() throws RecognitionException {
		ShowShardingTableRulesUsedAlgorithmContext _localctx = new ShowShardingTableRulesUsedAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_showShardingTableRulesUsedAlgorithm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(SHOW);
			setState(667);
			match(SHARDING);
			setState(668);
			match(TABLE);
			setState(669);
			match(RULES);
			setState(670);
			match(USED);
			setState(671);
			match(ALGORITHM);
			setState(672);
			shardingAlgorithmName();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(673);
				match(FROM);
				setState(674);
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
	public static class ShowShardingTableRulesUsedKeyGeneratorContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode RULES() { return getToken(ShardingDistSQLStatementParser.RULES, 0); }
		public TerminalNode USED() { return getToken(ShardingDistSQLStatementParser.USED, 0); }
		public TerminalNode KEY() { return getToken(ShardingDistSQLStatementParser.KEY, 0); }
		public TerminalNode GENERATOR() { return getToken(ShardingDistSQLStatementParser.GENERATOR, 0); }
		public KeyGeneratorNameContext keyGeneratorName() {
			return getRuleContext(KeyGeneratorNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShardingTableRulesUsedKeyGeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingTableRulesUsedKeyGenerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingTableRulesUsedKeyGenerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingTableRulesUsedKeyGenerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingTableRulesUsedKeyGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingTableRulesUsedKeyGeneratorContext showShardingTableRulesUsedKeyGenerator() throws RecognitionException {
		ShowShardingTableRulesUsedKeyGeneratorContext _localctx = new ShowShardingTableRulesUsedKeyGeneratorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_showShardingTableRulesUsedKeyGenerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(SHOW);
			setState(678);
			match(SHARDING);
			setState(679);
			match(TABLE);
			setState(680);
			match(RULES);
			setState(681);
			match(USED);
			setState(682);
			match(KEY);
			setState(683);
			match(GENERATOR);
			setState(684);
			keyGeneratorName();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(685);
				match(FROM);
				setState(686);
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
	public static class ShowShardingTableRulesUsedAuditorContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode TABLE() { return getToken(ShardingDistSQLStatementParser.TABLE, 0); }
		public TerminalNode RULES() { return getToken(ShardingDistSQLStatementParser.RULES, 0); }
		public TerminalNode USED() { return getToken(ShardingDistSQLStatementParser.USED, 0); }
		public TerminalNode AUDITOR() { return getToken(ShardingDistSQLStatementParser.AUDITOR, 0); }
		public AuditorNameContext auditorName() {
			return getRuleContext(AuditorNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShardingTableRulesUsedAuditorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingTableRulesUsedAuditor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingTableRulesUsedAuditor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingTableRulesUsedAuditor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingTableRulesUsedAuditor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingTableRulesUsedAuditorContext showShardingTableRulesUsedAuditor() throws RecognitionException {
		ShowShardingTableRulesUsedAuditorContext _localctx = new ShowShardingTableRulesUsedAuditorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_showShardingTableRulesUsedAuditor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(SHOW);
			setState(690);
			match(SHARDING);
			setState(691);
			match(TABLE);
			setState(692);
			match(RULES);
			setState(693);
			match(USED);
			setState(694);
			match(AUDITOR);
			setState(695);
			auditorName();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(696);
				match(FROM);
				setState(697);
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
	public static class CountShardingRuleContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(ShardingDistSQLStatementParser.COUNT, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode RULE() { return getToken(ShardingDistSQLStatementParser.RULE, 0); }
		public TerminalNode FROM() { return getToken(ShardingDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public CountShardingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countShardingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterCountShardingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitCountShardingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitCountShardingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountShardingRuleContext countShardingRule() throws RecognitionException {
		CountShardingRuleContext _localctx = new CountShardingRuleContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_countShardingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(COUNT);
			setState(701);
			match(SHARDING);
			setState(702);
			match(RULE);
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(703);
				match(FROM);
				setState(704);
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
	public static class TableRuleContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(ShardingDistSQLStatementParser.RULE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRuleContext tableRule() throws RecognitionException {
		TableRuleContext _localctx = new TableRuleContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tableRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(RULE);
			setState(708);
			tableName();
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
		public TerminalNode IDENTIFIER_() { return getToken(ShardingDistSQLStatementParser.IDENTIFIER_, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
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
	public static class ShowShardingAlgorithmPluginsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShardingDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHARDING() { return getToken(ShardingDistSQLStatementParser.SHARDING, 0); }
		public TerminalNode ALGORITHM() { return getToken(ShardingDistSQLStatementParser.ALGORITHM, 0); }
		public TerminalNode PLUGINS() { return getToken(ShardingDistSQLStatementParser.PLUGINS, 0); }
		public ShowShardingAlgorithmPluginsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShardingAlgorithmPlugins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).enterShowShardingAlgorithmPlugins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShardingDistSQLStatementListener ) ((ShardingDistSQLStatementListener)listener).exitShowShardingAlgorithmPlugins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShardingDistSQLStatementVisitor ) return ((ShardingDistSQLStatementVisitor<? extends T>)visitor).visitShowShardingAlgorithmPlugins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShardingAlgorithmPluginsContext showShardingAlgorithmPlugins() throws RecognitionException {
		ShowShardingAlgorithmPluginsContext _localctx = new ShowShardingAlgorithmPluginsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_showShardingAlgorithmPlugins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(SHOW);
			setState(713);
			match(SHARDING);
			setState(714);
			match(ALGORITHM);
			setState(715);
			match(PLUGINS);
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
		"\u0004\u0001p\u02ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00aa\b\u0000\u0001"+
		"\u0000\u0003\u0000\u00ad\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00b6\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00bb\b\u0001\n\u0001\f\u0001"+
		"\u00be\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u00c7\b\u0002\n\u0002\f\u0002\u00ca"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00d1\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00d6"+
		"\b\u0003\n\u0003\f\u0003\u00d9\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e1\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00e6\b\u0004\n\u0004\f\u0004\u00e9"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00f3\b\u0005\n\u0005\f\u0005"+
		"\u00f6\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00fe\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0103\b\u0006\n\u0006\f\u0006\u0106\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010c\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0111\b\u0007\n\u0007\f\u0007\u0114\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u011c\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0131\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0138\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u013d\b\u000b\n\u000b\f\u000b\u0140\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0146\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u014b\b\f"+
		"\n\f\f\f\u014e\t\f\u0001\r\u0001\r\u0003\r\u0152\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u015d\b\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0161\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u016a\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u016e\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0172"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0176\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0188\b\u0013\n\u0013"+
		"\f\u0013\u018b\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0196\b\u0015\n\u0015\f\u0015\u0199\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u01a3\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u01b0\b\u001a\n\u001a\f\u001a\u01b3\t\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01bf\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01c3\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0005"+
		"!\u01e4\b!\n!\f!\u01e7\t!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$"+
		"\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u01f4\b%\n%\f%\u01f7\t%\u0001"+
		"%\u0001%\u0001&\u0001&\u0003&\u01fd\b&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0003*\u020a\b*\u0001*\u0001"+
		"*\u0001*\u0003*\u020f\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u0218\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0003,\u0220"+
		"\b,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u0003"+
		"0\u022b\b0\u00010\u00010\u00011\u00011\u00011\u00051\u0232\b1\n1\f1\u0235"+
		"\t1\u00012\u00012\u00012\u00012\u00013\u00013\u00014\u00014\u00015\u0001"+
		"5\u00016\u00016\u00016\u00016\u00016\u00036\u0246\b6\u00016\u00016\u0003"+
		"6\u024a\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0253"+
		"\b7\u00017\u00017\u00037\u0257\b7\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u025e\b8\u00019\u00019\u00019\u00019\u00019\u00039\u0265\b9\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u026c\b:\u0001:\u0001:\u0003:\u0270\b:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0278\b;\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0003<\u0280\b<\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0003=\u0288\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0003>\u0291\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u0299"+
		"\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003"+
		"@\u02a4\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0003A\u02b0\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0003B\u02bb\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u02c2\bC\u0001D\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0000\u0000G\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u0000"+
		"\u0006\u0002\u000066DD\u0001\u0000no\u0001\u0000YZ\u0003\u0000BBghkk\u0001"+
		"\u0000[d\u0001\u0000ef\u02de\u0000\u00a9\u0001\u0000\u0000\u0000\u0002"+
		"\u00b0\u0001\u0000\u0000\u0000\u0004\u00bf\u0001\u0000\u0000\u0000\u0006"+
		"\u00cb\u0001\u0000\u0000\u0000\b\u00da\u0001\u0000\u0000\u0000\n\u00ea"+
		"\u0001\u0000\u0000\u0000\f\u00f7\u0001\u0000\u0000\u0000\u000e\u0107\u0001"+
		"\u0000\u0000\u0000\u0010\u0115\u0001\u0000\u0000\u0000\u0012\u0121\u0001"+
		"\u0000\u0000\u0000\u0014\u012a\u0001\u0000\u0000\u0000\u0016\u0132\u0001"+
		"\u0000\u0000\u0000\u0018\u0141\u0001\u0000\u0000\u0000\u001a\u0151\u0001"+
		"\u0000\u0000\u0000\u001c\u0153\u0001\u0000\u0000\u0000\u001e\u0164\u0001"+
		"\u0000\u0000\u0000 \u0179\u0001\u0000\u0000\u0000\"\u017b\u0001\u0000"+
		"\u0000\u0000$\u0180\u0001\u0000\u0000\u0000&\u0182\u0001\u0000\u0000\u0000"+
		"(\u018e\u0001\u0000\u0000\u0000*\u0190\u0001\u0000\u0000\u0000,\u019c"+
		"\u0001\u0000\u0000\u0000.\u019e\u0001\u0000\u0000\u00000\u01a2\u0001\u0000"+
		"\u0000\u00002\u01a4\u0001\u0000\u0000\u00004\u01a8\u0001\u0000\u0000\u0000"+
		"6\u01b4\u0001\u0000\u0000\u00008\u01b9\u0001\u0000\u0000\u0000:\u01c4"+
		"\u0001\u0000\u0000\u0000<\u01c9\u0001\u0000\u0000\u0000>\u01ce\u0001\u0000"+
		"\u0000\u0000@\u01d7\u0001\u0000\u0000\u0000B\u01e0\u0001\u0000\u0000\u0000"+
		"D\u01e8\u0001\u0000\u0000\u0000F\u01ea\u0001\u0000\u0000\u0000H\u01ec"+
		"\u0001\u0000\u0000\u0000J\u01ee\u0001\u0000\u0000\u0000L\u01fc\u0001\u0000"+
		"\u0000\u0000N\u01fe\u0001\u0000\u0000\u0000P\u0200\u0001\u0000\u0000\u0000"+
		"R\u0203\u0001\u0000\u0000\u0000T\u020e\u0001\u0000\u0000\u0000V\u0210"+
		"\u0001\u0000\u0000\u0000X\u021f\u0001\u0000\u0000\u0000Z\u0221\u0001\u0000"+
		"\u0000\u0000\\\u0223\u0001\u0000\u0000\u0000^\u0225\u0001\u0000\u0000"+
		"\u0000`\u0227\u0001\u0000\u0000\u0000b\u022e\u0001\u0000\u0000\u0000d"+
		"\u0236\u0001\u0000\u0000\u0000f\u023a\u0001\u0000\u0000\u0000h\u023c\u0001"+
		"\u0000\u0000\u0000j\u023e\u0001\u0000\u0000\u0000l\u0240\u0001\u0000\u0000"+
		"\u0000n\u024b\u0001\u0000\u0000\u0000p\u0258\u0001\u0000\u0000\u0000r"+
		"\u025f\u0001\u0000\u0000\u0000t\u0266\u0001\u0000\u0000\u0000v\u0271\u0001"+
		"\u0000\u0000\u0000x\u0279\u0001\u0000\u0000\u0000z\u0281\u0001\u0000\u0000"+
		"\u0000|\u0289\u0001\u0000\u0000\u0000~\u0292\u0001\u0000\u0000\u0000\u0080"+
		"\u029a\u0001\u0000\u0000\u0000\u0082\u02a5\u0001\u0000\u0000\u0000\u0084"+
		"\u02b1\u0001\u0000\u0000\u0000\u0086\u02bc\u0001\u0000\u0000\u0000\u0088"+
		"\u02c3\u0001\u0000\u0000\u0000\u008a\u02c6\u0001\u0000\u0000\u0000\u008c"+
		"\u02c8\u0001\u0000\u0000\u0000\u008e\u00aa\u0003\u0002\u0001\u0000\u008f"+
		"\u00aa\u0003\u0010\b\u0000\u0090\u00aa\u0003\b\u0004\u0000\u0091\u00aa"+
		"\u0003\u0004\u0002\u0000\u0092\u00aa\u0003\n\u0005\u0000\u0093\u00aa\u0003"+
		"\u0006\u0003\u0000\u0094\u00aa\u0003\f\u0006\u0000\u0095\u00aa\u0003\u000e"+
		"\u0007\u0000\u0096\u00aa\u0003\u0080@\u0000\u0097\u00aa\u0003\u0082A\u0000"+
		"\u0098\u00aa\u0003\u0084B\u0000\u0099\u00aa\u0003l6\u0000\u009a\u00aa"+
		"\u0003n7\u0000\u009b\u00aa\u0003p8\u0000\u009c\u00aa\u0003t:\u0000\u009d"+
		"\u00aa\u0003v;\u0000\u009e\u00aa\u0003\u0016\u000b\u0000\u009f\u00aa\u0003"+
		"r9\u0000\u00a0\u00aa\u0003\u0018\f\u0000\u00a1\u00aa\u0003x<\u0000\u00a2"+
		"\u00aa\u0003\u0012\t\u0000\u00a3\u00aa\u0003\u0014\n\u0000\u00a4\u00aa"+
		"\u0003z=\u0000\u00a5\u00aa\u0003|>\u0000\u00a6\u00aa\u0003~?\u0000\u00a7"+
		"\u00aa\u0003\u0086C\u0000\u00a8\u00aa\u0003\u008cF\u0000\u00a9\u008e\u0001"+
		"\u0000\u0000\u0000\u00a9\u008f\u0001\u0000\u0000\u0000\u00a9\u0090\u0001"+
		"\u0000\u0000\u0000\u00a9\u0091\u0001\u0000\u0000\u0000\u00a9\u0092\u0001"+
		"\u0000\u0000\u0000\u00a9\u0093\u0001\u0000\u0000\u0000\u00a9\u0094\u0001"+
		"\u0000\u0000\u0000\u00a9\u0095\u0001\u0000\u0000\u0000\u00a9\u0096\u0001"+
		"\u0000\u0000\u0000\u00a9\u0097\u0001\u0000\u0000\u0000\u00a9\u0098\u0001"+
		"\u0000\u0000\u0000\u00a9\u0099\u0001\u0000\u0000\u0000\u00a9\u009a\u0001"+
		"\u0000\u0000\u0000\u00a9\u009b\u0001\u0000\u0000\u0000\u00a9\u009c\u0001"+
		"\u0000\u0000\u0000\u00a9\u009d\u0001\u0000\u0000\u0000\u00a9\u009e\u0001"+
		"\u0000\u0000\u0000\u00a9\u009f\u0001\u0000\u0000\u0000\u00a9\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000\u00a9\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005"+
		"(\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0000"+
		"\u0000\u0001\u00af\u0001\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005,\u0000"+
		"\u0000\u00b1\u00b2\u00050\u0000\u0000\u00b2\u00b3\u00056\u0000\u0000\u00b3"+
		"\u00b5\u00051\u0000\u0000\u00b4\u00b6\u0003R)\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00bc\u0003\u001a\r\u0000\u00b8\u00b9\u0005\""+
		"\u0000\u0000\u00b9\u00bb\u0003\u001a\r\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u0003\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005-\u0000\u0000"+
		"\u00c0\u00c1\u00050\u0000\u0000\u00c1\u00c2\u00056\u0000\u0000\u00c2\u00c3"+
		"\u00051\u0000\u0000\u00c3\u00c8\u0003\u001a\r\u0000\u00c4\u00c5\u0005"+
		"\"\u0000\u0000\u00c5\u00c7\u0003\u001a\r\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u0005\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005.\u0000"+
		"\u0000\u00cc\u00cd\u00050\u0000\u0000\u00cd\u00ce\u00056\u0000\u0000\u00ce"+
		"\u00d0\u00051\u0000\u0000\u00cf\u00d1\u0003P(\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d7\u0003f3\u0000\u00d3\u00d4\u0005\"\u0000"+
		"\u0000\u00d4\u00d6\u0003f3\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u0007\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0005,\u0000\u0000\u00db\u00dc"+
		"\u00050\u0000\u0000\u00dc\u00dd\u00056\u0000\u0000\u00dd\u00de\u0005="+
		"\u0000\u0000\u00de\u00e0\u00051\u0000\u0000\u00df\u00e1\u0003R)\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e7\u0003J%\u0000\u00e3\u00e4"+
		"\u0005\"\u0000\u0000\u00e4\u00e6\u0003J%\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\t\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005-\u0000\u0000"+
		"\u00eb\u00ec\u00050\u0000\u0000\u00ec\u00ed\u00056\u0000\u0000\u00ed\u00ee"+
		"\u0005=\u0000\u0000\u00ee\u00ef\u00051\u0000\u0000\u00ef\u00f4\u0003J"+
		"%\u0000\u00f0\u00f1\u0005\"\u0000\u0000\u00f1\u00f3\u0003J%\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u000b\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005.\u0000\u0000\u00f8\u00f9\u00050\u0000\u0000\u00f9\u00fa\u0005"+
		"6\u0000\u0000\u00fa\u00fb\u0005=\u0000\u0000\u00fb\u00fd\u00051\u0000"+
		"\u0000\u00fc\u00fe\u0003P(\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0104\u0003j5\u0000\u0100\u0101\u0005\"\u0000\u0000\u0101\u0103\u0003"+
		"j5\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\r\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0005.\u0000\u0000\u0108\u0109\u00050\u0000\u0000\u0109\u010b"+
		"\u0005@\u0000\u0000\u010a\u010c\u0003P(\u0000\u010b\u010a\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u0112\u0003h4\u0000\u010e\u010f\u0005\"\u0000\u0000"+
		"\u010f\u0111\u0003h4\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0114"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u000f\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0005,\u0000\u0000\u0116\u0117\u0005"+
		"C\u0000\u0000\u0117\u0118\u00050\u0000\u0000\u0118\u0119\u0007\u0000\u0000"+
		"\u0000\u0119\u011b\u0005F\u0000\u0000\u011a\u011c\u0003R)\u0000\u011b"+
		"\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u001c\u0000\u0000\u011e"+
		"\u011f\u00038\u001c\u0000\u011f\u0120\u0005\u001d\u0000\u0000\u0120\u0011"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0005-\u0000\u0000\u0122\u0123\u0005"+
		"C\u0000\u0000\u0123\u0124\u00050\u0000\u0000\u0124\u0125\u0007\u0000\u0000"+
		"\u0000\u0125\u0126\u0005F\u0000\u0000\u0126\u0127\u0005\u001c\u0000\u0000"+
		"\u0127\u0128\u00038\u001c\u0000\u0128\u0129\u0005\u001d\u0000\u0000\u0129"+
		"\u0013\u0001\u0000\u0000\u0000\u012a\u012b\u0005.\u0000\u0000\u012b\u012c"+
		"\u0005C\u0000\u0000\u012c\u012d\u00050\u0000\u0000\u012d\u012e\u0007\u0000"+
		"\u0000\u0000\u012e\u0130\u0005F\u0000\u0000\u012f\u0131\u0003P(\u0000"+
		"\u0130\u012f\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u0015\u0001\u0000\u0000\u0000\u0132\u0133\u0005.\u0000\u0000\u0133"+
		"\u0134\u00050\u0000\u0000\u0134\u0135\u0005K\u0000\u0000\u0135\u0137\u0005"+
		"L\u0000\u0000\u0136\u0138\u0003P(\u0000\u0137\u0136\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000"+
		"\u0000\u0139\u013e\u0003 \u0010\u0000\u013a\u013b\u0005\"\u0000\u0000"+
		"\u013b\u013d\u0003 \u0010\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f\u0017\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0141\u0142\u0005.\u0000\u0000\u0142\u0143"+
		"\u00050\u0000\u0000\u0143\u0145\u0005U\u0000\u0000\u0144\u0146\u0003P"+
		"(\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u014c\u0003$\u0012\u0000"+
		"\u0148\u0149\u0005\"\u0000\u0000\u0149\u014b\u0003$\u0012\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u0019\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f"+
		"\u0152\u0003\u001c\u000e\u0000\u0150\u0152\u0003\u001e\u000f\u0000\u0151"+
		"\u014f\u0001\u0000\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u001b\u0001\u0000\u0000\u0000\u0153\u0154\u0003f3\u0000\u0154\u0155\u0005"+
		"\u001c\u0000\u0000\u0155\u0156\u0003&\u0013\u0000\u0156\u0157\u0005\""+
		"\u0000\u0000\u0157\u0158\u0003.\u0017\u0000\u0158\u0159\u0005\"\u0000"+
		"\u0000\u0159\u015c\u0003V+\u0000\u015a\u015b\u0005\"\u0000\u0000\u015b"+
		"\u015d\u0003>\u001f\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0005\"\u0000\u0000\u015f\u0161\u0003@ \u0000\u0160\u015e\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005\u001d\u0000\u0000\u0163\u001d\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0003f3\u0000\u0165\u0166\u0005\u001c\u0000\u0000"+
		"\u0166\u0169\u0003*\u0015\u0000\u0167\u0168\u0005\"\u0000\u0000\u0168"+
		"\u016a\u0003:\u001d\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0005\"\u0000\u0000\u016c\u016e\u0003<\u001e\u0000\u016d\u016b\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0171\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0005\"\u0000\u0000\u0170\u0172\u0003>"+
		"\u001f\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0174\u0005\"\u0000"+
		"\u0000\u0174\u0176\u0003@ \u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0005\u001d\u0000\u0000\u0178\u001f\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0005n\u0000\u0000\u017a!\u0001\u0000\u0000\u0000\u017b\u017c\u0003"+
		"$\u0012\u0000\u017c\u017d\u0005\u001c\u0000\u0000\u017d\u017e\u0003V+"+
		"\u0000\u017e\u017f\u0005\u001d\u0000\u0000\u017f#\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0005n\u0000\u0000\u0181%\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u00053\u0000\u0000\u0183\u0184\u0005\u001c\u0000\u0000\u0184\u0189\u0003"+
		"(\u0014\u0000\u0185\u0186\u0005\"\u0000\u0000\u0186\u0188\u0003(\u0014"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0005\u001d\u0000\u0000\u018d\'\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0007\u0001\u0000\u0000\u018f)\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0005G\u0000\u0000\u0191\u0192\u0005\u001c\u0000\u0000\u0192\u0197"+
		"\u0003,\u0016\u0000\u0193\u0194\u0005\"\u0000\u0000\u0194\u0196\u0003"+
		",\u0016\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000"+
		"\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0005\u001d\u0000\u0000\u019b+\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0005o\u0000\u0000\u019d-\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u00032\u0019\u0000\u019f/\u0001\u0000\u0000\u0000\u01a0\u01a3\u0003"+
		"2\u0019\u0000\u01a1\u01a3\u00034\u001a\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a31\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u00057\u0000\u0000\u01a5\u01a6\u0005\u0015\u0000\u0000\u01a6"+
		"\u01a7\u0003H$\u0000\u01a73\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005"+
		"8\u0000\u0000\u01a9\u01aa\u0005\u0015\u0000\u0000\u01aa\u01ab\u0003H$"+
		"\u0000\u01ab\u01ac\u0005\"\u0000\u0000\u01ac\u01b1\u0003H$\u0000\u01ad"+
		"\u01ae\u0005\"\u0000\u0000\u01ae\u01b0\u0003H$\u0000\u01af\u01ad\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b25\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005E\u0000"+
		"\u0000\u01b5\u01b6\u0005\u001c\u0000\u0000\u01b6\u01b7\u0003V+\u0000\u01b7"+
		"\u01b8\u0005\u001d\u0000\u0000\u01b87\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u00059\u0000\u0000\u01ba\u01bb\u0005\u0015\u0000\u0000\u01bb\u01c2\u0003"+
		"L&\u0000\u01bc\u01bd\u0005\"\u0000\u0000\u01bd\u01bf\u00030\u0018\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\"\u0000\u0000\u01c1"+
		"\u01c3\u00036\u001b\u0000\u01c2\u01be\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c39\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005"+
		"H\u0000\u0000\u01c5\u01c6\u0005\u001c\u0000\u0000\u01c6\u01c7\u00038\u001c"+
		"\u0000\u01c7\u01c8\u0005\u001d\u0000\u0000\u01c8;\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0005I\u0000\u0000\u01ca\u01cb\u0005\u001c\u0000\u0000\u01cb"+
		"\u01cc\u00038\u001c\u0000\u01cc\u01cd\u0005\u001d\u0000\u0000\u01cd=\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u00054\u0000\u0000\u01cf\u01d0\u0005\u001c"+
		"\u0000\u0000\u01d0\u01d1\u0005<\u0000\u0000\u01d1\u01d2\u0005\u0015\u0000"+
		"\u0000\u01d2\u01d3\u0003H$\u0000\u01d3\u01d4\u0005\"\u0000\u0000\u01d4"+
		"\u01d5\u0003V+\u0000\u01d5\u01d6\u0005\u001d\u0000\u0000\u01d6?\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0005W\u0000\u0000\u01d8\u01d9\u0005\u001c"+
		"\u0000\u0000\u01d9\u01da\u0003B!\u0000\u01da\u01db\u0005\"\u0000\u0000"+
		"\u01db\u01dc\u0005X\u0000\u0000\u01dc\u01dd\u0005\u0015\u0000\u0000\u01dd"+
		"\u01de\u0003F#\u0000\u01de\u01df\u0005\u001d\u0000\u0000\u01dfA\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e5\u0003D\"\u0000\u01e1\u01e2\u0005\"\u0000"+
		"\u0000\u01e2\u01e4\u0003D\"\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6C\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003V+\u0000\u01e9E\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0007\u0002\u0000\u0000\u01ebG\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0005n\u0000\u0000\u01edI\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0003j5\u0000\u01ef\u01f0\u0005\u001c\u0000\u0000\u01f0\u01f5"+
		"\u0003f3\u0000\u01f1\u01f2\u0005\"\u0000\u0000\u01f2\u01f4\u0003f3\u0000"+
		"\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0005\u001d\u0000\u0000\u01f9K\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fd\u0005o\u0000\u0000\u01fb\u01fd\u0003N\'\u0000\u01fc\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fdM\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0007\u0003\u0000\u0000\u01ffO\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0005Q\u0000\u0000\u0201\u0202\u0005R\u0000\u0000\u0202"+
		"Q\u0001\u0000\u0000\u0000\u0203\u0204\u0005Q\u0000\u0000\u0204\u0205\u0005"+
		"j\u0000\u0000\u0205\u0206\u0005R\u0000\u0000\u0206S\u0001\u0000\u0000"+
		"\u0000\u0207\u020f\u0005o\u0000\u0000\u0208\u020a\u0005\r\u0000\u0000"+
		"\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020f\u0005p\u0000\u0000\u020c"+
		"\u020f\u0005Y\u0000\u0000\u020d\u020f\u0005Z\u0000\u0000\u020e\u0207\u0001"+
		"\u0000\u0000\u0000\u020e\u0209\u0001\u0000\u0000\u0000\u020e\u020c\u0001"+
		"\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020fU\u0001\u0000"+
		"\u0000\u0000\u0210\u0211\u00059\u0000\u0000\u0211\u0212\u0005\u001c\u0000"+
		"\u0000\u0212\u0213\u0005:\u0000\u0000\u0213\u0214\u0005\u0015\u0000\u0000"+
		"\u0214\u0217\u0003X,\u0000\u0215\u0216\u0005\"\u0000\u0000\u0216\u0218"+
		"\u0003`0\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0005\u001d"+
		"\u0000\u0000\u021aW\u0001\u0000\u0000\u0000\u021b\u0220\u0005o\u0000\u0000"+
		"\u021c\u0220\u0003Z-\u0000\u021d\u0220\u0003\\.\u0000\u021e\u0220\u0003"+
		"^/\u0000\u021f\u021b\u0001\u0000\u0000\u0000\u021f\u021c\u0001\u0000\u0000"+
		"\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u021e\u0001\u0000\u0000"+
		"\u0000\u0220Y\u0001\u0000\u0000\u0000\u0221\u0222\u0007\u0004\u0000\u0000"+
		"\u0222[\u0001\u0000\u0000\u0000\u0223\u0224\u0007\u0005\u0000\u0000\u0224"+
		"]\u0001\u0000\u0000\u0000\u0225\u0226\u0005i\u0000\u0000\u0226_\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0005;\u0000\u0000\u0228\u022a\u0005\u001c"+
		"\u0000\u0000\u0229\u022b\u0003b1\u0000\u022a\u0229\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0005\u001d\u0000\u0000\u022da\u0001\u0000\u0000\u0000\u022e"+
		"\u0233\u0003d2\u0000\u022f\u0230\u0005\"\u0000\u0000\u0230\u0232\u0003"+
		"d2\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000\u0000"+
		"\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000"+
		"\u0000\u0234c\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u0005o\u0000\u0000\u0237\u0238\u0005\u0015\u0000\u0000\u0238"+
		"\u0239\u0003T*\u0000\u0239e\u0001\u0000\u0000\u0000\u023a\u023b\u0005"+
		"n\u0000\u0000\u023bg\u0001\u0000\u0000\u0000\u023c\u023d\u0005n\u0000"+
		"\u0000\u023di\u0001\u0000\u0000\u0000\u023e\u023f\u0005n\u0000\u0000\u023f"+
		"k\u0001\u0000\u0000\u0000\u0240\u0241\u0005/\u0000\u0000\u0241\u0242\u0005"+
		"0\u0000\u0000\u0242\u0245\u00056\u0000\u0000\u0243\u0246\u0003\u0088D"+
		"\u0000\u0244\u0246\u0005>\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000"+
		"\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u0249\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u00052\u0000\u0000\u0248\u024a\u0003\u008aE\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024am\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0005/\u0000\u0000\u024c\u024d\u00050\u0000"+
		"\u0000\u024d\u024e\u00056\u0000\u0000\u024e\u0252\u0005=\u0000\u0000\u024f"+
		"\u0250\u00051\u0000\u0000\u0250\u0253\u0003j5\u0000\u0251\u0253\u0005"+
		">\u0000\u0000\u0252\u024f\u0001\u0000\u0000\u0000\u0252\u0251\u0001\u0000"+
		"\u0000\u0000\u0253\u0256\u0001\u0000\u0000\u0000\u0254\u0255\u00052\u0000"+
		"\u0000\u0255\u0257\u0003\u008aE\u0000\u0256\u0254\u0001\u0000\u0000\u0000"+
		"\u0256\u0257\u0001\u0000\u0000\u0000\u0257o\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0005/\u0000\u0000\u0259\u025a\u00050\u0000\u0000\u025a\u025d\u0005"+
		"A\u0000\u0000\u025b\u025c\u00052\u0000\u0000\u025c\u025e\u0003\u008aE"+
		"\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000"+
		"\u0000\u025eq\u0001\u0000\u0000\u0000\u025f\u0260\u0005/\u0000\u0000\u0260"+
		"\u0261\u00050\u0000\u0000\u0261\u0264\u0005V\u0000\u0000\u0262\u0263\u0005"+
		"2\u0000\u0000\u0263\u0265\u0003\u008aE\u0000\u0264\u0262\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265s\u0001\u0000\u0000\u0000"+
		"\u0266\u0267\u0005/\u0000\u0000\u0267\u0268\u00050\u0000\u0000\u0268\u0269"+
		"\u00056\u0000\u0000\u0269\u026b\u0005J\u0000\u0000\u026a\u026c\u0003f"+
		"3\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000"+
		"\u0000\u026c\u026f\u0001\u0000\u0000\u0000\u026d\u026e\u00052\u0000\u0000"+
		"\u026e\u0270\u0003\u008aE\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u026f"+
		"\u0270\u0001\u0000\u0000\u0000\u0270u\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0005/\u0000\u0000\u0272\u0273\u00050\u0000\u0000\u0273\u0274\u0005K"+
		"\u0000\u0000\u0274\u0277\u0005M\u0000\u0000\u0275\u0276\u00052\u0000\u0000"+
		"\u0276\u0278\u0003\u008aE\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277"+
		"\u0278\u0001\u0000\u0000\u0000\u0278w\u0001\u0000\u0000\u0000\u0279\u027a"+
		"\u0005/\u0000\u0000\u027a\u027b\u0005C\u0000\u0000\u027b\u027c\u00050"+
		"\u0000\u0000\u027c\u027f\u0005F\u0000\u0000\u027d\u027e\u00052\u0000\u0000"+
		"\u027e\u0280\u0003\u008aE\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f"+
		"\u0280\u0001\u0000\u0000\u0000\u0280y\u0001\u0000\u0000\u0000\u0281\u0282"+
		"\u0005/\u0000\u0000\u0282\u0283\u0005O\u0000\u0000\u0283\u0284\u00050"+
		"\u0000\u0000\u0284\u0287\u0005A\u0000\u0000\u0285\u0286\u00052\u0000\u0000"+
		"\u0286\u0288\u0003\u008aE\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288{\u0001\u0000\u0000\u0000\u0289\u028a"+
		"\u0005/\u0000\u0000\u028a\u028b\u0005O\u0000\u0000\u028b\u028c\u00050"+
		"\u0000\u0000\u028c\u028d\u0005K\u0000\u0000\u028d\u0290\u0005M\u0000\u0000"+
		"\u028e\u028f\u00052\u0000\u0000\u028f\u0291\u0003\u008aE\u0000\u0290\u028e"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291}\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0005/\u0000\u0000\u0293\u0294\u0005O\u0000"+
		"\u0000\u0294\u0295\u00050\u0000\u0000\u0295\u0298\u0005V\u0000\u0000\u0296"+
		"\u0297\u00052\u0000\u0000\u0297\u0299\u0003\u008aE\u0000\u0298\u0296\u0001"+
		"\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u007f\u0001"+
		"\u0000\u0000\u0000\u029a\u029b\u0005/\u0000\u0000\u029b\u029c\u00050\u0000"+
		"\u0000\u029c\u029d\u00056\u0000\u0000\u029d\u029e\u0005>\u0000\u0000\u029e"+
		"\u029f\u0005P\u0000\u0000\u029f\u02a0\u0005@\u0000\u0000\u02a0\u02a3\u0003"+
		"h4\u0000\u02a1\u02a2\u00052\u0000\u0000\u02a2\u02a4\u0003\u008aE\u0000"+
		"\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000"+
		"\u02a4\u0081\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005/\u0000\u0000\u02a6"+
		"\u02a7\u00050\u0000\u0000\u02a7\u02a8\u00056\u0000\u0000\u02a8\u02a9\u0005"+
		">\u0000\u0000\u02a9\u02aa\u0005P\u0000\u0000\u02aa\u02ab\u0005K\u0000"+
		"\u0000\u02ab\u02ac\u0005L\u0000\u0000\u02ac\u02af\u0003 \u0010\u0000\u02ad"+
		"\u02ae\u00052\u0000\u0000\u02ae\u02b0\u0003\u008aE\u0000\u02af\u02ad\u0001"+
		"\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u0083\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b2\u0005/\u0000\u0000\u02b2\u02b3\u00050\u0000"+
		"\u0000\u02b3\u02b4\u00056\u0000\u0000\u02b4\u02b5\u0005>\u0000\u0000\u02b5"+
		"\u02b6\u0005P\u0000\u0000\u02b6\u02b7\u0005U\u0000\u0000\u02b7\u02ba\u0003"+
		"$\u0012\u0000\u02b8\u02b9\u00052\u0000\u0000\u02b9\u02bb\u0003\u008aE"+
		"\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bb\u0085\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005T\u0000\u0000"+
		"\u02bd\u02be\u00050\u0000\u0000\u02be\u02c1\u00051\u0000\u0000\u02bf\u02c0"+
		"\u00052\u0000\u0000\u02c0\u02c2\u0003\u008aE\u0000\u02c1\u02bf\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u0087\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u00051\u0000\u0000\u02c4\u02c5\u0003f3\u0000"+
		"\u02c5\u0089\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005n\u0000\u0000\u02c7"+
		"\u008b\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005/\u0000\u0000\u02c9\u02ca"+
		"\u00050\u0000\u0000\u02ca\u02cb\u0005@\u0000\u0000\u02cb\u02cc\u0005l"+
		"\u0000\u0000\u02cc\u008d\u0001\u0000\u0000\u0000;\u00a9\u00ac\u00b5\u00bc"+
		"\u00c8\u00d0\u00d7\u00e0\u00e7\u00f4\u00fd\u0104\u010b\u0112\u011b\u0130"+
		"\u0137\u013e\u0145\u014c\u0151\u015c\u0160\u0169\u016d\u0171\u0175\u0189"+
		"\u0197\u01a2\u01b1\u01be\u01c2\u01e5\u01f5\u01fc\u0209\u020e\u0217\u021f"+
		"\u022a\u0233\u0245\u0249\u0252\u0256\u025d\u0264\u026b\u026f\u0277\u027f"+
		"\u0287\u0290\u0298\u02a3\u02af\u02ba\u02c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
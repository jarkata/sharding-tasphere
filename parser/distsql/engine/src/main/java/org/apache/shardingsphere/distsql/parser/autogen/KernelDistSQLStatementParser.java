// Generated from /Users/code/gitcode/shardingsphere/parser/distsql/engine/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/KernelDistSQLStatement.g4 by ANTLR 4.13.2
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
public class KernelDistSQLStatementParser extends Parser {
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
		DL_=43, WS=44, ADD=45, ALL=46, CREATE=47, ALTER=48, DROP=49, SET=50, SHOW=51, 
		FOR=52, FROM=53, TO=54, URL=55, HOST=56, PORT=57, DB=58, USER=59, PASSWORD=60, 
		NAME=61, PROPERTIES=62, VARIABLE=63, VARIABLES=64, ENABLE=65, DISABLE=66, 
		IGNORE=67, SCHEMA=68, DATABASE=69, FULL=70, LOGICAL=71, SINGLE=72, TABLES=73, 
		LIST=74, TABLE=75, RULES=76, REFRESH=77, METADATA=78, TRUE=79, FALSE=80, 
		IF=81, EXISTS=82, TYPE=83, MODE=84, LABEL=85, RELABEL=86, UNLABEL=87, 
		EXPORT=88, IMPORT=89, CONVERT=90, YAML=91, CONFIGURATION=92, FILE=93, 
		USED=94, WITH=95, INFO=96, STORAGE=97, UNIT=98, UNITS=99, DIST=100, WHERE=101, 
		COMPUTE=102, NODE=103, NODES=104, REGISTER=105, UNREGISTER=106, GOVERNANCE=107, 
		CENTER=108, LIKE=109, NOT=110, LOCK=111, UNLOCK=112, CLUSTER=113, LOCK_STRATEGY=114, 
		BROADCAST=115, PLUGINS=116, OF=117, KEY=118, GENERATE=119, LOAD=120, BALANCE=121, 
		ALGORITHM=122, FORCE=123, CHECK_PRIVILEGES=124, FOR_GENERATOR=125, IDENTIFIER_=126, 
		STRING_=127, INT_=128;
	public static final int
		RULE_execute = 0, RULE_setDistVariable = 1, RULE_showDistVariable = 2, 
		RULE_showDistVariables = 3, RULE_alterComputeNode = 4, RULE_enableComputeNode = 5, 
		RULE_disableComputeNode = 6, RULE_showComputeNodes = 7, RULE_refreshDatabaseMetadata = 8, 
		RULE_refreshTableMetadata = 9, RULE_showTableMetadata = 10, RULE_showComputeNodeInfo = 11, 
		RULE_showComputeNodeMode = 12, RULE_labelComputeNode = 13, RULE_unlabelComputeNode = 14, 
		RULE_exportDatabaseConfiguration = 15, RULE_importDatabaseConfiguration = 16, 
		RULE_exportMetaData = 17, RULE_importMetaData = 18, RULE_exportStorageNodes = 19, 
		RULE_convertYamlConfiguration = 20, RULE_lockCluster = 21, RULE_unlockCluster = 22, 
		RULE_showPluginImplementations = 23, RULE_showKeyGenerateAlgorithmPlugins = 24, 
		RULE_showLoadBalanceAlgorithmPlugins = 25, RULE_confPath = 26, RULE_filePath = 27, 
		RULE_metaDataValue = 28, RULE_variableName = 29, RULE_variableValues = 30, 
		RULE_variableValue = 31, RULE_instanceId = 32, RULE_refreshScope = 33, 
		RULE_fromSegment = 34, RULE_lockStrategy = 35, RULE_label = 36, RULE_showLike = 37, 
		RULE_likePattern = 38, RULE_pluginClass = 39, RULE_literal = 40, RULE_algorithmDefinition = 41, 
		RULE_algorithmTypeName = 42, RULE_propertiesDefinition = 43, RULE_properties = 44, 
		RULE_property = 45, RULE_databaseName = 46, RULE_schemaName = 47, RULE_tableName = 48, 
		RULE_resourceName = 49, RULE_storageUnitName = 50, RULE_metadata = 51, 
		RULE_registerStorageUnit = 52, RULE_alterStorageUnit = 53, RULE_unregisterStorageUnit = 54, 
		RULE_storageUnitsDefinition = 55, RULE_storageUnitDefinition = 56, RULE_simpleSource = 57, 
		RULE_urlSource = 58, RULE_hostname = 59, RULE_port = 60, RULE_dbName = 61, 
		RULE_url = 62, RULE_user = 63, RULE_password = 64, RULE_ignoreTables = 65, 
		RULE_ifExists = 66, RULE_ifNotExists = 67, RULE_checkPrivileges = 68, 
		RULE_privilegeType = 69, RULE_showStorageUnits = 70, RULE_showRulesUsedStorageUnit = 71, 
		RULE_showLogicalTables = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "setDistVariable", "showDistVariable", "showDistVariables", 
			"alterComputeNode", "enableComputeNode", "disableComputeNode", "showComputeNodes", 
			"refreshDatabaseMetadata", "refreshTableMetadata", "showTableMetadata", 
			"showComputeNodeInfo", "showComputeNodeMode", "labelComputeNode", "unlabelComputeNode", 
			"exportDatabaseConfiguration", "importDatabaseConfiguration", "exportMetaData", 
			"importMetaData", "exportStorageNodes", "convertYamlConfiguration", "lockCluster", 
			"unlockCluster", "showPluginImplementations", "showKeyGenerateAlgorithmPlugins", 
			"showLoadBalanceAlgorithmPlugins", "confPath", "filePath", "metaDataValue", 
			"variableName", "variableValues", "variableValue", "instanceId", "refreshScope", 
			"fromSegment", "lockStrategy", "label", "showLike", "likePattern", "pluginClass", 
			"literal", "algorithmDefinition", "algorithmTypeName", "propertiesDefinition", 
			"properties", "property", "databaseName", "schemaName", "tableName", 
			"resourceName", "storageUnitName", "metadata", "registerStorageUnit", 
			"alterStorageUnit", "unregisterStorageUnit", "storageUnitsDefinition", 
			"storageUnitDefinition", "simpleSource", "urlSource", "hostname", "port", 
			"dbName", "url", "user", "password", "ignoreTables", "ifExists", "ifNotExists", 
			"checkPrivileges", "privilegeType", "showStorageUnits", "showRulesUsedStorageUnit", 
			"showLogicalTables"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"ADD", "ALL", "CREATE", "ALTER", "DROP", "SET", "SHOW", "FOR", "FROM", 
			"TO", "URL", "HOST", "PORT", "DB", "USER", "PASSWORD", "NAME", "PROPERTIES", 
			"VARIABLE", "VARIABLES", "ENABLE", "DISABLE", "IGNORE", "SCHEMA", "DATABASE", 
			"FULL", "LOGICAL", "SINGLE", "TABLES", "LIST", "TABLE", "RULES", "REFRESH", 
			"METADATA", "TRUE", "FALSE", "IF", "EXISTS", "TYPE", "MODE", "LABEL", 
			"RELABEL", "UNLABEL", "EXPORT", "IMPORT", "CONVERT", "YAML", "CONFIGURATION", 
			"FILE", "USED", "WITH", "INFO", "STORAGE", "UNIT", "UNITS", "DIST", "WHERE", 
			"COMPUTE", "NODE", "NODES", "REGISTER", "UNREGISTER", "GOVERNANCE", "CENTER", 
			"LIKE", "NOT", "LOCK", "UNLOCK", "CLUSTER", "LOCK_STRATEGY", "BROADCAST", 
			"PLUGINS", "OF", "KEY", "GENERATE", "LOAD", "BALANCE", "ALGORITHM", "FORCE", 
			"CHECK_PRIVILEGES", "FOR_GENERATOR", "IDENTIFIER_", "STRING_", "INT_"
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
	public String getGrammarFileName() { return "KernelDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KernelDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KernelDistSQLStatementParser.EOF, 0); }
		public RegisterStorageUnitContext registerStorageUnit() {
			return getRuleContext(RegisterStorageUnitContext.class,0);
		}
		public AlterStorageUnitContext alterStorageUnit() {
			return getRuleContext(AlterStorageUnitContext.class,0);
		}
		public UnregisterStorageUnitContext unregisterStorageUnit() {
			return getRuleContext(UnregisterStorageUnitContext.class,0);
		}
		public ShowStorageUnitsContext showStorageUnits() {
			return getRuleContext(ShowStorageUnitsContext.class,0);
		}
		public ShowRulesUsedStorageUnitContext showRulesUsedStorageUnit() {
			return getRuleContext(ShowRulesUsedStorageUnitContext.class,0);
		}
		public SetDistVariableContext setDistVariable() {
			return getRuleContext(SetDistVariableContext.class,0);
		}
		public ShowDistVariableContext showDistVariable() {
			return getRuleContext(ShowDistVariableContext.class,0);
		}
		public ShowDistVariablesContext showDistVariables() {
			return getRuleContext(ShowDistVariablesContext.class,0);
		}
		public EnableComputeNodeContext enableComputeNode() {
			return getRuleContext(EnableComputeNodeContext.class,0);
		}
		public DisableComputeNodeContext disableComputeNode() {
			return getRuleContext(DisableComputeNodeContext.class,0);
		}
		public ShowComputeNodesContext showComputeNodes() {
			return getRuleContext(ShowComputeNodesContext.class,0);
		}
		public ShowComputeNodeInfoContext showComputeNodeInfo() {
			return getRuleContext(ShowComputeNodeInfoContext.class,0);
		}
		public ShowComputeNodeModeContext showComputeNodeMode() {
			return getRuleContext(ShowComputeNodeModeContext.class,0);
		}
		public LabelComputeNodeContext labelComputeNode() {
			return getRuleContext(LabelComputeNodeContext.class,0);
		}
		public UnlabelComputeNodeContext unlabelComputeNode() {
			return getRuleContext(UnlabelComputeNodeContext.class,0);
		}
		public AlterComputeNodeContext alterComputeNode() {
			return getRuleContext(AlterComputeNodeContext.class,0);
		}
		public ShowLogicalTablesContext showLogicalTables() {
			return getRuleContext(ShowLogicalTablesContext.class,0);
		}
		public RefreshDatabaseMetadataContext refreshDatabaseMetadata() {
			return getRuleContext(RefreshDatabaseMetadataContext.class,0);
		}
		public RefreshTableMetadataContext refreshTableMetadata() {
			return getRuleContext(RefreshTableMetadataContext.class,0);
		}
		public ShowTableMetadataContext showTableMetadata() {
			return getRuleContext(ShowTableMetadataContext.class,0);
		}
		public ExportDatabaseConfigurationContext exportDatabaseConfiguration() {
			return getRuleContext(ExportDatabaseConfigurationContext.class,0);
		}
		public ImportDatabaseConfigurationContext importDatabaseConfiguration() {
			return getRuleContext(ImportDatabaseConfigurationContext.class,0);
		}
		public ExportMetaDataContext exportMetaData() {
			return getRuleContext(ExportMetaDataContext.class,0);
		}
		public ImportMetaDataContext importMetaData() {
			return getRuleContext(ImportMetaDataContext.class,0);
		}
		public ExportStorageNodesContext exportStorageNodes() {
			return getRuleContext(ExportStorageNodesContext.class,0);
		}
		public ConvertYamlConfigurationContext convertYamlConfiguration() {
			return getRuleContext(ConvertYamlConfigurationContext.class,0);
		}
		public LockClusterContext lockCluster() {
			return getRuleContext(LockClusterContext.class,0);
		}
		public UnlockClusterContext unlockCluster() {
			return getRuleContext(UnlockClusterContext.class,0);
		}
		public ShowPluginImplementationsContext showPluginImplementations() {
			return getRuleContext(ShowPluginImplementationsContext.class,0);
		}
		public ShowKeyGenerateAlgorithmPluginsContext showKeyGenerateAlgorithmPlugins() {
			return getRuleContext(ShowKeyGenerateAlgorithmPluginsContext.class,0);
		}
		public ShowLoadBalanceAlgorithmPluginsContext showLoadBalanceAlgorithmPlugins() {
			return getRuleContext(ShowLoadBalanceAlgorithmPluginsContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(KernelDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(146);
				registerStorageUnit();
				}
				break;
			case 2:
				{
				setState(147);
				alterStorageUnit();
				}
				break;
			case 3:
				{
				setState(148);
				unregisterStorageUnit();
				}
				break;
			case 4:
				{
				setState(149);
				showStorageUnits();
				}
				break;
			case 5:
				{
				setState(150);
				showRulesUsedStorageUnit();
				}
				break;
			case 6:
				{
				setState(151);
				setDistVariable();
				}
				break;
			case 7:
				{
				setState(152);
				showDistVariable();
				}
				break;
			case 8:
				{
				setState(153);
				showDistVariables();
				}
				break;
			case 9:
				{
				setState(154);
				enableComputeNode();
				}
				break;
			case 10:
				{
				setState(155);
				disableComputeNode();
				}
				break;
			case 11:
				{
				setState(156);
				showComputeNodes();
				}
				break;
			case 12:
				{
				setState(157);
				showComputeNodeInfo();
				}
				break;
			case 13:
				{
				setState(158);
				showComputeNodeMode();
				}
				break;
			case 14:
				{
				setState(159);
				labelComputeNode();
				}
				break;
			case 15:
				{
				setState(160);
				unlabelComputeNode();
				}
				break;
			case 16:
				{
				setState(161);
				alterComputeNode();
				}
				break;
			case 17:
				{
				setState(162);
				showLogicalTables();
				}
				break;
			case 18:
				{
				setState(163);
				refreshDatabaseMetadata();
				}
				break;
			case 19:
				{
				setState(164);
				refreshTableMetadata();
				}
				break;
			case 20:
				{
				setState(165);
				showTableMetadata();
				}
				break;
			case 21:
				{
				setState(166);
				exportDatabaseConfiguration();
				}
				break;
			case 22:
				{
				setState(167);
				importDatabaseConfiguration();
				}
				break;
			case 23:
				{
				setState(168);
				exportMetaData();
				}
				break;
			case 24:
				{
				setState(169);
				importMetaData();
				}
				break;
			case 25:
				{
				setState(170);
				exportStorageNodes();
				}
				break;
			case 26:
				{
				setState(171);
				convertYamlConfiguration();
				}
				break;
			case 27:
				{
				setState(172);
				lockCluster();
				}
				break;
			case 28:
				{
				setState(173);
				unlockCluster();
				}
				break;
			case 29:
				{
				setState(174);
				showPluginImplementations();
				}
				break;
			case 30:
				{
				setState(175);
				showKeyGenerateAlgorithmPlugins();
				}
				break;
			case 31:
				{
				setState(176);
				showLoadBalanceAlgorithmPlugins();
				}
				break;
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(179);
				match(SEMI_);
				}
			}

			setState(182);
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
	public static class SetDistVariableContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(KernelDistSQLStatementParser.SET, 0); }
		public TerminalNode DIST() { return getToken(KernelDistSQLStatementParser.DIST, 0); }
		public TerminalNode VARIABLE() { return getToken(KernelDistSQLStatementParser.VARIABLE, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(KernelDistSQLStatementParser.EQ_, 0); }
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public SetDistVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setDistVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterSetDistVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitSetDistVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitSetDistVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetDistVariableContext setDistVariable() throws RecognitionException {
		SetDistVariableContext _localctx = new SetDistVariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setDistVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(SET);
			setState(185);
			match(DIST);
			setState(186);
			match(VARIABLE);
			setState(187);
			variableName();
			setState(188);
			match(EQ_);
			setState(189);
			variableValue();
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
	public static class ShowDistVariableContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode DIST() { return getToken(KernelDistSQLStatementParser.DIST, 0); }
		public TerminalNode VARIABLE() { return getToken(KernelDistSQLStatementParser.VARIABLE, 0); }
		public TerminalNode WHERE() { return getToken(KernelDistSQLStatementParser.WHERE, 0); }
		public TerminalNode NAME() { return getToken(KernelDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(KernelDistSQLStatementParser.EQ_, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ShowDistVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDistVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowDistVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowDistVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowDistVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDistVariableContext showDistVariable() throws RecognitionException {
		ShowDistVariableContext _localctx = new ShowDistVariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_showDistVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(SHOW);
			setState(192);
			match(DIST);
			setState(193);
			match(VARIABLE);
			setState(194);
			match(WHERE);
			setState(195);
			match(NAME);
			setState(196);
			match(EQ_);
			setState(197);
			variableName();
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
	public static class ShowDistVariablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode DIST() { return getToken(KernelDistSQLStatementParser.DIST, 0); }
		public TerminalNode VARIABLES() { return getToken(KernelDistSQLStatementParser.VARIABLES, 0); }
		public ShowLikeContext showLike() {
			return getRuleContext(ShowLikeContext.class,0);
		}
		public ShowDistVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDistVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowDistVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowDistVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowDistVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDistVariablesContext showDistVariables() throws RecognitionException {
		ShowDistVariablesContext _localctx = new ShowDistVariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_showDistVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(SHOW);
			setState(200);
			match(DIST);
			setState(201);
			match(VARIABLES);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(202);
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
	public static class AlterComputeNodeContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(KernelDistSQLStatementParser.ALTER, 0); }
		public TerminalNode COMPUTE() { return getToken(KernelDistSQLStatementParser.COMPUTE, 0); }
		public TerminalNode NODE() { return getToken(KernelDistSQLStatementParser.NODE, 0); }
		public InstanceIdContext instanceId() {
			return getRuleContext(InstanceIdContext.class,0);
		}
		public TerminalNode SET() { return getToken(KernelDistSQLStatementParser.SET, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(KernelDistSQLStatementParser.EQ_, 0); }
		public VariableValuesContext variableValues() {
			return getRuleContext(VariableValuesContext.class,0);
		}
		public AlterComputeNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterComputeNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterAlterComputeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitAlterComputeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitAlterComputeNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterComputeNodeContext alterComputeNode() throws RecognitionException {
		AlterComputeNodeContext _localctx = new AlterComputeNodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alterComputeNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ALTER);
			setState(206);
			match(COMPUTE);
			setState(207);
			match(NODE);
			setState(208);
			instanceId();
			setState(209);
			match(SET);
			setState(210);
			variableName();
			setState(211);
			match(EQ_);
			setState(212);
			variableValues();
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
	public static class EnableComputeNodeContext extends ParserRuleContext {
		public TerminalNode ENABLE() { return getToken(KernelDistSQLStatementParser.ENABLE, 0); }
		public TerminalNode COMPUTE() { return getToken(KernelDistSQLStatementParser.COMPUTE, 0); }
		public TerminalNode NODE() { return getToken(KernelDistSQLStatementParser.NODE, 0); }
		public InstanceIdContext instanceId() {
			return getRuleContext(InstanceIdContext.class,0);
		}
		public EnableComputeNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enableComputeNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterEnableComputeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitEnableComputeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitEnableComputeNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnableComputeNodeContext enableComputeNode() throws RecognitionException {
		EnableComputeNodeContext _localctx = new EnableComputeNodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enableComputeNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ENABLE);
			setState(215);
			match(COMPUTE);
			setState(216);
			match(NODE);
			setState(217);
			instanceId();
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
	public static class DisableComputeNodeContext extends ParserRuleContext {
		public TerminalNode DISABLE() { return getToken(KernelDistSQLStatementParser.DISABLE, 0); }
		public TerminalNode COMPUTE() { return getToken(KernelDistSQLStatementParser.COMPUTE, 0); }
		public TerminalNode NODE() { return getToken(KernelDistSQLStatementParser.NODE, 0); }
		public InstanceIdContext instanceId() {
			return getRuleContext(InstanceIdContext.class,0);
		}
		public DisableComputeNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disableComputeNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterDisableComputeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitDisableComputeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitDisableComputeNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisableComputeNodeContext disableComputeNode() throws RecognitionException {
		DisableComputeNodeContext _localctx = new DisableComputeNodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_disableComputeNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(DISABLE);
			setState(220);
			match(COMPUTE);
			setState(221);
			match(NODE);
			setState(222);
			instanceId();
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
	public static class ShowComputeNodesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode COMPUTE() { return getToken(KernelDistSQLStatementParser.COMPUTE, 0); }
		public TerminalNode NODES() { return getToken(KernelDistSQLStatementParser.NODES, 0); }
		public ShowComputeNodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showComputeNodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowComputeNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowComputeNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowComputeNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowComputeNodesContext showComputeNodes() throws RecognitionException {
		ShowComputeNodesContext _localctx = new ShowComputeNodesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_showComputeNodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(SHOW);
			setState(225);
			match(COMPUTE);
			setState(226);
			match(NODES);
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
	public static class RefreshDatabaseMetadataContext extends ParserRuleContext {
		public TerminalNode REFRESH() { return getToken(KernelDistSQLStatementParser.REFRESH, 0); }
		public TerminalNode DATABASE() { return getToken(KernelDistSQLStatementParser.DATABASE, 0); }
		public TerminalNode METADATA() { return getToken(KernelDistSQLStatementParser.METADATA, 0); }
		public TerminalNode FORCE() { return getToken(KernelDistSQLStatementParser.FORCE, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public RefreshDatabaseMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshDatabaseMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterRefreshDatabaseMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitRefreshDatabaseMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitRefreshDatabaseMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshDatabaseMetadataContext refreshDatabaseMetadata() throws RecognitionException {
		RefreshDatabaseMetadataContext _localctx = new RefreshDatabaseMetadataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_refreshDatabaseMetadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORCE) {
				{
				setState(228);
				match(FORCE);
				}
			}

			setState(231);
			match(REFRESH);
			setState(232);
			match(DATABASE);
			setState(233);
			match(METADATA);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(234);
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
	public static class RefreshTableMetadataContext extends ParserRuleContext {
		public TerminalNode REFRESH() { return getToken(KernelDistSQLStatementParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(KernelDistSQLStatementParser.TABLE, 0); }
		public TerminalNode METADATA() { return getToken(KernelDistSQLStatementParser.METADATA, 0); }
		public RefreshScopeContext refreshScope() {
			return getRuleContext(RefreshScopeContext.class,0);
		}
		public RefreshTableMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshTableMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterRefreshTableMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitRefreshTableMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitRefreshTableMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshTableMetadataContext refreshTableMetadata() throws RecognitionException {
		RefreshTableMetadataContext _localctx = new RefreshTableMetadataContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_refreshTableMetadata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(REFRESH);
			setState(238);
			match(TABLE);
			setState(239);
			match(METADATA);
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(240);
				refreshScope();
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
	public static class ShowTableMetadataContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(KernelDistSQLStatementParser.TABLE, 0); }
		public TerminalNode METADATA() { return getToken(KernelDistSQLStatementParser.METADATA, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode COMMA_() { return getToken(KernelDistSQLStatementParser.COMMA_, 0); }
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowTableMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTableMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowTableMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowTableMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowTableMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTableMetadataContext showTableMetadata() throws RecognitionException {
		ShowTableMetadataContext _localctx = new ShowTableMetadataContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_showTableMetadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(SHOW);
			setState(244);
			match(TABLE);
			setState(245);
			match(METADATA);
			setState(246);
			tableName();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(247);
				match(COMMA_);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER_) {
					{
					{
					setState(248);
					tableName();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(256);
				match(FROM);
				setState(257);
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
	public static class ShowComputeNodeInfoContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode COMPUTE() { return getToken(KernelDistSQLStatementParser.COMPUTE, 0); }
		public TerminalNode NODE() { return getToken(KernelDistSQLStatementParser.NODE, 0); }
		public TerminalNode INFO() { return getToken(KernelDistSQLStatementParser.INFO, 0); }
		public ShowComputeNodeInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showComputeNodeInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowComputeNodeInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowComputeNodeInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowComputeNodeInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowComputeNodeInfoContext showComputeNodeInfo() throws RecognitionException {
		ShowComputeNodeInfoContext _localctx = new ShowComputeNodeInfoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_showComputeNodeInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(SHOW);
			setState(261);
			match(COMPUTE);
			setState(262);
			match(NODE);
			setState(263);
			match(INFO);
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
	public static class ShowComputeNodeModeContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode COMPUTE() { return getToken(KernelDistSQLStatementParser.COMPUTE, 0); }
		public TerminalNode NODE() { return getToken(KernelDistSQLStatementParser.NODE, 0); }
		public TerminalNode MODE() { return getToken(KernelDistSQLStatementParser.MODE, 0); }
		public ShowComputeNodeModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showComputeNodeMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowComputeNodeMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowComputeNodeMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowComputeNodeMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowComputeNodeModeContext showComputeNodeMode() throws RecognitionException {
		ShowComputeNodeModeContext _localctx = new ShowComputeNodeModeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_showComputeNodeMode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(SHOW);
			setState(266);
			match(COMPUTE);
			setState(267);
			match(NODE);
			setState(268);
			match(MODE);
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
	public static class LabelComputeNodeContext extends ParserRuleContext {
		public TerminalNode COMPUTE() { return getToken(KernelDistSQLStatementParser.COMPUTE, 0); }
		public TerminalNode NODE() { return getToken(KernelDistSQLStatementParser.NODE, 0); }
		public InstanceIdContext instanceId() {
			return getRuleContext(InstanceIdContext.class,0);
		}
		public TerminalNode WITH() { return getToken(KernelDistSQLStatementParser.WITH, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode LABEL() { return getToken(KernelDistSQLStatementParser.LABEL, 0); }
		public TerminalNode RELABEL() { return getToken(KernelDistSQLStatementParser.RELABEL, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(KernelDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(KernelDistSQLStatementParser.COMMA_, i);
		}
		public LabelComputeNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelComputeNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterLabelComputeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitLabelComputeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitLabelComputeNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelComputeNodeContext labelComputeNode() throws RecognitionException {
		LabelComputeNodeContext _localctx = new LabelComputeNodeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_labelComputeNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==LABEL || _la==RELABEL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(271);
			match(COMPUTE);
			setState(272);
			match(NODE);
			setState(273);
			instanceId();
			setState(274);
			match(WITH);
			setState(275);
			label();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(276);
				match(COMMA_);
				setState(277);
				label();
				}
				}
				setState(282);
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
	public static class UnlabelComputeNodeContext extends ParserRuleContext {
		public TerminalNode UNLABEL() { return getToken(KernelDistSQLStatementParser.UNLABEL, 0); }
		public TerminalNode COMPUTE() { return getToken(KernelDistSQLStatementParser.COMPUTE, 0); }
		public TerminalNode NODE() { return getToken(KernelDistSQLStatementParser.NODE, 0); }
		public InstanceIdContext instanceId() {
			return getRuleContext(InstanceIdContext.class,0);
		}
		public TerminalNode WITH() { return getToken(KernelDistSQLStatementParser.WITH, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(KernelDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(KernelDistSQLStatementParser.COMMA_, i);
		}
		public UnlabelComputeNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelComputeNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterUnlabelComputeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitUnlabelComputeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitUnlabelComputeNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlabelComputeNodeContext unlabelComputeNode() throws RecognitionException {
		UnlabelComputeNodeContext _localctx = new UnlabelComputeNodeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unlabelComputeNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(UNLABEL);
			setState(284);
			match(COMPUTE);
			setState(285);
			match(NODE);
			setState(286);
			instanceId();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(287);
				match(WITH);
				setState(288);
				label();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(289);
					match(COMMA_);
					setState(290);
					label();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ExportDatabaseConfigurationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(KernelDistSQLStatementParser.EXPORT, 0); }
		public TerminalNode DATABASE() { return getToken(KernelDistSQLStatementParser.DATABASE, 0); }
		public TerminalNode CONFIGURATION() { return getToken(KernelDistSQLStatementParser.CONFIGURATION, 0); }
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(KernelDistSQLStatementParser.TO, 0); }
		public TerminalNode FILE() { return getToken(KernelDistSQLStatementParser.FILE, 0); }
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public ExportDatabaseConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDatabaseConfiguration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterExportDatabaseConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitExportDatabaseConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitExportDatabaseConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportDatabaseConfigurationContext exportDatabaseConfiguration() throws RecognitionException {
		ExportDatabaseConfigurationContext _localctx = new ExportDatabaseConfigurationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exportDatabaseConfiguration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(EXPORT);
			setState(299);
			match(DATABASE);
			setState(300);
			match(CONFIGURATION);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(301);
				match(FROM);
				setState(302);
				databaseName();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(305);
				match(TO);
				setState(306);
				match(FILE);
				setState(307);
				filePath();
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
	public static class ImportDatabaseConfigurationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KernelDistSQLStatementParser.IMPORT, 0); }
		public TerminalNode DATABASE() { return getToken(KernelDistSQLStatementParser.DATABASE, 0); }
		public TerminalNode CONFIGURATION() { return getToken(KernelDistSQLStatementParser.CONFIGURATION, 0); }
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public TerminalNode FILE() { return getToken(KernelDistSQLStatementParser.FILE, 0); }
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public ImportDatabaseConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDatabaseConfiguration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterImportDatabaseConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitImportDatabaseConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitImportDatabaseConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDatabaseConfigurationContext importDatabaseConfiguration() throws RecognitionException {
		ImportDatabaseConfigurationContext _localctx = new ImportDatabaseConfigurationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_importDatabaseConfiguration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(IMPORT);
			setState(311);
			match(DATABASE);
			setState(312);
			match(CONFIGURATION);
			setState(313);
			match(FROM);
			setState(314);
			match(FILE);
			setState(315);
			filePath();
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
	public static class ExportMetaDataContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(KernelDistSQLStatementParser.EXPORT, 0); }
		public TerminalNode METADATA() { return getToken(KernelDistSQLStatementParser.METADATA, 0); }
		public TerminalNode TO() { return getToken(KernelDistSQLStatementParser.TO, 0); }
		public TerminalNode FILE() { return getToken(KernelDistSQLStatementParser.FILE, 0); }
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public ExportMetaDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportMetaData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterExportMetaData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitExportMetaData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitExportMetaData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportMetaDataContext exportMetaData() throws RecognitionException {
		ExportMetaDataContext _localctx = new ExportMetaDataContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exportMetaData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(EXPORT);
			setState(318);
			match(METADATA);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(319);
				match(TO);
				setState(320);
				match(FILE);
				setState(321);
				filePath();
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
	public static class ImportMetaDataContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KernelDistSQLStatementParser.IMPORT, 0); }
		public TerminalNode METADATA() { return getToken(KernelDistSQLStatementParser.METADATA, 0); }
		public MetaDataValueContext metaDataValue() {
			return getRuleContext(MetaDataValueContext.class,0);
		}
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public TerminalNode FILE() { return getToken(KernelDistSQLStatementParser.FILE, 0); }
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public ImportMetaDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importMetaData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterImportMetaData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitImportMetaData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitImportMetaData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportMetaDataContext importMetaData() throws RecognitionException {
		ImportMetaDataContext _localctx = new ImportMetaDataContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_importMetaData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IMPORT);
			setState(325);
			match(METADATA);
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				{
				setState(326);
				metaDataValue();
				}
				break;
			case FROM:
				{
				setState(327);
				match(FROM);
				setState(328);
				match(FILE);
				setState(329);
				filePath();
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
	public static class ExportStorageNodesContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(KernelDistSQLStatementParser.EXPORT, 0); }
		public TerminalNode STORAGE() { return getToken(KernelDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode NODES() { return getToken(KernelDistSQLStatementParser.NODES, 0); }
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(KernelDistSQLStatementParser.TO, 0); }
		public TerminalNode FILE() { return getToken(KernelDistSQLStatementParser.FILE, 0); }
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public ExportStorageNodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStorageNodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterExportStorageNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitExportStorageNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitExportStorageNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStorageNodesContext exportStorageNodes() throws RecognitionException {
		ExportStorageNodesContext _localctx = new ExportStorageNodesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exportStorageNodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(EXPORT);
			setState(333);
			match(STORAGE);
			setState(334);
			match(NODES);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(335);
				match(FROM);
				setState(336);
				databaseName();
				}
			}

			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(339);
				match(TO);
				setState(340);
				match(FILE);
				setState(341);
				filePath();
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
	public static class ConvertYamlConfigurationContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(KernelDistSQLStatementParser.CONVERT, 0); }
		public TerminalNode YAML() { return getToken(KernelDistSQLStatementParser.YAML, 0); }
		public TerminalNode CONFIGURATION() { return getToken(KernelDistSQLStatementParser.CONFIGURATION, 0); }
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public TerminalNode FILE() { return getToken(KernelDistSQLStatementParser.FILE, 0); }
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public ConvertYamlConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertYamlConfiguration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterConvertYamlConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitConvertYamlConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitConvertYamlConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConvertYamlConfigurationContext convertYamlConfiguration() throws RecognitionException {
		ConvertYamlConfigurationContext _localctx = new ConvertYamlConfigurationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_convertYamlConfiguration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(CONVERT);
			setState(345);
			match(YAML);
			setState(346);
			match(CONFIGURATION);
			setState(347);
			match(FROM);
			setState(348);
			match(FILE);
			setState(349);
			filePath();
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
	public static class LockClusterContext extends ParserRuleContext {
		public TerminalNode LOCK() { return getToken(KernelDistSQLStatementParser.LOCK, 0); }
		public TerminalNode CLUSTER() { return getToken(KernelDistSQLStatementParser.CLUSTER, 0); }
		public TerminalNode WITH() { return getToken(KernelDistSQLStatementParser.WITH, 0); }
		public LockStrategyContext lockStrategy() {
			return getRuleContext(LockStrategyContext.class,0);
		}
		public LockClusterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockCluster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterLockCluster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitLockCluster(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitLockCluster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockClusterContext lockCluster() throws RecognitionException {
		LockClusterContext _localctx = new LockClusterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lockCluster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LOCK);
			setState(352);
			match(CLUSTER);
			setState(353);
			match(WITH);
			setState(354);
			lockStrategy();
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
	public static class UnlockClusterContext extends ParserRuleContext {
		public TerminalNode UNLOCK() { return getToken(KernelDistSQLStatementParser.UNLOCK, 0); }
		public TerminalNode CLUSTER() { return getToken(KernelDistSQLStatementParser.CLUSTER, 0); }
		public UnlockClusterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlockCluster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterUnlockCluster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitUnlockCluster(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitUnlockCluster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlockClusterContext unlockCluster() throws RecognitionException {
		UnlockClusterContext _localctx = new UnlockClusterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unlockCluster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(UNLOCK);
			setState(357);
			match(CLUSTER);
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
	public static class ShowPluginImplementationsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode PLUGINS() { return getToken(KernelDistSQLStatementParser.PLUGINS, 0); }
		public TerminalNode OF() { return getToken(KernelDistSQLStatementParser.OF, 0); }
		public PluginClassContext pluginClass() {
			return getRuleContext(PluginClassContext.class,0);
		}
		public ShowPluginImplementationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showPluginImplementations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowPluginImplementations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowPluginImplementations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowPluginImplementations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowPluginImplementationsContext showPluginImplementations() throws RecognitionException {
		ShowPluginImplementationsContext _localctx = new ShowPluginImplementationsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_showPluginImplementations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(SHOW);
			setState(360);
			match(PLUGINS);
			setState(361);
			match(OF);
			setState(362);
			pluginClass();
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
	public static class ShowKeyGenerateAlgorithmPluginsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode KEY() { return getToken(KernelDistSQLStatementParser.KEY, 0); }
		public TerminalNode GENERATE() { return getToken(KernelDistSQLStatementParser.GENERATE, 0); }
		public TerminalNode ALGORITHM() { return getToken(KernelDistSQLStatementParser.ALGORITHM, 0); }
		public TerminalNode PLUGINS() { return getToken(KernelDistSQLStatementParser.PLUGINS, 0); }
		public ShowKeyGenerateAlgorithmPluginsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showKeyGenerateAlgorithmPlugins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowKeyGenerateAlgorithmPlugins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowKeyGenerateAlgorithmPlugins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowKeyGenerateAlgorithmPlugins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowKeyGenerateAlgorithmPluginsContext showKeyGenerateAlgorithmPlugins() throws RecognitionException {
		ShowKeyGenerateAlgorithmPluginsContext _localctx = new ShowKeyGenerateAlgorithmPluginsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_showKeyGenerateAlgorithmPlugins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(SHOW);
			setState(365);
			match(KEY);
			setState(366);
			match(GENERATE);
			setState(367);
			match(ALGORITHM);
			setState(368);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShowLoadBalanceAlgorithmPluginsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode LOAD() { return getToken(KernelDistSQLStatementParser.LOAD, 0); }
		public TerminalNode BALANCE() { return getToken(KernelDistSQLStatementParser.BALANCE, 0); }
		public TerminalNode ALGORITHM() { return getToken(KernelDistSQLStatementParser.ALGORITHM, 0); }
		public TerminalNode PLUGINS() { return getToken(KernelDistSQLStatementParser.PLUGINS, 0); }
		public ShowLoadBalanceAlgorithmPluginsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showLoadBalanceAlgorithmPlugins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowLoadBalanceAlgorithmPlugins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowLoadBalanceAlgorithmPlugins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowLoadBalanceAlgorithmPlugins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowLoadBalanceAlgorithmPluginsContext showLoadBalanceAlgorithmPlugins() throws RecognitionException {
		ShowLoadBalanceAlgorithmPluginsContext _localctx = new ShowLoadBalanceAlgorithmPluginsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_showLoadBalanceAlgorithmPlugins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(SHOW);
			setState(371);
			match(LOAD);
			setState(372);
			match(BALANCE);
			setState(373);
			match(ALGORITHM);
			setState(374);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConfPathContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public ConfPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterConfPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitConfPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitConfPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfPathContext confPath() throws RecognitionException {
		ConfPathContext _localctx = new ConfPathContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_confPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
	public static class FilePathContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public FilePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterFilePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitFilePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitFilePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilePathContext filePath() throws RecognitionException {
		FilePathContext _localctx = new FilePathContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_filePath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
	public static class MetaDataValueContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public MetaDataValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaDataValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterMetaDataValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitMetaDataValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitMetaDataValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaDataValueContext metaDataValue() throws RecognitionException {
		MetaDataValueContext _localctx = new MetaDataValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_metaDataValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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
	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(KernelDistSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
	public static class VariableValuesContext extends ParserRuleContext {
		public List<VariableValueContext> variableValue() {
			return getRuleContexts(VariableValueContext.class);
		}
		public VariableValueContext variableValue(int i) {
			return getRuleContext(VariableValueContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(KernelDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(KernelDistSQLStatementParser.COMMA_, i);
		}
		public VariableValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterVariableValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitVariableValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitVariableValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValuesContext variableValues() throws RecognitionException {
		VariableValuesContext _localctx = new VariableValuesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			variableValue();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(385);
				match(COMMA_);
				setState(386);
				variableValue();
				}
				}
				setState(391);
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
	public static class VariableValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			literal();
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
	public static class InstanceIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(KernelDistSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public InstanceIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterInstanceId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitInstanceId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitInstanceId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceIdContext instanceId() throws RecognitionException {
		InstanceIdContext _localctx = new InstanceIdContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_instanceId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
	public static class RefreshScopeContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public FromSegmentContext fromSegment() {
			return getRuleContext(FromSegmentContext.class,0);
		}
		public RefreshScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterRefreshScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitRefreshScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitRefreshScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshScopeContext refreshScope() throws RecognitionException {
		RefreshScopeContext _localctx = new RefreshScopeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_refreshScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(396);
				tableName();
				}
			}

			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(399);
				fromSegment();
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
	public static class FromSegmentContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public TerminalNode STORAGE() { return getToken(KernelDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode UNIT() { return getToken(KernelDistSQLStatementParser.UNIT, 0); }
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public TerminalNode SCHEMA() { return getToken(KernelDistSQLStatementParser.SCHEMA, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public FromSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterFromSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitFromSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitFromSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromSegmentContext fromSegment() throws RecognitionException {
		FromSegmentContext _localctx = new FromSegmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fromSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(FROM);
			setState(403);
			match(STORAGE);
			setState(404);
			match(UNIT);
			setState(405);
			storageUnitName();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCHEMA) {
				{
				setState(406);
				match(SCHEMA);
				setState(407);
				schemaName();
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
	public static class LockStrategyContext extends ParserRuleContext {
		public TerminalNode LOCK_STRATEGY() { return getToken(KernelDistSQLStatementParser.LOCK_STRATEGY, 0); }
		public TerminalNode LP_() { return getToken(KernelDistSQLStatementParser.LP_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(KernelDistSQLStatementParser.RP_, 0); }
		public LockStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterLockStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitLockStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitLockStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockStrategyContext lockStrategy() throws RecognitionException {
		LockStrategyContext _localctx = new LockStrategyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lockStrategy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(LOCK_STRATEGY);
			setState(411);
			match(LP_);
			setState(412);
			algorithmDefinition();
			setState(413);
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
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(KernelDistSQLStatementParser.IDENTIFIER_, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
	public static class ShowLikeContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(KernelDistSQLStatementParser.LIKE, 0); }
		public LikePatternContext likePattern() {
			return getRuleContext(LikePatternContext.class,0);
		}
		public ShowLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showLike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowLikeContext showLike() throws RecognitionException {
		ShowLikeContext _localctx = new ShowLikeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_showLike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(LIKE);
			setState(418);
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
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public LikePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterLikePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitLikePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitLikePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikePatternContext likePattern() throws RecognitionException {
		LikePatternContext _localctx = new LikePatternContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_likePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
	public static class PluginClassContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public PluginClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterPluginClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitPluginClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitPluginClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginClassContext pluginClass() throws RecognitionException {
		PluginClassContext _localctx = new PluginClassContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pluginClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(KernelDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(KernelDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(KernelDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KernelDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literal);
		int _la;
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(425);
					match(MINUS_);
					}
				}

				setState(428);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
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
		public TerminalNode TYPE() { return getToken(KernelDistSQLStatementParser.TYPE, 0); }
		public TerminalNode LP_() { return getToken(KernelDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(KernelDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(KernelDistSQLStatementParser.EQ_, 0); }
		public AlgorithmTypeNameContext algorithmTypeName() {
			return getRuleContext(AlgorithmTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(KernelDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(KernelDistSQLStatementParser.COMMA_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public AlgorithmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterAlgorithmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitAlgorithmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDefinitionContext algorithmDefinition() throws RecognitionException {
		AlgorithmDefinitionContext _localctx = new AlgorithmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_algorithmDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(TYPE);
			setState(434);
			match(LP_);
			setState(435);
			match(NAME);
			setState(436);
			match(EQ_);
			setState(437);
			algorithmTypeName();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(438);
				match(COMMA_);
				setState(439);
				propertiesDefinition();
				}
			}

			setState(442);
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
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public AlgorithmTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterAlgorithmTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitAlgorithmTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmTypeNameContext algorithmTypeName() throws RecognitionException {
		AlgorithmTypeNameContext _localctx = new AlgorithmTypeNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_algorithmTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
	public static class PropertiesDefinitionContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(KernelDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(KernelDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(KernelDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefinitionContext propertiesDefinition() throws RecognitionException {
		PropertiesDefinitionContext _localctx = new PropertiesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_propertiesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(PROPERTIES);
			setState(447);
			match(LP_);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(448);
				properties();
				}
			}

			setState(451);
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
		public List<TerminalNode> COMMA_() { return getTokens(KernelDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(KernelDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			property();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(454);
				match(COMMA_);
				setState(455);
				property();
				}
				}
				setState(460);
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
		public TerminalNode EQ_() { return getToken(KernelDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(462);
			match(EQ_);
			setState(463);
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
		public TerminalNode IDENTIFIER_() { return getToken(KernelDistSQLStatementParser.IDENTIFIER_, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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
		public TerminalNode IDENTIFIER_() { return getToken(KernelDistSQLStatementParser.IDENTIFIER_, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		public TerminalNode IDENTIFIER_() { return getToken(KernelDistSQLStatementParser.IDENTIFIER_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
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
	public static class ResourceNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(KernelDistSQLStatementParser.IDENTIFIER_, 0); }
		public ResourceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterResourceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitResourceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitResourceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceNameContext resourceName() throws RecognitionException {
		ResourceNameContext _localctx = new ResourceNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_resourceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
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
		public TerminalNode IDENTIFIER_() { return getToken(KernelDistSQLStatementParser.IDENTIFIER_, 0); }
		public StorageUnitNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageUnitName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterStorageUnitName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitStorageUnitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitStorageUnitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageUnitNameContext storageUnitName() throws RecognitionException {
		StorageUnitNameContext _localctx = new StorageUnitNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_storageUnitName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
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
	public static class MetadataContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_metadata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
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
	public static class RegisterStorageUnitContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(KernelDistSQLStatementParser.REGISTER, 0); }
		public TerminalNode STORAGE() { return getToken(KernelDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode UNIT() { return getToken(KernelDistSQLStatementParser.UNIT, 0); }
		public StorageUnitsDefinitionContext storageUnitsDefinition() {
			return getRuleContext(StorageUnitsDefinitionContext.class,0);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(KernelDistSQLStatementParser.COMMA_, 0); }
		public CheckPrivilegesContext checkPrivileges() {
			return getRuleContext(CheckPrivilegesContext.class,0);
		}
		public RegisterStorageUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registerStorageUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterRegisterStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitRegisterStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitRegisterStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterStorageUnitContext registerStorageUnit() throws RecognitionException {
		RegisterStorageUnitContext _localctx = new RegisterStorageUnitContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_registerStorageUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(REGISTER);
			setState(478);
			match(STORAGE);
			setState(479);
			match(UNIT);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(480);
				ifNotExists();
				}
			}

			setState(483);
			storageUnitsDefinition();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(484);
				match(COMMA_);
				setState(485);
				checkPrivileges();
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
	public static class AlterStorageUnitContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(KernelDistSQLStatementParser.ALTER, 0); }
		public TerminalNode STORAGE() { return getToken(KernelDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode UNIT() { return getToken(KernelDistSQLStatementParser.UNIT, 0); }
		public StorageUnitsDefinitionContext storageUnitsDefinition() {
			return getRuleContext(StorageUnitsDefinitionContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(KernelDistSQLStatementParser.COMMA_, 0); }
		public CheckPrivilegesContext checkPrivileges() {
			return getRuleContext(CheckPrivilegesContext.class,0);
		}
		public AlterStorageUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStorageUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterAlterStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitAlterStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitAlterStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterStorageUnitContext alterStorageUnit() throws RecognitionException {
		AlterStorageUnitContext _localctx = new AlterStorageUnitContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_alterStorageUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(ALTER);
			setState(489);
			match(STORAGE);
			setState(490);
			match(UNIT);
			setState(491);
			storageUnitsDefinition();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(492);
				match(COMMA_);
				setState(493);
				checkPrivileges();
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
	public static class UnregisterStorageUnitContext extends ParserRuleContext {
		public TerminalNode UNREGISTER() { return getToken(KernelDistSQLStatementParser.UNREGISTER, 0); }
		public TerminalNode STORAGE() { return getToken(KernelDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode UNIT() { return getToken(KernelDistSQLStatementParser.UNIT, 0); }
		public List<StorageUnitNameContext> storageUnitName() {
			return getRuleContexts(StorageUnitNameContext.class);
		}
		public StorageUnitNameContext storageUnitName(int i) {
			return getRuleContext(StorageUnitNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(KernelDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(KernelDistSQLStatementParser.COMMA_, i);
		}
		public IgnoreTablesContext ignoreTables() {
			return getRuleContext(IgnoreTablesContext.class,0);
		}
		public UnregisterStorageUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unregisterStorageUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterUnregisterStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitUnregisterStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitUnregisterStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnregisterStorageUnitContext unregisterStorageUnit() throws RecognitionException {
		UnregisterStorageUnitContext _localctx = new UnregisterStorageUnitContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unregisterStorageUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(UNREGISTER);
			setState(497);
			match(STORAGE);
			setState(498);
			match(UNIT);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(499);
				ifExists();
				}
			}

			setState(502);
			storageUnitName();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(503);
				match(COMMA_);
				setState(504);
				storageUnitName();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(510);
				ignoreTables();
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
	public static class StorageUnitsDefinitionContext extends ParserRuleContext {
		public List<StorageUnitDefinitionContext> storageUnitDefinition() {
			return getRuleContexts(StorageUnitDefinitionContext.class);
		}
		public StorageUnitDefinitionContext storageUnitDefinition(int i) {
			return getRuleContext(StorageUnitDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(KernelDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(KernelDistSQLStatementParser.COMMA_, i);
		}
		public StorageUnitsDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageUnitsDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterStorageUnitsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitStorageUnitsDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitStorageUnitsDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageUnitsDefinitionContext storageUnitsDefinition() throws RecognitionException {
		StorageUnitsDefinitionContext _localctx = new StorageUnitsDefinitionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_storageUnitsDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			storageUnitDefinition();
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					match(COMMA_);
					setState(515);
					storageUnitDefinition();
					}
					} 
				}
				setState(520);
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
	public static class StorageUnitDefinitionContext extends ParserRuleContext {
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(KernelDistSQLStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(KernelDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(KernelDistSQLStatementParser.COMMA_, i);
		}
		public TerminalNode USER() { return getToken(KernelDistSQLStatementParser.USER, 0); }
		public List<TerminalNode> EQ_() { return getTokens(KernelDistSQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(KernelDistSQLStatementParser.EQ_, i);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode RP_() { return getToken(KernelDistSQLStatementParser.RP_, 0); }
		public SimpleSourceContext simpleSource() {
			return getRuleContext(SimpleSourceContext.class,0);
		}
		public UrlSourceContext urlSource() {
			return getRuleContext(UrlSourceContext.class,0);
		}
		public TerminalNode PASSWORD() { return getToken(KernelDistSQLStatementParser.PASSWORD, 0); }
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public StorageUnitDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageUnitDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterStorageUnitDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitStorageUnitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitStorageUnitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageUnitDefinitionContext storageUnitDefinition() throws RecognitionException {
		StorageUnitDefinitionContext _localctx = new StorageUnitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_storageUnitDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			storageUnitName();
			setState(522);
			match(LP_);
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HOST:
				{
				setState(523);
				simpleSource();
				}
				break;
			case URL:
				{
				setState(524);
				urlSource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(527);
			match(COMMA_);
			setState(528);
			match(USER);
			setState(529);
			match(EQ_);
			setState(530);
			user();
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(531);
				match(COMMA_);
				setState(532);
				match(PASSWORD);
				setState(533);
				match(EQ_);
				setState(534);
				password();
				}
				break;
			}
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(537);
				match(COMMA_);
				setState(538);
				propertiesDefinition();
				}
			}

			setState(541);
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
	public static class SimpleSourceContext extends ParserRuleContext {
		public TerminalNode HOST() { return getToken(KernelDistSQLStatementParser.HOST, 0); }
		public List<TerminalNode> EQ_() { return getTokens(KernelDistSQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(KernelDistSQLStatementParser.EQ_, i);
		}
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(KernelDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(KernelDistSQLStatementParser.COMMA_, i);
		}
		public TerminalNode PORT() { return getToken(KernelDistSQLStatementParser.PORT, 0); }
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public TerminalNode DB() { return getToken(KernelDistSQLStatementParser.DB, 0); }
		public DbNameContext dbName() {
			return getRuleContext(DbNameContext.class,0);
		}
		public SimpleSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterSimpleSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitSimpleSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitSimpleSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSourceContext simpleSource() throws RecognitionException {
		SimpleSourceContext _localctx = new SimpleSourceContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_simpleSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(HOST);
			setState(544);
			match(EQ_);
			setState(545);
			hostname();
			setState(546);
			match(COMMA_);
			setState(547);
			match(PORT);
			setState(548);
			match(EQ_);
			setState(549);
			port();
			setState(550);
			match(COMMA_);
			setState(551);
			match(DB);
			setState(552);
			match(EQ_);
			setState(553);
			dbName();
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
	public static class UrlSourceContext extends ParserRuleContext {
		public TerminalNode URL() { return getToken(KernelDistSQLStatementParser.URL, 0); }
		public TerminalNode EQ_() { return getToken(KernelDistSQLStatementParser.EQ_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public UrlSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterUrlSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitUrlSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitUrlSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlSourceContext urlSource() throws RecognitionException {
		UrlSourceContext _localctx = new UrlSourceContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_urlSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(URL);
			setState(556);
			match(EQ_);
			setState(557);
			url();
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
	public static class HostnameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterHostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitHostname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitHostname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_hostname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
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
	public static class PortContext extends ParserRuleContext {
		public TerminalNode INT_() { return getToken(KernelDistSQLStatementParser.INT_, 0); }
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitPort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
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
	public static class DbNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public DbNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterDbName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitDbName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitDbName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbNameContext dbName() throws RecognitionException {
		DbNameContext _localctx = new DbNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_dbName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
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
	public static class UserContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
	public static class PasswordContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(KernelDistSQLStatementParser.STRING_, 0); }
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
	public static class IgnoreTablesContext extends ParserRuleContext {
		public IgnoreTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoreTables; }
	 
		public IgnoreTablesContext() { }
		public void copyFrom(IgnoreTablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgnoreBroadcastTablesContext extends IgnoreTablesContext {
		public TerminalNode IGNORE() { return getToken(KernelDistSQLStatementParser.IGNORE, 0); }
		public TerminalNode BROADCAST() { return getToken(KernelDistSQLStatementParser.BROADCAST, 0); }
		public TerminalNode TABLES() { return getToken(KernelDistSQLStatementParser.TABLES, 0); }
		public IgnoreBroadcastTablesContext(IgnoreTablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterIgnoreBroadcastTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitIgnoreBroadcastTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitIgnoreBroadcastTables(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgnoreSingleAndBroadcastTablesContext extends IgnoreTablesContext {
		public TerminalNode IGNORE() { return getToken(KernelDistSQLStatementParser.IGNORE, 0); }
		public TerminalNode TABLES() { return getToken(KernelDistSQLStatementParser.TABLES, 0); }
		public TerminalNode SINGLE() { return getToken(KernelDistSQLStatementParser.SINGLE, 0); }
		public TerminalNode COMMA_() { return getToken(KernelDistSQLStatementParser.COMMA_, 0); }
		public TerminalNode BROADCAST() { return getToken(KernelDistSQLStatementParser.BROADCAST, 0); }
		public IgnoreSingleAndBroadcastTablesContext(IgnoreTablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterIgnoreSingleAndBroadcastTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitIgnoreSingleAndBroadcastTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitIgnoreSingleAndBroadcastTables(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgnoreSingleTablesContext extends IgnoreTablesContext {
		public TerminalNode IGNORE() { return getToken(KernelDistSQLStatementParser.IGNORE, 0); }
		public TerminalNode SINGLE() { return getToken(KernelDistSQLStatementParser.SINGLE, 0); }
		public TerminalNode TABLES() { return getToken(KernelDistSQLStatementParser.TABLES, 0); }
		public IgnoreSingleTablesContext(IgnoreTablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterIgnoreSingleTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitIgnoreSingleTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitIgnoreSingleTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoreTablesContext ignoreTables() throws RecognitionException {
		IgnoreTablesContext _localctx = new IgnoreTablesContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_ignoreTables);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new IgnoreSingleAndBroadcastTablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(IGNORE);
				setState(578);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE:
					{
					setState(572);
					match(SINGLE);
					setState(573);
					match(COMMA_);
					setState(574);
					match(BROADCAST);
					}
					break;
				case BROADCAST:
					{
					setState(575);
					match(BROADCAST);
					setState(576);
					match(COMMA_);
					setState(577);
					match(SINGLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(580);
				match(TABLES);
				}
				break;
			case 2:
				_localctx = new IgnoreSingleTablesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(IGNORE);
				setState(582);
				match(SINGLE);
				setState(583);
				match(TABLES);
				}
				break;
			case 3:
				_localctx = new IgnoreBroadcastTablesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(IGNORE);
				setState(585);
				match(BROADCAST);
				setState(586);
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
	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KernelDistSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(KernelDistSQLStatementParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(IF);
			setState(590);
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
		public TerminalNode IF() { return getToken(KernelDistSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KernelDistSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KernelDistSQLStatementParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(IF);
			setState(593);
			match(NOT);
			setState(594);
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
	public static class CheckPrivilegesContext extends ParserRuleContext {
		public TerminalNode CHECK_PRIVILEGES() { return getToken(KernelDistSQLStatementParser.CHECK_PRIVILEGES, 0); }
		public TerminalNode EQ_() { return getToken(KernelDistSQLStatementParser.EQ_, 0); }
		public List<PrivilegeTypeContext> privilegeType() {
			return getRuleContexts(PrivilegeTypeContext.class);
		}
		public PrivilegeTypeContext privilegeType(int i) {
			return getRuleContext(PrivilegeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(KernelDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(KernelDistSQLStatementParser.COMMA_, i);
		}
		public CheckPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkPrivileges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterCheckPrivileges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitCheckPrivileges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitCheckPrivileges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckPrivilegesContext checkPrivileges() throws RecognitionException {
		CheckPrivilegesContext _localctx = new CheckPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_checkPrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(CHECK_PRIVILEGES);
			setState(597);
			match(EQ_);
			setState(598);
			privilegeType();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(599);
				match(COMMA_);
				setState(600);
				privilegeType();
				}
				}
				setState(605);
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
	public static class PrivilegeTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(KernelDistSQLStatementParser.IDENTIFIER_, 0); }
		public PrivilegeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterPrivilegeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitPrivilegeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitPrivilegeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeTypeContext privilegeType() throws RecognitionException {
		PrivilegeTypeContext _localctx = new PrivilegeTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_privilegeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
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
	public static class ShowStorageUnitsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode STORAGE() { return getToken(KernelDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode UNITS() { return getToken(KernelDistSQLStatementParser.UNITS, 0); }
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowLikeContext showLike() {
			return getRuleContext(ShowLikeContext.class,0);
		}
		public ShowStorageUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStorageUnits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowStorageUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowStorageUnits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowStorageUnits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStorageUnitsContext showStorageUnits() throws RecognitionException {
		ShowStorageUnitsContext _localctx = new ShowStorageUnitsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_showStorageUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(SHOW);
			setState(609);
			match(STORAGE);
			setState(610);
			match(UNITS);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(611);
				match(FROM);
				setState(612);
				databaseName();
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(615);
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
	public static class ShowRulesUsedStorageUnitContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode RULES() { return getToken(KernelDistSQLStatementParser.RULES, 0); }
		public TerminalNode USED() { return getToken(KernelDistSQLStatementParser.USED, 0); }
		public TerminalNode STORAGE() { return getToken(KernelDistSQLStatementParser.STORAGE, 0); }
		public TerminalNode UNIT() { return getToken(KernelDistSQLStatementParser.UNIT, 0); }
		public StorageUnitNameContext storageUnitName() {
			return getRuleContext(StorageUnitNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowRulesUsedStorageUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showRulesUsedStorageUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowRulesUsedStorageUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowRulesUsedStorageUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowRulesUsedStorageUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowRulesUsedStorageUnitContext showRulesUsedStorageUnit() throws RecognitionException {
		ShowRulesUsedStorageUnitContext _localctx = new ShowRulesUsedStorageUnitContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_showRulesUsedStorageUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(SHOW);
			setState(619);
			match(RULES);
			setState(620);
			match(USED);
			setState(621);
			match(STORAGE);
			setState(622);
			match(UNIT);
			setState(623);
			storageUnitName();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(624);
				match(FROM);
				setState(625);
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
	public static class ShowLogicalTablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KernelDistSQLStatementParser.SHOW, 0); }
		public TerminalNode LOGICAL() { return getToken(KernelDistSQLStatementParser.LOGICAL, 0); }
		public TerminalNode TABLES() { return getToken(KernelDistSQLStatementParser.TABLES, 0); }
		public TerminalNode FULL() { return getToken(KernelDistSQLStatementParser.FULL, 0); }
		public TerminalNode FROM() { return getToken(KernelDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowLikeContext showLike() {
			return getRuleContext(ShowLikeContext.class,0);
		}
		public ShowLogicalTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showLogicalTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).enterShowLogicalTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KernelDistSQLStatementListener ) ((KernelDistSQLStatementListener)listener).exitShowLogicalTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KernelDistSQLStatementVisitor ) return ((KernelDistSQLStatementVisitor<? extends T>)visitor).visitShowLogicalTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowLogicalTablesContext showLogicalTables() throws RecognitionException {
		ShowLogicalTablesContext _localctx = new ShowLogicalTablesContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_showLogicalTables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(SHOW);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FULL) {
				{
				setState(629);
				match(FULL);
				}
			}

			setState(632);
			match(LOGICAL);
			setState(633);
			match(TABLES);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(634);
				match(FROM);
				setState(635);
				databaseName();
				}
			}

			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(638);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0080\u0282\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00b2"+
		"\b\u0000\u0001\u0000\u0003\u0000\u00b5\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00cc\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u00e6\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00ec\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f2"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00fa\b\n"+
		"\n\n\f\n\u00fd\t\n\u0003\n\u00ff\b\n\u0001\n\u0001\n\u0003\n\u0103\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u0117\b\r\n\r\f\r\u011a\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0124\b\u000e\n\u000e\f\u000e\u0127\t\u000e\u0003\u000e"+
		"\u0129\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0130\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0135\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0143\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u014b\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0152\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0157\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u0184\b\u001e\n\u001e\f\u001e\u0187\t\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0003!\u018e\b!\u0001!\u0003!\u0191\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0199\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0003(\u01ab\b(\u0001(\u0001(\u0001(\u0003"+
		"(\u01b0\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01b9"+
		"\b)\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0003+\u01c2\b+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0005,\u01c9\b,\n,\f,\u01cc\t,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00014\u00034\u01e2"+
		"\b4\u00014\u00014\u00014\u00034\u01e7\b4\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u01ef\b5\u00016\u00016\u00016\u00016\u00036\u01f5\b6\u0001"+
		"6\u00016\u00016\u00056\u01fa\b6\n6\f6\u01fd\t6\u00016\u00036\u0200\b6"+
		"\u00017\u00017\u00017\u00057\u0205\b7\n7\f7\u0208\t7\u00018\u00018\u0001"+
		"8\u00018\u00038\u020e\b8\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00038\u0218\b8\u00018\u00018\u00038\u021c\b8\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001"+
		"=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0003A\u0243\bA\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u024c\bA\u0001B\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0005D\u025a\bD\nD"+
		"\fD\u025d\tD\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u0266"+
		"\bF\u0001F\u0003F\u0269\bF\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u0273\bG\u0001H\u0001H\u0003H\u0277\bH\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u027d\bH\u0001H\u0003H\u0280\bH\u0001H\u0000\u0000I\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0000\u0002\u0001\u0000UV\u0001\u0000"+
		"~\u007f\u0286\u0000\u00b1\u0001\u0000\u0000\u0000\u0002\u00b8\u0001\u0000"+
		"\u0000\u0000\u0004\u00bf\u0001\u0000\u0000\u0000\u0006\u00c7\u0001\u0000"+
		"\u0000\u0000\b\u00cd\u0001\u0000\u0000\u0000\n\u00d6\u0001\u0000\u0000"+
		"\u0000\f\u00db\u0001\u0000\u0000\u0000\u000e\u00e0\u0001\u0000\u0000\u0000"+
		"\u0010\u00e5\u0001\u0000\u0000\u0000\u0012\u00ed\u0001\u0000\u0000\u0000"+
		"\u0014\u00f3\u0001\u0000\u0000\u0000\u0016\u0104\u0001\u0000\u0000\u0000"+
		"\u0018\u0109\u0001\u0000\u0000\u0000\u001a\u010e\u0001\u0000\u0000\u0000"+
		"\u001c\u011b\u0001\u0000\u0000\u0000\u001e\u012a\u0001\u0000\u0000\u0000"+
		" \u0136\u0001\u0000\u0000\u0000\"\u013d\u0001\u0000\u0000\u0000$\u0144"+
		"\u0001\u0000\u0000\u0000&\u014c\u0001\u0000\u0000\u0000(\u0158\u0001\u0000"+
		"\u0000\u0000*\u015f\u0001\u0000\u0000\u0000,\u0164\u0001\u0000\u0000\u0000"+
		".\u0167\u0001\u0000\u0000\u00000\u016c\u0001\u0000\u0000\u00002\u0172"+
		"\u0001\u0000\u0000\u00004\u0178\u0001\u0000\u0000\u00006\u017a\u0001\u0000"+
		"\u0000\u00008\u017c\u0001\u0000\u0000\u0000:\u017e\u0001\u0000\u0000\u0000"+
		"<\u0180\u0001\u0000\u0000\u0000>\u0188\u0001\u0000\u0000\u0000@\u018a"+
		"\u0001\u0000\u0000\u0000B\u018d\u0001\u0000\u0000\u0000D\u0192\u0001\u0000"+
		"\u0000\u0000F\u019a\u0001\u0000\u0000\u0000H\u019f\u0001\u0000\u0000\u0000"+
		"J\u01a1\u0001\u0000\u0000\u0000L\u01a4\u0001\u0000\u0000\u0000N\u01a6"+
		"\u0001\u0000\u0000\u0000P\u01af\u0001\u0000\u0000\u0000R\u01b1\u0001\u0000"+
		"\u0000\u0000T\u01bc\u0001\u0000\u0000\u0000V\u01be\u0001\u0000\u0000\u0000"+
		"X\u01c5\u0001\u0000\u0000\u0000Z\u01cd\u0001\u0000\u0000\u0000\\\u01d1"+
		"\u0001\u0000\u0000\u0000^\u01d3\u0001\u0000\u0000\u0000`\u01d5\u0001\u0000"+
		"\u0000\u0000b\u01d7\u0001\u0000\u0000\u0000d\u01d9\u0001\u0000\u0000\u0000"+
		"f\u01db\u0001\u0000\u0000\u0000h\u01dd\u0001\u0000\u0000\u0000j\u01e8"+
		"\u0001\u0000\u0000\u0000l\u01f0\u0001\u0000\u0000\u0000n\u0201\u0001\u0000"+
		"\u0000\u0000p\u0209\u0001\u0000\u0000\u0000r\u021f\u0001\u0000\u0000\u0000"+
		"t\u022b\u0001\u0000\u0000\u0000v\u022f\u0001\u0000\u0000\u0000x\u0231"+
		"\u0001\u0000\u0000\u0000z\u0233\u0001\u0000\u0000\u0000|\u0235\u0001\u0000"+
		"\u0000\u0000~\u0237\u0001\u0000\u0000\u0000\u0080\u0239\u0001\u0000\u0000"+
		"\u0000\u0082\u024b\u0001\u0000\u0000\u0000\u0084\u024d\u0001\u0000\u0000"+
		"\u0000\u0086\u0250\u0001\u0000\u0000\u0000\u0088\u0254\u0001\u0000\u0000"+
		"\u0000\u008a\u025e\u0001\u0000\u0000\u0000\u008c\u0260\u0001\u0000\u0000"+
		"\u0000\u008e\u026a\u0001\u0000\u0000\u0000\u0090\u0274\u0001\u0000\u0000"+
		"\u0000\u0092\u00b2\u0003h4\u0000\u0093\u00b2\u0003j5\u0000\u0094\u00b2"+
		"\u0003l6\u0000\u0095\u00b2\u0003\u008cF\u0000\u0096\u00b2\u0003\u008e"+
		"G\u0000\u0097\u00b2\u0003\u0002\u0001\u0000\u0098\u00b2\u0003\u0004\u0002"+
		"\u0000\u0099\u00b2\u0003\u0006\u0003\u0000\u009a\u00b2\u0003\n\u0005\u0000"+
		"\u009b\u00b2\u0003\f\u0006\u0000\u009c\u00b2\u0003\u000e\u0007\u0000\u009d"+
		"\u00b2\u0003\u0016\u000b\u0000\u009e\u00b2\u0003\u0018\f\u0000\u009f\u00b2"+
		"\u0003\u001a\r\u0000\u00a0\u00b2\u0003\u001c\u000e\u0000\u00a1\u00b2\u0003"+
		"\b\u0004\u0000\u00a2\u00b2\u0003\u0090H\u0000\u00a3\u00b2\u0003\u0010"+
		"\b\u0000\u00a4\u00b2\u0003\u0012\t\u0000\u00a5\u00b2\u0003\u0014\n\u0000"+
		"\u00a6\u00b2\u0003\u001e\u000f\u0000\u00a7\u00b2\u0003 \u0010\u0000\u00a8"+
		"\u00b2\u0003\"\u0011\u0000\u00a9\u00b2\u0003$\u0012\u0000\u00aa\u00b2"+
		"\u0003&\u0013\u0000\u00ab\u00b2\u0003(\u0014\u0000\u00ac\u00b2\u0003*"+
		"\u0015\u0000\u00ad\u00b2\u0003,\u0016\u0000\u00ae\u00b2\u0003.\u0017\u0000"+
		"\u00af\u00b2\u00030\u0018\u0000\u00b0\u00b2\u00032\u0019\u0000\u00b1\u0092"+
		"\u0001\u0000\u0000\u0000\u00b1\u0093\u0001\u0000\u0000\u0000\u00b1\u0094"+
		"\u0001\u0000\u0000\u0000\u00b1\u0095\u0001\u0000\u0000\u0000\u00b1\u0096"+
		"\u0001\u0000\u0000\u0000\u00b1\u0097\u0001\u0000\u0000\u0000\u00b1\u0098"+
		"\u0001\u0000\u0000\u0000\u00b1\u0099\u0001\u0000\u0000\u0000\u00b1\u009a"+
		"\u0001\u0000\u0000\u0000\u00b1\u009b\u0001\u0000\u0000\u0000\u00b1\u009c"+
		"\u0001\u0000\u0000\u0000\u00b1\u009d\u0001\u0000\u0000\u0000\u00b1\u009e"+
		"\u0001\u0000\u0000\u0000\u00b1\u009f\u0001\u0000\u0000\u0000\u00b1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a1\u0001\u0000\u0000\u0000\u00b1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a3\u0001\u0000\u0000\u0000\u00b1\u00a4"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a5\u0001\u0000\u0000\u0000\u00b1\u00a6"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a7\u0001\u0000\u0000\u0000\u00b1\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a9\u0001\u0000\u0000\u0000\u00b1\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b5"+
		"\u0005(\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"\u0000\u0000\u0001\u00b7\u0001\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"2\u0000\u0000\u00b9\u00ba\u0005d\u0000\u0000\u00ba\u00bb\u0005?\u0000"+
		"\u0000\u00bb\u00bc\u0003:\u001d\u0000\u00bc\u00bd\u0005\u0015\u0000\u0000"+
		"\u00bd\u00be\u0003>\u001f\u0000\u00be\u0003\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u00053\u0000\u0000\u00c0\u00c1\u0005d\u0000\u0000\u00c1\u00c2\u0005"+
		"?\u0000\u0000\u00c2\u00c3\u0005e\u0000\u0000\u00c3\u00c4\u0005=\u0000"+
		"\u0000\u00c4\u00c5\u0005\u0015\u0000\u0000\u00c5\u00c6\u0003:\u001d\u0000"+
		"\u00c6\u0005\u0001\u0000\u0000\u0000\u00c7\u00c8\u00053\u0000\u0000\u00c8"+
		"\u00c9\u0005d\u0000\u0000\u00c9\u00cb\u0005@\u0000\u0000\u00ca\u00cc\u0003"+
		"J%\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u0007\u0001\u0000\u0000\u0000\u00cd\u00ce\u00050\u0000\u0000"+
		"\u00ce\u00cf\u0005f\u0000\u0000\u00cf\u00d0\u0005g\u0000\u0000\u00d0\u00d1"+
		"\u0003@ \u0000\u00d1\u00d2\u00052\u0000\u0000\u00d2\u00d3\u0003:\u001d"+
		"\u0000\u00d3\u00d4\u0005\u0015\u0000\u0000\u00d4\u00d5\u0003<\u001e\u0000"+
		"\u00d5\t\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005A\u0000\u0000\u00d7"+
		"\u00d8\u0005f\u0000\u0000\u00d8\u00d9\u0005g\u0000\u0000\u00d9\u00da\u0003"+
		"@ \u0000\u00da\u000b\u0001\u0000\u0000\u0000\u00db\u00dc\u0005B\u0000"+
		"\u0000\u00dc\u00dd\u0005f\u0000\u0000\u00dd\u00de\u0005g\u0000\u0000\u00de"+
		"\u00df\u0003@ \u0000\u00df\r\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005"+
		"3\u0000\u0000\u00e1\u00e2\u0005f\u0000\u0000\u00e2\u00e3\u0005h\u0000"+
		"\u0000\u00e3\u000f\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005{\u0000\u0000"+
		"\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005M\u0000\u0000\u00e8"+
		"\u00e9\u0005E\u0000\u0000\u00e9\u00eb\u0005N\u0000\u0000\u00ea\u00ec\u0003"+
		"\\.\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u0011\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005M\u0000"+
		"\u0000\u00ee\u00ef\u0005K\u0000\u0000\u00ef\u00f1\u0005N\u0000\u0000\u00f0"+
		"\u00f2\u0003B!\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u0013\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"3\u0000\u0000\u00f4\u00f5\u0005K\u0000\u0000\u00f5\u00f6\u0005N\u0000"+
		"\u0000\u00f6\u00fe\u0003`0\u0000\u00f7\u00fb\u0005\"\u0000\u0000\u00f8"+
		"\u00fa\u0003`0\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u00f7\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"5\u0000\u0000\u0101\u0103\u0003\\.\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0015\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u00053\u0000\u0000\u0105\u0106\u0005f\u0000\u0000\u0106"+
		"\u0107\u0005g\u0000\u0000\u0107\u0108\u0005`\u0000\u0000\u0108\u0017\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u00053\u0000\u0000\u010a\u010b\u0005f\u0000"+
		"\u0000\u010b\u010c\u0005g\u0000\u0000\u010c\u010d\u0005T\u0000\u0000\u010d"+
		"\u0019\u0001\u0000\u0000\u0000\u010e\u010f\u0007\u0000\u0000\u0000\u010f"+
		"\u0110\u0005f\u0000\u0000\u0110\u0111\u0005g\u0000\u0000\u0111\u0112\u0003"+
		"@ \u0000\u0112\u0113\u0005_\u0000\u0000\u0113\u0118\u0003H$\u0000\u0114"+
		"\u0115\u0005\"\u0000\u0000\u0115\u0117\u0003H$\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u001b\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"W\u0000\u0000\u011c\u011d\u0005f\u0000\u0000\u011d\u011e\u0005g\u0000"+
		"\u0000\u011e\u0128\u0003@ \u0000\u011f\u0120\u0005_\u0000\u0000\u0120"+
		"\u0125\u0003H$\u0000\u0121\u0122\u0005\"\u0000\u0000\u0122\u0124\u0003"+
		"H$\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0128\u011f\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\u001d\u0001\u0000\u0000\u0000\u012a\u012b\u0005X\u0000\u0000"+
		"\u012b\u012c\u0005E\u0000\u0000\u012c\u012f\u0005\\\u0000\u0000\u012d"+
		"\u012e\u00055\u0000\u0000\u012e\u0130\u0003\\.\u0000\u012f\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0134\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u00056\u0000\u0000\u0132\u0133\u0005]\u0000"+
		"\u0000\u0133\u0135\u00036\u001b\u0000\u0134\u0131\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u001f\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005Y\u0000\u0000\u0137\u0138\u0005E\u0000\u0000\u0138\u0139"+
		"\u0005\\\u0000\u0000\u0139\u013a\u00055\u0000\u0000\u013a\u013b\u0005"+
		"]\u0000\u0000\u013b\u013c\u00036\u001b\u0000\u013c!\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0005X\u0000\u0000\u013e\u0142\u0005N\u0000\u0000\u013f"+
		"\u0140\u00056\u0000\u0000\u0140\u0141\u0005]\u0000\u0000\u0141\u0143\u0003"+
		"6\u001b\u0000\u0142\u013f\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143#\u0001\u0000\u0000\u0000\u0144\u0145\u0005Y\u0000\u0000"+
		"\u0145\u014a\u0005N\u0000\u0000\u0146\u014b\u00038\u001c\u0000\u0147\u0148"+
		"\u00055\u0000\u0000\u0148\u0149\u0005]\u0000\u0000\u0149\u014b\u00036"+
		"\u001b\u0000\u014a\u0146\u0001\u0000\u0000\u0000\u014a\u0147\u0001\u0000"+
		"\u0000\u0000\u014b%\u0001\u0000\u0000\u0000\u014c\u014d\u0005X\u0000\u0000"+
		"\u014d\u014e\u0005a\u0000\u0000\u014e\u0151\u0005h\u0000\u0000\u014f\u0150"+
		"\u00055\u0000\u0000\u0150\u0152\u0003\\.\u0000\u0151\u014f\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0156\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u00056\u0000\u0000\u0154\u0155\u0005]\u0000\u0000"+
		"\u0155\u0157\u00036\u001b\u0000\u0156\u0153\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\'\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0005Z\u0000\u0000\u0159\u015a\u0005[\u0000\u0000\u015a\u015b\u0005\\"+
		"\u0000\u0000\u015b\u015c\u00055\u0000\u0000\u015c\u015d\u0005]\u0000\u0000"+
		"\u015d\u015e\u00036\u001b\u0000\u015e)\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0005o\u0000\u0000\u0160\u0161\u0005q\u0000\u0000\u0161\u0162\u0005_"+
		"\u0000\u0000\u0162\u0163\u0003F#\u0000\u0163+\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0005p\u0000\u0000\u0165\u0166\u0005q\u0000\u0000\u0166-"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u00053\u0000\u0000\u0168\u0169\u0005"+
		"t\u0000\u0000\u0169\u016a\u0005u\u0000\u0000\u016a\u016b\u0003N\'\u0000"+
		"\u016b/\u0001\u0000\u0000\u0000\u016c\u016d\u00053\u0000\u0000\u016d\u016e"+
		"\u0005v\u0000\u0000\u016e\u016f\u0005w\u0000\u0000\u016f\u0170\u0005z"+
		"\u0000\u0000\u0170\u0171\u0005t\u0000\u0000\u01711\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u00053\u0000\u0000\u0173\u0174\u0005x\u0000\u0000\u0174\u0175"+
		"\u0005y\u0000\u0000\u0175\u0176\u0005z\u0000\u0000\u0176\u0177\u0005t"+
		"\u0000\u0000\u01773\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u007f\u0000"+
		"\u0000\u01795\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u007f\u0000\u0000"+
		"\u017b7\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u007f\u0000\u0000\u017d"+
		"9\u0001\u0000\u0000\u0000\u017e\u017f\u0007\u0001\u0000\u0000\u017f;\u0001"+
		"\u0000\u0000\u0000\u0180\u0185\u0003>\u001f\u0000\u0181\u0182\u0005\""+
		"\u0000\u0000\u0182\u0184\u0003>\u001f\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186=\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0003P(\u0000\u0189?"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0007\u0001\u0000\u0000\u018bA\u0001"+
		"\u0000\u0000\u0000\u018c\u018e\u0003`0\u0000\u018d\u018c\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0003D\"\u0000\u0190\u018f\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0001\u0000\u0000\u0000\u0191C\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u00055\u0000\u0000\u0193\u0194\u0005a\u0000\u0000\u0194\u0195\u0005"+
		"b\u0000\u0000\u0195\u0198\u0003d2\u0000\u0196\u0197\u0005D\u0000\u0000"+
		"\u0197\u0199\u0003^/\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199E\u0001\u0000\u0000\u0000\u019a\u019b\u0005"+
		"r\u0000\u0000\u019b\u019c\u0005\u001c\u0000\u0000\u019c\u019d\u0003R)"+
		"\u0000\u019d\u019e\u0005\u001d\u0000\u0000\u019eG\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0005~\u0000\u0000\u01a0I\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0005m\u0000\u0000\u01a2\u01a3\u0003L&\u0000\u01a3K\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0005\u007f\u0000\u0000\u01a5M\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0005\u007f\u0000\u0000\u01a7O\u0001\u0000\u0000\u0000\u01a8"+
		"\u01b0\u0005\u007f\u0000\u0000\u01a9\u01ab\u0005\r\u0000\u0000\u01aa\u01a9"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01b0\u0005\u0080\u0000\u0000\u01ad\u01b0"+
		"\u0005O\u0000\u0000\u01ae\u01b0\u0005P\u0000\u0000\u01af\u01a8\u0001\u0000"+
		"\u0000\u0000\u01af\u01aa\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0Q\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005S\u0000\u0000\u01b2\u01b3\u0005\u001c\u0000\u0000"+
		"\u01b3\u01b4\u0005=\u0000\u0000\u01b4\u01b5\u0005\u0015\u0000\u0000\u01b5"+
		"\u01b8\u0003T*\u0000\u01b6\u01b7\u0005\"\u0000\u0000\u01b7\u01b9\u0003"+
		"V+\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u001d\u0000"+
		"\u0000\u01bbS\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\u007f\u0000\u0000"+
		"\u01bdU\u0001\u0000\u0000\u0000\u01be\u01bf\u0005>\u0000\u0000\u01bf\u01c1"+
		"\u0005\u001c\u0000\u0000\u01c0\u01c2\u0003X,\u0000\u01c1\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0005\u001d\u0000\u0000\u01c4W\u0001\u0000\u0000"+
		"\u0000\u01c5\u01ca\u0003Z-\u0000\u01c6\u01c7\u0005\"\u0000\u0000\u01c7"+
		"\u01c9\u0003Z-\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cbY\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0005\u007f\u0000\u0000\u01ce\u01cf\u0005\u0015"+
		"\u0000\u0000\u01cf\u01d0\u0003P(\u0000\u01d0[\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0005~\u0000\u0000\u01d2]\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0005~\u0000\u0000\u01d4_\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005~"+
		"\u0000\u0000\u01d6a\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005~\u0000\u0000"+
		"\u01d8c\u0001\u0000\u0000\u0000\u01d9\u01da\u0005~\u0000\u0000\u01dae"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u007f\u0000\u0000\u01dcg\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0005i\u0000\u0000\u01de\u01df\u0005a\u0000"+
		"\u0000\u01df\u01e1\u0005b\u0000\u0000\u01e0\u01e2\u0003\u0086C\u0000\u01e1"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e6\u0003n7\u0000\u01e4\u01e5\u0005"+
		"\"\u0000\u0000\u01e5\u01e7\u0003\u0088D\u0000\u01e6\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7i\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e9\u00050\u0000\u0000\u01e9\u01ea\u0005a\u0000\u0000\u01ea"+
		"\u01eb\u0005b\u0000\u0000\u01eb\u01ee\u0003n7\u0000\u01ec\u01ed\u0005"+
		"\"\u0000\u0000\u01ed\u01ef\u0003\u0088D\u0000\u01ee\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01efk\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0005j\u0000\u0000\u01f1\u01f2\u0005a\u0000\u0000\u01f2"+
		"\u01f4\u0005b\u0000\u0000\u01f3\u01f5\u0003\u0084B\u0000\u01f4\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f6\u01fb\u0003d2\u0000\u01f7\u01f8\u0005\"\u0000"+
		"\u0000\u01f8\u01fa\u0003d2\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fe\u0200\u0003\u0082A\u0000\u01ff\u01fe"+
		"\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200m\u0001"+
		"\u0000\u0000\u0000\u0201\u0206\u0003p8\u0000\u0202\u0203\u0005\"\u0000"+
		"\u0000\u0203\u0205\u0003p8\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205"+
		"\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206"+
		"\u0207\u0001\u0000\u0000\u0000\u0207o\u0001\u0000\u0000\u0000\u0208\u0206"+
		"\u0001\u0000\u0000\u0000\u0209\u020a\u0003d2\u0000\u020a\u020d\u0005\u001c"+
		"\u0000\u0000\u020b\u020e\u0003r9\u0000\u020c\u020e\u0003t:\u0000\u020d"+
		"\u020b\u0001\u0000\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0005\"\u0000\u0000\u0210\u0211"+
		"\u0005;\u0000\u0000\u0211\u0212\u0005\u0015\u0000\u0000\u0212\u0217\u0003"+
		"~?\u0000\u0213\u0214\u0005\"\u0000\u0000\u0214\u0215\u0005<\u0000\u0000"+
		"\u0215\u0216\u0005\u0015\u0000\u0000\u0216\u0218\u0003\u0080@\u0000\u0217"+
		"\u0213\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218"+
		"\u021b\u0001\u0000\u0000\u0000\u0219\u021a\u0005\"\u0000\u0000\u021a\u021c"+
		"\u0003V+\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0005\u001d"+
		"\u0000\u0000\u021eq\u0001\u0000\u0000\u0000\u021f\u0220\u00058\u0000\u0000"+
		"\u0220\u0221\u0005\u0015\u0000\u0000\u0221\u0222\u0003v;\u0000\u0222\u0223"+
		"\u0005\"\u0000\u0000\u0223\u0224\u00059\u0000\u0000\u0224\u0225\u0005"+
		"\u0015\u0000\u0000\u0225\u0226\u0003x<\u0000\u0226\u0227\u0005\"\u0000"+
		"\u0000\u0227\u0228\u0005:\u0000\u0000\u0228\u0229\u0005\u0015\u0000\u0000"+
		"\u0229\u022a\u0003z=\u0000\u022as\u0001\u0000\u0000\u0000\u022b\u022c"+
		"\u00057\u0000\u0000\u022c\u022d\u0005\u0015\u0000\u0000\u022d\u022e\u0003"+
		"|>\u0000\u022eu\u0001\u0000\u0000\u0000\u022f\u0230\u0005\u007f\u0000"+
		"\u0000\u0230w\u0001\u0000\u0000\u0000\u0231\u0232\u0005\u0080\u0000\u0000"+
		"\u0232y\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u007f\u0000\u0000\u0234"+
		"{\u0001\u0000\u0000\u0000\u0235\u0236\u0005\u007f\u0000\u0000\u0236}\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0005\u007f\u0000\u0000\u0238\u007f\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0005\u007f\u0000\u0000\u023a\u0081\u0001"+
		"\u0000\u0000\u0000\u023b\u0242\u0005C\u0000\u0000\u023c\u023d\u0005H\u0000"+
		"\u0000\u023d\u023e\u0005\"\u0000\u0000\u023e\u0243\u0005s\u0000\u0000"+
		"\u023f\u0240\u0005s\u0000\u0000\u0240\u0241\u0005\"\u0000\u0000\u0241"+
		"\u0243\u0005H\u0000\u0000\u0242\u023c\u0001\u0000\u0000\u0000\u0242\u023f"+
		"\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u024c"+
		"\u0005I\u0000\u0000\u0245\u0246\u0005C\u0000\u0000\u0246\u0247\u0005H"+
		"\u0000\u0000\u0247\u024c\u0005I\u0000\u0000\u0248\u0249\u0005C\u0000\u0000"+
		"\u0249\u024a\u0005s\u0000\u0000\u024a\u024c\u0005I\u0000\u0000\u024b\u023b"+
		"\u0001\u0000\u0000\u0000\u024b\u0245\u0001\u0000\u0000\u0000\u024b\u0248"+
		"\u0001\u0000\u0000\u0000\u024c\u0083\u0001\u0000\u0000\u0000\u024d\u024e"+
		"\u0005Q\u0000\u0000\u024e\u024f\u0005R\u0000\u0000\u024f\u0085\u0001\u0000"+
		"\u0000\u0000\u0250\u0251\u0005Q\u0000\u0000\u0251\u0252\u0005n\u0000\u0000"+
		"\u0252\u0253\u0005R\u0000\u0000\u0253\u0087\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0005|\u0000\u0000\u0255\u0256\u0005\u0015\u0000\u0000\u0256\u025b"+
		"\u0003\u008aE\u0000\u0257\u0258\u0005\"\u0000\u0000\u0258\u025a\u0003"+
		"\u008aE\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000"+
		"\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000"+
		"\u0000\u0000\u025c\u0089\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0005~\u0000\u0000\u025f\u008b\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u00053\u0000\u0000\u0261\u0262\u0005a\u0000\u0000\u0262"+
		"\u0265\u0005c\u0000\u0000\u0263\u0264\u00055\u0000\u0000\u0264\u0266\u0003"+
		"\\.\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000"+
		"\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0269\u0003J%\u0000"+
		"\u0268\u0267\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000"+
		"\u0269\u008d\u0001\u0000\u0000\u0000\u026a\u026b\u00053\u0000\u0000\u026b"+
		"\u026c\u0005L\u0000\u0000\u026c\u026d\u0005^\u0000\u0000\u026d\u026e\u0005"+
		"a\u0000\u0000\u026e\u026f\u0005b\u0000\u0000\u026f\u0272\u0003d2\u0000"+
		"\u0270\u0271\u00055\u0000\u0000\u0271\u0273\u0003\\.\u0000\u0272\u0270"+
		"\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u008f"+
		"\u0001\u0000\u0000\u0000\u0274\u0276\u00053\u0000\u0000\u0275\u0277\u0005"+
		"F\u0000\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0005G\u0000"+
		"\u0000\u0279\u027c\u0005I\u0000\u0000\u027a\u027b\u00055\u0000\u0000\u027b"+
		"\u027d\u0003\\.\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0001\u0000\u0000\u0000\u027d\u027f\u0001\u0000\u0000\u0000\u027e\u0280"+
		"\u0003J%\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000"+
		"\u0000\u0000\u0280\u0091\u0001\u0000\u0000\u0000.\u00b1\u00b4\u00cb\u00e5"+
		"\u00eb\u00f1\u00fb\u00fe\u0102\u0118\u0125\u0128\u012f\u0134\u0142\u014a"+
		"\u0151\u0156\u0185\u018d\u0190\u0198\u01aa\u01af\u01b8\u01c1\u01ca\u01e1"+
		"\u01e6\u01ee\u01f4\u01fb\u01ff\u0206\u020d\u0217\u021b\u0242\u024b\u025b"+
		"\u0265\u0268\u0272\u0276\u027c\u027f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
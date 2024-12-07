// Generated from /Users/code/gitcode/shardingsphere/features/shadow/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/ShadowDistSQLStatement.g4 by ANTLR 4.13.2
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
public class ShadowDistSQLStatementParser extends Parser {
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
		WS=43, TRUE=44, FALSE=45, CREATE=46, ALTER=47, DROP=48, SHOW=49, SHADOW=50, 
		SOURCE=51, RULE=52, FROM=53, RESOURCES=54, TABLE=55, TYPE=56, NAME=57, 
		PROPERTIES=58, RULES=59, ALGORITHM=60, ALGORITHMS=61, SET=62, ADD=63, 
		DATABASE_VALUE=64, TABLE_VALUE=65, STATUS=66, CLEAR=67, DEFAULT=68, IF=69, 
		EXISTS=70, COUNT=71, VALUE_MATCH=72, REGEX_MATCH=73, SQL_HINT=74, NOT=75, 
		PLUGINS=76, FOR_GENERATOR=77, IDENTIFIER_=78, STRING_=79, INT_=80, HEX_=81, 
		NUMBER_=82, HEXDIGIT_=83, BITNUM_=84, BOOL_=85;
	public static final int
		RULE_execute = 0, RULE_createShadowRule = 1, RULE_alterShadowRule = 2, 
		RULE_dropShadowRule = 3, RULE_dropShadowAlgorithm = 4, RULE_createDefaultShadowAlgorithm = 5, 
		RULE_dropDefaultShadowAlgorithm = 6, RULE_alterDefaultShadowAlgorithm = 7, 
		RULE_shadowRuleDefinition = 8, RULE_shadowTableRule = 9, RULE_source = 10, 
		RULE_shadow = 11, RULE_tableName = 12, RULE_algorithmName = 13, RULE_ifExists = 14, 
		RULE_ifNotExists = 15, RULE_literal = 16, RULE_algorithmDefinition = 17, 
		RULE_algorithmTypeName = 18, RULE_buildInShadowAlgorithmType = 19, RULE_propertiesDefinition = 20, 
		RULE_properties = 21, RULE_property = 22, RULE_ruleName = 23, RULE_showShadowRules = 24, 
		RULE_showShadowTableRules = 25, RULE_showShadowAlgorithms = 26, RULE_showDefaultShadowAlgorithm = 27, 
		RULE_shadowRule = 28, RULE_countShadowRule = 29, RULE_tableRule = 30, 
		RULE_databaseName = 31, RULE_showShadowAlgorithmPlugins = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "createShadowRule", "alterShadowRule", "dropShadowRule", "dropShadowAlgorithm", 
			"createDefaultShadowAlgorithm", "dropDefaultShadowAlgorithm", "alterDefaultShadowAlgorithm", 
			"shadowRuleDefinition", "shadowTableRule", "source", "shadow", "tableName", 
			"algorithmName", "ifExists", "ifNotExists", "literal", "algorithmDefinition", 
			"algorithmTypeName", "buildInShadowAlgorithmType", "propertiesDefinition", 
			"properties", "property", "ruleName", "showShadowRules", "showShadowTableRules", 
			"showShadowAlgorithms", "showDefaultShadowAlgorithm", "shadowRule", "countShadowRule", 
			"tableRule", "databaseName", "showShadowAlgorithmPlugins"
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
			"BQ_", "QUESTION_", "AT_", "SEMI_", "JSONSEPARATOR_", "UL_", "WS", "TRUE", 
			"FALSE", "CREATE", "ALTER", "DROP", "SHOW", "SHADOW", "SOURCE", "RULE", 
			"FROM", "RESOURCES", "TABLE", "TYPE", "NAME", "PROPERTIES", "RULES", 
			"ALGORITHM", "ALGORITHMS", "SET", "ADD", "DATABASE_VALUE", "TABLE_VALUE", 
			"STATUS", "CLEAR", "DEFAULT", "IF", "EXISTS", "COUNT", "VALUE_MATCH", 
			"REGEX_MATCH", "SQL_HINT", "NOT", "PLUGINS", "FOR_GENERATOR", "IDENTIFIER_", 
			"STRING_", "INT_", "HEX_", "NUMBER_", "HEXDIGIT_", "BITNUM_", "BOOL_"
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
	public String getGrammarFileName() { return "ShadowDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShadowDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ShadowDistSQLStatementParser.EOF, 0); }
		public CreateShadowRuleContext createShadowRule() {
			return getRuleContext(CreateShadowRuleContext.class,0);
		}
		public AlterShadowRuleContext alterShadowRule() {
			return getRuleContext(AlterShadowRuleContext.class,0);
		}
		public DropShadowRuleContext dropShadowRule() {
			return getRuleContext(DropShadowRuleContext.class,0);
		}
		public ShowShadowRulesContext showShadowRules() {
			return getRuleContext(ShowShadowRulesContext.class,0);
		}
		public ShowShadowTableRulesContext showShadowTableRules() {
			return getRuleContext(ShowShadowTableRulesContext.class,0);
		}
		public ShowShadowAlgorithmsContext showShadowAlgorithms() {
			return getRuleContext(ShowShadowAlgorithmsContext.class,0);
		}
		public ShowDefaultShadowAlgorithmContext showDefaultShadowAlgorithm() {
			return getRuleContext(ShowDefaultShadowAlgorithmContext.class,0);
		}
		public DropShadowAlgorithmContext dropShadowAlgorithm() {
			return getRuleContext(DropShadowAlgorithmContext.class,0);
		}
		public DropDefaultShadowAlgorithmContext dropDefaultShadowAlgorithm() {
			return getRuleContext(DropDefaultShadowAlgorithmContext.class,0);
		}
		public CreateDefaultShadowAlgorithmContext createDefaultShadowAlgorithm() {
			return getRuleContext(CreateDefaultShadowAlgorithmContext.class,0);
		}
		public AlterDefaultShadowAlgorithmContext alterDefaultShadowAlgorithm() {
			return getRuleContext(AlterDefaultShadowAlgorithmContext.class,0);
		}
		public CountShadowRuleContext countShadowRule() {
			return getRuleContext(CountShadowRuleContext.class,0);
		}
		public ShowShadowAlgorithmPluginsContext showShadowAlgorithmPlugins() {
			return getRuleContext(ShowShadowAlgorithmPluginsContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(ShadowDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(66);
				createShadowRule();
				}
				break;
			case 2:
				{
				setState(67);
				alterShadowRule();
				}
				break;
			case 3:
				{
				setState(68);
				dropShadowRule();
				}
				break;
			case 4:
				{
				setState(69);
				showShadowRules();
				}
				break;
			case 5:
				{
				setState(70);
				showShadowTableRules();
				}
				break;
			case 6:
				{
				setState(71);
				showShadowAlgorithms();
				}
				break;
			case 7:
				{
				setState(72);
				showDefaultShadowAlgorithm();
				}
				break;
			case 8:
				{
				setState(73);
				dropShadowAlgorithm();
				}
				break;
			case 9:
				{
				setState(74);
				dropDefaultShadowAlgorithm();
				}
				break;
			case 10:
				{
				setState(75);
				createDefaultShadowAlgorithm();
				}
				break;
			case 11:
				{
				setState(76);
				alterDefaultShadowAlgorithm();
				}
				break;
			case 12:
				{
				setState(77);
				countShadowRule();
				}
				break;
			case 13:
				{
				setState(78);
				showShadowAlgorithmPlugins();
				}
				break;
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(81);
				match(SEMI_);
				}
			}

			setState(84);
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
	public static class CreateShadowRuleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ShadowDistSQLStatementParser.CREATE, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode RULE() { return getToken(ShadowDistSQLStatementParser.RULE, 0); }
		public List<ShadowRuleDefinitionContext> shadowRuleDefinition() {
			return getRuleContexts(ShadowRuleDefinitionContext.class);
		}
		public ShadowRuleDefinitionContext shadowRuleDefinition(int i) {
			return getRuleContext(ShadowRuleDefinitionContext.class,i);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShadowDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShadowDistSQLStatementParser.COMMA_, i);
		}
		public CreateShadowRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createShadowRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterCreateShadowRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitCreateShadowRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitCreateShadowRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateShadowRuleContext createShadowRule() throws RecognitionException {
		CreateShadowRuleContext _localctx = new CreateShadowRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createShadowRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(CREATE);
			setState(87);
			match(SHADOW);
			setState(88);
			match(RULE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(89);
				ifNotExists();
				}
			}

			setState(92);
			shadowRuleDefinition();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(93);
				match(COMMA_);
				setState(94);
				shadowRuleDefinition();
				}
				}
				setState(99);
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
	public static class AlterShadowRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ShadowDistSQLStatementParser.ALTER, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode RULE() { return getToken(ShadowDistSQLStatementParser.RULE, 0); }
		public List<ShadowRuleDefinitionContext> shadowRuleDefinition() {
			return getRuleContexts(ShadowRuleDefinitionContext.class);
		}
		public ShadowRuleDefinitionContext shadowRuleDefinition(int i) {
			return getRuleContext(ShadowRuleDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShadowDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShadowDistSQLStatementParser.COMMA_, i);
		}
		public AlterShadowRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterShadowRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterAlterShadowRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitAlterShadowRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitAlterShadowRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterShadowRuleContext alterShadowRule() throws RecognitionException {
		AlterShadowRuleContext _localctx = new AlterShadowRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterShadowRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ALTER);
			setState(101);
			match(SHADOW);
			setState(102);
			match(RULE);
			setState(103);
			shadowRuleDefinition();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(104);
				match(COMMA_);
				setState(105);
				shadowRuleDefinition();
				}
				}
				setState(110);
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
	public static class DropShadowRuleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ShadowDistSQLStatementParser.DROP, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode RULE() { return getToken(ShadowDistSQLStatementParser.RULE, 0); }
		public List<RuleNameContext> ruleName() {
			return getRuleContexts(RuleNameContext.class);
		}
		public RuleNameContext ruleName(int i) {
			return getRuleContext(RuleNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShadowDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShadowDistSQLStatementParser.COMMA_, i);
		}
		public DropShadowRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropShadowRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterDropShadowRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitDropShadowRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitDropShadowRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropShadowRuleContext dropShadowRule() throws RecognitionException {
		DropShadowRuleContext _localctx = new DropShadowRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropShadowRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(DROP);
			setState(112);
			match(SHADOW);
			setState(113);
			match(RULE);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(114);
				ifExists();
				}
			}

			setState(117);
			ruleName();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(118);
				match(COMMA_);
				setState(119);
				ruleName();
				}
				}
				setState(124);
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
	public static class DropShadowAlgorithmContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ShadowDistSQLStatementParser.DROP, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode ALGORITHM() { return getToken(ShadowDistSQLStatementParser.ALGORITHM, 0); }
		public List<AlgorithmNameContext> algorithmName() {
			return getRuleContexts(AlgorithmNameContext.class);
		}
		public AlgorithmNameContext algorithmName(int i) {
			return getRuleContext(AlgorithmNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShadowDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShadowDistSQLStatementParser.COMMA_, i);
		}
		public DropShadowAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropShadowAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterDropShadowAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitDropShadowAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitDropShadowAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropShadowAlgorithmContext dropShadowAlgorithm() throws RecognitionException {
		DropShadowAlgorithmContext _localctx = new DropShadowAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dropShadowAlgorithm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DROP);
			setState(126);
			match(SHADOW);
			setState(127);
			match(ALGORITHM);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(128);
				ifExists();
				}
			}

			setState(131);
			algorithmName();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(132);
				match(COMMA_);
				setState(133);
				algorithmName();
				}
				}
				setState(138);
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
	public static class CreateDefaultShadowAlgorithmContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ShadowDistSQLStatementParser.CREATE, 0); }
		public TerminalNode DEFAULT() { return getToken(ShadowDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode ALGORITHM() { return getToken(ShadowDistSQLStatementParser.ALGORITHM, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public CreateDefaultShadowAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefaultShadowAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterCreateDefaultShadowAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitCreateDefaultShadowAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitCreateDefaultShadowAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefaultShadowAlgorithmContext createDefaultShadowAlgorithm() throws RecognitionException {
		CreateDefaultShadowAlgorithmContext _localctx = new CreateDefaultShadowAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createDefaultShadowAlgorithm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CREATE);
			setState(140);
			match(DEFAULT);
			setState(141);
			match(SHADOW);
			setState(142);
			match(ALGORITHM);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(143);
				ifNotExists();
				}
			}

			setState(146);
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
	public static class DropDefaultShadowAlgorithmContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ShadowDistSQLStatementParser.DROP, 0); }
		public TerminalNode DEFAULT() { return getToken(ShadowDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode ALGORITHM() { return getToken(ShadowDistSQLStatementParser.ALGORITHM, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public DropDefaultShadowAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDefaultShadowAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterDropDefaultShadowAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitDropDefaultShadowAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitDropDefaultShadowAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDefaultShadowAlgorithmContext dropDefaultShadowAlgorithm() throws RecognitionException {
		DropDefaultShadowAlgorithmContext _localctx = new DropDefaultShadowAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dropDefaultShadowAlgorithm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(DROP);
			setState(149);
			match(DEFAULT);
			setState(150);
			match(SHADOW);
			setState(151);
			match(ALGORITHM);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(152);
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
	public static class AlterDefaultShadowAlgorithmContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ShadowDistSQLStatementParser.ALTER, 0); }
		public TerminalNode DEFAULT() { return getToken(ShadowDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode ALGORITHM() { return getToken(ShadowDistSQLStatementParser.ALGORITHM, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public AlterDefaultShadowAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefaultShadowAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterAlterDefaultShadowAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitAlterDefaultShadowAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitAlterDefaultShadowAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefaultShadowAlgorithmContext alterDefaultShadowAlgorithm() throws RecognitionException {
		AlterDefaultShadowAlgorithmContext _localctx = new AlterDefaultShadowAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alterDefaultShadowAlgorithm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ALTER);
			setState(156);
			match(DEFAULT);
			setState(157);
			match(SHADOW);
			setState(158);
			match(ALGORITHM);
			setState(159);
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
	public static class ShadowRuleDefinitionContext extends ParserRuleContext {
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(ShadowDistSQLStatementParser.LP_, 0); }
		public TerminalNode SOURCE() { return getToken(ShadowDistSQLStatementParser.SOURCE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(ShadowDistSQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(ShadowDistSQLStatementParser.EQ_, i);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(ShadowDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShadowDistSQLStatementParser.COMMA_, i);
		}
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public ShadowContext shadow() {
			return getRuleContext(ShadowContext.class,0);
		}
		public List<ShadowTableRuleContext> shadowTableRule() {
			return getRuleContexts(ShadowTableRuleContext.class);
		}
		public ShadowTableRuleContext shadowTableRule(int i) {
			return getRuleContext(ShadowTableRuleContext.class,i);
		}
		public TerminalNode RP_() { return getToken(ShadowDistSQLStatementParser.RP_, 0); }
		public ShadowRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shadowRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterShadowRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitShadowRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitShadowRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShadowRuleDefinitionContext shadowRuleDefinition() throws RecognitionException {
		ShadowRuleDefinitionContext _localctx = new ShadowRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shadowRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			ruleName();
			setState(162);
			match(LP_);
			setState(163);
			match(SOURCE);
			setState(164);
			match(EQ_);
			setState(165);
			source();
			setState(166);
			match(COMMA_);
			setState(167);
			match(SHADOW);
			setState(168);
			match(EQ_);
			setState(169);
			shadow();
			setState(170);
			match(COMMA_);
			setState(171);
			shadowTableRule();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(172);
				match(COMMA_);
				setState(173);
				shadowTableRule();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
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
	public static class ShadowTableRuleContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(ShadowDistSQLStatementParser.LP_, 0); }
		public List<AlgorithmDefinitionContext> algorithmDefinition() {
			return getRuleContexts(AlgorithmDefinitionContext.class);
		}
		public AlgorithmDefinitionContext algorithmDefinition(int i) {
			return getRuleContext(AlgorithmDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(ShadowDistSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(ShadowDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShadowDistSQLStatementParser.COMMA_, i);
		}
		public ShadowTableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shadowTableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterShadowTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitShadowTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitShadowTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShadowTableRuleContext shadowTableRule() throws RecognitionException {
		ShadowTableRuleContext _localctx = new ShadowTableRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shadowTableRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			tableName();
			setState(182);
			match(LP_);
			setState(183);
			algorithmDefinition();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(184);
				match(COMMA_);
				setState(185);
				algorithmDefinition();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShadowDistSQLStatementParser.IDENTIFIER_, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
	public static class ShadowContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShadowDistSQLStatementParser.IDENTIFIER_, 0); }
		public ShadowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shadow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterShadow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitShadow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitShadow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShadowContext shadow() throws RecognitionException {
		ShadowContext _localctx = new ShadowContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shadow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		public TerminalNode IDENTIFIER_() { return getToken(ShadowDistSQLStatementParser.IDENTIFIER_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
	public static class AlgorithmNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShadowDistSQLStatementParser.IDENTIFIER_, 0); }
		public AlgorithmNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterAlgorithmName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitAlgorithmName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmNameContext algorithmName() throws RecognitionException {
		AlgorithmNameContext _localctx = new AlgorithmNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_algorithmName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		public TerminalNode IF() { return getToken(ShadowDistSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ShadowDistSQLStatementParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(IF);
			setState(202);
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
		public TerminalNode IF() { return getToken(ShadowDistSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ShadowDistSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ShadowDistSQLStatementParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IF);
			setState(205);
			match(NOT);
			setState(206);
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
		public TerminalNode STRING_() { return getToken(ShadowDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(ShadowDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(ShadowDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(ShadowDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ShadowDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(209);
					match(MINUS_);
					}
				}

				setState(212);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
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
		public TerminalNode TYPE() { return getToken(ShadowDistSQLStatementParser.TYPE, 0); }
		public TerminalNode LP_() { return getToken(ShadowDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(ShadowDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(ShadowDistSQLStatementParser.EQ_, 0); }
		public AlgorithmTypeNameContext algorithmTypeName() {
			return getRuleContext(AlgorithmTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(ShadowDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(ShadowDistSQLStatementParser.COMMA_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public AlgorithmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterAlgorithmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitAlgorithmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDefinitionContext algorithmDefinition() throws RecognitionException {
		AlgorithmDefinitionContext _localctx = new AlgorithmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_algorithmDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(TYPE);
			setState(218);
			match(LP_);
			setState(219);
			match(NAME);
			setState(220);
			match(EQ_);
			setState(221);
			algorithmTypeName();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(222);
				match(COMMA_);
				setState(223);
				propertiesDefinition();
				}
			}

			setState(226);
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
		public TerminalNode STRING_() { return getToken(ShadowDistSQLStatementParser.STRING_, 0); }
		public BuildInShadowAlgorithmTypeContext buildInShadowAlgorithmType() {
			return getRuleContext(BuildInShadowAlgorithmTypeContext.class,0);
		}
		public AlgorithmTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterAlgorithmTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitAlgorithmTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmTypeNameContext algorithmTypeName() throws RecognitionException {
		AlgorithmTypeNameContext _localctx = new AlgorithmTypeNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_algorithmTypeName);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(STRING_);
				}
				break;
			case VALUE_MATCH:
			case REGEX_MATCH:
			case SQL_HINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				buildInShadowAlgorithmType();
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
	public static class BuildInShadowAlgorithmTypeContext extends ParserRuleContext {
		public TerminalNode VALUE_MATCH() { return getToken(ShadowDistSQLStatementParser.VALUE_MATCH, 0); }
		public TerminalNode REGEX_MATCH() { return getToken(ShadowDistSQLStatementParser.REGEX_MATCH, 0); }
		public TerminalNode SQL_HINT() { return getToken(ShadowDistSQLStatementParser.SQL_HINT, 0); }
		public BuildInShadowAlgorithmTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInShadowAlgorithmType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterBuildInShadowAlgorithmType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitBuildInShadowAlgorithmType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitBuildInShadowAlgorithmType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInShadowAlgorithmTypeContext buildInShadowAlgorithmType() throws RecognitionException {
		BuildInShadowAlgorithmTypeContext _localctx = new BuildInShadowAlgorithmTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_buildInShadowAlgorithmType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 7L) != 0)) ) {
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
		public TerminalNode PROPERTIES() { return getToken(ShadowDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(ShadowDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(ShadowDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefinitionContext propertiesDefinition() throws RecognitionException {
		PropertiesDefinitionContext _localctx = new PropertiesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_propertiesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(PROPERTIES);
			setState(235);
			match(LP_);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(236);
				properties();
				}
			}

			setState(239);
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
		public List<TerminalNode> COMMA_() { return getTokens(ShadowDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(ShadowDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			property();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(242);
				match(COMMA_);
				setState(243);
				property();
				}
				}
				setState(248);
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
		public TerminalNode EQ_() { return getToken(ShadowDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(ShadowDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(250);
			match(EQ_);
			setState(251);
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
	public static class RuleNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(ShadowDistSQLStatementParser.IDENTIFIER_, 0); }
		public RuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitRuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitRuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleNameContext ruleName() throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ruleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
	public static class ShowShadowRulesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShadowDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public ShadowRuleContext shadowRule() {
			return getRuleContext(ShadowRuleContext.class,0);
		}
		public TerminalNode RULES() { return getToken(ShadowDistSQLStatementParser.RULES, 0); }
		public TerminalNode FROM() { return getToken(ShadowDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShadowRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShadowRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterShowShadowRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitShowShadowRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitShowShadowRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShadowRulesContext showShadowRules() throws RecognitionException {
		ShowShadowRulesContext _localctx = new ShowShadowRulesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_showShadowRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(SHOW);
			setState(256);
			match(SHADOW);
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE:
				{
				setState(257);
				shadowRule();
				}
				break;
			case RULES:
				{
				setState(258);
				match(RULES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(261);
				match(FROM);
				setState(262);
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
	public static class ShowShadowTableRulesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShadowDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode TABLE() { return getToken(ShadowDistSQLStatementParser.TABLE, 0); }
		public TableRuleContext tableRule() {
			return getRuleContext(TableRuleContext.class,0);
		}
		public TerminalNode RULES() { return getToken(ShadowDistSQLStatementParser.RULES, 0); }
		public TerminalNode FROM() { return getToken(ShadowDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShadowTableRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShadowTableRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterShowShadowTableRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitShowShadowTableRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitShowShadowTableRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShadowTableRulesContext showShadowTableRules() throws RecognitionException {
		ShowShadowTableRulesContext _localctx = new ShowShadowTableRulesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_showShadowTableRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(SHOW);
			setState(266);
			match(SHADOW);
			setState(267);
			match(TABLE);
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE:
				{
				setState(268);
				tableRule();
				}
				break;
			case RULES:
				{
				setState(269);
				match(RULES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(272);
				match(FROM);
				setState(273);
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
	public static class ShowShadowAlgorithmsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShadowDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode ALGORITHMS() { return getToken(ShadowDistSQLStatementParser.ALGORITHMS, 0); }
		public TerminalNode FROM() { return getToken(ShadowDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowShadowAlgorithmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShadowAlgorithms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterShowShadowAlgorithms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitShowShadowAlgorithms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitShowShadowAlgorithms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShadowAlgorithmsContext showShadowAlgorithms() throws RecognitionException {
		ShowShadowAlgorithmsContext _localctx = new ShowShadowAlgorithmsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_showShadowAlgorithms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(SHOW);
			setState(277);
			match(SHADOW);
			setState(278);
			match(ALGORITHMS);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(279);
				match(FROM);
				setState(280);
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
	public static class ShowDefaultShadowAlgorithmContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShadowDistSQLStatementParser.SHOW, 0); }
		public TerminalNode DEFAULT() { return getToken(ShadowDistSQLStatementParser.DEFAULT, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode ALGORITHM() { return getToken(ShadowDistSQLStatementParser.ALGORITHM, 0); }
		public TerminalNode FROM() { return getToken(ShadowDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowDefaultShadowAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDefaultShadowAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterShowDefaultShadowAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitShowDefaultShadowAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitShowDefaultShadowAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDefaultShadowAlgorithmContext showDefaultShadowAlgorithm() throws RecognitionException {
		ShowDefaultShadowAlgorithmContext _localctx = new ShowDefaultShadowAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_showDefaultShadowAlgorithm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(SHOW);
			setState(284);
			match(DEFAULT);
			setState(285);
			match(SHADOW);
			setState(286);
			match(ALGORITHM);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(287);
				match(FROM);
				setState(288);
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
	public static class ShadowRuleContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(ShadowDistSQLStatementParser.RULE, 0); }
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public ShadowRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shadowRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterShadowRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitShadowRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitShadowRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShadowRuleContext shadowRule() throws RecognitionException {
		ShadowRuleContext _localctx = new ShadowRuleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shadowRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(RULE);
			setState(292);
			ruleName();
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
	public static class CountShadowRuleContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(ShadowDistSQLStatementParser.COUNT, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode RULE() { return getToken(ShadowDistSQLStatementParser.RULE, 0); }
		public TerminalNode FROM() { return getToken(ShadowDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public CountShadowRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countShadowRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterCountShadowRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitCountShadowRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitCountShadowRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountShadowRuleContext countShadowRule() throws RecognitionException {
		CountShadowRuleContext _localctx = new CountShadowRuleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_countShadowRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(COUNT);
			setState(295);
			match(SHADOW);
			setState(296);
			match(RULE);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(297);
				match(FROM);
				setState(298);
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
		public TerminalNode RULE() { return getToken(ShadowDistSQLStatementParser.RULE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRuleContext tableRule() throws RecognitionException {
		TableRuleContext _localctx = new TableRuleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(RULE);
			setState(302);
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
		public TerminalNode IDENTIFIER_() { return getToken(ShadowDistSQLStatementParser.IDENTIFIER_, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
	public static class ShowShadowAlgorithmPluginsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ShadowDistSQLStatementParser.SHOW, 0); }
		public TerminalNode SHADOW() { return getToken(ShadowDistSQLStatementParser.SHADOW, 0); }
		public TerminalNode ALGORITHM() { return getToken(ShadowDistSQLStatementParser.ALGORITHM, 0); }
		public TerminalNode PLUGINS() { return getToken(ShadowDistSQLStatementParser.PLUGINS, 0); }
		public ShowShadowAlgorithmPluginsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showShadowAlgorithmPlugins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).enterShowShadowAlgorithmPlugins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowDistSQLStatementListener ) ((ShadowDistSQLStatementListener)listener).exitShowShadowAlgorithmPlugins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowDistSQLStatementVisitor ) return ((ShadowDistSQLStatementVisitor<? extends T>)visitor).visitShowShadowAlgorithmPlugins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowShadowAlgorithmPluginsContext showShadowAlgorithmPlugins() throws RecognitionException {
		ShowShadowAlgorithmPluginsContext _localctx = new ShowShadowAlgorithmPluginsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_showShadowAlgorithmPlugins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(SHOW);
			setState(307);
			match(SHADOW);
			setState(308);
			match(ALGORITHM);
			setState(309);
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
		"\u0004\u0001U\u0138\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000P\b\u0000"+
		"\u0001\u0000\u0003\u0000S\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001`\b\u0001\n\u0001\f\u0001c\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002k\b\u0002\n\u0002\f\u0002n\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003t\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003y\b\u0003\n\u0003\f\u0003|\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0082\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0087\b\u0004\n\u0004\f\u0004\u008a"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0091\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009a\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00af\b\b\n\b\f\b\u00b2\t\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00bb\b\t\n\t\f\t\u00be"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00d3"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d8\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00e1\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00e7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00ee\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f5\b\u0015\n\u0015"+
		"\f\u0015\u00f8\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0104\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0108\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u010f\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0113\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u011a\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0122\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u012c\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0000\u0000!\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@\u0000\u0001\u0001\u0000HJ\u013d\u0000O\u0001\u0000\u0000"+
		"\u0000\u0002V\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006"+
		"o\u0001\u0000\u0000\u0000\b}\u0001\u0000\u0000\u0000\n\u008b\u0001\u0000"+
		"\u0000\u0000\f\u0094\u0001\u0000\u0000\u0000\u000e\u009b\u0001\u0000\u0000"+
		"\u0000\u0010\u00a1\u0001\u0000\u0000\u0000\u0012\u00b5\u0001\u0000\u0000"+
		"\u0000\u0014\u00c1\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000\u0000"+
		"\u0000\u0018\u00c5\u0001\u0000\u0000\u0000\u001a\u00c7\u0001\u0000\u0000"+
		"\u0000\u001c\u00c9\u0001\u0000\u0000\u0000\u001e\u00cc\u0001\u0000\u0000"+
		"\u0000 \u00d7\u0001\u0000\u0000\u0000\"\u00d9\u0001\u0000\u0000\u0000"+
		"$\u00e6\u0001\u0000\u0000\u0000&\u00e8\u0001\u0000\u0000\u0000(\u00ea"+
		"\u0001\u0000\u0000\u0000*\u00f1\u0001\u0000\u0000\u0000,\u00f9\u0001\u0000"+
		"\u0000\u0000.\u00fd\u0001\u0000\u0000\u00000\u00ff\u0001\u0000\u0000\u0000"+
		"2\u0109\u0001\u0000\u0000\u00004\u0114\u0001\u0000\u0000\u00006\u011b"+
		"\u0001\u0000\u0000\u00008\u0123\u0001\u0000\u0000\u0000:\u0126\u0001\u0000"+
		"\u0000\u0000<\u012d\u0001\u0000\u0000\u0000>\u0130\u0001\u0000\u0000\u0000"+
		"@\u0132\u0001\u0000\u0000\u0000BP\u0003\u0002\u0001\u0000CP\u0003\u0004"+
		"\u0002\u0000DP\u0003\u0006\u0003\u0000EP\u00030\u0018\u0000FP\u00032\u0019"+
		"\u0000GP\u00034\u001a\u0000HP\u00036\u001b\u0000IP\u0003\b\u0004\u0000"+
		"JP\u0003\f\u0006\u0000KP\u0003\n\u0005\u0000LP\u0003\u000e\u0007\u0000"+
		"MP\u0003:\u001d\u0000NP\u0003@ \u0000OB\u0001\u0000\u0000\u0000OC\u0001"+
		"\u0000\u0000\u0000OD\u0001\u0000\u0000\u0000OE\u0001\u0000\u0000\u0000"+
		"OF\u0001\u0000\u0000\u0000OG\u0001\u0000\u0000\u0000OH\u0001\u0000\u0000"+
		"\u0000OI\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000OK\u0001\u0000"+
		"\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QS\u0005(\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0000\u0000\u0001U\u0001\u0001\u0000\u0000\u0000VW\u0005.\u0000"+
		"\u0000WX\u00052\u0000\u0000XZ\u00054\u0000\u0000Y[\u0003\u001e\u000f\u0000"+
		"ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\a\u0003\u0010\b\u0000]^\u0005\"\u0000\u0000^`\u0003\u0010\b\u0000"+
		"_]\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b\u0003\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000de\u0005/\u0000\u0000ef\u00052\u0000\u0000fg\u00054"+
		"\u0000\u0000gl\u0003\u0010\b\u0000hi\u0005\"\u0000\u0000ik\u0003\u0010"+
		"\b\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0005\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000op\u00050\u0000\u0000pq\u00052\u0000\u0000q"+
		"s\u00054\u0000\u0000rt\u0003\u001c\u000e\u0000sr\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uz\u0003.\u0017\u0000"+
		"vw\u0005\"\u0000\u0000wy\u0003.\u0017\u0000xv\u0001\u0000\u0000\u0000"+
		"y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{\u0007\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005"+
		"0\u0000\u0000~\u007f\u00052\u0000\u0000\u007f\u0081\u0005<\u0000\u0000"+
		"\u0080\u0082\u0003\u001c\u000e\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0088\u0003\u001a\r\u0000\u0084\u0085\u0005\"\u0000\u0000\u0085"+
		"\u0087\u0003\u001a\r\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\t\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005.\u0000\u0000\u008c\u008d\u0005D\u0000"+
		"\u0000\u008d\u008e\u00052\u0000\u0000\u008e\u0090\u0005<\u0000\u0000\u008f"+
		"\u0091\u0003\u001e\u000f\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0003\"\u0011\u0000\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u00050\u0000\u0000\u0095\u0096\u0005D\u0000\u0000\u0096\u0097\u00052"+
		"\u0000\u0000\u0097\u0099\u0005<\u0000\u0000\u0098\u009a\u0003\u001c\u000e"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\r\u0001\u0000\u0000\u0000\u009b\u009c\u0005/\u0000\u0000"+
		"\u009c\u009d\u0005D\u0000\u0000\u009d\u009e\u00052\u0000\u0000\u009e\u009f"+
		"\u0005<\u0000\u0000\u009f\u00a0\u0003\"\u0011\u0000\u00a0\u000f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0003.\u0017\u0000\u00a2\u00a3\u0005\u001c"+
		"\u0000\u0000\u00a3\u00a4\u00053\u0000\u0000\u00a4\u00a5\u0005\u0015\u0000"+
		"\u0000\u00a5\u00a6\u0003\u0014\n\u0000\u00a6\u00a7\u0005\"\u0000\u0000"+
		"\u00a7\u00a8\u00052\u0000\u0000\u00a8\u00a9\u0005\u0015\u0000\u0000\u00a9"+
		"\u00aa\u0003\u0016\u000b\u0000\u00aa\u00ab\u0005\"\u0000\u0000\u00ab\u00b0"+
		"\u0003\u0012\t\u0000\u00ac\u00ad\u0005\"\u0000\u0000\u00ad\u00af\u0003"+
		"\u0012\t\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u001d\u0000\u0000\u00b4\u0011\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0003\u0018\f\u0000\u00b6\u00b7\u0005\u001c\u0000"+
		"\u0000\u00b7\u00bc\u0003\"\u0011\u0000\u00b8\u00b9\u0005\"\u0000\u0000"+
		"\u00b9\u00bb\u0003\"\u0011\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u001d\u0000\u0000\u00c0"+
		"\u0013\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005N\u0000\u0000\u00c2\u0015"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005N\u0000\u0000\u00c4\u0017\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005N\u0000\u0000\u00c6\u0019\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0005N\u0000\u0000\u00c8\u001b\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005E\u0000\u0000\u00ca\u00cb\u0005F\u0000\u0000\u00cb"+
		"\u001d\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005E\u0000\u0000\u00cd\u00ce"+
		"\u0005K\u0000\u0000\u00ce\u00cf\u0005F\u0000\u0000\u00cf\u001f\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d8\u0005O\u0000\u0000\u00d1\u00d3\u0005\r\u0000"+
		"\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d8\u0005P\u0000\u0000"+
		"\u00d5\u00d8\u0005,\u0000\u0000\u00d6\u00d8\u0005-\u0000\u0000\u00d7\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8!\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u00058\u0000\u0000\u00da\u00db\u0005\u001c"+
		"\u0000\u0000\u00db\u00dc\u00059\u0000\u0000\u00dc\u00dd\u0005\u0015\u0000"+
		"\u0000\u00dd\u00e0\u0003$\u0012\u0000\u00de\u00df\u0005\"\u0000\u0000"+
		"\u00df\u00e1\u0003(\u0014\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0005\u001d\u0000\u0000\u00e3#\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0005O\u0000\u0000\u00e5\u00e7\u0003&\u0013\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7%\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0007\u0000\u0000\u0000\u00e9\'\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005:\u0000\u0000\u00eb\u00ed\u0005\u001c\u0000\u0000\u00ec"+
		"\u00ee\u0003*\u0015\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005\u001d\u0000\u0000\u00f0)\u0001\u0000\u0000\u0000\u00f1\u00f6\u0003"+
		",\u0016\u0000\u00f2\u00f3\u0005\"\u0000\u0000\u00f3\u00f5\u0003,\u0016"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7+\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005O\u0000\u0000\u00fa\u00fb\u0005\u0015\u0000\u0000\u00fb"+
		"\u00fc\u0003 \u0010\u0000\u00fc-\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"N\u0000\u0000\u00fe/\u0001\u0000\u0000\u0000\u00ff\u0100\u00051\u0000"+
		"\u0000\u0100\u0103\u00052\u0000\u0000\u0101\u0104\u00038\u001c\u0000\u0102"+
		"\u0104\u0005;\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u00055\u0000\u0000\u0106\u0108\u0003>\u001f\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u01081\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u00051\u0000\u0000\u010a\u010b\u00052\u0000\u0000\u010b"+
		"\u010e\u00057\u0000\u0000\u010c\u010f\u0003<\u001e\u0000\u010d\u010f\u0005"+
		";\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u0111\u00055\u0000"+
		"\u0000\u0111\u0113\u0003>\u001f\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u01133\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u00051\u0000\u0000\u0115\u0116\u00052\u0000\u0000\u0116\u0119\u0005"+
		"=\u0000\u0000\u0117\u0118\u00055\u0000\u0000\u0118\u011a\u0003>\u001f"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a5\u0001\u0000\u0000\u0000\u011b\u011c\u00051\u0000\u0000\u011c"+
		"\u011d\u0005D\u0000\u0000\u011d\u011e\u00052\u0000\u0000\u011e\u0121\u0005"+
		"<\u0000\u0000\u011f\u0120\u00055\u0000\u0000\u0120\u0122\u0003>\u001f"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u01227\u0001\u0000\u0000\u0000\u0123\u0124\u00054\u0000\u0000\u0124"+
		"\u0125\u0003.\u0017\u0000\u01259\u0001\u0000\u0000\u0000\u0126\u0127\u0005"+
		"G\u0000\u0000\u0127\u0128\u00052\u0000\u0000\u0128\u012b\u00054\u0000"+
		"\u0000\u0129\u012a\u00055\u0000\u0000\u012a\u012c\u0003>\u001f\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		";\u0001\u0000\u0000\u0000\u012d\u012e\u00054\u0000\u0000\u012e\u012f\u0003"+
		"\u0018\f\u0000\u012f=\u0001\u0000\u0000\u0000\u0130\u0131\u0005N\u0000"+
		"\u0000\u0131?\u0001\u0000\u0000\u0000\u0132\u0133\u00051\u0000\u0000\u0133"+
		"\u0134\u00052\u0000\u0000\u0134\u0135\u0005<\u0000\u0000\u0135\u0136\u0005"+
		"L\u0000\u0000\u0136A\u0001\u0000\u0000\u0000\u001aORZalsz\u0081\u0088"+
		"\u0090\u0099\u00b0\u00bc\u00d2\u00d7\u00e0\u00e6\u00ed\u00f6\u0103\u0107"+
		"\u010e\u0112\u0119\u0121\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
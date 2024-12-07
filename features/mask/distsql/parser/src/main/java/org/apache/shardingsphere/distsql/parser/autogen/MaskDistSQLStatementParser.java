// Generated from /Users/code/gitcode/shardingsphere/features/mask/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/MaskDistSQLStatement.g4 by ANTLR 4.13.2
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
public class MaskDistSQLStatementParser extends Parser {
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
		FROM=51, MASK=52, TYPE=53, NAME=54, PROPERTIES=55, COLUMN=56, RULES=57, 
		TABLE=58, COLUMNS=59, IF=60, EXISTS=61, COUNT=62, NOT=63, MD5=64, KEEP_FIRST_N_LAST_M=65, 
		KEEP_FROM_X_TO_Y=66, MASK_FIRST_N_LAST_M=67, MASK_FROM_X_TO_Y=68, MASK_BEFORE_SPECIAL_CHARS=69, 
		MASK_AFTER_SPECIAL_CHARS=70, GENERIC_TABLE_RANDOM_REPLACE=71, ADDRESS_RANDOM_REPLACE=72, 
		ALGORITHM=73, PLUGINS=74, FOR_GENERATOR=75, IDENTIFIER_=76, STRING_=77, 
		INT_=78, HEX_=79, NUMBER_=80, HEXDIGIT_=81, BITNUM_=82;
	public static final int
		RULE_execute = 0, RULE_createMaskRule = 1, RULE_alterMaskRule = 2, RULE_dropMaskRule = 3, 
		RULE_maskRuleDefinition = 4, RULE_columnDefinition = 5, RULE_columnName = 6, 
		RULE_ifExists = 7, RULE_ifNotExists = 8, RULE_literal = 9, RULE_algorithmDefinition = 10, 
		RULE_algorithmTypeName = 11, RULE_buildInMaskAlgorithmType = 12, RULE_propertiesDefinition = 13, 
		RULE_properties = 14, RULE_property = 15, RULE_ruleName = 16, RULE_showMaskRules = 17, 
		RULE_countMaskRule = 18, RULE_databaseName = 19, RULE_showMaskAlgorithmPlugins = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "createMaskRule", "alterMaskRule", "dropMaskRule", "maskRuleDefinition", 
			"columnDefinition", "columnName", "ifExists", "ifNotExists", "literal", 
			"algorithmDefinition", "algorithmTypeName", "buildInMaskAlgorithmType", 
			"propertiesDefinition", "properties", "property", "ruleName", "showMaskRules", 
			"countMaskRule", "databaseName", "showMaskAlgorithmPlugins"
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
			"BQ_", "QUESTION_", "AT_", "SEMI_", "JSONSEPARATOR_", "UL_", "WS", "TRUE", 
			"FALSE", "CREATE", "ALTER", "DROP", "SHOW", "RULE", "FROM", "MASK", "TYPE", 
			"NAME", "PROPERTIES", "COLUMN", "RULES", "TABLE", "COLUMNS", "IF", "EXISTS", 
			"COUNT", "NOT", "MD5", "KEEP_FIRST_N_LAST_M", "KEEP_FROM_X_TO_Y", "MASK_FIRST_N_LAST_M", 
			"MASK_FROM_X_TO_Y", "MASK_BEFORE_SPECIAL_CHARS", "MASK_AFTER_SPECIAL_CHARS", 
			"GENERIC_TABLE_RANDOM_REPLACE", "ADDRESS_RANDOM_REPLACE", "ALGORITHM", 
			"PLUGINS", "FOR_GENERATOR", "IDENTIFIER_", "STRING_", "INT_", "HEX_", 
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
	public String getGrammarFileName() { return "MaskDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MaskDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MaskDistSQLStatementParser.EOF, 0); }
		public CreateMaskRuleContext createMaskRule() {
			return getRuleContext(CreateMaskRuleContext.class,0);
		}
		public AlterMaskRuleContext alterMaskRule() {
			return getRuleContext(AlterMaskRuleContext.class,0);
		}
		public DropMaskRuleContext dropMaskRule() {
			return getRuleContext(DropMaskRuleContext.class,0);
		}
		public ShowMaskRulesContext showMaskRules() {
			return getRuleContext(ShowMaskRulesContext.class,0);
		}
		public CountMaskRuleContext countMaskRule() {
			return getRuleContext(CountMaskRuleContext.class,0);
		}
		public ShowMaskAlgorithmPluginsContext showMaskAlgorithmPlugins() {
			return getRuleContext(ShowMaskAlgorithmPluginsContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(MaskDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(42);
				createMaskRule();
				}
				break;
			case 2:
				{
				setState(43);
				alterMaskRule();
				}
				break;
			case 3:
				{
				setState(44);
				dropMaskRule();
				}
				break;
			case 4:
				{
				setState(45);
				showMaskRules();
				}
				break;
			case 5:
				{
				setState(46);
				countMaskRule();
				}
				break;
			case 6:
				{
				setState(47);
				showMaskAlgorithmPlugins();
				}
				break;
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(50);
				match(SEMI_);
				}
			}

			setState(53);
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
	public static class CreateMaskRuleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MaskDistSQLStatementParser.CREATE, 0); }
		public TerminalNode MASK() { return getToken(MaskDistSQLStatementParser.MASK, 0); }
		public TerminalNode RULE() { return getToken(MaskDistSQLStatementParser.RULE, 0); }
		public List<MaskRuleDefinitionContext> maskRuleDefinition() {
			return getRuleContexts(MaskRuleDefinitionContext.class);
		}
		public MaskRuleDefinitionContext maskRuleDefinition(int i) {
			return getRuleContext(MaskRuleDefinitionContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(MaskDistSQLStatementParser.TABLE, 0); }
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MaskDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MaskDistSQLStatementParser.COMMA_, i);
		}
		public CreateMaskRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createMaskRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterCreateMaskRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitCreateMaskRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitCreateMaskRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateMaskRuleContext createMaskRule() throws RecognitionException {
		CreateMaskRuleContext _localctx = new CreateMaskRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createMaskRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CREATE);
			setState(56);
			match(MASK);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(57);
				match(TABLE);
				}
			}

			setState(60);
			match(RULE);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(61);
				ifNotExists();
				}
			}

			setState(64);
			maskRuleDefinition();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(65);
				match(COMMA_);
				setState(66);
				maskRuleDefinition();
				}
				}
				setState(71);
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
	public static class AlterMaskRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MaskDistSQLStatementParser.ALTER, 0); }
		public TerminalNode MASK() { return getToken(MaskDistSQLStatementParser.MASK, 0); }
		public TerminalNode RULE() { return getToken(MaskDistSQLStatementParser.RULE, 0); }
		public List<MaskRuleDefinitionContext> maskRuleDefinition() {
			return getRuleContexts(MaskRuleDefinitionContext.class);
		}
		public MaskRuleDefinitionContext maskRuleDefinition(int i) {
			return getRuleContext(MaskRuleDefinitionContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(MaskDistSQLStatementParser.TABLE, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MaskDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MaskDistSQLStatementParser.COMMA_, i);
		}
		public AlterMaskRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterMaskRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterAlterMaskRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitAlterMaskRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitAlterMaskRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterMaskRuleContext alterMaskRule() throws RecognitionException {
		AlterMaskRuleContext _localctx = new AlterMaskRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterMaskRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ALTER);
			setState(73);
			match(MASK);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(74);
				match(TABLE);
				}
			}

			setState(77);
			match(RULE);
			setState(78);
			maskRuleDefinition();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(79);
				match(COMMA_);
				setState(80);
				maskRuleDefinition();
				}
				}
				setState(85);
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
	public static class DropMaskRuleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MaskDistSQLStatementParser.DROP, 0); }
		public TerminalNode MASK() { return getToken(MaskDistSQLStatementParser.MASK, 0); }
		public TerminalNode RULE() { return getToken(MaskDistSQLStatementParser.RULE, 0); }
		public List<RuleNameContext> ruleName() {
			return getRuleContexts(RuleNameContext.class);
		}
		public RuleNameContext ruleName(int i) {
			return getRuleContext(RuleNameContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(MaskDistSQLStatementParser.TABLE, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MaskDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MaskDistSQLStatementParser.COMMA_, i);
		}
		public DropMaskRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropMaskRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterDropMaskRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitDropMaskRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitDropMaskRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropMaskRuleContext dropMaskRule() throws RecognitionException {
		DropMaskRuleContext _localctx = new DropMaskRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropMaskRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(DROP);
			setState(87);
			match(MASK);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(88);
				match(TABLE);
				}
			}

			setState(91);
			match(RULE);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(92);
				ifExists();
				}
			}

			setState(95);
			ruleName();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(96);
				match(COMMA_);
				setState(97);
				ruleName();
				}
				}
				setState(102);
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
	public static class MaskRuleDefinitionContext extends ParserRuleContext {
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public List<TerminalNode> LP_() { return getTokens(MaskDistSQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(MaskDistSQLStatementParser.LP_, i);
		}
		public TerminalNode COLUMNS() { return getToken(MaskDistSQLStatementParser.COLUMNS, 0); }
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(MaskDistSQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(MaskDistSQLStatementParser.RP_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MaskDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MaskDistSQLStatementParser.COMMA_, i);
		}
		public MaskRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maskRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterMaskRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitMaskRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitMaskRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaskRuleDefinitionContext maskRuleDefinition() throws RecognitionException {
		MaskRuleDefinitionContext _localctx = new MaskRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_maskRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			ruleName();
			setState(104);
			match(LP_);
			setState(105);
			match(COLUMNS);
			setState(106);
			match(LP_);
			setState(107);
			columnDefinition();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(108);
				match(COMMA_);
				setState(109);
				columnDefinition();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(RP_);
			setState(116);
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
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MaskDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(MaskDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(MaskDistSQLStatementParser.EQ_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(MaskDistSQLStatementParser.COMMA_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MaskDistSQLStatementParser.RP_, 0); }
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LP_);
			setState(119);
			match(NAME);
			setState(120);
			match(EQ_);
			setState(121);
			columnName();
			setState(122);
			match(COMMA_);
			setState(123);
			algorithmDefinition();
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
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MaskDistSQLStatementParser.IDENTIFIER_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		public TerminalNode IF() { return getToken(MaskDistSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MaskDistSQLStatementParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IF);
			setState(129);
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
		public TerminalNode IF() { return getToken(MaskDistSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MaskDistSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MaskDistSQLStatementParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IF);
			setState(132);
			match(NOT);
			setState(133);
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
		public TerminalNode STRING_() { return getToken(MaskDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(MaskDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(MaskDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(MaskDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MaskDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(136);
					match(MINUS_);
					}
				}

				setState(139);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
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
		public TerminalNode TYPE() { return getToken(MaskDistSQLStatementParser.TYPE, 0); }
		public TerminalNode LP_() { return getToken(MaskDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(MaskDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(MaskDistSQLStatementParser.EQ_, 0); }
		public AlgorithmTypeNameContext algorithmTypeName() {
			return getRuleContext(AlgorithmTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MaskDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(MaskDistSQLStatementParser.COMMA_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public AlgorithmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterAlgorithmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitAlgorithmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDefinitionContext algorithmDefinition() throws RecognitionException {
		AlgorithmDefinitionContext _localctx = new AlgorithmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_algorithmDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(TYPE);
			setState(145);
			match(LP_);
			setState(146);
			match(NAME);
			setState(147);
			match(EQ_);
			setState(148);
			algorithmTypeName();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(149);
				match(COMMA_);
				setState(150);
				propertiesDefinition();
				}
			}

			setState(153);
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
		public TerminalNode STRING_() { return getToken(MaskDistSQLStatementParser.STRING_, 0); }
		public BuildInMaskAlgorithmTypeContext buildInMaskAlgorithmType() {
			return getRuleContext(BuildInMaskAlgorithmTypeContext.class,0);
		}
		public AlgorithmTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterAlgorithmTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitAlgorithmTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmTypeNameContext algorithmTypeName() throws RecognitionException {
		AlgorithmTypeNameContext _localctx = new AlgorithmTypeNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_algorithmTypeName);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(STRING_);
				}
				break;
			case MD5:
			case KEEP_FIRST_N_LAST_M:
			case KEEP_FROM_X_TO_Y:
			case MASK_FIRST_N_LAST_M:
			case MASK_FROM_X_TO_Y:
			case MASK_BEFORE_SPECIAL_CHARS:
			case MASK_AFTER_SPECIAL_CHARS:
			case GENERIC_TABLE_RANDOM_REPLACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				buildInMaskAlgorithmType();
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
	public static class BuildInMaskAlgorithmTypeContext extends ParserRuleContext {
		public TerminalNode MD5() { return getToken(MaskDistSQLStatementParser.MD5, 0); }
		public TerminalNode KEEP_FIRST_N_LAST_M() { return getToken(MaskDistSQLStatementParser.KEEP_FIRST_N_LAST_M, 0); }
		public TerminalNode KEEP_FROM_X_TO_Y() { return getToken(MaskDistSQLStatementParser.KEEP_FROM_X_TO_Y, 0); }
		public TerminalNode MASK_FIRST_N_LAST_M() { return getToken(MaskDistSQLStatementParser.MASK_FIRST_N_LAST_M, 0); }
		public TerminalNode MASK_FROM_X_TO_Y() { return getToken(MaskDistSQLStatementParser.MASK_FROM_X_TO_Y, 0); }
		public TerminalNode MASK_BEFORE_SPECIAL_CHARS() { return getToken(MaskDistSQLStatementParser.MASK_BEFORE_SPECIAL_CHARS, 0); }
		public TerminalNode MASK_AFTER_SPECIAL_CHARS() { return getToken(MaskDistSQLStatementParser.MASK_AFTER_SPECIAL_CHARS, 0); }
		public TerminalNode GENERIC_TABLE_RANDOM_REPLACE() { return getToken(MaskDistSQLStatementParser.GENERIC_TABLE_RANDOM_REPLACE, 0); }
		public BuildInMaskAlgorithmTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInMaskAlgorithmType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterBuildInMaskAlgorithmType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitBuildInMaskAlgorithmType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitBuildInMaskAlgorithmType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInMaskAlgorithmTypeContext buildInMaskAlgorithmType() throws RecognitionException {
		BuildInMaskAlgorithmTypeContext _localctx = new BuildInMaskAlgorithmTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_buildInMaskAlgorithmType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 255L) != 0)) ) {
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
		public TerminalNode PROPERTIES() { return getToken(MaskDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(MaskDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MaskDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefinitionContext propertiesDefinition() throws RecognitionException {
		PropertiesDefinitionContext _localctx = new PropertiesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertiesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(PROPERTIES);
			setState(162);
			match(LP_);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(163);
				properties();
				}
			}

			setState(166);
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
		public List<TerminalNode> COMMA_() { return getTokens(MaskDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MaskDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			property();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(169);
				match(COMMA_);
				setState(170);
				property();
				}
				}
				setState(175);
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
		public TerminalNode EQ_() { return getToken(MaskDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(MaskDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(177);
			match(EQ_);
			setState(178);
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
		public TerminalNode IDENTIFIER_() { return getToken(MaskDistSQLStatementParser.IDENTIFIER_, 0); }
		public RuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitRuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitRuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleNameContext ruleName() throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ruleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
	public static class ShowMaskRulesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MaskDistSQLStatementParser.SHOW, 0); }
		public TerminalNode MASK() { return getToken(MaskDistSQLStatementParser.MASK, 0); }
		public TerminalNode RULE() { return getToken(MaskDistSQLStatementParser.RULE, 0); }
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public TerminalNode RULES() { return getToken(MaskDistSQLStatementParser.RULES, 0); }
		public TerminalNode TABLE() { return getToken(MaskDistSQLStatementParser.TABLE, 0); }
		public TerminalNode FROM() { return getToken(MaskDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public ShowMaskRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showMaskRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterShowMaskRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitShowMaskRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitShowMaskRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowMaskRulesContext showMaskRules() throws RecognitionException {
		ShowMaskRulesContext _localctx = new ShowMaskRulesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_showMaskRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SHOW);
			setState(183);
			match(MASK);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(184);
				match(TABLE);
				}
			}

			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE:
				{
				setState(187);
				match(RULE);
				setState(188);
				ruleName();
				}
				break;
			case RULES:
				{
				setState(189);
				match(RULES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(192);
				match(FROM);
				setState(193);
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
	public static class CountMaskRuleContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(MaskDistSQLStatementParser.COUNT, 0); }
		public TerminalNode MASK() { return getToken(MaskDistSQLStatementParser.MASK, 0); }
		public TerminalNode RULE() { return getToken(MaskDistSQLStatementParser.RULE, 0); }
		public TerminalNode FROM() { return getToken(MaskDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public CountMaskRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countMaskRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterCountMaskRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitCountMaskRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitCountMaskRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountMaskRuleContext countMaskRule() throws RecognitionException {
		CountMaskRuleContext _localctx = new CountMaskRuleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_countMaskRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(COUNT);
			setState(197);
			match(MASK);
			setState(198);
			match(RULE);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(199);
				match(FROM);
				setState(200);
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
	public static class DatabaseNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MaskDistSQLStatementParser.IDENTIFIER_, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
	public static class ShowMaskAlgorithmPluginsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MaskDistSQLStatementParser.SHOW, 0); }
		public TerminalNode MASK() { return getToken(MaskDistSQLStatementParser.MASK, 0); }
		public TerminalNode ALGORITHM() { return getToken(MaskDistSQLStatementParser.ALGORITHM, 0); }
		public TerminalNode PLUGINS() { return getToken(MaskDistSQLStatementParser.PLUGINS, 0); }
		public ShowMaskAlgorithmPluginsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showMaskAlgorithmPlugins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).enterShowMaskAlgorithmPlugins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaskDistSQLStatementListener ) ((MaskDistSQLStatementListener)listener).exitShowMaskAlgorithmPlugins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaskDistSQLStatementVisitor ) return ((MaskDistSQLStatementVisitor<? extends T>)visitor).visitShowMaskAlgorithmPlugins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowMaskAlgorithmPluginsContext showMaskAlgorithmPlugins() throws RecognitionException {
		ShowMaskAlgorithmPluginsContext _localctx = new ShowMaskAlgorithmPluginsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_showMaskAlgorithmPlugins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(SHOW);
			setState(206);
			match(MASK);
			setState(207);
			match(ALGORITHM);
			setState(208);
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
		"\u0004\u0001R\u00d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00001\b\u0000"+
		"\u0001\u0000\u0003\u00004\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001?\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"D\b\u0001\n\u0001\f\u0001G\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002L\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"^\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003c\b\u0003\n\u0003"+
		"\f\u0003f\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004o\b\u0004\n\u0004\f\u0004r\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u008a\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u008f\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0098\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u009e\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00a5\b"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ac"+
		"\b\u000e\n\u000e\f\u000e\u00af\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00ba\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00bf\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c3\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ca"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000"+
		"\u0001\u0001\u0000@G\u00d8\u00000\u0001\u0000\u0000\u0000\u00027\u0001"+
		"\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000"+
		"\u0000\bg\u0001\u0000\u0000\u0000\nv\u0001\u0000\u0000\u0000\f~\u0001"+
		"\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000\u0010\u0083\u0001"+
		"\u0000\u0000\u0000\u0012\u008e\u0001\u0000\u0000\u0000\u0014\u0090\u0001"+
		"\u0000\u0000\u0000\u0016\u009d\u0001\u0000\u0000\u0000\u0018\u009f\u0001"+
		"\u0000\u0000\u0000\u001a\u00a1\u0001\u0000\u0000\u0000\u001c\u00a8\u0001"+
		"\u0000\u0000\u0000\u001e\u00b0\u0001\u0000\u0000\u0000 \u00b4\u0001\u0000"+
		"\u0000\u0000\"\u00b6\u0001\u0000\u0000\u0000$\u00c4\u0001\u0000\u0000"+
		"\u0000&\u00cb\u0001\u0000\u0000\u0000(\u00cd\u0001\u0000\u0000\u0000*"+
		"1\u0003\u0002\u0001\u0000+1\u0003\u0004\u0002\u0000,1\u0003\u0006\u0003"+
		"\u0000-1\u0003\"\u0011\u0000.1\u0003$\u0012\u0000/1\u0003(\u0014\u0000"+
		"0*\u0001\u0000\u0000\u00000+\u0001\u0000\u0000\u00000,\u0001\u0000\u0000"+
		"\u00000-\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000"+
		"\u0000\u000013\u0001\u0000\u0000\u000024\u0005(\u0000\u000032\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005"+
		"\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u000078\u0005.\u0000\u0000"+
		"8:\u00054\u0000\u00009;\u0005:\u0000\u0000:9\u0001\u0000\u0000\u0000:"+
		";\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u00052\u0000\u0000"+
		"=?\u0003\u0010\b\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@E\u0003\b\u0004\u0000AB\u0005\"\u0000\u0000"+
		"BD\u0003\b\u0004\u0000CA\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0003\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005/\u0000\u0000IK\u00054\u0000"+
		"\u0000JL\u0005:\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u00052\u0000\u0000NS\u0003\b\u0004"+
		"\u0000OP\u0005\"\u0000\u0000PR\u0003\b\u0004\u0000QO\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000T\u0005\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VW\u00050\u0000\u0000WY\u00054\u0000\u0000XZ\u0005:\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[]\u00052\u0000\u0000\\^\u0003\u000e\u0007\u0000]\\\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_d\u0003 \u0010"+
		"\u0000`a\u0005\"\u0000\u0000ac\u0003 \u0010\u0000b`\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000e\u0007\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gh\u0003 \u0010\u0000hi\u0005\u001c\u0000\u0000ij\u0005;\u0000\u0000j"+
		"k\u0005\u001c\u0000\u0000kp\u0003\n\u0005\u0000lm\u0005\"\u0000\u0000"+
		"mo\u0003\n\u0005\u0000nl\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000st\u0005\u001d\u0000\u0000tu\u0005\u001d"+
		"\u0000\u0000u\t\u0001\u0000\u0000\u0000vw\u0005\u001c\u0000\u0000wx\u0005"+
		"6\u0000\u0000xy\u0005\u0015\u0000\u0000yz\u0003\f\u0006\u0000z{\u0005"+
		"\"\u0000\u0000{|\u0003\u0014\n\u0000|}\u0005\u001d\u0000\u0000}\u000b"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005L\u0000\u0000\u007f\r\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005<\u0000\u0000\u0081\u0082\u0005=\u0000\u0000"+
		"\u0082\u000f\u0001\u0000\u0000\u0000\u0083\u0084\u0005<\u0000\u0000\u0084"+
		"\u0085\u0005?\u0000\u0000\u0085\u0086\u0005=\u0000\u0000\u0086\u0011\u0001"+
		"\u0000\u0000\u0000\u0087\u008f\u0005M\u0000\u0000\u0088\u008a\u0005\r"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008f\u0005N\u0000"+
		"\u0000\u008c\u008f\u0005,\u0000\u0000\u008d\u008f\u0005-\u0000\u0000\u008e"+
		"\u0087\u0001\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0013\u0001\u0000\u0000\u0000\u0090\u0091\u00055\u0000\u0000\u0091\u0092"+
		"\u0005\u001c\u0000\u0000\u0092\u0093\u00056\u0000\u0000\u0093\u0094\u0005"+
		"\u0015\u0000\u0000\u0094\u0097\u0003\u0016\u000b\u0000\u0095\u0096\u0005"+
		"\"\u0000\u0000\u0096\u0098\u0003\u001a\r\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005\u001d\u0000\u0000\u009a\u0015\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0005M\u0000\u0000\u009c\u009e\u0003\u0018\f"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0000\u0000"+
		"\u0000\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1\u00a2\u00057\u0000\u0000"+
		"\u00a2\u00a4\u0005\u001c\u0000\u0000\u00a3\u00a5\u0003\u001c\u000e\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u001d\u0000\u0000"+
		"\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8\u00ad\u0003\u001e\u000f\u0000"+
		"\u00a9\u00aa\u0005\"\u0000\u0000\u00aa\u00ac\u0003\u001e\u000f\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u001d\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005M\u0000\u0000\u00b1\u00b2\u0005\u0015\u0000\u0000\u00b2\u00b3"+
		"\u0003\u0012\t\u0000\u00b3\u001f\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"L\u0000\u0000\u00b5!\u0001\u0000\u0000\u0000\u00b6\u00b7\u00051\u0000"+
		"\u0000\u00b7\u00b9\u00054\u0000\u0000\u00b8\u00ba\u0005:\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00be\u0001\u0000\u0000\u0000\u00bb\u00bc\u00052\u0000\u0000\u00bc\u00bf"+
		"\u0003 \u0010\u0000\u00bd\u00bf\u00059\u0000\u0000\u00be\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u00053\u0000\u0000\u00c1\u00c3\u0003&\u0013\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3#\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005>\u0000\u0000\u00c5\u00c6"+
		"\u00054\u0000\u0000\u00c6\u00c9\u00052\u0000\u0000\u00c7\u00c8\u00053"+
		"\u0000\u0000\u00c8\u00ca\u0003&\u0013\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca%\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005L\u0000\u0000\u00cc\'\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u00051\u0000\u0000\u00ce\u00cf\u00054\u0000\u0000\u00cf\u00d0\u0005"+
		"I\u0000\u0000\u00d0\u00d1\u0005J\u0000\u0000\u00d1)\u0001\u0000\u0000"+
		"\u0000\u001503:>EKSY]dp\u0089\u008e\u0097\u009d\u00a4\u00ad\u00b9\u00be"+
		"\u00c2\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /Users/code/gitcode/shardingsphere/features/encrypt/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/EncryptDistSQLStatement.g4 by ANTLR 4.13.2
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
public class EncryptDistSQLStatementParser extends Parser {
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
		WS=43, CREATE=44, ALTER=45, DROP=46, SHOW=47, RESOURCE=48, RULE=49, FROM=50, 
		ENCRYPT=51, TYPE=52, ENCRYPT_ALGORITHM=53, ASSISTED_QUERY_ALGORITHM=54, 
		LIKE_QUERY_ALGORITHM=55, NAME=56, PROPERTIES=57, COLUMN=58, RULES=59, 
		TABLE=60, COLUMNS=61, CIPHER=62, ASSISTED_QUERY=63, ASSISTED_QUERY_COLUMN=64, 
		LIKE_QUERY=65, LIKE_QUERY_COLUMN=66, TRUE=67, FALSE=68, IF=69, EXISTS=70, 
		COUNT=71, MD5=72, AES=73, NOT=74, ALGORITHM=75, PLUGINS=76, FOR_GENERATOR=77, 
		IDENTIFIER_=78, STRING_=79, INT_=80, HEX_=81, NUMBER_=82, HEXDIGIT_=83, 
		BITNUM_=84;
	public static final int
		RULE_execute = 0, RULE_createEncryptRule = 1, RULE_alterEncryptRule = 2, 
		RULE_dropEncryptRule = 3, RULE_encryptRuleDefinition = 4, RULE_encryptTableRuleDefinition = 5, 
		RULE_encryptColumnDefinition = 6, RULE_columnDefinition = 7, RULE_columnName = 8, 
		RULE_cipherColumnDefinition = 9, RULE_cipherColumnName = 10, RULE_assistedQueryColumnDefinition = 11, 
		RULE_assistedQueryColumnName = 12, RULE_likeQueryColumnDefinition = 13, 
		RULE_likeQueryColumnName = 14, RULE_encryptAlgorithm = 15, RULE_assistedQueryAlgorithm = 16, 
		RULE_likeQueryAlgorithm = 17, RULE_ifExists = 18, RULE_ifNotExists = 19, 
		RULE_literal = 20, RULE_algorithmDefinition = 21, RULE_algorithmTypeName = 22, 
		RULE_buildInEncryptAlgorithmType = 23, RULE_standardEncryptAlgorithm = 24, 
		RULE_assistedEncryptAlgorithm = 25, RULE_propertiesDefinition = 26, RULE_properties = 27, 
		RULE_property = 28, RULE_tableName = 29, RULE_showEncryptRules = 30, RULE_tableRule = 31, 
		RULE_countEncryptRule = 32, RULE_databaseName = 33, RULE_showEncryptAlgorithmPlugins = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "createEncryptRule", "alterEncryptRule", "dropEncryptRule", 
			"encryptRuleDefinition", "encryptTableRuleDefinition", "encryptColumnDefinition", 
			"columnDefinition", "columnName", "cipherColumnDefinition", "cipherColumnName", 
			"assistedQueryColumnDefinition", "assistedQueryColumnName", "likeQueryColumnDefinition", 
			"likeQueryColumnName", "encryptAlgorithm", "assistedQueryAlgorithm", 
			"likeQueryAlgorithm", "ifExists", "ifNotExists", "literal", "algorithmDefinition", 
			"algorithmTypeName", "buildInEncryptAlgorithmType", "standardEncryptAlgorithm", 
			"assistedEncryptAlgorithm", "propertiesDefinition", "properties", "property", 
			"tableName", "showEncryptRules", "tableRule", "countEncryptRule", "databaseName", 
			"showEncryptAlgorithmPlugins"
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
			"BQ_", "QUESTION_", "AT_", "SEMI_", "JSONSEPARATOR_", "UL_", "WS", "CREATE", 
			"ALTER", "DROP", "SHOW", "RESOURCE", "RULE", "FROM", "ENCRYPT", "TYPE", 
			"ENCRYPT_ALGORITHM", "ASSISTED_QUERY_ALGORITHM", "LIKE_QUERY_ALGORITHM", 
			"NAME", "PROPERTIES", "COLUMN", "RULES", "TABLE", "COLUMNS", "CIPHER", 
			"ASSISTED_QUERY", "ASSISTED_QUERY_COLUMN", "LIKE_QUERY", "LIKE_QUERY_COLUMN", 
			"TRUE", "FALSE", "IF", "EXISTS", "COUNT", "MD5", "AES", "NOT", "ALGORITHM", 
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
	public String getGrammarFileName() { return "EncryptDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EncryptDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EncryptDistSQLStatementParser.EOF, 0); }
		public CreateEncryptRuleContext createEncryptRule() {
			return getRuleContext(CreateEncryptRuleContext.class,0);
		}
		public AlterEncryptRuleContext alterEncryptRule() {
			return getRuleContext(AlterEncryptRuleContext.class,0);
		}
		public DropEncryptRuleContext dropEncryptRule() {
			return getRuleContext(DropEncryptRuleContext.class,0);
		}
		public ShowEncryptRulesContext showEncryptRules() {
			return getRuleContext(ShowEncryptRulesContext.class,0);
		}
		public CountEncryptRuleContext countEncryptRule() {
			return getRuleContext(CountEncryptRuleContext.class,0);
		}
		public ShowEncryptAlgorithmPluginsContext showEncryptAlgorithmPlugins() {
			return getRuleContext(ShowEncryptAlgorithmPluginsContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(EncryptDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(70);
				createEncryptRule();
				}
				break;
			case 2:
				{
				setState(71);
				alterEncryptRule();
				}
				break;
			case 3:
				{
				setState(72);
				dropEncryptRule();
				}
				break;
			case 4:
				{
				setState(73);
				showEncryptRules();
				}
				break;
			case 5:
				{
				setState(74);
				countEncryptRule();
				}
				break;
			case 6:
				{
				setState(75);
				showEncryptAlgorithmPlugins();
				}
				break;
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(78);
				match(SEMI_);
				}
			}

			setState(81);
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
	public static class CreateEncryptRuleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(EncryptDistSQLStatementParser.CREATE, 0); }
		public TerminalNode ENCRYPT() { return getToken(EncryptDistSQLStatementParser.ENCRYPT, 0); }
		public TerminalNode RULE() { return getToken(EncryptDistSQLStatementParser.RULE, 0); }
		public List<EncryptRuleDefinitionContext> encryptRuleDefinition() {
			return getRuleContexts(EncryptRuleDefinitionContext.class);
		}
		public EncryptRuleDefinitionContext encryptRuleDefinition(int i) {
			return getRuleContext(EncryptRuleDefinitionContext.class,i);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EncryptDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EncryptDistSQLStatementParser.COMMA_, i);
		}
		public CreateEncryptRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createEncryptRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterCreateEncryptRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitCreateEncryptRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitCreateEncryptRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateEncryptRuleContext createEncryptRule() throws RecognitionException {
		CreateEncryptRuleContext _localctx = new CreateEncryptRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createEncryptRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(CREATE);
			setState(84);
			match(ENCRYPT);
			setState(85);
			match(RULE);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(86);
				ifNotExists();
				}
			}

			setState(89);
			encryptRuleDefinition();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(90);
				match(COMMA_);
				setState(91);
				encryptRuleDefinition();
				}
				}
				setState(96);
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
	public static class AlterEncryptRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(EncryptDistSQLStatementParser.ALTER, 0); }
		public TerminalNode ENCRYPT() { return getToken(EncryptDistSQLStatementParser.ENCRYPT, 0); }
		public TerminalNode RULE() { return getToken(EncryptDistSQLStatementParser.RULE, 0); }
		public List<EncryptRuleDefinitionContext> encryptRuleDefinition() {
			return getRuleContexts(EncryptRuleDefinitionContext.class);
		}
		public EncryptRuleDefinitionContext encryptRuleDefinition(int i) {
			return getRuleContext(EncryptRuleDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EncryptDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EncryptDistSQLStatementParser.COMMA_, i);
		}
		public AlterEncryptRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterEncryptRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterAlterEncryptRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitAlterEncryptRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitAlterEncryptRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterEncryptRuleContext alterEncryptRule() throws RecognitionException {
		AlterEncryptRuleContext _localctx = new AlterEncryptRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterEncryptRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ALTER);
			setState(98);
			match(ENCRYPT);
			setState(99);
			match(RULE);
			setState(100);
			encryptRuleDefinition();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(101);
				match(COMMA_);
				setState(102);
				encryptRuleDefinition();
				}
				}
				setState(107);
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
	public static class DropEncryptRuleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(EncryptDistSQLStatementParser.DROP, 0); }
		public TerminalNode ENCRYPT() { return getToken(EncryptDistSQLStatementParser.ENCRYPT, 0); }
		public TerminalNode RULE() { return getToken(EncryptDistSQLStatementParser.RULE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EncryptDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EncryptDistSQLStatementParser.COMMA_, i);
		}
		public DropEncryptRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropEncryptRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterDropEncryptRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitDropEncryptRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitDropEncryptRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropEncryptRuleContext dropEncryptRule() throws RecognitionException {
		DropEncryptRuleContext _localctx = new DropEncryptRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropEncryptRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DROP);
			setState(109);
			match(ENCRYPT);
			setState(110);
			match(RULE);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(111);
				ifExists();
				}
			}

			setState(114);
			tableName();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(115);
				match(COMMA_);
				setState(116);
				tableName();
				}
				}
				setState(121);
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
	public static class EncryptRuleDefinitionContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public EncryptTableRuleDefinitionContext encryptTableRuleDefinition() {
			return getRuleContext(EncryptTableRuleDefinitionContext.class,0);
		}
		public EncryptRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterEncryptRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitEncryptRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitEncryptRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncryptRuleDefinitionContext encryptRuleDefinition() throws RecognitionException {
		EncryptRuleDefinitionContext _localctx = new EncryptRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_encryptRuleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			tableName();
			setState(123);
			encryptTableRuleDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EncryptTableRuleDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> LP_() { return getTokens(EncryptDistSQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(EncryptDistSQLStatementParser.LP_, i);
		}
		public TerminalNode COLUMNS() { return getToken(EncryptDistSQLStatementParser.COLUMNS, 0); }
		public List<EncryptColumnDefinitionContext> encryptColumnDefinition() {
			return getRuleContexts(EncryptColumnDefinitionContext.class);
		}
		public EncryptColumnDefinitionContext encryptColumnDefinition(int i) {
			return getRuleContext(EncryptColumnDefinitionContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(EncryptDistSQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(EncryptDistSQLStatementParser.RP_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EncryptDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EncryptDistSQLStatementParser.COMMA_, i);
		}
		public EncryptTableRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptTableRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterEncryptTableRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitEncryptTableRuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitEncryptTableRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncryptTableRuleDefinitionContext encryptTableRuleDefinition() throws RecognitionException {
		EncryptTableRuleDefinitionContext _localctx = new EncryptTableRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_encryptTableRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LP_);
			setState(126);
			match(COLUMNS);
			setState(127);
			match(LP_);
			setState(128);
			encryptColumnDefinition();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(129);
				match(COMMA_);
				setState(130);
				encryptColumnDefinition();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(RP_);
			setState(137);
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
	public static class EncryptColumnDefinitionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(EncryptDistSQLStatementParser.LP_, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EncryptDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EncryptDistSQLStatementParser.COMMA_, i);
		}
		public CipherColumnDefinitionContext cipherColumnDefinition() {
			return getRuleContext(CipherColumnDefinitionContext.class,0);
		}
		public EncryptAlgorithmContext encryptAlgorithm() {
			return getRuleContext(EncryptAlgorithmContext.class,0);
		}
		public TerminalNode RP_() { return getToken(EncryptDistSQLStatementParser.RP_, 0); }
		public AssistedQueryColumnDefinitionContext assistedQueryColumnDefinition() {
			return getRuleContext(AssistedQueryColumnDefinitionContext.class,0);
		}
		public LikeQueryColumnDefinitionContext likeQueryColumnDefinition() {
			return getRuleContext(LikeQueryColumnDefinitionContext.class,0);
		}
		public AssistedQueryAlgorithmContext assistedQueryAlgorithm() {
			return getRuleContext(AssistedQueryAlgorithmContext.class,0);
		}
		public LikeQueryAlgorithmContext likeQueryAlgorithm() {
			return getRuleContext(LikeQueryAlgorithmContext.class,0);
		}
		public EncryptColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterEncryptColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitEncryptColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitEncryptColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncryptColumnDefinitionContext encryptColumnDefinition() throws RecognitionException {
		EncryptColumnDefinitionContext _localctx = new EncryptColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_encryptColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LP_);
			setState(140);
			columnDefinition();
			setState(141);
			match(COMMA_);
			setState(142);
			cipherColumnDefinition();
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(143);
				match(COMMA_);
				setState(144);
				assistedQueryColumnDefinition();
				}
				break;
			}
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(147);
				match(COMMA_);
				setState(148);
				likeQueryColumnDefinition();
				}
				break;
			}
			setState(151);
			match(COMMA_);
			setState(152);
			encryptAlgorithm();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(153);
				match(COMMA_);
				setState(154);
				assistedQueryAlgorithm();
				}
				break;
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(157);
				match(COMMA_);
				setState(158);
				likeQueryAlgorithm();
				}
			}

			setState(161);
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
		public TerminalNode NAME() { return getToken(EncryptDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(EncryptDistSQLStatementParser.EQ_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(NAME);
			setState(164);
			match(EQ_);
			setState(165);
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
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(EncryptDistSQLStatementParser.IDENTIFIER_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
	public static class CipherColumnDefinitionContext extends ParserRuleContext {
		public TerminalNode CIPHER() { return getToken(EncryptDistSQLStatementParser.CIPHER, 0); }
		public TerminalNode EQ_() { return getToken(EncryptDistSQLStatementParser.EQ_, 0); }
		public CipherColumnNameContext cipherColumnName() {
			return getRuleContext(CipherColumnNameContext.class,0);
		}
		public CipherColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cipherColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterCipherColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitCipherColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitCipherColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CipherColumnDefinitionContext cipherColumnDefinition() throws RecognitionException {
		CipherColumnDefinitionContext _localctx = new CipherColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cipherColumnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(CIPHER);
			setState(170);
			match(EQ_);
			setState(171);
			cipherColumnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CipherColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(EncryptDistSQLStatementParser.IDENTIFIER_, 0); }
		public CipherColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cipherColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterCipherColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitCipherColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitCipherColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CipherColumnNameContext cipherColumnName() throws RecognitionException {
		CipherColumnNameContext _localctx = new CipherColumnNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cipherColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
	public static class AssistedQueryColumnDefinitionContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(EncryptDistSQLStatementParser.EQ_, 0); }
		public AssistedQueryColumnNameContext assistedQueryColumnName() {
			return getRuleContext(AssistedQueryColumnNameContext.class,0);
		}
		public TerminalNode ASSISTED_QUERY() { return getToken(EncryptDistSQLStatementParser.ASSISTED_QUERY, 0); }
		public TerminalNode ASSISTED_QUERY_COLUMN() { return getToken(EncryptDistSQLStatementParser.ASSISTED_QUERY_COLUMN, 0); }
		public AssistedQueryColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assistedQueryColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterAssistedQueryColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitAssistedQueryColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitAssistedQueryColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssistedQueryColumnDefinitionContext assistedQueryColumnDefinition() throws RecognitionException {
		AssistedQueryColumnDefinitionContext _localctx = new AssistedQueryColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assistedQueryColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==ASSISTED_QUERY || _la==ASSISTED_QUERY_COLUMN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			match(EQ_);
			setState(177);
			assistedQueryColumnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssistedQueryColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(EncryptDistSQLStatementParser.IDENTIFIER_, 0); }
		public AssistedQueryColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assistedQueryColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterAssistedQueryColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitAssistedQueryColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitAssistedQueryColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssistedQueryColumnNameContext assistedQueryColumnName() throws RecognitionException {
		AssistedQueryColumnNameContext _localctx = new AssistedQueryColumnNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assistedQueryColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
	public static class LikeQueryColumnDefinitionContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(EncryptDistSQLStatementParser.EQ_, 0); }
		public LikeQueryColumnNameContext likeQueryColumnName() {
			return getRuleContext(LikeQueryColumnNameContext.class,0);
		}
		public TerminalNode LIKE_QUERY() { return getToken(EncryptDistSQLStatementParser.LIKE_QUERY, 0); }
		public TerminalNode LIKE_QUERY_COLUMN() { return getToken(EncryptDistSQLStatementParser.LIKE_QUERY_COLUMN, 0); }
		public LikeQueryColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeQueryColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterLikeQueryColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitLikeQueryColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitLikeQueryColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeQueryColumnDefinitionContext likeQueryColumnDefinition() throws RecognitionException {
		LikeQueryColumnDefinitionContext _localctx = new LikeQueryColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_likeQueryColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==LIKE_QUERY || _la==LIKE_QUERY_COLUMN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			match(EQ_);
			setState(183);
			likeQueryColumnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LikeQueryColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(EncryptDistSQLStatementParser.IDENTIFIER_, 0); }
		public LikeQueryColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeQueryColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterLikeQueryColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitLikeQueryColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitLikeQueryColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeQueryColumnNameContext likeQueryColumnName() throws RecognitionException {
		LikeQueryColumnNameContext _localctx = new LikeQueryColumnNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_likeQueryColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
	public static class EncryptAlgorithmContext extends ParserRuleContext {
		public TerminalNode ENCRYPT_ALGORITHM() { return getToken(EncryptDistSQLStatementParser.ENCRYPT_ALGORITHM, 0); }
		public TerminalNode LP_() { return getToken(EncryptDistSQLStatementParser.LP_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(EncryptDistSQLStatementParser.RP_, 0); }
		public EncryptAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterEncryptAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitEncryptAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitEncryptAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncryptAlgorithmContext encryptAlgorithm() throws RecognitionException {
		EncryptAlgorithmContext _localctx = new EncryptAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_encryptAlgorithm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ENCRYPT_ALGORITHM);
			setState(188);
			match(LP_);
			setState(189);
			algorithmDefinition();
			setState(190);
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
	public static class AssistedQueryAlgorithmContext extends ParserRuleContext {
		public TerminalNode ASSISTED_QUERY_ALGORITHM() { return getToken(EncryptDistSQLStatementParser.ASSISTED_QUERY_ALGORITHM, 0); }
		public TerminalNode LP_() { return getToken(EncryptDistSQLStatementParser.LP_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(EncryptDistSQLStatementParser.RP_, 0); }
		public AssistedQueryAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assistedQueryAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterAssistedQueryAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitAssistedQueryAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitAssistedQueryAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssistedQueryAlgorithmContext assistedQueryAlgorithm() throws RecognitionException {
		AssistedQueryAlgorithmContext _localctx = new AssistedQueryAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assistedQueryAlgorithm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ASSISTED_QUERY_ALGORITHM);
			setState(193);
			match(LP_);
			setState(194);
			algorithmDefinition();
			setState(195);
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
	public static class LikeQueryAlgorithmContext extends ParserRuleContext {
		public TerminalNode LIKE_QUERY_ALGORITHM() { return getToken(EncryptDistSQLStatementParser.LIKE_QUERY_ALGORITHM, 0); }
		public TerminalNode LP_() { return getToken(EncryptDistSQLStatementParser.LP_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(EncryptDistSQLStatementParser.RP_, 0); }
		public LikeQueryAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeQueryAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterLikeQueryAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitLikeQueryAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitLikeQueryAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeQueryAlgorithmContext likeQueryAlgorithm() throws RecognitionException {
		LikeQueryAlgorithmContext _localctx = new LikeQueryAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_likeQueryAlgorithm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LIKE_QUERY_ALGORITHM);
			setState(198);
			match(LP_);
			setState(199);
			algorithmDefinition();
			setState(200);
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
	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EncryptDistSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(EncryptDistSQLStatementParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IF);
			setState(203);
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
		public TerminalNode IF() { return getToken(EncryptDistSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(EncryptDistSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(EncryptDistSQLStatementParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(IF);
			setState(206);
			match(NOT);
			setState(207);
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
		public TerminalNode STRING_() { return getToken(EncryptDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(EncryptDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(EncryptDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(EncryptDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EncryptDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(210);
					match(MINUS_);
					}
				}

				setState(213);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
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
		public TerminalNode TYPE() { return getToken(EncryptDistSQLStatementParser.TYPE, 0); }
		public TerminalNode LP_() { return getToken(EncryptDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(EncryptDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(EncryptDistSQLStatementParser.EQ_, 0); }
		public AlgorithmTypeNameContext algorithmTypeName() {
			return getRuleContext(AlgorithmTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(EncryptDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(EncryptDistSQLStatementParser.COMMA_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public AlgorithmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterAlgorithmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitAlgorithmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDefinitionContext algorithmDefinition() throws RecognitionException {
		AlgorithmDefinitionContext _localctx = new AlgorithmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_algorithmDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(TYPE);
			setState(219);
			match(LP_);
			setState(220);
			match(NAME);
			setState(221);
			match(EQ_);
			setState(222);
			algorithmTypeName();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(223);
				match(COMMA_);
				setState(224);
				propertiesDefinition();
				}
			}

			setState(227);
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
		public TerminalNode STRING_() { return getToken(EncryptDistSQLStatementParser.STRING_, 0); }
		public BuildInEncryptAlgorithmTypeContext buildInEncryptAlgorithmType() {
			return getRuleContext(BuildInEncryptAlgorithmTypeContext.class,0);
		}
		public AlgorithmTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterAlgorithmTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitAlgorithmTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmTypeNameContext algorithmTypeName() throws RecognitionException {
		AlgorithmTypeNameContext _localctx = new AlgorithmTypeNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_algorithmTypeName);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(STRING_);
				}
				break;
			case MD5:
			case AES:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				buildInEncryptAlgorithmType();
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
	public static class BuildInEncryptAlgorithmTypeContext extends ParserRuleContext {
		public StandardEncryptAlgorithmContext standardEncryptAlgorithm() {
			return getRuleContext(StandardEncryptAlgorithmContext.class,0);
		}
		public AssistedEncryptAlgorithmContext assistedEncryptAlgorithm() {
			return getRuleContext(AssistedEncryptAlgorithmContext.class,0);
		}
		public BuildInEncryptAlgorithmTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInEncryptAlgorithmType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterBuildInEncryptAlgorithmType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitBuildInEncryptAlgorithmType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitBuildInEncryptAlgorithmType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInEncryptAlgorithmTypeContext buildInEncryptAlgorithmType() throws RecognitionException {
		BuildInEncryptAlgorithmTypeContext _localctx = new BuildInEncryptAlgorithmTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_buildInEncryptAlgorithmType);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AES:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				standardEncryptAlgorithm();
				}
				break;
			case MD5:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				assistedEncryptAlgorithm();
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
	public static class StandardEncryptAlgorithmContext extends ParserRuleContext {
		public TerminalNode AES() { return getToken(EncryptDistSQLStatementParser.AES, 0); }
		public StandardEncryptAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardEncryptAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterStandardEncryptAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitStandardEncryptAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitStandardEncryptAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardEncryptAlgorithmContext standardEncryptAlgorithm() throws RecognitionException {
		StandardEncryptAlgorithmContext _localctx = new StandardEncryptAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_standardEncryptAlgorithm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(AES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssistedEncryptAlgorithmContext extends ParserRuleContext {
		public TerminalNode MD5() { return getToken(EncryptDistSQLStatementParser.MD5, 0); }
		public AssistedEncryptAlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assistedEncryptAlgorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterAssistedEncryptAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitAssistedEncryptAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitAssistedEncryptAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssistedEncryptAlgorithmContext assistedEncryptAlgorithm() throws RecognitionException {
		AssistedEncryptAlgorithmContext _localctx = new AssistedEncryptAlgorithmContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assistedEncryptAlgorithm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(MD5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode PROPERTIES() { return getToken(EncryptDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(EncryptDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EncryptDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefinitionContext propertiesDefinition() throws RecognitionException {
		PropertiesDefinitionContext _localctx = new PropertiesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_propertiesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PROPERTIES);
			setState(242);
			match(LP_);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(243);
				properties();
				}
			}

			setState(246);
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
		public List<TerminalNode> COMMA_() { return getTokens(EncryptDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EncryptDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			property();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(249);
				match(COMMA_);
				setState(250);
				property();
				}
				}
				setState(255);
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
		public TerminalNode EQ_() { return getToken(EncryptDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(EncryptDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(257);
			match(EQ_);
			setState(258);
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
		public TerminalNode IDENTIFIER_() { return getToken(EncryptDistSQLStatementParser.IDENTIFIER_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
	public static class ShowEncryptRulesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(EncryptDistSQLStatementParser.SHOW, 0); }
		public TerminalNode ENCRYPT() { return getToken(EncryptDistSQLStatementParser.ENCRYPT, 0); }
		public TableRuleContext tableRule() {
			return getRuleContext(TableRuleContext.class,0);
		}
		public TerminalNode RULES() { return getToken(EncryptDistSQLStatementParser.RULES, 0); }
		public TerminalNode FROM() { return getToken(EncryptDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(EncryptDistSQLStatementParser.TABLE, 0); }
		public ShowEncryptRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showEncryptRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterShowEncryptRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitShowEncryptRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitShowEncryptRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowEncryptRulesContext showEncryptRules() throws RecognitionException {
		ShowEncryptRulesContext _localctx = new ShowEncryptRulesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_showEncryptRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(SHOW);
			setState(263);
			match(ENCRYPT);
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE:
			case TABLE:
				{
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(264);
					match(TABLE);
					}
				}

				setState(267);
				tableRule();
				}
				break;
			case RULES:
				{
				setState(268);
				match(RULES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(271);
				match(FROM);
				setState(272);
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
		public TerminalNode RULE() { return getToken(EncryptDistSQLStatementParser.RULE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterTableRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitTableRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRuleContext tableRule() throws RecognitionException {
		TableRuleContext _localctx = new TableRuleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tableRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(RULE);
			setState(276);
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
	public static class CountEncryptRuleContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(EncryptDistSQLStatementParser.COUNT, 0); }
		public TerminalNode ENCRYPT() { return getToken(EncryptDistSQLStatementParser.ENCRYPT, 0); }
		public TerminalNode RULE() { return getToken(EncryptDistSQLStatementParser.RULE, 0); }
		public TerminalNode FROM() { return getToken(EncryptDistSQLStatementParser.FROM, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public CountEncryptRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countEncryptRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterCountEncryptRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitCountEncryptRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitCountEncryptRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountEncryptRuleContext countEncryptRule() throws RecognitionException {
		CountEncryptRuleContext _localctx = new CountEncryptRuleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_countEncryptRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(COUNT);
			setState(279);
			match(ENCRYPT);
			setState(280);
			match(RULE);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(281);
				match(FROM);
				setState(282);
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
		public TerminalNode IDENTIFIER_() { return getToken(EncryptDistSQLStatementParser.IDENTIFIER_, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
	public static class ShowEncryptAlgorithmPluginsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(EncryptDistSQLStatementParser.SHOW, 0); }
		public TerminalNode ENCRYPT() { return getToken(EncryptDistSQLStatementParser.ENCRYPT, 0); }
		public TerminalNode ALGORITHM() { return getToken(EncryptDistSQLStatementParser.ALGORITHM, 0); }
		public TerminalNode PLUGINS() { return getToken(EncryptDistSQLStatementParser.PLUGINS, 0); }
		public ShowEncryptAlgorithmPluginsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showEncryptAlgorithmPlugins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).enterShowEncryptAlgorithmPlugins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EncryptDistSQLStatementListener ) ((EncryptDistSQLStatementListener)listener).exitShowEncryptAlgorithmPlugins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EncryptDistSQLStatementVisitor ) return ((EncryptDistSQLStatementVisitor<? extends T>)visitor).visitShowEncryptAlgorithmPlugins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowEncryptAlgorithmPluginsContext showEncryptAlgorithmPlugins() throws RecognitionException {
		ShowEncryptAlgorithmPluginsContext _localctx = new ShowEncryptAlgorithmPluginsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_showEncryptAlgorithmPlugins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(SHOW);
			setState(288);
			match(ENCRYPT);
			setState(289);
			match(ALGORITHM);
			setState(290);
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
		"\u0004\u0001T\u0125\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000M\b\u0000\u0001\u0000\u0003\u0000P\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001X\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001]\b\u0001\n\u0001\f\u0001"+
		"`\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002h\b\u0002\n\u0002\f\u0002k\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003q\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003v\b\u0003\n\u0003\f\u0003y\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0084\b\u0005\n\u0005"+
		"\f\u0005\u0087\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0092\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0096\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009c\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00a0\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00d4\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00d9\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e2\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00e8\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u00ec\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00f5\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u00fc\b\u001b\n\u001b\f\u001b\u00ff\t\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u010a\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u010e"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0112\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u011c"+
		"\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0000"+
		"\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0002\u0001\u0000?@\u0001"+
		"\u0000AB\u011e\u0000L\u0001\u0000\u0000\u0000\u0002S\u0001\u0000\u0000"+
		"\u0000\u0004a\u0001\u0000\u0000\u0000\u0006l\u0001\u0000\u0000\u0000\b"+
		"z\u0001\u0000\u0000\u0000\n}\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000"+
		"\u0000\u0000\u000e\u00a3\u0001\u0000\u0000\u0000\u0010\u00a7\u0001\u0000"+
		"\u0000\u0000\u0012\u00a9\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000"+
		"\u0000\u0000\u0016\u00af\u0001\u0000\u0000\u0000\u0018\u00b3\u0001\u0000"+
		"\u0000\u0000\u001a\u00b5\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000"+
		"\u0000\u0000\u001e\u00bb\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000\u0000"+
		"\u0000\"\u00c5\u0001\u0000\u0000\u0000$\u00ca\u0001\u0000\u0000\u0000"+
		"&\u00cd\u0001\u0000\u0000\u0000(\u00d8\u0001\u0000\u0000\u0000*\u00da"+
		"\u0001\u0000\u0000\u0000,\u00e7\u0001\u0000\u0000\u0000.\u00eb\u0001\u0000"+
		"\u0000\u00000\u00ed\u0001\u0000\u0000\u00002\u00ef\u0001\u0000\u0000\u0000"+
		"4\u00f1\u0001\u0000\u0000\u00006\u00f8\u0001\u0000\u0000\u00008\u0100"+
		"\u0001\u0000\u0000\u0000:\u0104\u0001\u0000\u0000\u0000<\u0106\u0001\u0000"+
		"\u0000\u0000>\u0113\u0001\u0000\u0000\u0000@\u0116\u0001\u0000\u0000\u0000"+
		"B\u011d\u0001\u0000\u0000\u0000D\u011f\u0001\u0000\u0000\u0000FM\u0003"+
		"\u0002\u0001\u0000GM\u0003\u0004\u0002\u0000HM\u0003\u0006\u0003\u0000"+
		"IM\u0003<\u001e\u0000JM\u0003@ \u0000KM\u0003D\"\u0000LF\u0001\u0000\u0000"+
		"\u0000LG\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MO\u0001"+
		"\u0000\u0000\u0000NP\u0005(\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0000\u0000\u0001"+
		"R\u0001\u0001\u0000\u0000\u0000ST\u0005,\u0000\u0000TU\u00053\u0000\u0000"+
		"UW\u00051\u0000\u0000VX\u0003&\u0013\u0000WV\u0001\u0000\u0000\u0000W"+
		"X\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y^\u0003\b\u0004\u0000"+
		"Z[\u0005\"\u0000\u0000[]\u0003\b\u0004\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_\u0003\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005"+
		"-\u0000\u0000bc\u00053\u0000\u0000cd\u00051\u0000\u0000di\u0003\b\u0004"+
		"\u0000ef\u0005\"\u0000\u0000fh\u0003\b\u0004\u0000ge\u0001\u0000\u0000"+
		"\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000j\u0005\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lm\u0005.\u0000\u0000mn\u00053\u0000\u0000np\u00051\u0000\u0000oq\u0003"+
		"$\u0012\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rw\u0003:\u001d\u0000st\u0005\"\u0000\u0000tv\u0003"+
		":\u001d\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0007\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z{\u0003:\u001d\u0000{|\u0003\n\u0005"+
		"\u0000|\t\u0001\u0000\u0000\u0000}~\u0005\u001c\u0000\u0000~\u007f\u0005"+
		"=\u0000\u0000\u007f\u0080\u0005\u001c\u0000\u0000\u0080\u0085\u0003\f"+
		"\u0006\u0000\u0081\u0082\u0005\"\u0000\u0000\u0082\u0084\u0003\f\u0006"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\u001d\u0000\u0000\u0089\u008a\u0005\u001d\u0000"+
		"\u0000\u008a\u000b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001c\u0000"+
		"\u0000\u008c\u008d\u0003\u000e\u0007\u0000\u008d\u008e\u0005\"\u0000\u0000"+
		"\u008e\u0091\u0003\u0012\t\u0000\u008f\u0090\u0005\"\u0000\u0000\u0090"+
		"\u0092\u0003\u0016\u000b\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005\"\u0000\u0000\u0094\u0096\u0003\u001a\r\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\"\u0000\u0000\u0098\u009b\u0003"+
		"\u001e\u000f\u0000\u0099\u009a\u0005\"\u0000\u0000\u009a\u009c\u0003 "+
		"\u0010\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009e\u0005\"\u0000"+
		"\u0000\u009e\u00a0\u0003\"\u0011\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005\u001d\u0000\u0000\u00a2\r\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u00058\u0000\u0000\u00a4\u00a5\u0005\u0015\u0000\u0000\u00a5\u00a6"+
		"\u0003\u0010\b\u0000\u00a6\u000f\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"N\u0000\u0000\u00a8\u0011\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005>\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0015\u0000\u0000\u00ab\u00ac\u0003\u0014\n\u0000"+
		"\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005N\u0000\u0000\u00ae"+
		"\u0015\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0015\u0000\u0000\u00b1\u00b2\u0003\u0018\f\u0000\u00b2\u0017"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005N\u0000\u0000\u00b4\u0019\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0007\u0001\u0000\u0000\u00b6\u00b7\u0005"+
		"\u0015\u0000\u0000\u00b7\u00b8\u0003\u001c\u000e\u0000\u00b8\u001b\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0005N\u0000\u0000\u00ba\u001d\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u00055\u0000\u0000\u00bc\u00bd\u0005\u001c\u0000"+
		"\u0000\u00bd\u00be\u0003*\u0015\u0000\u00be\u00bf\u0005\u001d\u0000\u0000"+
		"\u00bf\u001f\u0001\u0000\u0000\u0000\u00c0\u00c1\u00056\u0000\u0000\u00c1"+
		"\u00c2\u0005\u001c\u0000\u0000\u00c2\u00c3\u0003*\u0015\u0000\u00c3\u00c4"+
		"\u0005\u001d\u0000\u0000\u00c4!\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"7\u0000\u0000\u00c6\u00c7\u0005\u001c\u0000\u0000\u00c7\u00c8\u0003*\u0015"+
		"\u0000\u00c8\u00c9\u0005\u001d\u0000\u0000\u00c9#\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005E\u0000\u0000\u00cb\u00cc\u0005F\u0000\u0000\u00cc%"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005E\u0000\u0000\u00ce\u00cf\u0005"+
		"J\u0000\u0000\u00cf\u00d0\u0005F\u0000\u0000\u00d0\'\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d9\u0005O\u0000\u0000\u00d2\u00d4\u0005\r\u0000\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d9\u0005P\u0000\u0000\u00d6"+
		"\u00d9\u0005C\u0000\u0000\u00d7\u00d9\u0005D\u0000\u0000\u00d8\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9)\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u00054\u0000\u0000\u00db\u00dc\u0005\u001c\u0000"+
		"\u0000\u00dc\u00dd\u00058\u0000\u0000\u00dd\u00de\u0005\u0015\u0000\u0000"+
		"\u00de\u00e1\u0003,\u0016\u0000\u00df\u00e0\u0005\"\u0000\u0000\u00e0"+
		"\u00e2\u00034\u001a\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u001d\u0000\u0000\u00e4+\u0001\u0000\u0000\u0000\u00e5\u00e8\u0005"+
		"O\u0000\u0000\u00e6\u00e8\u0003.\u0017\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8-\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u00030\u0018\u0000\u00ea\u00ec\u00032\u0019\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec/\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005I\u0000\u0000\u00ee1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005H\u0000\u0000\u00f03\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u00059\u0000\u0000\u00f2\u00f4\u0005\u001c\u0000\u0000\u00f3\u00f5"+
		"\u00036\u001b\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"\u001d\u0000\u0000\u00f75\u0001\u0000\u0000\u0000\u00f8\u00fd\u00038\u001c"+
		"\u0000\u00f9\u00fa\u0005\"\u0000\u0000\u00fa\u00fc\u00038\u001c\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe7\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005O\u0000\u0000\u0101\u0102\u0005\u0015\u0000\u0000\u0102\u0103"+
		"\u0003(\u0014\u0000\u01039\u0001\u0000\u0000\u0000\u0104\u0105\u0005N"+
		"\u0000\u0000\u0105;\u0001\u0000\u0000\u0000\u0106\u0107\u0005/\u0000\u0000"+
		"\u0107\u010d\u00053\u0000\u0000\u0108\u010a\u0005<\u0000\u0000\u0109\u0108"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0003>\u001f\u0000\u010c\u010e\u0005"+
		";\u0000\u0000\u010d\u0109\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u0110\u00052\u0000"+
		"\u0000\u0110\u0112\u0003B!\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112=\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u00051\u0000\u0000\u0114\u0115\u0003:\u001d\u0000\u0115?\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0005G\u0000\u0000\u0117\u0118\u00053\u0000\u0000"+
		"\u0118\u011b\u00051\u0000\u0000\u0119\u011a\u00052\u0000\u0000\u011a\u011c"+
		"\u0003B!\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011cA\u0001\u0000\u0000\u0000\u011d\u011e\u0005N\u0000\u0000"+
		"\u011eC\u0001\u0000\u0000\u0000\u011f\u0120\u0005/\u0000\u0000\u0120\u0121"+
		"\u00053\u0000\u0000\u0121\u0122\u0005K\u0000\u0000\u0122\u0123\u0005L"+
		"\u0000\u0000\u0123E\u0001\u0000\u0000\u0000\u0017LOW^ipw\u0085\u0091\u0095"+
		"\u009b\u009f\u00d3\u00d8\u00e1\u00e7\u00eb\u00f4\u00fd\u0109\u010d\u0111"+
		"\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /Users/code/gitcode/shardingsphere/kernel/data-pipeline/distsql/parser/src/main/antlr4/cdc/org/apache/shardingsphere/distsql/parser/autogen/CDCDistSQLStatement.g4 by ANTLR 4.13.2
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
public class CDCDistSQLStatementParser extends Parser {
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
		DL_=43, TRUE=44, FALSE=45, WS=46, SHOW=47, STREAMING=48, LIST=49, STATUS=50, 
		DROP=51, TYPE=52, NAME=53, PROPERTIES=54, ALTER=55, RULE=56, READ=57, 
		WORKER_THREAD=58, BATCH_SIZE=59, SHARDING_SIZE=60, RATE_LIMITER=61, STREAM_CHANNEL=62, 
		WRITE=63, FOR_GENERATOR=64, IDENTIFIER_=65, STRING_=66, INT_=67;
	public static final int
		RULE_execute = 0, RULE_showStreamingRule = 1, RULE_alterStreamingRule = 2, 
		RULE_transmissionRule = 3, RULE_readDefinition = 4, RULE_writeDefinition = 5, 
		RULE_workerThread = 6, RULE_batchSize = 7, RULE_shardingSize = 8, RULE_rateLimiter = 9, 
		RULE_streamChannel = 10, RULE_showStreamingList = 11, RULE_showStreamingStatus = 12, 
		RULE_dropStreaming = 13, RULE_jobId = 14, RULE_algorithmDefinition = 15, 
		RULE_algorithmTypeName = 16, RULE_propertiesDefinition = 17, RULE_properties = 18, 
		RULE_property = 19, RULE_literal = 20, RULE_intValue = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "showStreamingRule", "alterStreamingRule", "transmissionRule", 
			"readDefinition", "writeDefinition", "workerThread", "batchSize", "shardingSize", 
			"rateLimiter", "streamChannel", "showStreamingList", "showStreamingStatus", 
			"dropStreaming", "jobId", "algorithmDefinition", "algorithmTypeName", 
			"propertiesDefinition", "properties", "property", "literal", "intValue"
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
			null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"BQ_", "QUESTION_", "AT_", "SEMI_", "JSONSEPARATOR_", "UL_", "DL_", "TRUE", 
			"FALSE", "WS", "SHOW", "STREAMING", "LIST", "STATUS", "DROP", "TYPE", 
			"NAME", "PROPERTIES", "ALTER", "RULE", "READ", "WORKER_THREAD", "BATCH_SIZE", 
			"SHARDING_SIZE", "RATE_LIMITER", "STREAM_CHANNEL", "WRITE", "FOR_GENERATOR", 
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
	public String getGrammarFileName() { return "CDCDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CDCDistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CDCDistSQLStatementParser.EOF, 0); }
		public ShowStreamingListContext showStreamingList() {
			return getRuleContext(ShowStreamingListContext.class,0);
		}
		public ShowStreamingStatusContext showStreamingStatus() {
			return getRuleContext(ShowStreamingStatusContext.class,0);
		}
		public DropStreamingContext dropStreaming() {
			return getRuleContext(DropStreamingContext.class,0);
		}
		public ShowStreamingRuleContext showStreamingRule() {
			return getRuleContext(ShowStreamingRuleContext.class,0);
		}
		public AlterStreamingRuleContext alterStreamingRule() {
			return getRuleContext(AlterStreamingRuleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(CDCDistSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(44);
				showStreamingList();
				}
				break;
			case 2:
				{
				setState(45);
				showStreamingStatus();
				}
				break;
			case 3:
				{
				setState(46);
				dropStreaming();
				}
				break;
			case 4:
				{
				setState(47);
				showStreamingRule();
				}
				break;
			case 5:
				{
				setState(48);
				alterStreamingRule();
				}
				break;
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(51);
				match(SEMI_);
				}
			}

			setState(54);
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
	public static class ShowStreamingRuleContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(CDCDistSQLStatementParser.SHOW, 0); }
		public TerminalNode STREAMING() { return getToken(CDCDistSQLStatementParser.STREAMING, 0); }
		public TerminalNode RULE() { return getToken(CDCDistSQLStatementParser.RULE, 0); }
		public ShowStreamingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStreamingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterShowStreamingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitShowStreamingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitShowStreamingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStreamingRuleContext showStreamingRule() throws RecognitionException {
		ShowStreamingRuleContext _localctx = new ShowStreamingRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_showStreamingRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(SHOW);
			setState(57);
			match(STREAMING);
			setState(58);
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
	public static class AlterStreamingRuleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(CDCDistSQLStatementParser.ALTER, 0); }
		public TerminalNode STREAMING() { return getToken(CDCDistSQLStatementParser.STREAMING, 0); }
		public TerminalNode RULE() { return getToken(CDCDistSQLStatementParser.RULE, 0); }
		public TransmissionRuleContext transmissionRule() {
			return getRuleContext(TransmissionRuleContext.class,0);
		}
		public AlterStreamingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStreamingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterAlterStreamingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitAlterStreamingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitAlterStreamingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterStreamingRuleContext alterStreamingRule() throws RecognitionException {
		AlterStreamingRuleContext _localctx = new AlterStreamingRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterStreamingRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ALTER);
			setState(61);
			match(STREAMING);
			setState(62);
			match(RULE);
			setState(63);
			transmissionRule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransmissionRuleContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(CDCDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(CDCDistSQLStatementParser.RP_, 0); }
		public ReadDefinitionContext readDefinition() {
			return getRuleContext(ReadDefinitionContext.class,0);
		}
		public WriteDefinitionContext writeDefinition() {
			return getRuleContext(WriteDefinitionContext.class,0);
		}
		public StreamChannelContext streamChannel() {
			return getRuleContext(StreamChannelContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(CDCDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(CDCDistSQLStatementParser.COMMA_, i);
		}
		public TransmissionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transmissionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterTransmissionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitTransmissionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitTransmissionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransmissionRuleContext transmissionRule() throws RecognitionException {
		TransmissionRuleContext _localctx = new TransmissionRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_transmissionRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(LP_);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READ) {
				{
				setState(66);
				readDefinition();
				}
			}

			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(69);
					match(COMMA_);
					}
				}

				setState(72);
				writeDefinition();
				}
				break;
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==STREAM_CHANNEL) {
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(75);
					match(COMMA_);
					}
				}

				setState(78);
				streamChannel();
				}
			}

			setState(81);
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
	public static class ReadDefinitionContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CDCDistSQLStatementParser.READ, 0); }
		public TerminalNode LP_() { return getToken(CDCDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(CDCDistSQLStatementParser.RP_, 0); }
		public WorkerThreadContext workerThread() {
			return getRuleContext(WorkerThreadContext.class,0);
		}
		public BatchSizeContext batchSize() {
			return getRuleContext(BatchSizeContext.class,0);
		}
		public ShardingSizeContext shardingSize() {
			return getRuleContext(ShardingSizeContext.class,0);
		}
		public RateLimiterContext rateLimiter() {
			return getRuleContext(RateLimiterContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(CDCDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(CDCDistSQLStatementParser.COMMA_, i);
		}
		public ReadDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterReadDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitReadDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitReadDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadDefinitionContext readDefinition() throws RecognitionException {
		ReadDefinitionContext _localctx = new ReadDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_readDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(READ);
			setState(84);
			match(LP_);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORKER_THREAD) {
				{
				setState(85);
				workerThread();
				}
			}

			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(88);
					match(COMMA_);
					}
				}

				setState(91);
				batchSize();
				}
				break;
			}
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(94);
					match(COMMA_);
					}
				}

				setState(97);
				shardingSize();
				}
				break;
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==RATE_LIMITER) {
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(100);
					match(COMMA_);
					}
				}

				setState(103);
				rateLimiter();
				}
			}

			setState(106);
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
	public static class WriteDefinitionContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CDCDistSQLStatementParser.WRITE, 0); }
		public TerminalNode LP_() { return getToken(CDCDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(CDCDistSQLStatementParser.RP_, 0); }
		public WorkerThreadContext workerThread() {
			return getRuleContext(WorkerThreadContext.class,0);
		}
		public BatchSizeContext batchSize() {
			return getRuleContext(BatchSizeContext.class,0);
		}
		public RateLimiterContext rateLimiter() {
			return getRuleContext(RateLimiterContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(CDCDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(CDCDistSQLStatementParser.COMMA_, i);
		}
		public WriteDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterWriteDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitWriteDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitWriteDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteDefinitionContext writeDefinition() throws RecognitionException {
		WriteDefinitionContext _localctx = new WriteDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_writeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WRITE);
			setState(109);
			match(LP_);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORKER_THREAD) {
				{
				setState(110);
				workerThread();
				}
			}

			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(113);
					match(COMMA_);
					}
				}

				setState(116);
				batchSize();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==RATE_LIMITER) {
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(119);
					match(COMMA_);
					}
				}

				setState(122);
				rateLimiter();
				}
			}

			setState(125);
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
	public static class WorkerThreadContext extends ParserRuleContext {
		public TerminalNode WORKER_THREAD() { return getToken(CDCDistSQLStatementParser.WORKER_THREAD, 0); }
		public TerminalNode EQ_() { return getToken(CDCDistSQLStatementParser.EQ_, 0); }
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public WorkerThreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workerThread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterWorkerThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitWorkerThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitWorkerThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorkerThreadContext workerThread() throws RecognitionException {
		WorkerThreadContext _localctx = new WorkerThreadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_workerThread);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(WORKER_THREAD);
			setState(128);
			match(EQ_);
			setState(129);
			intValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BatchSizeContext extends ParserRuleContext {
		public TerminalNode BATCH_SIZE() { return getToken(CDCDistSQLStatementParser.BATCH_SIZE, 0); }
		public TerminalNode EQ_() { return getToken(CDCDistSQLStatementParser.EQ_, 0); }
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public BatchSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batchSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterBatchSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitBatchSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitBatchSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BatchSizeContext batchSize() throws RecognitionException {
		BatchSizeContext _localctx = new BatchSizeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_batchSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(BATCH_SIZE);
			setState(132);
			match(EQ_);
			setState(133);
			intValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShardingSizeContext extends ParserRuleContext {
		public TerminalNode SHARDING_SIZE() { return getToken(CDCDistSQLStatementParser.SHARDING_SIZE, 0); }
		public TerminalNode EQ_() { return getToken(CDCDistSQLStatementParser.EQ_, 0); }
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public ShardingSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardingSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterShardingSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitShardingSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitShardingSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardingSizeContext shardingSize() throws RecognitionException {
		ShardingSizeContext _localctx = new ShardingSizeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shardingSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(SHARDING_SIZE);
			setState(136);
			match(EQ_);
			setState(137);
			intValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RateLimiterContext extends ParserRuleContext {
		public TerminalNode RATE_LIMITER() { return getToken(CDCDistSQLStatementParser.RATE_LIMITER, 0); }
		public TerminalNode LP_() { return getToken(CDCDistSQLStatementParser.LP_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(CDCDistSQLStatementParser.RP_, 0); }
		public RateLimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rateLimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterRateLimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitRateLimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitRateLimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RateLimiterContext rateLimiter() throws RecognitionException {
		RateLimiterContext _localctx = new RateLimiterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rateLimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RATE_LIMITER);
			setState(140);
			match(LP_);
			setState(141);
			algorithmDefinition();
			setState(142);
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
	public static class StreamChannelContext extends ParserRuleContext {
		public TerminalNode STREAM_CHANNEL() { return getToken(CDCDistSQLStatementParser.STREAM_CHANNEL, 0); }
		public TerminalNode LP_() { return getToken(CDCDistSQLStatementParser.LP_, 0); }
		public AlgorithmDefinitionContext algorithmDefinition() {
			return getRuleContext(AlgorithmDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(CDCDistSQLStatementParser.RP_, 0); }
		public StreamChannelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamChannel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterStreamChannel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitStreamChannel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitStreamChannel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamChannelContext streamChannel() throws RecognitionException {
		StreamChannelContext _localctx = new StreamChannelContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_streamChannel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(STREAM_CHANNEL);
			setState(145);
			match(LP_);
			setState(146);
			algorithmDefinition();
			setState(147);
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
	public static class ShowStreamingListContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(CDCDistSQLStatementParser.SHOW, 0); }
		public TerminalNode STREAMING() { return getToken(CDCDistSQLStatementParser.STREAMING, 0); }
		public TerminalNode LIST() { return getToken(CDCDistSQLStatementParser.LIST, 0); }
		public ShowStreamingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStreamingList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterShowStreamingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitShowStreamingList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitShowStreamingList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStreamingListContext showStreamingList() throws RecognitionException {
		ShowStreamingListContext _localctx = new ShowStreamingListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_showStreamingList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(SHOW);
			setState(150);
			match(STREAMING);
			setState(151);
			match(LIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShowStreamingStatusContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(CDCDistSQLStatementParser.SHOW, 0); }
		public TerminalNode STREAMING() { return getToken(CDCDistSQLStatementParser.STREAMING, 0); }
		public TerminalNode STATUS() { return getToken(CDCDistSQLStatementParser.STATUS, 0); }
		public JobIdContext jobId() {
			return getRuleContext(JobIdContext.class,0);
		}
		public ShowStreamingStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStreamingStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterShowStreamingStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitShowStreamingStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitShowStreamingStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStreamingStatusContext showStreamingStatus() throws RecognitionException {
		ShowStreamingStatusContext _localctx = new ShowStreamingStatusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_showStreamingStatus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(SHOW);
			setState(154);
			match(STREAMING);
			setState(155);
			match(STATUS);
			setState(156);
			jobId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropStreamingContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(CDCDistSQLStatementParser.DROP, 0); }
		public TerminalNode STREAMING() { return getToken(CDCDistSQLStatementParser.STREAMING, 0); }
		public JobIdContext jobId() {
			return getRuleContext(JobIdContext.class,0);
		}
		public DropStreamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStreaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterDropStreaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitDropStreaming(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitDropStreaming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStreamingContext dropStreaming() throws RecognitionException {
		DropStreamingContext _localctx = new DropStreamingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dropStreaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DROP);
			setState(159);
			match(STREAMING);
			setState(160);
			jobId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JobIdContext extends ParserRuleContext {
		public TerminalNode INT_() { return getToken(CDCDistSQLStatementParser.INT_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(CDCDistSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(CDCDistSQLStatementParser.STRING_, 0); }
		public JobIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterJobId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitJobId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitJobId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobIdContext jobId() throws RecognitionException {
		JobIdContext _localctx = new JobIdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jobId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7L) != 0)) ) {
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
		public TerminalNode TYPE() { return getToken(CDCDistSQLStatementParser.TYPE, 0); }
		public TerminalNode LP_() { return getToken(CDCDistSQLStatementParser.LP_, 0); }
		public TerminalNode NAME() { return getToken(CDCDistSQLStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(CDCDistSQLStatementParser.EQ_, 0); }
		public AlgorithmTypeNameContext algorithmTypeName() {
			return getRuleContext(AlgorithmTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(CDCDistSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(CDCDistSQLStatementParser.COMMA_, 0); }
		public PropertiesDefinitionContext propertiesDefinition() {
			return getRuleContext(PropertiesDefinitionContext.class,0);
		}
		public AlgorithmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterAlgorithmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitAlgorithmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDefinitionContext algorithmDefinition() throws RecognitionException {
		AlgorithmDefinitionContext _localctx = new AlgorithmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_algorithmDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(TYPE);
			setState(165);
			match(LP_);
			setState(166);
			match(NAME);
			setState(167);
			match(EQ_);
			setState(168);
			algorithmTypeName();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(169);
				match(COMMA_);
				setState(170);
				propertiesDefinition();
				}
			}

			setState(173);
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
		public TerminalNode STRING_() { return getToken(CDCDistSQLStatementParser.STRING_, 0); }
		public AlgorithmTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterAlgorithmTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitAlgorithmTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitAlgorithmTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmTypeNameContext algorithmTypeName() throws RecognitionException {
		AlgorithmTypeNameContext _localctx = new AlgorithmTypeNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_algorithmTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
		public TerminalNode PROPERTIES() { return getToken(CDCDistSQLStatementParser.PROPERTIES, 0); }
		public TerminalNode LP_() { return getToken(CDCDistSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(CDCDistSQLStatementParser.RP_, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterPropertiesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitPropertiesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitPropertiesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefinitionContext propertiesDefinition() throws RecognitionException {
		PropertiesDefinitionContext _localctx = new PropertiesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_propertiesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(PROPERTIES);
			setState(178);
			match(LP_);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(179);
				properties();
				}
			}

			setState(182);
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
		public List<TerminalNode> COMMA_() { return getTokens(CDCDistSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(CDCDistSQLStatementParser.COMMA_, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			property();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(185);
				match(COMMA_);
				setState(186);
				property();
				}
				}
				setState(191);
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
		public TerminalNode EQ_() { return getToken(CDCDistSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(CDCDistSQLStatementParser.STRING_, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((PropertyContext)_localctx).key = match(STRING_);
			setState(193);
			match(EQ_);
			setState(194);
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
		public TerminalNode STRING_() { return getToken(CDCDistSQLStatementParser.STRING_, 0); }
		public TerminalNode INT_() { return getToken(CDCDistSQLStatementParser.INT_, 0); }
		public TerminalNode MINUS_() { return getToken(CDCDistSQLStatementParser.MINUS_, 0); }
		public TerminalNode TRUE() { return getToken(CDCDistSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CDCDistSQLStatementParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(STRING_);
				}
				break;
			case MINUS_:
			case INT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS_) {
					{
					setState(197);
					match(MINUS_);
					}
				}

				setState(200);
				match(INT_);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
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
	public static class IntValueContext extends ParserRuleContext {
		public TerminalNode INT_() { return getToken(CDCDistSQLStatementParser.INT_, 0); }
		public IntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDCDistSQLStatementListener ) ((CDCDistSQLStatementListener)listener).exitIntValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDCDistSQLStatementVisitor ) return ((CDCDistSQLStatementVisitor<? extends T>)visitor).visitIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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

	public static final String _serializedATN =
		"\u0004\u0001C\u00d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"2\b\u0000\u0001\u0000\u0003\u00005\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003D\b"+
		"\u0003\u0001\u0003\u0003\u0003G\b\u0003\u0001\u0003\u0003\u0003J\b\u0003"+
		"\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004W\b"+
		"\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0004\u0003\u0004]\b\u0004"+
		"\u0001\u0004\u0003\u0004`\b\u0004\u0001\u0004\u0003\u0004c\b\u0004\u0001"+
		"\u0004\u0003\u0004f\b\u0004\u0001\u0004\u0003\u0004i\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005p\b\u0005"+
		"\u0001\u0005\u0003\u0005s\b\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001"+
		"\u0005\u0003\u0005y\b\u0005\u0001\u0005\u0003\u0005|\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00ac\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b5\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00bc\b\u0012\n\u0012\f\u0012\u00bf\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00c7\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00cc\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0001\u0001"+
		"\u0000AC\u00d6\u00001\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000"+
		"\u0000\u0004<\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\b"+
		"S\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\f\u007f\u0001\u0000"+
		"\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000"+
		"\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000"+
		"\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u0099\u0001\u0000"+
		"\u0000\u0000\u001a\u009e\u0001\u0000\u0000\u0000\u001c\u00a2\u0001\u0000"+
		"\u0000\u0000\u001e\u00a4\u0001\u0000\u0000\u0000 \u00af\u0001\u0000\u0000"+
		"\u0000\"\u00b1\u0001\u0000\u0000\u0000$\u00b8\u0001\u0000\u0000\u0000"+
		"&\u00c0\u0001\u0000\u0000\u0000(\u00cb\u0001\u0000\u0000\u0000*\u00cd"+
		"\u0001\u0000\u0000\u0000,2\u0003\u0016\u000b\u0000-2\u0003\u0018\f\u0000"+
		".2\u0003\u001a\r\u0000/2\u0003\u0002\u0001\u000002\u0003\u0004\u0002\u0000"+
		"1,\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u000024\u0001\u0000"+
		"\u0000\u000035\u0005(\u0000\u000043\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000067\u0005\u0000\u0000\u00017\u0001"+
		"\u0001\u0000\u0000\u000089\u0005/\u0000\u00009:\u00050\u0000\u0000:;\u0005"+
		"8\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u00057\u0000\u0000=>\u0005"+
		"0\u0000\u0000>?\u00058\u0000\u0000?@\u0003\u0006\u0003\u0000@\u0005\u0001"+
		"\u0000\u0000\u0000AC\u0005\u001c\u0000\u0000BD\u0003\b\u0004\u0000CB\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DI\u0001\u0000\u0000\u0000"+
		"EG\u0005\"\u0000\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HJ\u0003\n\u0005\u0000IF\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JO\u0001\u0000\u0000\u0000KM\u0005\"\u0000\u0000"+
		"LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0003\u0014\n\u0000OL\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u001d\u0000\u0000R\u0007\u0001"+
		"\u0000\u0000\u0000ST\u00059\u0000\u0000TV\u0005\u001c\u0000\u0000UW\u0003"+
		"\f\u0006\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\\"+
		"\u0001\u0000\u0000\u0000XZ\u0005\"\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0003\u000e\u0007"+
		"\u0000\\Y\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]b\u0001\u0000"+
		"\u0000\u0000^`\u0005\"\u0000\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0003\u0010\b\u0000b_\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ch\u0001\u0000\u0000\u0000df\u0005"+
		"\"\u0000\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gi\u0003\u0012\t\u0000he\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u001d\u0000\u0000"+
		"k\t\u0001\u0000\u0000\u0000lm\u0005?\u0000\u0000mo\u0005\u001c\u0000\u0000"+
		"np\u0003\f\u0006\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pu\u0001\u0000\u0000\u0000qs\u0005\"\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0003\u000e\u0007"+
		"\u0000ur\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v{\u0001\u0000"+
		"\u0000\u0000wy\u0005\"\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0003\u0012\t\u0000{x\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005"+
		"\u001d\u0000\u0000~\u000b\u0001\u0000\u0000\u0000\u007f\u0080\u0005:\u0000"+
		"\u0000\u0080\u0081\u0005\u0015\u0000\u0000\u0081\u0082\u0003*\u0015\u0000"+
		"\u0082\r\u0001\u0000\u0000\u0000\u0083\u0084\u0005;\u0000\u0000\u0084"+
		"\u0085\u0005\u0015\u0000\u0000\u0085\u0086\u0003*\u0015\u0000\u0086\u000f"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005<\u0000\u0000\u0088\u0089\u0005"+
		"\u0015\u0000\u0000\u0089\u008a\u0003*\u0015\u0000\u008a\u0011\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005=\u0000\u0000\u008c\u008d\u0005\u001c\u0000"+
		"\u0000\u008d\u008e\u0003\u001e\u000f\u0000\u008e\u008f\u0005\u001d\u0000"+
		"\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090\u0091\u0005>\u0000\u0000"+
		"\u0091\u0092\u0005\u001c\u0000\u0000\u0092\u0093\u0003\u001e\u000f\u0000"+
		"\u0093\u0094\u0005\u001d\u0000\u0000\u0094\u0015\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005/\u0000\u0000\u0096\u0097\u00050\u0000\u0000\u0097\u0098"+
		"\u00051\u0000\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"/\u0000\u0000\u009a\u009b\u00050\u0000\u0000\u009b\u009c\u00052\u0000"+
		"\u0000\u009c\u009d\u0003\u001c\u000e\u0000\u009d\u0019\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u00053\u0000\u0000\u009f\u00a0\u00050\u0000\u0000\u00a0"+
		"\u00a1\u0003\u001c\u000e\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0007\u0000\u0000\u0000\u00a3\u001d\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u00054\u0000\u0000\u00a5\u00a6\u0005\u001c\u0000\u0000\u00a6\u00a7"+
		"\u00055\u0000\u0000\u00a7\u00a8\u0005\u0015\u0000\u0000\u00a8\u00ab\u0003"+
		" \u0010\u0000\u00a9\u00aa\u0005\"\u0000\u0000\u00aa\u00ac\u0003\"\u0011"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u001d\u0000"+
		"\u0000\u00ae\u001f\u0001\u0000\u0000\u0000\u00af\u00b0\u0005B\u0000\u0000"+
		"\u00b0!\u0001\u0000\u0000\u0000\u00b1\u00b2\u00056\u0000\u0000\u00b2\u00b4"+
		"\u0005\u001c\u0000\u0000\u00b3\u00b5\u0003$\u0012\u0000\u00b4\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7#\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bd\u0003&\u0013\u0000\u00b9\u00ba\u0005\"\u0000"+
		"\u0000\u00ba\u00bc\u0003&\u0013\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be%\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005B\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0015\u0000\u0000\u00c2\u00c3\u0003(\u0014\u0000\u00c3\'\u0001"+
		"\u0000\u0000\u0000\u00c4\u00cc\u0005B\u0000\u0000\u00c5\u00c7\u0005\r"+
		"\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cc\u0005C\u0000"+
		"\u0000\u00c9\u00cc\u0005,\u0000\u0000\u00ca\u00cc\u0005-\u0000\u0000\u00cb"+
		"\u00c4\u0001\u0000\u0000\u0000\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		")\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005C\u0000\u0000\u00ce+\u0001"+
		"\u0000\u0000\u0000\u001814CFILOVY\\_behorux{\u00ab\u00b4\u00bd\u00c6\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
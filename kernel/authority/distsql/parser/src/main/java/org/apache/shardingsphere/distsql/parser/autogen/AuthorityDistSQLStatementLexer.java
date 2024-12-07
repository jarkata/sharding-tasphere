// Generated from /Users/code/gitcode/shardingsphere/kernel/authority/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/AuthorityDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AuthorityDistSQLStatementLexer extends Lexer {
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
		DL_=43, WS=44, SHOW=45, RULE=46, AUTHORITY=47, FOR_GENERATOR=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND_", "OR_", "NOT_", "TILDE_", "VERTICALBAR_", "AMPERSAND_", "SIGNEDLEFTSHIFT_", 
			"SIGNEDRIGHTSHIFT_", "CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", "ASTERISK_", 
			"SLASH_", "BACKSLASH_", "DOT_", "DOTASTERISK_", "SAFEEQ_", "DEQ_", "EQ_", 
			"NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", "RP_", "LBE_", 
			"RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "BQ_", "QUESTION_", "AT_", 
			"SEMI_", "JSONSEPARATOR_", "UL_", "DL_", "WS", "SHOW", "RULE", "AUTHORITY", 
			"FOR_GENERATOR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", 
			"';'", "'->>'", "'_'", "'$'", null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"SHOW", "RULE", "AUTHORITY", "FOR_GENERATOR"
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


	public AuthorityDistSQLStatementLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AuthorityDistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u00000\u0175\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00cc\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"+\u0004+\u00fd\b+\u000b+\f+\u00fe\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u00014\u00014\u0001"+
		"5\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u00019\u0001"+
		":\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001"+
		"?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001"+
		"D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001"+
		"I\u0001I\u0000\u0000J\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a\u0000c\u0000e\u0000"+
		"g\u0000i\u0000k\u0000m\u0000o\u0000q\u0000s\u0000u\u0000w\u0000y\u0000"+
		"{\u0000}\u0000\u007f\u0000\u0081\u0000\u0083\u0000\u0085\u0000\u0087\u0000"+
		"\u0089\u0000\u008b\u0000\u008d\u0000\u008f\u0000\u0091\u0000\u0093\u0000"+
		"\u0001\u0000\u001b\u0003\u0000\t\n\r\r  \u0002\u0000AAaa\u0002\u0000B"+
		"Bbb\u0002\u0000CCcc\u0002\u0000DDdd\u0002\u0000EEee\u0002\u0000FFff\u0002"+
		"\u0000GGgg\u0002\u0000HHhh\u0002\u0000IIii\u0002\u0000JJjj\u0002\u0000"+
		"KKkk\u0002\u0000LLll\u0002\u0000MMmm\u0002\u0000NNnn\u0002\u0000OOoo\u0002"+
		"\u0000PPpp\u0002\u0000QQqq\u0002\u0000RRrr\u0002\u0000SSss\u0002\u0000"+
		"TTtt\u0002\u0000UUuu\u0002\u0000VVvv\u0002\u0000WWww\u0002\u0000XXxx\u0002"+
		"\u0000YYyy\u0002\u0000ZZzz\u015c\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000"+
		"\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000"+
		"\u0001\u0095\u0001\u0000\u0000\u0000\u0003\u0098\u0001\u0000\u0000\u0000"+
		"\u0005\u009b\u0001\u0000\u0000\u0000\u0007\u009d\u0001\u0000\u0000\u0000"+
		"\t\u009f\u0001\u0000\u0000\u0000\u000b\u00a1\u0001\u0000\u0000\u0000\r"+
		"\u00a3\u0001\u0000\u0000\u0000\u000f\u00a6\u0001\u0000\u0000\u0000\u0011"+
		"\u00a9\u0001\u0000\u0000\u0000\u0013\u00ab\u0001\u0000\u0000\u0000\u0015"+
		"\u00ad\u0001\u0000\u0000\u0000\u0017\u00af\u0001\u0000\u0000\u0000\u0019"+
		"\u00b1\u0001\u0000\u0000\u0000\u001b\u00b3\u0001\u0000\u0000\u0000\u001d"+
		"\u00b5\u0001\u0000\u0000\u0000\u001f\u00b7\u0001\u0000\u0000\u0000!\u00b9"+
		"\u0001\u0000\u0000\u0000#\u00bb\u0001\u0000\u0000\u0000%\u00be\u0001\u0000"+
		"\u0000\u0000\'\u00c2\u0001\u0000\u0000\u0000)\u00c5\u0001\u0000\u0000"+
		"\u0000+\u00cb\u0001\u0000\u0000\u0000-\u00cd\u0001\u0000\u0000\u0000/"+
		"\u00cf\u0001\u0000\u0000\u00001\u00d2\u0001\u0000\u0000\u00003\u00d4\u0001"+
		"\u0000\u0000\u00005\u00d7\u0001\u0000\u0000\u00007\u00d9\u0001\u0000\u0000"+
		"\u00009\u00db\u0001\u0000\u0000\u0000;\u00dd\u0001\u0000\u0000\u0000="+
		"\u00df\u0001\u0000\u0000\u0000?\u00e1\u0001\u0000\u0000\u0000A\u00e3\u0001"+
		"\u0000\u0000\u0000C\u00e5\u0001\u0000\u0000\u0000E\u00e7\u0001\u0000\u0000"+
		"\u0000G\u00e9\u0001\u0000\u0000\u0000I\u00eb\u0001\u0000\u0000\u0000K"+
		"\u00ed\u0001\u0000\u0000\u0000M\u00ef\u0001\u0000\u0000\u0000O\u00f1\u0001"+
		"\u0000\u0000\u0000Q\u00f3\u0001\u0000\u0000\u0000S\u00f7\u0001\u0000\u0000"+
		"\u0000U\u00f9\u0001\u0000\u0000\u0000W\u00fc\u0001\u0000\u0000\u0000Y"+
		"\u0102\u0001\u0000\u0000\u0000[\u0107\u0001\u0000\u0000\u0000]\u010c\u0001"+
		"\u0000\u0000\u0000_\u0116\u0001\u0000\u0000\u0000a\u0141\u0001\u0000\u0000"+
		"\u0000c\u0143\u0001\u0000\u0000\u0000e\u0145\u0001\u0000\u0000\u0000g"+
		"\u0147\u0001\u0000\u0000\u0000i\u0149\u0001\u0000\u0000\u0000k\u014b\u0001"+
		"\u0000\u0000\u0000m\u014d\u0001\u0000\u0000\u0000o\u014f\u0001\u0000\u0000"+
		"\u0000q\u0151\u0001\u0000\u0000\u0000s\u0153\u0001\u0000\u0000\u0000u"+
		"\u0155\u0001\u0000\u0000\u0000w\u0157\u0001\u0000\u0000\u0000y\u0159\u0001"+
		"\u0000\u0000\u0000{\u015b\u0001\u0000\u0000\u0000}\u015d\u0001\u0000\u0000"+
		"\u0000\u007f\u015f\u0001\u0000\u0000\u0000\u0081\u0161\u0001\u0000\u0000"+
		"\u0000\u0083\u0163\u0001\u0000\u0000\u0000\u0085\u0165\u0001\u0000\u0000"+
		"\u0000\u0087\u0167\u0001\u0000\u0000\u0000\u0089\u0169\u0001\u0000\u0000"+
		"\u0000\u008b\u016b\u0001\u0000\u0000\u0000\u008d\u016d\u0001\u0000\u0000"+
		"\u0000\u008f\u016f\u0001\u0000\u0000\u0000\u0091\u0171\u0001\u0000\u0000"+
		"\u0000\u0093\u0173\u0001\u0000\u0000\u0000\u0095\u0096\u0005&\u0000\u0000"+
		"\u0096\u0097\u0005&\u0000\u0000\u0097\u0002\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005|\u0000\u0000\u0099\u009a\u0005|\u0000\u0000\u009a\u0004\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005!\u0000\u0000\u009c\u0006\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005~\u0000\u0000\u009e\b\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005|\u0000\u0000\u00a0\n\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005&\u0000\u0000\u00a2\f\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005<\u0000\u0000\u00a4\u00a5\u0005<\u0000\u0000\u00a5\u000e\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005>\u0000\u0000\u00a7\u00a8\u0005>\u0000"+
		"\u0000\u00a8\u0010\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005^\u0000\u0000"+
		"\u00aa\u0012\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005%\u0000\u0000\u00ac"+
		"\u0014\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005:\u0000\u0000\u00ae\u0016"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005+\u0000\u0000\u00b0\u0018\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005-\u0000\u0000\u00b2\u001a\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005*\u0000\u0000\u00b4\u001c\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005/\u0000\u0000\u00b6\u001e\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\\\u0000\u0000\u00b8 \u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005.\u0000\u0000\u00ba\"\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005.\u0000\u0000\u00bc\u00bd\u0005*\u0000\u0000\u00bd$\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005<\u0000\u0000\u00bf\u00c0\u0005=\u0000\u0000"+
		"\u00c0\u00c1\u0005>\u0000\u0000\u00c1&\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0005=\u0000\u0000\u00c3\u00c4\u0005=\u0000\u0000\u00c4(\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005=\u0000\u0000\u00c6*\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005<\u0000\u0000\u00c8\u00cc\u0005>\u0000\u0000\u00c9\u00ca"+
		"\u0005!\u0000\u0000\u00ca\u00cc\u0005=\u0000\u0000\u00cb\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc,\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005>\u0000\u0000\u00ce.\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005>\u0000\u0000\u00d0\u00d1\u0005=\u0000\u0000\u00d10\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005<\u0000\u0000\u00d32\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005<\u0000\u0000\u00d5\u00d6\u0005=\u0000\u0000\u00d6"+
		"4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005#\u0000\u0000\u00d86\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005(\u0000\u0000\u00da8\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0005)\u0000\u0000\u00dc:\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005{\u0000\u0000\u00de<\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"}\u0000\u0000\u00e0>\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005[\u0000"+
		"\u0000\u00e2@\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005]\u0000\u0000\u00e4"+
		"B\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005,\u0000\u0000\u00e6D\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005\"\u0000\u0000\u00e8F\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0005\'\u0000\u0000\u00eaH\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005`\u0000\u0000\u00ecJ\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005?\u0000\u0000\u00eeL\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		"@\u0000\u0000\u00f0N\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005;\u0000"+
		"\u0000\u00f2P\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005-\u0000\u0000\u00f4"+
		"\u00f5\u0005>\u0000\u0000\u00f5\u00f6\u0005>\u0000\u0000\u00f6R\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005_\u0000\u0000\u00f8T\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005$\u0000\u0000\u00faV\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fd\u0007\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0006+\u0000\u0000\u0101X\u0001\u0000\u0000\u0000\u0102\u0103\u0003"+
		"\u0085B\u0000\u0103\u0104\u0003o7\u0000\u0104\u0105\u0003}>\u0000\u0105"+
		"\u0106\u0003\u008dF\u0000\u0106Z\u0001\u0000\u0000\u0000\u0107\u0108\u0003"+
		"\u0083A\u0000\u0108\u0109\u0003\u0089D\u0000\u0109\u010a\u0003w;\u0000"+
		"\u010a\u010b\u0003i4\u0000\u010b\\\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0003a0\u0000\u010d\u010e\u0003\u0089D\u0000\u010e\u010f\u0003\u0087"+
		"C\u0000\u010f\u0110\u0003o7\u0000\u0110\u0111\u0003}>\u0000\u0111\u0112"+
		"\u0003\u0083A\u0000\u0112\u0113\u0003q8\u0000\u0113\u0114\u0003\u0087"+
		"C\u0000\u0114\u0115\u0003\u0091H\u0000\u0115^\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005D\u0000\u0000\u0117\u0118\u0005O\u0000\u0000\u0118\u0119"+
		"\u0005 \u0000\u0000\u0119\u011a\u0005N\u0000\u0000\u011a\u011b\u0005O"+
		"\u0000\u0000\u011b\u011c\u0005T\u0000\u0000\u011c\u011d\u0005 \u0000\u0000"+
		"\u011d\u011e\u0005M\u0000\u0000\u011e\u011f\u0005A\u0000\u0000\u011f\u0120"+
		"\u0005T\u0000\u0000\u0120\u0121\u0005C\u0000\u0000\u0121\u0122\u0005H"+
		"\u0000\u0000\u0122\u0123\u0005 \u0000\u0000\u0123\u0124\u0005A\u0000\u0000"+
		"\u0124\u0125\u0005N\u0000\u0000\u0125\u0126\u0005Y\u0000\u0000\u0126\u0127"+
		"\u0005 \u0000\u0000\u0127\u0128\u0005T\u0000\u0000\u0128\u0129\u0005H"+
		"\u0000\u0000\u0129\u012a\u0005I\u0000\u0000\u012a\u012b\u0005N\u0000\u0000"+
		"\u012b\u012c\u0005G\u0000\u0000\u012c\u012d\u0005,\u0000\u0000\u012d\u012e"+
		"\u0005 \u0000\u0000\u012e\u012f\u0005J\u0000\u0000\u012f\u0130\u0005U"+
		"\u0000\u0000\u0130\u0131\u0005S\u0000\u0000\u0131\u0132\u0005T\u0000\u0000"+
		"\u0132\u0133\u0005 \u0000\u0000\u0133\u0134\u0005F\u0000\u0000\u0134\u0135"+
		"\u0005O\u0000\u0000\u0135\u0136\u0005R\u0000\u0000\u0136\u0137\u0005 "+
		"\u0000\u0000\u0137\u0138\u0005G\u0000\u0000\u0138\u0139\u0005E\u0000\u0000"+
		"\u0139\u013a\u0005N\u0000\u0000\u013a\u013b\u0005E\u0000\u0000\u013b\u013c"+
		"\u0005R\u0000\u0000\u013c\u013d\u0005A\u0000\u0000\u013d\u013e\u0005T"+
		"\u0000\u0000\u013e\u013f\u0005O\u0000\u0000\u013f\u0140\u0005R\u0000\u0000"+
		"\u0140`\u0001\u0000\u0000\u0000\u0141\u0142\u0007\u0001\u0000\u0000\u0142"+
		"b\u0001\u0000\u0000\u0000\u0143\u0144\u0007\u0002\u0000\u0000\u0144d\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0007\u0003\u0000\u0000\u0146f\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0007\u0004\u0000\u0000\u0148h\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0007\u0005\u0000\u0000\u014aj\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0007\u0006\u0000\u0000\u014cl\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0007\u0007\u0000\u0000\u014en\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0007\b\u0000\u0000\u0150p\u0001\u0000\u0000\u0000\u0151\u0152\u0007"+
		"\t\u0000\u0000\u0152r\u0001\u0000\u0000\u0000\u0153\u0154\u0007\n\u0000"+
		"\u0000\u0154t\u0001\u0000\u0000\u0000\u0155\u0156\u0007\u000b\u0000\u0000"+
		"\u0156v\u0001\u0000\u0000\u0000\u0157\u0158\u0007\f\u0000\u0000\u0158"+
		"x\u0001\u0000\u0000\u0000\u0159\u015a\u0007\r\u0000\u0000\u015az\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0007\u000e\u0000\u0000\u015c|\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0007\u000f\u0000\u0000\u015e~\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0007\u0010\u0000\u0000\u0160\u0080\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0007\u0011\u0000\u0000\u0162\u0082\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0007\u0012\u0000\u0000\u0164\u0084\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0007\u0013\u0000\u0000\u0166\u0086\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0007\u0014\u0000\u0000\u0168\u0088\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0007\u0015\u0000\u0000\u016a\u008a\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0007\u0016\u0000\u0000\u016c\u008c\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0007\u0017\u0000\u0000\u016e\u008e\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0007\u0018\u0000\u0000\u0170\u0090\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0007\u0019\u0000\u0000\u0172\u0092\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0007\u001a\u0000\u0000\u0174\u0094\u0001\u0000\u0000"+
		"\u0000\u0003\u0000\u00cb\u00fe\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
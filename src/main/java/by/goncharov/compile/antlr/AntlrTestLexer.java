// Generated from /Users/brovar/Desktop/Labs/YAPIS/Lab_1/src/main/java/by/goncharov/compile/antlr/AntlrTest.g4 by ANTLR 4.9.1
package by.goncharov.compile.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrTestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, PT=19, NUM=20, UNARY_OPERATOR_SIDE=21, MULTIPLICATION=22, DIV=23, 
		PLUS=24, MINUS=25, LOGIC=26, COMPARE=27, UNARY_OPERATOR=28, MAIN_FUNCTION_ID=29, 
		NAME=30, TYPE=31, WHITESPACE=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "PT", "NUM", "UNARY_OPERATOR_SIDE", "MULTIPLICATION", "DIV", 
			"PLUS", "MINUS", "LOGIC", "COMPARE", "UNARY_OPERATOR", "MAIN_FUNCTION_ID", 
			"NAME", "TYPE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'^'", "'!'", "'auf'", "','", "'{'", "'}'", 
			"'wuf'", "'return'", "';'", "'else'", "'if'", "'while'", "'for'", "'break'", 
			"'continue'", "'.'", null, null, "'*'", "'/'", "'+'", "'-'", null, null, 
			null, "'mainauf'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "PT", "NUM", "UNARY_OPERATOR_SIDE", 
			"MULTIPLICATION", "DIV", "PLUS", "MINUS", "LOGIC", "COMPARE", "UNARY_OPERATOR", 
			"MAIN_FUNCTION_ID", "NAME", "TYPE", "WHITESPACE"
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


	public AntlrTestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AntlrTest.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00df\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\6\25\u0089\n\25\r\25\16\25\u008a"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0096\n\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00a4\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00af\n\34\3\35\3\35\3\35"+
		"\3\35\5\35\u00b5\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\6\37"+
		"\u00c0\n\37\r\37\16\37\u00c1\3\37\6\37\u00c5\n\37\r\37\16\37\u00c6\5\37"+
		"\u00c9\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00d7\n \3!\6!\u00da"+
		"\n!\r!\16!\u00db\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\7\3\2\62;\4\2>>@@\3\2c|\3\2C"+
		"\\\5\2\13\f\17\17\"\"\2\u00eb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3"+
		"C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17Q"+
		"\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25W\3\2\2\2\27[\3\2\2\2\31b\3\2\2\2\33"+
		"d\3\2\2\2\35i\3\2\2\2\37l\3\2\2\2!r\3\2\2\2#v\3\2\2\2%|\3\2\2\2\'\u0085"+
		"\3\2\2\2)\u0088\3\2\2\2+\u0095\3\2\2\2-\u0097\3\2\2\2/\u0099\3\2\2\2\61"+
		"\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u00a3\3\2\2\2\67\u00ae\3\2\2\29\u00b4"+
		"\3\2\2\2;\u00b6\3\2\2\2=\u00c8\3\2\2\2?\u00d6\3\2\2\2A\u00d9\3\2\2\2C"+
		"D\7?\2\2D\4\3\2\2\2EF\7*\2\2F\6\3\2\2\2GH\7+\2\2H\b\3\2\2\2IJ\7`\2\2J"+
		"\n\3\2\2\2KL\7#\2\2L\f\3\2\2\2MN\7c\2\2NO\7w\2\2OP\7h\2\2P\16\3\2\2\2"+
		"QR\7.\2\2R\20\3\2\2\2ST\7}\2\2T\22\3\2\2\2UV\7\177\2\2V\24\3\2\2\2WX\7"+
		"y\2\2XY\7w\2\2YZ\7h\2\2Z\26\3\2\2\2[\\\7t\2\2\\]\7g\2\2]^\7v\2\2^_\7w"+
		"\2\2_`\7t\2\2`a\7p\2\2a\30\3\2\2\2bc\7=\2\2c\32\3\2\2\2de\7g\2\2ef\7n"+
		"\2\2fg\7u\2\2gh\7g\2\2h\34\3\2\2\2ij\7k\2\2jk\7h\2\2k\36\3\2\2\2lm\7y"+
		"\2\2mn\7j\2\2no\7k\2\2op\7n\2\2pq\7g\2\2q \3\2\2\2rs\7h\2\2st\7q\2\2t"+
		"u\7t\2\2u\"\3\2\2\2vw\7d\2\2wx\7t\2\2xy\7g\2\2yz\7c\2\2z{\7m\2\2{$\3\2"+
		"\2\2|}\7e\2\2}~\7q\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\u0081\7k\2\2"+
		"\u0081\u0082\7p\2\2\u0082\u0083\7w\2\2\u0083\u0084\7g\2\2\u0084&\3\2\2"+
		"\2\u0085\u0086\7\60\2\2\u0086(\3\2\2\2\u0087\u0089\t\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"*\3\2\2\2\u008c\u008d\7n\2\2\u008d\u008e\7g\2\2\u008e\u008f\7h\2\2\u008f"+
		"\u0096\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7k\2\2\u0092\u0093\7i\2\2"+
		"\u0093\u0094\7j\2\2\u0094\u0096\7v\2\2\u0095\u008c\3\2\2\2\u0095\u0090"+
		"\3\2\2\2\u0096,\3\2\2\2\u0097\u0098\7,\2\2\u0098.\3\2\2\2\u0099\u009a"+
		"\7\61\2\2\u009a\60\3\2\2\2\u009b\u009c\7-\2\2\u009c\62\3\2\2\2\u009d\u009e"+
		"\7/\2\2\u009e\64\3\2\2\2\u009f\u00a0\7(\2\2\u00a0\u00a4\7(\2\2\u00a1\u00a2"+
		"\7~\2\2\u00a2\u00a4\7~\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\66\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00af\7?\2\2\u00a7\u00a8\7?\2\2\u00a8"+
		"\u00af\7?\2\2\u00a9\u00af\t\3\2\2\u00aa\u00ab\7@\2\2\u00ab\u00af\7?\2"+
		"\2\u00ac\u00ad\7>\2\2\u00ad\u00af\7?\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a7"+
		"\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"8\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b5\7/\2\2\u00b2\u00b3\7-\2\2\u00b3"+
		"\u00b5\7-\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5:\3\2\2\2\u00b6"+
		"\u00b7\7o\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2"+
		"\u00ba\u00bb\7c\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7h\2\2\u00bd<\3\2\2"+
		"\2\u00be\u00c0\t\4\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c9\3\2\2\2\u00c3\u00c5\t\5\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9"+
		">\3\2\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d7\7t\2\2"+
		"\u00d1\u00d2\7H\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5"+
		"\7c\2\2\u00d5\u00d7\7v\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7"+
		"@\3\2\2\2\u00d8\u00da\t\6\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\b!\2\2\u00deB\3\2\2\2\r\2\u008a\u0095\u00a3\u00ae\u00b4\u00c1\u00c6\u00c8"+
		"\u00d6\u00db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
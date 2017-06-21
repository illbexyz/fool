// Generated from C:/Users/Alberto/workspace/fool/src/parser\FOOL.g4 by ANTLR 4.7
package grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOOLParser extends Parser {
    public static final int
            SEMIC = 1, COLON = 2, COMMA = 3, EQ = 4, LEQ = 5, GEQ = 6, AND = 7, OR = 8, NOT = 9, ASM = 10,
            PLUS = 11, MINUS = 12, TIMES = 13, DIV = 14, TRUE = 15, FALSE = 16, LPAR = 17, RPAR = 18,
            CLPAR = 19, CRPAR = 20, IF = 21, THEN = 22, ELSE = 23, LET = 24, IN = 25, VAR = 26, FUN = 27,
            INT = 28, BOOL = 29, CLASS = 30, IMPLEMENTS = 31, THIS = 32, NEW = 33, DOT = 34, INTEGER = 35,
            ID = 36, WS = 37, LINECOMENTS = 38, BLOCKCOMENTS = 39, ERR = 40;
    public static final int
            RULE_prog = 0, RULE_classdec = 1, RULE_let = 2, RULE_vardec = 3, RULE_varasm = 4,
            RULE_fun = 5, RULE_dec = 6, RULE_type = 7, RULE_exp = 8, RULE_term = 9,
            RULE_factor = 10, RULE_value = 11;
    public static final String[] ruleNames = {
            "prog", "classdec", "let", "vardec", "varasm", "fun", "dec", "type", "exp",
            "term", "factor", "value"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00ce\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2#\n\2\r\2\16\2" +
                    "$\3\2\3\2\5\2)\n\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\3\3\3\5\3\64\n\3\3\3" +
                    "\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\5\3A\n\3\3\3\3\3\3\3\3\3" +
                    "\6\3G\n\3\r\3\16\3H\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3\4\6\4S\n\4\r\4\16\4" +
                    "T\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7f\n\7" +
                    "\f\7\16\7i\13\7\5\7k\n\7\3\7\3\7\5\7o\n\7\3\7\3\7\3\b\3\b\5\bu\n\b\3\t" +
                    "\3\t\3\n\5\nz\n\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\5\13\u0084\n" +
                    "\13\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\5\r\u008d\n\r\3\r\3\r\3\r\3\r\3" +
                    "\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r" +
                    "\3\r\7\r\u00a6\n\r\f\r\16\r\u00a9\13\r\5\r\u00ab\n\r\3\r\3\r\3\r\3\r\3" +
                    "\r\3\r\3\r\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\5\r\u00ba\n\r\3\r\3\r" +
                    "\3\r\3\r\3\r\3\r\3\r\7\r\u00c3\n\r\f\r\16\r\u00c6\13\r\3\r\3\r\5\r\u00ca" +
                    "\n\r\5\r\u00cc\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\b\4\2\36" +
                    "\37&&\3\2\r\16\3\2\17\20\3\2\6\n\3\2\21\22\4\2\"\"&&\2\u00e2\2-\3\2\2" +
                    "\2\4/\3\2\2\2\6N\3\2\2\2\bX\3\2\2\2\n[\3\2\2\2\f_\3\2\2\2\16t\3\2\2\2" +
                    "\20v\3\2\2\2\22y\3\2\2\2\24\u0080\3\2\2\2\26\u0085\3\2\2\2\30\u00cb\3" +
                    "\2\2\2\32\33\5\22\n\2\33\34\7\3\2\2\34.\3\2\2\2\35\36\5\6\4\2\36\37\5" +
                    "\22\n\2\37 \7\3\2\2 .\3\2\2\2!#\5\4\3\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2" +
                    "\2$%\3\2\2\2%&\3\2\2\2&(\7\3\2\2\')\5\6\4\2(\'\3\2\2\2()\3\2\2\2)*\3\2" +
                    "\2\2*+\5\22\n\2+,\7\3\2\2,.\3\2\2\2-\32\3\2\2\2-\35\3\2\2\2-\"\3\2\2\2" +
                    ".\3\3\2\2\2/\60\7 \2\2\60\63\7&\2\2\61\62\7!\2\2\62\64\7&\2\2\63\61\3" +
                    "\2\2\2\63\64\3\2\2\2\64@\3\2\2\2\65\66\7\23\2\2\66;\5\b\5\2\678\7\5\2" +
                    "\28:\5\b\5\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2" +
                    "\2\2>?\7\24\2\2?A\3\2\2\2@\65\3\2\2\2@A\3\2\2\2AL\3\2\2\2BF\7\25\2\2C" +
                    "D\5\f\7\2DE\7\3\2\2EG\3\2\2\2FC\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2" +
                    "IJ\3\2\2\2JK\7\26\2\2KM\3\2\2\2LB\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NR\7\32" +
                    "\2\2OP\5\16\b\2PQ\7\3\2\2QS\3\2\2\2RO\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3" +
                    "\2\2\2UV\3\2\2\2VW\7\33\2\2W\7\3\2\2\2XY\5\20\t\2YZ\7&\2\2Z\t\3\2\2\2" +
                    "[\\\5\b\5\2\\]\7\f\2\2]^\5\22\n\2^\13\3\2\2\2_`\5\20\t\2`a\7&\2\2aj\7" +
                    "\23\2\2bg\5\b\5\2cd\7\5\2\2df\5\b\5\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh" +
                    "\3\2\2\2hk\3\2\2\2ig\3\2\2\2jb\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\7\24\2\2" +
                    "mo\5\6\4\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5\22\n\2q\r\3\2\2\2ru\5\n\6" +
                    "\2su\5\f\7\2tr\3\2\2\2ts\3\2\2\2u\17\3\2\2\2vw\t\2\2\2w\21\3\2\2\2xz\7" +
                    "\16\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{~\5\24\13\2|}\t\3\2\2}\177\5\22" +
                    "\n\2~|\3\2\2\2~\177\3\2\2\2\177\23\3\2\2\2\u0080\u0083\5\26\f\2\u0081" +
                    "\u0082\t\4\2\2\u0082\u0084\5\24\13\2\u0083\u0081\3\2\2\2\u0083\u0084\3" +
                    "\2\2\2\u0084\25\3\2\2\2\u0085\u0088\5\30\r\2\u0086\u0087\t\5\2\2\u0087" +
                    "\u0089\5\30\r\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\27\3\2\2" +
                    "\2\u008a\u00cc\7%\2\2\u008b\u008d\7\13\2\2\u008c\u008b\3\2\2\2\u008c\u008d" +
                    "\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u00cc\t\6\2\2\u008f\u0090\7\23\2\2" +
                    "\u0090\u0091\5\22\n\2\u0091\u0092\7\24\2\2\u0092\u00cc\3\2\2\2\u0093\u0094" +
                    "\7\27\2\2\u0094\u0095\5\22\n\2\u0095\u0096\7\30\2\2\u0096\u0097\7\25\2" +
                    "\2\u0097\u0098\5\22\n\2\u0098\u0099\7\26\2\2\u0099\u009a\7\31\2\2\u009a" +
                    "\u009b\7\25\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7\26\2\2\u009d\u00cc" +
                    "\3\2\2\2\u009e\u00cc\7&\2\2\u009f\u00cc\7\"\2\2\u00a0\u00a1\7&\2\2\u00a1" +
                    "\u00aa\7\23\2\2\u00a2\u00a7\5\22\n\2\u00a3\u00a4\7\5\2\2\u00a4\u00a6\5" +
                    "\22\n\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7" +
                    "\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00a2\3\2" +
                    "\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00cc\7\24\2\2\u00ad" +
                    "\u00ae\t\7\2\2\u00ae\u00af\7$\2\2\u00af\u00b0\7&\2\2\u00b0\u00b9\7\23" +
                    "\2\2\u00b1\u00b6\5\22\n\2\u00b2\u00b3\7\5\2\2\u00b3\u00b5\5\22\n\2\u00b4" +
                    "\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2" +
                    "\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9" +
                    "\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00cc\7\24\2\2\u00bc\u00bd\7" +
                    "#\2\2\u00bd\u00c9\7&\2\2\u00be\u00bf\7\23\2\2\u00bf\u00c4\5\22\n\2\u00c0" +
                    "\u00c1\7\5\2\2\u00c1\u00c3\5\22\n\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3" +
                    "\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6" +
                    "\u00c4\3\2\2\2\u00c7\u00c8\7\24\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00be\3" +
                    "\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u008a\3\2\2\2\u00cb" +
                    "\u008c\3\2\2\2\u00cb\u008f\3\2\2\2\u00cb\u0093\3\2\2\2\u00cb\u009e\3\2" +
                    "\2\2\u00cb\u009f\3\2\2\2\u00cb\u00a0\3\2\2\2\u00cb\u00ad\3\2\2\2\u00cb" +
                    "\u00bc\3\2\2\2\u00cc\31\3\2\2\2\33$(-\63;@HLTgjnty~\u0083\u0088\u008c" +
                    "\u00a7\u00aa\u00b6\u00b9\u00c4\u00c9\u00cb";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "';'", "':'", "','", "'=='", null, null, "'&&'", "'||'", "'!'",
            "'='", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'('", "')'",
            "'{'", "'}'", "'if'", "'then'", "'else'", "'let'", "'in'", "'var'", "'fun'",
            "'int'", "'bool'", "'class'", "'implements'", "'this'", "'new'", "'.'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "SEMIC", "COLON", "COMMA", "EQ", "LEQ", "GEQ", "AND", "OR", "NOT",
            "ASM", "PLUS", "MINUS", "TIMES", "DIV", "TRUE", "FALSE", "LPAR", "RPAR",
            "CLPAR", "CRPAR", "IF", "THEN", "ELSE", "LET", "IN", "VAR", "FUN", "INT",
            "BOOL", "CLASS", "IMPLEMENTS", "THIS", "NEW", "DOT", "INTEGER", "ID",
            "WS", "LINECOMENTS", "BLOCKCOMENTS", "ERR"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public FOOLParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String getGrammarFileName() {
        return "FOOL.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            setState(43);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case NOT:
                case MINUS:
                case TRUE:
                case FALSE:
                case LPAR:
                case IF:
                case THIS:
                case NEW:
                case INTEGER:
                case ID:
                    _localctx = new SingleExpContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(24);
                    exp();
                    setState(25);
                    match(SEMIC);
                }
                break;
                case LET:
                    _localctx = new LetInExpContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(27);
                    let();
                    setState(28);
                    exp();
                    setState(29);
                    match(SEMIC);
                }
                break;
                case CLASS:
                    _localctx = new ClassExpContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(32);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(31);
                                classdec();
                            }
                        }
                        setState(34);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == CLASS);
                    setState(36);
                    match(SEMIC);
                    setState(38);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == LET) {
                        {
                            setState(37);
                            let();
                        }
                    }

                    setState(40);
                    exp();
                    setState(41);
                    match(SEMIC);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassdecContext classdec() throws RecognitionException {
        ClassdecContext _localctx = new ClassdecContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_classdec);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(45);
                match(CLASS);
                setState(46);
                match(ID);
                setState(49);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IMPLEMENTS) {
                    {
                        setState(47);
                        match(IMPLEMENTS);
                        setState(48);
                        match(ID);
                    }
                }

                setState(62);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LPAR) {
                    {
                        setState(51);
                        match(LPAR);
                        setState(52);
                        vardec();
                        setState(57);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(53);
                                    match(COMMA);
                                    setState(54);
                                    vardec();
                                }
                            }
                            setState(59);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(60);
                        match(RPAR);
                    }
                }

                setState(74);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CLPAR) {
                    {
                        setState(64);
                        match(CLPAR);
                        setState(68);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(65);
                                    fun();
                                    setState(66);
                                    match(SEMIC);
                                }
                            }
                            setState(70);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0));
                        setState(72);
                        match(CRPAR);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LetContext let() throws RecognitionException {
        LetContext _localctx = new LetContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_let);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(76);
                match(LET);
                setState(80);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(77);
                            dec();
                            setState(78);
                            match(SEMIC);
                        }
                    }
                    setState(82);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0));
                setState(84);
                match(IN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VardecContext vardec() throws RecognitionException {
        VardecContext _localctx = new VardecContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_vardec);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(86);
                type();
                setState(87);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarasmContext varasm() throws RecognitionException {
        VarasmContext _localctx = new VarasmContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_varasm);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(89);
                vardec();
                setState(90);
                match(ASM);
                setState(91);
                exp();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunContext fun() throws RecognitionException {
        FunContext _localctx = new FunContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_fun);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(93);
                type();
                setState(94);
                match(ID);
                setState(95);
                match(LPAR);
                setState(104);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0)) {
                    {
                        setState(96);
                        vardec();
                        setState(101);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(97);
                                    match(COMMA);
                                    setState(98);
                                    vardec();
                                }
                            }
                            setState(103);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(106);
                match(RPAR);
                setState(108);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LET) {
                    {
                        setState(107);
                        let();
                    }
                }

                setState(110);
                exp();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DecContext dec() throws RecognitionException {
        DecContext _localctx = new DecContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_dec);
        try {
            setState(114);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1:
                    _localctx = new VarAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(112);
                    varasm();
                }
                break;
                case 2:
                    _localctx = new FunDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(113);
                    fun();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_type);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(116);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpContext exp() throws RecognitionException {
        ExpContext _localctx = new ExpContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_exp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(119);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == MINUS) {
                    {
                        setState(118);
                        match(MINUS);
                    }
                }

                setState(121);
                ((ExpContext) _localctx).left = term();
                setState(124);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == PLUS || _la == MINUS) {
                    {
                        setState(122);
                        ((ExpContext) _localctx).operator = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            ((ExpContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(123);
                        ((ExpContext) _localctx).right = exp();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TermContext term() throws RecognitionException {
        TermContext _localctx = new TermContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_term);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(126);
                ((TermContext) _localctx).left = factor();
                setState(129);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == TIMES || _la == DIV) {
                    {
                        setState(127);
                        ((TermContext) _localctx).operator = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == TIMES || _la == DIV)) {
                            ((TermContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(128);
                        ((TermContext) _localctx).right = term();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FactorContext factor() throws RecognitionException {
        FactorContext _localctx = new FactorContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_factor);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(131);
                ((FactorContext) _localctx).left = value();
                setState(134);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LEQ) | (1L << GEQ) | (1L << AND) | (1L << OR))) != 0)) {
                    {
                        setState(132);
                        ((FactorContext) _localctx).operator = _input.LT(1);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LEQ) | (1L << GEQ) | (1L << AND) | (1L << OR))) != 0))) {
                            ((FactorContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(133);
                        ((FactorContext) _localctx).right = value();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ValueContext value() throws RecognitionException {
        ValueContext _localctx = new ValueContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_value);
        int _la;
        try {
            setState(201);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                case 1:
                    _localctx = new IntValContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(136);
                    match(INTEGER);
                }
                break;
                case 2:
                    _localctx = new BoolValContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(138);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(137);
                            match(NOT);
                        }
                    }

                    setState(140);
                    _la = _input.LA(1);
                    if (!(_la == TRUE || _la == FALSE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 3:
                    _localctx = new BaseExpContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(141);
                    match(LPAR);
                    setState(142);
                    exp();
                    setState(143);
                    match(RPAR);
                }
                break;
                case 4:
                    _localctx = new IfExpContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(145);
                    match(IF);
                    setState(146);
                    ((IfExpContext) _localctx).cond = exp();
                    setState(147);
                    match(THEN);
                    setState(148);
                    match(CLPAR);
                    setState(149);
                    ((IfExpContext) _localctx).thenBranch = exp();
                    setState(150);
                    match(CRPAR);
                    setState(151);
                    match(ELSE);
                    setState(152);
                    match(CLPAR);
                    setState(153);
                    ((IfExpContext) _localctx).elseBranch = exp();
                    setState(154);
                    match(CRPAR);
                }
                break;
                case 5:
                    _localctx = new VarExpContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(156);
                    match(ID);
                }
                break;
                case 6:
                    _localctx = new ThisExpContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(157);
                    match(THIS);
                }
                break;
                case 7:
                    _localctx = new FunExpContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(158);
                    match(ID);
                    {
                        setState(159);
                        match(LPAR);
                        setState(168);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << THIS) | (1L << NEW) | (1L << INTEGER) | (1L << ID))) != 0)) {
                            {
                                setState(160);
                                exp();
                                setState(165);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA) {
                                    {
                                        {
                                            setState(161);
                                            match(COMMA);
                                            setState(162);
                                            exp();
                                        }
                                    }
                                    setState(167);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(170);
                        match(RPAR);
                    }
                }
                break;
                case 8:
                    _localctx = new MethodExpContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(171);
                    _la = _input.LA(1);
                    if (!(_la == THIS || _la == ID)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(172);
                    match(DOT);
                    setState(173);
                    match(ID);
                    {
                        setState(174);
                        match(LPAR);
                        setState(183);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << THIS) | (1L << NEW) | (1L << INTEGER) | (1L << ID))) != 0)) {
                            {
                                setState(175);
                                exp();
                                setState(180);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA) {
                                    {
                                        {
                                            setState(176);
                                            match(COMMA);
                                            setState(177);
                                            exp();
                                        }
                                    }
                                    setState(182);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(185);
                        match(RPAR);
                    }
                }
                break;
                case 9:
                    _localctx = new NewExpContext(_localctx);
                    enterOuterAlt(_localctx, 9);
                {
                    setState(186);
                    match(NEW);
                    setState(187);
                    match(ID);
                    setState(199);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == LPAR) {
                        {
                            setState(188);
                            match(LPAR);
                            setState(189);
                            exp();
                            setState(194);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == COMMA) {
                                {
                                    {
                                        setState(190);
                                        match(COMMA);
                                        setState(191);
                                        exp();
                                    }
                                }
                                setState(196);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                            setState(197);
                            match(RPAR);
                        }
                    }

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ProgContext extends ParserRuleContext {
        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ProgContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        public void copyFrom(ProgContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ClassExpContext extends ProgContext {
        public ClassExpContext(ProgContext ctx) {
            copyFrom(ctx);
        }

        public List<TerminalNode> SEMIC() {
            return getTokens(FOOLParser.SEMIC);
        }

        public TerminalNode SEMIC(int i) {
            return getToken(FOOLParser.SEMIC, i);
        }

        public ExpContext exp() {
            return getRuleContext(ExpContext.class, 0);
        }

        public List<ClassdecContext> classdec() {
            return getRuleContexts(ClassdecContext.class);
        }

        public ClassdecContext classdec(int i) {
            return getRuleContext(ClassdecContext.class, i);
        }

        public LetContext let() {
            return getRuleContext(LetContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterClassExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitClassExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitClassExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LetInExpContext extends ProgContext {
        public LetInExpContext(ProgContext ctx) {
            copyFrom(ctx);
        }

        public LetContext let() {
            return getRuleContext(LetContext.class, 0);
        }

        public ExpContext exp() {
            return getRuleContext(ExpContext.class, 0);
        }

        public TerminalNode SEMIC() {
            return getToken(FOOLParser.SEMIC, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterLetInExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitLetInExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitLetInExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SingleExpContext extends ProgContext {
        public SingleExpContext(ProgContext ctx) {
            copyFrom(ctx);
        }

        public ExpContext exp() {
            return getRuleContext(ExpContext.class, 0);
        }

        public TerminalNode SEMIC() {
            return getToken(FOOLParser.SEMIC, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterSingleExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitSingleExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitSingleExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClassdecContext extends ParserRuleContext {
        public ClassdecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CLASS() {
            return getToken(FOOLParser.CLASS, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(FOOLParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(FOOLParser.ID, i);
        }

        public TerminalNode IMPLEMENTS() {
            return getToken(FOOLParser.IMPLEMENTS, 0);
        }

        public TerminalNode LPAR() {
            return getToken(FOOLParser.LPAR, 0);
        }

        public List<VardecContext> vardec() {
            return getRuleContexts(VardecContext.class);
        }

        public VardecContext vardec(int i) {
            return getRuleContext(VardecContext.class, i);
        }

        public TerminalNode RPAR() {
            return getToken(FOOLParser.RPAR, 0);
        }

        public TerminalNode CLPAR() {
            return getToken(FOOLParser.CLPAR, 0);
        }

        public TerminalNode CRPAR() {
            return getToken(FOOLParser.CRPAR, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(FOOLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(FOOLParser.COMMA, i);
        }

        public List<FunContext> fun() {
            return getRuleContexts(FunContext.class);
        }

        public FunContext fun(int i) {
            return getRuleContext(FunContext.class, i);
        }

        public List<TerminalNode> SEMIC() {
            return getTokens(FOOLParser.SEMIC);
        }

        public TerminalNode SEMIC(int i) {
            return getToken(FOOLParser.SEMIC, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classdec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterClassdec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitClassdec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitClassdec(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LetContext extends ParserRuleContext {
        public LetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode LET() {
            return getToken(FOOLParser.LET, 0);
        }

        public TerminalNode IN() {
            return getToken(FOOLParser.IN, 0);
        }

        public List<DecContext> dec() {
            return getRuleContexts(DecContext.class);
        }

        public DecContext dec(int i) {
            return getRuleContext(DecContext.class, i);
        }

        public List<TerminalNode> SEMIC() {
            return getTokens(FOOLParser.SEMIC);
        }

        public TerminalNode SEMIC(int i) {
            return getToken(FOOLParser.SEMIC, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_let;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterLet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitLet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitLet(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VardecContext extends ParserRuleContext {
        public VardecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(FOOLParser.ID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_vardec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterVardec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitVardec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitVardec(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarasmContext extends ParserRuleContext {
        public VarasmContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public VardecContext vardec() {
            return getRuleContext(VardecContext.class, 0);
        }

        public TerminalNode ASM() {
            return getToken(FOOLParser.ASM, 0);
        }

        public ExpContext exp() {
            return getRuleContext(ExpContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varasm;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterVarasm(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitVarasm(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitVarasm(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunContext extends ParserRuleContext {
        public FunContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(FOOLParser.ID, 0);
        }

        public TerminalNode LPAR() {
            return getToken(FOOLParser.LPAR, 0);
        }

        public TerminalNode RPAR() {
            return getToken(FOOLParser.RPAR, 0);
        }

        public ExpContext exp() {
            return getRuleContext(ExpContext.class, 0);
        }

        public List<VardecContext> vardec() {
            return getRuleContexts(VardecContext.class);
        }

        public VardecContext vardec(int i) {
            return getRuleContext(VardecContext.class, i);
        }

        public LetContext let() {
            return getRuleContext(LetContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(FOOLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(FOOLParser.COMMA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fun;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterFun(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitFun(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitFun(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DecContext extends ParserRuleContext {
        public DecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public DecContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_dec;
        }

        public void copyFrom(DecContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class VarAssignmentContext extends DecContext {
        public VarAssignmentContext(DecContext ctx) {
            copyFrom(ctx);
        }

        public VarasmContext varasm() {
            return getRuleContext(VarasmContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterVarAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitVarAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitVarAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunDeclarationContext extends DecContext {
        public FunDeclarationContext(DecContext ctx) {
            copyFrom(ctx);
        }

        public FunContext fun() {
            return getRuleContext(FunContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterFunDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitFunDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitFunDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeContext extends ParserRuleContext {
        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INT() {
            return getToken(FOOLParser.INT, 0);
        }

        public TerminalNode BOOL() {
            return getToken(FOOLParser.BOOL, 0);
        }

        public TerminalNode ID() {
            return getToken(FOOLParser.ID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpContext extends ParserRuleContext {
        public TermContext left;
        public Token operator;
        public ExpContext right;

        public ExpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public ExpContext exp() {
            return getRuleContext(ExpContext.class, 0);
        }

        public TerminalNode PLUS() {
            return getToken(FOOLParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(FOOLParser.MINUS, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TermContext extends ParserRuleContext {
        public FactorContext left;
        public Token operator;
        public TermContext right;

        public TermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FactorContext factor() {
            return getRuleContext(FactorContext.class, 0);
        }

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public TerminalNode TIMES() {
            return getToken(FOOLParser.TIMES, 0);
        }

        public TerminalNode DIV() {
            return getToken(FOOLParser.DIV, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_term;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterTerm(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitTerm(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitTerm(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FactorContext extends ParserRuleContext {
        public ValueContext left;
        public Token operator;
        public ValueContext right;

        public FactorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ValueContext> value() {
            return getRuleContexts(ValueContext.class);
        }

        public ValueContext value(int i) {
            return getRuleContext(ValueContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(FOOLParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(FOOLParser.OR, 0);
        }

        public TerminalNode GEQ() {
            return getToken(FOOLParser.GEQ, 0);
        }

        public TerminalNode EQ() {
            return getToken(FOOLParser.EQ, 0);
        }

        public TerminalNode LEQ() {
            return getToken(FOOLParser.LEQ, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_factor;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterFactor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitFactor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitFactor(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ValueContext extends ParserRuleContext {
        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ValueContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_value;
        }

        public void copyFrom(ValueContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BaseExpContext extends ValueContext {
        public BaseExpContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode LPAR() {
            return getToken(FOOLParser.LPAR, 0);
        }

        public ExpContext exp() {
            return getRuleContext(ExpContext.class, 0);
        }

        public TerminalNode RPAR() {
            return getToken(FOOLParser.RPAR, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterBaseExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitBaseExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitBaseExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarExpContext extends ValueContext {
        public VarExpContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(FOOLParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterVarExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitVarExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitVarExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntValContext extends ValueContext {
        public IntValContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode INTEGER() {
            return getToken(FOOLParser.INTEGER, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterIntVal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitIntVal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitIntVal(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MethodExpContext extends ValueContext {
        public MethodExpContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode DOT() {
            return getToken(FOOLParser.DOT, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(FOOLParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(FOOLParser.ID, i);
        }

        public TerminalNode THIS() {
            return getToken(FOOLParser.THIS, 0);
        }

        public TerminalNode LPAR() {
            return getToken(FOOLParser.LPAR, 0);
        }

        public TerminalNode RPAR() {
            return getToken(FOOLParser.RPAR, 0);
        }

        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }

        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(FOOLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(FOOLParser.COMMA, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterMethodExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitMethodExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitMethodExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NewExpContext extends ValueContext {
        public NewExpContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NEW() {
            return getToken(FOOLParser.NEW, 0);
        }

        public TerminalNode ID() {
            return getToken(FOOLParser.ID, 0);
        }

        public TerminalNode LPAR() {
            return getToken(FOOLParser.LPAR, 0);
        }

        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }

        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class, i);
        }

        public TerminalNode RPAR() {
            return getToken(FOOLParser.RPAR, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(FOOLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(FOOLParser.COMMA, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterNewExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitNewExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitNewExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfExpContext extends ValueContext {
        public ExpContext cond;
        public ExpContext thenBranch;
        public ExpContext elseBranch;

        public IfExpContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode IF() {
            return getToken(FOOLParser.IF, 0);
        }

        public TerminalNode THEN() {
            return getToken(FOOLParser.THEN, 0);
        }

        public List<TerminalNode> CLPAR() {
            return getTokens(FOOLParser.CLPAR);
        }

        public TerminalNode CLPAR(int i) {
            return getToken(FOOLParser.CLPAR, i);
        }

        public List<TerminalNode> CRPAR() {
            return getTokens(FOOLParser.CRPAR);
        }

        public TerminalNode CRPAR(int i) {
            return getToken(FOOLParser.CRPAR, i);
        }

        public TerminalNode ELSE() {
            return getToken(FOOLParser.ELSE, 0);
        }

        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }

        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterIfExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitIfExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitIfExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ThisExpContext extends ValueContext {
        public ThisExpContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode THIS() {
            return getToken(FOOLParser.THIS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterThisExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitThisExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitThisExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BoolValContext extends ValueContext {
        public BoolValContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode TRUE() {
            return getToken(FOOLParser.TRUE, 0);
        }

        public TerminalNode FALSE() {
            return getToken(FOOLParser.FALSE, 0);
        }

        public TerminalNode NOT() {
            return getToken(FOOLParser.NOT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterBoolVal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitBoolVal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitBoolVal(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunExpContext extends ValueContext {
        public FunExpContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(FOOLParser.ID, 0);
        }

        public TerminalNode LPAR() {
            return getToken(FOOLParser.LPAR, 0);
        }

        public TerminalNode RPAR() {
            return getToken(FOOLParser.RPAR, 0);
        }

        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }

        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(FOOLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(FOOLParser.COMMA, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).enterFunExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FOOLListener) ((FOOLListener) listener).exitFunExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof FOOLVisitor) return ((FOOLVisitor<? extends T>) visitor).visitFunExp(this);
            else return visitor.visitChildren(this);
        }
    }
}
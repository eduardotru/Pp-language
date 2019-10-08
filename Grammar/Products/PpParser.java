// Generated from Pp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, ID=42, INT_NUMBER=43, FLOAT_NUMBER=44, STRING_LITERAL=45, 
		BOOL_LITERAL=46, WS=47;
	public static final int
		RULE_r = 0, RULE_program0 = 1, RULE_program1 = 2, RULE_statement0 = 3, 
		RULE_block0 = 4, RULE_block1 = 5, RULE_function_decl0 = 6, RULE_decl_block0 = 7, 
		RULE_decl_block1 = 8, RULE_parameters0 = 9, RULE_parameters1 = 10, RULE_variable_decl0 = 11, 
		RULE_variables_decl1 = 12, RULE_assignment0 = 13, RULE_function_call0 = 14, 
		RULE_function_call_aux0 = 15, RULE_function_call_aux1 = 16, RULE_function_call_aux2 = 17, 
		RULE_if0 = 18, RULE_else0 = 19, RULE_while0 = 20, RULE_io_statement0 = 21, 
		RULE_input0 = 22, RULE_output0 = 23, RULE_plot0 = 24, RULE_readcsv0 = 25, 
		RULE_return0 = 26, RULE_expression0 = 27, RULE_bool_exp0 = 28, RULE_bool_exp1 = 29, 
		RULE_bool_term0 = 30, RULE_bool_term1 = 31, RULE_bool_op0 = 32, RULE_rel_op0 = 33, 
		RULE_arithmetic_exp0 = 34, RULE_arithmetic_exp1 = 35, RULE_addition_subtraction0 = 36, 
		RULE_arithmetic_factor0 = 37, RULE_arithmetic_factor1 = 38, RULE_multiplication_division0 = 39, 
		RULE_arithmetic_term0 = 40, RULE_arithmetic_term1 = 41, RULE_exponent0 = 42, 
		RULE_numeric_term0 = 43, RULE_numeric_term1 = 44, RULE_sign0 = 45, RULE_type0 = 46, 
		RULE_type1 = 47, RULE_basic_type0 = 48, RULE_value0 = 49, RULE_value1 = 50, 
		RULE_matrix_literal0 = 51, RULE_matrix_literal1 = 52, RULE_matrix_literal2 = 53, 
		RULE_matrix_literal3 = 54, RULE_matrix_literal4 = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program0", "program1", "statement0", "block0", "block1", "function_decl0", 
			"decl_block0", "decl_block1", "parameters0", "parameters1", "variable_decl0", 
			"variables_decl1", "assignment0", "function_call0", "function_call_aux0", 
			"function_call_aux1", "function_call_aux2", "if0", "else0", "while0", 
			"io_statement0", "input0", "output0", "plot0", "readcsv0", "return0", 
			"expression0", "bool_exp0", "bool_exp1", "bool_term0", "bool_term1", 
			"bool_op0", "rel_op0", "arithmetic_exp0", "arithmetic_exp1", "addition_subtraction0", 
			"arithmetic_factor0", "arithmetic_factor1", "multiplication_division0", 
			"arithmetic_term0", "arithmetic_term1", "exponent0", "numeric_term0", 
			"numeric_term1", "sign0", "type0", "type1", "basic_type0", "value0", 
			"value1", "matrix_literal0", "matrix_literal1", "matrix_literal2", "matrix_literal3", 
			"matrix_literal4"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'func'", "'('", "')'", "','", "'let'", "';'", "'='", 
			"'if'", "'elseif'", "'else'", "'while'", "'read'", "'write'", "'plot'", 
			"'readcsv'", "'return'", "'not'", "'and'", "'or'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'matrix'", 
			"'['", "']'", "'dataset'", "'float'", "'int'", "'string'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "INT_NUMBER", "FLOAT_NUMBER", 
			"STRING_LITERAL", "BOOL_LITERAL", "WS"
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
	public String getGrammarFileName() { return "Pp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public Program0Context program0() {
			return getRuleContext(Program0Context.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			program0();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Program0Context extends ParserRuleContext {
		public Variable_decl0Context variable_decl0() {
			return getRuleContext(Variable_decl0Context.class,0);
		}
		public Program1Context program1() {
			return getRuleContext(Program1Context.class,0);
		}
		public Program0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterProgram0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitProgram0(this);
		}
	}

	public final Program0Context program0() throws RecognitionException {
		Program0Context _localctx = new Program0Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_program0);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				variable_decl0();
				setState(115);
				program1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				program1();
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

	public static class Program1Context extends ParserRuleContext {
		public Statement0Context statement0() {
			return getRuleContext(Statement0Context.class,0);
		}
		public Program1Context program1() {
			return getRuleContext(Program1Context.class,0);
		}
		public Function_decl0Context function_decl0() {
			return getRuleContext(Function_decl0Context.class,0);
		}
		public Program1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterProgram1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitProgram1(this);
		}
	}

	public final Program1Context program1() throws RecognitionException {
		Program1Context _localctx = new Program1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_program1);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				statement0();
				setState(121);
				program1();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				function_decl0();
				setState(124);
				program1();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Statement0Context extends ParserRuleContext {
		public Assignment0Context assignment0() {
			return getRuleContext(Assignment0Context.class,0);
		}
		public Function_call0Context function_call0() {
			return getRuleContext(Function_call0Context.class,0);
		}
		public Io_statement0Context io_statement0() {
			return getRuleContext(Io_statement0Context.class,0);
		}
		public If0Context if0() {
			return getRuleContext(If0Context.class,0);
		}
		public While0Context while0() {
			return getRuleContext(While0Context.class,0);
		}
		public Return0Context return0() {
			return getRuleContext(Return0Context.class,0);
		}
		public Statement0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterStatement0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitStatement0(this);
		}
	}

	public final Statement0Context statement0() throws RecognitionException {
		Statement0Context _localctx = new Statement0Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement0);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				assignment0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				function_call0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				io_statement0();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				if0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				while0();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				return0();
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

	public static class Block0Context extends ParserRuleContext {
		public Block1Context block1() {
			return getRuleContext(Block1Context.class,0);
		}
		public Block0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterBlock0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitBlock0(this);
		}
	}

	public final Block0Context block0() throws RecognitionException {
		Block0Context _localctx = new Block0Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_block0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__0);
			setState(138);
			block1();
			setState(139);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block1Context extends ParserRuleContext {
		public Statement0Context statement0() {
			return getRuleContext(Statement0Context.class,0);
		}
		public Block1Context block1() {
			return getRuleContext(Block1Context.class,0);
		}
		public Block1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterBlock1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitBlock1(this);
		}
	}

	public final Block1Context block1() throws RecognitionException {
		Block1Context _localctx = new Block1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_block1);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				statement0();
				setState(142);
				block1();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Function_decl0Context extends ParserRuleContext {
		public Type0Context type0() {
			return getRuleContext(Type0Context.class,0);
		}
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Parameters0Context parameters0() {
			return getRuleContext(Parameters0Context.class,0);
		}
		public Decl_block0Context decl_block0() {
			return getRuleContext(Decl_block0Context.class,0);
		}
		public Function_decl0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterFunction_decl0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitFunction_decl0(this);
		}
	}

	public final Function_decl0Context function_decl0() throws RecognitionException {
		Function_decl0Context _localctx = new Function_decl0Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_decl0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__2);
			setState(148);
			type0();
			setState(149);
			match(ID);
			setState(150);
			match(T__3);
			setState(151);
			parameters0();
			setState(152);
			match(T__4);
			setState(153);
			decl_block0();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_block0Context extends ParserRuleContext {
		public Variable_decl0Context variable_decl0() {
			return getRuleContext(Variable_decl0Context.class,0);
		}
		public Decl_block1Context decl_block1() {
			return getRuleContext(Decl_block1Context.class,0);
		}
		public Decl_block0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_block0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterDecl_block0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitDecl_block0(this);
		}
	}

	public final Decl_block0Context decl_block0() throws RecognitionException {
		Decl_block0Context _localctx = new Decl_block0Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl_block0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__0);
			setState(156);
			variable_decl0();
			setState(157);
			decl_block1();
			setState(158);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_block1Context extends ParserRuleContext {
		public Statement0Context statement0() {
			return getRuleContext(Statement0Context.class,0);
		}
		public Decl_block1Context decl_block1() {
			return getRuleContext(Decl_block1Context.class,0);
		}
		public Decl_block1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_block1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterDecl_block1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitDecl_block1(this);
		}
	}

	public final Decl_block1Context decl_block1() throws RecognitionException {
		Decl_block1Context _localctx = new Decl_block1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_decl_block1);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				statement0();
				setState(161);
				decl_block1();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Parameters0Context extends ParserRuleContext {
		public Type0Context type0() {
			return getRuleContext(Type0Context.class,0);
		}
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Parameters1Context parameters1() {
			return getRuleContext(Parameters1Context.class,0);
		}
		public Parameters0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterParameters0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitParameters0(this);
		}
	}

	public final Parameters0Context parameters0() throws RecognitionException {
		Parameters0Context _localctx = new Parameters0Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			type0();
			setState(167);
			match(ID);
			setState(168);
			parameters1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameters1Context extends ParserRuleContext {
		public Parameters0Context parameters0() {
			return getRuleContext(Parameters0Context.class,0);
		}
		public Parameters1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterParameters1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitParameters1(this);
		}
	}

	public final Parameters1Context parameters1() throws RecognitionException {
		Parameters1Context _localctx = new Parameters1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters1);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__5);
				setState(171);
				parameters0();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Variable_decl0Context extends ParserRuleContext {
		public Type0Context type0() {
			return getRuleContext(Type0Context.class,0);
		}
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Variables_decl1Context variables_decl1() {
			return getRuleContext(Variables_decl1Context.class,0);
		}
		public Variable_decl0Context variable_decl0() {
			return getRuleContext(Variable_decl0Context.class,0);
		}
		public Variable_decl0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterVariable_decl0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitVariable_decl0(this);
		}
	}

	public final Variable_decl0Context variable_decl0() throws RecognitionException {
		Variable_decl0Context _localctx = new Variable_decl0Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_decl0);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__6);
				setState(176);
				type0();
				setState(177);
				match(ID);
				setState(178);
				variables_decl1();
				setState(179);
				match(T__7);
				setState(180);
				variable_decl0();
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Variables_decl1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Variables_decl1Context variables_decl1() {
			return getRuleContext(Variables_decl1Context.class,0);
		}
		public Variables_decl1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_decl1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterVariables_decl1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitVariables_decl1(this);
		}
	}

	public final Variables_decl1Context variables_decl1() throws RecognitionException {
		Variables_decl1Context _localctx = new Variables_decl1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_variables_decl1);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__5);
				setState(186);
				match(ID);
				setState(187);
				variables_decl1();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Assignment0Context extends ParserRuleContext {
		public Value0Context value0() {
			return getRuleContext(Value0Context.class,0);
		}
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Assignment0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterAssignment0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitAssignment0(this);
		}
	}

	public final Assignment0Context assignment0() throws RecognitionException {
		Assignment0Context _localctx = new Assignment0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			value0();
			setState(192);
			match(T__8);
			setState(193);
			expression0();
			setState(194);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call0Context extends ParserRuleContext {
		public Function_call_aux0Context function_call_aux0() {
			return getRuleContext(Function_call_aux0Context.class,0);
		}
		public Function_call0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterFunction_call0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitFunction_call0(this);
		}
	}

	public final Function_call0Context function_call0() throws RecognitionException {
		Function_call0Context _localctx = new Function_call0Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			function_call_aux0();
			setState(197);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_aux0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Function_call_aux1Context function_call_aux1() {
			return getRuleContext(Function_call_aux1Context.class,0);
		}
		public Function_call_aux0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_aux0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterFunction_call_aux0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitFunction_call_aux0(this);
		}
	}

	public final Function_call_aux0Context function_call_aux0() throws RecognitionException {
		Function_call_aux0Context _localctx = new Function_call_aux0Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_call_aux0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(200);
			match(T__3);
			setState(201);
			function_call_aux1();
			setState(202);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_aux1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Function_call_aux2Context function_call_aux2() {
			return getRuleContext(Function_call_aux2Context.class,0);
		}
		public Function_call_aux1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_aux1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterFunction_call_aux1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitFunction_call_aux1(this);
		}
	}

	public final Function_call_aux1Context function_call_aux1() throws RecognitionException {
		Function_call_aux1Context _localctx = new Function_call_aux1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call_aux1);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ID);
				setState(205);
				function_call_aux2();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Function_call_aux2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Function_call_aux2Context function_call_aux2() {
			return getRuleContext(Function_call_aux2Context.class,0);
		}
		public Function_call_aux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_aux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterFunction_call_aux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitFunction_call_aux2(this);
		}
	}

	public final Function_call_aux2Context function_call_aux2() throws RecognitionException {
		Function_call_aux2Context _localctx = new Function_call_aux2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_call_aux2);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__5);
				setState(210);
				match(ID);
				setState(211);
				function_call_aux2();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class If0Context extends ParserRuleContext {
		public Bool_exp0Context bool_exp0() {
			return getRuleContext(Bool_exp0Context.class,0);
		}
		public Block0Context block0() {
			return getRuleContext(Block0Context.class,0);
		}
		public Else0Context else0() {
			return getRuleContext(Else0Context.class,0);
		}
		public If0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterIf0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitIf0(this);
		}
	}

	public final If0Context if0() throws RecognitionException {
		If0Context _localctx = new If0Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_if0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__9);
			setState(216);
			match(T__3);
			setState(217);
			bool_exp0();
			setState(218);
			match(T__4);
			setState(219);
			block0();
			setState(220);
			else0();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else0Context extends ParserRuleContext {
		public Bool_exp0Context bool_exp0() {
			return getRuleContext(Bool_exp0Context.class,0);
		}
		public Block0Context block0() {
			return getRuleContext(Block0Context.class,0);
		}
		public Else0Context else0() {
			return getRuleContext(Else0Context.class,0);
		}
		public Else0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterElse0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitElse0(this);
		}
	}

	public final Else0Context else0() throws RecognitionException {
		Else0Context _localctx = new Else0Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_else0);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__10);
				setState(223);
				match(T__3);
				setState(224);
				bool_exp0();
				setState(225);
				match(T__4);
				setState(226);
				block0();
				setState(227);
				else0();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__11);
				setState(230);
				block0();
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class While0Context extends ParserRuleContext {
		public Bool_exp0Context bool_exp0() {
			return getRuleContext(Bool_exp0Context.class,0);
		}
		public Block0Context block0() {
			return getRuleContext(Block0Context.class,0);
		}
		public While0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterWhile0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitWhile0(this);
		}
	}

	public final While0Context while0() throws RecognitionException {
		While0Context _localctx = new While0Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_while0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__12);
			setState(235);
			match(T__3);
			setState(236);
			bool_exp0();
			setState(237);
			match(T__4);
			setState(238);
			block0();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Io_statement0Context extends ParserRuleContext {
		public Input0Context input0() {
			return getRuleContext(Input0Context.class,0);
		}
		public Output0Context output0() {
			return getRuleContext(Output0Context.class,0);
		}
		public Plot0Context plot0() {
			return getRuleContext(Plot0Context.class,0);
		}
		public Readcsv0Context readcsv0() {
			return getRuleContext(Readcsv0Context.class,0);
		}
		public Io_statement0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_statement0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterIo_statement0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitIo_statement0(this);
		}
	}

	public final Io_statement0Context io_statement0() throws RecognitionException {
		Io_statement0Context _localctx = new Io_statement0Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_io_statement0);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				input0();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				output0();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				plot0();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				readcsv0();
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

	public static class Input0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Input0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterInput0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitInput0(this);
		}
	}

	public final Input0Context input0() throws RecognitionException {
		Input0Context _localctx = new Input0Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_input0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__13);
			setState(247);
			match(T__3);
			setState(248);
			match(ID);
			setState(249);
			match(T__4);
			setState(250);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Output0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterOutput0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitOutput0(this);
		}
	}

	public final Output0Context output0() throws RecognitionException {
		Output0Context _localctx = new Output0Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_output0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__14);
			setState(253);
			match(T__3);
			setState(254);
			expression0();
			setState(255);
			match(T__4);
			setState(256);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Plot0Context extends ParserRuleContext {
		public List<Arithmetic_exp0Context> arithmetic_exp0() {
			return getRuleContexts(Arithmetic_exp0Context.class);
		}
		public Arithmetic_exp0Context arithmetic_exp0(int i) {
			return getRuleContext(Arithmetic_exp0Context.class,i);
		}
		public Plot0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plot0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterPlot0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitPlot0(this);
		}
	}

	public final Plot0Context plot0() throws RecognitionException {
		Plot0Context _localctx = new Plot0Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_plot0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__15);
			setState(259);
			match(T__3);
			setState(260);
			arithmetic_exp0();
			setState(261);
			match(T__5);
			setState(262);
			arithmetic_exp0();
			setState(263);
			match(T__4);
			setState(264);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Readcsv0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Readcsv0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readcsv0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterReadcsv0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitReadcsv0(this);
		}
	}

	public final Readcsv0Context readcsv0() throws RecognitionException {
		Readcsv0Context _localctx = new Readcsv0Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_readcsv0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__16);
			setState(267);
			match(T__3);
			setState(268);
			match(ID);
			setState(269);
			match(T__4);
			setState(270);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Return0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterReturn0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitReturn0(this);
		}
	}

	public final Return0Context return0() throws RecognitionException {
		Return0Context _localctx = new Return0Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_return0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__17);
			setState(273);
			expression0();
			setState(274);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression0Context extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PpParser.STRING_LITERAL, 0); }
		public Bool_exp0Context bool_exp0() {
			return getRuleContext(Bool_exp0Context.class,0);
		}
		public Expression0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterExpression0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitExpression0(this);
		}
	}

	public final Expression0Context expression0() throws RecognitionException {
		Expression0Context _localctx = new Expression0Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression0);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(STRING_LITERAL);
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__7:
			case T__18:
			case T__28:
			case T__34:
			case T__35:
			case ID:
			case INT_NUMBER:
			case FLOAT_NUMBER:
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				bool_exp0();
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

	public static class Bool_exp0Context extends ParserRuleContext {
		public Bool_term0Context bool_term0() {
			return getRuleContext(Bool_term0Context.class,0);
		}
		public Bool_exp1Context bool_exp1() {
			return getRuleContext(Bool_exp1Context.class,0);
		}
		public Bool_exp0Context bool_exp0() {
			return getRuleContext(Bool_exp0Context.class,0);
		}
		public Bool_exp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_exp0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterBool_exp0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitBool_exp0(this);
		}
	}

	public final Bool_exp0Context bool_exp0() throws RecognitionException {
		Bool_exp0Context _localctx = new Bool_exp0Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_bool_exp0);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__7:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__3:
			case T__28:
			case T__34:
			case ID:
			case INT_NUMBER:
			case FLOAT_NUMBER:
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				bool_term0();
				setState(282);
				bool_exp1();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__18);
				setState(285);
				bool_exp0();
				setState(286);
				bool_exp1();
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

	public static class Bool_exp1Context extends ParserRuleContext {
		public Bool_op0Context bool_op0() {
			return getRuleContext(Bool_op0Context.class,0);
		}
		public Bool_exp0Context bool_exp0() {
			return getRuleContext(Bool_exp0Context.class,0);
		}
		public Bool_exp1Context bool_exp1() {
			return getRuleContext(Bool_exp1Context.class,0);
		}
		public Bool_exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterBool_exp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitBool_exp1(this);
		}
	}

	public final Bool_exp1Context bool_exp1() throws RecognitionException {
		Bool_exp1Context _localctx = new Bool_exp1Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_bool_exp1);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				bool_op0();
				setState(291);
				bool_exp0();
				setState(292);
				bool_exp1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Bool_term0Context extends ParserRuleContext {
		public Arithmetic_exp0Context arithmetic_exp0() {
			return getRuleContext(Arithmetic_exp0Context.class,0);
		}
		public Bool_term1Context bool_term1() {
			return getRuleContext(Bool_term1Context.class,0);
		}
		public Bool_term0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterBool_term0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitBool_term0(this);
		}
	}

	public final Bool_term0Context bool_term0() throws RecognitionException {
		Bool_term0Context _localctx = new Bool_term0Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_bool_term0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			arithmetic_exp0();
			setState(298);
			bool_term1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_term1Context extends ParserRuleContext {
		public Rel_op0Context rel_op0() {
			return getRuleContext(Rel_op0Context.class,0);
		}
		public Arithmetic_exp0Context arithmetic_exp0() {
			return getRuleContext(Arithmetic_exp0Context.class,0);
		}
		public Bool_term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterBool_term1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitBool_term1(this);
		}
	}

	public final Bool_term1Context bool_term1() throws RecognitionException {
		Bool_term1Context _localctx = new Bool_term1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool_term1);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				rel_op0();
				setState(301);
				arithmetic_exp0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Bool_op0Context extends ParserRuleContext {
		public Bool_op0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterBool_op0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitBool_op0(this);
		}
	}

	public final Bool_op0Context bool_op0() throws RecognitionException {
		Bool_op0Context _localctx = new Bool_op0Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_bool_op0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class Rel_op0Context extends ParserRuleContext {
		public Rel_op0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterRel_op0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitRel_op0(this);
		}
	}

	public final Rel_op0Context rel_op0() throws RecognitionException {
		Rel_op0Context _localctx = new Rel_op0Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_rel_op0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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

	public static class Arithmetic_exp0Context extends ParserRuleContext {
		public Arithmetic_factor0Context arithmetic_factor0() {
			return getRuleContext(Arithmetic_factor0Context.class,0);
		}
		public Arithmetic_exp1Context arithmetic_exp1() {
			return getRuleContext(Arithmetic_exp1Context.class,0);
		}
		public Arithmetic_exp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_exp0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterArithmetic_exp0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitArithmetic_exp0(this);
		}
	}

	public final Arithmetic_exp0Context arithmetic_exp0() throws RecognitionException {
		Arithmetic_exp0Context _localctx = new Arithmetic_exp0Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_arithmetic_exp0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			arithmetic_factor0();
			setState(311);
			arithmetic_exp1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_exp1Context extends ParserRuleContext {
		public Addition_subtraction0Context addition_subtraction0() {
			return getRuleContext(Addition_subtraction0Context.class,0);
		}
		public Arithmetic_factor0Context arithmetic_factor0() {
			return getRuleContext(Arithmetic_factor0Context.class,0);
		}
		public Arithmetic_exp1Context arithmetic_exp1() {
			return getRuleContext(Arithmetic_exp1Context.class,0);
		}
		public Arithmetic_exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterArithmetic_exp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitArithmetic_exp1(this);
		}
	}

	public final Arithmetic_exp1Context arithmetic_exp1() throws RecognitionException {
		Arithmetic_exp1Context _localctx = new Arithmetic_exp1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_arithmetic_exp1);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				addition_subtraction0();
				setState(314);
				arithmetic_factor0();
				setState(315);
				arithmetic_exp1();
				}
				break;
			case T__4:
			case T__5:
			case T__7:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Addition_subtraction0Context extends ParserRuleContext {
		public Addition_subtraction0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition_subtraction0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterAddition_subtraction0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitAddition_subtraction0(this);
		}
	}

	public final Addition_subtraction0Context addition_subtraction0() throws RecognitionException {
		Addition_subtraction0Context _localctx = new Addition_subtraction0Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_addition_subtraction0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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

	public static class Arithmetic_factor0Context extends ParserRuleContext {
		public Arithmetic_term0Context arithmetic_term0() {
			return getRuleContext(Arithmetic_term0Context.class,0);
		}
		public Arithmetic_factor1Context arithmetic_factor1() {
			return getRuleContext(Arithmetic_factor1Context.class,0);
		}
		public Arithmetic_factor0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_factor0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterArithmetic_factor0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitArithmetic_factor0(this);
		}
	}

	public final Arithmetic_factor0Context arithmetic_factor0() throws RecognitionException {
		Arithmetic_factor0Context _localctx = new Arithmetic_factor0Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_arithmetic_factor0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			arithmetic_term0();
			setState(323);
			arithmetic_factor1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_factor1Context extends ParserRuleContext {
		public Multiplication_division0Context multiplication_division0() {
			return getRuleContext(Multiplication_division0Context.class,0);
		}
		public Arithmetic_term0Context arithmetic_term0() {
			return getRuleContext(Arithmetic_term0Context.class,0);
		}
		public Arithmetic_factor1Context arithmetic_factor1() {
			return getRuleContext(Arithmetic_factor1Context.class,0);
		}
		public Arithmetic_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterArithmetic_factor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitArithmetic_factor1(this);
		}
	}

	public final Arithmetic_factor1Context arithmetic_factor1() throws RecognitionException {
		Arithmetic_factor1Context _localctx = new Arithmetic_factor1Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_arithmetic_factor1);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				multiplication_division0();
				setState(326);
				arithmetic_term0();
				setState(327);
				arithmetic_factor1();
				}
				break;
			case T__4:
			case T__5:
			case T__7:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Multiplication_division0Context extends ParserRuleContext {
		public Multiplication_division0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication_division0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterMultiplication_division0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitMultiplication_division0(this);
		}
	}

	public final Multiplication_division0Context multiplication_division0() throws RecognitionException {
		Multiplication_division0Context _localctx = new Multiplication_division0Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_multiplication_division0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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

	public static class Arithmetic_term0Context extends ParserRuleContext {
		public Numeric_term0Context numeric_term0() {
			return getRuleContext(Numeric_term0Context.class,0);
		}
		public Arithmetic_term1Context arithmetic_term1() {
			return getRuleContext(Arithmetic_term1Context.class,0);
		}
		public Arithmetic_term0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_term0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterArithmetic_term0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitArithmetic_term0(this);
		}
	}

	public final Arithmetic_term0Context arithmetic_term0() throws RecognitionException {
		Arithmetic_term0Context _localctx = new Arithmetic_term0Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_arithmetic_term0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			numeric_term0();
			setState(335);
			arithmetic_term1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_term1Context extends ParserRuleContext {
		public Exponent0Context exponent0() {
			return getRuleContext(Exponent0Context.class,0);
		}
		public Numeric_term0Context numeric_term0() {
			return getRuleContext(Numeric_term0Context.class,0);
		}
		public Arithmetic_term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterArithmetic_term1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitArithmetic_term1(this);
		}
	}

	public final Arithmetic_term1Context arithmetic_term1() throws RecognitionException {
		Arithmetic_term1Context _localctx = new Arithmetic_term1Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_arithmetic_term1);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				exponent0();
				setState(338);
				numeric_term0();
				}
				break;
			case T__4:
			case T__5:
			case T__7:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Exponent0Context extends ParserRuleContext {
		public Exponent0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponent0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterExponent0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitExponent0(this);
		}
	}

	public final Exponent0Context exponent0() throws RecognitionException {
		Exponent0Context _localctx = new Exponent0Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_exponent0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_term0Context extends ParserRuleContext {
		public Sign0Context sign0() {
			return getRuleContext(Sign0Context.class,0);
		}
		public Numeric_term1Context numeric_term1() {
			return getRuleContext(Numeric_term1Context.class,0);
		}
		public TerminalNode INT_NUMBER() { return getToken(PpParser.INT_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(PpParser.FLOAT_NUMBER, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(PpParser.BOOL_LITERAL, 0); }
		public Bool_exp0Context bool_exp0() {
			return getRuleContext(Bool_exp0Context.class,0);
		}
		public Numeric_term0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_term0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterNumeric_term0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitNumeric_term0(this);
		}
	}

	public final Numeric_term0Context numeric_term0() throws RecognitionException {
		Numeric_term0Context _localctx = new Numeric_term0Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_numeric_term0);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__34:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				sign0();
				setState(346);
				numeric_term1();
				}
				break;
			case INT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(INT_NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(FLOAT_NUMBER);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(BOOL_LITERAL);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				match(T__3);
				setState(352);
				bool_exp0();
				setState(353);
				match(T__4);
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

	public static class Numeric_term1Context extends ParserRuleContext {
		public Value0Context value0() {
			return getRuleContext(Value0Context.class,0);
		}
		public Function_call_aux0Context function_call_aux0() {
			return getRuleContext(Function_call_aux0Context.class,0);
		}
		public Matrix_literal0Context matrix_literal0() {
			return getRuleContext(Matrix_literal0Context.class,0);
		}
		public Numeric_term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterNumeric_term1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitNumeric_term1(this);
		}
	}

	public final Numeric_term1Context numeric_term1() throws RecognitionException {
		Numeric_term1Context _localctx = new Numeric_term1Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_numeric_term1);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				value0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				function_call_aux0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				matrix_literal0();
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

	public static class Sign0Context extends ParserRuleContext {
		public Sign0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterSign0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitSign0(this);
		}
	}

	public final Sign0Context sign0() throws RecognitionException {
		Sign0Context _localctx = new Sign0Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_sign0);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(T__28);
				}
				break;
			case T__34:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Type0Context extends ParserRuleContext {
		public Basic_type0Context basic_type0() {
			return getRuleContext(Basic_type0Context.class,0);
		}
		public List<TerminalNode> INT_NUMBER() { return getTokens(PpParser.INT_NUMBER); }
		public TerminalNode INT_NUMBER(int i) {
			return getToken(PpParser.INT_NUMBER, i);
		}
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
		}
		public Type0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterType0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitType0(this);
		}
	}

	public final Type0Context type0() throws RecognitionException {
		Type0Context _localctx = new Type0Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_type0);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				basic_type0();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(T__33);
				setState(368);
				match(T__24);
				setState(369);
				basic_type0();
				setState(370);
				match(T__23);
				setState(371);
				match(T__34);
				setState(372);
				match(INT_NUMBER);
				setState(373);
				match(T__35);
				setState(374);
				match(T__34);
				setState(375);
				match(INT_NUMBER);
				setState(376);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(T__36);
				setState(379);
				match(T__24);
				setState(380);
				basic_type0();
				setState(381);
				type1();
				setState(382);
				match(T__23);
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

	public static class Type1Context extends ParserRuleContext {
		public Basic_type0Context basic_type0() {
			return getRuleContext(Basic_type0Context.class,0);
		}
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
		}
		public Type1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitType1(this);
		}
	}

	public final Type1Context type1() throws RecognitionException {
		Type1Context _localctx = new Type1Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_type1);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(T__5);
				setState(387);
				basic_type0();
				setState(388);
				type1();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Basic_type0Context extends ParserRuleContext {
		public Basic_type0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterBasic_type0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitBasic_type0(this);
		}
	}

	public final Basic_type0Context basic_type0() throws RecognitionException {
		Basic_type0Context _localctx = new Basic_type0Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_basic_type0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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

	public static class Value0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Value1Context value1() {
			return getRuleContext(Value1Context.class,0);
		}
		public Value0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterValue0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitValue0(this);
		}
	}

	public final Value0Context value0() throws RecognitionException {
		Value0Context _localctx = new Value0Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_value0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(ID);
			setState(396);
			value1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value1Context extends ParserRuleContext {
		public List<Arithmetic_exp0Context> arithmetic_exp0() {
			return getRuleContexts(Arithmetic_exp0Context.class);
		}
		public Arithmetic_exp0Context arithmetic_exp0(int i) {
			return getRuleContext(Arithmetic_exp0Context.class,i);
		}
		public Value1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterValue1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitValue1(this);
		}
	}

	public final Value1Context value1() throws RecognitionException {
		Value1Context _localctx = new Value1Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_value1);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(T__34);
				setState(399);
				arithmetic_exp0();
				setState(400);
				match(T__35);
				setState(401);
				match(T__34);
				setState(402);
				arithmetic_exp0();
				setState(403);
				match(T__35);
				}
				break;
			case T__4:
			case T__5:
			case T__7:
			case T__8:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Matrix_literal0Context extends ParserRuleContext {
		public Matrix_literal1Context matrix_literal1() {
			return getRuleContext(Matrix_literal1Context.class,0);
		}
		public Matrix_literal0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_literal0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterMatrix_literal0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitMatrix_literal0(this);
		}
	}

	public final Matrix_literal0Context matrix_literal0() throws RecognitionException {
		Matrix_literal0Context _localctx = new Matrix_literal0Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_matrix_literal0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__34);
			setState(409);
			matrix_literal1();
			setState(410);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matrix_literal1Context extends ParserRuleContext {
		public Matrix_literal2Context matrix_literal2() {
			return getRuleContext(Matrix_literal2Context.class,0);
		}
		public Matrix_literal3Context matrix_literal3() {
			return getRuleContext(Matrix_literal3Context.class,0);
		}
		public Matrix_literal1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_literal1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterMatrix_literal1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitMatrix_literal1(this);
		}
	}

	public final Matrix_literal1Context matrix_literal1() throws RecognitionException {
		Matrix_literal1Context _localctx = new Matrix_literal1Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_matrix_literal1);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(T__34);
				setState(413);
				matrix_literal2();
				setState(414);
				match(T__35);
				setState(415);
				matrix_literal3();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Matrix_literal2Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Matrix_literal4Context matrix_literal4() {
			return getRuleContext(Matrix_literal4Context.class,0);
		}
		public Matrix_literal2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_literal2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterMatrix_literal2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitMatrix_literal2(this);
		}
	}

	public final Matrix_literal2Context matrix_literal2() throws RecognitionException {
		Matrix_literal2Context _localctx = new Matrix_literal2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_matrix_literal2);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				expression0();
				setState(421);
				matrix_literal4();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Matrix_literal3Context extends ParserRuleContext {
		public Matrix_literal2Context matrix_literal2() {
			return getRuleContext(Matrix_literal2Context.class,0);
		}
		public Matrix_literal3Context matrix_literal3() {
			return getRuleContext(Matrix_literal3Context.class,0);
		}
		public Matrix_literal3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_literal3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterMatrix_literal3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitMatrix_literal3(this);
		}
	}

	public final Matrix_literal3Context matrix_literal3() throws RecognitionException {
		Matrix_literal3Context _localctx = new Matrix_literal3Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_matrix_literal3);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(T__5);
				setState(427);
				match(T__34);
				setState(428);
				matrix_literal2();
				setState(429);
				match(T__35);
				setState(430);
				matrix_literal3();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Matrix_literal4Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Matrix_literal4Context matrix_literal4() {
			return getRuleContext(Matrix_literal4Context.class,0);
		}
		public Matrix_literal4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_literal4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).enterMatrix_literal4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PpListener ) ((PpListener)listener).exitMatrix_literal4(this);
		}
	}

	public final Matrix_literal4Context matrix_literal4() throws RecognitionException {
		Matrix_literal4Context _localctx = new Matrix_literal4Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_matrix_literal4);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(T__5);
				setState(436);
				expression0();
				setState(437);
				matrix_literal4();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01bd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3y\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u008a\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0094\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00a7"+
		"\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00ba\n\r\3\16\3\16\3\16\3\16\5\16\u00c0\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\5\22\u00d2\n\22\3\23\3\23\3\23\3\23\5\23\u00d8\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00eb\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27"+
		"\u00f7\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u0119\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0123\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u012a\n"+
		"\37\3 \3 \3 \3!\3!\3!\3!\5!\u0133\n!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\5%\u0141\n%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u014d\n(\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3+\5+\u0158\n+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5"+
		"-\u0166\n-\3.\3.\3.\5.\u016b\n.\3/\3/\5/\u016f\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0183\n\60\3\61\3\61\3\61\3\61\3\61\5\61\u018a\n\61\3\62\3\62\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0199\n\64"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01a5\n\66\3\67"+
		"\3\67\3\67\3\67\5\67\u01ab\n\67\38\38\38\38\38\38\38\58\u01b4\n8\39\3"+
		"9\39\39\39\59\u01bb\n9\39\2\2:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\7\3\2\26\31\3\2"+
		"\30\35\3\2\36\37\3\2 \"\3\2(+\2\u01af\2r\3\2\2\2\4x\3\2\2\2\6\u0081\3"+
		"\2\2\2\b\u0089\3\2\2\2\n\u008b\3\2\2\2\f\u0093\3\2\2\2\16\u0095\3\2\2"+
		"\2\20\u009d\3\2\2\2\22\u00a6\3\2\2\2\24\u00a8\3\2\2\2\26\u00af\3\2\2\2"+
		"\30\u00b9\3\2\2\2\32\u00bf\3\2\2\2\34\u00c1\3\2\2\2\36\u00c6\3\2\2\2 "+
		"\u00c9\3\2\2\2\"\u00d1\3\2\2\2$\u00d7\3\2\2\2&\u00d9\3\2\2\2(\u00ea\3"+
		"\2\2\2*\u00ec\3\2\2\2,\u00f6\3\2\2\2.\u00f8\3\2\2\2\60\u00fe\3\2\2\2\62"+
		"\u0104\3\2\2\2\64\u010c\3\2\2\2\66\u0112\3\2\2\28\u0118\3\2\2\2:\u0122"+
		"\3\2\2\2<\u0129\3\2\2\2>\u012b\3\2\2\2@\u0132\3\2\2\2B\u0134\3\2\2\2D"+
		"\u0136\3\2\2\2F\u0138\3\2\2\2H\u0140\3\2\2\2J\u0142\3\2\2\2L\u0144\3\2"+
		"\2\2N\u014c\3\2\2\2P\u014e\3\2\2\2R\u0150\3\2\2\2T\u0157\3\2\2\2V\u0159"+
		"\3\2\2\2X\u0165\3\2\2\2Z\u016a\3\2\2\2\\\u016e\3\2\2\2^\u0182\3\2\2\2"+
		"`\u0189\3\2\2\2b\u018b\3\2\2\2d\u018d\3\2\2\2f\u0198\3\2\2\2h\u019a\3"+
		"\2\2\2j\u01a4\3\2\2\2l\u01aa\3\2\2\2n\u01b3\3\2\2\2p\u01ba\3\2\2\2rs\5"+
		"\4\3\2s\3\3\2\2\2tu\5\30\r\2uv\5\6\4\2vy\3\2\2\2wy\5\6\4\2xt\3\2\2\2x"+
		"w\3\2\2\2y\5\3\2\2\2z{\5\b\5\2{|\5\6\4\2|\u0082\3\2\2\2}~\5\16\b\2~\177"+
		"\5\6\4\2\177\u0082\3\2\2\2\u0080\u0082\3\2\2\2\u0081z\3\2\2\2\u0081}\3"+
		"\2\2\2\u0081\u0080\3\2\2\2\u0082\7\3\2\2\2\u0083\u008a\5\34\17\2\u0084"+
		"\u008a\5\36\20\2\u0085\u008a\5,\27\2\u0086\u008a\5&\24\2\u0087\u008a\5"+
		"*\26\2\u0088\u008a\5\66\34\2\u0089\u0083\3\2\2\2\u0089\u0084\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2"+
		"\2\2\u008a\t\3\2\2\2\u008b\u008c\7\3\2\2\u008c\u008d\5\f\7\2\u008d\u008e"+
		"\7\4\2\2\u008e\13\3\2\2\2\u008f\u0090\5\b\5\2\u0090\u0091\5\f\7\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\r\3\2\2\2\u0095\u0096\7\5\2\2\u0096\u0097\5^\60\2\u0097\u0098"+
		"\7,\2\2\u0098\u0099\7\6\2\2\u0099\u009a\5\24\13\2\u009a\u009b\7\7\2\2"+
		"\u009b\u009c\5\20\t\2\u009c\17\3\2\2\2\u009d\u009e\7\3\2\2\u009e\u009f"+
		"\5\30\r\2\u009f\u00a0\5\22\n\2\u00a0\u00a1\7\4\2\2\u00a1\21\3\2\2\2\u00a2"+
		"\u00a3\5\b\5\2\u00a3\u00a4\5\22\n\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\3"+
		"\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\23\3\2\2\2\u00a8"+
		"\u00a9\5^\60\2\u00a9\u00aa\7,\2\2\u00aa\u00ab\5\26\f\2\u00ab\25\3\2\2"+
		"\2\u00ac\u00ad\7\b\2\2\u00ad\u00b0\5\24\13\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b2\7\t\2"+
		"\2\u00b2\u00b3\5^\60\2\u00b3\u00b4\7,\2\2\u00b4\u00b5\5\32\16\2\u00b5"+
		"\u00b6\7\n\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\3"+
		"\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\31\3\2\2\2\u00bb"+
		"\u00bc\7\b\2\2\u00bc\u00bd\7,\2\2\u00bd\u00c0\5\32\16\2\u00be\u00c0\3"+
		"\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\33\3\2\2\2\u00c1"+
		"\u00c2\5d\63\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4\58\35\2\u00c4\u00c5\7"+
		"\n\2\2\u00c5\35\3\2\2\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\7\n\2\2\u00c8"+
		"\37\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\5\"\22"+
		"\2\u00cc\u00cd\7\7\2\2\u00cd!\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d2\5"+
		"$\23\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"#\3\2\2\2\u00d3\u00d4\7\b\2\2\u00d4\u00d5\7,\2\2\u00d5\u00d8\5$\23\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8%\3\2\2\2"+
		"\u00d9\u00da\7\f\2\2\u00da\u00db\7\6\2\2\u00db\u00dc\5:\36\2\u00dc\u00dd"+
		"\7\7\2\2\u00dd\u00de\5\n\6\2\u00de\u00df\5(\25\2\u00df\'\3\2\2\2\u00e0"+
		"\u00e1\7\r\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5:\36\2\u00e3\u00e4\7\7"+
		"\2\2\u00e4\u00e5\5\n\6\2\u00e5\u00e6\5(\25\2\u00e6\u00eb\3\2\2\2\u00e7"+
		"\u00e8\7\16\2\2\u00e8\u00eb\5\n\6\2\u00e9\u00eb\3\2\2\2\u00ea\u00e0\3"+
		"\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb)\3\2\2\2\u00ec\u00ed"+
		"\7\17\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5:\36\2\u00ef\u00f0\7\7\2\2"+
		"\u00f0\u00f1\5\n\6\2\u00f1+\3\2\2\2\u00f2\u00f7\5.\30\2\u00f3\u00f7\5"+
		"\60\31\2\u00f4\u00f7\5\62\32\2\u00f5\u00f7\5\64\33\2\u00f6\u00f2\3\2\2"+
		"\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7-"+
		"\3\2\2\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\7,\2\2\u00fb"+
		"\u00fc\7\7\2\2\u00fc\u00fd\7\n\2\2\u00fd/\3\2\2\2\u00fe\u00ff\7\21\2\2"+
		"\u00ff\u0100\7\6\2\2\u0100\u0101\58\35\2\u0101\u0102\7\7\2\2\u0102\u0103"+
		"\7\n\2\2\u0103\61\3\2\2\2\u0104\u0105\7\22\2\2\u0105\u0106\7\6\2\2\u0106"+
		"\u0107\5F$\2\u0107\u0108\7\b\2\2\u0108\u0109\5F$\2\u0109\u010a\7\7\2\2"+
		"\u010a\u010b\7\n\2\2\u010b\63\3\2\2\2\u010c\u010d\7\23\2\2\u010d\u010e"+
		"\7\6\2\2\u010e\u010f\7,\2\2\u010f\u0110\7\7\2\2\u0110\u0111\7\n\2\2\u0111"+
		"\65\3\2\2\2\u0112\u0113\7\24\2\2\u0113\u0114\58\35\2\u0114\u0115\7\n\2"+
		"\2\u0115\67\3\2\2\2\u0116\u0119\7/\2\2\u0117\u0119\5:\36\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u01199\3\2\2\2\u011a\u0123\3\2\2\2\u011b"+
		"\u011c\5> \2\u011c\u011d\5<\37\2\u011d\u0123\3\2\2\2\u011e\u011f\7\25"+
		"\2\2\u011f\u0120\5:\36\2\u0120\u0121\5<\37\2\u0121\u0123\3\2\2\2\u0122"+
		"\u011a\3\2\2\2\u0122\u011b\3\2\2\2\u0122\u011e\3\2\2\2\u0123;\3\2\2\2"+
		"\u0124\u0125\5B\"\2\u0125\u0126\5:\36\2\u0126\u0127\5<\37\2\u0127\u012a"+
		"\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"=\3\2\2\2\u012b\u012c\5F$\2\u012c\u012d\5@!\2\u012d?\3\2\2\2\u012e\u012f"+
		"\5D#\2\u012f\u0130\5F$\2\u0130\u0133\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u012e\3\2\2\2\u0132\u0131\3\2\2\2\u0133A\3\2\2\2\u0134\u0135\t\2\2\2"+
		"\u0135C\3\2\2\2\u0136\u0137\t\3\2\2\u0137E\3\2\2\2\u0138\u0139\5L\'\2"+
		"\u0139\u013a\5H%\2\u013aG\3\2\2\2\u013b\u013c\5J&\2\u013c\u013d\5L\'\2"+
		"\u013d\u013e\5H%\2\u013e\u0141\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013b"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0141I\3\2\2\2\u0142\u0143\t\4\2\2\u0143"+
		"K\3\2\2\2\u0144\u0145\5R*\2\u0145\u0146\5N(\2\u0146M\3\2\2\2\u0147\u0148"+
		"\5P)\2\u0148\u0149\5R*\2\u0149\u014a\5N(\2\u014a\u014d\3\2\2\2\u014b\u014d"+
		"\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u014b\3\2\2\2\u014dO\3\2\2\2\u014e"+
		"\u014f\t\5\2\2\u014fQ\3\2\2\2\u0150\u0151\5X-\2\u0151\u0152\5T+\2\u0152"+
		"S\3\2\2\2\u0153\u0154\5V,\2\u0154\u0155\5X-\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0156\3\2\2\2\u0158U\3\2\2\2"+
		"\u0159\u015a\7#\2\2\u015aW\3\2\2\2\u015b\u015c\5\\/\2\u015c\u015d\5Z."+
		"\2\u015d\u0166\3\2\2\2\u015e\u0166\7-\2\2\u015f\u0166\7.\2\2\u0160\u0166"+
		"\7\60\2\2\u0161\u0162\7\6\2\2\u0162\u0163\5:\36\2\u0163\u0164\7\7\2\2"+
		"\u0164\u0166\3\2\2\2\u0165\u015b\3\2\2\2\u0165\u015e\3\2\2\2\u0165\u015f"+
		"\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0166Y\3\2\2\2\u0167"+
		"\u016b\5d\63\2\u0168\u016b\5 \21\2\u0169\u016b\5h\65\2\u016a\u0167\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b[\3\2\2\2\u016c\u016f"+
		"\7\37\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2"+
		"\u016f]\3\2\2\2\u0170\u0183\5b\62\2\u0171\u0172\7$\2\2\u0172\u0173\7\33"+
		"\2\2\u0173\u0174\5b\62\2\u0174\u0175\7\32\2\2\u0175\u0176\7%\2\2\u0176"+
		"\u0177\7-\2\2\u0177\u0178\7&\2\2\u0178\u0179\7%\2\2\u0179\u017a\7-\2\2"+
		"\u017a\u017b\7&\2\2\u017b\u0183\3\2\2\2\u017c\u017d\7\'\2\2\u017d\u017e"+
		"\7\33\2\2\u017e\u017f\5b\62\2\u017f\u0180\5`\61\2\u0180\u0181\7\32\2\2"+
		"\u0181\u0183\3\2\2\2\u0182\u0170\3\2\2\2\u0182\u0171\3\2\2\2\u0182\u017c"+
		"\3\2\2\2\u0183_\3\2\2\2\u0184\u0185\7\b\2\2\u0185\u0186\5b\62\2\u0186"+
		"\u0187\5`\61\2\u0187\u018a\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0184\3\2"+
		"\2\2\u0189\u0188\3\2\2\2\u018aa\3\2\2\2\u018b\u018c\t\6\2\2\u018cc\3\2"+
		"\2\2\u018d\u018e\7,\2\2\u018e\u018f\5f\64\2\u018fe\3\2\2\2\u0190\u0191"+
		"\7%\2\2\u0191\u0192\5F$\2\u0192\u0193\7&\2\2\u0193\u0194\7%\2\2\u0194"+
		"\u0195\5F$\2\u0195\u0196\7&\2\2\u0196\u0199\3\2\2\2\u0197\u0199\3\2\2"+
		"\2\u0198\u0190\3\2\2\2\u0198\u0197\3\2\2\2\u0199g\3\2\2\2\u019a\u019b"+
		"\7%\2\2\u019b\u019c\5j\66\2\u019c\u019d\7&\2\2\u019di\3\2\2\2\u019e\u019f"+
		"\7%\2\2\u019f\u01a0\5l\67\2\u01a0\u01a1\7&\2\2\u01a1\u01a2\5n8\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u019e\3\2\2\2\u01a4\u01a3\3\2"+
		"\2\2\u01a5k\3\2\2\2\u01a6\u01a7\58\35\2\u01a7\u01a8\5p9\2\u01a8\u01ab"+
		"\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"m\3\2\2\2\u01ac\u01ad\7\b\2\2\u01ad\u01ae\7%\2\2\u01ae\u01af\5l\67\2\u01af"+
		"\u01b0\7&\2\2\u01b0\u01b1\5n8\2\u01b1\u01b4\3\2\2\2\u01b2\u01b4\3\2\2"+
		"\2\u01b3\u01ac\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4o\3\2\2\2\u01b5\u01b6"+
		"\7\b\2\2\u01b6\u01b7\58\35\2\u01b7\u01b8\5p9\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bbq\3\2\2\2"+
		"\37x\u0081\u0089\u0093\u00a6\u00af\u00b9\u00bf\u00d1\u00d7\u00ea\u00f6"+
		"\u0118\u0122\u0129\u0132\u0140\u014c\u0157\u0165\u016a\u016e\u0182\u0189"+
		"\u0198\u01a4\u01aa\u01b3\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
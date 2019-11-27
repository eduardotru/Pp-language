// Generated from /home/eduardotr/Documents/Tec/Compilers/Pp/Grammar/Pp.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, INT_NUMBER=73, 
		FLOAT_NUMBER=74, STRING_LITERAL=75, BOOL_LITERAL=76, ID=77, WS=78, LINE_COMMENT=79;
	public static final int
		RULE_r = 0, RULE_program0 = 1, RULE_program1 = 2, RULE_statement0 = 3, 
		RULE_block0 = 4, RULE_block1 = 5, RULE_function_decl0 = 6, RULE_function_type0 = 7, 
		RULE_decl_block0 = 8, RULE_decl_block1 = 9, RULE_parameters_or_empty0 = 10, 
		RULE_parameters0 = 11, RULE_parameters1 = 12, RULE_variable_decl0 = 13, 
		RULE_variables_decl1 = 14, RULE_assignment0 = 15, RULE_function_call0 = 16, 
		RULE_function_call_aux0 = 17, RULE_function_call_aux1 = 18, RULE_function_call_aux2 = 19, 
		RULE_if0 = 20, RULE_else0 = 21, RULE_while0 = 22, RULE_io_statement0 = 23, 
		RULE_input0 = 24, RULE_output0 = 25, RULE_plot0 = 26, RULE_hist0 = 27, 
		RULE_showplot0 = 28, RULE_return0 = 29, RULE_expression0 = 30, RULE_bool_exp0 = 31, 
		RULE_bool_exp1 = 32, RULE_bool_term0 = 33, RULE_bool_term1 = 34, RULE_bool_not0 = 35, 
		RULE_bool_op0 = 36, RULE_rel_op0 = 37, RULE_arithmetic_exp0 = 38, RULE_arithmetic_exp1 = 39, 
		RULE_addition_subtraction0 = 40, RULE_arithmetic_factor0 = 41, RULE_arithmetic_factor1 = 42, 
		RULE_multiplication_division0 = 43, RULE_arithmetic_term0 = 44, RULE_arithmetic_term1 = 45, 
		RULE_exponent0 = 46, RULE_numeric_term0 = 47, RULE_numeric_term1 = 48, 
		RULE_sign0 = 49, RULE_type0 = 50, RULE_basic_type0 = 51, RULE_value0 = 52, 
		RULE_value1 = 53, RULE_matrix_literal0 = 54, RULE_matrix_literal1 = 55, 
		RULE_matrix_literal2 = 56, RULE_matrix_literal3 = 57, RULE_matrix_literal4 = 58, 
		RULE_stat_functions0 = 59, RULE_mean0 = 60, RULE_median0 = 61, RULE_mode0 = 62, 
		RULE_stdev0 = 63, RULE_variance0 = 64, RULE_transpose0 = 65, RULE_beta0 = 66, 
		RULE_dbeta0 = 67, RULE_cbeta0 = 68, RULE_rbeta0 = 69, RULE_binom0 = 70, 
		RULE_dbinom0 = 71, RULE_cbinom0 = 72, RULE_rbinom0 = 73, RULE_exp0 = 74, 
		RULE_dexp0 = 75, RULE_cexp0 = 76, RULE_rexp0 = 77, RULE_gamma0 = 78, RULE_dgamma0 = 79, 
		RULE_cgamma0 = 80, RULE_rgamma0 = 81, RULE_geom0 = 82, RULE_dgeom0 = 83, 
		RULE_cgeom0 = 84, RULE_rgeom0 = 85, RULE_norm0 = 86, RULE_dnorm0 = 87, 
		RULE_cnorm0 = 88, RULE_rnorm0 = 89, RULE_pois0 = 90, RULE_dpois0 = 91, 
		RULE_cpois0 = 92, RULE_rpois0 = 93, RULE_unif0 = 94, RULE_dunif0 = 95, 
		RULE_cunif0 = 96, RULE_runif0 = 97;
	public static final String[] ruleNames = {
		"r", "program0", "program1", "statement0", "block0", "block1", "function_decl0", 
		"function_type0", "decl_block0", "decl_block1", "parameters_or_empty0", 
		"parameters0", "parameters1", "variable_decl0", "variables_decl1", "assignment0", 
		"function_call0", "function_call_aux0", "function_call_aux1", "function_call_aux2", 
		"if0", "else0", "while0", "io_statement0", "input0", "output0", "plot0", 
		"hist0", "showplot0", "return0", "expression0", "bool_exp0", "bool_exp1", 
		"bool_term0", "bool_term1", "bool_not0", "bool_op0", "rel_op0", "arithmetic_exp0", 
		"arithmetic_exp1", "addition_subtraction0", "arithmetic_factor0", "arithmetic_factor1", 
		"multiplication_division0", "arithmetic_term0", "arithmetic_term1", "exponent0", 
		"numeric_term0", "numeric_term1", "sign0", "type0", "basic_type0", "value0", 
		"value1", "matrix_literal0", "matrix_literal1", "matrix_literal2", "matrix_literal3", 
		"matrix_literal4", "stat_functions0", "mean0", "median0", "mode0", "stdev0", 
		"variance0", "transpose0", "beta0", "dbeta0", "cbeta0", "rbeta0", "binom0", 
		"dbinom0", "cbinom0", "rbinom0", "exp0", "dexp0", "cexp0", "rexp0", "gamma0", 
		"dgamma0", "cgamma0", "rgamma0", "geom0", "dgeom0", "cgeom0", "rgeom0", 
		"norm0", "dnorm0", "cnorm0", "rnorm0", "pois0", "dpois0", "cpois0", "rpois0", 
		"unif0", "dunif0", "cunif0", "runif0"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'func'", "'('", "')'", "'void'", "','", "'let'", 
		"';'", "'='", "'if'", "'elseif'", "'else'", "'while'", "'read'", "'write'", 
		"'plot'", "'hist'", "'showplot'", "'return'", "'not'", "'and'", "'or'", 
		"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'matrix'", "'['", "']'", "'float'", "'int'", "'string'", 
		"'bool'", "'mean'", "'median'", "'mode'", "'stdev'", "'variance'", "'transpose'", 
		"'dbeta'", "'cbeta'", "'rbeta'", "'dbinom'", "'cbinom'", "'rbinom'", "'dexp'", 
		"'cexp'", "'rexp'", "'dgamma'", "'cgamma'", "'rgamma'", "'dgeom'", "'cgeom'", 
		"'rgeom'", "'dnorm'", "'cnorm'", "'rnorm'", "'dpois'", "'cpois'", "'rpois'", 
		"'dunif'", "'cunif'", "'runif'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT_NUMBER", "FLOAT_NUMBER", "STRING_LITERAL", "BOOL_LITERAL", 
		"ID", "WS", "LINE_COMMENT"
	};
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
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
	}

	public final Program0Context program0() throws RecognitionException {
		Program0Context _localctx = new Program0Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_program0);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				variable_decl0();
				setState(199);
				program1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
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
	}

	public final Program1Context program1() throws RecognitionException {
		Program1Context _localctx = new Program1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_program1);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				statement0();
				setState(205);
				program1();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				function_decl0();
				setState(208);
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
	}

	public final Statement0Context statement0() throws RecognitionException {
		Statement0Context _localctx = new Statement0Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement0);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				assignment0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				function_call0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				io_statement0();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				if0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				while0();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
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
	}

	public final Block0Context block0() throws RecognitionException {
		Block0Context _localctx = new Block0Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_block0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__0);
			setState(222);
			block1();
			setState(223);
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
	}

	public final Block1Context block1() throws RecognitionException {
		Block1Context _localctx = new Block1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_block1);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				statement0();
				setState(226);
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
		public Function_type0Context function_type0() {
			return getRuleContext(Function_type0Context.class,0);
		}
		public TerminalNode ID() { return getToken(PpParser.ID, 0); }
		public Parameters_or_empty0Context parameters_or_empty0() {
			return getRuleContext(Parameters_or_empty0Context.class,0);
		}
		public Decl_block0Context decl_block0() {
			return getRuleContext(Decl_block0Context.class,0);
		}
		public Function_decl0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl0; }
	}

	public final Function_decl0Context function_decl0() throws RecognitionException {
		Function_decl0Context _localctx = new Function_decl0Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_decl0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__2);
			setState(232);
			function_type0();
			setState(233);
			match(ID);
			setState(234);
			match(T__3);
			setState(235);
			parameters_or_empty0();
			setState(236);
			match(T__4);
			setState(237);
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

	public static class Function_type0Context extends ParserRuleContext {
		public Type0Context type0() {
			return getRuleContext(Type0Context.class,0);
		}
		public Function_type0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type0; }
	}

	public final Function_type0Context function_type0() throws RecognitionException {
		Function_type0Context _localctx = new Function_type0Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_type0);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(T__5);
				}
				break;
			case T__35:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				type0();
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
	}

	public final Decl_block0Context decl_block0() throws RecognitionException {
		Decl_block0Context _localctx = new Decl_block0Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_decl_block0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__0);
			setState(244);
			variable_decl0();
			setState(245);
			decl_block1();
			setState(246);
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
	}

	public final Decl_block1Context decl_block1() throws RecognitionException {
		Decl_block1Context _localctx = new Decl_block1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_decl_block1);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				statement0();
				setState(249);
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

	public static class Parameters_or_empty0Context extends ParserRuleContext {
		public Parameters0Context parameters0() {
			return getRuleContext(Parameters0Context.class,0);
		}
		public Parameters_or_empty0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_or_empty0; }
	}

	public final Parameters_or_empty0Context parameters_or_empty0() throws RecognitionException {
		Parameters_or_empty0Context _localctx = new Parameters_or_empty0Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters_or_empty0);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
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
	}

	public final Parameters0Context parameters0() throws RecognitionException {
		Parameters0Context _localctx = new Parameters0Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameters0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			type0();
			setState(259);
			match(ID);
			setState(260);
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
	}

	public final Parameters1Context parameters1() throws RecognitionException {
		Parameters1Context _localctx = new Parameters1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameters1);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__6);
				setState(263);
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
	}

	public final Variable_decl0Context variable_decl0() throws RecognitionException {
		Variable_decl0Context _localctx = new Variable_decl0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_decl0);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__7);
				setState(268);
				type0();
				setState(269);
				match(ID);
				setState(270);
				variables_decl1();
				setState(271);
				match(T__8);
				setState(272);
				variable_decl0();
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__10:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
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
	}

	public final Variables_decl1Context variables_decl1() throws RecognitionException {
		Variables_decl1Context _localctx = new Variables_decl1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_variables_decl1);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__6);
				setState(278);
				match(ID);
				setState(279);
				variables_decl1();
				}
				break;
			case T__8:
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
	}

	public final Assignment0Context assignment0() throws RecognitionException {
		Assignment0Context _localctx = new Assignment0Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			value0();
			setState(284);
			match(T__9);
			setState(285);
			expression0();
			setState(286);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Function_call0Context function_call0() throws RecognitionException {
		Function_call0Context _localctx = new Function_call0Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			function_call_aux0();
			setState(289);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Function_call_aux0Context function_call_aux0() throws RecognitionException {
		Function_call_aux0Context _localctx = new Function_call_aux0Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_call_aux0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ID);
			setState(292);
			match(T__3);
			setState(293);
			function_call_aux1();
			setState(294);
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
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Function_call_aux2Context function_call_aux2() {
			return getRuleContext(Function_call_aux2Context.class,0);
		}
		public Function_call_aux1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_aux1; }
	}

	public final Function_call_aux1Context function_call_aux1() throws RecognitionException {
		Function_call_aux1Context _localctx = new Function_call_aux1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call_aux1);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				expression0();
				setState(297);
				function_call_aux2();
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

	public static class Function_call_aux2Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Function_call_aux2Context function_call_aux2() {
			return getRuleContext(Function_call_aux2Context.class,0);
		}
		public Function_call_aux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_aux2; }
	}

	public final Function_call_aux2Context function_call_aux2() throws RecognitionException {
		Function_call_aux2Context _localctx = new Function_call_aux2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call_aux2);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__6);
				setState(303);
				expression0();
				setState(304);
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
	}

	public final If0Context if0() throws RecognitionException {
		If0Context _localctx = new If0Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_if0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__10);
			setState(310);
			match(T__3);
			setState(311);
			bool_exp0();
			setState(312);
			match(T__4);
			setState(313);
			block0();
			setState(314);
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
	}

	public final Else0Context else0() throws RecognitionException {
		Else0Context _localctx = new Else0Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_else0);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(T__11);
				setState(317);
				match(T__3);
				setState(318);
				bool_exp0();
				setState(319);
				match(T__4);
				setState(320);
				block0();
				setState(321);
				else0();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(T__12);
				setState(324);
				block0();
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__10:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
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
	}

	public final While0Context while0() throws RecognitionException {
		While0Context _localctx = new While0Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_while0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__13);
			setState(329);
			match(T__3);
			setState(330);
			bool_exp0();
			setState(331);
			match(T__4);
			setState(332);
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
		public Hist0Context hist0() {
			return getRuleContext(Hist0Context.class,0);
		}
		public Showplot0Context showplot0() {
			return getRuleContext(Showplot0Context.class,0);
		}
		public Io_statement0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_statement0; }
	}

	public final Io_statement0Context io_statement0() throws RecognitionException {
		Io_statement0Context _localctx = new Io_statement0Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_io_statement0);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				input0();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				output0();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				plot0();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				hist0();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				showplot0();
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
		public Value0Context value0() {
			return getRuleContext(Value0Context.class,0);
		}
		public Input0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input0; }
	}

	public final Input0Context input0() throws RecognitionException {
		Input0Context _localctx = new Input0Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_input0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__14);
			setState(342);
			match(T__3);
			setState(343);
			value0();
			setState(344);
			match(T__4);
			setState(345);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Output0Context output0() throws RecognitionException {
		Output0Context _localctx = new Output0Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_output0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__15);
			setState(348);
			match(T__3);
			setState(349);
			expression0();
			setState(350);
			match(T__4);
			setState(351);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Plot0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plot0; }
	}

	public final Plot0Context plot0() throws RecognitionException {
		Plot0Context _localctx = new Plot0Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_plot0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__16);
			setState(354);
			match(T__3);
			setState(355);
			expression0();
			setState(356);
			match(T__6);
			setState(357);
			expression0();
			setState(358);
			match(T__6);
			setState(359);
			expression0();
			setState(360);
			match(T__4);
			setState(361);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hist0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Hist0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hist0; }
	}

	public final Hist0Context hist0() throws RecognitionException {
		Hist0Context _localctx = new Hist0Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_hist0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__17);
			setState(364);
			match(T__3);
			setState(365);
			expression0();
			setState(366);
			match(T__4);
			setState(367);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Showplot0Context extends ParserRuleContext {
		public Showplot0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showplot0; }
	}

	public final Showplot0Context showplot0() throws RecognitionException {
		Showplot0Context _localctx = new Showplot0Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_showplot0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__18);
			setState(370);
			match(T__3);
			setState(371);
			match(T__4);
			setState(372);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Return0Context return0() throws RecognitionException {
		Return0Context _localctx = new Return0Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_return0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__19);
			setState(375);
			expression0();
			setState(376);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Expression0Context expression0() throws RecognitionException {
		Expression0Context _localctx = new Expression0Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression0);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(STRING_LITERAL);
				}
				break;
			case T__3:
			case T__4:
			case T__6:
			case T__8:
			case T__20:
			case T__30:
			case T__36:
			case T__37:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case INT_NUMBER:
			case FLOAT_NUMBER:
			case BOOL_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
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
		public Bool_not0Context bool_not0() {
			return getRuleContext(Bool_not0Context.class,0);
		}
		public Bool_exp0Context bool_exp0() {
			return getRuleContext(Bool_exp0Context.class,0);
		}
		public Bool_exp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_exp0; }
	}

	public final Bool_exp0Context bool_exp0() throws RecognitionException {
		Bool_exp0Context _localctx = new Bool_exp0Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool_exp0);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__6:
			case T__8:
			case T__21:
			case T__22:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__3:
			case T__30:
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case INT_NUMBER:
			case FLOAT_NUMBER:
			case BOOL_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				bool_term0();
				setState(384);
				bool_exp1();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				bool_not0();
				setState(387);
				bool_exp0();
				setState(388);
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
	}

	public final Bool_exp1Context bool_exp1() throws RecognitionException {
		Bool_exp1Context _localctx = new Bool_exp1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_bool_exp1);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				bool_op0();
				setState(393);
				bool_exp0();
				setState(394);
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
	}

	public final Bool_term0Context bool_term0() throws RecognitionException {
		Bool_term0Context _localctx = new Bool_term0Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_bool_term0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			arithmetic_exp0();
			setState(400);
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
	}

	public final Bool_term1Context bool_term1() throws RecognitionException {
		Bool_term1Context _localctx = new Bool_term1Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_bool_term1);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				rel_op0();
				setState(403);
				arithmetic_exp0();
				}
				break;
			case T__4:
			case T__6:
			case T__8:
			case T__21:
			case T__22:
			case T__37:
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

	public static class Bool_not0Context extends ParserRuleContext {
		public Bool_not0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_not0; }
	}

	public final Bool_not0Context bool_not0() throws RecognitionException {
		Bool_not0Context _localctx = new Bool_not0Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_bool_not0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Bool_op0Context bool_op0() throws RecognitionException {
		Bool_op0Context _localctx = new Bool_op0Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_bool_op0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
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
	}

	public final Rel_op0Context rel_op0() throws RecognitionException {
		Rel_op0Context _localctx = new Rel_op0Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_rel_op0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
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
	}

	public final Arithmetic_exp0Context arithmetic_exp0() throws RecognitionException {
		Arithmetic_exp0Context _localctx = new Arithmetic_exp0Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_arithmetic_exp0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			arithmetic_factor0();
			setState(415);
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
	}

	public final Arithmetic_exp1Context arithmetic_exp1() throws RecognitionException {
		Arithmetic_exp1Context _localctx = new Arithmetic_exp1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_arithmetic_exp1);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				addition_subtraction0();
				setState(418);
				arithmetic_factor0();
				setState(419);
				arithmetic_exp1();
				}
				break;
			case T__4:
			case T__6:
			case T__8:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__37:
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
	}

	public final Addition_subtraction0Context addition_subtraction0() throws RecognitionException {
		Addition_subtraction0Context _localctx = new Addition_subtraction0Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_addition_subtraction0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
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
	}

	public final Arithmetic_factor0Context arithmetic_factor0() throws RecognitionException {
		Arithmetic_factor0Context _localctx = new Arithmetic_factor0Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_arithmetic_factor0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			arithmetic_term0();
			setState(427);
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
	}

	public final Arithmetic_factor1Context arithmetic_factor1() throws RecognitionException {
		Arithmetic_factor1Context _localctx = new Arithmetic_factor1Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_arithmetic_factor1);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				multiplication_division0();
				setState(430);
				arithmetic_term0();
				setState(431);
				arithmetic_factor1();
				}
				break;
			case T__4:
			case T__6:
			case T__8:
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
			case T__37:
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
	}

	public final Multiplication_division0Context multiplication_division0() throws RecognitionException {
		Multiplication_division0Context _localctx = new Multiplication_division0Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiplication_division0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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
	}

	public final Arithmetic_term0Context arithmetic_term0() throws RecognitionException {
		Arithmetic_term0Context _localctx = new Arithmetic_term0Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_arithmetic_term0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			numeric_term0();
			setState(439);
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
	}

	public final Arithmetic_term1Context arithmetic_term1() throws RecognitionException {
		Arithmetic_term1Context _localctx = new Arithmetic_term1Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_arithmetic_term1);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				exponent0();
				setState(442);
				numeric_term0();
				}
				break;
			case T__4:
			case T__6:
			case T__8:
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
			case T__33:
			case T__37:
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
	}

	public final Exponent0Context exponent0() throws RecognitionException {
		Exponent0Context _localctx = new Exponent0Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_exponent0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INT_NUMBER() { return getToken(PpParser.INT_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(PpParser.FLOAT_NUMBER, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(PpParser.BOOL_LITERAL, 0); }
		public Sign0Context sign0() {
			return getRuleContext(Sign0Context.class,0);
		}
		public Numeric_term1Context numeric_term1() {
			return getRuleContext(Numeric_term1Context.class,0);
		}
		public Bool_exp0Context bool_exp0() {
			return getRuleContext(Bool_exp0Context.class,0);
		}
		public Numeric_term0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_term0; }
	}

	public final Numeric_term0Context numeric_term0() throws RecognitionException {
		Numeric_term0Context _localctx = new Numeric_term0Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_numeric_term0);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(INT_NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(FLOAT_NUMBER);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(BOOL_LITERAL);
				}
				break;
			case T__30:
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				sign0();
				setState(453);
				numeric_term1();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				match(T__3);
				setState(456);
				bool_exp0();
				setState(457);
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
		public Stat_functions0Context stat_functions0() {
			return getRuleContext(Stat_functions0Context.class,0);
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
	}

	public final Numeric_term1Context numeric_term1() throws RecognitionException {
		Numeric_term1Context _localctx = new Numeric_term1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_numeric_term1);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				value0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				stat_functions0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				function_call_aux0();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
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
	}

	public final Sign0Context sign0() throws RecognitionException {
		Sign0Context _localctx = new Sign0Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_sign0);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(T__30);
				}
				break;
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
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
		public Type0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type0; }
	}

	public final Type0Context type0() throws RecognitionException {
		Type0Context _localctx = new Type0Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_type0);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				basic_type0();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(T__35);
				setState(473);
				match(T__26);
				setState(474);
				basic_type0();
				setState(475);
				match(T__25);
				setState(476);
				match(T__36);
				setState(477);
				match(INT_NUMBER);
				setState(478);
				match(T__37);
				setState(479);
				match(T__36);
				setState(480);
				match(INT_NUMBER);
				setState(481);
				match(T__37);
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
	}

	public final Basic_type0Context basic_type0() throws RecognitionException {
		Basic_type0Context _localctx = new Basic_type0Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_basic_type0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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
	}

	public final Value0Context value0() throws RecognitionException {
		Value0Context _localctx = new Value0Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_value0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(ID);
			setState(488);
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
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Value1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value1; }
	}

	public final Value1Context value1() throws RecognitionException {
		Value1Context _localctx = new Value1Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_value1);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(T__36);
				setState(491);
				expression0();
				setState(492);
				match(T__37);
				setState(493);
				match(T__36);
				setState(494);
				expression0();
				setState(495);
				match(T__37);
				}
				break;
			case T__4:
			case T__6:
			case T__8:
			case T__9:
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
			case T__33:
			case T__34:
			case T__37:
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
	}

	public final Matrix_literal0Context matrix_literal0() throws RecognitionException {
		Matrix_literal0Context _localctx = new Matrix_literal0Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_matrix_literal0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__36);
			setState(501);
			matrix_literal1();
			setState(502);
			match(T__37);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Matrix_literal1Context matrix_literal1() throws RecognitionException {
		Matrix_literal1Context _localctx = new Matrix_literal1Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_matrix_literal1);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(T__36);
				setState(505);
				matrix_literal2();
				setState(506);
				match(T__37);
				setState(507);
				matrix_literal3();
				}
				break;
			case T__37:
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
	}

	public final Matrix_literal2Context matrix_literal2() throws RecognitionException {
		Matrix_literal2Context _localctx = new Matrix_literal2Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_matrix_literal2);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				expression0();
				setState(513);
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
	}

	public final Matrix_literal3Context matrix_literal3() throws RecognitionException {
		Matrix_literal3Context _localctx = new Matrix_literal3Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_matrix_literal3);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(T__6);
				setState(519);
				match(T__36);
				setState(520);
				matrix_literal2();
				setState(521);
				match(T__37);
				setState(522);
				matrix_literal3();
				}
				break;
			case T__37:
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
	}

	public final Matrix_literal4Context matrix_literal4() throws RecognitionException {
		Matrix_literal4Context _localctx = new Matrix_literal4Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_matrix_literal4);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(T__6);
				setState(528);
				expression0();
				setState(529);
				matrix_literal4();
				}
				break;
			case T__37:
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

	public static class Stat_functions0Context extends ParserRuleContext {
		public Mean0Context mean0() {
			return getRuleContext(Mean0Context.class,0);
		}
		public Median0Context median0() {
			return getRuleContext(Median0Context.class,0);
		}
		public Mode0Context mode0() {
			return getRuleContext(Mode0Context.class,0);
		}
		public Stdev0Context stdev0() {
			return getRuleContext(Stdev0Context.class,0);
		}
		public Variance0Context variance0() {
			return getRuleContext(Variance0Context.class,0);
		}
		public Transpose0Context transpose0() {
			return getRuleContext(Transpose0Context.class,0);
		}
		public Beta0Context beta0() {
			return getRuleContext(Beta0Context.class,0);
		}
		public Binom0Context binom0() {
			return getRuleContext(Binom0Context.class,0);
		}
		public Exp0Context exp0() {
			return getRuleContext(Exp0Context.class,0);
		}
		public Gamma0Context gamma0() {
			return getRuleContext(Gamma0Context.class,0);
		}
		public Geom0Context geom0() {
			return getRuleContext(Geom0Context.class,0);
		}
		public Norm0Context norm0() {
			return getRuleContext(Norm0Context.class,0);
		}
		public Pois0Context pois0() {
			return getRuleContext(Pois0Context.class,0);
		}
		public Unif0Context unif0() {
			return getRuleContext(Unif0Context.class,0);
		}
		public Stat_functions0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_functions0; }
	}

	public final Stat_functions0Context stat_functions0() throws RecognitionException {
		Stat_functions0Context _localctx = new Stat_functions0Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_stat_functions0);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				mean0();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				median0();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				mode0();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
				stdev0();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 5);
				{
				setState(538);
				variance0();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 6);
				{
				setState(539);
				transpose0();
				}
				break;
			case T__48:
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 7);
				{
				setState(540);
				beta0();
				}
				break;
			case T__51:
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 8);
				{
				setState(541);
				binom0();
				}
				break;
			case T__54:
			case T__55:
			case T__56:
				enterOuterAlt(_localctx, 9);
				{
				setState(542);
				exp0();
				}
				break;
			case T__57:
			case T__58:
			case T__59:
				enterOuterAlt(_localctx, 10);
				{
				setState(543);
				gamma0();
				}
				break;
			case T__60:
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 11);
				{
				setState(544);
				geom0();
				}
				break;
			case T__63:
			case T__64:
			case T__65:
				enterOuterAlt(_localctx, 12);
				{
				setState(545);
				norm0();
				}
				break;
			case T__66:
			case T__67:
			case T__68:
				enterOuterAlt(_localctx, 13);
				{
				setState(546);
				pois0();
				}
				break;
			case T__69:
			case T__70:
			case T__71:
				enterOuterAlt(_localctx, 14);
				{
				setState(547);
				unif0();
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

	public static class Mean0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Mean0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mean0; }
	}

	public final Mean0Context mean0() throws RecognitionException {
		Mean0Context _localctx = new Mean0Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_mean0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(T__42);
			setState(551);
			match(T__3);
			setState(552);
			expression0();
			setState(553);
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

	public static class Median0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Median0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_median0; }
	}

	public final Median0Context median0() throws RecognitionException {
		Median0Context _localctx = new Median0Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_median0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(T__43);
			setState(556);
			match(T__3);
			setState(557);
			expression0();
			setState(558);
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

	public static class Mode0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Mode0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mode0; }
	}

	public final Mode0Context mode0() throws RecognitionException {
		Mode0Context _localctx = new Mode0Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_mode0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(T__44);
			setState(561);
			match(T__3);
			setState(562);
			expression0();
			setState(563);
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

	public static class Stdev0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Stdev0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdev0; }
	}

	public final Stdev0Context stdev0() throws RecognitionException {
		Stdev0Context _localctx = new Stdev0Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_stdev0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(T__45);
			setState(566);
			match(T__3);
			setState(567);
			expression0();
			setState(568);
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

	public static class Variance0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Variance0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance0; }
	}

	public final Variance0Context variance0() throws RecognitionException {
		Variance0Context _localctx = new Variance0Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_variance0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(T__46);
			setState(571);
			match(T__3);
			setState(572);
			expression0();
			setState(573);
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

	public static class Transpose0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Transpose0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transpose0; }
	}

	public final Transpose0Context transpose0() throws RecognitionException {
		Transpose0Context _localctx = new Transpose0Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_transpose0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T__47);
			setState(576);
			match(T__3);
			setState(577);
			expression0();
			setState(578);
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

	public static class Beta0Context extends ParserRuleContext {
		public Dbeta0Context dbeta0() {
			return getRuleContext(Dbeta0Context.class,0);
		}
		public Cbeta0Context cbeta0() {
			return getRuleContext(Cbeta0Context.class,0);
		}
		public Rbeta0Context rbeta0() {
			return getRuleContext(Rbeta0Context.class,0);
		}
		public Beta0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beta0; }
	}

	public final Beta0Context beta0() throws RecognitionException {
		Beta0Context _localctx = new Beta0Context(_ctx, getState());
		enterRule(_localctx, 132, RULE_beta0);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				dbeta0();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				cbeta0();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				rbeta0();
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

	public static class Dbeta0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Dbeta0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbeta0; }
	}

	public final Dbeta0Context dbeta0() throws RecognitionException {
		Dbeta0Context _localctx = new Dbeta0Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_dbeta0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__48);
			setState(586);
			match(T__3);
			setState(587);
			expression0();
			setState(588);
			match(T__6);
			setState(589);
			expression0();
			setState(590);
			match(T__6);
			setState(591);
			expression0();
			setState(592);
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

	public static class Cbeta0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Cbeta0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cbeta0; }
	}

	public final Cbeta0Context cbeta0() throws RecognitionException {
		Cbeta0Context _localctx = new Cbeta0Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_cbeta0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(T__49);
			setState(595);
			match(T__3);
			setState(596);
			expression0();
			setState(597);
			match(T__6);
			setState(598);
			expression0();
			setState(599);
			match(T__6);
			setState(600);
			expression0();
			setState(601);
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

	public static class Rbeta0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Rbeta0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbeta0; }
	}

	public final Rbeta0Context rbeta0() throws RecognitionException {
		Rbeta0Context _localctx = new Rbeta0Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_rbeta0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(T__50);
			setState(604);
			match(T__3);
			setState(605);
			expression0();
			setState(606);
			match(T__6);
			setState(607);
			expression0();
			setState(608);
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

	public static class Binom0Context extends ParserRuleContext {
		public Dbinom0Context dbinom0() {
			return getRuleContext(Dbinom0Context.class,0);
		}
		public Cbinom0Context cbinom0() {
			return getRuleContext(Cbinom0Context.class,0);
		}
		public Rbinom0Context rbinom0() {
			return getRuleContext(Rbinom0Context.class,0);
		}
		public Binom0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binom0; }
	}

	public final Binom0Context binom0() throws RecognitionException {
		Binom0Context _localctx = new Binom0Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_binom0);
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				dbinom0();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				cbinom0();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				rbinom0();
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

	public static class Dbinom0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Dbinom0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbinom0; }
	}

	public final Dbinom0Context dbinom0() throws RecognitionException {
		Dbinom0Context _localctx = new Dbinom0Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_dbinom0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(T__51);
			setState(616);
			match(T__3);
			setState(617);
			expression0();
			setState(618);
			match(T__6);
			setState(619);
			expression0();
			setState(620);
			match(T__6);
			setState(621);
			expression0();
			setState(622);
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

	public static class Cbinom0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Cbinom0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cbinom0; }
	}

	public final Cbinom0Context cbinom0() throws RecognitionException {
		Cbinom0Context _localctx = new Cbinom0Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_cbinom0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__52);
			setState(625);
			match(T__3);
			setState(626);
			expression0();
			setState(627);
			match(T__6);
			setState(628);
			expression0();
			setState(629);
			match(T__6);
			setState(630);
			expression0();
			setState(631);
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

	public static class Rbinom0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Rbinom0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbinom0; }
	}

	public final Rbinom0Context rbinom0() throws RecognitionException {
		Rbinom0Context _localctx = new Rbinom0Context(_ctx, getState());
		enterRule(_localctx, 146, RULE_rbinom0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(T__53);
			setState(634);
			match(T__3);
			setState(635);
			expression0();
			setState(636);
			match(T__6);
			setState(637);
			expression0();
			setState(638);
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

	public static class Exp0Context extends ParserRuleContext {
		public Dexp0Context dexp0() {
			return getRuleContext(Dexp0Context.class,0);
		}
		public Cexp0Context cexp0() {
			return getRuleContext(Cexp0Context.class,0);
		}
		public Rexp0Context rexp0() {
			return getRuleContext(Rexp0Context.class,0);
		}
		public Exp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp0; }
	}

	public final Exp0Context exp0() throws RecognitionException {
		Exp0Context _localctx = new Exp0Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_exp0);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				dexp0();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				cexp0();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				rexp0();
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

	public static class Dexp0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Dexp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dexp0; }
	}

	public final Dexp0Context dexp0() throws RecognitionException {
		Dexp0Context _localctx = new Dexp0Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_dexp0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(T__54);
			setState(646);
			match(T__3);
			setState(647);
			expression0();
			setState(648);
			match(T__6);
			setState(649);
			expression0();
			setState(650);
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

	public static class Cexp0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Cexp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexp0; }
	}

	public final Cexp0Context cexp0() throws RecognitionException {
		Cexp0Context _localctx = new Cexp0Context(_ctx, getState());
		enterRule(_localctx, 152, RULE_cexp0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(T__55);
			setState(653);
			match(T__3);
			setState(654);
			expression0();
			setState(655);
			match(T__6);
			setState(656);
			expression0();
			setState(657);
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

	public static class Rexp0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Rexp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexp0; }
	}

	public final Rexp0Context rexp0() throws RecognitionException {
		Rexp0Context _localctx = new Rexp0Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_rexp0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(T__56);
			setState(660);
			match(T__3);
			setState(661);
			expression0();
			setState(662);
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

	public static class Gamma0Context extends ParserRuleContext {
		public Dgamma0Context dgamma0() {
			return getRuleContext(Dgamma0Context.class,0);
		}
		public Cgamma0Context cgamma0() {
			return getRuleContext(Cgamma0Context.class,0);
		}
		public Rgamma0Context rgamma0() {
			return getRuleContext(Rgamma0Context.class,0);
		}
		public Gamma0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gamma0; }
	}

	public final Gamma0Context gamma0() throws RecognitionException {
		Gamma0Context _localctx = new Gamma0Context(_ctx, getState());
		enterRule(_localctx, 156, RULE_gamma0);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				dgamma0();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				cgamma0();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				rgamma0();
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

	public static class Dgamma0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Dgamma0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dgamma0; }
	}

	public final Dgamma0Context dgamma0() throws RecognitionException {
		Dgamma0Context _localctx = new Dgamma0Context(_ctx, getState());
		enterRule(_localctx, 158, RULE_dgamma0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(T__57);
			setState(670);
			match(T__3);
			setState(671);
			expression0();
			setState(672);
			match(T__6);
			setState(673);
			expression0();
			setState(674);
			match(T__6);
			setState(675);
			expression0();
			setState(676);
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

	public static class Cgamma0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Cgamma0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cgamma0; }
	}

	public final Cgamma0Context cgamma0() throws RecognitionException {
		Cgamma0Context _localctx = new Cgamma0Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_cgamma0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(T__58);
			setState(679);
			match(T__3);
			setState(680);
			expression0();
			setState(681);
			match(T__6);
			setState(682);
			expression0();
			setState(683);
			match(T__6);
			setState(684);
			expression0();
			setState(685);
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

	public static class Rgamma0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Rgamma0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgamma0; }
	}

	public final Rgamma0Context rgamma0() throws RecognitionException {
		Rgamma0Context _localctx = new Rgamma0Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_rgamma0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(T__59);
			setState(688);
			match(T__3);
			setState(689);
			expression0();
			setState(690);
			match(T__6);
			setState(691);
			expression0();
			setState(692);
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

	public static class Geom0Context extends ParserRuleContext {
		public Dgeom0Context dgeom0() {
			return getRuleContext(Dgeom0Context.class,0);
		}
		public Cgeom0Context cgeom0() {
			return getRuleContext(Cgeom0Context.class,0);
		}
		public Rgeom0Context rgeom0() {
			return getRuleContext(Rgeom0Context.class,0);
		}
		public Geom0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geom0; }
	}

	public final Geom0Context geom0() throws RecognitionException {
		Geom0Context _localctx = new Geom0Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_geom0);
		try {
			setState(697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				dgeom0();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				cgeom0();
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				rgeom0();
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

	public static class Dgeom0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Dgeom0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dgeom0; }
	}

	public final Dgeom0Context dgeom0() throws RecognitionException {
		Dgeom0Context _localctx = new Dgeom0Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_dgeom0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(T__60);
			setState(700);
			match(T__3);
			setState(701);
			expression0();
			setState(702);
			match(T__6);
			setState(703);
			expression0();
			setState(704);
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

	public static class Cgeom0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Cgeom0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cgeom0; }
	}

	public final Cgeom0Context cgeom0() throws RecognitionException {
		Cgeom0Context _localctx = new Cgeom0Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_cgeom0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(T__61);
			setState(707);
			match(T__3);
			setState(708);
			expression0();
			setState(709);
			match(T__6);
			setState(710);
			expression0();
			setState(711);
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

	public static class Rgeom0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Rgeom0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgeom0; }
	}

	public final Rgeom0Context rgeom0() throws RecognitionException {
		Rgeom0Context _localctx = new Rgeom0Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_rgeom0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(T__62);
			setState(714);
			match(T__3);
			setState(715);
			expression0();
			setState(716);
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

	public static class Norm0Context extends ParserRuleContext {
		public Dnorm0Context dnorm0() {
			return getRuleContext(Dnorm0Context.class,0);
		}
		public Cnorm0Context cnorm0() {
			return getRuleContext(Cnorm0Context.class,0);
		}
		public Rnorm0Context rnorm0() {
			return getRuleContext(Rnorm0Context.class,0);
		}
		public Norm0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_norm0; }
	}

	public final Norm0Context norm0() throws RecognitionException {
		Norm0Context _localctx = new Norm0Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_norm0);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				dnorm0();
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				cnorm0();
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				rnorm0();
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

	public static class Dnorm0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Dnorm0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dnorm0; }
	}

	public final Dnorm0Context dnorm0() throws RecognitionException {
		Dnorm0Context _localctx = new Dnorm0Context(_ctx, getState());
		enterRule(_localctx, 174, RULE_dnorm0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T__63);
			setState(724);
			match(T__3);
			setState(725);
			expression0();
			setState(726);
			match(T__6);
			setState(727);
			expression0();
			setState(728);
			match(T__6);
			setState(729);
			expression0();
			setState(730);
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

	public static class Cnorm0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Cnorm0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnorm0; }
	}

	public final Cnorm0Context cnorm0() throws RecognitionException {
		Cnorm0Context _localctx = new Cnorm0Context(_ctx, getState());
		enterRule(_localctx, 176, RULE_cnorm0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__64);
			setState(733);
			match(T__3);
			setState(734);
			expression0();
			setState(735);
			match(T__6);
			setState(736);
			expression0();
			setState(737);
			match(T__6);
			setState(738);
			expression0();
			setState(739);
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

	public static class Rnorm0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Rnorm0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rnorm0; }
	}

	public final Rnorm0Context rnorm0() throws RecognitionException {
		Rnorm0Context _localctx = new Rnorm0Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_rnorm0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(T__65);
			setState(742);
			match(T__3);
			setState(743);
			expression0();
			setState(744);
			match(T__6);
			setState(745);
			expression0();
			setState(746);
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

	public static class Pois0Context extends ParserRuleContext {
		public Dpois0Context dpois0() {
			return getRuleContext(Dpois0Context.class,0);
		}
		public Cpois0Context cpois0() {
			return getRuleContext(Cpois0Context.class,0);
		}
		public Rpois0Context rpois0() {
			return getRuleContext(Rpois0Context.class,0);
		}
		public Pois0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pois0; }
	}

	public final Pois0Context pois0() throws RecognitionException {
		Pois0Context _localctx = new Pois0Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_pois0);
		try {
			setState(751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__66:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				dpois0();
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				cpois0();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				rpois0();
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

	public static class Dpois0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Dpois0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpois0; }
	}

	public final Dpois0Context dpois0() throws RecognitionException {
		Dpois0Context _localctx = new Dpois0Context(_ctx, getState());
		enterRule(_localctx, 182, RULE_dpois0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(T__66);
			setState(754);
			match(T__3);
			setState(755);
			expression0();
			setState(756);
			match(T__6);
			setState(757);
			expression0();
			setState(758);
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

	public static class Cpois0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Cpois0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpois0; }
	}

	public final Cpois0Context cpois0() throws RecognitionException {
		Cpois0Context _localctx = new Cpois0Context(_ctx, getState());
		enterRule(_localctx, 184, RULE_cpois0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(T__67);
			setState(761);
			match(T__3);
			setState(762);
			expression0();
			setState(763);
			match(T__6);
			setState(764);
			expression0();
			setState(765);
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

	public static class Rpois0Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Rpois0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpois0; }
	}

	public final Rpois0Context rpois0() throws RecognitionException {
		Rpois0Context _localctx = new Rpois0Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_rpois0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(T__68);
			setState(768);
			match(T__3);
			setState(769);
			expression0();
			setState(770);
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

	public static class Unif0Context extends ParserRuleContext {
		public Dunif0Context dunif0() {
			return getRuleContext(Dunif0Context.class,0);
		}
		public Cunif0Context cunif0() {
			return getRuleContext(Cunif0Context.class,0);
		}
		public Runif0Context runif0() {
			return getRuleContext(Runif0Context.class,0);
		}
		public Unif0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unif0; }
	}

	public final Unif0Context unif0() throws RecognitionException {
		Unif0Context _localctx = new Unif0Context(_ctx, getState());
		enterRule(_localctx, 188, RULE_unif0);
		try {
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__69:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				dunif0();
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				cunif0();
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				runif0();
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

	public static class Dunif0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Dunif0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dunif0; }
	}

	public final Dunif0Context dunif0() throws RecognitionException {
		Dunif0Context _localctx = new Dunif0Context(_ctx, getState());
		enterRule(_localctx, 190, RULE_dunif0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__69);
			setState(778);
			match(T__3);
			setState(779);
			expression0();
			setState(780);
			match(T__6);
			setState(781);
			expression0();
			setState(782);
			match(T__6);
			setState(783);
			expression0();
			setState(784);
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

	public static class Cunif0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Cunif0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cunif0; }
	}

	public final Cunif0Context cunif0() throws RecognitionException {
		Cunif0Context _localctx = new Cunif0Context(_ctx, getState());
		enterRule(_localctx, 192, RULE_cunif0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(T__70);
			setState(787);
			match(T__3);
			setState(788);
			expression0();
			setState(789);
			match(T__6);
			setState(790);
			expression0();
			setState(791);
			match(T__6);
			setState(792);
			expression0();
			setState(793);
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

	public static class Runif0Context extends ParserRuleContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Runif0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runif0; }
	}

	public final Runif0Context runif0() throws RecognitionException {
		Runif0Context _localctx = new Runif0Context(_ctx, getState());
		enterRule(_localctx, 194, RULE_runif0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(T__71);
			setState(796);
			match(T__3);
			setState(797);
			expression0();
			setState(798);
			match(T__6);
			setState(799);
			expression0();
			setState(800);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u0325\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00cd\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u00d6\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00de\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00e8\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\5\t\u00f4\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\5\13\u00ff\n\13\3\f\3\f\5\f\u0103\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\5\16\u010c\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0116\n"+
		"\17\3\20\3\20\3\20\3\20\5\20\u011c\n\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u012f\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0136\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0149\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0156\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \5 \u017f\n \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\5!\u0189\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0190\n\"\3#\3"+
		"#\3#\3$\3$\3$\3$\5$\u0199\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\5)\u01a9\n)\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\5,\u01b5\n,\3-\3-\3.\3."+
		"\3.\3/\3/\3/\3/\5/\u01c0\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u01ce\n\61\3\62\3\62\3\62\3\62\5\62\u01d4\n\62"+
		"\3\63\3\63\5\63\u01d8\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u01e6\n\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u01f5\n\67\38\38\38\38\39\39\39\39\39\3"+
		"9\59\u0201\n9\3:\3:\3:\3:\5:\u0207\n:\3;\3;\3;\3;\3;\3;\3;\5;\u0210\n"+
		";\3<\3<\3<\3<\3<\5<\u0217\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\5=\u0227\n=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3"+
		"A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\5D\u024a\nD\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3"+
		"H\5H\u0268\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"K\3K\3K\3K\3K\3K\3K\3L\3L\3L\5L\u0286\nL\3M\3M\3M\3M\3M\3M\3M\3N\3N\3"+
		"N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\5P\u029e\nP\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\5T\u02bc"+
		"\nT\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X"+
		"\5X\u02d4\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3["+
		"\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\5\\\u02f2\n\\\3]\3]\3]\3]\3]\3]\3]\3^\3"+
		"^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\5`\u030a\n`\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\2\2d\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\2\7\3\2\30\31\3\2\32\37\3\2 !\3\2\"$\3\2),\2\u030c"+
		"\2\u00c6\3\2\2\2\4\u00cc\3\2\2\2\6\u00d5\3\2\2\2\b\u00dd\3\2\2\2\n\u00df"+
		"\3\2\2\2\f\u00e7\3\2\2\2\16\u00e9\3\2\2\2\20\u00f3\3\2\2\2\22\u00f5\3"+
		"\2\2\2\24\u00fe\3\2\2\2\26\u0102\3\2\2\2\30\u0104\3\2\2\2\32\u010b\3\2"+
		"\2\2\34\u0115\3\2\2\2\36\u011b\3\2\2\2 \u011d\3\2\2\2\"\u0122\3\2\2\2"+
		"$\u0125\3\2\2\2&\u012e\3\2\2\2(\u0135\3\2\2\2*\u0137\3\2\2\2,\u0148\3"+
		"\2\2\2.\u014a\3\2\2\2\60\u0155\3\2\2\2\62\u0157\3\2\2\2\64\u015d\3\2\2"+
		"\2\66\u0163\3\2\2\28\u016d\3\2\2\2:\u0173\3\2\2\2<\u0178\3\2\2\2>\u017e"+
		"\3\2\2\2@\u0188\3\2\2\2B\u018f\3\2\2\2D\u0191\3\2\2\2F\u0198\3\2\2\2H"+
		"\u019a\3\2\2\2J\u019c\3\2\2\2L\u019e\3\2\2\2N\u01a0\3\2\2\2P\u01a8\3\2"+
		"\2\2R\u01aa\3\2\2\2T\u01ac\3\2\2\2V\u01b4\3\2\2\2X\u01b6\3\2\2\2Z\u01b8"+
		"\3\2\2\2\\\u01bf\3\2\2\2^\u01c1\3\2\2\2`\u01cd\3\2\2\2b\u01d3\3\2\2\2"+
		"d\u01d7\3\2\2\2f\u01e5\3\2\2\2h\u01e7\3\2\2\2j\u01e9\3\2\2\2l\u01f4\3"+
		"\2\2\2n\u01f6\3\2\2\2p\u0200\3\2\2\2r\u0206\3\2\2\2t\u020f\3\2\2\2v\u0216"+
		"\3\2\2\2x\u0226\3\2\2\2z\u0228\3\2\2\2|\u022d\3\2\2\2~\u0232\3\2\2\2\u0080"+
		"\u0237\3\2\2\2\u0082\u023c\3\2\2\2\u0084\u0241\3\2\2\2\u0086\u0249\3\2"+
		"\2\2\u0088\u024b\3\2\2\2\u008a\u0254\3\2\2\2\u008c\u025d\3\2\2\2\u008e"+
		"\u0267\3\2\2\2\u0090\u0269\3\2\2\2\u0092\u0272\3\2\2\2\u0094\u027b\3\2"+
		"\2\2\u0096\u0285\3\2\2\2\u0098\u0287\3\2\2\2\u009a\u028e\3\2\2\2\u009c"+
		"\u0295\3\2\2\2\u009e\u029d\3\2\2\2\u00a0\u029f\3\2\2\2\u00a2\u02a8\3\2"+
		"\2\2\u00a4\u02b1\3\2\2\2\u00a6\u02bb\3\2\2\2\u00a8\u02bd\3\2\2\2\u00aa"+
		"\u02c4\3\2\2\2\u00ac\u02cb\3\2\2\2\u00ae\u02d3\3\2\2\2\u00b0\u02d5\3\2"+
		"\2\2\u00b2\u02de\3\2\2\2\u00b4\u02e7\3\2\2\2\u00b6\u02f1\3\2\2\2\u00b8"+
		"\u02f3\3\2\2\2\u00ba\u02fa\3\2\2\2\u00bc\u0301\3\2\2\2\u00be\u0309\3\2"+
		"\2\2\u00c0\u030b\3\2\2\2\u00c2\u0314\3\2\2\2\u00c4\u031d\3\2\2\2\u00c6"+
		"\u00c7\5\4\3\2\u00c7\3\3\2\2\2\u00c8\u00c9\5\34\17\2\u00c9\u00ca\5\6\4"+
		"\2\u00ca\u00cd\3\2\2\2\u00cb\u00cd\5\6\4\2\u00cc\u00c8\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\5\3\2\2\2\u00ce\u00cf\5\b\5\2\u00cf\u00d0\5\6\4\2\u00d0"+
		"\u00d6\3\2\2\2\u00d1\u00d2\5\16\b\2\u00d2\u00d3\5\6\4\2\u00d3\u00d6\3"+
		"\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\7\3\2\2\2\u00d7\u00de\5 \21\2\u00d8\u00de\5\"\22"+
		"\2\u00d9\u00de\5\60\31\2\u00da\u00de\5*\26\2\u00db\u00de\5.\30\2\u00dc"+
		"\u00de\5<\37\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2"+
		"\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\t\3\2\2\2\u00df\u00e0\7\3\2\2\u00e0\u00e1\5\f\7\2\u00e1\u00e2\7\4\2\2"+
		"\u00e2\13\3\2\2\2\u00e3\u00e4\5\b\5\2\u00e4\u00e5\5\f\7\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\r\3\2\2\2\u00e9\u00ea\7\5\2\2\u00ea\u00eb\5\20\t\2\u00eb\u00ec\7O\2\2"+
		"\u00ec\u00ed\7\6\2\2\u00ed\u00ee\5\26\f\2\u00ee\u00ef\7\7\2\2\u00ef\u00f0"+
		"\5\22\n\2\u00f0\17\3\2\2\2\u00f1\u00f4\7\b\2\2\u00f2\u00f4\5f\64\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\21\3\2\2\2\u00f5\u00f6\7\3\2"+
		"\2\u00f6\u00f7\5\34\17\2\u00f7\u00f8\5\24\13\2\u00f8\u00f9\7\4\2\2\u00f9"+
		"\23\3\2\2\2\u00fa\u00fb\5\b\5\2\u00fb\u00fc\5\24\13\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\25\3\2\2\2\u0100\u0103\5\30\r\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2"+
		"\2\u0102\u0101\3\2\2\2\u0103\27\3\2\2\2\u0104\u0105\5f\64\2\u0105\u0106"+
		"\7O\2\2\u0106\u0107\5\32\16\2\u0107\31\3\2\2\2\u0108\u0109\7\t\2\2\u0109"+
		"\u010c\5\30\r\2\u010a\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u010a\3"+
		"\2\2\2\u010c\33\3\2\2\2\u010d\u010e\7\n\2\2\u010e\u010f\5f\64\2\u010f"+
		"\u0110\7O\2\2\u0110\u0111\5\36\20\2\u0111\u0112\7\13\2\2\u0112\u0113\5"+
		"\34\17\2\u0113\u0116\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u010d\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\35\3\2\2\2\u0117\u0118\7\t\2\2\u0118\u0119\7O\2\2"+
		"\u0119\u011c\5\36\20\2\u011a\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\37\3\2\2\2\u011d\u011e\5j\66\2\u011e\u011f\7\f\2\2\u011f"+
		"\u0120\5> \2\u0120\u0121\7\13\2\2\u0121!\3\2\2\2\u0122\u0123\5$\23\2\u0123"+
		"\u0124\7\13\2\2\u0124#\3\2\2\2\u0125\u0126\7O\2\2\u0126\u0127\7\6\2\2"+
		"\u0127\u0128\5&\24\2\u0128\u0129\7\7\2\2\u0129%\3\2\2\2\u012a\u012b\5"+
		"> \2\u012b\u012c\5(\25\2\u012c\u012f\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012a\3\2\2\2\u012e\u012d\3\2\2\2\u012f\'\3\2\2\2\u0130\u0131\7\t\2\2"+
		"\u0131\u0132\5> \2\u0132\u0133\5(\25\2\u0133\u0136\3\2\2\2\u0134\u0136"+
		"\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0134\3\2\2\2\u0136)\3\2\2\2\u0137"+
		"\u0138\7\r\2\2\u0138\u0139\7\6\2\2\u0139\u013a\5@!\2\u013a\u013b\7\7\2"+
		"\2\u013b\u013c\5\n\6\2\u013c\u013d\5,\27\2\u013d+\3\2\2\2\u013e\u013f"+
		"\7\16\2\2\u013f\u0140\7\6\2\2\u0140\u0141\5@!\2\u0141\u0142\7\7\2\2\u0142"+
		"\u0143\5\n\6\2\u0143\u0144\5,\27\2\u0144\u0149\3\2\2\2\u0145\u0146\7\17"+
		"\2\2\u0146\u0149\5\n\6\2\u0147\u0149\3\2\2\2\u0148\u013e\3\2\2\2\u0148"+
		"\u0145\3\2\2\2\u0148\u0147\3\2\2\2\u0149-\3\2\2\2\u014a\u014b\7\20\2\2"+
		"\u014b\u014c\7\6\2\2\u014c\u014d\5@!\2\u014d\u014e\7\7\2\2\u014e\u014f"+
		"\5\n\6\2\u014f/\3\2\2\2\u0150\u0156\5\62\32\2\u0151\u0156\5\64\33\2\u0152"+
		"\u0156\5\66\34\2\u0153\u0156\58\35\2\u0154\u0156\5:\36\2\u0155\u0150\3"+
		"\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\61\3\2\2\2\u0157\u0158\7\21\2\2\u0158\u0159\7\6\2"+
		"\2\u0159\u015a\5j\66\2\u015a\u015b\7\7\2\2\u015b\u015c\7\13\2\2\u015c"+
		"\63\3\2\2\2\u015d\u015e\7\22\2\2\u015e\u015f\7\6\2\2\u015f\u0160\5> \2"+
		"\u0160\u0161\7\7\2\2\u0161\u0162\7\13\2\2\u0162\65\3\2\2\2\u0163\u0164"+
		"\7\23\2\2\u0164\u0165\7\6\2\2\u0165\u0166\5> \2\u0166\u0167\7\t\2\2\u0167"+
		"\u0168\5> \2\u0168\u0169\7\t\2\2\u0169\u016a\5> \2\u016a\u016b\7\7\2\2"+
		"\u016b\u016c\7\13\2\2\u016c\67\3\2\2\2\u016d\u016e\7\24\2\2\u016e\u016f"+
		"\7\6\2\2\u016f\u0170\5> \2\u0170\u0171\7\7\2\2\u0171\u0172\7\13\2\2\u0172"+
		"9\3\2\2\2\u0173\u0174\7\25\2\2\u0174\u0175\7\6\2\2\u0175\u0176\7\7\2\2"+
		"\u0176\u0177\7\13\2\2\u0177;\3\2\2\2\u0178\u0179\7\26\2\2\u0179\u017a"+
		"\5> \2\u017a\u017b\7\13\2\2\u017b=\3\2\2\2\u017c\u017f\7M\2\2\u017d\u017f"+
		"\5@!\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f?\3\2\2\2\u0180\u0189"+
		"\3\2\2\2\u0181\u0182\5D#\2\u0182\u0183\5B\"\2\u0183\u0189\3\2\2\2\u0184"+
		"\u0185\5H%\2\u0185\u0186\5@!\2\u0186\u0187\5B\"\2\u0187\u0189\3\2\2\2"+
		"\u0188\u0180\3\2\2\2\u0188\u0181\3\2\2\2\u0188\u0184\3\2\2\2\u0189A\3"+
		"\2\2\2\u018a\u018b\5J&\2\u018b\u018c\5@!\2\u018c\u018d\5B\"\2\u018d\u0190"+
		"\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018a\3\2\2\2\u018f\u018e\3\2\2\2\u0190"+
		"C\3\2\2\2\u0191\u0192\5N(\2\u0192\u0193\5F$\2\u0193E\3\2\2\2\u0194\u0195"+
		"\5L\'\2\u0195\u0196\5N(\2\u0196\u0199\3\2\2\2\u0197\u0199\3\2\2\2\u0198"+
		"\u0194\3\2\2\2\u0198\u0197\3\2\2\2\u0199G\3\2\2\2\u019a\u019b\7\27\2\2"+
		"\u019bI\3\2\2\2\u019c\u019d\t\2\2\2\u019dK\3\2\2\2\u019e\u019f\t\3\2\2"+
		"\u019fM\3\2\2\2\u01a0\u01a1\5T+\2\u01a1\u01a2\5P)\2\u01a2O\3\2\2\2\u01a3"+
		"\u01a4\5R*\2\u01a4\u01a5\5T+\2\u01a5\u01a6\5P)\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9Q\3\2\2\2"+
		"\u01aa\u01ab\t\4\2\2\u01abS\3\2\2\2\u01ac\u01ad\5Z.\2\u01ad\u01ae\5V,"+
		"\2\u01aeU\3\2\2\2\u01af\u01b0\5X-\2\u01b0\u01b1\5Z.\2\u01b1\u01b2\5V,"+
		"\2\u01b2\u01b5\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01af\3\2\2\2\u01b4\u01b3"+
		"\3\2\2\2\u01b5W\3\2\2\2\u01b6\u01b7\t\5\2\2\u01b7Y\3\2\2\2\u01b8\u01b9"+
		"\5`\61\2\u01b9\u01ba\5\\/\2\u01ba[\3\2\2\2\u01bb\u01bc\5^\60\2\u01bc\u01bd"+
		"\5`\61\2\u01bd\u01c0\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bb\3\2\2\2\u01bf"+
		"\u01be\3\2\2\2\u01c0]\3\2\2\2\u01c1\u01c2\7%\2\2\u01c2_\3\2\2\2\u01c3"+
		"\u01ce\7K\2\2\u01c4\u01ce\7L\2\2\u01c5\u01ce\7N\2\2\u01c6\u01c7\5d\63"+
		"\2\u01c7\u01c8\5b\62\2\u01c8\u01ce\3\2\2\2\u01c9\u01ca\7\6\2\2\u01ca\u01cb"+
		"\5@!\2\u01cb\u01cc\7\7\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c3\3\2\2\2\u01cd"+
		"\u01c4\3\2\2\2\u01cd\u01c5\3\2\2\2\u01cd\u01c6\3\2\2\2\u01cd\u01c9\3\2"+
		"\2\2\u01cea\3\2\2\2\u01cf\u01d4\5j\66\2\u01d0\u01d4\5x=\2\u01d1\u01d4"+
		"\5$\23\2\u01d2\u01d4\5n8\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4c\3\2\2\2\u01d5\u01d8\7!\2\2\u01d6"+
		"\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8e\3\2\2\2"+
		"\u01d9\u01e6\5h\65\2\u01da\u01db\7&\2\2\u01db\u01dc\7\35\2\2\u01dc\u01dd"+
		"\5h\65\2\u01dd\u01de\7\34\2\2\u01de\u01df\7\'\2\2\u01df\u01e0\7K\2\2\u01e0"+
		"\u01e1\7(\2\2\u01e1\u01e2\7\'\2\2\u01e2\u01e3\7K\2\2\u01e3\u01e4\7(\2"+
		"\2\u01e4\u01e6\3\2\2\2\u01e5\u01d9\3\2\2\2\u01e5\u01da\3\2\2\2\u01e6g"+
		"\3\2\2\2\u01e7\u01e8\t\6\2\2\u01e8i\3\2\2\2\u01e9\u01ea\7O\2\2\u01ea\u01eb"+
		"\5l\67\2\u01ebk\3\2\2\2\u01ec\u01ed\7\'\2\2\u01ed\u01ee\5> \2\u01ee\u01ef"+
		"\7(\2\2\u01ef\u01f0\7\'\2\2\u01f0\u01f1\5> \2\u01f1\u01f2\7(\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f4\u01f3\3\2"+
		"\2\2\u01f5m\3\2\2\2\u01f6\u01f7\7\'\2\2\u01f7\u01f8\5p9\2\u01f8\u01f9"+
		"\7(\2\2\u01f9o\3\2\2\2\u01fa\u01fb\7\'\2\2\u01fb\u01fc\5r:\2\u01fc\u01fd"+
		"\7(\2\2\u01fd\u01fe\5t;\2\u01fe\u0201\3\2\2\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u01fa\3\2\2\2\u0200\u01ff\3\2\2\2\u0201q\3\2\2\2\u0202\u0203\5> \2\u0203"+
		"\u0204\5v<\2\u0204\u0207\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0202\3\2\2"+
		"\2\u0206\u0205\3\2\2\2\u0207s\3\2\2\2\u0208\u0209\7\t\2\2\u0209\u020a"+
		"\7\'\2\2\u020a\u020b\5r:\2\u020b\u020c\7(\2\2\u020c\u020d\5t;\2\u020d"+
		"\u0210\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u0208\3\2\2\2\u020f\u020e\3\2"+
		"\2\2\u0210u\3\2\2\2\u0211\u0212\7\t\2\2\u0212\u0213\5> \2\u0213\u0214"+
		"\5v<\2\u0214\u0217\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0211\3\2\2\2\u0216"+
		"\u0215\3\2\2\2\u0217w\3\2\2\2\u0218\u0227\5z>\2\u0219\u0227\5|?\2\u021a"+
		"\u0227\5~@\2\u021b\u0227\5\u0080A\2\u021c\u0227\5\u0082B\2\u021d\u0227"+
		"\5\u0084C\2\u021e\u0227\5\u0086D\2\u021f\u0227\5\u008eH\2\u0220\u0227"+
		"\5\u0096L\2\u0221\u0227\5\u009eP\2\u0222\u0227\5\u00a6T\2\u0223\u0227"+
		"\5\u00aeX\2\u0224\u0227\5\u00b6\\\2\u0225\u0227\5\u00be`\2\u0226\u0218"+
		"\3\2\2\2\u0226\u0219\3\2\2\2\u0226\u021a\3\2\2\2\u0226\u021b\3\2\2\2\u0226"+
		"\u021c\3\2\2\2\u0226\u021d\3\2\2\2\u0226\u021e\3\2\2\2\u0226\u021f\3\2"+
		"\2\2\u0226\u0220\3\2\2\2\u0226\u0221\3\2\2\2\u0226\u0222\3\2\2\2\u0226"+
		"\u0223\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227y\3\2\2\2"+
		"\u0228\u0229\7-\2\2\u0229\u022a\7\6\2\2\u022a\u022b\5> \2\u022b\u022c"+
		"\7\7\2\2\u022c{\3\2\2\2\u022d\u022e\7.\2\2\u022e\u022f\7\6\2\2\u022f\u0230"+
		"\5> \2\u0230\u0231\7\7\2\2\u0231}\3\2\2\2\u0232\u0233\7/\2\2\u0233\u0234"+
		"\7\6\2\2\u0234\u0235\5> \2\u0235\u0236\7\7\2\2\u0236\177\3\2\2\2\u0237"+
		"\u0238\7\60\2\2\u0238\u0239\7\6\2\2\u0239\u023a\5> \2\u023a\u023b\7\7"+
		"\2\2\u023b\u0081\3\2\2\2\u023c\u023d\7\61\2\2\u023d\u023e\7\6\2\2\u023e"+
		"\u023f\5> \2\u023f\u0240\7\7\2\2\u0240\u0083\3\2\2\2\u0241\u0242\7\62"+
		"\2\2\u0242\u0243\7\6\2\2\u0243\u0244\5> \2\u0244\u0245\7\7\2\2\u0245\u0085"+
		"\3\2\2\2\u0246\u024a\5\u0088E\2\u0247\u024a\5\u008aF\2\u0248\u024a\5\u008c"+
		"G\2\u0249\u0246\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2\u024a"+
		"\u0087\3\2\2\2\u024b\u024c\7\63\2\2\u024c\u024d\7\6\2\2\u024d\u024e\5"+
		"> \2\u024e\u024f\7\t\2\2\u024f\u0250\5> \2\u0250\u0251\7\t\2\2\u0251\u0252"+
		"\5> \2\u0252\u0253\7\7\2\2\u0253\u0089\3\2\2\2\u0254\u0255\7\64\2\2\u0255"+
		"\u0256\7\6\2\2\u0256\u0257\5> \2\u0257\u0258\7\t\2\2\u0258\u0259\5> \2"+
		"\u0259\u025a\7\t\2\2\u025a\u025b\5> \2\u025b\u025c\7\7\2\2\u025c\u008b"+
		"\3\2\2\2\u025d\u025e\7\65\2\2\u025e\u025f\7\6\2\2\u025f\u0260\5> \2\u0260"+
		"\u0261\7\t\2\2\u0261\u0262\5> \2\u0262\u0263\7\7\2\2\u0263\u008d\3\2\2"+
		"\2\u0264\u0268\5\u0090I\2\u0265\u0268\5\u0092J\2\u0266\u0268\5\u0094K"+
		"\2\u0267\u0264\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268\u008f"+
		"\3\2\2\2\u0269\u026a\7\66\2\2\u026a\u026b\7\6\2\2\u026b\u026c\5> \2\u026c"+
		"\u026d\7\t\2\2\u026d\u026e\5> \2\u026e\u026f\7\t\2\2\u026f\u0270\5> \2"+
		"\u0270\u0271\7\7\2\2\u0271\u0091\3\2\2\2\u0272\u0273\7\67\2\2\u0273\u0274"+
		"\7\6\2\2\u0274\u0275\5> \2\u0275\u0276\7\t\2\2\u0276\u0277\5> \2\u0277"+
		"\u0278\7\t\2\2\u0278\u0279\5> \2\u0279\u027a\7\7\2\2\u027a\u0093\3\2\2"+
		"\2\u027b\u027c\78\2\2\u027c\u027d\7\6\2\2\u027d\u027e\5> \2\u027e\u027f"+
		"\7\t\2\2\u027f\u0280\5> \2\u0280\u0281\7\7\2\2\u0281\u0095\3\2\2\2\u0282"+
		"\u0286\5\u0098M\2\u0283\u0286\5\u009aN\2\u0284\u0286\5\u009cO\2\u0285"+
		"\u0282\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286\u0097\3\2"+
		"\2\2\u0287\u0288\79\2\2\u0288\u0289\7\6\2\2\u0289\u028a\5> \2\u028a\u028b"+
		"\7\t\2\2\u028b\u028c\5> \2\u028c\u028d\7\7\2\2\u028d\u0099\3\2\2\2\u028e"+
		"\u028f\7:\2\2\u028f\u0290\7\6\2\2\u0290\u0291\5> \2\u0291\u0292\7\t\2"+
		"\2\u0292\u0293\5> \2\u0293\u0294\7\7\2\2\u0294\u009b\3\2\2\2\u0295\u0296"+
		"\7;\2\2\u0296\u0297\7\6\2\2\u0297\u0298\5> \2\u0298\u0299\7\7\2\2\u0299"+
		"\u009d\3\2\2\2\u029a\u029e\5\u00a0Q\2\u029b\u029e\5\u00a2R\2\u029c\u029e"+
		"\5\u00a4S\2\u029d\u029a\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2\2"+
		"\2\u029e\u009f\3\2\2\2\u029f\u02a0\7<\2\2\u02a0\u02a1\7\6\2\2\u02a1\u02a2"+
		"\5> \2\u02a2\u02a3\7\t\2\2\u02a3\u02a4\5> \2\u02a4\u02a5\7\t\2\2\u02a5"+
		"\u02a6\5> \2\u02a6\u02a7\7\7\2\2\u02a7\u00a1\3\2\2\2\u02a8\u02a9\7=\2"+
		"\2\u02a9\u02aa\7\6\2\2\u02aa\u02ab\5> \2\u02ab\u02ac\7\t\2\2\u02ac\u02ad"+
		"\5> \2\u02ad\u02ae\7\t\2\2\u02ae\u02af\5> \2\u02af\u02b0\7\7\2\2\u02b0"+
		"\u00a3\3\2\2\2\u02b1\u02b2\7>\2\2\u02b2\u02b3\7\6\2\2\u02b3\u02b4\5> "+
		"\2\u02b4\u02b5\7\t\2\2\u02b5\u02b6\5> \2\u02b6\u02b7\7\7\2\2\u02b7\u00a5"+
		"\3\2\2\2\u02b8\u02bc\5\u00a8U\2\u02b9\u02bc\5\u00aaV\2\u02ba\u02bc\5\u00ac"+
		"W\2\u02bb\u02b8\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc"+
		"\u00a7\3\2\2\2\u02bd\u02be\7?\2\2\u02be\u02bf\7\6\2\2\u02bf\u02c0\5> "+
		"\2\u02c0\u02c1\7\t\2\2\u02c1\u02c2\5> \2\u02c2\u02c3\7\7\2\2\u02c3\u00a9"+
		"\3\2\2\2\u02c4\u02c5\7@\2\2\u02c5\u02c6\7\6\2\2\u02c6\u02c7\5> \2\u02c7"+
		"\u02c8\7\t\2\2\u02c8\u02c9\5> \2\u02c9\u02ca\7\7\2\2\u02ca\u00ab\3\2\2"+
		"\2\u02cb\u02cc\7A\2\2\u02cc\u02cd\7\6\2\2\u02cd\u02ce\5> \2\u02ce\u02cf"+
		"\7\7\2\2\u02cf\u00ad\3\2\2\2\u02d0\u02d4\5\u00b0Y\2\u02d1\u02d4\5\u00b2"+
		"Z\2\u02d2\u02d4\5\u00b4[\2\u02d3\u02d0\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3"+
		"\u02d2\3\2\2\2\u02d4\u00af\3\2\2\2\u02d5\u02d6\7B\2\2\u02d6\u02d7\7\6"+
		"\2\2\u02d7\u02d8\5> \2\u02d8\u02d9\7\t\2\2\u02d9\u02da\5> \2\u02da\u02db"+
		"\7\t\2\2\u02db\u02dc\5> \2\u02dc\u02dd\7\7\2\2\u02dd\u00b1\3\2\2\2\u02de"+
		"\u02df\7C\2\2\u02df\u02e0\7\6\2\2\u02e0\u02e1\5> \2\u02e1\u02e2\7\t\2"+
		"\2\u02e2\u02e3\5> \2\u02e3\u02e4\7\t\2\2\u02e4\u02e5\5> \2\u02e5\u02e6"+
		"\7\7\2\2\u02e6\u00b3\3\2\2\2\u02e7\u02e8\7D\2\2\u02e8\u02e9\7\6\2\2\u02e9"+
		"\u02ea\5> \2\u02ea\u02eb\7\t\2\2\u02eb\u02ec\5> \2\u02ec\u02ed\7\7\2\2"+
		"\u02ed\u00b5\3\2\2\2\u02ee\u02f2\5\u00b8]\2\u02ef\u02f2\5\u00ba^\2\u02f0"+
		"\u02f2\5\u00bc_\2\u02f1\u02ee\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f0"+
		"\3\2\2\2\u02f2\u00b7\3\2\2\2\u02f3\u02f4\7E\2\2\u02f4\u02f5\7\6\2\2\u02f5"+
		"\u02f6\5> \2\u02f6\u02f7\7\t\2\2\u02f7\u02f8\5> \2\u02f8\u02f9\7\7\2\2"+
		"\u02f9\u00b9\3\2\2\2\u02fa\u02fb\7F\2\2\u02fb\u02fc\7\6\2\2\u02fc\u02fd"+
		"\5> \2\u02fd\u02fe\7\t\2\2\u02fe\u02ff\5> \2\u02ff\u0300\7\7\2\2\u0300"+
		"\u00bb\3\2\2\2\u0301\u0302\7G\2\2\u0302\u0303\7\6\2\2\u0303\u0304\5> "+
		"\2\u0304\u0305\7\7\2\2\u0305\u00bd\3\2\2\2\u0306\u030a\5\u00c0a\2\u0307"+
		"\u030a\5\u00c2b\2\u0308\u030a\5\u00c4c\2\u0309\u0306\3\2\2\2\u0309\u0307"+
		"\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u00bf\3\2\2\2\u030b\u030c\7H\2\2\u030c"+
		"\u030d\7\6\2\2\u030d\u030e\5> \2\u030e\u030f\7\t\2\2\u030f\u0310\5> \2"+
		"\u0310\u0311\7\t\2\2\u0311\u0312\5> \2\u0312\u0313\7\7\2\2\u0313\u00c1"+
		"\3\2\2\2\u0314\u0315\7I\2\2\u0315\u0316\7\6\2\2\u0316\u0317\5> \2\u0317"+
		"\u0318\7\t\2\2\u0318\u0319\5> \2\u0319\u031a\7\t\2\2\u031a\u031b\5> \2"+
		"\u031b\u031c\7\7\2\2\u031c\u00c3\3\2\2\2\u031d\u031e\7J\2\2\u031e\u031f"+
		"\7\6\2\2\u031f\u0320\5> \2\u0320\u0321\7\t\2\2\u0321\u0322\5> \2\u0322"+
		"\u0323\7\7\2\2\u0323\u00c5\3\2\2\2)\u00cc\u00d5\u00dd\u00e7\u00f3\u00fe"+
		"\u0102\u010b\u0115\u011b\u012e\u0135\u0148\u0155\u017e\u0188\u018f\u0198"+
		"\u01a8\u01b4\u01bf\u01cd\u01d3\u01d7\u01e5\u01f4\u0200\u0206\u020f\u0216"+
		"\u0226\u0249\u0267\u0285\u029d\u02bb\u02d3\u02f1\u0309";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
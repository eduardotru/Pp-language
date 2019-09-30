// Generated from Pp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PpParser}.
 */
public interface PpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PpParser#program0}.
	 * @param ctx the parse tree
	 */
	void enterProgram0(PpParser.Program0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#program0}.
	 * @param ctx the parse tree
	 */
	void exitProgram0(PpParser.Program0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#statement0}.
	 * @param ctx the parse tree
	 */
	void enterStatement0(PpParser.Statement0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#statement0}.
	 * @param ctx the parse tree
	 */
	void exitStatement0(PpParser.Statement0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#block0}.
	 * @param ctx the parse tree
	 */
	void enterBlock0(PpParser.Block0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#block0}.
	 * @param ctx the parse tree
	 */
	void exitBlock0(PpParser.Block0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#block1}.
	 * @param ctx the parse tree
	 */
	void enterBlock1(PpParser.Block1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#block1}.
	 * @param ctx the parse tree
	 */
	void exitBlock1(PpParser.Block1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#function_decl0}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl0(PpParser.Function_decl0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#function_decl0}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl0(PpParser.Function_decl0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#parameters0}.
	 * @param ctx the parse tree
	 */
	void enterParameters0(PpParser.Parameters0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#parameters0}.
	 * @param ctx the parse tree
	 */
	void exitParameters0(PpParser.Parameters0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#parameters1}.
	 * @param ctx the parse tree
	 */
	void enterParameters1(PpParser.Parameters1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#parameters1}.
	 * @param ctx the parse tree
	 */
	void exitParameters1(PpParser.Parameters1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#variable_decl0}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl0(PpParser.Variable_decl0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#variable_decl0}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl0(PpParser.Variable_decl0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#variables_decl1}.
	 * @param ctx the parse tree
	 */
	void enterVariables_decl1(PpParser.Variables_decl1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#variables_decl1}.
	 * @param ctx the parse tree
	 */
	void exitVariables_decl1(PpParser.Variables_decl1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#assignment0}.
	 * @param ctx the parse tree
	 */
	void enterAssignment0(PpParser.Assignment0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#assignment0}.
	 * @param ctx the parse tree
	 */
	void exitAssignment0(PpParser.Assignment0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#function_call0}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call0(PpParser.Function_call0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#function_call0}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call0(PpParser.Function_call0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#function_call_aux0}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_aux0(PpParser.Function_call_aux0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#function_call_aux0}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_aux0(PpParser.Function_call_aux0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#function_call_aux1}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_aux1(PpParser.Function_call_aux1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#function_call_aux1}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_aux1(PpParser.Function_call_aux1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#function_call_aux2}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_aux2(PpParser.Function_call_aux2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#function_call_aux2}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_aux2(PpParser.Function_call_aux2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#if0}.
	 * @param ctx the parse tree
	 */
	void enterIf0(PpParser.If0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#if0}.
	 * @param ctx the parse tree
	 */
	void exitIf0(PpParser.If0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#else0}.
	 * @param ctx the parse tree
	 */
	void enterElse0(PpParser.Else0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#else0}.
	 * @param ctx the parse tree
	 */
	void exitElse0(PpParser.Else0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#while0}.
	 * @param ctx the parse tree
	 */
	void enterWhile0(PpParser.While0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#while0}.
	 * @param ctx the parse tree
	 */
	void exitWhile0(PpParser.While0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#io_statement0}.
	 * @param ctx the parse tree
	 */
	void enterIo_statement0(PpParser.Io_statement0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#io_statement0}.
	 * @param ctx the parse tree
	 */
	void exitIo_statement0(PpParser.Io_statement0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#input0}.
	 * @param ctx the parse tree
	 */
	void enterInput0(PpParser.Input0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#input0}.
	 * @param ctx the parse tree
	 */
	void exitInput0(PpParser.Input0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#output0}.
	 * @param ctx the parse tree
	 */
	void enterOutput0(PpParser.Output0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#output0}.
	 * @param ctx the parse tree
	 */
	void exitOutput0(PpParser.Output0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#plot0}.
	 * @param ctx the parse tree
	 */
	void enterPlot0(PpParser.Plot0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#plot0}.
	 * @param ctx the parse tree
	 */
	void exitPlot0(PpParser.Plot0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#readcsv0}.
	 * @param ctx the parse tree
	 */
	void enterReadcsv0(PpParser.Readcsv0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#readcsv0}.
	 * @param ctx the parse tree
	 */
	void exitReadcsv0(PpParser.Readcsv0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#return0}.
	 * @param ctx the parse tree
	 */
	void enterReturn0(PpParser.Return0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#return0}.
	 * @param ctx the parse tree
	 */
	void exitReturn0(PpParser.Return0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#expression0}.
	 * @param ctx the parse tree
	 */
	void enterExpression0(PpParser.Expression0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#expression0}.
	 * @param ctx the parse tree
	 */
	void exitExpression0(PpParser.Expression0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#bool_exp0}.
	 * @param ctx the parse tree
	 */
	void enterBool_exp0(PpParser.Bool_exp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#bool_exp0}.
	 * @param ctx the parse tree
	 */
	void exitBool_exp0(PpParser.Bool_exp0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#bool_exp1}.
	 * @param ctx the parse tree
	 */
	void enterBool_exp1(PpParser.Bool_exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#bool_exp1}.
	 * @param ctx the parse tree
	 */
	void exitBool_exp1(PpParser.Bool_exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#bool_term0}.
	 * @param ctx the parse tree
	 */
	void enterBool_term0(PpParser.Bool_term0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#bool_term0}.
	 * @param ctx the parse tree
	 */
	void exitBool_term0(PpParser.Bool_term0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#bool_op0}.
	 * @param ctx the parse tree
	 */
	void enterBool_op0(PpParser.Bool_op0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#bool_op0}.
	 * @param ctx the parse tree
	 */
	void exitBool_op0(PpParser.Bool_op0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#rel_op0}.
	 * @param ctx the parse tree
	 */
	void enterRel_op0(PpParser.Rel_op0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#rel_op0}.
	 * @param ctx the parse tree
	 */
	void exitRel_op0(PpParser.Rel_op0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#arithmetic_exp0}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_exp0(PpParser.Arithmetic_exp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#arithmetic_exp0}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_exp0(PpParser.Arithmetic_exp0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#arithmetic_exp1}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_exp1(PpParser.Arithmetic_exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#arithmetic_exp1}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_exp1(PpParser.Arithmetic_exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#numeric_term0}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_term0(PpParser.Numeric_term0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#numeric_term0}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_term0(PpParser.Numeric_term0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#numeric_term1}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_term1(PpParser.Numeric_term1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#numeric_term1}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_term1(PpParser.Numeric_term1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#sign0}.
	 * @param ctx the parse tree
	 */
	void enterSign0(PpParser.Sign0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#sign0}.
	 * @param ctx the parse tree
	 */
	void exitSign0(PpParser.Sign0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#math_op0}.
	 * @param ctx the parse tree
	 */
	void enterMath_op0(PpParser.Math_op0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#math_op0}.
	 * @param ctx the parse tree
	 */
	void exitMath_op0(PpParser.Math_op0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#type0}.
	 * @param ctx the parse tree
	 */
	void enterType0(PpParser.Type0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#type0}.
	 * @param ctx the parse tree
	 */
	void exitType0(PpParser.Type0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#type1}.
	 * @param ctx the parse tree
	 */
	void enterType1(PpParser.Type1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#type1}.
	 * @param ctx the parse tree
	 */
	void exitType1(PpParser.Type1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#basic_type0}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type0(PpParser.Basic_type0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#basic_type0}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type0(PpParser.Basic_type0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#value0}.
	 * @param ctx the parse tree
	 */
	void enterValue0(PpParser.Value0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#value0}.
	 * @param ctx the parse tree
	 */
	void exitValue0(PpParser.Value0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#value1}.
	 * @param ctx the parse tree
	 */
	void enterValue1(PpParser.Value1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#value1}.
	 * @param ctx the parse tree
	 */
	void exitValue1(PpParser.Value1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#matrix_literal0}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_literal0(PpParser.Matrix_literal0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#matrix_literal0}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_literal0(PpParser.Matrix_literal0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#matrix_literal1}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_literal1(PpParser.Matrix_literal1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#matrix_literal1}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_literal1(PpParser.Matrix_literal1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#matrix_literal2}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_literal2(PpParser.Matrix_literal2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#matrix_literal2}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_literal2(PpParser.Matrix_literal2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#matrix_literal3}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_literal3(PpParser.Matrix_literal3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#matrix_literal3}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_literal3(PpParser.Matrix_literal3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PpParser#matrix_literal4}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_literal4(PpParser.Matrix_literal4Context ctx);
	/**
	 * Exit a parse tree produced by {@link PpParser#matrix_literal4}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_literal4(PpParser.Matrix_literal4Context ctx);
}
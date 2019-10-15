# Generated from Pp.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PpParser import PpParser
else:
    from PpParser import PpParser

GLOBAL_SCOPE = "program"


# This class defines a complete listener for a parse tree produced by PpParser.
class PpListener(ParseTreeListener):

    def __init__(self, symbols_table, semantic_cube):
        self.symbols_table = symbols_table
        self.semantic_cube = semantic_cube
        self.current_scope = GLOBAL_SCOPE
        self.current_type = None
        self.func_parameters = []
        self.func_name = ""
        self.func_type = ""

    # Enter a parse tree produced by PpParser#r.
    def enterR(self, ctx:PpParser.RContext):
        pass

    # Exit a parse tree produced by PpParser#r.
    def exitR(self, ctx:PpParser.RContext):
        pass


    # Enter a parse tree produced by PpParser#program0.
    def enterProgram0(self, ctx:PpParser.Program0Context):
        pass

    # Exit a parse tree produced by PpParser#program0.
    def exitProgram0(self, ctx:PpParser.Program0Context):
        pass


    # Enter a parse tree produced by PpParser#program1.
    def enterProgram1(self, ctx:PpParser.Program1Context):
        pass

    # Exit a parse tree produced by PpParser#program1.
    def exitProgram1(self, ctx:PpParser.Program1Context):
        pass


    # Enter a parse tree produced by PpParser#statement0.
    def enterStatement0(self, ctx:PpParser.Statement0Context):
        pass

    # Exit a parse tree produced by PpParser#statement0.
    def exitStatement0(self, ctx:PpParser.Statement0Context):
        pass


    # Enter a parse tree produced by PpParser#block0.
    def enterBlock0(self, ctx:PpParser.Block0Context):
        pass

    # Exit a parse tree produced by PpParser#block0.
    def exitBlock0(self, ctx:PpParser.Block0Context):
        pass


    # Enter a parse tree produced by PpParser#block1.
    def enterBlock1(self, ctx:PpParser.Block1Context):
        pass

    # Exit a parse tree produced by PpParser#block1.
    def exitBlock1(self, ctx:PpParser.Block1Context):
        pass


    # Enter a parse tree produced by PpParser#function_decl0.
    def enterFunction_decl0(self, ctx:PpParser.Function_decl0Context):
        self.current_scope = ctx.ID()
        self.func_name = ctx.ID()
        self.func_type = ctx.type0().getText()
        self.func_parameters = []

    # Exit a parse tree produced by PpParser#function_decl0.
    def exitFunction_decl0(self, ctx:PpParser.Function_decl0Context):
        self.current_scope = GLOBAL_SCOPE
        pass


    # Enter a parse tree produced by PpParser#decl_block0.
    def enterDecl_block0(self, ctx:PpParser.Decl_block0Context):
        try:
            self.symbols_table.add_function(self.func_name, self.func_type, self.func_parameters)
        except Exception:
            print(f"Semantic error: Redefinition of function {self.func_name}"
                f"in line {ctx.start.line}")

    # Exit a parse tree produced by PpParser#decl_block0.
    def exitDecl_block0(self, ctx:PpParser.Decl_block0Context):
        pass


    # Enter a parse tree produced by PpParser#decl_block1.
    def enterDecl_block1(self, ctx:PpParser.Decl_block1Context):
        pass

    # Exit a parse tree produced by PpParser#decl_block1.
    def exitDecl_block1(self, ctx:PpParser.Decl_block1Context):
        pass


    # Enter a parse tree produced by PpParser#parameters0.
    def enterParameters0(self, ctx:PpParser.Parameters0Context):
        self.func_parameters.append((ctx.type0().getText(), ctx.ID()))

    # Exit a parse tree produced by PpParser#parameters0.
    def exitParameters0(self, ctx:PpParser.Parameters0Context):
        pass


    # Enter a parse tree produced by PpParser#parameters1.
    def enterParameters1(self, ctx:PpParser.Parameters1Context):
        pass

    # Exit a parse tree produced by PpParser#parameters1.
    def exitParameters1(self, ctx:PpParser.Parameters1Context):
        pass


    # Enter a parse tree produced by PpParser#variable_decl0.
    def enterVariable_decl0(self, ctx:PpParser.Variable_decl0Context):
        if ctx.ID() is None:
            return
        self.current_type = ctx.type0().getText()
        try:
            self.symbols_table.add_variable(ctx.ID(), self.current_type, self.current_scope)
        except Exception:
            print(f"Semantic error: Redefinition of variable '{ctx.ID()}' in "
                f"line {ctx.start.line}")

    # Exit a parse tree produced by PpParser#variable_decl0.
    def exitVariable_decl0(self, ctx:PpParser.Variable_decl0Context):
        pass


    # Enter a parse tree produced by PpParser#variables_decl1.
    def enterVariables_decl1(self, ctx:PpParser.Variables_decl1Context):
        if ctx.ID() is None:
            return
        try:
            self.symbols_table.add_variable(ctx.ID(), self.current_type, self.current_scope)
        except Exception:
            print(f"Semantic error: Redefinition of variable '{ctx.ID()}' in "
                    f"line {ctx.start.line}")

    # Exit a parse tree produced by PpParser#variables_decl1.
    def exitVariables_decl1(self, ctx:PpParser.Variables_decl1Context):
        pass


    # Enter a parse tree produced by PpParser#assignment0.
    def enterAssignment0(self, ctx:PpParser.Assignment0Context):
        pass

    # Exit a parse tree produced by PpParser#assignment0.
    def exitAssignment0(self, ctx:PpParser.Assignment0Context):
        pass


    # Enter a parse tree produced by PpParser#function_call0.
    def enterFunction_call0(self, ctx:PpParser.Function_call0Context):
        pass

    # Exit a parse tree produced by PpParser#function_call0.
    def exitFunction_call0(self, ctx:PpParser.Function_call0Context):
        pass


    # Enter a parse tree produced by PpParser#function_call_aux0.
    def enterFunction_call_aux0(self, ctx:PpParser.Function_call_aux0Context):
        if not self.symbols_table.exists_function(ctx.ID(), []):
            print(f"Semantic error: Use of undeclared function {ctx.ID()}")

    # Exit a parse tree produced by PpParser#function_call_aux0.
    def exitFunction_call_aux0(self, ctx:PpParser.Function_call_aux0Context):
        pass


    # Enter a parse tree produced by PpParser#function_call_aux1.
    def enterFunction_call_aux1(self, ctx:PpParser.Function_call_aux1Context):
        pass

    # Exit a parse tree produced by PpParser#function_call_aux1.
    def exitFunction_call_aux1(self, ctx:PpParser.Function_call_aux1Context):
        pass


    # Enter a parse tree produced by PpParser#function_call_aux2.
    def enterFunction_call_aux2(self, ctx:PpParser.Function_call_aux2Context):
        pass

    # Exit a parse tree produced by PpParser#function_call_aux2.
    def exitFunction_call_aux2(self, ctx:PpParser.Function_call_aux2Context):
        pass


    # Enter a parse tree produced by PpParser#if0.
    def enterIf0(self, ctx:PpParser.If0Context):
        pass

    # Exit a parse tree produced by PpParser#if0.
    def exitIf0(self, ctx:PpParser.If0Context):
        pass


    # Enter a parse tree produced by PpParser#else0.
    def enterElse0(self, ctx:PpParser.Else0Context):
        pass

    # Exit a parse tree produced by PpParser#else0.
    def exitElse0(self, ctx:PpParser.Else0Context):
        pass


    # Enter a parse tree produced by PpParser#while0.
    def enterWhile0(self, ctx:PpParser.While0Context):
        pass

    # Exit a parse tree produced by PpParser#while0.
    def exitWhile0(self, ctx:PpParser.While0Context):
        pass


    # Enter a parse tree produced by PpParser#io_statement0.
    def enterIo_statement0(self, ctx:PpParser.Io_statement0Context):
        pass

    # Exit a parse tree produced by PpParser#io_statement0.
    def exitIo_statement0(self, ctx:PpParser.Io_statement0Context):
        pass


    # Enter a parse tree produced by PpParser#input0.
    def enterInput0(self, ctx:PpParser.Input0Context):
        pass

    # Exit a parse tree produced by PpParser#input0.
    def exitInput0(self, ctx:PpParser.Input0Context):
        pass


    # Enter a parse tree produced by PpParser#output0.
    def enterOutput0(self, ctx:PpParser.Output0Context):
        pass

    # Exit a parse tree produced by PpParser#output0.
    def exitOutput0(self, ctx:PpParser.Output0Context):
        pass


    # Enter a parse tree produced by PpParser#plot0.
    def enterPlot0(self, ctx:PpParser.Plot0Context):
        pass

    # Exit a parse tree produced by PpParser#plot0.
    def exitPlot0(self, ctx:PpParser.Plot0Context):
        pass


    # Enter a parse tree produced by PpParser#readcsv0.
    def enterReadcsv0(self, ctx:PpParser.Readcsv0Context):
        pass

    # Exit a parse tree produced by PpParser#readcsv0.
    def exitReadcsv0(self, ctx:PpParser.Readcsv0Context):
        pass


    # Enter a parse tree produced by PpParser#return0.
    def enterReturn0(self, ctx:PpParser.Return0Context):
        pass

    # Exit a parse tree produced by PpParser#return0.
    def exitReturn0(self, ctx:PpParser.Return0Context):
        pass


    # Enter a parse tree produced by PpParser#expression0.
    def enterExpression0(self, ctx:PpParser.Expression0Context):
        pass

    # Exit a parse tree produced by PpParser#expression0.
    def exitExpression0(self, ctx:PpParser.Expression0Context):
        pass


    # Enter a parse tree produced by PpParser#bool_exp0.
    def enterBool_exp0(self, ctx:PpParser.Bool_exp0Context):
        pass

    # Exit a parse tree produced by PpParser#bool_exp0.
    def exitBool_exp0(self, ctx:PpParser.Bool_exp0Context):
        pass


    # Enter a parse tree produced by PpParser#bool_exp1.
    def enterBool_exp1(self, ctx:PpParser.Bool_exp1Context):
        pass

    # Exit a parse tree produced by PpParser#bool_exp1.
    def exitBool_exp1(self, ctx:PpParser.Bool_exp1Context):
        pass


    # Enter a parse tree produced by PpParser#bool_term0.
    def enterBool_term0(self, ctx:PpParser.Bool_term0Context):
        pass

    # Exit a parse tree produced by PpParser#bool_term0.
    def exitBool_term0(self, ctx:PpParser.Bool_term0Context):
        pass


    # Enter a parse tree produced by PpParser#bool_term1.
    def enterBool_term1(self, ctx:PpParser.Bool_term1Context):
        pass

    # Exit a parse tree produced by PpParser#bool_term1.
    def exitBool_term1(self, ctx:PpParser.Bool_term1Context):
        pass


    # Enter a parse tree produced by PpParser#bool_op0.
    def enterBool_op0(self, ctx:PpParser.Bool_op0Context):
        pass

    # Exit a parse tree produced by PpParser#bool_op0.
    def exitBool_op0(self, ctx:PpParser.Bool_op0Context):
        pass


    # Enter a parse tree produced by PpParser#rel_op0.
    def enterRel_op0(self, ctx:PpParser.Rel_op0Context):
        pass

    # Exit a parse tree produced by PpParser#rel_op0.
    def exitRel_op0(self, ctx:PpParser.Rel_op0Context):
        pass


    # Enter a parse tree produced by PpParser#arithmetic_exp0.
    def enterArithmetic_exp0(self, ctx:PpParser.Arithmetic_exp0Context):
        pass

    # Exit a parse tree produced by PpParser#arithmetic_exp0.
    def exitArithmetic_exp0(self, ctx:PpParser.Arithmetic_exp0Context):
        pass


    # Enter a parse tree produced by PpParser#arithmetic_exp1.
    def enterArithmetic_exp1(self, ctx:PpParser.Arithmetic_exp1Context):
        pass

    # Exit a parse tree produced by PpParser#arithmetic_exp1.
    def exitArithmetic_exp1(self, ctx:PpParser.Arithmetic_exp1Context):
        pass


    # Enter a parse tree produced by PpParser#addition_subtraction0.
    def enterAddition_subtraction0(self, ctx:PpParser.Addition_subtraction0Context):
        pass

    # Exit a parse tree produced by PpParser#addition_subtraction0.
    def exitAddition_subtraction0(self, ctx:PpParser.Addition_subtraction0Context):
        pass


    # Enter a parse tree produced by PpParser#arithmetic_factor0.
    def enterArithmetic_factor0(self, ctx:PpParser.Arithmetic_factor0Context):
        pass

    # Exit a parse tree produced by PpParser#arithmetic_factor0.
    def exitArithmetic_factor0(self, ctx:PpParser.Arithmetic_factor0Context):
        pass


    # Enter a parse tree produced by PpParser#arithmetic_factor1.
    def enterArithmetic_factor1(self, ctx:PpParser.Arithmetic_factor1Context):
        pass

    # Exit a parse tree produced by PpParser#arithmetic_factor1.
    def exitArithmetic_factor1(self, ctx:PpParser.Arithmetic_factor1Context):
        pass


    # Enter a parse tree produced by PpParser#multiplication_division0.
    def enterMultiplication_division0(self, ctx:PpParser.Multiplication_division0Context):
        pass

    # Exit a parse tree produced by PpParser#multiplication_division0.
    def exitMultiplication_division0(self, ctx:PpParser.Multiplication_division0Context):
        pass


    # Enter a parse tree produced by PpParser#arithmetic_term0.
    def enterArithmetic_term0(self, ctx:PpParser.Arithmetic_term0Context):
        pass

    # Exit a parse tree produced by PpParser#arithmetic_term0.
    def exitArithmetic_term0(self, ctx:PpParser.Arithmetic_term0Context):
        pass


    # Enter a parse tree produced by PpParser#arithmetic_term1.
    def enterArithmetic_term1(self, ctx:PpParser.Arithmetic_term1Context):
        pass

    # Exit a parse tree produced by PpParser#arithmetic_term1.
    def exitArithmetic_term1(self, ctx:PpParser.Arithmetic_term1Context):
        pass


    # Enter a parse tree produced by PpParser#exponent0.
    def enterExponent0(self, ctx:PpParser.Exponent0Context):
        pass

    # Exit a parse tree produced by PpParser#exponent0.
    def exitExponent0(self, ctx:PpParser.Exponent0Context):
        pass


    # Enter a parse tree produced by PpParser#numeric_term0.
    def enterNumeric_term0(self, ctx:PpParser.Numeric_term0Context):
        pass

    # Exit a parse tree produced by PpParser#numeric_term0.
    def exitNumeric_term0(self, ctx:PpParser.Numeric_term0Context):
        pass


    # Enter a parse tree produced by PpParser#numeric_term1.
    def enterNumeric_term1(self, ctx:PpParser.Numeric_term1Context):
        pass

    # Exit a parse tree produced by PpParser#numeric_term1.
    def exitNumeric_term1(self, ctx:PpParser.Numeric_term1Context):
        pass


    # Enter a parse tree produced by PpParser#sign0.
    def enterSign0(self, ctx:PpParser.Sign0Context):
        pass

    # Exit a parse tree produced by PpParser#sign0.
    def exitSign0(self, ctx:PpParser.Sign0Context):
        pass


    # Enter a parse tree produced by PpParser#type0.
    def enterType0(self, ctx:PpParser.Type0Context):
        pass

    # Exit a parse tree produced by PpParser#type0.
    def exitType0(self, ctx:PpParser.Type0Context):
        pass


    # Enter a parse tree produced by PpParser#type1.
    def enterType1(self, ctx:PpParser.Type1Context):
        pass

    # Exit a parse tree produced by PpParser#type1.
    def exitType1(self, ctx:PpParser.Type1Context):
        pass


    # Enter a parse tree produced by PpParser#basic_type0.
    def enterBasic_type0(self, ctx:PpParser.Basic_type0Context):
        pass

    # Exit a parse tree produced by PpParser#basic_type0.
    def exitBasic_type0(self, ctx:PpParser.Basic_type0Context):
        pass


    # Enter a parse tree produced by PpParser#value0.
    def enterValue0(self, ctx:PpParser.Value0Context):
        if not self.symbols_table.exists_variable(ctx.ID(), self.current_scope):
            print(f"Semantic error: Use of undefined variable {ctx.ID()}")

    # Exit a parse tree produced by PpParser#value0.
    def exitValue0(self, ctx:PpParser.Value0Context):
        pass


    # Enter a parse tree produced by PpParser#value1.
    def enterValue1(self, ctx:PpParser.Value1Context):
        pass

    # Exit a parse tree produced by PpParser#value1.
    def exitValue1(self, ctx:PpParser.Value1Context):
        pass


    # Enter a parse tree produced by PpParser#matrix_literal0.
    def enterMatrix_literal0(self, ctx:PpParser.Matrix_literal0Context):
        pass

    # Exit a parse tree produced by PpParser#matrix_literal0.
    def exitMatrix_literal0(self, ctx:PpParser.Matrix_literal0Context):
        pass


    # Enter a parse tree produced by PpParser#matrix_literal1.
    def enterMatrix_literal1(self, ctx:PpParser.Matrix_literal1Context):
        pass

    # Exit a parse tree produced by PpParser#matrix_literal1.
    def exitMatrix_literal1(self, ctx:PpParser.Matrix_literal1Context):
        pass


    # Enter a parse tree produced by PpParser#matrix_literal2.
    def enterMatrix_literal2(self, ctx:PpParser.Matrix_literal2Context):
        pass

    # Exit a parse tree produced by PpParser#matrix_literal2.
    def exitMatrix_literal2(self, ctx:PpParser.Matrix_literal2Context):
        pass


    # Enter a parse tree produced by PpParser#matrix_literal3.
    def enterMatrix_literal3(self, ctx:PpParser.Matrix_literal3Context):
        pass

    # Exit a parse tree produced by PpParser#matrix_literal3.
    def exitMatrix_literal3(self, ctx:PpParser.Matrix_literal3Context):
        pass


    # Enter a parse tree produced by PpParser#matrix_literal4.
    def enterMatrix_literal4(self, ctx:PpParser.Matrix_literal4Context):
        pass

    # Exit a parse tree produced by PpParser#matrix_literal4.
    def exitMatrix_literal4(self, ctx:PpParser.Matrix_literal4Context):
        pass



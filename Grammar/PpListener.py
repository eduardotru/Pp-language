# Generated from Pp.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PpParser import PpParser
else:
    from PpParser import PpParser

from SymbolsTable import BasicTypes, Variable

GLOBAL_SCOPE = "program"

# This class defines a complete listener for a parse tree produced by PpParser.
class PpListener(ParseTreeListener):

    def __init__(self, symbols_table, semantic_cube, quadruples):
        self.symbols_table = symbols_table
        self.semantic_cube = semantic_cube
        self.quadruples = quadruples
        self.current_scope = GLOBAL_SCOPE
        self.current_type = None
        self.func_parameters = []
        self.func_name = None
        self.func_type = None
        self.block_reason = []
    
    # Enter a parse tree produced by PpParser#r.
    def enterR(self, ctx:PpParser.RContext):
        pass

    # Exit a parse tree produced by PpParser#r.
    def exitR(self, ctx:PpParser.RContext):
        print(self.symbols_table)
        print(self.quadruples)


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
        if self.block_reason[-1] == 'if':
            self.quadruples.push_jump(self.quadruples.get_quad_count())
            cond = self.quadruples.pop_operand()
            self.quadruples.pop_type()
            self.quadruples.add_quadruple('gotof', cond, None, None)
        elif self.block_reason[-1] == 'elseif':
            self.quadruples.push_jump(self.quadruples.get_quad_count())
            cond = self.quadruples.pop_operand()
            self.quadruples.pop_type()
            self.quadruples.add_quadruple('gotof', cond, None, None)
        elif self.block_reason[-1] == 'else':
            pass
        elif self.block_reason[-1] == 'while':
            self.quadruples.push_jump(self.quadruples.get_quad_count())
            cond = self.quadruples.pop_operand()
            self.quadruples.pop_type()
            self.quadruples.add_quadruple('gotof', cond, None, None)

    # Exit a parse tree produced by PpParser#block0.
    def exitBlock0(self, ctx:PpParser.Block0Context):
        if self.block_reason[-1] == 'if':
            pass            
        elif self.block_reason[-1] == 'elseif':
            pass
        elif self.block_reason[-1] == 'else':
            pass
        elif self.block_reason[-1] == 'while':
            pass


    # Enter a parse tree produced by PpParser#block1.
    def enterBlock1(self, ctx:PpParser.Block1Context):
        pass

    # Exit a parse tree produced by PpParser#block1.
    def exitBlock1(self, ctx:PpParser.Block1Context):
        pass


    # Enter a parse tree produced by PpParser#function_decl0.
    def enterFunction_decl0(self, ctx:PpParser.Function_decl0Context):
        self.current_scope = ctx.ID().getText()
        self.func_name = ctx.ID().getText()
        self.func_type = ctx.type0().getText()
        self.func_parameters = []
    
    # Exit a parse tree produced by PpParser#function_decl0.
    def exitFunction_decl0(self, ctx:PpParser.Function_decl0Context):
        self.current_scope = GLOBAL_SCOPE


    # Enter a parse tree produced by PpParser#decl_block0.
    def enterDecl_block0(self, ctx:PpParser.Decl_block0Context):
        try:
            self.symbols_table.add_function(self.func_name, BasicTypes(self.func_type), self.func_parameters)
        except Exception:
            print(f"Semantic error: Redefinition of function {self.func_name}"
                f"at {ctx.start.line}:{ctx.start.column}")

    # Exit a parse tree produced by PpParser#decl_block0.
    def exitDecl_block0(self, ctx:PpParser.Decl_block0Context):
        pass


    # Enter a parse tree produced by PpParser#decl_block1.
    def enterDecl_block1(self, ctx:PpParser.Decl_block1Context):
        pass

    # Exit a parse tree produced by PpParser#decl_block1.
    def exitDecl_block1(self, ctx:PpParser.Decl_block1Context):
        pass


    # Enter a parse tree produced by PpParser#parameters_or_empty0.
    def enterParameters_or_empty0(self, ctx:PpParser.Parameters_or_empty0Context):
        pass

    # Exit a parse tree produced by PpParser#parameters_or_empty0.
    def exitParameters_or_empty0(self, ctx:PpParser.Parameters_or_empty0Context):
        pass


    # Enter a parse tree produced by PpParser#parameters0.
    def enterParameters0(self, ctx:PpParser.Parameters0Context):
        self.func_parameters.append(
            Variable(ctx.ID().getText(), BasicTypes(ctx.type0().getText()), self.current_scope)
        )

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
            self.symbols_table.add_variable(
                ctx.ID().getText(),
                BasicTypes(self.current_type),
                self.current_scope,
            )
        except Exception:
            print(f"Semantic error: Redefinition of variable '{ctx.ID().getText()}' at "
                f"{ctx.start.line}:{ctx.start.column}")

    # Exit a parse tree produced by PpParser#variable_decl0.
    def exitVariable_decl0(self, ctx:PpParser.Variable_decl0Context):
        pass


    # Enter a parse tree produced by PpParser#variables_decl1.
    def enterVariables_decl1(self, ctx:PpParser.Variables_decl1Context):
        if ctx.ID() is None:
            return
        try:
            self.symbols_table.add_variable(
                ctx.ID().getText(),
                BasicTypes(self.current_type),
                self.current_scope
            )
        except Exception:
            print(f"Semantic error: Redefinition of variable '{ctx.ID().getText()}' at "
                    f"line {ctx.start.line}:{ctx.start.column}")

    # Exit a parse tree produced by PpParser#variables_decl1.
    def exitVariables_decl1(self, ctx:PpParser.Variables_decl1Context):
        pass


    # Enter a parse tree produced by PpParser#assignment0.
    def enterAssignment0(self, ctx:PpParser.Assignment0Context):
        self.quadruples.push_operator('=')


    # Exit a parse tree produced by PpParser#assignment0.
    def exitAssignment0(self, ctx:PpParser.Assignment0Context):
        right = self.quadruples.pop_operand()
        t_right = self.quadruples.pop_type()
        left = self.quadruples.pop_operand()
        t_left = self.quadruples.pop_type()
        operator = self.quadruples.pop_operator()
        try:
            self.semantic_cube.cube[t_left][t_right][operator]
            self.quadruples.add_quadruple(
                operator,
                right,
                None,
                left,
            )
        except Exception:
            print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')


    # Enter a parse tree produced by PpParser#function_call0.
    def enterFunction_call0(self, ctx:PpParser.Function_call0Context):
        pass

    # Exit a parse tree produced by PpParser#function_call0.
    def exitFunction_call0(self, ctx:PpParser.Function_call0Context):
        pass


    # Enter a parse tree produced by PpParser#function_call_aux0.
    def enterFunction_call_aux0(self, ctx:PpParser.Function_call_aux0Context):
        if not self.symbols_table.exists_function(ctx.ID().getText(), []):
            print(f"Semantic error: Use of undeclared function {ctx.ID().getText()} at {ctx.start.line}:{ctx.start.column}")

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
        self.block_reason.append('if')

    # Exit a parse tree produced by PpParser#if0.
    def exitIf0(self, ctx:PpParser.If0Context):
        self.block_reason.pop()


    # Enter a parse tree produced by PpParser#else0.
    def enterElse0(self, ctx:PpParser.Else0Context):
        if ctx.else0() is not None:
            self.block_reason.append('elseif')
        else:
            self.block_reason.append('else')
        quad = self.quadruples.pop_jump()
        self.quadruples.push_jump(self.quadruples.get_quad_count())
        self.quadruples.add_quadruple('goto', None, None, None)
        self.quadruples.quadruples[quad].res = self.quadruples.get_quad_count()

    # Exit a parse tree produced by PpParser#else0.
    def exitElse0(self, ctx:PpParser.Else0Context):
        quad = self.quadruples.pop_jump()
        self.quadruples.quadruples[quad].res = self.quadruples.get_quad_count()
        self.block_reason.pop()


    # Enter a parse tree produced by PpParser#while0.
    def enterWhile0(self, ctx:PpParser.While0Context):
        self.block_reason.append('while')
        self.quadruples.push_jump(self.quadruples.get_quad_count())

    # Exit a parse tree produced by PpParser#while0.
    def exitWhile0(self, ctx:PpParser.While0Context):
        quad = self.quadruples.pop_jump()
        begin = self.quadruples.pop_jump()
        self.quadruples.add_quadruple("goto", None, None, begin)
        self.quadruples.quadruples[quad].res = self.quadruples.get_quad_count()
        self.block_reason.pop()


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
        val = self.quadruples.pop_operand()
        self.quadruples.pop_type()
        self.quadruples.add_quadruple("read", None, None, val)


    # Enter a parse tree produced by PpParser#output0.
    def enterOutput0(self, ctx:PpParser.Output0Context):
        pass

    # Exit a parse tree produced by PpParser#output0.
    def exitOutput0(self, ctx:PpParser.Output0Context):
        val = self.quadruples.pop_operand()
        self.quadruples.pop_type()
        self.quadruples.add_quadruple("write", None, None, val)

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

    def boolOp(self):
        if self.quadruples.has_operator() and self.quadruples.top_operator() in ['and', 'or']:
            right = self.quadruples.pop_operand()
            t_right = self.quadruples.pop_type()
            left = self.quadruples.pop_operand()
            t_left = self.quadruples.pop_type()
            operator = self.quadruples.pop_operator()
            try:
                t_result = self.semantic_cube.cube[t_left][t_right][operator]
                temp_register = self.quadruples.new_temp_register()
                self.quadruples.add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register,
                )
                self.quadruples.push_operand(temp_register)
                self.quadruples.push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')

    # Enter a parse tree produced by PpParser#bool_exp1.
    def enterBool_exp1(self, ctx:PpParser.Bool_exp1Context):
        self.boolOp()
        if ctx.bool_op0() is not None:
            self.quadruples.push_operator(ctx.bool_op0().getText())

    # Exit a parse tree produced by PpParser#bool_exp1.
    def exitBool_exp1(self, ctx:PpParser.Bool_exp1Context):
        self.boolOp()


    # Enter a parse tree produced by PpParser#bool_term0.
    def enterBool_term0(self, ctx:PpParser.Bool_term0Context):
        pass

    # Exit a parse tree produced by PpParser#bool_term0.
    def exitBool_term0(self, ctx:PpParser.Bool_term0Context):
        pass


    def relationalOp(self):
        if self.quadruples.has_operator() and self.quadruples.top_operator() in ['==', '!=', '>', '<', '>=', '<=']:
            right = self.quadruples.pop_operand()
            t_right = self.quadruples.pop_type()
            left = self.quadruples.pop_operand()
            t_left = self.quadruples.pop_type()
            operator = self.quadruples.pop_operator()
            try:
                t_result = self.semantic_cube.cube[t_left][t_right][operator]
                temp_register = self.quadruples.new_temp_register()
                self.quadruples.add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register,
                )
                self.quadruples.push_operand(temp_register)
                self.quadruples.push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')

    # Enter a parse tree produced by PpParser#bool_term1.
    def enterBool_term1(self, ctx:PpParser.Bool_term1Context):
        self.relationalOp()
        if ctx.rel_op0() is not None:
            self.quadruples.push_operator(ctx.rel_op0().getText())

    # Exit a parse tree produced by PpParser#bool_term1.
    def exitBool_term1(self, ctx:PpParser.Bool_term1Context):
        self.relationalOp()


    # Enter a parse tree produced by PpParser#bool_not0.
    def enterBool_not0(self, ctx:PpParser.Bool_not0Context):
        pass

    # Exit a parse tree produced by PpParser#bool_not0.
    def exitBool_not0(self, ctx:PpParser.Bool_not0Context):
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

    def additionSubtractionOp(self):
        if self.quadruples.has_operator() and self.quadruples.top_operator() in ['+', '-']:
            right = self.quadruples.pop_operand()
            t_right = self.quadruples.pop_type()
            left = self.quadruples.pop_operand()
            t_left = self.quadruples.pop_type()
            operator = self.quadruples.pop_operator()
            try:
                t_result = self.semantic_cube.cube[t_left][t_right][operator]
                temp_register = self.quadruples.new_temp_register()
                self.quadruples.add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register
                )
                self.quadruples.push_operand(temp_register)
                self.quadruples.push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')

    # Enter a parse tree produced by PpParser#arithmetic_exp1.
    def enterArithmetic_exp1(self, ctx:PpParser.Arithmetic_exp1Context):
        self.additionSubtractionOp()
        if ctx.addition_subtraction0() is not None:
            self.quadruples.push_operator(ctx.addition_subtraction0().getText())

    # Exit a parse tree produced by PpParser#arithmetic_exp1.
    def exitArithmetic_exp1(self, ctx:PpParser.Arithmetic_exp1Context):
        self.additionSubtractionOp()


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

    def multiplicationDivisionOp(self):
        if self.quadruples.has_operator() and  self.quadruples.top_operator() in ['*', '/', '%']:
            right = self.quadruples.pop_operand()
            t_right = self.quadruples.pop_type()
            left = self.quadruples.pop_operand()
            t_left = self.quadruples.pop_type()
            operator = self.quadruples.pop_operator()
            try:
                t_result = self.semantic_cube.cube[t_left][t_right][operator]
                temp_register = self.quadruples.new_temp_register()
                self.quadruples.add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register,
                )
                self.quadruples.push_operand(temp_register)
                self.quadruples.push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')

    # Enter a parse tree produced by PpParser#arithmetic_factor1.
    def enterArithmetic_factor1(self, ctx:PpParser.Arithmetic_factor1Context):
        self.multiplicationDivisionOp()
        if ctx.multiplication_division0() is not None:
            self.quadruples.push_operator(ctx.multiplication_division0().getText())   

    # Exit a parse tree produced by PpParser#arithmetic_factor1.
    def exitArithmetic_factor1(self, ctx:PpParser.Arithmetic_factor1Context):
        self.multiplicationDivisionOp()


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

    def exponentiationOp(self):
        if self.quadruples.has_operator() and self.quadruples.top_operator() == '^':
            right = self.quadruples.pop_operand()
            t_right = self.quadruples.pop_type()
            left = self.quadruples.pop_operand()
            t_left = self.quadruples.pop_type()
            operator = self.quadruples.pop_operator()
            try:
                t_result = self.semantic_cube.cube[t_left][t_right][operator]
                temp_register = self.quadruples.new_temp_register()
                self.quadruples.add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register,
                )
                self.quadruples.push_operand(temp_register)
                self.quadruples.push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')

    # Enter a parse tree produced by PpParser#arithmetic_term1.
    def enterArithmetic_term1(self, ctx:PpParser.Arithmetic_term1Context):
        self.exponentiationOp()
        if ctx.exponent0() is not None:
            self.quadruples.push_operator('^')   



    # Exit a parse tree produced by PpParser#arithmetic_term1.
    def exitArithmetic_term1(self, ctx:PpParser.Arithmetic_term1Context):
        self.exponentiationOp()


    # Enter a parse tree produced by PpParser#exponent0.
    def enterExponent0(self, ctx:PpParser.Exponent0Context):
        pass

    # Exit a parse tree produced by PpParser#exponent0.
    def exitExponent0(self, ctx:PpParser.Exponent0Context):
        pass


    # Enter a parse tree produced by PpParser#numeric_term0.
    def enterNumeric_term0(self, ctx:PpParser.Numeric_term0Context):
        if ctx.bool_exp0() is not None:
            self.quadruples.push_operator('(')
        if ctx.INT_NUMBER() is not None:
            self.quadruples.push_operand(ctx.INT_NUMBER().getText())
            self.quadruples.push_type(BasicTypes.INT)
        if ctx.FLOAT_NUMBER() is not None:
            self.quadruples.push_operand(ctx.FLOAT_NUMBER().getText())
            self.quadruples.push_type(BasicTypes.FLOAT)
        if ctx.BOOL_LITERAL() is not None:
            self.quadruples.push_operand(ctx.BOOL_LITERAL().getText())
            self.quadruples.push_type(BasicTypes.BOOL)

    # Exit a parse tree produced by PpParser#numeric_term0.
    def exitNumeric_term0(self, ctx:PpParser.Numeric_term0Context):
        if ctx.bool_exp0() is not None:
            self.quadruples.pop_operator()


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
        if not self.symbols_table.exists_variable(ctx.ID().getText(), self.current_scope):
            print(f"Semantic error: Use of undefined variable {ctx.ID().getText()}"
                f" at {ctx.start.line}:{ctx.start.column}")
        self.quadruples.push_operand(ctx.ID().getText())
        self.quadruples.push_type(self.symbols_table.get_type(ctx.ID().getText(), self.current_scope))

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


    # Enter a parse tree produced by PpParser#stat_functions0.
    def enterStat_functions0(self, ctx:PpParser.Stat_functions0Context):
        pass

    # Exit a parse tree produced by PpParser#stat_functions0.
    def exitStat_functions0(self, ctx:PpParser.Stat_functions0Context):
        pass


    # Enter a parse tree produced by PpParser#mean0.
    def enterMean0(self, ctx:PpParser.Mean0Context):
        pass

    # Exit a parse tree produced by PpParser#mean0.
    def exitMean0(self, ctx:PpParser.Mean0Context):
        pass


    # Enter a parse tree produced by PpParser#median0.
    def enterMedian0(self, ctx:PpParser.Median0Context):
        pass

    # Exit a parse tree produced by PpParser#median0.
    def exitMedian0(self, ctx:PpParser.Median0Context):
        pass


    # Enter a parse tree produced by PpParser#mode0.
    def enterMode0(self, ctx:PpParser.Mode0Context):
        pass

    # Exit a parse tree produced by PpParser#mode0.
    def exitMode0(self, ctx:PpParser.Mode0Context):
        pass


    # Enter a parse tree produced by PpParser#stdev0.
    def enterStdev0(self, ctx:PpParser.Stdev0Context):
        pass

    # Exit a parse tree produced by PpParser#stdev0.
    def exitStdev0(self, ctx:PpParser.Stdev0Context):
        pass


    # Enter a parse tree produced by PpParser#variance.
    def enterVariance(self, ctx:PpParser.VarianceContext):
        pass

    # Exit a parse tree produced by PpParser#variance.
    def exitVariance(self, ctx:PpParser.VarianceContext):
        pass


    # Enter a parse tree produced by PpParser#beta0.
    def enterBeta0(self, ctx:PpParser.Beta0Context):
        pass

    # Exit a parse tree produced by PpParser#beta0.
    def exitBeta0(self, ctx:PpParser.Beta0Context):
        pass


    # Enter a parse tree produced by PpParser#dbeta0.
    def enterDbeta0(self, ctx:PpParser.Dbeta0Context):
        pass

    # Exit a parse tree produced by PpParser#dbeta0.
    def exitDbeta0(self, ctx:PpParser.Dbeta0Context):
        pass


    # Enter a parse tree produced by PpParser#cbeta0.
    def enterCbeta0(self, ctx:PpParser.Cbeta0Context):
        pass

    # Exit a parse tree produced by PpParser#cbeta0.
    def exitCbeta0(self, ctx:PpParser.Cbeta0Context):
        pass


    # Enter a parse tree produced by PpParser#rbeta0.
    def enterRbeta0(self, ctx:PpParser.Rbeta0Context):
        pass

    # Exit a parse tree produced by PpParser#rbeta0.
    def exitRbeta0(self, ctx:PpParser.Rbeta0Context):
        pass


    # Enter a parse tree produced by PpParser#binom0.
    def enterBinom0(self, ctx:PpParser.Binom0Context):
        pass

    # Exit a parse tree produced by PpParser#binom0.
    def exitBinom0(self, ctx:PpParser.Binom0Context):
        pass


    # Enter a parse tree produced by PpParser#dbinom0.
    def enterDbinom0(self, ctx:PpParser.Dbinom0Context):
        pass

    # Exit a parse tree produced by PpParser#dbinom0.
    def exitDbinom0(self, ctx:PpParser.Dbinom0Context):
        pass


    # Enter a parse tree produced by PpParser#cbinom0.
    def enterCbinom0(self, ctx:PpParser.Cbinom0Context):
        pass

    # Exit a parse tree produced by PpParser#cbinom0.
    def exitCbinom0(self, ctx:PpParser.Cbinom0Context):
        pass


    # Enter a parse tree produced by PpParser#rbinom0.
    def enterRbinom0(self, ctx:PpParser.Rbinom0Context):
        pass

    # Exit a parse tree produced by PpParser#rbinom0.
    def exitRbinom0(self, ctx:PpParser.Rbinom0Context):
        pass


    # Enter a parse tree produced by PpParser#exp0.
    def enterExp0(self, ctx:PpParser.Exp0Context):
        pass

    # Exit a parse tree produced by PpParser#exp0.
    def exitExp0(self, ctx:PpParser.Exp0Context):
        pass


    # Enter a parse tree produced by PpParser#dexp0.
    def enterDexp0(self, ctx:PpParser.Dexp0Context):
        pass

    # Exit a parse tree produced by PpParser#dexp0.
    def exitDexp0(self, ctx:PpParser.Dexp0Context):
        pass


    # Enter a parse tree produced by PpParser#cexp0.
    def enterCexp0(self, ctx:PpParser.Cexp0Context):
        pass

    # Exit a parse tree produced by PpParser#cexp0.
    def exitCexp0(self, ctx:PpParser.Cexp0Context):
        pass


    # Enter a parse tree produced by PpParser#rexp0.
    def enterRexp0(self, ctx:PpParser.Rexp0Context):
        pass

    # Exit a parse tree produced by PpParser#rexp0.
    def exitRexp0(self, ctx:PpParser.Rexp0Context):
        pass


    # Enter a parse tree produced by PpParser#gamma0.
    def enterGamma0(self, ctx:PpParser.Gamma0Context):
        pass

    # Exit a parse tree produced by PpParser#gamma0.
    def exitGamma0(self, ctx:PpParser.Gamma0Context):
        pass


    # Enter a parse tree produced by PpParser#dgamma0.
    def enterDgamma0(self, ctx:PpParser.Dgamma0Context):
        pass

    # Exit a parse tree produced by PpParser#dgamma0.
    def exitDgamma0(self, ctx:PpParser.Dgamma0Context):
        pass


    # Enter a parse tree produced by PpParser#cgamma0.
    def enterCgamma0(self, ctx:PpParser.Cgamma0Context):
        pass

    # Exit a parse tree produced by PpParser#cgamma0.
    def exitCgamma0(self, ctx:PpParser.Cgamma0Context):
        pass


    # Enter a parse tree produced by PpParser#rgamma0.
    def enterRgamma0(self, ctx:PpParser.Rgamma0Context):
        pass

    # Exit a parse tree produced by PpParser#rgamma0.
    def exitRgamma0(self, ctx:PpParser.Rgamma0Context):
        pass


    # Enter a parse tree produced by PpParser#geom0.
    def enterGeom0(self, ctx:PpParser.Geom0Context):
        pass

    # Exit a parse tree produced by PpParser#geom0.
    def exitGeom0(self, ctx:PpParser.Geom0Context):
        pass


    # Enter a parse tree produced by PpParser#dgeom0.
    def enterDgeom0(self, ctx:PpParser.Dgeom0Context):
        pass

    # Exit a parse tree produced by PpParser#dgeom0.
    def exitDgeom0(self, ctx:PpParser.Dgeom0Context):
        pass


    # Enter a parse tree produced by PpParser#cgeom0.
    def enterCgeom0(self, ctx:PpParser.Cgeom0Context):
        pass

    # Exit a parse tree produced by PpParser#cgeom0.
    def exitCgeom0(self, ctx:PpParser.Cgeom0Context):
        pass


    # Enter a parse tree produced by PpParser#rgeom0.
    def enterRgeom0(self, ctx:PpParser.Rgeom0Context):
        pass

    # Exit a parse tree produced by PpParser#rgeom0.
    def exitRgeom0(self, ctx:PpParser.Rgeom0Context):
        pass


    # Enter a parse tree produced by PpParser#norm0.
    def enterNorm0(self, ctx:PpParser.Norm0Context):
        pass

    # Exit a parse tree produced by PpParser#norm0.
    def exitNorm0(self, ctx:PpParser.Norm0Context):
        pass


    # Enter a parse tree produced by PpParser#dnorm0.
    def enterDnorm0(self, ctx:PpParser.Dnorm0Context):
        pass

    # Exit a parse tree produced by PpParser#dnorm0.
    def exitDnorm0(self, ctx:PpParser.Dnorm0Context):
        pass


    # Enter a parse tree produced by PpParser#cnorm0.
    def enterCnorm0(self, ctx:PpParser.Cnorm0Context):
        pass

    # Exit a parse tree produced by PpParser#cnorm0.
    def exitCnorm0(self, ctx:PpParser.Cnorm0Context):
        pass


    # Enter a parse tree produced by PpParser#rnorm0.
    def enterRnorm0(self, ctx:PpParser.Rnorm0Context):
        pass

    # Exit a parse tree produced by PpParser#rnorm0.
    def exitRnorm0(self, ctx:PpParser.Rnorm0Context):
        pass


    # Enter a parse tree produced by PpParser#pois0.
    def enterPois0(self, ctx:PpParser.Pois0Context):
        pass

    # Exit a parse tree produced by PpParser#pois0.
    def exitPois0(self, ctx:PpParser.Pois0Context):
        pass


    # Enter a parse tree produced by PpParser#dpois0.
    def enterDpois0(self, ctx:PpParser.Dpois0Context):
        pass

    # Exit a parse tree produced by PpParser#dpois0.
    def exitDpois0(self, ctx:PpParser.Dpois0Context):
        pass


    # Enter a parse tree produced by PpParser#cpois0.
    def enterCpois0(self, ctx:PpParser.Cpois0Context):
        pass

    # Exit a parse tree produced by PpParser#cpois0.
    def exitCpois0(self, ctx:PpParser.Cpois0Context):
        pass


    # Enter a parse tree produced by PpParser#rpois0.
    def enterRpois0(self, ctx:PpParser.Rpois0Context):
        pass

    # Exit a parse tree produced by PpParser#rpois0.
    def exitRpois0(self, ctx:PpParser.Rpois0Context):
        pass


    # Enter a parse tree produced by PpParser#unif0.
    def enterUnif0(self, ctx:PpParser.Unif0Context):
        pass

    # Exit a parse tree produced by PpParser#unif0.
    def exitUnif0(self, ctx:PpParser.Unif0Context):
        pass


    # Enter a parse tree produced by PpParser#dunif0.
    def enterDunif0(self, ctx:PpParser.Dunif0Context):
        pass

    # Exit a parse tree produced by PpParser#dunif0.
    def exitDunif0(self, ctx:PpParser.Dunif0Context):
        pass


    # Enter a parse tree produced by PpParser#cunif0.
    def enterCunif0(self, ctx:PpParser.Cunif0Context):
        pass

    # Exit a parse tree produced by PpParser#cunif0.
    def exitCunif0(self, ctx:PpParser.Cunif0Context):
        pass


    # Enter a parse tree produced by PpParser#runif0.
    def enterRunif0(self, ctx:PpParser.Runif0Context):
        pass

    # Exit a parse tree produced by PpParser#runif0.
    def exitRunif0(self, ctx:PpParser.Runif0Context):
        pass



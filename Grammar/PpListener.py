# Generated from Pp.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PpParser import PpParser
else:
    from PpParser import PpParser

from Quadruples import Quadruples
from SymbolsTable import BasicTypes, StructuredTypes, Type, Variable

GLOBAL_SCOPE = "program"

# This class defines a complete listener for a parse tree produced by PpParser.
class PpListener(ParseTreeListener):

    def __init__(self, symbols_table, semantic_cube, quadruples, obj):
        self.symbols_table = symbols_table
        self.semantic_cube = semantic_cube
        self.quadruples = [quadruples]
        self.obj = obj
        self.current_scope = GLOBAL_SCOPE
        self.current_type = None
        self.func_parameters = []
        self.func_name = None
        self.func_type = None
        self.block_reason = []
        self.param_index = []
        self.function_call_stack = []
        self.matrix_literal = []

    def get_type(self, ctx):
        basic_type = BasicTypes(ctx.basic_type0().getText())
        struct_type = StructuredTypes.NONE
        rows = None
        cols = None
        if ctx.getText().startswith("matrix"):
            struct_type = StructuredTypes.MATRIX
            rows = int(ctx.INT_NUMBER(0).getText())
            cols = int(ctx.INT_NUMBER(1).getText())
        return Type(basic_type, struct_type, rows, cols)
    
    # Enter a parse tree produced by PpParser#r.
    def enterR(self, ctx:PpParser.RContext):
        pass

    # Exit a parse tree produced by PpParser#r.
    def exitR(self, ctx:PpParser.RContext):
        self.quadruples[-1].add_quadruple("exit", None, None, None)
        self.obj.add_global_quadruples(self.quadruples[-1])
        self.obj.gen_obj_file(self.symbols_table)


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
            self.quadruples[-1].push_jump(self.quadruples[-1].get_quad_count())
            cond = self.quadruples[-1].pop_operand()
            self.quadruples[-1].pop_type()
            self.quadruples[-1].add_quadruple('gotof', cond, None, None)
        elif self.block_reason[-1] == 'elseif':
            self.quadruples[-1].push_jump(self.quadruples[-1].get_quad_count())
            cond = self.quadruples[-1].pop_operand()
            self.quadruples[-1].pop_type()
            self.quadruples[-1].add_quadruple('gotof', cond, None, None)
        elif self.block_reason[-1] == 'else':
            pass
        elif self.block_reason[-1] == 'while':
            self.quadruples[-1].push_jump(self.quadruples[-1].get_quad_count())
            cond = self.quadruples[-1].pop_operand()
            self.quadruples[-1].pop_type()
            self.quadruples[-1].add_quadruple('gotof', cond, None, None)

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
        self.func_type = self.get_type(ctx.type0())
        self.func_parameters = []
        self.quadruples.append(Quadruples())
    
    # Exit a parse tree produced by PpParser#function_decl0.
    def exitFunction_decl0(self, ctx:PpParser.Function_decl0Context):
        self.obj.add_function_quadruples(self.current_scope, self.quadruples[-1])
        self.symbols_table.set_function_memory(self.current_scope, self.quadruples[-1].temp_register_ptr)
        self.quadruples.pop()
        self.current_scope = GLOBAL_SCOPE
        


    # Enter a parse tree produced by PpParser#decl_block0.
    def enterDecl_block0(self, ctx:PpParser.Decl_block0Context):
        pass

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
        try:
            self.symbols_table.add_function(self.func_name, self.func_type, self.func_parameters)
        except Exception:
            print(f"Semantic error: Redefinition of function {self.func_name}"
                f"at {ctx.start.line}:{ctx.start.column}")
            exit()
        for param in self.func_parameters[::-1]:
            memory_dir = self.symbols_table.name_to_dir(param.name, self.current_scope)
            self.quadruples[-1].add_quadruple("=", "pop_param", None, memory_dir)


    # Enter a parse tree produced by PpParser#parameters0.
    def enterParameters0(self, ctx:PpParser.Parameters0Context):
        self.func_parameters.append(
            Variable(ctx.ID().getText(), self.get_type(ctx.type0()), self.current_scope)
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
        self.current_type = self.get_type(ctx.type0())
        try:
            self.symbols_table.add_variable(
                ctx.ID().getText(),
                self.current_type,
                self.current_scope,
            )
        except Exception:
            print(f"Semantic error: Redefinition of variable '{ctx.ID().getText()}' at "
                f"{ctx.start.line}:{ctx.start.column}")
            exit()

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
                self.current_type,
                self.current_scope
            )
        except Exception:
            print(f"Semantic error: Redefinition of variable '{ctx.ID().getText()}' at "
                    f"line {ctx.start.line}:{ctx.start.column}")
            exit()

    # Exit a parse tree produced by PpParser#variables_decl1.
    def exitVariables_decl1(self, ctx:PpParser.Variables_decl1Context):
        pass


    # Enter a parse tree produced by PpParser#assignment0.
    def enterAssignment0(self, ctx:PpParser.Assignment0Context):
        self.quadruples[-1].push_operator('=')


    # Exit a parse tree produced by PpParser#assignment0.
    def exitAssignment0(self, ctx:PpParser.Assignment0Context):
        right = self.quadruples[-1].pop_operand()
        t_right = self.quadruples[-1].pop_type()
        left = self.quadruples[-1].pop_operand()
        t_left = self.quadruples[-1].pop_type()
        operator = self.quadruples[-1].pop_operator()
        try:
            self.semantic_cube.get(t_left, t_right, operator)
            self.quadruples[-1].add_quadruple(
                operator,
                right,
                None,
                left,
            )
        except Exception:
            print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')
            exit()


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
            exit()
        self.function_call_stack.append(ctx.ID().getText())
        self.param_index.append(0);
        

    # Exit a parse tree produced by PpParser#function_call_aux0.
    def exitFunction_call_aux0(self, ctx:PpParser.Function_call_aux0Context):
        self.quadruples[-1].add_quadruple(
            "era",
            self.function_call_stack[-1],
            None,
            None,
        )
        self.quadruples[-1].add_quadruple("gosub", None, None, ctx.ID().getText())
        if self.symbols_table.get_return_type(self.function_call_stack[-1]).basic_type != BasicTypes.VOID:
            self.quadruples[-1].push_operand("retVal")
            self.quadruples[-1].push_type(self.symbols_table.get_return_type(self.function_call_stack[-1]))
        self.param_index.pop()
        self.function_call_stack.pop()


    # Enter a parse tree produced by PpParser#function_call_aux1.
    def enterFunction_call_aux1(self, ctx:PpParser.Function_call_aux1Context):
        pass

    # Exit a parse tree produced by PpParser#function_call_aux1.
    def exitFunction_call_aux1(self, ctx:PpParser.Function_call_aux1Context):
        if ctx.expression0() is not None:
            val = self.quadruples[-1].pop_operand()
            val_type = self.quadruples[-1].pop_type()
            param_type = self.symbols_table.get_function_param_type(
                self.function_call_stack[-1],
                self.param_index[-1]
                )
            self.param_index[-1] = self.param_index[-1] + 1
            try:
                self.semantic_cube.get(param_type, val_type, "=")
                self.quadruples[-1].add_quadruple("push_param", val, None, None)
            except Exception:
                print(f'Semantic error: Incompatible parameter type. Expected '
                      f'{param_type}, found {val_type} at {ctx.start.line}:{ctx.start.column}')
                exit()


    # Enter a parse tree produced by PpParser#function_call_aux2.
    def enterFunction_call_aux2(self, ctx:PpParser.Function_call_aux2Context):
        pass

    # Exit a parse tree produced by PpParser#function_call_aux2.
    def exitFunction_call_aux2(self, ctx:PpParser.Function_call_aux2Context):
        if ctx.expression0() is not None:
            val = self.quadruples[-1].pop_operand()
            val_type = self.quadruples[-1].pop_type()
            param_type = self.symbols_table.get_function_param_type(
                self.function_call_stack[-1],
                self.param_index[-1]
                )
            self.param_index[-1] = self.param_index[-1] + 1
            try:
                self.semantic_cube.get(param_type, val_type, "=")
                self.quadruples[-1].add_quadruple("push_param", val, None, None)
            except Exception:
                print(f'Semantic error: Incompatible parameter type. Expected '
                      f'{param_type}, found {val_type} at {ctx.start.line}:{ctx.start.column}')
                exit()


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
        quad = self.quadruples[-1].pop_jump()
        self.quadruples[-1].push_jump(self.quadruples[-1].get_quad_count())
        self.quadruples[-1].add_quadruple('goto', None, None, None)
        self.quadruples[-1].quadruples[quad].res = self.quadruples[-1].get_quad_count()

    # Exit a parse tree produced by PpParser#else0.
    def exitElse0(self, ctx:PpParser.Else0Context):
        quad = self.quadruples[-1].pop_jump()
        self.quadruples[-1].quadruples[quad].res = self.quadruples[-1].get_quad_count()
        self.block_reason.pop()


    # Enter a parse tree produced by PpParser#while0.
    def enterWhile0(self, ctx:PpParser.While0Context):
        self.block_reason.append('while')
        self.quadruples[-1].push_jump(self.quadruples[-1].get_quad_count())

    # Exit a parse tree produced by PpParser#while0.
    def exitWhile0(self, ctx:PpParser.While0Context):
        quad = self.quadruples[-1].pop_jump()
        begin = self.quadruples[-1].pop_jump()
        self.quadruples[-1].add_quadruple("goto", None, None, begin)
        self.quadruples[-1].quadruples[quad].res = self.quadruples[-1].get_quad_count()
        self.block_reason.pop()


    # Enter a parse tree produced by PpParser#io_statement0.
    def enterIo_statement0(self, ctx:PpParser.Io_statement0Context):
        pass

    # Exit a parse tree produced by PpParser#io_statement0.
    def exitIo_statement0(self, ctx:PpParser.Io_statement0Context):
        pass


    # Enter a parse tree produced by PpParser#input0.
    def enterInput0(self, ctx:PpParser.Input0Context):
        if not self.symbols_table.exists_variable(ctx.ID().getText(), self.current_scope):
            print(f"Semantic error: Use of undefined variable {ctx.ID().getText()}"
                f" at {ctx.start.line}:{ctx.start.column}")
            exit()
        memory_dir = self.symbols_table.name_to_dir(ctx.ID().getText(), self.current_scope)
        self.quadruples[-1].add_quadruple("read", None, None, memory_dir)

    # Exit a parse tree produced by PpParser#input0.
    def exitInput0(self, ctx:PpParser.Input0Context):
        pass
        

    # Enter a parse tree produced by PpParser#output0.
    def enterOutput0(self, ctx:PpParser.Output0Context):
        pass

    # Exit a parse tree produced by PpParser#output0.
    def exitOutput0(self, ctx:PpParser.Output0Context):
        val = self.quadruples[-1].pop_operand()
        self.quadruples[-1].pop_type()
        self.quadruples[-1].add_quadruple("write", None, None, val)

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
        val = self.quadruples[-1].pop_operand()
        val_type = self.quadruples[-1].pop_type()
        return_type = self.symbols_table.get_return_type(self.current_scope)
        try:
            self.semantic_cube.get(return_type, val_type, "=")
            self.quadruples[-1].add_quadruple("return", None, None, val)
        except Exception:
            print(f'Semantic error: Incompatible return type. Expected {return_type} '
                  f'got {val_type} at {ctx.start.line}:{ctx.start.column}')
            exit()
            
        


    # Enter a parse tree produced by PpParser#expression0.
    def enterExpression0(self, ctx:PpParser.Expression0Context):
        if ctx.STRING_LITERAL() is not None:
            string_lit = ctx.STRING_LITERAL().getText()
            string_type = Type(BasicTypes.STRING, StructuredTypes.NONE)

            if not self.symbols_table.exists_constant(string_lit):
                self.symbols_table.add_constant(string_lit, string_type)

            constant_address = self.symbols_table.constant_to_dir(string_lit)

            self.quadruples[-1].push_operand(constant_address)
            self.quadruples[-1].push_type(string_type)

    # Exit a parse tree produced by PpParser#expression0.
    def exitExpression0(self, ctx:PpParser.Expression0Context):
        pass


    # Enter a parse tree produced by PpParser#bool_exp0.
    def enterBool_exp0(self, ctx:PpParser.Bool_exp0Context):
        pass

    # Exit a parse tree produced by PpParser#bool_exp0.
    def exitBool_exp0(self, ctx:PpParser.Bool_exp0Context):
        pass

    def boolOp(self, ctx):
        if self.quadruples[-1].has_operator() and self.quadruples[-1].top_operator() in ['and', 'or']:
            right = self.quadruples[-1].pop_operand()
            t_right = self.quadruples[-1].pop_type()
            left = self.quadruples[-1].pop_operand()
            t_left = self.quadruples[-1].pop_type()
            operator = self.quadruples[-1].pop_operator()
            try:
                t_result = self.semantic_cube.get(t_left, t_right, operator)
                temp_register = self.quadruples[-1].new_temp_register(t_result)
                self.quadruples[-1].add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register,
                )
                self.quadruples[-1].push_operand(temp_register)
                self.quadruples[-1].push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')
                exit()

    # Enter a parse tree produced by PpParser#bool_exp1.
    def enterBool_exp1(self, ctx:PpParser.Bool_exp1Context):
        self.boolOp(ctx)
        if ctx.bool_op0() is not None:
            self.quadruples[-1].push_operator(ctx.bool_op0().getText())

    # Exit a parse tree produced by PpParser#bool_exp1.
    def exitBool_exp1(self, ctx:PpParser.Bool_exp1Context):
        self.boolOp(ctx)


    # Enter a parse tree produced by PpParser#bool_term0.
    def enterBool_term0(self, ctx:PpParser.Bool_term0Context):
        pass

    # Exit a parse tree produced by PpParser#bool_term0.
    def exitBool_term0(self, ctx:PpParser.Bool_term0Context):
        pass


    def relationalOp(self, ctx):
        if self.quadruples[-1].has_operator() and self.quadruples[-1].top_operator() in ['==', '!=', '>', '<', '>=', '<=']:
            right = self.quadruples[-1].pop_operand()
            t_right = self.quadruples[-1].pop_type()
            left = self.quadruples[-1].pop_operand()
            t_left = self.quadruples[-1].pop_type()
            operator = self.quadruples[-1].pop_operator()
            try:
                t_result = self.semantic_cube.get(t_left, t_right, operator)
                temp_register = self.quadruples[-1].new_temp_register(t_result)
                self.quadruples[-1].add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register,
                )
                self.quadruples[-1].push_operand(temp_register)
                self.quadruples[-1].push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')
                exit()

    # Enter a parse tree produced by PpParser#bool_term1.
    def enterBool_term1(self, ctx:PpParser.Bool_term1Context):
        self.relationalOp(ctx)
        if ctx.rel_op0() is not None:
            self.quadruples[-1].push_operator(ctx.rel_op0().getText())

    # Exit a parse tree produced by PpParser#bool_term1.
    def exitBool_term1(self, ctx:PpParser.Bool_term1Context):
        self.relationalOp(ctx)


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

    def additionSubtractionOp(self, ctx):
        if self.quadruples[-1].has_operator() and self.quadruples[-1].top_operator() in ['+', '-']:
            right = self.quadruples[-1].pop_operand()
            t_right = self.quadruples[-1].pop_type()
            left = self.quadruples[-1].pop_operand()
            t_left = self.quadruples[-1].pop_type()
            operator = self.quadruples[-1].pop_operator()
            try:
                t_result = self.semantic_cube.get(t_left, t_right, operator)
                temp_register = self.quadruples[-1].new_temp_register(t_result)
                self.quadruples[-1].add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register
                )
                self.quadruples[-1].push_operand(temp_register)
                self.quadruples[-1].push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')
                exit()

    # Enter a parse tree produced by PpParser#arithmetic_exp1.
    def enterArithmetic_exp1(self, ctx:PpParser.Arithmetic_exp1Context):
        self.additionSubtractionOp(ctx)
        if ctx.addition_subtraction0() is not None:
            self.quadruples[-1].push_operator(ctx.addition_subtraction0().getText())

    # Exit a parse tree produced by PpParser#arithmetic_exp1.
    def exitArithmetic_exp1(self, ctx:PpParser.Arithmetic_exp1Context):
        self.additionSubtractionOp(ctx)


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

    def multiplicationDivisionOp(self, ctx):
        if self.quadruples[-1].has_operator() and  self.quadruples[-1].top_operator() in ['*', '/', '%']:
            right = self.quadruples[-1].pop_operand()
            t_right = self.quadruples[-1].pop_type()
            left = self.quadruples[-1].pop_operand()
            t_left = self.quadruples[-1].pop_type()
            operator = self.quadruples[-1].pop_operator()
            try:
                t_result = self.semantic_cube.get(t_left, t_right, operator)
                temp_register = self.quadruples[-1].new_temp_register(t_result)
                self.quadruples[-1].add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register,
                )
                self.quadruples[-1].push_operand(temp_register)
                self.quadruples[-1].push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')
                exit()

    # Enter a parse tree produced by PpParser#arithmetic_factor1.
    def enterArithmetic_factor1(self, ctx:PpParser.Arithmetic_factor1Context):
        self.multiplicationDivisionOp(ctx)
        if ctx.multiplication_division0() is not None:
            self.quadruples[-1].push_operator(ctx.multiplication_division0().getText())   

    # Exit a parse tree produced by PpParser#arithmetic_factor1.
    def exitArithmetic_factor1(self, ctx:PpParser.Arithmetic_factor1Context):
        self.multiplicationDivisionOp(ctx)


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

    def exponentiationOp(self, ctx):
        if self.quadruples[-1].has_operator() and self.quadruples[-1].top_operator() == '^':
            right = self.quadruples[-1].pop_operand()
            t_right = self.quadruples[-1].pop_type()
            left = self.quadruples[-1].pop_operand()
            t_left = self.quadruples[-1].pop_type()
            operator = self.quadruples[-1].pop_operator()
            try:
                t_result = self.semantic_cube.get(t_left, t_right, operator)
                temp_register = self.quadruples[-1].new_temp_register(t_result)
                self.quadruples[-1].add_quadruple(
                    operator,
                    left,
                    right,
                    temp_register,
                )
                self.quadruples[-1].push_operand(temp_register)
                self.quadruples[-1].push_type(t_result)
            except Exception:
                print(f'Semantic error: Incompatible types on operation {t_left}{operator}{t_right} at {ctx.start.line}:{ctx.start.column}')
                exit()

    # Enter a parse tree produced by PpParser#arithmetic_term1.
    def enterArithmetic_term1(self, ctx:PpParser.Arithmetic_term1Context):
        self.exponentiationOp(ctx)
        if ctx.exponent0() is not None:
            self.quadruples[-1].push_operator('^')   



    # Exit a parse tree produced by PpParser#arithmetic_term1.
    def exitArithmetic_term1(self, ctx:PpParser.Arithmetic_term1Context):
        self.exponentiationOp(ctx)


    # Enter a parse tree produced by PpParser#exponent0.
    def enterExponent0(self, ctx:PpParser.Exponent0Context):
        pass

    # Exit a parse tree produced by PpParser#exponent0.
    def exitExponent0(self, ctx:PpParser.Exponent0Context):
        pass


    # Enter a parse tree produced by PpParser#numeric_term0.
    def enterNumeric_term0(self, ctx:PpParser.Numeric_term0Context):
        if ctx.bool_exp0() is not None:
            self.quadruples[-1].push_operator('(')
        if ctx.INT_NUMBER() is not None:
            int_num = ctx.INT_NUMBER().getText()
            int_type = Type(BasicTypes.INT, StructuredTypes.NONE)
            
            if not self.symbols_table.exists_constant(int_num):
                self.symbols_table.add_constant(int_num, int_type)

            constant_address = self.symbols_table.constant_to_dir(int_num)
            self.quadruples[-1].push_operand(constant_address)
            self.quadruples[-1].push_type(int_type)

        if ctx.FLOAT_NUMBER() is not None:
            float_num = ctx.FLOAT_NUMBER().getText()
            float_type = Type(BasicTypes.FLOAT, StructuredTypes.NONE)
            
            if not self.symbols_table.exists_constant(float_num):
                self.symbols_table.add_constant(float_num, float_type)

            constant_address = self.symbols_table.constant_to_dir(float_num)
            self.quadruples[-1].push_operand(constant_address)
            self.quadruples[-1].push_type(float_type)

        if ctx.BOOL_LITERAL() is not None:
            bool_lit = ctx.BOOL_LITERAL().getText()
            bool_type = Type(BasicTypes.BOOL, StructuredTypes.NONE)
            if not self.symbols_table.exists_constant(bool_lit):
                self.symbols_table.add_constant(bool_lit, bool_type)

            constant_address = self.symbols_table.constant_to_dir(bool_lit)

            self.quadruples[-1].push_operand(constant_address)
            self.quadruples[-1].push_type(bool_type)

    # Exit a parse tree produced by PpParser#numeric_term0.
    def exitNumeric_term0(self, ctx:PpParser.Numeric_term0Context):
        if ctx.bool_exp0() is not None:
            self.quadruples[-1].pop_operator()


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
            exit()
        memory_dir = self.symbols_table.name_to_dir(ctx.ID().getText(), self.current_scope)
        self.quadruples[-1].push_operand(memory_dir)
        self.quadruples[-1].push_type(self.symbols_table.get_type(memory_dir, self.current_scope))

    # Exit a parse tree produced by PpParser#value0.
    def exitValue0(self, ctx:PpParser.Value0Context):
        pass


    # Enter a parse tree produced by PpParser#value1.
    def enterValue1(self, ctx:PpParser.Value1Context):
        pass

    # Exit a parse tree produced by PpParser#value1.
    def exitValue1(self, ctx:PpParser.Value1Context):
        pass


    def generate_matrix_quads(self, ctx):
        self.matrix_literal = [arr[::-1] for arr in self.matrix_literal]
        rows = len(self.matrix_literal)
        cols = len(self.matrix_literal[0])
        basic_type = self.matrix_literal[0][0][1]
        for arr in self.matrix_literal:
            if cols != len(arr):
                print(f"Semantic error: Matrix literal has extranous dimensions "
                      f"at {ctx.start.line}:{ctx.start.column}")
                exit()
            for ptr, elem_type in arr:
                try:
                    basic_type = self.semantic_cube.get(basic_type, elem_type, "=")
                    if elem_type.basic_type == BasicTypes.FLOAT:
                        basic_type = Type(BasicTypes.FLOAT, StructuredTypes.NONE)
                except Exception:
                    print(f"Semantic error: Matrix literal has incompatible types "
                          f"at {ctx.start.line}:{ctx.start.column}")
                    exit()
        
        temp_type = Type(basic_type.basic_type, StructuredTypes.MATRIX, rows, cols)
        temp_mat = self.quadruples[-1].new_temp_register(temp_type)
        for i in range(rows):
            for j in range(cols):
                temp_mat_elem = self.quadruples[-1].new_temp_register(Type(basic_type.basic_type, StructuredTypes.NONE))
                self.quadruples[-1].add_quadruple(temp_mat, i, j, temp_mat_elem)
                self.quadruples[-1].add_quadruple("=", self.matrix_literal[i][j][0], None, temp_mat_elem)
        self.quadruples[-1].push_operand(temp_mat)
        self.quadruples[-1].push_type(temp_type)

    # Enter a parse tree produced by PpParser#matrix_literal0.
    def enterMatrix_literal0(self, ctx:PpParser.Matrix_literal0Context):
        self.matrix_literal = []

    # Exit a parse tree produced by PpParser#matrix_literal0.
    def exitMatrix_literal0(self, ctx:PpParser.Matrix_literal0Context):
        self.generate_matrix_quads(ctx)


    # Enter a parse tree produced by PpParser#matrix_literal1.
    def enterMatrix_literal1(self, ctx:PpParser.Matrix_literal1Context):
        if ctx.matrix_literal2():
            self.matrix_literal.append([])

    # Exit a parse tree produced by PpParser#matrix_literal1.
    def exitMatrix_literal1(self, ctx:PpParser.Matrix_literal1Context):
        pass


    # Enter a parse tree produced by PpParser#matrix_literal2.
    def enterMatrix_literal2(self, ctx:PpParser.Matrix_literal2Context):
        pass

    # Exit a parse tree produced by PpParser#matrix_literal2.
    def exitMatrix_literal2(self, ctx:PpParser.Matrix_literal2Context):
        if ctx.expression0():
            self.matrix_literal[-1].append(
                (
                    self.quadruples[-1].pop_operand(),
                    self.quadruples[-1].pop_type()
                )
            )


    # Enter a parse tree produced by PpParser#matrix_literal3.
    def enterMatrix_literal3(self, ctx:PpParser.Matrix_literal3Context):
        if ctx.matrix_literal2():
            self.matrix_literal.append([])

    # Exit a parse tree produced by PpParser#matrix_literal3.
    def exitMatrix_literal3(self, ctx:PpParser.Matrix_literal3Context):
        pass


    # Enter a parse tree produced by PpParser#matrix_literal4.
    def enterMatrix_literal4(self, ctx:PpParser.Matrix_literal4Context):
        pass

    # Exit a parse tree produced by PpParser#matrix_literal4.
    def exitMatrix_literal4(self, ctx:PpParser.Matrix_literal4Context):
        if ctx.expression0():
            self.matrix_literal[-1].append(
                (
                    self.quadruples[-1].pop_operand(),
                    self.quadruples[-1].pop_type()
                )
            )


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

    def stat_function_call(self, func_name, num_params, ret_type = BasicTypes.FLOAT):
        for _ in range(num_params):
            arg = self.quadruples[-1].pop_operand()
            self.quadruples[-1].pop_type()
            self.quadruples[-1].add_quadruple("push_param", arg, None, None)
        temp_register = self.quadruples[-1].new_temp_register(Type(ret_type, StructuredTypes.NONE))
        self.quadruples[-1].add_quadruple(
            "stat_func",
            func_name,
            num_params,
            temp_register
        )
        self.quadruples[-1].push_operand(temp_register)
        self.quadruples[-1].push_type(Type(ret_type, StructuredTypes.NONE))


    # Enter a parse tree produced by PpParser#dbeta0.
    def enterDbeta0(self, ctx:PpParser.Dbeta0Context):
        pass

    # Exit a parse tree produced by PpParser#dbeta0.
    def exitDbeta0(self, ctx:PpParser.Dbeta0Context):
        self.stat_function_call("dbeta", 3)


    # Enter a parse tree produced by PpParser#cbeta0.
    def enterCbeta0(self, ctx:PpParser.Cbeta0Context):
        pass

    # Exit a parse tree produced by PpParser#cbeta0.
    def exitCbeta0(self, ctx:PpParser.Cbeta0Context):
        self.stat_function_call("cbeta", 3)


    # Enter a parse tree produced by PpParser#rbeta0.
    def enterRbeta0(self, ctx:PpParser.Rbeta0Context):
        pass

    # Exit a parse tree produced by PpParser#rbeta0.
    def exitRbeta0(self, ctx:PpParser.Rbeta0Context):
        self.stat_function_call("rbeta", 2)


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
        self.stat_function_call("dbinom", 3)


    # Enter a parse tree produced by PpParser#cbinom0.
    def enterCbinom0(self, ctx:PpParser.Cbinom0Context):
        pass

    # Exit a parse tree produced by PpParser#cbinom0.
    def exitCbinom0(self, ctx:PpParser.Cbinom0Context):
        self.stat_function_call("cbinom", 3)


    # Enter a parse tree produced by PpParser#rbinom0.
    def enterRbinom0(self, ctx:PpParser.Rbinom0Context):
        pass

    # Exit a parse tree produced by PpParser#rbinom0.
    def exitRbinom0(self, ctx:PpParser.Rbinom0Context):
        self.stat_function_call("rbinom", 2, BasicTypes.INT)


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
        self.stat_function_call("dexp", 2)


    # Enter a parse tree produced by PpParser#cexp0.
    def enterCexp0(self, ctx:PpParser.Cexp0Context):
        pass

    # Exit a parse tree produced by PpParser#cexp0.
    def exitCexp0(self, ctx:PpParser.Cexp0Context):
        self.stat_function_call("cexp", 2)


    # Enter a parse tree produced by PpParser#rexp0.
    def enterRexp0(self, ctx:PpParser.Rexp0Context):
        pass

    # Exit a parse tree produced by PpParser#rexp0.
    def exitRexp0(self, ctx:PpParser.Rexp0Context):
        self.stat_function_call("rexp", 1)


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
        self.stat_function_call("dgamma", 3)


    # Enter a parse tree produced by PpParser#cgamma0.
    def enterCgamma0(self, ctx:PpParser.Cgamma0Context):
        pass

    # Exit a parse tree produced by PpParser#cgamma0.
    def exitCgamma0(self, ctx:PpParser.Cgamma0Context):
        self.stat_function_call("cgamma", 3)


    # Enter a parse tree produced by PpParser#rgamma0.
    def enterRgamma0(self, ctx:PpParser.Rgamma0Context):
        pass

    # Exit a parse tree produced by PpParser#rgamma0.
    def exitRgamma0(self, ctx:PpParser.Rgamma0Context):
        self.stat_function_call("rgamma", 2)


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
        self.stat_function_call("dgeom", 2)


    # Enter a parse tree produced by PpParser#cgeom0.
    def enterCgeom0(self, ctx:PpParser.Cgeom0Context):
        pass

    # Exit a parse tree produced by PpParser#cgeom0.
    def exitCgeom0(self, ctx:PpParser.Cgeom0Context):
        self.stat_function_call("cgeom", 2)


    # Enter a parse tree produced by PpParser#rgeom0.
    def enterRgeom0(self, ctx:PpParser.Rgeom0Context):
        pass

    # Exit a parse tree produced by PpParser#rgeom0.
    def exitRgeom0(self, ctx:PpParser.Rgeom0Context):
        self.stat_function_call("rgeom", 1, BasicTypes.INT)


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
        self.stat_function_call("dnorm", 3)


    # Enter a parse tree produced by PpParser#cnorm0.
    def enterCnorm0(self, ctx:PpParser.Cnorm0Context):
        pass

    # Exit a parse tree produced by PpParser#cnorm0.
    def exitCnorm0(self, ctx:PpParser.Cnorm0Context):
        self.stat_function_call("cnorm", 3)


    # Enter a parse tree produced by PpParser#rnorm0.
    def enterRnorm0(self, ctx:PpParser.Rnorm0Context):
        pass

    # Exit a parse tree produced by PpParser#rnorm0.
    def exitRnorm0(self, ctx:PpParser.Rnorm0Context):
        self.stat_function_call("rnorm", 2)


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
        self.stat_function_call("dpois", 2)


    # Enter a parse tree produced by PpParser#cpois0.
    def enterCpois0(self, ctx:PpParser.Cpois0Context):
        pass

    # Exit a parse tree produced by PpParser#cpois0.
    def exitCpois0(self, ctx:PpParser.Cpois0Context):
        self.stat_function_call("cpois", 2)


    # Enter a parse tree produced by PpParser#rpois0.
    def enterRpois0(self, ctx:PpParser.Rpois0Context):
        pass

    # Exit a parse tree produced by PpParser#rpois0.
    def exitRpois0(self, ctx:PpParser.Rpois0Context):
        self.stat_function_call("rpois", 1, BasicTypes.INT)


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
        self.stat_function_call("dunif", 3)


    # Enter a parse tree produced by PpParser#cunif0.
    def enterCunif0(self, ctx:PpParser.Cunif0Context):
        pass

    # Exit a parse tree produced by PpParser#cunif0.
    def exitCunif0(self, ctx:PpParser.Cunif0Context):
        self.stat_function_call("cunif", 3)


    # Enter a parse tree produced by PpParser#runif0.
    def enterRunif0(self, ctx:PpParser.Runif0Context):
        pass

    # Exit a parse tree produced by PpParser#runif0.
    def exitRunif0(self, ctx:PpParser.Runif0Context):
        self.stat_function_call("runif", 2)



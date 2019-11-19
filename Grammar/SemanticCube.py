from SymbolsTable import BasicTypes, StructuredTypes, Type

class SemanticCube:
    BOOL_OPERATORS = ['and', 'or', '==', '!=', '=']
    REL_OPERATORS = ['>', '<', '>=', '<=', '==', '!=']
    INT_FLOAT_OPERATORS = ['+', '-', '*', '^', '/', '=']
    INT_INT_OPERATORS = ['%']
    MATRIX_MATRIX_NUMBER_OPERATORS = ['+', '-', '*', '=']
    MATRIX_INT_OPERATORS = ['^']
    
    def __init__(self):
        self.cube = {}
        self._initialize_cube()
        for bool_op in self.BOOL_OPERATORS:
            self.cube[BasicTypes.BOOL][BasicTypes.BOOL][bool_op] = BasicTypes.BOOL

        for rel_op in self.REL_OPERATORS:
            self.cube[BasicTypes.INT][BasicTypes.INT][rel_op] = BasicTypes.BOOL
            self.cube[BasicTypes.INT][BasicTypes.FLOAT][rel_op] = BasicTypes.BOOL
            self.cube[BasicTypes.FLOAT][BasicTypes.INT][rel_op] = BasicTypes.BOOL
            self.cube[BasicTypes.FLOAT][BasicTypes.FLOAT][rel_op] = BasicTypes.BOOL
        
        for int_float_op in self.INT_FLOAT_OPERATORS:
            self.cube[BasicTypes.INT][BasicTypes.INT][int_float_op] = BasicTypes.INT
            self.cube[BasicTypes.INT][BasicTypes.FLOAT][int_float_op] = BasicTypes.FLOAT
            self.cube[BasicTypes.FLOAT][BasicTypes.INT][int_float_op] = BasicTypes.FLOAT
            self.cube[BasicTypes.FLOAT][BasicTypes.FLOAT][int_float_op] = BasicTypes.FLOAT
        # Overwrite division as it is float division
        self.cube[BasicTypes.INT][BasicTypes.INT]['/'] = BasicTypes.FLOAT
        
        for int_int_op in self.INT_INT_OPERATORS: 
            self.cube[BasicTypes.INT][BasicTypes.INT][int_int_op] = BasicTypes.INT

        for matrix_matrix_op in self.MATRIX_MATRIX_NUMBER_OPERATORS:
            self.cube[StructuredTypes.MATRIX][StructuredTypes.MATRIX][matrix_matrix_op] = StructuredTypes.MATRIX
            self.cube[StructuredTypes.MATRIX][BasicTypes.INT][matrix_matrix_op] = StructuredTypes.MATRIX
            self.cube[StructuredTypes.MATRIX][BasicTypes.FLOAT][matrix_matrix_op] = StructuredTypes.MATRIX
            self.cube[BasicTypes.INT][StructuredTypes.MATRIX][matrix_matrix_op] = StructuredTypes.MATRIX
            self.cube[BasicTypes.FLOAT][StructuredTypes.MATRIX][matrix_matrix_op] = StructuredTypes.MATRIX

        for matrix_int_op in self.MATRIX_INT_OPERATORS:
            self.cube[StructuredTypes.MATRIX][BasicTypes.INT][matrix_int_op] = StructuredTypes.MATRIX

    def _initialize_cube(self):
        supported_types = [BasicTypes.BOOL, BasicTypes.INT, BasicTypes.FLOAT, StructuredTypes.MATRIX]
        for t1 in supported_types:
            self.cube[t1] = {}
            for t2 in supported_types:
                self.cube[t1][t2] = {}

    def get(self, op1, op2, operand):
        if op1.struct_type == StructuredTypes.NONE and op2.struct_type == StructuredTypes.NONE:
            result_type = Type(
                self.cube[op1.basic_type][op2.basic_type][operand],
                StructuredTypes.NONE,
            )
            return result_type
        elif op1.struct_type == StructuredTypes.NONE:
            result_type = Type(
                self.cube[op1.basic_type][op2.basic_type][operand],
                self.cube[op1.basic_type][op2.struct_type][operand],
            )
            return result_type
        elif op2.struct_type ==StructuredTypes.NONE:
            result_type = Type(
                self.cube[op1.basic_type][op2.basic_type][operand],
                self.cube[op1.struct_type][op2.basic_type][operand],
            )
            return result_type
        else:
            result_type = Type(
                self.cube[op1.basic_type][op2.basic_type][operand],
                self.cube[op1.struct_type][op2.struct_type][operand],
            )
            return result_type




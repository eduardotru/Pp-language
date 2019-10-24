from SymbolsTable import BasicTypes

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
            self.cube['matrix']['matrix'][matrix_matrix_op] = 'matrix'
            self.cube['matrix'][BasicTypes.INT][matrix_matrix_op] = 'matrix'
            self.cube['matrix'][BasicTypes.FLOAT][matrix_matrix_op] = 'matrix'
            self.cube[BasicTypes.INT]['matrix'][matrix_matrix_op] = 'matrix'
            self.cube[BasicTypes.FLOAT]['matrix'][matrix_matrix_op] = 'matrix'

        for matrix_int_op in self.MATRIX_INT_OPERATORS:
            self.cube['matrix'][BasicTypes.INT][matrix_int_op] = 'matrix'

    def _initialize_cube(self):
        supported_types = [BasicTypes.BOOL, BasicTypes.INT, BasicTypes.FLOAT, 'matrix']
        for t1 in supported_types:
            self.cube[t1] = {}
            for t2 in supported_types:
                self.cube[t1][t2] = {}

    def get(self, op1, op2, operand):
        return self.cube[op1][op2][operand]



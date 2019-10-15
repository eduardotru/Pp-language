class SemanticCube:
    BOOL_OPERATORS = ['and', 'or', '==', '!=']
    REL_OPERATORS = ['>', '<', '>=', '<=', '==', '!=']
    INT_FLOAT_OPERATORS = ['+', '-', '*', '^', '/']
    INT_INT_OPERATORS = ['%']
    MATRIX_MATRIX_NUMBER_OPERATORS = ['+', '-', '*']
    MATRIX_INT_OPERATORS = ['^']
    
    def __init__(self):
        self.cube = {}
        self._initialize_cube()
        for bool_op in self.BOOL_OPERATORS:
            self.cube['bool']['bool'][bool_op] = 'bool'

        for rel_op in self.REL_OPERATORS:
            self.cube['int']['int'][rel_op] = 'bool'
            self.cube['int']['float'][rel_op] = 'bool'
            self.cube['float']['int'][rel_op] = 'bool'
            self.cube['float']['float'][rel_op] = 'bool'
        
        for int_float_op in self.INT_FLOAT_OPERATORS:
            self.cube['int']['int'][int_float_op] = 'int'
            self.cube['int']['float'][int_float_op] = 'float'
            self.cube['float']['int'][int_float_op] = 'float'
            self.cube['float']['float'][int_float_op] = 'float'
        # Overwrite division as it is float division
        self.cube['int']['int']['/'] = 'float'
        
        for int_int_op in self.INT_INT_OPERATORS: 
            self.cube['int']['int'][int_int_op] = 'int'

        for matrix_matrix_op in self.MATRIX_MATRIX_NUMBER_OPERATORS:
            self.cube['matrix']['matrix'][matrix_matrix_op] = 'matrix'
            self.cube['matrix']['int'][matrix_matrix_op] = 'matrix'
            self.cube['matrix']['float'][matrix_matrix_op] = 'matrix'
            self.cube['int']['matrix'][matrix_matrix_op] = 'matrix'
            self.cube['float']['matrix'][matrix_matrix_op] = 'matrix'

        for matrix_int_op in self.MATRIX_INT_OPERATORS:
            self.cube['matrix']['int'][matrix_int_op] = 'matrix'

    def _initialize_cube(self):
        supported_types = ['bool', 'int', 'float', 'matrix']
        for t1 in supported_types:
            self.cube[t1] = {}
            for t2 in supported_types:
                self.cube[t1][t2] = {}

    def get(self, op1, op2, operand):
        return self.cube[op1][op2][operand]



from Memory import Memory

class VirtualMachine:
    def __init__(self, filename):
        self.filename = filename
        self.quadruples = []
        self.globalMemory = None
        self.instructionPointer = [0]
        self.functionStack = []
        self.retVal = None
        self.paramStack = []
        self.parse_quadruples()

    def parse_quadruples(self):
        with open(self.filename, 'r') as f:
            for line in f.readlines():
                self.quadruples.append(line.split())


    def execute(self):
        for quadruple in self.quadruples:
            if (self.execute_quadruple(quadruple)):
                self.instructionPointer[-1] = self.instructionPointer[-1] + 1

    def execute_quadruple(self, quadruple):
        pass

"""
Possible instructions:
    Arithmetic:
        +
        -
        /
        %
        ^
        =
    Relational:
        >
        <
        >=
        <=
        ==
        !=
    Boolean:
        and
        or
        not
    I/O:
        read _ _ var
        write var _ _
        plot matrix matrix _
    Flow control:
        goto _ _ ptr
        gotof bool _ ptr
    Function control:
        push_param var _ _
        = pop_param _ var 
        return _ _ var
        era func _ _
        gosub address _ _
        end _ _ _
    Statistical:
        stat_func function num_params address_to_save
    Matrix:
        matrix_address index1 index2 temp_reference

"""

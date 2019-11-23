from Memory import Memory
from MemoryGenerator import MemoryGenerator

class VirtualMachine:
    def __init__(self, filename):
        self.filename = filename
        self.quadruples = []
        self.instructionPointer = [0]
        self.functionLocalStack = []
        self.functionTempStack = []
        self.retVal = None
        self.paramStack = []
        self.parse_quadruples()
        self.memory = MemoryGenerator.decode(self.filename + ".json")
        self.globalMemory = Memory(self.memory["program"]["locals"])
        self.globalTemps = Memory(self.memory["program"]["temps"])
        self.constants = Memory(self.memory["constants"]["repr"])
        for [addr, val] in self.memory["constants"]["vals"]:
            self.constants.set_value(addr, val)

    def parse_quadruples(self):
        with open(self.filename + ".ppo", 'r') as f:
            for line in f.readlines():
                self.quadruples.append(line.split())

    def expand_activation_record(self, func):
        self.functionLocalStack.append(Memory(self.memory["functions"][func]["locals"]))
        self.functionTempStack.append(Memory(self.memory["functions"][func]["temps"]))


    def execute(self):
        for [op, left, right, res] in self.quadruples:
            if (self.execute_quadruple(op, left, right, res)):
                self.instructionPointer[-1] = self.instructionPointer[-1] + 1

    def execute_quadruple(self, op, left, right, res):
        print(op, left, right, res)
        return True

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
        write _ _ var
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

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
        self.functionLocalStack.append(
            Memory(self.memory["functions"][func]["locals"]))
        self.functionTempStack.append(
            Memory(self.memory["functions"][func]["temps"]))

    def execute(self):
        for [op, left, right, res] in self.quadruples:
            if (self.execute_quadruple(op, left, right, res)):
                self.instructionPointer[-1] = self.instructionPointer[-1] + 1

    # Decode and return the memory object for a memory location

    def daro(self, mem):
        if mem > 100000:
            if mem > 120000:
                return self.functionTempStack[-1]
            else:
                return self.functionLocalStack[-1]
        else:
            if mem > 30000:
                return self.globalTemps
            elif mem > 20000:
                return self.constants
            else:
                return self.globalMemory

    # Decode and return. Returns the value in a memory direction

    def dar(self, mem):
        self.daro(mem).get_value(mem)

    # Decode and write. Writes a value in a memory direction
    def daw(self, val, mem):
        self.daro(mem).set_value(mem, val)

    def execute_quadruple(self, op, left, right, res):
        print(op, left, right, res)

        if op == "+":
            self.daw(left + right, res)
        elif op == "-":
            self.daw(left - right, res)
        elif op == "*":
            self.daw(left * right, res)
        elif op == "/":
            self.daw(left / right, res)
        elif op == "%":
            self.daw(left % right, res)
        elif op == "^":
            self.daw(left ** right, res)
        elif op == "=":
            self.daw(left, res)
        elif op == "read":
            self.daw(input(), res)
        elif op == "write":
            print(self.dar(res))
        return True


"""
Possible instructions:
    Arithmetic:
        + 
        -
        *
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

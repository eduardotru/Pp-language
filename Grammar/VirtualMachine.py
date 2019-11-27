import numpy as np
from scipy import stats

import matplotlib.pyplot as plt

from Memory import Memory
from MemoryGenerator import MemoryGenerator
from StatFunctions import StatFunctions


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
        self.matrices_calls = [{}]

    def parse_quadruples(self):
        try:
            with open(self.filename + ".ppo", 'r') as f:
                for line in f.readlines():
                    self.quadruples.append(line.split())
        except Exception:
            print(f"Error: File {self.filename}.ppo not found")
            exit()

    def expand_activation_record(self, func):
        self.functionLocalStack.append(
            Memory(self.memory["functions"][func]["locals"]))
        self.functionTempStack.append(
            Memory(self.memory["functions"][func]["temps"]))
        self.matrices_calls.append({})

    def execute(self):
        while True:
            [op, left, right, res] = self.quadruples[self.instructionPointer[-1]]
            if (self.execute_quadruple(op, left, right, res)):
                self.instructionPointer[-1] = self.instructionPointer[-1] + 1
            else:
                raise Exception("Execution error on quad #" +
                                str(self.instructionPointer[-1]))

    # Decode and return the memory object for a memory location

    def daro(self, mem):
        if mem >= 100000:
            if mem >= 120000:
                return self.functionTempStack[-1]
            else:
                return self.functionLocalStack[-1]
        else:
            if mem >= 30000:
                return self.globalTemps
            elif mem >= 20000:
                return self.constants
            else:
                return self.globalMemory

    # Decode and read. Returns the value in a memory direction
    def dar(self, mem):
        if mem == "pop_param":
            return self.paramStack.pop()
        elif mem == "retVal":
            return self.retVal
        else:
            mem = int(mem)
            if mem in self.matrices_calls[-1]:
                mat, i, j = self.matrices_calls[-1][mem]
                self.matrices_calls[-1].pop(mem)
                return mat[i][j]
            return self.daro(mem).get_value(mem)

    # Decode and write. Writes a value in a memory direction
    def daw(self, val, mem):
        mem = int(mem)
        if mem in self.matrices_calls[-1]:
            mat, i, j = self.matrices_calls[-1][mem]
            mat[i][j] = val
            self.matrices_calls[-1].pop(mem)
        else:
            self.daro(mem).set_value(mem, val)

    def execute_quadruple(self, op, left, right, res):
        # print(self.instructionPointer[-1], op, left, right, res)
        if op == "+":
            self.daw(self.dar(left) + self.dar(right), res)
        elif op == "-":
            self.daw(self.dar(left) - self.dar(right), res)
        elif op == "*":
            self.daw(np.dot(self.dar(left), self.dar(right)), res)
        elif op == "/":
            try:
                self.daw(self.dar(left) / self.dar(right), res)
            except Exception:
                print("Division by zero")
                exit()
        elif op == "%":
            self.daw(self.dar(left) % self.dar(right), res)
        elif op == "^":
            if isinstance(self.dar(left), np.ndarray):
                try:
                    self.daw(np.linalg.matrix_power(
                        self.dar(left), self.dar(right)), res)
                except Exception:
                    print("Matrix does not have inverse")
                    exit()
            else:
                self.daw(self.dar(left) ** self.dar(right), res)
        elif op == "=":
            if left == "pop_param":
                self.daw(self.paramStack.pop(), res)
            else:
                self.daw(self.dar(left), res)
        elif op == ">":
            self.daw(self.dar(left) > self.dar(right), res)
        elif op == "<":
            self.daw(self.dar(left) < self.dar(right), res)
        elif op == ">=":
            self.daw(self.dar(left) >= self.dar(right), res)
        elif op == "<=":
            self.daw(self.dar(left) <= self.dar(right), res)
        elif op == "==":
            self.daw(self.dar(left) == self.dar(right), res)
        elif op == "!=":
            self.daw(self.dar(left) != self.dar(right), res)
        elif op == "and":
            self.daw(self.dar(left) and self.dar(right), res)
        elif op == "or":
            self.daw(self.dar(left) or self.dar(right), res)
        elif op == "not":
            self.daw(not self.dar(left), res)
        elif op == "read":
            self.daw(input(), res)
        elif op == "write":
            print(self.dar(res))
        elif op == "goto":
            self.instructionPointer[-1] = int(res) - 1
        elif op == "gotof":
            if not self.dar(left):
                self.instructionPointer[-1] = int(res) - 1
        elif op == "push_param":
            self.paramStack.append(self.dar(left))
        elif op == "era":
            self.expand_activation_record(left)
        elif op == "gosub":
            self.instructionPointer.append(int(res) - 1)
        elif op == "return":
            self.retVal = self.dar(res)
            self.instructionPointer.pop()
            self.functionLocalStack.pop()
            self.functionTempStack.pop()
            self.matrices_calls.pop()
        elif op == "end":
            self.instructionPointer.pop()
            self.functionLocalStack.pop()
            self.functionTempStack.pop()
            self.matrices_calls.pop()
        elif op == "exit":
            exit()
        elif op == "ver":
            if self.dar(left) < int(right) or self.dar(left) >= int(res):
                print("Segmentation Fault")
                exit()
        elif op == "plot":
            x = self.dar(left)
            y = self.dar(right)
            fmt = self.dar(res)
            plt.plot(x.flatten(), y.flatten(), fmt)
        elif op == "hist":
            x = self.dar(left)
            plt.hist(x.flatten(), bins=30)
        elif op == "showplot":
            plt.show()
        elif op == "transpose":
            mat = self.dar(left)
            self.daw(np.transpose(mat), res)
        elif op == "mean":
            mat = self.dar(left)
            self.daw(np.mean(mat), res)
        elif op == "median":
            mat = self.dar(left)
            self.daw(np.median(mat), res)
        elif op == "mode":
            mat = self.dar(left)
            self.daw(stats.mode(mat, axis=None)[0][0], res)
        elif op == "stdev":
            mat = self.dar(left)
            self.daw(np.std(mat), res)
        elif op == "variance":
            mat = self.dar(left)
            self.daw(np.var(mat), res)
        elif op.isdigit():
            mat = self.dar(op)
            index1 = self.dar(left)
            index2 = self.dar(right)
            self.daw(mat[index1][index2], res)
            res = int(res)
            self.matrices_calls[-1][res] = (mat, index1, index2)
        elif op == "-u":
            self.daw(-self.dar(left), res)
        elif op == "stat_func":
            params = []
            for _ in range(int(right)):
                params.append(self.paramStack.pop())
            self.daw(StatFunctions.execute(left, params), res)
        else:
            return False
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
        plot matrix matrix fmt_string
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

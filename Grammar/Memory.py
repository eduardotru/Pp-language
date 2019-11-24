import numpy as np

from MemoryGenerator import MemoryRepresentation

class Memory:
    def __init__(self, memory_repr: MemoryRepresentation):
        self.memory_repr = memory_repr
        self.ints = [0 for _ in range(memory_repr.intRange[1] - memory_repr.intRange[0] + 1)]
        self.floats = [0.0 for _ in range(memory_repr.intRange[1] - memory_repr.intRange[0] + 1)]
        self.bools = [False for _ in range(memory_repr.intRange[1] - memory_repr.intRange[0] + 1)]
        self.strings = ["" for _ in range(memory_repr.intRange[1] - memory_repr.intRange[0] + 1)]
        self.matInts = [np.zeros((rows, cols), dtype=np.int64) for [rows, cols] in memory_repr.matInts]
        self.matFloats = [np.zeros((rows, cols), dtype=np.float64) for [rows, cols] in memory_repr.matFloats]
        self.matBools = [np.zeros((rows, cols), dtype=np.bool_) for [rows, cols] in memory_repr.matBools]
        self.matStrings = [ [ ["" for _ in range(cols)] for _ in range(rows) ] for [rows, cols] in memory_repr.matStrings]

    def get_value(self, address):
        if address >= self.memory_repr.intRange[0] and address <= self.memory_repr.intRange[1]:
            return self.ints[address - self.memory_repr.intRange[0]]
        elif address >= self.memory_repr.floatRange[0] and address <= self.memory_repr.floatRange[1]:
            return self.floats[address - self.memory_repr.floatRange[0]]
        elif address >= self.memory_repr.boolRange[0] and address <= self.memory_repr.boolRange[1]:
            return self.bools[address - self.memory_repr.boolRange[0]]
        elif address >= self.memory_repr.stringRange[0] and address <= self.memory_repr.stringRange[1]:
            return self.strings[address - self.memory_repr.stringRange[0]]
        elif address >= self.memory_repr.matIntRange[0] and address <= self.memory_repr.matIntRange[1]:
            return self.matInts[address - self.memory_repr.matIntRange[0]]
        elif address >= self.memory_repr.matFloatRange[0] and address <= self.memory_repr.matFloatRange[1]:
            return self.matFloats[address - self.memory_repr.matFloatRange[0]]
        elif address >= self.memory_repr.matBoolRange[0] and address <= self.memory_repr.matBoolRange[1]:
            return self.matBools[address - self.memory_repr.matBoolRange[0]]
        elif address >= self.memory_repr.matStringRange[0] and address <= self.memory_repr.matStringRange[1]:
            return self.matStrings[address - self.memory_repr.matStringRange[0]]

    def set_value(self, address, value):
        if address >= self.memory_repr.intRange[0] and address <= self.memory_repr.intRange[1]:
            self.ints[address - self.memory_repr.intRange[0]] = int(value)
        elif address >= self.memory_repr.floatRange[0] and address <= self.memory_repr.floatRange[1]:
            self.floats[address - self.memory_repr.floatRange[0]] = float(value)
        elif address >= self.memory_repr.boolRange[0] and address <= self.memory_repr.boolRange[1]:
            self.bools[address - self.memory_repr.boolRange[0]] = value if value not in ["true", "false"] else value == "true"
        elif address >= self.memory_repr.stringRange[0] and address <= self.memory_repr.stringRange[1]:
            self.strings[address - self.memory_repr.stringRange[0]] = str(value)
        elif address >= self.memory_repr.matIntRange[0] and address <= self.memory_repr.matIntRange[1]:
            self.matInts[address - self.memory_repr.matIntRange[0]] = np.copy(value)
        elif address >= self.memory_repr.matFloatRange[0] and address <= self.memory_repr.matFloatRange[1]:
            self.matFloats[address - self.memory_repr.matFloatRange[0]] = np.copy(value)
        elif address >= self.memory_repr.matBoolRange[0] and address <= self.memory_repr.matBoolRange[1]:
            self.matBools[address - self.memory_repr.matBoolRange[0]] = np.copy(value)
        elif address >= self.memory_repr.matStringRange[0] and address <= self.memory_repr.matStringRange[1]:
            self.matStrings[address - self.memory_repr.matStringRange[0]] = np.copy(value)
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
        pass

    def set_value(self, address, value):
        pass
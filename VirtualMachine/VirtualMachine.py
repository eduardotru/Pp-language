from Memory import Memory

class VirtualMachine:
    def __init__(self, filename):
        self.filename = filename
        self.quadruples = None
        self.globalMemory = None
        self.instructionPointer = 0
        self.functionStack = []
        self.retVal = None
        self.paramStack = []
        self.parseQuadruples()

    def parse_quadruples(self):
        with open(self.filename, 'r') as f:
            pass

    def execute(self):
        for quadruple in self.quadruples:
            if (self.execute_quadruple()):
                self.instructionPointer = self.instructionPointer + 1

    def execute_quadruple(self):
        pass
    
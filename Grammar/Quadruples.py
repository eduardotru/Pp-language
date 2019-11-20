from SymbolsTable import BasicTypes, StructuredTypes

class Quadruple:
    def __init__(self, op, left, right, res):
        self.op = op
        self.left = left
        self.right = right
        self.res = res


class Quadruples:
    def __init__(self, isFunc = True):
        self.poper = []
        self.pilao = []
        self.psaltos = []
        self.ptipos = []
        self.quadruples = []
        self.temp_register_ptr = 0

        padding = 0 if not isFunc else 100000
        
        self.tempInt = 30000 + padding
        self.tempFloat = 31000 + padding
        self.tempBool = 32000 + padding
        self.tempString = 33000 + padding
        self.matTempInt = 40000 + padding
        self.matTempFloat = 41000 + padding
        self.matTempBool = 42000 + padding
        self.matTempString = 43000 + padding

    def new_temp_register(self, register_type):
        ret = None
        if register_type.struct_type == StructuredTypes.MATRIX:
            if register_type.basic_type == BasicTypes.INT:
                ret = self.matTempInt
                self.matTempInt += 1
            elif register_type.basic_type == BasicTypes.FLOAT:
                ret = self.matTempFloat
                self.matTempFloat += 1
            elif register_type.basic_type == BasicTypes.BOOL:
                ret = self.matTempBool
                self.matTempBool += 1
            elif register_type.basic_type == BasicTypes.STRING:
                ret = self.matTempString
                self.matTempString += 1
        elif register_type.struct_type == StructuredTypes.NONE:
            if register_type.basic_type == BasicTypes.INT:
                ret = self.tempInt
                self.tempInt += 1
            elif register_type.basic_type == BasicTypes.FLOAT:
                ret = self.tempFloat
                self.tempFloat += 1
            elif register_type.basic_type == BasicTypes.BOOL:
                ret = self.tempBool
                self.tempBool += 1
            elif register_type.basic_type == BasicTypes.STRING:
                ret = self.tempString
                self.tempString += 1
        return ret

    def get_quad_count(self):
        return len(self.quadruples)

    def add_quadruple(self, op, left, right, res):
        self.quadruples.append(Quadruple(op, left, right, res))

    def has_operator(self):
        return len(self.poper) > 0

    def push_operator(self, o):
        self.poper.append(o)

    def pop_operator(self):
        if not self.has_operator():
            raise Exception("There are no elements left.")
        else:
            return self.poper.pop(-1)

    def top_operator(self):
        if not self.has_operator():
            raise Exception("There are no elements left.")
        else:
            return self.poper[-1]

    def has_operand(self):
        return len(self.pilao) > 0

    def push_operand(self, o):
        self.pilao.append(o)

    def pop_operand(self):
        if not self.has_operand():
            raise Exception("There are no elements left.")
        else:
            return self.pilao.pop(-1)

    def top_operand(self):
        if not self.has_operand():
            raise Exception("There are no elements left.")
        else:
            return self.pilao[-1]

    def has_jump(self):
        return len(self.psaltos) > 0

    def push_jump(self, j):
        self.psaltos.append(j)

    def pop_jump(self):
        if not self.has_jump():
            raise Exception("There are no elements left.")
        else:
            return self.psaltos.pop(-1)

    def top_jump(self):
        if not self.has_jump():
            raise Exception("There are no elements left.")
        else:
            return self.psaltos[-1]

    def has_type(self):
        return len(self.ptipos) > 0

    def push_type(self, t):
        self.ptipos.append(t)

    def pop_type(self):
        if not self.has_type():
            raise Exception("There are no elements left.")
        else:
            return self.ptipos.pop(-1)

    def top_type(self):
        if not self.has_type():
            raise Exception("There are no elements left.")
        else:
            return self.ptipos[-1]

    def __str__(self):
        ret = "==============================POPER======================================\n"
        ret += '[%s]' % ', '.join(map(str, self.poper)) + "\n\n"

        ret += "==============================PILAO======================================\n"
        ret += '[%s]' % ', '.join(map(str, self.pilao)) + "\n\n"

        ret += "==============================PSALTOS====================================\n"
        ret += '[%s]' % ', '.join(map(str, self.psaltos)) + "\n\n"

        ret += "==============================⁴QUADRUPLES⁴===============================\n"
        ret += "#\t\tOp\t\tLeft\t\tRight\t\tRes\n"
        for i in range(len(self.quadruples)):
            ret += str(i) + "\t\t" + str(self.quadruples[i].op) + "\t\t" + str(self.quadruples[i].left) + \
                "\t\t" + str(self.quadruples[i].right) + \
                "\t\t" + str(self.quadruples[i].res) + "\n"

        ret += "\n"

        ret += "=========================================================================\n"
        return ret

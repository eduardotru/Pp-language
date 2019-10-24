class Quadruple:
    def __init__(self, op, left, right, res):
        self.op = op
        self.left = left
        self.right = right
        self.res = res


class Quadruples:
    def __init__(self):
        self.poper = []
        self.pilao = []
        self.psaltos = []
        self.quadruples = []
        self.temp_register_ptr = 0

    def new_temp_register(self):
        ret = "t" + str(self.temp_register_ptr)
        self.temp_register_ptr = self.temp_register_ptr + 1
        return ret

    def get_quad_count(self):
        return len(self.quadruples)

    def add_quadruple(self, op, left, right, res):
        self.quadruples.append(Quadruple(op, left, right, res))

    def push_operator(self, o):
        self.poper.append(o)

    def pop_operator(self):
        if len(self.poper) <= 0:
            raise Exception("There are no elements left.")
        else:
            return self.poper.pop(-1)

    def top_operator(self):
        if len(self.poper) <= 0:
            raise Exception("There are no elements left.")
        else:
            return self.poper[-1]

    def push_operand(self, o):
        self.pilao.append(o)

    def pop_operand(self):
        if len(self.pilao) <= 0:
            raise Exception("There are no elements left.")
        else:
            return self.pilao.pop(-1)

    def top_operand(self):
        if len(self.pilao) <= 0:
            raise Exception("There are no elements left.")
        else:
            return self.pilao[-1]

    def push_jump(self, j):
        self.psaltos.append(j)

    def pop_jump(self):
        if len(self.psaltos) <= 0:
            raise Exception("There are no elements left.")
        else:
            return self.psaltos.pop(-1)

    def top_jump(self):
        if len(self.psaltos) <= 0:
            raise Exception("There are no elements left.")
        else:
            return self.psaltos[-1]

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
            ret += str(i) + "\t\t" + self.quadruples[i].op + "\t\t" + self.quadruples[i].left + \
                "\t\t" + self.quadruples[i].right + \
                "\t\t" + self.quadruples[i].res + "\n"

        ret += "\n"

        ret += "=========================================================================\n"
        return ret

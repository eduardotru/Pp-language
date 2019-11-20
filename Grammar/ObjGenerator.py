from Quadruples import Quadruple


class ObjGenerator:
    def __init__(self):
        self.functions = {}
        self.program = None
        self.instruction_ptr = 0

    def add_function_quadruples(self, name, quadruples):
        self.functions[name] = quadruples

    def add_global_quadruples(self, quadruples):
        self.program = quadruples

    def joinQuads(self, programQuads, symbols_table):
        ret = ""
        retQuads = []
        for quad in programQuads:
            retQuads.append(quad)
        funStarts = {}
        for key in self.functions:
            funStarts[key] = len(retQuads)
            for quad in self.functions[key].quadruples:
                retQuads.append(quad)

        for i in range(len(retQuads)):
            quad = retQuads[i]
            if quad.op == "gosub":
                ret += str(self.instruction_ptr) + "\t\t" + str(quad.op) + \
                    "\t\t\t" + "\t\t" + "\t\t" + \
                    str(funStarts[quad.res]) + "\n"
            else:
                ret += str(self.instruction_ptr) + "\t\t" + str(quad.op) + \
                    "\t\t" + str(quad.left) + "\t\t" + \
                    str(quad.right) + "\t\t" + str(quad.res) + "\n"
            self.instruction_ptr = self.instruction_ptr + 1

        return ret

    def gen_obj_file(self, symbols_table):
        print("==================QUADRUPLES by Pp==================")
        print("#\t\tOp\t\tLeft\t\tRight\t\tRes\n")
        print(self.joinQuads(self.program.quadruples, symbols_table))
        print("======================================")

class ObjGenerator:
    def __init__(self):
        self.functions = {}
        self.program = None
        self.instruction_ptr = 0

    def add_function_quadruples(self, name, quadruples):
        self.functions[name] = quadruples

    def add_global_quadruples(self, quadruples):
        self.program = quadruples

    def joinQuads(self, quads, symbols_table):
        ret = ""
        for i in range(len(quads)):
            quad = quads[i]
            if quad.op == "gosub":
                ret += self.joinQuads(
                    self.functions[quad.res].quadruples, symbols_table)
            else:
                ret += str(self.instruction_ptr) + "\t\t" + str(quad.op) + \
                    "\t\t" + str(quad.left) + "\t\t" + \
                    str(quad.right) + "\t\t" + str(quad.res)
                self.instruction_ptr = self.instruction_ptr + 1

        return ret

    def gen_obj_file(self, symbols_table):
        print("==================QUADRUPLES by Pp==================")
        print("#\t\tOp\t\tLeft\t\tRight\t\tRes\n")
        print(self.joinQuads(self.program.quadruples, symbols_table))
        print("======================================")

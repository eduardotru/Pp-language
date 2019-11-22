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
        origin = []
        for quad in programQuads:
            retQuads.append(quad)
            origin.append("program")
        funStarts = {"program": 0}

        for key in self.functions:
            funStarts[key] = len(retQuads)
            for quad in self.functions[key].quadruples:
                retQuads.append(quad)
                origin.append(key)

        for i in range(len(retQuads)):
            retQuads[i]
            if retQuads[i].op == "gosub":
                retQuads[i].res = funStarts[retQuads[i].res]
                
            elif retQuads[i].op == "goto" or retQuads[i].op == "gotof":
                retQuads[i].res += funStarts[origin[i]]

        return retQuads

    def gen_obj_file(self, symbols_table, filename):
        quads = self.joinQuads(self.program.quadruples, symbols_table)
        with open(filename + ".ppo", 'w') as obj:
            for quad in quads:
                if quad.left is None:
                    quad.left = 0
                if quad.right is None:
                    quad.right = 0
                if quad.res is None:
                    quad.res = 0

                obj.write(f'{quad.op} {quad.left} {quad.right} {quad.res}\n')

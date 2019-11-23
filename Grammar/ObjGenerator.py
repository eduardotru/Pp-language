from Quadruples import Quadruple
from MemoryGenerator import MemoryGenerator, MemoryRepresentation
from Memory import Memory

class ObjGenerator:
    def __init__(self):
        self.functions = {}
        self.program = None
        self.instruction_ptr = 0

    def add_function_quadruples(self, name, quadruples):
        self.functions[name] = quadruples

    def add_global_quadruples(self, quadruples):
        self.program = quadruples

    def joinQuads(self, programQuads):
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

    def gen_obj_file(self, filename):
        quads = self.joinQuads(self.program.quadruples)
        with open(filename + ".ppo", 'w') as obj:
            for quad in quads:
                if quad.left is None:
                    quad.left = 0
                if quad.right is None:
                    quad.right = 0
                if quad.res is None:
                    quad.res = 0

                obj.write(f'{quad.op} {quad.left} {quad.right} {quad.res}\n')

    def gen_mem_file(self, symbols_table, filename):
        mem = MemoryGenerator()
        for func_name, func in symbols_table.functions.items():
            if func_name == "program":
                continue
            quads = self.functions[func_name]
            mem.add_function(func_name, func.encode(), quads.encode_temp_memory())
        
        mem.add_globals(symbols_table.functions["program"].encode(), self.program.encode_temp_memory())
        mem.add_constants(
            symbols_table.constants.encode(),
            [
                [var.memory_dir, var.name]
                for var in sorted(symbols_table.constants.variables.values(), key=(lambda v: v.memory_dir))
            ]
        )
        mem.encode(filename + ".json")


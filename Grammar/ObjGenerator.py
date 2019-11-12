class ObjGenerator:
    def __init__(self):
        self.functions = {}
        self.program = None

    def add_function_quadruples(self, name, quadruples):
        self.functions[name] = quadruples

    def add_global_quadruples(self, quadruples):
        self.program = quadruples

    def gen_obj_file(self, symbols_table):
        for name, quad in self.functions.items():
            print(f"========={name}=========")
            print(quad)
        
        print(f"======================================")
        print(self.program)
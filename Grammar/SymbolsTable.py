from enum import Enum
from typing import List, Tuple


class BasicTypes(Enum):
    BOOL = "bool"
    STRING = "string"
    INT = "int"
    FLOAT = "float"
    VOID = "void"


class StructuredTypes(Enum):
    NONE = "none"
    MATRIX = "matrix"
    # Not yet supported
    # DATASET = "dataset"


class Type:
    def __init__(self, basic_type, struct_type, rows=None, cols=None):
        self.basic_type = basic_type
        self.struct_type = struct_type
        self.rows = rows
        self.cols = cols

    def __str__(self):
        struct_type_value = self.struct_type.value
        if struct_type_value == "none":
            struct_type_value = ""
        dims = "" if struct_type_value == "" else f"[{self.rows}][{self.cols}]"
        return f"{struct_type_value}<{self.basic_type.value}{dims}>"


class Function:
    def __init__(self, name, return_type, parameters, memory_dir):
        self.name = name
        self.return_type = return_type
        self.parameters = []
        self.variables = parameters
        self.memory_size = 0
        self.memory_dir = memory_dir


class Variable:
    def __init__(self, name, data_type, scope, memory_dir=0):
        self.name = name
        self.type = data_type
        self.scope = scope
        self.memory_dir = memory_dir


class SymbolsTable:
    def __init__(self):
        self.memory_pointer = 0
        self.dir_to_memory_dict = {}
        self.functions = {}
        self.add_function("program", BasicTypes.VOID, {})
        self.globVarInt = 0
        self.globVarFloat = 1000
        self.globVarBool = 2000
        self.globVarString = 3000
        self.globMatInt = 10000
        self.globMatFloat = 11000
        self.globMatBool = 12000
        self.globMatString = 13000
        self.constInt = 20000
        self.constFloat = 21000
        self.constBool = 22000
        self.constString = 23000

        # Just for reference, used in quadruples
        self.globTempInt = 30000
        self.globTempFloat = 31000
        self.globTempBool = 32000
        self.globTempString = 33000

        self.locVarInt = 100000
        self.locVarFloat = 101000
        self.locVarBool = 102000
        self.locVarSring = 103000
        self.locMatInt = 110000
        self.locMatFloat = 111000
        self.locMatBool = 112000
        self.locMatString = 113000

    def add_function(self, name, return_type, parameters):
        if name in self.functions:
            raise Exception("The function already exists.")
        else:
            self.functions[name] = Function(
                name, return_type, {}, self.memory_pointer)
            self.functions[name].parameters = parameters
            self.dir_to_memory_dict[self.memory_pointer] = name
            self.memory_pointer = self.memory_pointer + 1
            for parameter in parameters:
                self.add_variable(
                    parameter.name, parameter.type, name)

    def exists_function(self, name, parameters):
        if name in self.functions:
            return True
        return False

    def add_variable(self, name, data_type, scope):
        if scope not in self.functions:
            raise Exception("The scope does not exists.")
        if name in self.functions[scope].variables:
            raise Exception("The variable already exists in this scope.")
        else:
            if (data_type.basic_type == BasicTypes.INT):
                ptr = self.globVarInt
                self.globVarInt += 1
            else:
                ptr = 0
            var = Variable(name, data_type, scope, ptr)
            self.functions[scope].variables[name] = var
            self.dir_to_memory_dict[ptr] = name

    def exists_variable(self, name, scope):
        if name in self.functions[scope].variables or name in self.functions["program"].variables:
            return True
        return False

    def add_constant(self, value, type):
        pass

    def exists_constant(self, value):
        pass

    def constant_to_dir(self, value):
        pass

    def dir_to_name(self, memory_dir):
        if memory_dir >= self.memory_pointer:
            raise Exception("Memory direction empty.")
        elif memory_dir < 0:
            raise Exception("Memory direction invalid.")
        return self.dir_to_memory_dict[memory_dir]

    def name_to_dir(self, name, scope):
        if self.exists_variable(name, scope):
            if name in self.functions[scope].variables:
                return self.functions[scope].variables[name].memory_dir
            else:
                return self.functions["program"].variables[name].memory_dir
        else:
            raise Exception("Variable does not exist in this scope.")

    def get_type(self, memory_dir, scope):
        name = self.dir_to_name(memory_dir)
        if self.exists_variable(name, scope):
            if name in self.functions[scope].variables:
                return self.functions[scope].variables[name].type
            else:
                return self.functions["program"].variables[name].type
        else:
            raise Exception("Variable does not exist in this scope.")

    def get_return_type(self, name):
        return self.functions[name].return_type

    def get_function_param_type(self, name, index):
        print(self.functions[name].parameters)
        print(index)
        return self.functions[name].parameters[index].type

    def set_function_memory(self, name, temp_memory):
        self.functions[name].memory_size = temp_memory + \
            len(self.functions[name].variables)

    def get_function_memory(self, name):
        return self.functions[name].memory_size

    def __str__(self):
        ret = "===============SYMBOLS=TABLE===============\n"
        for i in self.functions:
            func = self.functions[i]
            ret += "-----> " + func.name + " : " + \
                str(func.return_type) + " @ " + str(func.memory_dir) + "\n"
            for j in self.functions[func.name].variables:
                variable = self.functions[func.name].variables[j]
                ret += "NAME: " + variable.name + "\n"
                ret += "TYPE: " + str(variable.type) + "\n\n"

            ret += "\n"

        ret += "===========================================\n"
        return ret

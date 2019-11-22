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

    def __repr__(self):
        return str(self)


class Function:
    def __init__(self, name, return_type, parameters):
        self.name = name
        self.return_type = return_type
        self.parameters = []
        self.variables = parameters
        self.memory_size = 0


class Variable:
    def __init__(self, name, data_type, scope, memory_dir=0):
        self.name = name
        self.type = data_type
        self.scope = scope
        self.memory_dir = memory_dir


class SymbolsTable:
    def __init__(self):
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
        self.globTempMatInt = 40000
        self.globTempMatFloat = 41000
        self.globTempMatBool = 42000
        self.globTempMatString = 43000

        self.locVarInt = 100000
        self.locVarFloat = 101000
        self.locVarBool = 102000
        self.locVarString = 103000
        self.locMatInt = 110000
        self.locMatFloat = 111000
        self.locMatBool = 112000
        self.locMatString = 113000

        # Just for reference, used in quadruples
        self.locTempInt = 130000
        self.locTempFloat = 131000
        self.locTempBool = 132000
        self.locTempString = 133000
        self.locTempMatInt = 140000
        self.locTempMatFloat = 141000
        self.locTempMatBool = 142000
        self.locTempMatString = 143000

        self.constants = Function("constants", BasicTypes.VOID, {})
        self.dir_to_memory_dict = {}
        self.functions = {}
        self.add_function("program", BasicTypes.VOID, {})

    def add_function(self, name, return_type, parameters):
        if name in self.functions:
            raise Exception("The function already exists.")
        else:
            self.functions[name] = Function(
                name, return_type, {})
            self.functions[name].parameters = parameters
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
            if scope == "program":
                if data_type.struct_type == StructuredTypes.NONE:
                    if data_type.basic_type == BasicTypes.INT:
                        ptr = self.globVarInt
                        self.globVarInt += 1
                    elif data_type.basic_type == BasicTypes.FLOAT:
                        ptr = self.globVarFloat
                        self.globVarFloat += 1
                    elif data_type.basic_type == BasicTypes.BOOL:
                        ptr = self.globVarBool
                        self.globVarBool += 1
                    elif data_type.basic_type == BasicTypes.STRING:
                        ptr = self.globVarString
                        self.globVarString += 1
                elif data_type.struct_type == StructuredTypes.MATRIX:
                    if data_type.basic_type == BasicTypes.INT:
                        ptr = self.globMatInt
                        self.globMatInt += 1
                    elif data_type.basic_type == BasicTypes.FLOAT:
                        ptr = self.globMatFloat
                        self.globMatFloat += 1
                    elif data_type.basic_type == BasicTypes.BOOL:
                        ptr = self.globMatBool
                        self.globMatBool += 1
                    elif data_type.basic_type == BasicTypes.STRING:
                        ptr = self.globMatString
                        self.globMatString += 1
            else:
                if data_type.struct_type == StructuredTypes.NONE:
                    if data_type.basic_type == BasicTypes.INT:
                        ptr = self.locVarInt
                        self.locVarInt += 1
                    elif data_type.basic_type == BasicTypes.FLOAT:
                        ptr = self.locVarFloat
                        self.locVarFloat += 1
                    elif data_type.basic_type == BasicTypes.BOOL:
                        ptr = self.locVarBool
                        self.locVarBool += 1
                    elif data_type.basic_type == BasicTypes.STRING:
                        ptr = self.locVarString
                        self.locVarString += 1
                elif data_type.struct_type == StructuredTypes.MATRIX:
                    if data_type.basic_type == BasicTypes.INT:
                        ptr = self.locMatInt
                        self.locMatInt += 1
                    elif data_type.basic_type == BasicTypes.FLOAT:
                        ptr = self.locMatFloat
                        self.locMatFloat += 1
                    elif data_type.basic_type == BasicTypes.BOOL:
                        ptr = self.locMatBool
                        self.locMatBool += 1
                    elif data_type.basic_type == BasicTypes.STRING:
                        ptr = self.locMatString
                        self.locMatString += 1
            var = Variable(name, data_type, scope, ptr)
            self.functions[scope].variables[name] = var
            self.dir_to_memory_dict[ptr] = name

    def exists_variable(self, name, scope):
        if name in self.functions[scope].variables or name in self.functions["program"].variables:
            return True
        return False

    def add_constant(self, value, data_type):
        if value in self.constants.variables:
            raise Exception("The contant already exists in this scope.")
        else:
            if data_type.basic_type == BasicTypes.INT:
                ptr = self.constInt
                self.constInt += 1
            elif data_type.basic_type == BasicTypes.FLOAT:
                ptr = self.constFloat
                self.constFloat += 1
            elif data_type.basic_type == BasicTypes.BOOL:
                ptr = self.constBool
                self.constBool += 1
            elif data_type.basic_type == BasicTypes.STRING:
                ptr = self.constString
                self.constString += 1

            var = Variable(value, data_type, "program", ptr)
            self.constants.variables[value] = var
            self.dir_to_memory_dict[ptr] = value

    def exists_constant(self, value):
        if value in self.constants.variables:
            return True
        else:
            return False

    def constant_to_dir(self, value):
        if self.exists_constant(value):
            return self.constants.variables[value].memory_dir

    def dir_to_name(self, memory_dir):
        return self.dir_to_memory_dict[memory_dir]

    def name_to_dir(self, name, scope):
        if self.exists_variable(name, scope):
            if name in self.functions[scope].variables:
                return self.functions[scope].variables[name].memory_dir
        else:
            raise Exception("Variable does not exist in this scope.")

    def get_type(self, memory_dir, scope):
        name = self.dir_to_name(memory_dir)
        if self.exists_variable(name, scope):
            if name in self.functions[scope].variables:
                return self.functions[scope].variables[name].type
        else:
            raise Exception("Variable does not exist in this scope.")

    def get_return_type(self, name):
        return self.functions[name].return_type

    def get_function_param_type(self, name, index):
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
                str(func.return_type) + "\n"
            for j in self.functions[func.name].variables:
                variable = self.functions[func.name].variables[j]
                ret += "NAME: " + variable.name + "\n"
                ret += "TYPE: " + str(variable.type) + "\n\n"

            ret += "\n"

        ret += "===========================================\n"
        return ret

from enum import Enum
from typing import List, Tuple


class BasicTypes(Enum):
    BOOL = "bool"
    STRING = "string"
    INT = "int"
    FLOAT = "float"
    VOID = "void"


class Function:
    def __init__(self, name, return_type, parameters):
        self.name = name
        self.return_type = return_type
        self.variables = parameters


class Variable:
    def __init__(self, name, data_type, scope):
        self.name = name
        self.type = data_type
        self.scope = scope


class SymbolsTable:
    def __init__(self):
        self.functions = {}
        self.add_function("program", BasicTypes.VOID, {})

    def add_function(self, name, return_type, parameters):
        if name in self.functions:
            raise Exception("The function already exists.")
        else:
            self.functions[name] = Function(
                name, return_type, {})
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
            self.functions[scope].variables[name] = Variable(
                name, data_type, scope)

    def exists_variable(self, name, scope):
        if name in self.functions[scope].variables or name in self.functions["program"].variables:
            return True
        return False

    def __str__(self):
        ret = "===============SYMBOLS=TABLE===============\n"
        for i in self.functions:
            func = self.functions[i]
            ret += "-----> " + func.name + " : " + func.return_type.value + "\n"
            for j in self.functions[func.name].variables:
                variable = self.functions[func.name].variables[j]
                ret += "NAME: " + variable.name + "\n"
                ret += "TYPE: " + variable.type.value + "\n\n"

            ret += "\n"

        ret += "===========================================\n"
        return ret

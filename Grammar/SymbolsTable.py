from enum import Enum
from typing import List, Tuple


class BasicTypes(Enum):
    BOOL = "bool"
    STRING = "string"
    INT = "int"
    FLOAT = "float"


class Function:
    def __init__(self, name, return_type, parameters):
        self.name = name
        self.return_type = return_type
        self.parameters = parameters


class Variable:
    def __init__(self, name, data_type, scope):
        self.name = name
        self.type = data_type
        self.scope = scope


class SymbolsTable:
    def __init__(self):
        self.functions = {}
        self.variables = {}

    def add_function(self, name, return_type, parameters):
        if name in self.functions:
            raise Exception("The function already exists.")
        else:
            self.functions.update(name, Function(
                name, return_type, parameters))

    def exists_function(self, name, parameters):
        if name in self.functions:
            return True
        return False

    def add_variable(self, name, data_type, scope):
        if name in self.variables:
            raise Exception("The variable already exists.")
        else:
            self.variables.update(name, data_type, scope)

    def exists_variable(self, name, scope):
        if name in self.variables:
            return True
        return False

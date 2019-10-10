from enum import Enum
from typing import List, Tuple

class BasicTypes(Enum):
    BOOL = "bool"
    STRING = "string"
    INT = "int"
    FLOAT = "float"

class SymbolsTable:
    def __init__(self):
        pass

    def add_function(self, name, return_type, parameters):
        pass

    def exists_function(self, name, parameters):
        pass

    def add_variable(self, name, type, scope):
        pass

    def exists_variable(self, name, scope):
        pass
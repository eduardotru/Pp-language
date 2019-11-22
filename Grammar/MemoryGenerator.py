import json

class MemoryRepresentation:
    def __init__(
        self,
        intRange,
        floatRange,
        boolRange,
        stringRange,
        matIntRange,
        matFloatRange,
        matBoolRange,
        matStringRange
    ):
        self.intRange = intRange
        self.floatRange = floatRange
        self.boolRange = boolRange
        self.stringRange = stringRange
        self.matIntRange = matIntRange
        self.matFloatRange = matFloatRange
        self.matBoolRange = matBoolRange
        self.matStringRange = matStringRange


class MemoryGenerator:
    def __init__(self):
        self.content = {
            "functions": {},
            "constants": {
                "repr": None,
                "vals": None,
            },
            "program": None
        }

    def add_function(self, name, memory_repr, temp_repr):
        self.content["functions"][name] = {
            "locals": memory_repr.__dict__,
            "temps": temp_repr.__dict__
        }

    def add_globals(self, memory_repr, temp_repr):
        self.content["program"] = {
            "locals": memory_repr.__dict__,
            "temps": temp_repr.__dict__
        }

    def add_contants(self, memory_repr, memory_vals):
        self.content["constants"]["repr"] = memory_repr.__dict__
        self.content["constants"]["vals"] = memory_vals.__dict__

    def encode(self, filename):
        with open(filename, 'w') as f:
            json.dump(self.content, f)

    def decode(self, filename):
        with open(filename, 'r') as f:
            self.content = json.load(f)

    

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
        matStringRange,
        matInts,
        matFloats,
        matBools,
        matStrings
    ):
        self.intRange = intRange
        self.floatRange = floatRange
        self.boolRange = boolRange
        self.stringRange = stringRange
        self.matIntRange = matIntRange
        self.matFloatRange = matFloatRange
        self.matBoolRange = matBoolRange
        self.matStringRange = matStringRange
        self.matInts = matInts
        self.matFloats = matFloats
        self.matBools = matBools
        self.matStrings = matStrings


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

    def add_constants(self, memory_repr, memory_vals):
        self.content["constants"]["repr"] = memory_repr.__dict__
        self.content["constants"]["vals"] = memory_vals

    def encode(self, filename):
        with open(filename, 'w') as f:
            json.dump(self.content, f)

    @staticmethod
    def decode(filename):
        try:
            with open(filename, 'r') as f:
                content = json.load(f)
        except:
            print(f"Error: File {filename} not found or not a JSON")
            exit()
        for func in content["functions"].keys():
            content["functions"][func]["locals"] = MemoryRepresentation(**content["functions"][func]["locals"])
            content["functions"][func]["temps"] = MemoryRepresentation(**content["functions"][func]["temps"])
        
        content["program"]["locals"] = MemoryRepresentation(**content["program"]["locals"])
        content["program"]["temps"] = MemoryRepresentation(**content["program"]["temps"])

        content["constants"]["repr"] = MemoryRepresentation(**content["constants"]["repr"])

        return content

        


    

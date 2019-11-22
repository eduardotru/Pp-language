class Memory:
    def __init__(self, ints = 0, floats = 0):
        self.ints = [0 for _ range(ints)]
        self.floats = [0.0 for _ range(floats)]
        # And this for all data types
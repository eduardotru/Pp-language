class Memory:
    def __init__(self, ints = 0, floats = 0):
        self.ints = [0 for _ in range(ints)]
        self.floats = [0.0 for _ in range(floats)]
        # And this for all data types
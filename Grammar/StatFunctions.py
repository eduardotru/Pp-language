import numpy as np
from scipy import stats

import matplotlib.pyplot as plt


class StatFunctions:
    name_map = {"beta": stats.beta,
                "binom": stats.binom,
                "exp": stats.expon,
                "gamma": stats.gamma,
                "geom": stats.geom,
                "norm": stats.norm,
                "unif": stats.uniform}

    @classmethod
    def execute(cls, name, params):
        func_type = name[0]
        name = cls.name_map[name[1:]]
        if func_type == 'd':
            return name.pdf(*params)
        elif func_type == 'c':
            return name.cdf(*params)
        elif func_type == 'r':
            return name.rvs(*params)

#! /usr/bin/python3

import sys
from antlr4 import *
from PpLexer import PpLexer
from PpParser import PpParser
from PpListener import PpListener
from SymbolsTable import SymbolsTable
from SemanticCube import SemanticCube

pp_file = FileStream(sys.argv[1])
lexer = PpLexer(pp_file)
stream = CommonTokenStream(lexer)
parser = PpParser(stream)
tree = parser.r()
listener = PpListener(SymbolsTable(), SemanticCube())
walker = ParseTreeWalker()
walker.walk(listener, tree)

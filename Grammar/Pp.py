#! /usr/bin/python3

import sys
from pathlib import Path

from antlr4 import *
from PpLexer import PpLexer
from PpParser import PpParser
from PpListener import PpListener
from SymbolsTable import SymbolsTable
from SemanticCube import SemanticCube
from Quadruples import Quadruples
from ObjGenerator import ObjGenerator

if len(sys.argv) < 2:
    print("You must provide the file you want to compile")
    exit()
try:
    pp_file = FileStream(sys.argv[1])
except Exception:
    print(f"Could not read {sys.argv[1]}")
    exit()
lexer = PpLexer(pp_file)
stream = CommonTokenStream(lexer)
parser = PpParser(stream)
tree = parser.r()
if parser.getNumberOfSyntaxErrors() > 0:
    print("Compilation ended due to syntax errors")
    exit()
listener = PpListener(SymbolsTable(), SemanticCube(),
                      Quadruples(isFunc=False), ObjGenerator(), Path(sys.argv[1]).stem)
walker = ParseTreeWalker()
walker.walk(listener, tree)

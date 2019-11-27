import sys

from VirtualMachine import VirtualMachine

if len(sys.argv) < 2:
    print("You must specify the name of the program you want to run")
    exit()

vm = VirtualMachine(sys.argv[1])
vm.execute()

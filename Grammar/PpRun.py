import sys

from VirtualMachine import VirtualMachine

vm = VirtualMachine(sys.argv[1])
vm.execute()
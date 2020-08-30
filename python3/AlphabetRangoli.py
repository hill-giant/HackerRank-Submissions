import string

def print_rangoli(size):
    a = string.ascii_lowercase
    for i in range(size):
        s = "".join(("".join(reversed(a[size-i:size])),a[size-1-i:size]))
        print("-".join(s).center(size*4-3,'-'))
    for i in range(size-2,-1,-1):
        s = "".join(("".join(reversed(a[size-i:size])),a[size-1-i:size]))
        print("-".join(s).center(size*4-3,'-'))


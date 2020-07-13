import re

def swap_case(s):
    t = ""
    for c in s:
        if re.match(r'[a-z]',str(c)):
            t = t + chr(ord(c) - 32)
        elif re.match(r'[A-Z]',str(c)):
            t = t + chr(ord(c) + 32)
        else:
            t = t + c
    return t



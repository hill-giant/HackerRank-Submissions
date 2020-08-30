
# Complete the solve function below.
def solve(s):
    return re.sub("(^|\s)(\S)", lambda m: "".join((m.group(1),m.group(2).upper())), s)



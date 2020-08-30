import re

if __name__ == '__main__':
    s = input()
    print(len(re.findall("[a-zA-Z0-9]",s)) > 0)
    print(len(re.findall("[a-zA-Z]",s)) > 0)
    print(len(re.findall("[0-9]",s)) > 0)
    print(len(re.findall("[a-z]",s)) > 0)
    print(len(re.findall("[A-Z]",s)) > 0)


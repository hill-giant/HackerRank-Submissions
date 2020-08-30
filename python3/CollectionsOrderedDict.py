from collections import OrderedDict
import re

if __name__ == "__main__":
    n = int(input())
    d = OrderedDict()
    for i in range(n):
        s = input()
        k = re.match(r'[A-Z ]+', s).group().strip()
        d[k] = (0 if d.get(k) is None else d[k]) + int(re.search(r'\d+',s).group())
    print("\n".join([f'{k} {v}' for k, v in d.items()]))


from collections import defaultdict

if __name__ == "__main__":
    n, m = map(int,input().split())
    nd = defaultdict(list)
    for i in range(n):
        w = input()
        nd[w].append(i+1)
    for i in range(m):
        w = input()
        print(" ".join(map(str, nd.setdefault(w, [-1]))))


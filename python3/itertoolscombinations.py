import itertools
if __name__ == "__main__":
    w,n = input().split()
    for i in range(1,int(n)+1,1):
        for j in itertools.combinations(sorted(w),i):
            print("".join(j))


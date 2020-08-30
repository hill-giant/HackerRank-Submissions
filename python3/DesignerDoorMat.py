if __name__ == "__main__":
    n,m = map(int, input().split())
    for i in range(int(n/2)):
        print((".|."*(i*2 + 1)).center(m, "-"))
    print("WELCOME".center(m, "-"))
    for i in range(int(n/2)):
        print((".|."*(n - ((i+1)*2))).center(m, "-"))


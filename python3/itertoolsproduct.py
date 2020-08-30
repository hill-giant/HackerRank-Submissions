import itertools

if __name__ == "__main__":
    a = tuple(map(int,input().split()))
    b = tuple(map(int,input().split()))
    for i in itertools.product(a,b):
        print(i, end=" ")


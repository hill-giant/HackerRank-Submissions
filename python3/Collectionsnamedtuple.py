if __name__ == "__main__":
    n, m = int(input()), input().split().index("MARKS")
    print(sum([int(input().split()[m])/n for i in range(n)]))


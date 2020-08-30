import itertools
if __name__ == '__main__':
    word, n = input().split()
    for i in itertools.permutations(sorted(word),int(n)):
        print("".join(i))


from collections import Counter

if __name__ == "__main__":
    stock = int(input())
    shoes = Counter(map(int, input().split()))
    sales = int(input())
    profit = 0
    for i in range(sales):
        size, price = map(int, input().split())
        if shoes[size] > 0:
            shoes[size] -= 1
            profit += price
    print(profit)


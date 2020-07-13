import sys

def get_runner_up(arr):
    arr = list(arr)
    runner_up = min(arr)
    for i in arr:
        if i < max(arr) and i > runner_up:
            runner_up = i
    return runner_up

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    print(get_runner_up(arr))

import sys

def get_runner_up(arr):
    arr = list(arr)
    runner_up = min(arr)
    for i in arr:
        if i < max(arr) and i > runner_up:
            runner_up = i
    return runner_up

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    print(get_runner_up(arr))


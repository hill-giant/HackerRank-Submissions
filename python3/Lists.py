def insert_at_index(index, number, numbers):
    numbers.insert(int(index), int(number))

def print_list(numbers):
    print(numbers)

def remove_num(number, numbers):
    numbers.remove(int(number))

def append_num(number, numbers):
    numbers.append(int(number))

def sort_list(numbers):
    numbers.sort()

def pop_num(numbers):
    numbers.pop()

def reverse_list(numbers):
    numbers.reverse()

if __name__ == '__main__':
    switch = {
        'insert': insert_at_index,
        'print': print_list,
        'remove': remove_num,
        'append': append_num,
        'sort': sort_list,
        'pop': pop_num,
        'reverse': reverse_list
    }
    n = int(input())
    numbers = []
    for i in range(n):
        command = input().split()
        if len(command) == 1:
            switch[command[0]](numbers)
        elif len(command) == 2:
            switch[command[0]](command[1],numbers)
        elif len(command) == 3:
            switch[command[0]](command[1],command[2],numbers)



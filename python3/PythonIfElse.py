#!/bin/python3

N = int(input())

if N % 2 != 0 or N >= 6 and N <= 20:
    print("Weird")
else:
    print ("Not Weird")
#!/bin/python3

N = int(input())

print('Weird' if N % 2 != 0 or N >= 6 and N <= 20 else 'Not Weird')

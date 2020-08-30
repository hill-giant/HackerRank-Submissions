def print_formatted(number):
    l = len(bin(number)[2:])
    for i in range(number):
        n = i + 1
        o = str(oct(n)[2:]).rjust(1 + l, ' ')
        h = str(hex(n)[2:]).rjust(1 + l, ' ').upper()
        b = str(bin(n)[2:]).rjust(1 + l, ' ')
        print(f"{str(n).rjust(l, ' ')}{o}{h}{b}")



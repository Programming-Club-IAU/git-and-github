def print_staircase(n):
    for i in range(1, n + 1):
        print(' ' * (n - i) + '#' * i, end='')
        print('  ', end='')
        print('#' * i)

n = int(input("Enter the size of the staircase: "))
print_staircase(n)


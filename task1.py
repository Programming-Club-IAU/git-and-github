def print_staircase(n):
    for i in range(1, n + 1):
        # Print the left side of the staircase
        print(' ' * (n - i) + '#' * i, end='')
        
        # Print the space between the sides
        print('  ', end='')
        
        # Print the right side of the staircase
        print('#' * i)

# Ask the user for the size of the staircase
n = int(input("Enter the size of the staircase: "))

# Call the function to print the staircase
print_staircase(n)

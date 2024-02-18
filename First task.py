def print_staircase(size):
    for i in range(1,size+1):
        spaces=" "*(size-i)
        left_side="*"*i
        right_side="*"*i
        print(spaces+left_side+" "+right_side+spaces)
size=int(input("Enter the size of the staircase:"))

print_staircase(size)
def print_staircase(size):
    for i in range(1, size + 1):
        print(' ' * (size - i) + '*' * i)

def print_Mirror(size):
    for j in range(1,size+1):
        print(' ' * (size - j) + '*' * j + ' ' + '*' * j)

def main():
    size = int(input("Enter the size of the staircase: "))
    print("for staircase : ")
    print_staircase(size)
    print("for mirror : ")
    print_Mirror(size)

if __name__ == "__main__":
    main()

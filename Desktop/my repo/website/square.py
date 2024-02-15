
def staircase(size):
    space=size -1
    for i in range(1,size+1):
        
            print(space*" ","*"*(i), "*"*(i) )
            space= space-1

size=int(input("Enter the number of rows: "))

staircase(size)
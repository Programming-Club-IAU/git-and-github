
def staircase(size):
    space=size -1
    for i in range(1,size+1):
        
            print(space*" ","*"*(i), "*"*(i) )
            space= space-1

size=int(input("Enter the number of rows:"))

if (size < 0):
    print ("you enter a negtive number try again with postive number to print stars ")
elif (size == 0):
    print("hahaha i pass the tast my program will not crashe, no star will be printed")
else:
    staircase(size)
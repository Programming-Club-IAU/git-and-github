import java.util.Scanner;

public class Main {
    
public static void main(String[] args){
Scanner input=new Scanner(System.in);
double num1,num2;
System.out.println("Please Enter two numbers to print the maximum: ");

System.out.println("Please Enter the first number numbers : ");
num1=input.nextDouble();

System.out.println("Please Enter the Second number numbers : ");
num2=input.nextDouble();

if(num1>num2)
    System.out.println("the first number is the maximum  "); 
else
System.out.println("the Second number is the maximum ");
}

}

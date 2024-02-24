import java.util.Scanner;


public class App {
  /**
 * @param args
 */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter first number : ");
    int num1 = input.nextInt();
    System.out.print("enter seconed number : ");
    int num2 = input.nextInt();
    int max = 0;
    

    System.out.println();
    System.out.println("/'\\   /`.\r\n" + //
                "  .'.-.`-'.-.`.\r\n" + //
                "..._:   .-. .-.   :_...\r\n" + //
                ".'    '-.(o ) (o ).-'    `.\r\n" + //
                ":  _    _ _`~(_)~`_ _    _  :\r\n" + //
                ":  /:   ' .-=_   _=-. `   ;\\  :\r\n" + //
                ":   :|-.._  '     `  _..-|:   :\r\n" + //
                ":   `:| |`:-:-.-:-:'| |:'   :\r\n" + //
                "`.   `.| | | | | | |.'   .'\r\n" + //
                "`.   `-:_| | |_:-'   .'\r\n" + //
                "   `-._   ````    _.-'\r\n" + //
                "   ``-------''\r\n" + //
                "hehehee guess what is the maximum number??????\n\n\n ");

    if ( num1 != num2){
        if (num1 > num2) {
            max= num1;
            System.out.println("the first number is the maximum number\n"+num1+" is the WWWWWIIIINNNNEEEERRRR\n  /\\_/\\  (\r\n" + //
                                " ( ^.^ ) _)\r\n" + //
                                "   \\\"/  (\r\n" + //
                                " ( | | )\r\n" + //
                                "(__d b__)\n" );
        } else if (num1 < num2) {
            max=num2;
            System.out.println("the second number is the maximum number which is \n"+num2+" is the WWWWWIIIINNNNEEEERRRR\n  /\\_/\\  (\r\n" + //
                                " ( ^.^ ) _)\r\n" + //
                                "   \\\"/  (\r\n" + //
                                " ( | | )\r\n" + //
                                "(__d b__)\n");
        }}
    else {
        max=num1;
        System.out.println("the two numbers are equal and their value is "+ max +"\nthere is no Winner" );
        System.out.println(" /\\_/\\\r\n" + //
                        "( o.o )\r\n" + //
                        " > ^ <\n");
    
    }
  }
}


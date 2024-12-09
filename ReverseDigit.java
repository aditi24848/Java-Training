import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.println("REVERSE OF DIGIT!!!");
        System.out.print("enter your number:");
         int num = input.nextInt();
        System.out.println("reverse number is "+ROD(num) );
    }
    public static int ROD(int num) {
        int rem , res =0;
   while(num > 0){
       rem = num % 10;
       num = num /10;

       res = (res * 10) + rem;
   }
   return res;
    }
}

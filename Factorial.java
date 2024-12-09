import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("FACTORIAL PROGRAM ....");
        System.out.print("enter number for factorial: ");
        int num = input.nextInt();
        long factorial = fact(num);
        System.out.println("factorial of "+ num +" is " +factorial);
    }
    public static long fact( int num){
        if (num == 0 || num == 1){
            return 1;

        }
        else {
            return num * fact(num - 1);
        }

    }
}

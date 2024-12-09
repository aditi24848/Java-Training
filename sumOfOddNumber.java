import java.util.Scanner;

public class sumOfOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" sum of odd number .............");
        System.out.println("enter the number: ");
        int num = input.nextInt();

        System.out.println("the sum is:   "+adiitionOfOdd(num));

    }

    public static int adiitionOfOdd(int num) {
      int i = 1;
        int res = 0;
        while (i <= num) {


                res = res + i ;


            i+=2;
        }

        return res;
    }
}
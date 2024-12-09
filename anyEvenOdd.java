import java.util.Scanner;

public class anyEvenOdd {
    public static void main(String[] args) {
        // this is for input
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number .......");
        int num = input.nextInt();
        if (  (num & 1) == 0    ) {
            System.out.println("number is even ");
        }
        else {
            System.out.println(" number is odd");
        }
    }
}





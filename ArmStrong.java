import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ARMSTRONG NUMBER....");
        System.out.print("enter your number:");
        int num = input.nextInt();
        if(Armstrong(num)) {
            System.out.println("yes it is armstrong number");
        }
        else{
            System.out.println("not a armstrong number");
        }
    }
    public static boolean Armstrong(int num) {
        int rem, sum = 0;
        int num1 = num;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum += rem * rem * rem;

        }
        if( sum == num1){
            return true;
        }
        else{
            return false;
        }


    }
}

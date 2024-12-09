import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SUM OF DIGIT OF AN INTEGER ....");
        System.out.print("enter number for SUM: ");
        int num = input.nextInt();
        System.out.println(" the sum of digit is "+ Sum(num));
    }
    public static int Sum( int num){
      int sum = 0;
      while ( num > 0){
          sum += (num % 10);
          num /= 10;
        }
        return sum;
    }
}

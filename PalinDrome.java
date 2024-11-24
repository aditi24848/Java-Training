import java.util.Scanner;

 class PallinDrome {
    public static void main(String[] args) {
        System.out.println("PALINDROME PROGRAM....");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the num:");
        long num = input.nextLong();

        if(palindrome(num)){
            System.out.println("yes it is palindrome");
        }
        else{
            System.out.println("no its is not palindrome");
        }

    }
    public static boolean palindrome(long num) {
        long rem, sum = 0;
        long num1 = num;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = (sum * 10) + rem;

        }
        return (sum == num1);
    }
    }


import java.util.Scanner;

public class Fibnacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("FIBONACCI SERIES!!!!!!");
        System.out.print("enter the num up to which number you want to print: ");
        int num = input.nextInt();
        System.out.println(" the series is : ");
        fibo(num);
    }
    public static void fibo(int num) {
        if (num < 0) return;
            System.out.print("0 ");
        if( num == 0)  return;
            System.out.print("1 ");
        int first = 0 , second = 1;
        while (first + second <= num) {
            int third = (first + second);
            System.out.print(third +" ");
            first = second;
            second = third;
        }

        }
    }

import java.util.Scanner;
public class Prime {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PRIME NUMBER...");
        System.out.print("enter the num: ");
        int num = input.nextInt();
        boolean prime = PrimeNum(num);
        System.out.println(prime);
    }
    public static boolean PrimeNum( int num){
        int i = 2;
        while(i < num){
            if(num % i == 0  ){

                return false;
            }
            i++;
        }
        return true;
    }
}

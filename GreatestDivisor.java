import java.util.Scanner;

public class GreatestDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("GREATEST COMMON DIVISOR...");
        System.out.print("enter first num :");
        int first = input.nextInt();
        System.out.print("enter second num :");
        int second = input.nextInt();
        int gcd = GCD(first, second);
        System.out.println("greatest divisor is :  " + gcd);
    }
    public static int GCD(int first, int second) {
        int gcd = 1;
       int i = 2;
//        while(i <= least(first ,second) ){
       while( i <= first &&  i <= second){
        if(first % i ==0 && second % i == 0 ){
            gcd = i;
        }
        i++;
       }
return gcd;
    }
//    public static  int least(int first ,int second){
//        if( first < second){
//            return first;
//        }
//        else{
//            return second;
//        }
//    }
}
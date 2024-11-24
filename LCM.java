import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("LEAST COMMON FACTOR.....");
        System.out.print("enter your first num :");
        int first = input.nextInt();
        System.out.print("enter your second num :");
        int second = input.nextInt();
        int factor = LeastFactor(first ,  second);
        System.out.println(" the least common factor of is : "+factor);
    }
    public static int LeastFactor( int first , int second ){
              int i = 1;
                //while( i <= second){ or
        while(true){
                  if((first * i) % second == 0){
                      return (first * i);
                  }
                  i++;
              }
              //return 0;
    }

}

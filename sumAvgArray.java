import java.security.PublicKey;

public class sumAvgArray {
    public static void main(String[] args) {
        System.out.println("welcome,to sum array");
        int[] numArray = arrayUtility.arrayInput();
        int a = AvgArray(numArray);
        long b = sum(numArray);
        System.out.println("the sum :" +b);
        System.out.println("the avg :" +a);

    }
    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;

        }
        return sum;
    }

    public static int AvgArray(int[] numArray) {
        long sum = sum(numArray);
        int size = numArray.length;
        long avg = sum / size;
        return (int) avg;
    }
}
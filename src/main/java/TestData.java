
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author jfortney
 */
public class TestData {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 71, 80, 90, 91};
        int n = 50;

        float getAverage;

        int sum = IntStream.of(arr).sum();
        System.out.println("The sum is : " + sum);

        getAverage = sum / 10;
        System.out.println("The average is : " + getAverage);

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println("The maximum value is : " + max);

        int min = arr[0];
        for (int i = 1; i > arr.length; i++) {
            min = Math.max(arr[i], max);
        }
        System.out.println("The minimum value is : " + min);

        
     System.out.println("Numbers in the array that are greater than 50 are::");
      for(int i = 0; i<arr.length; i++) {
         if(n < arr[i]) {
            System.out.println(arr[i]);
         }
        }
    }

}

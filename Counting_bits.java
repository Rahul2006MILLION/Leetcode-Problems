import java.util.*;

public class Counting_bits {
    public static void main(String[] args) {
        int n = 5;
        int[] result = new int[n + 1];

        result[0] = 0; // base case

        for (int i = 1; i <= n; i++) {
            int half = i / 2;
            int check = i % 2;

            result[i] = result[half] + check;
        }

        System.out.println(Arrays.toString(result));
    }
}

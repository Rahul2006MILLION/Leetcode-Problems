import java.util.*;

public class Print_total_divisors {
    public static int[] divisors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                arr.add(i);
            }
        }
        int[] res = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }

        return res;
    }

    public static void main(String[] args) {

        int n = 38;

        int[] result = divisors(n);

        // print result
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

//In python:=

//class Solution:
//   def divisors(self, n):
//        l=[]
//        for i in range(1,n+1):
//            if(n%i==0):
//                l.append(i)
//        return l
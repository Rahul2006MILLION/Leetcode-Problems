import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Three_Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        Set<List<Integer>> res = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                //arr[i]+arr[j]+arr[k]=0
                int third=-(arr[i]+arr[j]);
                if(set.contains(third)){
                    int[] tem=new int[]{arr[i],arr[j],third};
                    Arrays.sort(tem);
                    List<Integer> lis=Arrays.asList(tem[0], tem[1], tem[2]);
                    res.add(lis);
                }
                set.add(arr[j]);

            }
        }
        System.out.println(res);

    }
    
    
}

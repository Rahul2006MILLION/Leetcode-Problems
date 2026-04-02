import java.util.Arrays;
import java.util.HashMap;

public class Two_sum2 {
    public int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
            int y=target-arr[i];
            if(map.containsKey(y)){
                result[0]=map.get(y);
                result[1]=i;
                return result;
            }

        }
        return new int[]{};
        

    }
    public static void main(String[] args){
        Two_sum2 obj = new Two_sum2();
        int nums[] = {2, 1, 0, 8, 6, 3};
        int target = 12;
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));



    }
    
    

    
}

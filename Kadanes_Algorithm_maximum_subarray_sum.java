public class Kadanes_Algorithm_maximum_subarray_sum {
    public static void main(String[] args){
        int [] arr={-2, -3, -7, -2, -10, -4}; // try for {2, 3, 5, -2, 7, -4} nd {-1, 2, 3, -1, 2, -6, 5}
        int cur_sum=0;
        int max_sum=arr[0];
        for(int i=0;i<arr.length;i++){
            cur_sum+=arr[i];
            if(cur_sum>max_sum){
                max_sum=cur_sum;
            }
            else if(cur_sum<0){
                cur_sum=0;
            }
        }
        System.out.println(max_sum);

    }
    
}

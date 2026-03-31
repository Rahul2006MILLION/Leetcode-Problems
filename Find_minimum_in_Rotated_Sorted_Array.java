public class Find_minimum_in_Rotated_Sorted_Array {
    public static int check(int[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] nums={4, 5, 6, 7, -7, 1, 2, 3};
        int a= check(nums);
        System.out.println(a);
    }
}

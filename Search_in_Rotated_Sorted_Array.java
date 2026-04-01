public class Search_in_Rotated_Sorted_Array {
    public static int check(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1; //when target is not in array

    }
    public static void main(String[] args){
        int[] nums={4,5,6,7,0,1,2};
        int k=1;
        int y=check(nums,k);
        System.out.println(y);
    }
}

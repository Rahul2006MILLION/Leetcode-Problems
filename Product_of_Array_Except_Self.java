import java.util.Arrays;

public class Product_of_Array_Except_Self {
    
    public static int[] left(int[] arr){
        int[] left=new int[arr.length];
        left[0]=1;
        for(int i=1;i<arr.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        return left;
    }
    public static int[] right(int[] arr){
        int[] right=new int[arr.length];
        right[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        return right;
    }
    
    
    
    public static void main(String[] args){
        int[] arr={2,1,3,4};
        int[] LEF=left(arr);
        int[] RIG=right(arr);
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=LEF[i]*RIG[i];
        }
        System.out.println(Arrays.toString(result));
    }
}

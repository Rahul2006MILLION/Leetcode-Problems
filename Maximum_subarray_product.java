import java.util.*;
public class Maximum_subarray_product {
    public static int maxProduct(int[] nums) {
        int n=nums.length;
        int prodl=1;
        int prodr=1;
        int left_max=nums[0];
        int right_max=nums[0];
        for(int i=0;i<n;i++){
            prodl*=nums[i];
            if(nums[i]==0){
                prodl=1;
            }
            if(prodl>left_max){
                left_max=prodl;
            }
        }
        for(int j=n-1;j>=0;j--){
            prodr*=nums[j];
            if(nums[j]==0){
                prodr=1;
            }
            if(prodr>right_max){
                right_max=prodr;
            }
        }
        int a=Math.max(left_max,right_max);
        if(a==1){
            return 0;
        }
        return a;
    }
    public static void main(String[] args){
        int[] nums={-5,0,-2};
        int a= maxProduct(nums);
        System.out.println(a);
    }
        }

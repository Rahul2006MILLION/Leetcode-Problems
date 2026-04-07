import java.util.*;
public class Continer_with_most_water {
    public static int check(int[] num){
        int n=num.length;
        int left=0;
        int right=n-1;
        int max_Area=0;
        while(left<right){
            int width=right-left;
            int height=Math.min(num[left], num[right]);
            int area=height*width;
            max_Area=Math.max(max_Area, area);
            if(num[left]<num[right]){
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return max_Area;

    }
    
    public static void main(String[] args){
        int[] arr={1,8,6,2,5,4,8,3,7};
        int a=check(arr);
        System.out.println(a);
    }
}


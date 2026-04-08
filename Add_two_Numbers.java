import java.util.*;
public class Add_two_Numbers {
    public static void main(String[] args){
        int[] l1={2,4,3};
        int[] l2={5,6,4};
        int[] revl1=new int[l1.length];
        int[] revl2=new int[l2.length];
        int[] resul=new int[l1.length];
        int sum=0;
        for(int i=l1.length-1;i>=0;i--){
            revl1[l1.length-1-i]=l1[i];
        }
        for(int i=l2.length-1;i>=0;i--){
            revl2[l2.length-1-i]=l2[i];
        }
        System.out.println(Arrays.toString(revl1));
        System.out.println(Arrays.toString(revl2));
        for(int i=0;i<l1.length;i++){
            resul[i]=revl1[i]+revl2[i];

        }
        System.out.println(Arrays.toString(resul));
    }
    
}

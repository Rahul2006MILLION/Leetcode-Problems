import java.util.HashSet;

public class Duplicates_finder {
    public static boolean check(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,5,2,1,3};
        boolean result=check(arr);
        System.out.println(result);
    }
}

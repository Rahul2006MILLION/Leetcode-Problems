import java.util.ArrayList;
import java.util.List;

public class Numbers_of_1_bits {
    public static void main(String[] args){
        int n=11;
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
            int r=n%2;
            n=n/2;
            list.add(r);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1){
                count+=1;
            }
        }
        System.out.println(count);
        

    }
    
}

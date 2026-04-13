public class Reversed_bits {

    public static int check(int n){
        int result=0;
        for(int i=0;i<32;i++){
            result<<=1;
            if((n&1)==1){
                result+=1;
            }
            n>>=1;
        }
        return result;
    }
    public static void main(String[] args){
        int n=0b00000010100101000001111010011100;
        int a=check(n);
        System.out.println(a);
        
    }
}

public class Coin_Change_2 {
    public static int solve(int i,int amount,int coins[]){
        int n=coins.length;
        if(amount==0){
            return 1;
        }
        if(i==n){
            return 0;
        }
        if(coins[i]>amount){
            return solve(i+1, amount, coins);
        }
        int take=solve(i, amount-coins[i], coins);
        int skip=solve(i+1, amount, coins);
        return take+skip;
    }
    public static void main(String[] args){
        int[] coins={1,2,5};
        int amount=5;
        int i=0;
        int a = solve(0, amount, coins);
        System.out.println(a);
    }
}

public class Buy_sell_Stocks {
    public static void main(String[] args){

        int[] arr = {10,7,5,8,11,9};
        int cur_price=0;
        int profit=0;
        int buy_sto=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<buy_sto){
                buy_sto=arr[i];
            }
            else{
                cur_price=arr[i]-buy_sto;
                if(cur_price>profit){
                    profit=cur_price;
                }
            }
        }
        System.out.println(profit);
        }
}


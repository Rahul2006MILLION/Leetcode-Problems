class Solution {
    public int reverseNumber(int n) {
        int reverse=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            reverse=(reverse*10)+r;
        }
        return reverse;
    }
}

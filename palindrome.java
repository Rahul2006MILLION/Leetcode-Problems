class Solution {
    public boolean isPalindrome(int n) {
        int a=n;
        int reverse=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            reverse=(reverse*10)+r;

        }
        if(a==reverse){
            return true;
        }
        else{
            return false;
        }

    }
}
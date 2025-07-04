class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int val = x;
        
        //edge case for negative numbers
        if(val<0) return false;

        while(val>0){
            res = res*10 + val%10;

            val = val/10;
        }

        return res==x;
    }
}

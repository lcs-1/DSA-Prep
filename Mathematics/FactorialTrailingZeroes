class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        
        for(int i=5; i<=n; i*=5){
            res = res + n/i;
        }

        return res;
    }
}


class Solution {
    public int trailingZeroes(int n) {
        int res = 0;

        while(n>=5){
            res += n/5;
            n = n/5;
        }
        return res;
    }
}

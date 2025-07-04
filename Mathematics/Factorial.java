class Solution {
    static int factorial(int n) {
        // code here
        int res = 1;
        while(n>0){
            res *= n;
            n--;
        }
        return res;
    }
}

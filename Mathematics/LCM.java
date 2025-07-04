class Solution {
    public int lcm(int a, int b) {
        // code here
        int res = Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0) return res;
            res++;
        }
        
        
    }
}

class Solution {
    public int lcm(int a, int b) {
        // code here
        return (a*b)/gcd(a,b);
    }
    
    public int gcd(int c , int d){
        if(d==0) return c;
        return gcd(d, c%d);
    }
}

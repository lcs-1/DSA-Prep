class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                if(!arr.contains(i)) arr.add(i);
                
                n = n/i;
            }
        }
        
        if(n>1) arr.add(n);
        
        return arr;
    }
}

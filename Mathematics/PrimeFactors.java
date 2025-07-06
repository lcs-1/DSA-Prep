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


//More efficient

class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        if(n<=1) return arr;
        
        while(n%2==0){
            arr.add(2);
            n = n/2;
        }
        while(n%3==0){
            arr.add(3);
            n = n/3;
        }
        
        for(int i=5; i*i<=n; i+=6){
            while(n%i==0){
                arr.add(i);
                n = n/i;
            }
            
            while(n%(i+2)==0){
                arr.add(i+2);
                n = n/(i+2);
            }
        }
        
        if(n>3) arr.add(n);
        
        return arr;
    }
    
}

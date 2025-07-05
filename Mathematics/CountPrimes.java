class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for (int j = 2; j < n; j++) {
            if (isPrime(j)) count++;
        }
        return count;
    }

    public boolean isPrime(int x) {
        if (x == 1) return false;
        if (x == 2 || x == 3) return true;
        if (x % 2 == 0 || x % 3 == 0) return false;
        for (int i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) return false;
        }
        return true;
    }
}


//Sieve of Eratosthenes Version

class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1] = false;

        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(boolean b: isPrime){
            if(b) count++;
        }
        return count;
    }
}

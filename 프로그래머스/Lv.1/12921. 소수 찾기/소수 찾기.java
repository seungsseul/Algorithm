class Solution {
    public int solution(int n) {
        return isPrime(n);
    }
    static int isPrime(int n) {
        boolean[] isPrime = new boolean[n+1];
        for(int i=0;i<isPrime.length;i++) {
            isPrime[i]=true;
        }
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i<Math.sqrt(n);i++) {
            if(isPrime[i]) {
                for(int j=i*i;j<=n;j+=i) {
                    isPrime[j]=false;
                }
            }
        }
        int cnt=0;
        for(int i=2;i<isPrime.length;i++) {
            if(isPrime[i]) {
                cnt++;
            }
        }
        return cnt;
    }
    
}
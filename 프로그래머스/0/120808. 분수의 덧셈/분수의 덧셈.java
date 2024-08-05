class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int LCM = (denom1*denom2)/GCD(Math.max(denom1, denom2), Math.min(denom1, denom2));
        answer[0] = numer1*(LCM/denom1) + numer2*(LCM/denom2);
        answer[1] = LCM;
        for(int i=LCM;i>=2;i--) {
            if(answer[0]%i==0 && answer[1]%i==0) {
                answer[0]/=i; answer[1]/=i;
            }
        }
        return answer;
    }
    static int GCD(int big, int small) {
        if(big%small==0) {
            return small;
        }
        return GCD(small, big%small);
    }
}
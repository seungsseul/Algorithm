class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(long i=1;i<=count;i++) {
            answer = answer + price*i;
        }
        return answer-money<=0 ? 0 : answer-money;
    }
}
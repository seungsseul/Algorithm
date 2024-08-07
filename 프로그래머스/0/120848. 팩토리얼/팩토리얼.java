class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=1;i<=n;i++) {
            if(answer*i>n) {
                return i-1;
            }
            answer*=i;
        }
        return answer;
    }
}
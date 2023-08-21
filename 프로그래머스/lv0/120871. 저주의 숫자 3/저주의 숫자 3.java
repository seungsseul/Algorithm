class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=0;
        while(true) {
            if(cnt==n) {
                break;
            }
            cnt++;
            answer++;
            while(true) {
                if(answer%3==0 || String.valueOf(answer).contains("3")) {
                    answer++;
                    continue;
                }
                break;
            }
        }
        return answer;
    }
}
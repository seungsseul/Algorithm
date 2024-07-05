class Solution {
    static int sec, line;
    static int[] answer;
    public int[] solution(int[] prices) {
        answer = new int[prices.length];
        for(int i=0;i<prices.length;i++) {
            line = prices[i];
            sec = 0;
            for(int j=i+1;j<prices.length;j++) {
                sec++;
                if(line>prices[j]) {
                    break;
                }
            }
            answer[i]=sec;
        }
        return answer;
    }
}
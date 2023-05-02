class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        int pair = 0;
        for(int i=1;i<=sum;i++) {
            if(sum%i==0) {
                if(i>sum/i) {
                    break;
                }
                pair=sum/i;
                if((pair-2)*(i-2)==yellow) {
                    answer[0]=pair;
                    answer[1]=i;
                }
                
            }
        }
            
        return answer;
    }
}
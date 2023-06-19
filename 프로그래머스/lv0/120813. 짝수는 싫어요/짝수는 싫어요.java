class Solution {
    static int[] answer;
    public int[] solution(int n) {
        if(n%2==0) {
            answer = new int[n/2];   
        }
        else {
            answer = new int[n/2+1];
        }
        int idx=0;
        for(int i=1;i<=n;i+=2) {
            answer[idx]=i;
            idx++;
        }
        return answer;
    }
}
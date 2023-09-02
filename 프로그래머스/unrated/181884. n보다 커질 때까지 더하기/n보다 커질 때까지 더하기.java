class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int s : numbers) {
            answer+=s;
            if(answer>n) {
                break;
            }
        }
        return answer;
    }
}
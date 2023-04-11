class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        //1부터 9까지의 값 다 더하기 (0은 더하나 마나이므로 제외)
        for(int i=1;i<=9;i++) {
            answer+=i;
        }
        //전체 다 더한 값에서 numbers배열의 각 값을 빼주고 남은 값==찾을 수 없는 숫자를 모두 찾아 더한 값
        for(int i=0;i<numbers.length;i++) {
            answer-=numbers[i];
        }
        return answer;
    }
}
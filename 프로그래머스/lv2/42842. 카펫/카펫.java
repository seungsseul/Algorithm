class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //갈색과 노란색 합친 사각형의 크기 탐색
        int sum = brown+yellow;
        //i와 짝지어질 배수값
        int pair = 0;
        //공배수를 구해서 i와 pair간 가장 편차가 작은 짝을 구하기
        for(int i=1;i<=sum;i++) {
            if(sum%i==0) {
                if(i>sum/i) {
                    break;
                }
                pair=sum/i;
                //노란색도 사각형이어야 하므로 사각형이 맞는지 체크하여 맞을 경우에만 answer로 등록
                if((pair-2)*(i-2)==yellow) {
                    answer[0]=pair;
                    answer[1]=i;
                }
                
            }
        }
            
        return answer;
    }
}

import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        for(int i=sides[1]-sides[0]+1;i<=sides[1];i++) {
            answer++;
        }
        for(int i=sides[1]+1;i<sides[1]+sides[0];i++) {
            answer++;
        }
        return answer;
    }
}
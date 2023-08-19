import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int abs = Integer.MAX_VALUE;
        Arrays.sort(array);
        for(int i=0;i<array.length;i++) {
            if(abs>Math.abs(array[i]-n)) {
                abs=Math.abs(array[i]-n);
                answer=array[i];
            }
        }
        return answer;
    }
}
import java.util.Arrays;
class Solution {
    static int sum;
    public int solution(int k, int m, int[] score) {
       Arrays.sort(score);
    	sum=0;
    	for(int i=score.length%m;i<score.length;i+=m) {
    		sum+=(score[i]*m);
    	}
        return sum;
    }
}
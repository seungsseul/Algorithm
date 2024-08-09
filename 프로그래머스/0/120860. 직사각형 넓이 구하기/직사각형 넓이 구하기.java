import java.util.Arrays;
class Solution {
    static int[] garo, sero;
    public int solution(int[][] dots) {
        garo = new int[4];
        sero = new int[4];
        for(int i=0;i<dots.length;i++) {
            garo[i]=dots[i][0];
            sero[i]=dots[i][1];
        }
        Arrays.sort(garo);
        Arrays.sort(sero);
        return (garo[3]-garo[0])*(sero[3]-sero[0]);
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        double[] tmp = new double[score.length];
        double[] arr = new double[score.length];
        Map<Double, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            arr[i]=(score[i][0]+score[i][1])/2.0;
            tmp[i]=arr[i];
        }
        Arrays.sort(tmp);
        int rank=1;
        for(int i=tmp.length-1;i>=0;i--) {
            double poll = tmp[i];
            if(map.containsKey(poll)) {
                rank++;
                continue;
            }
            map.put(poll, rank);
            rank++;
        }
        int[] answer = new int[score.length];
        for(int i=0;i<arr.length;i++) {
            answer[i]=map.get(arr[i]);
        }
        return answer;
    }
}
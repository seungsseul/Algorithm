import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<intervals.length;i++) {
            for(int j=intervals[i][0];j<=intervals[i][1];j++) {
                list.add(arr[j]);
            }
        }
        return list;
    }
}
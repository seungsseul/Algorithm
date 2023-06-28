import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(list.size()==k) {
                break;
            }
            if(list.contains(arr[i])) {
                continue;
            }
            list.add(arr[i]);
        }
        int cnt=k-list.size();
        for(int i=0;i<cnt;i++) {
            list.add(-1);
        }
        return list;
    }
}
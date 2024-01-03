import java.util.Arrays;import java.util.List;import java.util.stream.Collectors;
class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i=0;i<delete_list.length;i++) {
            if(arrList.contains(delete_list[i])) {
                arrList.remove(Integer.valueOf(delete_list[i]));
            }
        }
        return arrList;
    }
}
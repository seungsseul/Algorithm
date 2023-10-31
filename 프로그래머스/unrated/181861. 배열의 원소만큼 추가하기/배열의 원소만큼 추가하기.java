import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        String tmp = "";
        for(int i=0;i<arr.length;i++) {
            tmp+=(String.valueOf(arr[i])+",").repeat(arr[i]);
        }

        String[] tmpArr = tmp.split(",");
        int[] answer = new int[tmpArr.length];
        for(int i=0;i<tmpArr.length;i++) {
            answer[i]=Integer.parseInt(tmpArr[i]);
        }
        return answer;
    }
}
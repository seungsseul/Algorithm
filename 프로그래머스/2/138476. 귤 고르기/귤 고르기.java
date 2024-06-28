import java.util.Arrays;
class Solution {
    static int answer;
    static int[] arr;
    public int solution(int k, int[] tangerine) {
        answer = 0;
        arr = new int[10000001];
        for(int i=0;i<tangerine.length;i++) {
            arr[tangerine[i]]++;
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--) {
            if(k<=0) {
                break;
            }
            k-=arr[i];
            answer++;
        }
        return answer;
    }
    
}
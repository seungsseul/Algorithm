class Solution {
    static int start, end, idx;
    static boolean flag;
    static int[] answer;
    public int[] solution(int[] arr) {
        start = -1; end = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==2) {
                start = i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]==2) {
                end = i;
                break;
            }
        }
        if(start==-1 && end==-1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        answer = new int[end-start+1];
        idx = 0;
        for(int i=start;i<=end;i++) {
            answer[idx] = arr[i];
            idx++;
        }
        return answer; 
    }
}
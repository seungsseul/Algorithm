class Solution {
    public int solution(int[] arr, int idx) {
        int answer = idx;
        for(int i=idx;i<arr.length;i++) {
            if(arr[i]==1) {
                break;
            }
            answer++;
        }
        if(arr.length==answer) {
            answer=-1;
        }
        return answer;
    }
}
class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = new int[Math.max(arr.length, arr[0].length)][Math.max(arr.length, arr[0].length)];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
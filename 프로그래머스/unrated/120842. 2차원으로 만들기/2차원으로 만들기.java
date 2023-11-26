class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx=0;int idx2=0;
        for(int i=0;i<num_list.length;i++) {
            for(int j=0;j<n;j++) {
                answer[idx][j]=num_list[i];
                i++;
            }
            i--;
            idx++;
        }
        return answer;
    }
}
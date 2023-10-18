class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int start=101;int end=-101;
        for(int i=0;i<lines.length;i++) {
            for(int j=0;j<lines[i].length;j++) {
                end=Math.max(end,lines[i][j]);
                start=Math.min(start,lines[i][j]);
            }
        }
        int[] arr = new int[end-start+1];
        for(int i=0;i<lines.length;i++) {
            int[] range = lines[i];
            for(int j=range[0]-start+1;j<=range[1]-start;j++) {
                arr[j]++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>=2) {
                answer++;
            }
        }
        return answer;
    }
}
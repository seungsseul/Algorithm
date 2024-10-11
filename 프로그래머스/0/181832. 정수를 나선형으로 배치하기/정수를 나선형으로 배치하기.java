class Solution {
    static int num, nr, nc;
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static int[][] answer;
    static boolean[][] visited;
    public int[][] solution(int n) {
        answer = new int[n][n];
        visited = new boolean[n][n];
        answer[0][0] = 1;
        visited[0][0] = true;
        num = 2;
        nr = 0; nc = 0;
        while(true) {
            for(int d=0;d<4;d++) {
                while(true) {
                    nr = nr+dr[d];
                    nc = nc+dc[d];
                    if(nr>=0 && nc>=0 && nr<n && nc<n && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        answer[nr][nc] = num;
                        num++;
                        continue;
                    }
                    nr-=dr[d]; nc-=dc[d];
                    break;
                }
            }
            if(num==n*n+1) {
               break; 
            }
        }
        return answer;
    }
}
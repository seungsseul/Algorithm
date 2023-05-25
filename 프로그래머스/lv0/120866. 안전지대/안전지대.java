class Solution {
    static int[] dr = {0,0,-1,1,-1,-1,1,1};
    static int[] dc = {-1,1,0,0,-1,1,-1,1};
    static boolean[][] visited;
    public int solution(int[][] board) {
        visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j]==1) {
                    visited[i][j]=true;
                    for(int d=0;d<8;d++) {
                        int nr = i+dr[d];
                        int nc = j+dc[d];
                        if(nr>=0 && nc>=0 && nr<board.length && nc<board[i].length) {
                            visited[nr][nc]=true;
                        }
                    }
                }
            }
        }
        int answer = 0;
        for(int i=0;i<visited.length;i++) {
            for(int j=0;j<visited[i].length;j++) {
                if(!visited[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
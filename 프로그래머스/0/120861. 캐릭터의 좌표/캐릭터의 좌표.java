class Solution {
    static int r, c, nr, nc;
    static int[] answer;
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {-1, 1, 0, 0};
    public int[] solution(String[] keyinput, int[] board) {
        r = 0; c = 0;
        for(int i=0;i<keyinput.length;i++) {
            if(keyinput[i].equals("left")) {
                nr = r+dr[0];
                nc = c+dc[0];
            }
            else if(keyinput[i].equals("right")) {
                nr = r+dr[1];
                nc = c+dc[1];
            }
            else if(keyinput[i].equals("up")) {
                nr = r+dr[3];
                nc = c+dc[3];
            }
            else {
                nr = r+dr[2];
                nc = c+dc[2];
            }
            if(nr<board[1]/2*-1 || nc<board[0]/2*-1 || nr>board[1]/2 || nc>board[0]/2) {
                continue;
            }
            r = nr;
            c = nc;
        }
        answer = new int[2];
        answer[1] = r; answer[0] = c;
        return answer;
    }
}
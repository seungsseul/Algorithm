import java.util.*;
class Solution {
    static int answer;
    static String Input;
    static boolean flag;
    static int[] dr = {0,0,-1,1};
    static int[] dc = {-1,1,0,0};
    static String[][] map;
    static boolean[][] visited;
    static Queue<Node> q;
    static class Node {
        int r;
        int c;
        int cnt;
        public Node(int r, int c, int cnt) {
            this.r=r;
            this.c=c;
            this.cnt=cnt;
        }
    }
    public int solution(String[] board) {
        map = new String[board.length][board[0].length()];
        visited = new boolean[map.length][map[0].length];
        for(int i=0;i<map.length;i++) {
            Input = board[i];
            for(int j=0;j<Input.length();j++) {
                map[i][j] = String.valueOf(Input.charAt(j));
            }
        }
        loop:
        for(int i=0;i<map.length;i++) {
            for(int j=0;j<map[i].length;j++) {
                if(map[i][j].equals("R")) {
                    visited[i][j]=true;
                    bfs(i,j,0);
                    break loop;   
                }
            }
        }
        answer = flag ? answer : -1;
        return answer;
    }
    static void bfs(int r, int c, int cnt) {
        q = new LinkedList<>();
        q.offer(new Node(r, c, cnt));
        while(!q.isEmpty()) {
            Node n = q.poll();
            if(map[n.r][n.c].equals("G")) {
                flag = true;
                answer = n.cnt;
                break;
            }
            for(int d=0;d<4;d++) {
                int nr = dr[d]+n.r;
                int nc = dc[d]+n.c;
                if(nr>=0 && nc>=0 && nr<map.length && nc<map[0].length && !map[nr][nc].equals("D")) {
                    if(dc[d]==0) {
                        int tmp = nr;
                        while(true) {
                            nr+=dr[d];
                            if(nr<0 || nc<0 || nr>=map.length || nc>=map[0].length || map[nr][nc].equals("D")) {
                                if(!visited[nr-dr[d]][nc]) {
                                    q.offer(new Node(nr-dr[d], nc, n.cnt+1));
                                    visited[nr-dr[d]][nc]=true;
                                }
                                break;
                            }
                        }
                    }
                    else {
                        int tmp = nc;
                        while(true) {
                            nc+=dc[d];
                            if(nr<0 || nc<0 || nr>=map.length || nc>=map[0].length || map[nr][nc].equals("D")) {
                                if(!visited[nr][nc-dc[d]]) {
                                    q.offer(new Node(nr, nc-dc[d], n.cnt+1));
                                    visited[nr][nc-dc[d]]=true;
                                }
                                break;
                            }
                        }
                    }   
                }
            }
        }
    }
}
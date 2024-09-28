import java.util.Queue;
import java.util.LinkedList;
class Solution {
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
    static int answer;
    static Queue<Node> q;
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {-1, 1, 0, 0};
    static boolean[][] visited;
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        q = new LinkedList<>();
        q.offer(new Node(0,0,1));
        visited[0][0]=true;
        while(!q.isEmpty()) {
            Node n = q.poll();
            if(n.r==maps.length-1 && n.c==maps[0].length-1) {
                answer = n.cnt;
                break;
            }
            for(int d=0;d<4;d++) {
                int nr = n.r+dr[d];
                int nc = n.c+dc[d];
                if(nr>=0 && nc>=0 && nr<maps.length && nc<maps[0].length) {
                    if(maps[nr][nc]==0 || visited[nr][nc]) {
                        continue;
                    }
                    visited[nr][nc]=true;
                    q.offer(new Node(nr, nc, n.cnt+1));
                }
            }
        }
        return answer==0 ? -1 : answer;
    }
}
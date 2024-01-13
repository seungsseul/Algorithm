import java.util.Queue;
import java.util.LinkedList;
class Solution {
    class Node {
        int r;
        int c;
        int cnt;
        public Node(int r, int c, int cnt) {
            this.r=r;
            this.c=c;
            this.cnt=cnt;
        }
    }
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {-1,1, 0, 0};
    public int solution(int[][] maps) {
        int answer = Integer.MAX_VALUE;
        Queue<Node> q = new LinkedList<>();
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        q.offer(new Node(0,0,1));
        visited[0][0]=true;
        while(!q.isEmpty()) {
            Node node = q.poll();
            if(node.r==n-1 && node.c==m-1) {
                answer=node.cnt;
                break;
            }
            for(int d=0;d<4;d++) {
                int nr = dr[d]+node.r;
                int nc = dc[d]+node.c;
                if(nr>=0 && nc>=0 && nr<n && nc<m) {
                    if(maps[nr][nc]==0 || visited[nr][nc]) {
                        continue;
                    }
                    visited[nr][nc]=true;
                    q.offer(new Node(nr, nc, node.cnt+1));
                }
            }
        }
        if(answer==Integer.MAX_VALUE) {
            answer=-1;
        }
        return answer;
    }
}
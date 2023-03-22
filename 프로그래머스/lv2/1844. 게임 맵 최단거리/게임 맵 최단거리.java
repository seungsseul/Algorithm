import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Solution {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static boolean[][] visited;
    static Queue<Node> queue;
	static class Node{
        int r, c, cnt;
        Node(int r, int c,  int cnt){
            this.r = r;
            this.c = c;
            this.cnt = cnt;
        }
    }
    public int solution(int[][] arr) {
        visited = new boolean[arr.length][arr[0].length];
		int ans=Integer.MAX_VALUE;
		queue = new LinkedList<>();
		queue.add(new Node(0,0,0));
		visited[0][0]=true;
		while(!queue.isEmpty()) {
			Node n = queue.poll();
			if(n.r==arr.length-1 && n.c==arr[0].length-1) {
				ans=n.cnt+1;
				break;
			}
			for(int d = 0; d < 4; d++) {
				int nr = n.r + dr[d];
				int nc = n.c + dc[d];
				if(nr<0 || nc<0 || nr>=arr.length || nc>=arr[0].length) {
					continue;
				}
				if(visited[nr][nc]) {
					continue;
				}
				//벽이 아닐때
				if(arr[nr][nc]==1) {
					visited[nr][nc]=true;
					queue.add(new Node(nr, nc, n.cnt+1));
				}

			}				
		}
		if(ans==Integer.MAX_VALUE) {
			ans=-1;
		}
		return ans;
    }
}
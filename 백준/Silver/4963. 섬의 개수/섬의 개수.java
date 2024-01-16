import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node {
		int r;
		int c;
		int cnt;
		public Node(int r, int c) {
			this.r=r;
			this.c=c;
		}
	}
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int w, h, cnt;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {-1,1,0,0,-1,1,-1,1};
	static int[] dc = {0,0,-1,1,-1,-1,1,1};
	static Queue<Node> q;
	public static void main(String[] args) throws IOException {
		while(true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if(w==0 && h==0) {
				break;
			}
			map = new int[h][w];
			visited = new boolean[h][w];
			for(int i=0;i<h;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<w;j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			cnt=0;
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(map[i][j]==1 && !visited[i][j]) {
						bfs(i,j);
						cnt++;
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
	static void bfs(int i, int j) {
		q = new LinkedList<Node>();
		q.offer(new Node(i,j));
		visited[i][j]=true;
		while(!q.isEmpty()) {
			Node n = q.poll();
			for(int d=0;d<8;d++) {
				int nr = n.r+dr[d];
				int nc = n.c+dc[d];
				if(nr>=0 && nc>=0 && nr<h && nc<w) {
					if(visited[nr][nc] || map[nr][nc]==0) {
						continue;
					}
					visited[nr][nc]=true;
					q.offer(new Node(nr, nc));
				}
			}
		}
	}
 }

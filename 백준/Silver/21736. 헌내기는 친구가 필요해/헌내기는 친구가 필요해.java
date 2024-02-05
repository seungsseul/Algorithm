import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
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
	static String[][] arr;
	static boolean[][] visited;
	static String Input, realAns;
	static int N, M, ans;
	static Queue<Node> q;
	static int[] dr = {0, 1, 0, -1};
	static int[] dc = {1, 0, -1, 0};
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new String[N][M];
		visited = new boolean[N][M];
		for(int i=0;i<N;i++) {
			Input = br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j]=String.valueOf(Input.charAt(j));
			}
		}
		loop:
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j].equals("I")) {
					visited[i][j]=true;
					ans=0;
					bfs(i,j);
					break loop;
				}
			}
		}
		realAns = ans==0 ? "TT" : String.valueOf(ans);
		bw.write(realAns);bw.flush();bw.close();br.close();
	}
	static void bfs(int r, int c) {
		q = new LinkedList<>();
		q.offer(new Node(r,c,0));
		while(!q.isEmpty()) {
			Node n = q.poll();
			for(int d=0;d<4;d++) {
				int nr = n.r+dr[d];
				int nc = n.c+dc[d];
				if(nr>=0 && nc>=0 && nr<N && nc<M) {
					if(arr[nr][nc].equals("X") || visited[nr][nc]) {
						continue;
					}
					if(arr[nr][nc].equals("P")) {
						ans++;
					}
					q.offer(new Node(nr, nc, ans));
					visited[nr][nc]=true;
				}
			}
		}
	}
}

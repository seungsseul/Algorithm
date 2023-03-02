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
	static int N, M, max, tmp;
	static String[][] arr;
	static boolean[][] visited;
	static String Input;
	static int dr[] = {-1,1,0,0};
	static int dc[] = {0,0,-1,1};
 	static class Node {
		int r;
		int c;
		int cnt;
		public Node(int r, int c, int cnt) {
			super();
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
		
	}
	static Queue<Node> q;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new String[N][M];
		q = new LinkedList<>(); 
		for(int i=0;i<N;i++) {
			Input = br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j]=String.valueOf(Input.charAt(j));
			}
		}
		max=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j].equals("L")) {
					visited = new boolean[N][M];
					visited[i][j]=true;
					q.add(new Node(i, j, 0));
					tmp=0;
					while(!q.isEmpty()) {
						Node n = q.poll();
						for(int d=0;d<4;d++) {
							int nr = dr[d]+n.r;
							int nc = dc[d]+n.c;
							if(nr>=0 && nc>=0 && nr<N && nc<M) {
								if(visited[nr][nc] || arr[nr][nc].equals("W")) {
									continue;
								}
								visited[nr][nc]=true;
								q.add(new Node(nr, nc, n.cnt+1));
								tmp = Math.max(tmp, n.cnt+1);
							}
						}
					}
					max=Math.max(max, tmp);					
				}
			}
		}
		bw.write(String.valueOf(max));
		bw.flush();bw.close();br.close();
	}
}

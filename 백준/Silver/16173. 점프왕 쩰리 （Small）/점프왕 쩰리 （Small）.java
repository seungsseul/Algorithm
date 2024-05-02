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
	static int N, life;
	static int[] dr, dc;
	static int[][] map;
	static class Node {
		int r;
		int c;
		int move;
		public Node(int r, int c, int move) {
			this.r=r;
			this.c=c;
			this.move=move;
		}
	}
	static Queue<Node> q;
	static boolean flag;
	static String ans;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		q = new LinkedList<>();
		q.offer(new Node(0,0,map[0][0]));
		while(!q.isEmpty()) {
			Node n = q.poll();
			if(n.move==-1) {
				flag = true;
				break;
			}
			if(n.move>=3 || n.move==0) {
				continue;
			}
			int[] dr = {0, n.move};
			int[] dc = {n.move, 0};
			for(int d=0;d<2;d++) {
				int nr = dr[d]+n.r;
				int nc = dc[d]+n.c;
				if(nr>=0 && nc>=0 && nr<N && nc<N) {
					q.offer(new Node(nr, nc, map[nr][nc]));
				}
			}
		}
		ans = flag ? "HaruHaru" : "Hing";
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}

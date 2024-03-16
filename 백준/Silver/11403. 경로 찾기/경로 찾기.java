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
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int[][] map, ans;
	static boolean[] visited;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		ans = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<N;i++) {
			visited = new boolean[N];
			graph(i);
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(ans[i][j]).append(" ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
	static void graph(int king) {
		q = new LinkedList<Integer>();
		q.add(king);
		while(!q.isEmpty()) {
			int poll = q.poll();
			for(int i=0;i<N;i++) {
				if(map[poll][i]==1 && !visited[i]) {
					visited[i] = true;
					q.add(i);
					ans[king][i]=1;
				}
			}
		}
	}
}

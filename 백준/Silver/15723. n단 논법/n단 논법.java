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
	static int n, x, y, m;
	static int[][] alpabet;
	static boolean[] visited;
	static boolean flag;
	static String ans;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		alpabet = new int[26][26];
		n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			x = st.nextToken().charAt(0)-97;
			st.nextToken();
			y = st.nextToken().charAt(0)-97;
			alpabet[x][y]=1;
		}
		m = Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			x = st.nextToken().charAt(0)-97;
			st.nextToken();
			y = st.nextToken().charAt(0)-97;
			visited = new boolean[26];
			flag = false;
			graph(x, y, alpabet);
			ans = flag ? "T" : "F";
			sb.append(ans).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
	static void graph(int start, int end, int[][] map) {
		q = new LinkedList<Integer>();
		q.offer(start);
		while(!q.isEmpty()) {
			int poll = q.poll();
			for(int i=0;i<26;i++) {
				if(map[poll][i]==1 && !visited[i]) {
					if(i==end) {
						flag = true;
						return;
					}
					visited[i]=true;
					q.offer(i);
				}
			}
		}
	}
}

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
	static int n, m, x, y, cnt;
	static int[][] network;
	static boolean[] visited;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		network = new int[n][n];
		visited = new boolean[n];
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken())-1;
			y = Integer.parseInt(st.nextToken())-1;
			network[x][y]=1; network[y][x]=1;
		}
		q = new LinkedList<Integer>();
		q.offer(0);
		visited[0]=true;
		while(!q.isEmpty()) {
			int poll = q.poll();
			for(int i=0;i<n;i++) {
				if(network[poll][i]==1 && !visited[i]) {
					visited[i]=true;
					q.offer(i);
				}
			}
		}
		cnt = 0;
		for(int i=1;i<n;i++) {
			cnt+=visited[i] ? 1 : 0;
		}
		bw.write(String.valueOf(cnt));bw.flush();bw.close();br.close();
	}
}

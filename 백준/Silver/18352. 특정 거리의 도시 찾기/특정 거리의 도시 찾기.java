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
	static int N, M, K, X, A, B;
	static int[][] map;
	static int[] length;
	static boolean[] visited;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		map = new int[M+1][2];
		for(int t=1;t<=M;t++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			map[t][0]=A;
			map[t][1]=B;
		}
		q = new LinkedList<Integer>();
		q.offer(X);
		length = new int[N+1];
		visited = new boolean[N+1];
		visited[0]=visited[X]=true;
		while(!q.isEmpty()) {
			int poll = q.poll();
			if(length[poll]==K) {
				break;
			}
			for(int i=1;i<=M;i++) {
				if(map[i][0]==poll && !visited[map[i][1]]) {
					q.offer(map[i][1]);
					length[map[i][1]]=length[poll]+1;
					visited[map[i][1]]=true;
				}
			}
		}
		for(int i=0;i<length.length;i++) {
			if(length[i]==K) {				
				sb.append(i).append("\n");
			}
		}
		if(sb.length()==0) {
			sb.append(-1);
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

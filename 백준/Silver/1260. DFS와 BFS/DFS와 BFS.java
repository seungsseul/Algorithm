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
	static int N, M, V, x, y, node;
	static int[][] arr;
	static boolean[] visited;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); //정점의 개수
		M = Integer.parseInt(st.nextToken()); //간선의 개수
		V = Integer.parseInt(st.nextToken()); //정점의 번호
		arr = new int[N+1][N+1];
		visited = new boolean[N+1];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken()); 
			y = Integer.parseInt(st.nextToken());
			arr[x][y]=1;
			arr[y][x]=1;
		}
		dfs(V);
		sb.append("\n");
		visited = new boolean[N+1];
		bfs(V);
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
	
	static void dfs(int start) {
		visited[start]=true;
		sb.append(start).append(" ");
		
		for(int i=1;i<=N;i++) {
			if(arr[start][i]==1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int start) {
		q = new LinkedList<Integer>();
		q.add(start);
		visited[start]=true;
		
		while(!q.isEmpty()) {
			node = q.poll();
			sb.append(node).append(" ");
			for(int i=1;i<=N;i++) {
				if(arr[node][i]==1 && !visited[i]) {
					q.add(i);
					visited[i]=true;
				}
			}
		}
		
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, M, sum, idx, T, cnt;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dr = {0,0,-1,1};
	static int[] dc = {-1,1,0,0};
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		idx=0;
		sum=0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				sum=0;
				for(int k=0;k<3;k++) {	
					sum+=Integer.parseInt(st.nextToken());
				}
				arr[i][j]=sum/3;
			}
		}
		T = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j]>=T) {
					arr[i][j]=255;
				}
				else {
					arr[i][j]=0;
				}
			}
		}
		cnt=0;
		visited = new boolean[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j]==255 && !visited[i][j]) {
					visited[i][j]=true;
					dfs(i,j);
					cnt++;
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
	static void dfs(int r, int c) {
		for(int d=0;d<4;d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(nr>=0 && nc>=0 && nr<N && nc<M) {
				if(visited[nr][nc] || arr[nr][nc]==0) {
					continue;
				}
				if(arr[nr][nc]==255) {
					visited[nr][nc]=true;
					dfs(nr, nc);
				}
			}
		}
	}
}

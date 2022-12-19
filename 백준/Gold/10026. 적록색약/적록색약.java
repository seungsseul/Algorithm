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
	static String[][] arr;
	static boolean[][] visited;
	static String Input;
	static int N, sm, nor;
	static boolean flag;
	static int[] dr = {0, 1, 0, -1};
	static int[] dc = {1, 0, -1, 0};
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new String[N][N];
		visited=new boolean[N][N];
		for(int i=0;i<N;i++) {
			Input = br.readLine();
			for(int j=0;j<N;j++) {
				arr[i][j]=String.valueOf(Input.charAt(j));
			}
		}
		nor=0;sm=0;flag=false;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {
					visited[i][j]=true;
					dfs(i,j,arr[i][j]);
					nor++;
				}
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i][j].equals("R")) {
					arr[i][j]="G";
				}
			}
		}
		visited=new boolean[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {
					visited[i][j]=true;
					dfs2(i,j,arr[i][j]);
					sm++;
				}
			}
		}
		bw.write(String.valueOf(nor)+" "+String.valueOf(sm));
		bw.flush();bw.close();br.close();
	}
	static void dfs(int r, int c, String RGB) {
		for(int d=0;d<4;d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(nr>=0 && nc>=0 && nr<N && nc<N) {
				if(visited[nr][nc]) {
					continue;
				}
				if(arr[nr][nc].equals(RGB)) {
					visited[nr][nc]=true;
					dfs(nr, nc, RGB);
				}
				else if(d==3 && !arr[nr][nc].equals(RGB)) {
					return;
				}
			}
		}
	}
	static void dfs2(int r, int c, String RGB) {
		for(int d=0;d<4;d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(nr>=0 && nc>=0 && nr<N && nc<N) {
				if(visited[nr][nc]) {
					continue;
				}
				if(arr[nr][nc].equals(RGB)) {
					visited[nr][nc]=true;
					dfs2(nr, nc, RGB);
				}
				else if(d==3 && !arr[nr][nc].equals(RGB)) {
					return;
				}
			}
		}
	}
}

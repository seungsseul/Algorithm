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
	static int N, M, r, c, d, clean, flag;
	static int[][] arr;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken()); //시작위치r
		c = Integer.parseInt(st.nextToken()); //시작위치c
		d = Integer.parseInt(st.nextToken()); //바라보는 방향
		//0:북, 1:서, 2:남, 3:동
		arr = new int[N][M];
		visited = new boolean[N][M];
		flag=1;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		dfs(r,c,d);
		bw.write(String.valueOf(clean));
		bw.flush();bw.close();br.close();
	}
	static void dfs(int r, int c, int direc) {
		if(flag==1) {			
			clean++;
			visited[r][c]=true;
		}
		//북
		if(direc==0) {
			int[] dr = {0, 1, 0, -1};
			int[] dc = {-1, 0, 1, 0};
			//0:북, 1:서, 2:남, 3:동
			for(int d=0;d<4;d++) {
				int nr = r+dr[d];
				int nc = c+dc[d];
				if(nr>=0 && nc>=0 && nr<N && nc<M) {
					if(d==0) {
						direc=3;
					}
					else if(d==1) {
						direc=2;
					}
					else if(d==2) {
						direc=1;			
					}
					else if(d==3) {
						direc=0;
					}
					if(visited[nr][nc]) {		
						flag=2;
						continue;
					}
					if(arr[nr][nc]==1) {
						flag=2;
						continue;
					}
					flag=1;
					dfs(nr,nc,direc);
					return;
				}
			}
			if(arr[r+1][c]==0) {
				flag=2;
				dfs(r+1,c,direc);
			}		
			return;
		}
		//동
		else if(direc==1) {
			int[] dr = {-1, 0, 1, 0};
			int[] dc = {0, -1, 0, 1};
			//0:북, 1:서, 2:남, 3:동
			for(int d=0;d<4;d++) {
				int nr = r+dr[d];
				int nc = c+dc[d];
				if(nr>=0 && nc>=0 && nr<N && nc<M) {
					if(d==0) {
						direc=0;
					}
					else if(d==1) {
						direc=3;
					}
					else if(d==2) {
						direc=2;			
					}
					else if(d==3) {
						direc=1;
					}
					if(visited[nr][nc]) {
						flag=2;
						continue;
					}
					if(arr[nr][nc]==1) {
						flag=2;
						continue;
					}
					flag=1;
					dfs(nr,nc,direc);
					return;
				}
			}
			if(arr[r][c-1]==0) {
				flag=2;
				dfs(r,c-1,direc);	
			}
			return;
		}
		//남
		else if(direc==2) {
			int[] dr = {0, -1, 0, 1};
			int[] dc = {1, 0, -1, 0};
			//0:북, 1:서, 2:남, 3:동
			for(int d=0;d<4;d++) {
				int nr = r+dr[d];
				int nc = c+dc[d];
				if(nr>=0 && nc>=0 && nr<N && nc<M) {
					if(d==0) {
						direc=1;
					}
					else if(d==1) {
						direc=0;
					}
					else if(d==2) {
						direc=3;			
					}
					else if(d==3) {
						direc=2;
					}
					if(visited[nr][nc]) {
						flag=2;
						continue;
					}
					if(arr[nr][nc]==1) {
						flag=2;
						continue;
					}
					flag=1;
					dfs(nr,nc,direc);
					return;
				}
			}
			if(arr[r-1][c]==0) {
				flag=2;
				dfs(r-1,c,direc);
			}		
			return;
		}
		//서
		else if(direc==3) {
			int[] dr = {1, 0, -1, 0};
			int[] dc = {0, 1, 0, -1};
			//0:북, 1:서, 2:남, 3:동
			for(int d=0;d<4;d++) {
				int nr = r+dr[d];
				int nc = c+dc[d];
				if(nr>=0 && nc>=0 && nr<N && nc<M) {
					if(d==0) {
						direc=2;
					}
					else if(d==1) {
						direc=1;
					}
					else if(d==2) {
						direc=0;			
					}
					else if(d==3) {
						direc=3;
					}
					if(visited[nr][nc]) {
						flag=2;
						continue;
					}
					if(arr[nr][nc]==1) {
						flag=2;
						continue;
					}
					flag=1;
					dfs(nr,nc,direc);
					return;
				}
			}
			if(arr[r][c+1]==0) {
				flag=2;
				dfs(r,c+1,direc);
			}		
			return;
		}
	}
}

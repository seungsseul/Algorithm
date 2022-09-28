import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int[][] arr;
	static boolean[][] visited;
	static int tmpmax;
	static int tmp;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int N, K, max, min, cnt;


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			visited = new boolean[N][N];
			max = 0;
			min = 30;
			tmpmax=0;
			tmp=0;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					max=Math.max(max, arr[i][j]);
					min=Math.min(min, arr[i][j]);
				}
			}
			//배열돌면서 max값 나올때마다 dfs해보기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(arr[i][j]==max) {
						cnt=0;
						visited[i][j]=true;
						dfs(i,j, 0);
					}
					//해당 max값 dfs끝나면 visited 배열 기존값으로 초기화
					visited = new boolean[N][N];
				}
			}
			//비교하면서 tmpmax 변수에 담았던 최댓값 출력
			System.out.println("#"+t+" "+(tmpmax+1));

		}

	}

	static void dfs(int r, int c, int dig) {
		
		tmpmax = Math.max(tmpmax, cnt);
		
		
		//배열안에서만 돌게하기
		if(r<0 || c<0 || r>=N || c>=N) {
			return;
		}
		
		//4방탐색해서 등산로 놓아보기
		for(int d=0;d<4;d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(nr<0 || nc<0 || nr>=N || nc>=N) {
				continue;
			}
			if(visited[nr][nc]) {
				continue;
			}
			
			//땅을 한번 파볼까? 하는 상황
			if(arr[nr][nc]>=arr[r][c]) {
				if(dig==1) {
					continue;
				}
				else {
					tmp=arr[nr][nc];
					boolean flag = false;
					for(int i=1;i<=K;i++) {
						arr[nr][nc]=arr[nr][nc]-i;
						if(arr[nr][nc]<arr[r][c]) {
							flag = true;
							break;
						}
						arr[nr][nc]=tmp;
					}
					if(flag) {
						visited[nr][nc]=true;
						cnt++;
						dfs(nr, nc, 1);
						arr[nr][nc]=tmp;
					}
					else {
						arr[nr][nc]=tmp;
						continue;
					}
				}
			}
			//땅을 안파도 되는 상황
			else {
				visited[nr][nc]=true;
				cnt++;			
				dfs(nr, nc, dig);
			}
		}
		//재귀빠져나올시 visited와 cnt 원래값으로 리셋
		visited[r][c]=false;
		cnt--;
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static char[][] map;
	static boolean[][][] visited;
	static int N, M, ans;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	
	static class Node {
		int r,c,cnt,key;

		public Node(int r, int c, int cnt, int key) {
			super();
			this.r = r;
			this.c = c;
			this.cnt = cnt;
			this.key = key;
		}		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		//f가 2진수로 100000이므로 10진수로 변환하면 32
		//열쇠를 다 가지고 있을 경우를 고려하면 1+2+4+8+16+32=63
		visited = new boolean[64][N][M];
		
		for(int i=0;i<N;i++) {
			String Input = br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j]=Input.charAt(j);
			}
		}
		int I=0;int J=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]=='0') {
					I=i;J=j;
				}
			}
		}
		ans = Integer.MAX_VALUE;
		
		bfs(I,J,0,0);
		
		
		if(ans==Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);
		}
		br.close();
		
	}
	
	static void bfs(int r, int c, int cnt, int k) {
		Queue<Node> q = new LinkedList<>();
		
		q.add(new Node(r,c,cnt,k));
		
		visited[0][r][c]=true;
		
		while(!q.isEmpty()) {
			
			Node n = q.poll();
			
			if(map[n.r][n.c]=='1') {
				ans = n.cnt;
				break;
			}
			for(int d=0;d<4;d++) {
				int nr = n.r+dr[d];
				int nc = n.c+dc[d];
				if(nr<0 || nc<0 || nr>=N || nc>=M) {
					continue;
				}
				if(visited[n.key][nr][nc]) {
					continue;
				}
				if(map[nr][nc]=='#') {
					continue;
				}
				//대문자일때 (A,B,C,D,E,F 중 하나)
				if(65<=map[nr][nc] && map[nr][nc]<=90) {
					int door = (1 << (map[nr][nc]-65));
					
					//가지고있는 키현황에 도어의 2진수 각 자리가 다 있으면 해당 문은 열린다는 의미이므로
					if((n.key & door) > 0) {
						visited[n.key][nr][nc] = true;
						q.offer(new Node(nr, nc, n.cnt+1, n.key));						
					}
					
				}
				//소문자일때 (a,b,c,d,e,f 중 하나)
				else if(97<=map[nr][nc] && map[nr][nc]<=122) {
					int key = (1 << (map[nr][nc]-97));
					
					//이전키 보유현황과 값을 합쳐야 하므로
					key=(key|n.key);
					if(!visited[key][nr][nc]) {						
						visited[n.key][nr][nc] = true;
						visited[key][nr][nc] = true;
						q.offer(new Node(nr, nc, n.cnt+1, key));
					}
					
				}
				//그냥지나가도 되는길일때
				else if(map[nr][nc]=='0' || map[nr][nc]=='1' || map[nr][nc]=='.') {
					visited[n.key][nr][nc]=true;
					q.add(new Node(nr,nc,n.cnt+1,n.key));
				}
				
			}
			
		}
	}
}

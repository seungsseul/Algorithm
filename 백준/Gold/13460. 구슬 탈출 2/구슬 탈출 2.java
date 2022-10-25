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
	static int N, M, ans;
	static String[][] arr;
	static boolean[][][][] visited;
	static Queue<Node> red, blue;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static Node redball, blueball;
	static class Node {
		int r;
		int c;
		int cnt;
		public Node(int r, int c, int cnt) {
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}	
	}
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); 
		M = Integer.parseInt(st.nextToken());
		ans=-1;
		arr = new String[N][M];
		visited = new boolean[N][M][N][M];
		for(int i=0;i<N;i++) {
			String Input = br.readLine(); 
			for(int j=0;j<M;j++) {
				arr[i][j]=String.valueOf(Input.charAt(j));
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j].equals("R")) {
					redball = new Node(i, j, 0);	
				}
				else if(arr[i][j].equals("B")) {
					blueball = new Node(i, j, 0);
				}
			}
		}
		bfs(redball, blueball);
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		br.close();
		
	}

	
	static void bfs(Node redball, Node blueball) {
		red = new LinkedList<>();
		blue = new LinkedList<>();
		
		red.add(redball);
		blue.add(blueball);
		
		visited[redball.r][redball.c][blueball.r][blueball.c] = true;
		
		while(!red.isEmpty() && !blue.isEmpty()) {
			Node nr = red.poll();
			Node nb = blue.poll();
			
			if(nr.cnt>10) {
				ans=-1;
				return;
			}
			
			//파란색 공이 먼저 구멍에 빠진 경우
			if(arr[nb.r][nb.c].equals("O")) {
				continue;
			}
			
			//빨간색 공이 빠져나가고 파란색은 그대로 있는 경우
			if(arr[nr.r][nr.c].equals("O")) {
				ans = nr.cnt;
				return;
			}
			
			//상하좌우로 기울이기
			for(int d=0;d<4;d++) {
				//파란구슬
				int br = nb.r;
				int bc = nb.c;
				while(true) {
					br += dr[d];
					bc += dc[d];
					
					if(arr[br][bc].equals("O")) {
						break;
					}
					else if(arr[br][bc].equals("#")) {
						br -= dr[d];
						bc -= dc[d];
						break;
					}
				}
				//빨간구슬
				int rr = nr.r;
				int rc = nr.c;
				while(true) {
					rr += dr[d];
					rc += dc[d];
					
					if(arr[rr][rc].equals("O")) {
						break;
					}
					else if(arr[rr][rc].equals("#")) {
						rr -= dr[d];
						rc -= dc[d];
						break;
					}
				}
				
				//두 구슬의 위치가 동일하고 둘다 빠져나가지 않는 경우
				if(rr==br && rc==bc && !arr[rr][rc].equals("O")) {
					
					int rdis = Math.abs(nr.r - rr) + Math.abs(nr.c - rc);
					int bdis = Math.abs(nb.r - br) + Math.abs(nb.c - bc);
					
					//빨간구슬이 더 이동한 경우
					if(rdis>bdis) {
						rr -= dr[d];
						rc -= dc[d];
					}
					//파란구슬이 더 이동한 경우
					else {
						br -= dr[d];
						bc -= dc[d];
					}
				}
				
				//방문처리하고 큐에 추가
				if(!visited[rr][rc][br][bc]) {
					visited[rr][rc][br][bc]=true;
					
					red.add(new Node(rr, rc, nr.cnt+1));
					blue.add(new Node(br, bc, nb.cnt+1));
				}
			}
			
			
		}
		
		
	}
}


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
	static Queue<Node> q;
	static int N, K, L, ans, tmpr, tmpc;
	static int[][] arr;
	static int[] sec;
	static String[] turn;
	static boolean[][] snake;
	static String direc;
	static int[] dr = {0, 1, 0, -1};
	static int[] dc = {1, 0, -1, 0};
	
	static class Node {
		int row;
		int col;
		public Node(int row, int col) {
			this.row = row;
			this.col = col;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine()); //사과의 개수
		arr = new int[N][N];
		snake = new boolean[N][N];
		//arr(맵)에 사과세팅
		for(int i=0;i<K;i++) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1]++;
		}
		direc="";
		ans=0;tmpr=0;tmpc=0;
		L = Integer.parseInt(br.readLine()); //뱀의 방향 변환 횟수
		sec = new int[L];
		turn = new String[L];
		//몇초(sec)에 어느방향으로 방향을트는지(turn)각각 배열에 값 넣어주기
		for(int i=0;i<L;i++) {
			st = new StringTokenizer(br.readLine());
			sec[i] = Integer.parseInt(st.nextToken());
			turn[i] = st.nextToken();
		}
		//뱀의 처음 시작 위치
		snake[0][0]=true;
		q = new LinkedList<>();
		//순서대로 row, col, 현재시간, 방향적용row, 방향적용col
		dfs(0,0,0,dr[0],dc[0]);
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int r, int c, int cnt, int ankr, int ankc) {
		//q에 초기값 넣어서 꼬리 좌표 기억해주기
		q.add(new Node(r,c));
		direc="";
		//만약 해당시간이 된다면 움직이는 방향바꿔주기
		for(int i=0;i<L;i++) {
			if(cnt==sec[i]) {
				sec[i]=0;
				direc=turn[i];
			}
		}
		//어떤 방향인지에 따라 구분
		//L이나 R명령이 없었으면 기존 방향고수
			
		if(direc.equals("L")) {
			//dr, dc 배열을 순서대로 만들어 해당 배열에 위치한 값으로 방향최신화
			//만약 배열의 인덱스를 넘어가면 각 끝에 있는 배열인덱스값으로 최신화
			for(int d=0;d<4;d++) {
				if(ankr==dr[d] && ankc==dc[d]) {
					if(d-1==-1) {
						ankr=dr[3];
						ankc=dc[3];
						break;
					}
					else {
						ankr=dr[d-1];
						ankc=dc[d-1];
						break;
					}
				}
			}
			int nr = r+ankr;
			int nc = c+ankc;
			//벽이나 자기자신의 몸과 부딪힐 시 게임종료
			if(nr<0 || nc<0 || nr>=N || nc>=N || snake[nr][nc]) {
				//마지막 부딪힌 것도 1초가 흐른것이므로 +1하여 ans에 저장
				ans=cnt+1;
				return;
			}
			//초 추가해주고 뱀 머리부분 true로 변경
			cnt++;
			snake[nr][nc]=true;
			//사과가 있는 경우
			if(arr[nr][nc]==1) {
				arr[nr][nc]=0;
			}
			//사과가 없는 경우
			else {
				//q에 저장되었던 꼬리좌표값 빼서 해당좌표 false로 변경하고 dfs
				Node n = q.poll();
				snake[n.row][n.col]=false;
			}
			dfs(nr,nc,cnt,ankr,ankc);
		}
		//위와 같은방식으로 진행
		else if(direc.equals("D")) {
			for(int d=0;d<4;d++) {
				if(ankr==dr[d] && ankc==dc[d]) {
					if(d+1==4) {
						ankr=dr[0];
						ankc=dc[0];
						break;
					}
					else {
						ankr=dr[d+1];
						ankc=dc[d+1];
						break;
					}
				}
			}
			int nr = r+ankr;
			int nc = c+ankc;
			if(nr<0 || nc<0 || nr>=N || nc>=N || snake[nr][nc]) {
				ans=cnt+1;
				return;
			}
			cnt++;
			snake[nr][nc]=true;
			if(arr[nr][nc]==1) {
				arr[nr][nc]=0;
			}
			else {
				Node n = q.poll();
				snake[n.row][n.col]=false;
			}
			dfs(nr,nc,cnt,ankr,ankc);
		}
		//위와 같은방식으로 진행
		else {
			int nr = r+ankr;
			int nc = c+ankc;
			if(nr<0 || nc<0 || nr>=N || nc>=N || snake[nr][nc]) {
				ans=cnt+1;
				return;
			}
			cnt++;
			snake[nr][nc]=true;
			if(arr[nr][nc]==1) {
				arr[nr][nc]=0;
			}
			else {
				Node n = q.poll();
				snake[n.row][n.col]=false;
			}
			dfs(nr,nc,cnt,ankr,ankc);
		}
		
		
		
	}
}

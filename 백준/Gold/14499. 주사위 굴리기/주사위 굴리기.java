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
	static StringBuilder sb = new StringBuilder();
	static int N, M, x, y, K, nr, nc;
	static int[][] arr;
	static int[] order, dice;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); //지도의 세로크기
		M = Integer.parseInt(st.nextToken()); //지도의 가로크기
		x = Integer.parseInt(st.nextToken()); //주사위 y좌표
		y = Integer.parseInt(st.nextToken()); //주사위 x좌표
		K = Integer.parseInt(st.nextToken()); //명령의 개수
		arr = new int[N][M];
		//지도 세팅
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//명령배열만들어서 명령 순서대로 넣기
		order = new int[K];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<K;i++) {
			order[i]=Integer.parseInt(st.nextToken());
		}
		nr=x;nc=y;
		//0번:위, 1번:븍, 2번:동, 3번:서, 4번:남, 5번:아래로 생각하기
		dice = new int[6];
		//초기주사위위치row, 초기주사위위치col, 명령순서, 아랫면, 윗면
		move(x,y,0, dice[5], dice[0]);

		bw.write(sb.toString());
		bw.close();
		br.close();
	}
	static void move(int r, int c, int idx, int floor, int above) {
		//더이상 내릴 명령이 없으면 탈출
		if(idx==K) {
			return;
		}
		
		//동쪽
		if(order[idx]==1) {
			//해당 범위 안에 있으면
			if(c+1>=0 && c+1<M) {
				//이동한 방향대로 해당 위치값 재세팅
				int tmp=dice[5];
				dice[5]=dice[2];
				dice[2]=dice[0];
				dice[0]=dice[3];
				dice[3]=tmp;
				//세팅한 값으로 윗면 아랫면 최신화
				above=dice[0];
				floor=dice[5];
				//일단 윗면값 sb에 넣어주고
				sb.append(above).append("\n");
				//주사위를 굴렸을때 이동한 칸에 쓰인수가 0이면
				//주사위 아랫면에 쓰인수 칸에 복사
				if(arr[r][c+1]==0) {
					arr[r][c+1]=dice[5];
				}
				//아니면 칸에쓰인수가 주사위 아랫면으로 복사되고 칸에쓰인수 0으로 최신화
				else {
					dice[5]=arr[r][c+1];
					arr[r][c+1]=0;
				}
				//이동한 후 현재 주사위 좌표
				nr=r;
				nc=c+1;
				//최신화된 아랫면 위치
				floor=dice[5];
			}
		}
		//서쪽
		else if(order[idx]==2) {
			//위와 같은 방식
			if(c-1>=0 && c-1<M) {
				int tmp=dice[5];
				dice[5]=dice[3];
				dice[3]=dice[0];
				dice[0]=dice[2];
				dice[2]=tmp;
				above=dice[0];
				floor=dice[5];
				sb.append(above).append("\n");
				if(arr[r][c-1]==0) {
					arr[r][c-1]=dice[5];
				}
				else {
					dice[5]=arr[r][c-1];
					arr[r][c-1]=0;
				}
				nr=r;
				nc=c-1;
				floor=dice[5];
			}
		}
		//북쪽
		else if(order[idx]==3) {
			//위와 같은 방식
			if(r-1>=0 && r-1<N) {
				int tmp=dice[5];
				dice[5]=dice[1];
				dice[1]=dice[0];
				dice[0]=dice[4];
				dice[4]=tmp;
				above=dice[0];
				floor=dice[5];
				sb.append(above).append("\n");
				if(arr[r-1][c]==0) {
					arr[r-1][c]=dice[5];
				}
				else {
					dice[5]=arr[r-1][c];
					arr[r-1][c]=0;
				}
				nr=r-1;
				nc=c;
				floor=dice[5];
			}
		}
		//남쪽
		else if(order[idx]==4) {
			//위와 같은 방식
			if(r+1<N && r+1>=0) {	
				int tmp=dice[5];
				dice[5]=dice[4];
				dice[4]=dice[0];
				dice[0]=dice[1];
				dice[1]=tmp;
				above=dice[0];
				floor=dice[5];
				sb.append(above).append("\n");
				if(arr[r+1][c]==0) {
					arr[r+1][c]=dice[5];
				}
				else {
					dice[5]=arr[r+1][c];
					arr[r+1][c]=0;
				}
				nr=r+1;
				nc=c;
				floor=dice[5];
			}
		}
		//해당 최신화된 변수들로 재귀
		move(nr,nc,idx+1,floor,above);
		
	}
}

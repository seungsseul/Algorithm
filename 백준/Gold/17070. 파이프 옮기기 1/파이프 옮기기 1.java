import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] map;
	static int ans=0;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		//배열에 맵 세팅
		map = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		//기본값 설정 (r=0, c=1, state=2 인 이유는 기본위치 중 이동하는 끄트머리 좌표가 0,1이고 가로형태로 놓여있기 때문
		push(0,1,2);
		
		System.out.println(ans);
		br.close();
		
	}
	
	//state = 2:가로, 3:세로, 4:대각선
	static void push(int r, int c, int state) {
		//기저조건(=탈출부)
		//도착점에 도달했다는 의미이므로 카운트 세주고 return
		if(r==N-1 && c==N-1) {
			ans++;
			return;
		}
		
		//가로
		if(state==2) {
			//가로로 이동하는 경우
			if(c+1<N) {									
				if(map[r][c+1]==0) {
					push(r,c+1,2);
				}
			}
			//대각선으로 이동하는 경우
			if(r+1<N && c+1<N) {									
				if(map[r+1][c]==0 && map[r+1][c+1]==0 && map[r][c+1]==0) {
					push(r+1,c+1,4);
				}
			}
		}
		
		//세로
		else if(state==3) {
			//세로로 이동하는 경우
			if(r+1<N) {									
				if(map[r+1][c]==0) {
					push(r+1,c,3);
				}
			}
			//대각선으로 이동하는 경우
			if(r+1<N && c+1<N) {									
				if(map[r+1][c]==0 && map[r+1][c+1]==0 && map[r][c+1]==0) {
					push(r+1,c+1,4);
				}
			}
		}
		
		//대각선
		else if(state==4) {
			//가로로 이동하는 경우
			if(c+1<N) {									
				if(map[r][c+1]==0) {
					push(r,c+1,2);
				}
			}
			//세로로 이동하는 경우
			if(r+1<N) {									
				if(map[r+1][c]==0) {
					push(r+1,c,3);
				}
			}
			//대각선으로 이동하는 경우
			if(r+1<N && c+1<N) {									
				if(map[r+1][c]==0 && map[r+1][c+1]==0 && map[r][c+1]==0) {
					push(r+1,c+1,4);
				}
			}
		}
	}
}

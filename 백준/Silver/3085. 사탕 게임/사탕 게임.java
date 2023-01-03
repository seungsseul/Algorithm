import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, max, cnt;
	static String Input, tmp;
	static String[][] arr;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new String[N][N];
		for(int i=0;i<N;i++) {
			Input = br.readLine();
			for(int j=0;j<N;j++) {
				arr[i][j]=String.valueOf(Input.charAt(j));
			}
		}
		max=-1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				change(i, j);
			}
		}
		bw.write(String.valueOf(max));
		bw.flush();bw.close();br.close();
	}
	static void change(int r, int c) {
		
		for(int d=0;d<4;d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(nr>=0 && nc>=0 && nr<N && nc<N) {
				//두 사탕의 위치 바꾸기
				tmp=arr[nr][nc];
				arr[nr][nc]=arr[r][c];
				arr[r][c]=tmp;
				cnt=0;
				//바꾼 라인의 행조사
				for(int i=0;i<N;i++) {
					if(arr[i][c].equals(arr[r][c])) {
						cnt++;
						if(max<cnt) {
							max=cnt;
						}
					}
					else {
						if(max<cnt) {
							max=cnt;
						}
						cnt=0;
					}
				}
				//바꾼 라인의 열조사
				cnt=0;
				for(int j=0;j<N;j++) {
					if(arr[r][j].equals(arr[r][c])) {
						cnt++;
						if(max<cnt) {
							max=cnt;
						}
					}
					else {
						if(max<cnt) {
							max=cnt;
						}
						cnt=0;
					}
				}
				//다시 원상복구 시키기
				tmp=arr[r][c];
				arr[r][c]=arr[nr][nc];
				arr[nr][nc]=tmp;
			}
		}
		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[100][100];
		int cnt=0;
		//100x100 2차원 배열의 값을 다 0으로 기본세팅
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				arr[i][j]=0;
			}
		}
		//값을 불러와서 0이나 그 이상일 경우 계속 해당자리의 값을 1씩 증가시켜줌
		for(int t=0;t<T;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int cpr = 99-r-9; //10x10 색종이의 왼쪽 위 좌표 (row)
			int cpc = 0+c; //10x10 색종이의 왼쪽 위 좌표 (column)
			
			//색종이의 왼쪽위 꼭지점 좌표에서 시작하여 10x10동안 카운트 늘리기
			for(int i=cpr;i<cpr+10;i++) {
				for(int j=cpc;j<cpc+10;j++) {
					if(arr[i][j]==0) {
						arr[i][j]+=1;
					}
					else {
						arr[i][j]+=1;
					}
				}
			}
		}
		//테스트케이스가 끝난후 카운팅된 2차원 배열에서 1이상인 값 세기
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {				
				if(arr[i][j]>=1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
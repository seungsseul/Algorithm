import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int[][] arr = new int[100][100];
		for(int t=0;t<4;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int downx = Integer.parseInt(st.nextToken());
			int downy = Integer.parseInt(st.nextToken());
			int upx = Integer.parseInt(st.nextToken());
			int upy = Integer.parseInt(st.nextToken());
			for(int i=99-upy;i<99-downy;i++) {
				for(int j=downx;j<upx;j++) {
					if(arr[i][j]>=0) {
						arr[i][j]+=1;
					}
				}
			}
		}
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
import java.util.Scanner;

public class Main {
		static int n;
		static int[][] map;
		static int[] dr_Arr= {1,-1,0,0};
		static int[] dc_Arr= {0,0,1,-1};
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			n=sc.nextInt();
			map=new int[102][102];
			for (int k = 0; k < n; k++) {
				int c=sc.nextInt();
				int r=sc.nextInt();
				for (int i = r+1; i <= r+10; i++) {
					for (int j = c+1; j <= c+10; j++) {
						map[i][j]=1;
					}
				}
			}
			
			int cnt=0;
			for (int i = 0; i < 102; i++) {
				for (int j = 0; j < 102; j++) {
					if(map[i][j]==1) {
						for (int k = 0; k < 4; k++) {
							int dr=i+dr_Arr[k];
							int dc=j+dc_Arr[k];
							if(dr<0 || dc<0 || dr>=102 || dc>=102) {
								continue;
							}
							if(map[dr][dc]==0) {
								cnt+=1;
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
}
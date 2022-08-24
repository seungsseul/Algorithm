import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][N];
			arr[N/2-1][N/2-1]=2;
			arr[N/2-1][N/2]=1;
			arr[N/2][N/2-1]=1;
			arr[N/2][N/2]=2;
			int[] dr = {-1,1,0,0,-1,-1,1,1};
			int[] dc = {0,0,-1,1,-1,1,-1,1};
			for(int m=0;m<M;m++) {
				int i=sc.nextInt()-1;
				int j=sc.nextInt()-1;
				int blackorwhite = sc.nextInt();
				arr[i][j]=blackorwhite;
				int nr=0;
				int nc=0;
				Loop1:
				for(int p=0;p<8;p++) {
					nr = i+dr[p];
					nc = j+dc[p];
					while(true) {
						if(nr<0 || nc<0 || nr>=N || nc>=N || arr[nr][nc]==0) {
							continue Loop1;
						}
						if(arr[nr][nc]!=arr[i][j]) {
							nr+=dr[p];
							nc+=dc[p];
						}
						else {
							break;
						}
					}
					while(nr!=i || nc!=j) {
						arr[nr][nc]=arr[i][j];
						nr-=dr[p];
						nc-=dc[p];
					}
				}
			}
			int black=0;
			int white=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j]==1) {
						black++;
					}
					else if(arr[i][j]==2) {
						white++;
					}
				}
			}
			System.out.println("#"+t+" "+black+" "+white);
		}
		sc.close();
	}
}
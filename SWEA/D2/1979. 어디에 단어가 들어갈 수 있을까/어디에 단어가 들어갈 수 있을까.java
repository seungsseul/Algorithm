import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] arr = new int[N][N];
			for(int i=0;i<N;i++ ) {
				for(int j=0;j<N;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			int r_cnt=0;
			int c_cnt=0;
			int real_cnt=0;
			for(int i=0;i<N;i++ ) {
				for(int j=0;j<N;j++) {
					if(arr[i][j]==1) {
						r_cnt=0;
						for(int k=0;k<K;k++) {
							if(j+k<0 || j+k>=N) {
								continue;
							}
							if(arr[i][j+k]==1) {
								r_cnt++;
							}
						}
						c_cnt=0;
						for(int k=0;k<K;k++) {
							if(i+k<0 || i+k>=N) {
								continue;
							}
							if(arr[i+k][j]==1) {
								c_cnt++;
							}
						}
						if(j+K>=0 && j+K<N && j-1>=0) {
							if(r_cnt==K && arr[i][j+K]==0 && arr[i][j-1]==0) {
								real_cnt++;
							}
						}
						else if(j+K>=0 && j+K==N) {
							if(r_cnt==K && arr[i][j-1]==0) {
								real_cnt++;
							}
						}
						else if(j+K>=0 && j-1==-1) {
							if(r_cnt==K && arr[i][j+K]==0) {
								real_cnt++;
							}
						}
						if(i+K>=0 && i+K<N && i-1>=0) {
							if(c_cnt==K && arr[i+K][j]==0 && arr[i-1][j]==0) {
								real_cnt++;
							}
						}
						else if(i+K>=0 && i+K==N) {
							if(c_cnt==K && arr[i-1][j]==0) {
								real_cnt++;
							}
						}
						else if(i+K>=0 && i-1==-1) {
							if(c_cnt==K && arr[i+K][j]==0) {
								real_cnt++;
							}
						}
					}
				}
			}
			System.out.println("#"+t+" "+real_cnt);
		}
		sc.close();
	}
}
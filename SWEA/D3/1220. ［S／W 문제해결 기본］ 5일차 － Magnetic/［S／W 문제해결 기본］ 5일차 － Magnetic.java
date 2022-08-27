import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		for(int t=1;t<=10;t++) {
			int table = sc.nextInt();
			for(int i=0;i<table;i++) {
				for(int j=0;j<table;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int cnt=0; //교착상태 카운트
			int red=0;
			//for문의 j와 i를 바꾼 이유는 세로로 배열을 탐색하기 위함(위에서 아래로)
			for(int j=0;j<table;j++) {
				for(int i=0;i<table;i++) {
					//N극
					if(arr[i][j]==1) {
						red++;
						for(int k=i+1;k<table;k++) {							
							if(arr[k][j]==1) {
								red++;
								continue;
							}
							else if(red !=0 && arr[k][j]==2) {
								red=0;
								cnt++;
								continue;
							}
						}
						red=0;
						break;
					}
					//S극
					else if(arr[i][j]==2) {
						arr[i][j]=0;
					}
				}
			}
			System.out.println("#"+t+" "+cnt);
		}
		sc.close();
	}
}
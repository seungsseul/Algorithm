import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				int door = sc.nextInt();
				arr[i]=door;
			}
			int check=0;
			int cnt=0;	
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==1) {
					check=0;
					continue;
				}
				else {
					check++;
				}
				if(check==D) {
					arr[i]=1;
					cnt++;
					check=0;
				}
			}
			System.out.println("#"+t+" "+cnt);
		}
		sc.close();
	}
}
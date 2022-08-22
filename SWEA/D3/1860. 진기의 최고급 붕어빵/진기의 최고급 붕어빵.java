import java.util.Arrays;
import java.util.Scanner;

public class Solution {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int sec = 0;
			int fishcake = 0;
			Loop1:
			for(int i=0;i<=arr[arr.length-1];i++) {
				sec=i;
				if(sec%M==0) {
					if(sec>=1) {
						fishcake+=K;			
					}
				}
				for(int j=0;j<arr.length;j++) {						
					if(arr[j]==sec) {
						if(fishcake<=0) {
							System.out.println("#"+t+" Impossible");
							break Loop1;
						}
						else {								
							fishcake--;
						}
					}
				}
				if(sec==arr[arr.length-1]) {
					System.out.println("#"+t+" Possible");
					break;
				}
			}
		}
		sc.close();
	}
}
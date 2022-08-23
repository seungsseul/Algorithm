import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			String S = sc.next();
			char[] arr = new char[S.length()];
			for(int i=0;i<arr.length;i++) {
				arr[i]=S.charAt(i);
			}
			int cnt=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]=='x') {
					cnt++;
				}
			}
			if(cnt<8) {
				System.out.println("#"+t+" YES");
			}
			else {
				System.out.println("#"+t+" NO");
			}
		}
		sc.close();
	}
}
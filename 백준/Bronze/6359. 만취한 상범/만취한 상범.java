import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			String run = "o".repeat(n);
			StringBuilder result = new StringBuilder(run);
			for(int i=2;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(j%i==0) {
						if(result.charAt(j-1)=='o') {
							result.setCharAt(j-1, 'x');
						}
						else if(result.charAt(j-1)=='x') {
							result.setCharAt(j-1, 'o');
						}
					}
				}
			}
			int cnt = 0;
			for(int i=0;i<result.length();i++) {
				if(result.charAt(i)=='o') {
					cnt++;
				}
			}
			System.out.println(cnt);
			T--;
		}
		sc.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for(int i=1;i<=8;i++) {
			String x = sc.next();
			for(int j=1;j<=8;j++) {
				if(i%2!=0 && j%2!=0) {
					if(String.valueOf(x.charAt(j-1)).equals("F")) {
						cnt++;
					}
				}
				else if(i%2==0 && j%2==0) {
					if(x.charAt(j-1)=='F') {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
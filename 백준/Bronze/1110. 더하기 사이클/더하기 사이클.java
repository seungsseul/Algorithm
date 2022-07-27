import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int b = N;
		for(int i=0;i>=0;i++) {
			int a = b/10+b%10;
			b = (b%10)*10+a%10;
			cnt++;
			if (b == N) {
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
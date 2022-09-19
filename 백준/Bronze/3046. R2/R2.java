import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R1 = sc.nextInt();
		int S = sc.nextInt();
		// S=(R1+R2)/2이므로 R2를 구하기 위한 연산
		System.out.println(2*S-R1);
		sc.close();
	}
}
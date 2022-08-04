import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(); //대각선 길이
		int H = sc.nextInt(); //높이 비율
		int W = sc.nextInt(); //너비 비율
		double x; //비례상수
		x=D/Math.sqrt(H*H+W*W);
		System.out.println((int)(x*H)+" "+(int)(x*W));
		sc.close();
	}
}
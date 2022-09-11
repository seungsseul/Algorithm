import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//string으로 두 값을 받아서 더해준 문자열을 long으로 변환
		long ab = Long.parseLong(sc.next()+sc.next());
		long cd = Long.parseLong(sc.next()+sc.next());
		System.out.println(ab+cd);
		sc.close();
	}
}
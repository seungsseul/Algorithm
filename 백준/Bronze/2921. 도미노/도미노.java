import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum=0;
		//(0,0),(0,1),(0,2)...순으로 증가하기 때문에 해당값을 sum에 계속 더해주면됨
		for(int i=0;i<=N;i++) {
			for(int j=i;j<=N;j++) {
				sum += (i + j);
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
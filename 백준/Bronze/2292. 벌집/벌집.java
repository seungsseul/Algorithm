import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum=1;
		int cnt=0;
		int N = sc.nextInt();
		while(true) {
			num++;
			sum+=6*num;
			cnt++;
			if(sum>=N) {
				break;
			}
		}
		if(N==1) {
			System.out.println(1);
		}
		else {
			System.out.println(cnt+1);			
		}
		sc.close();
	}
}
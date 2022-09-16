import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt=0;
		Loop1:
		for(int t=1;t<=N;t++) {
			int sosu=sc.nextInt();
			if(sosu!=1) {
				for(int i=2;i<=sosu;i++) {
					if(i!=sosu && sosu%i==0) {
						continue Loop1;
					}
				}
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
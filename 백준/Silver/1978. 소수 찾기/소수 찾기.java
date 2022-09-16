import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt=0;
		Loop1:
		for(int t=1;t<=N;t++) {
			int sosu=sc.nextInt();
			//1은 소수가 아님
			if(sosu!=1) {
				//2부터 입력값까지 for문 돌려서 i가 소수가 아닌데 입력값%i가 0이면 카운트 세지않음
				for(int i=2;i<=sosu;i++) {
					if(i!=sosu && sosu%i==0) {
						continue Loop1;
					}
				}
				//continue Loop1에 안걸렸으면 소수이므로 카운트
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
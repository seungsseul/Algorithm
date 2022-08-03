import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<100;i++) {
			if((N/100*100+cnt)%F==0) {
				if(cnt<10) {
					System.out.println("0"+cnt);
				}
				else {
					System.out.println(cnt);
				}
				break;
			}
			else {
				cnt++;
			}
		}
		sc.close();
	}
}
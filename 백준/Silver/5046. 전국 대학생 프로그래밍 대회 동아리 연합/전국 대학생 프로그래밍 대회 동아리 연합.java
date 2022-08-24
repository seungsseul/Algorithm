import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //참가자 수
		int B = sc.nextInt(); //예산
		int H = sc.nextInt(); //호텔 수
		int W = sc.nextInt(); //고를 수 있는 주의 개수
		int min=Integer.MAX_VALUE;
		int[] price = new int[W];
		for(int h=0;h<H;h++) {
			int p = sc.nextInt(); //해당 호텔의 1인당 숙박비용
			for(int i=0;i<W;i++) {
				int a = sc.nextInt(); //각 주에 투숙 가능한 인원
				if(a>=N && B>=p*N) {
					price[i] = p*N;					
				}
			}
			for(int i=0;i<price.length;i++) {
				if(price[i]!=0) {
					if(min>price[i]) {
						min=price[i];
					}
				}
			}
		}
		if(min==Integer.MAX_VALUE) {
			System.out.println("stay home");
		}
		else {			
			System.out.println(min);
		}
		sc.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //수학여행 참가학생수
		int K = sc.nextInt(); //한방 최대 인원수
		int[] male = new int[7];
		int[] female = new int[7];
		for(int t=1;t<=N;t++) {
			int sex=sc.nextInt();
			int grade = sc.nextInt();
			for(int i=1;i<7;i++) {
				if(sex==1 && grade==i) {					
					male[i]++;
				}
				else if(sex==0 && grade==i) {
					female[i]++;
				}
			}
		}
		int cnt=0;
		for(int i=1;i<7;i++) {
			int maleroom = male[i]/K;
			if(male[i]%K!=0) {
				maleroom++;
			}
			int femaleroom = female[i]/K;
			if(female[i]%K!=0) {
				femaleroom++;
			}
			cnt+=maleroom;
			cnt+=femaleroom;
		}
		System.out.println(cnt);
		sc.close();
	}
}
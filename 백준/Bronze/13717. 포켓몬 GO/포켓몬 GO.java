import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int idx=0;
		int sum=0;
		String[] poketmon = new String[N];
		int[] poketmonNum = new int[N];
		for(int i=0;i<N;i++) {
			String P = sc.next();
			poketmon[idx]=P;
			int K = sc.nextInt();
			int M = sc.nextInt();
			int cnt=0;
			while(M>=K) {
				M-=K;
				M+=2;
				cnt++;
			}
			poketmonNum[idx] = cnt;
			sum += cnt;
			idx++;
		}
		int num=0;
		for(int i=poketmonNum.length-1;i>=0;i--) {
			if(poketmonNum[i]>=num) {
				num=poketmonNum[i];
				idx=i;
			}
		}
		System.out.println(sum);
		System.out.println(poketmon[idx]);
		sc.close();
	}
}
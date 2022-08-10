import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int temp = M;
		int[] arr = new int[N];
		int cnt=1;
		for(int i=0;i<N;i++) {
			int kg = sc.nextInt();
			arr[i]=kg;
		}
		for(int j=0;j<N;j++) {
			if(M<arr[j]) {
				cnt++;
				M=temp;
			}
			M=M-arr[j];
		}
		if(N==0) {
			System.out.println(0);
		}
		else {
			System.out.println(cnt);
		}
		sc.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N==0 && M==0) {
				break;
			}
			int[] arr = new int[M];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<N;i++) {
				if(arr[i]<M/N) {
					sum+=arr[i];
				}
				else {
					sum+=M/N;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}

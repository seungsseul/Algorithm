import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		int[] arr = new int[N+1];
		int idx=1;
		arr[idx]++;
		int cnt=0;
		while(true) {
			if(arr[idx]==M) {
				break;
			}
			if(arr[idx]%2==1) {
				idx+=L;
				if(idx>N) {
					idx=idx-N;
				}
				arr[idx]++;
				cnt++;
			}
			else {
				idx-=L;
				if(idx<=0) {
					idx=idx+N;
				}
				arr[idx]++;
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
import java.util.Scanner;

public class Solution {
	static int N, K, sum, cnt;
	static int[] arr;
	static boolean[] check;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			N = sc.nextInt();
			K = sc.nextInt();
			arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			check = new boolean[N];
			sum=0;
			cnt=0;
			Sum(0);
			System.out.println("#"+t+" "+cnt);
		}
		sc.close();
	}
	
	static void Sum(int idx) {
		if(idx==N) {
			sum=0;
			for(int i = 0; i < arr.length; i++) {
				if(check[i]) {
					sum+=arr[i];
				}
			}
			if(sum==K) {
				cnt++;
			}
			return;
		}	
		check[idx]=true;
		Sum(idx+1);
		check[idx]=false;
		Sum(idx+1);
	}
}
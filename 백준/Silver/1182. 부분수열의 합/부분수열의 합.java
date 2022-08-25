import java.util.Scanner;

public class Main {
	static int N,S, sum, cnt;
	static int[] arr;
	static boolean[] check;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		check = new boolean[N];
		sum=0;
		cnt=0;
		SUM(0);
		System.out.println(cnt);
        sc.close();
	}
	
	static void SUM(int idx) {
		if(idx==N) {
			sum=0;
			int check2=0;
			for(int i=0;i<arr.length;i++) {
				if(check[i]) {
					sum+=arr[i];
					check2++;
				}
			}
			if(sum==S && check2!=0) {
				cnt++;
			}
			return;
		}
		check[idx]=true;
		SUM(idx+1);
		check[idx]=false;
		SUM(idx+1);
		
	}
}
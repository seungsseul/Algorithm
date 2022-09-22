

import java.util.Scanner;

public class Solution {
	
	static int N, M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			int T = sc.nextInt();
			N = sc.nextInt();
			M = sc.nextInt();
			System.out.println("#"+T+" "+pow(N,M));
		}
	}
	
	static int pow(int n, int m) {
		if(m==1) {
			return n;
		}
		int res;
		if(m%2==0) {
			res = pow(n, m/2);
			return res*res;
		}
		else {
			res = pow(n, (m-1)/2);
			return res*res*n;
		}
		
	}

}

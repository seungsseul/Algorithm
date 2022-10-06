import java.util.Scanner;

public class Solution {
	static int N, L, Ti, Ki , cal_sum, score_sum, max;
	static int[] score_arr;
	static int[] cal_arr;
	static boolean[] check;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			N = sc.nextInt();
			L = sc.nextInt();
			score_arr = new int[N];
			cal_arr = new int[N];
			for(int r=0;r<N;r++) {
				Ti = sc.nextInt();
				score_arr[r]=Ti;
				Ki = sc.nextInt();
				cal_arr[r]=Ki;
			}
			check = new boolean[N];
			max=0;
			combi(0);
			System.out.println("#"+t+" "+max);
		}
	}
	
	public static void combi(int num) {	
		if(num==N) {
			cal_sum=0;
			score_sum=0;
			for(int i=0;i<N;i++) {
				if(check[i]) {
					cal_sum+=cal_arr[i];
					score_sum+=score_arr[i];
					if(cal_sum<=L) {
						max=Math.max(score_sum, max);
					}
				}
			}
			return;
		}
		check[num]=true;
		combi(num+1);
		check[num]=false;
		combi(num+1);
	}
}
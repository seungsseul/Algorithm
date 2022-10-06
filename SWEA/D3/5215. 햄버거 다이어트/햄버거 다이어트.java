import java.util.Scanner;

public class Solution {
	static int N, L, Ti, Ki, cal_sum, score_sum, max;
	static int[] score_arr;
	static int[] cal_arr;
	static boolean[] check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt(); // 재료의 수
			L = sc.nextInt(); // 제한칼로리
			score_arr = new int[N + 1];
			cal_arr = new int[N + 1];
			for (int r = 1; r <= N; r++) {
				Ti = sc.nextInt();
				score_arr[r] = Ti; // 점수
				Ki = sc.nextInt();
				cal_arr[r] = Ki; // 칼로리
			}

			// 제한 칼로리만큼의 배열만들어서
			int[][] dp = new int[N + 1][L + 1];

			// 현재칼로리가 해당위치의 칼로리기준을 넘으면 이전행 같은열에 있는 값으로 해당자리 갱신 (이전 재료것이 최고여)
			// 아니라면 이전행 이전열에 현재가치를 더한값과 이전행 같은열의 값을 비교
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= L; j++) {
					if (cal_arr[i] > j) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - cal_arr[i]] + score_arr[i]);
					}
				}
			}

			System.out.println("#" + t + " " + dp[N][L]);
		}
		sc.close();
	}
}
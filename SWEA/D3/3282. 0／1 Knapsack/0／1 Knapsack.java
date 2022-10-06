import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 물건
			int K = Integer.parseInt(st.nextToken()); // 부피

			int[][] arr = new int[N + 1][2];

			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken()); // Vi : 무게
				arr[i][1] = Integer.parseInt(st.nextToken()); // Ci : 가치
			}

			int[][] dp = new int[N + 1][K + 1];

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= K; j++) {
					if (arr[i][0] > j) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[i][0]] + arr[i][1]);
					}
				}
			}
			sb.append("#").append(t).append(" ").append(dp[N][K]).append("\n");
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
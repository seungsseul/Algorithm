import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[100001];
		dp[0] = 0;
		st = new StringTokenizer(br.readLine());
		for (int t = 1; t <= n; t++) {
			dp[t] = Integer.parseInt(st.nextToken());
		}
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			if (dp[i - 1] > 0 && dp[i] + dp[i - 1] > 0) {
				dp[i] += dp[i - 1];
			}
			if (max < dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}

}

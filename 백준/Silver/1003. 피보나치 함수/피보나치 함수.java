import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] dp = new int[41];
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 1;
			for (int i = 3; i <= N; i++) {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
			if (N == 0) {
				System.out.println(1 + " " + 0);
			} else {
				System.out.println(dp[N - 1] + " " + dp[N]);
			}
		}

	}

}

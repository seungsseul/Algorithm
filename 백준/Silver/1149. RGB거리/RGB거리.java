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
		int[][] dp = new int[2][3];
		st = new StringTokenizer(br.readLine());
		dp[0][0] = Integer.parseInt(st.nextToken());
		dp[0][1] = Integer.parseInt(st.nextToken());
		dp[0][2] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			dp[1][0] = Math.min(dp[0][1], dp[0][2]) + Integer.parseInt(st.nextToken());
			dp[1][1] = Math.min(dp[0][2], dp[0][0]) + Integer.parseInt(st.nextToken());
			dp[1][2] = Math.min(dp[0][1], dp[0][0]) + Integer.parseInt(st.nextToken());

			dp[0][0] = dp[1][0];
			dp[0][1] = dp[1][1];
			dp[0][2] = dp[1][2];
		}
		int min = Math.min(Math.min(dp[0][0], dp[0][1]), dp[0][2]);
		System.out.println(min);
	}
}

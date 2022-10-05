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
		int[][] dp2 = new int[2][3];
		st = new StringTokenizer(br.readLine());
		int Input1 = Integer.parseInt(st.nextToken());
		int Input2 = Integer.parseInt(st.nextToken());
		int Input3 = Integer.parseInt(st.nextToken());
		dp[0][0] = Input1;
		dp[0][1] = Input2;
		dp[0][2] = Input3;
		
		dp2[0][0] = Input1;
		dp2[0][1] = Input2;
		dp2[0][2] = Input3;
		
		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int input1 = Integer.parseInt(st.nextToken());
			int input2 = Integer.parseInt(st.nextToken());
			int input3 = Integer.parseInt(st.nextToken());
			dp[1][0] = Math.min(dp[0][0], dp[0][1]) + input1;
			dp[1][1] = Math.min(Math.min(dp[0][0], dp[0][1]), dp[0][2]) + input2;
			dp[1][2] = Math.min(dp[0][1], dp[0][2]) + input3;

			dp[0][0] = dp[1][0];
			dp[0][1] = dp[1][1];
			dp[0][2] = dp[1][2];
			
			dp2[1][0] = Math.max(dp2[0][0], dp2[0][1]) + input1;
			dp2[1][1] = Math.max(Math.max(dp2[0][0], dp2[0][1]), dp2[0][2]) + input2;
			dp2[1][2] = Math.max(dp2[0][1], dp2[0][2]) + input3;

			dp2[0][0] = dp2[1][0];
			dp2[0][1] = dp2[1][1];
			dp2[0][2] = dp2[1][2];
		}
		int min = Math.min(Math.min(dp[0][0], dp[0][1]), dp[0][2]);
		int max = Math.max(Math.max(dp2[0][0], dp2[0][1]), dp2[0][2]);
		System.out.println(max+" "+min);
		
	
	}
}

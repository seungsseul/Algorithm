import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int t=1;t<=T;t++) {
			int n = Integer.parseInt(br.readLine());
			int[] dp = new int[11];
			dp[0]=0;
			dp[1]=1;
			dp[2]=2;
			dp[3]=4;
			for(int i=4;i<=n;i++) {
				dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
			}
			sb.append(dp[n]).append("\n");
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}

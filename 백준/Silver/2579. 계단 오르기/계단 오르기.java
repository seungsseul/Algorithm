import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		int[] score = new int[301];
		int[] dp = new int[301];
		for (int i = 1; i <= n; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		dp[0]=0;
		dp[1]=score[1];
		dp[2]=score[1]+score[2];
		for (int i = 3; i <= n; i++) {
			dp[i]=Math.max(dp[i-3]+score[i-1], dp[i-2])+score[i];
		}
		System.out.println(dp[n]);
	}
}

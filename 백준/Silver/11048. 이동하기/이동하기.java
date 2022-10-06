import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] map = new int[N + 1][M + 1];
		int[][] result = new int[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		result[1][1] = map[1][1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				result[i][j] = map[i][j] + Math.max(Math.max(result[i - 1][j - 1], result[i - 1][j]), result[i][j - 1]);
			}
		}
		System.out.println(result[N][M]);

	}
}

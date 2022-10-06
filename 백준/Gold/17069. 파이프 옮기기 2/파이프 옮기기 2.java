import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[][] map;
	static long[][][] result;
	static long ans = 0;
	static int N, state;

	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		// 배열에 맵 세팅
		state = 0;
		map = new int[N + 1][N + 1];
		result = new long[N + 1][N + 1][3];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 0:가로, 1:세로, 3:대각선
		result[1][2][0] = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = 3; j <= N; j++) {
				if (map[i][j] == 1) {
					continue;
				}

				result[i][j][0] = result[i][j - 1][0] + result[i][j - 1][2];
				result[i][j][1] = result[i - 1][j][1] + result[i - 1][j][2];
				if (map[i - 1][j] == 0 && map[i][j - 1] == 0) {
					result[i][j][2] = result[i - 1][j - 1][0] + result[i - 1][j - 1][1] + result[i - 1][j - 1][2];
				}
			}
		}

		System.out.println(result[N][N][0] + result[N][N][1] + result[N][N][2]);
		br.close();

	}
}
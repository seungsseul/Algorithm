import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int Sr, Sc, N, M, H, W;
	static int[][] arr;

	static class Node {
		int r, c, cnt;

		Node(int r, int c, int cnt) {
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		Sr = Integer.parseInt(st.nextToken()) - 1;
		Sc = Integer.parseInt(st.nextToken()) - 1;
		int Fr = Integer.parseInt(st.nextToken()) - 1;
		int Fc = Integer.parseInt(st.nextToken()) - 1;

		int ans = Integer.MAX_VALUE;
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(Sr, Sc, 0));
		visited[Sr][Sc] = true;
		while (!queue.isEmpty()) {
			Node n = queue.poll();

			if (n.r == Fr && n.c == Fc) {
				if (ans > n.cnt) {
					ans = n.cnt;
				}
				break;
			}
			for (int d = 0; d < 4; d++) {
				int nr = n.r + dr[d];
				int nc = n.c + dc[d];
				if (nr < 0 || nc < 0 || nr >= N || nc >= M) {
					continue;
				}
				if (visited[nr][nc]) {
					continue;
				}
				if (!possible(nr, nc)) {
					continue;
				}
				visited[nr][nc] = true;
				queue.add(new Node(nr, nc, n.cnt + 1));

			}
		}

		if (ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
		br.close();
	}

	static boolean possible(int nr, int nc) {
		for (int i = nr; i < nr + H; i++) {
			for (int j = nc; j < nc + W; j++) {
				if (i < 0 || j < 0 || i >= N || j >= M || arr[i][j] == 1) {
					return false;
				}

			}
		}
		return true;
	}
}

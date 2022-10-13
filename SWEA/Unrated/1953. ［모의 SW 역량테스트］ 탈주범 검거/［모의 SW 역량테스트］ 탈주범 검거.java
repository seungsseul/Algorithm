
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static boolean[][] visited, check;
	static int[][] arr;
	static int N, M, R, C, L; // 행, 열, 맨홀뚜껑r좌표, 맨홀뚜껑c좌표, 탈출 후 소요된 시간 L
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int[][] tunnelR, tunnelC;

	static class Node {
		int row;
		int col;
		int cnt;

		public Node(int row, int col, int cnt) {
			super();
			this.row = row;
			this.col = col;
			this.cnt = cnt;
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			sb.append("#").append(t).append(" ");
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			arr = new int[N][M];
			visited = new boolean[N][M];
			check = new boolean[N][M];
			tunnelR = new int[][] { { 0, 0, 0, 0 }, { -1, 1, 0, 0 }, { -1, 1, 0, 0 }, { 0, 0, 0, 0 }, { -1, 0, 0, 0 },
					{ 0, 1, 0, 0 }, { 0, 1, 0, 0 }, { -1, 0, 0, 0 } };
			tunnelC = new int[][] { { 0, 0, 0, 0 }, { 0, 0, -1, 1 }, { 0, 0, 0, 0 }, { 0, 0, -1, 1 }, { 0, 0, 0, 1 },
					{ 0, 0, 0, 1 }, { 0, 0, -1, 0 }, { 0, 0, -1, 0 } };
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			Queue<Node> q = new LinkedList<>();
			q.add(new Node(R, C, 1));
			check[R][C] = true;
			while (!q.isEmpty()) {
				Node n = q.poll();

				if (n.cnt == L) {
					break;
				}
				for (int e = 0; e < 4; e++) {
					// 이동안하는 경우는 패스
					int mr = n.row + tunnelR[arr[n.row][n.col]][e];
					int mc = n.col + tunnelC[arr[n.row][n.col]][e];
					if (mr < 0 || mc < 0 || mr >= N || mc >= M) {
						continue;
					}
					if (arr[mr][mc] == 0) {
						continue;
					}
					if (check[mr][mc]) {
						continue;
					}
					if (e == 1 && (arr[mr][mc] == 3 || arr[mr][mc] == 5 || arr[mr][mc] == 6)) {
						continue;
					}
					if (e == 0 && (arr[mr][mc] == 3 || arr[mr][mc] == 4 || arr[mr][mc] == 7)) {
						continue;
					}
					if (e == 3 && (arr[mr][mc] == 2 || arr[mr][mc] == 4 || arr[mr][mc] == 5)) {
						continue;
					}
					if (e == 2 && (arr[mr][mc] == 2 || arr[mr][mc] == 6 || arr[mr][mc] == 7)) {
						continue;
					}
					check[mr][mc] = true;
					q.add(new Node(mr, mc, n.cnt + 1));
				}
			}

			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (check[i][j]) {
						cnt++;
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
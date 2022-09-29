
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	static int N, pick, px, py;
	static int[] p, x, y;
	static double E;
	static long ans;
	static StringTokenizer st;
	static StringBuilder sb;
	static List<Point> list;
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static class Point implements Comparable<Point> {
		int x, y;
		long dist;

		public Point(int x, int y, long dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}

		@Override
		public int compareTo(Point o) {
			// TODO Auto-generated method stub
			return Long.compare(this.dist, o.dist);
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		sb = new StringBuilder();
		for (int t = 1; t <= T; t++) {

			N = Integer.parseInt(br.readLine());

			list = new ArrayList<>();

			x = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				x[i] = Integer.parseInt(st.nextToken());
			}
			y = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				y[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					long w = (long) (Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
					list.add(new Point(i, j, w));
				}
			}
			E = Double.parseDouble(br.readLine());

			Collections.sort(list);

			p = new int[N];
			for (int i = 0; i < N; i++) {
				p[i] = i;
			}

			ans = 0;
			pick = 0;

			for (int i = 0; i < list.size(); i++) {
				Point point = list.get(i);
				px = findset(point.x);
				py = findset(point.y);
				if (px != py) {
					union(px, py);
					ans += (point.dist);
					pick++;
				}

				if (pick == N - 1) {
					break;
				}
			}
			sb.append("#").append(t).append(" ").append(Math.round(ans * E)).append("\n");

		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}

	static int findset(int x) {
		if (x != p[x]) {
			p[x] = findset(p[x]);
		}
		return p[x];
	}

	static void union(int x, int y) {
		p[findset(y)] = findset(p[x]);

	}
}

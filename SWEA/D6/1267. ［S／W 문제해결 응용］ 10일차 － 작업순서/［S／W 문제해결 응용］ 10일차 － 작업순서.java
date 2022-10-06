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

	public static void main(String[] args) throws IOException {
		for (int t = 1; t <= 10; t++) {
			sb.append("#").append(t).append(" ");
			st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int[][] arr = new int[V + 1][V + 1];
			int[] toline = new int[V + 1];
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= E; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				arr[from][to] = 1;
				toline[to]++;
			}
			Queue<Integer> q = new LinkedList<Integer>();
			for (int i = 1; i <= V; i++) {
				if (toline[i] == 0) {
					q.add(i);
				}
			}

			while (!q.isEmpty()) {
				int node = q.poll();
				sb.append(node).append(" ");
				for (int i = 1; i <= V; i++) {
					if (arr[node][i] == 1) {
						toline[i]--;
						if (toline[i] == 0) {
							q.add(i);
						}
					}
				}
			}
			sb.append("\n");

		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
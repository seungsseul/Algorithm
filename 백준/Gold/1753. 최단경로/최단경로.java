import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	// 시작정점에서 "거리가 최소인 정점"을 선택해 나가면서 최단 경로를 구하는 방식
	// 1.시작 정점을 입력 받는다.
	// 2.거리를 저장할 dist배열을 무한대로 초기화 한후 시작점에서 갈 수 있는 곳의 값을 바꿔 놓는다.
	// 3.아직 방문하지 않은 점들이 가지고 있는 거리 값과 현재 정점에서 방문하지 않은 정점까지의 가중치의 합이 작다면 변경하여 적는다.
	static class Node implements Comparable<Node> {
		int v, weight;

		public Node(int v, int weight) {
			this.v = v;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.weight, o.weight);
		}
	}

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static final int INF = Integer.MAX_VALUE;
	static int V, E, K; // V:정점, E:간선
	static List<Node>[] adjList; // 인접리스트
	static int[] dist; // 최단 길이를 저장할 값들
	static StringTokenizer st;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());

		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		// 인접리스트 초기화
		adjList = new ArrayList[V + 1];
		for (int i = 1; i <= V; i++) {
			adjList[i] = new ArrayList<>();
		}
		// 거리배열 무한대로 초기화
		dist = new int[V + 1];
		Arrays.fill(dist, INF);
		// 입력받기
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			adjList[u].add(new Node(v, w));
		}
		sb = new StringBuilder();
		dijkstra(K);
		for (int i = 1; i <= V; i++) {
			if (dist[i] == INF) {
				sb.append("INF").append("\n");
			} else {
				sb.append(dist[i]).append("\n");
			}
		}
		bw.write(sb.toString());
		bw.close();
		br.close();

	}

	static void dijkstra(int st) {
		PriorityQueue<Node> pq = new PriorityQueue<>();

		boolean[] visited = new boolean[V + 1]; // 방문처리

		pq.add(new Node(st, 0));
		dist[st] = 0;

		while (!pq.isEmpty()) {
			Node n = pq.poll();

			// 이미 최단경로의 비용을 알고 있다
			if (visited[n.v]) {
				continue;
			}
			visited[n.v] = true;

			// 현재꺼낸 노드와 연결된 노드를 하나씩 가져오기
			for (Node node : adjList[n.v]) {
				if (!visited[node.v] && dist[node.v] > dist[n.v] + node.weight) {
					dist[node.v] = dist[n.v] + node.weight;
					pq.add(new Node(node.v, dist[node.v]));
				}
			}
		}

	}
}

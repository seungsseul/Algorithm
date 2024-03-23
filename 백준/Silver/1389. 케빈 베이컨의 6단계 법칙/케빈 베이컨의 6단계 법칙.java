import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, M, x, y, min, cnt, kevinbacon, ans;
	static int[] arr;
	static int[][] map;
	static boolean[] visited;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][N];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken())-1;
			y = Integer.parseInt(st.nextToken())-1;
			map[x][y]=1; map[y][x]=1;
		}
		//i가 시작점, 달리하여 각각 그래프탐색하기
		min = Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			arr = new int[N];
			visited = new boolean[N];
			graph(i, arr);
			//케번베이컨 수 구했으면 이전 값과 비교해서 최솟값 찾으면 됨
			if(min>kevinbacon) {
				min = kevinbacon;
				ans = i+1;
			}
		}
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
	//bfs 알고리즘 써서 시작점(king)에서 각 노드별 거리를 counts배열에 저장하고,
	//다 더한게 해당 시작점의 케빈베이컨 수
	static void graph(int king, int[] counts) {
		q = new LinkedList<>();
		q.offer(king);
		cnt = 0;
		visited[king]=true;
		while(!q.isEmpty()) {
			int poll = q.poll();
			cnt = counts[poll];
			for(int j=0;j<N;j++) {
				if(j==king) {
					continue;
				}
				if(map[poll][j]==1 && !visited[j]) {
					visited[j] = true;
					counts[j]=cnt+1;
					q.offer(j);
				}
			}
		}
		kevinbacon = 0;
		for(int score : counts) {
			kevinbacon += score;
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] arr;
	static boolean[] visited;
	static int N, K, move;
	public static void main(String[] args) throws IOException {
		visited = new boolean[100001];
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		if(N==K) {
			System.out.println(0);
			return;
		}
		visited[N]=true;
		Queue<Integer> q = new LinkedList<>();
		q.add(N);
		move = 0;
		
		while(!q.isEmpty()) {
			int qsize=q.size();
			move++;
			for(int i=0;i<qsize;i++) {
				int spot = q.poll();
				visited[spot]=true;
				if(spot-1==K || spot+1==K || spot*2 == K) {
					System.out.println(move);
					return;
				}
				if(spot-1>=0 && !visited[spot-1]) {
					visited[spot-1]=true;
					q.add(spot-1);
				}
				if(spot+1<=100000 && !visited[spot+1]) {
					visited[spot+1]=true;
					q.add(spot+1);
				}
				if(spot*2<=100000 && !visited[spot*2]) {
					visited[spot*2]=true;
					q.add(spot*2);
				}
			}
		}
		br.close();
	}

	
}

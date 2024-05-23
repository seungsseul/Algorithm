import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static Queue<int[]> q;
	static PriorityQueue<Integer> pq;
	static int T, N, M, token, cnt;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			q = new LinkedList<int[]>();
			pq = new PriorityQueue<Integer>(Collections.reverseOrder());
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				token = Integer.parseInt(st.nextToken());
				arr = new int[2];
				arr[0] = token; arr[1]=i;
				q.offer(arr);
				pq.offer(token);
			}
			cnt = 0;
			while(!q.isEmpty()) {
				if(q.peek()[0]==pq.peek()) {
					cnt++;
					if(q.peek()[1]==M) {
						break;
					}
					q.poll();
					pq.poll();
					continue;
				}
				q.offer(q.poll());
			}
			sb.append(cnt).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

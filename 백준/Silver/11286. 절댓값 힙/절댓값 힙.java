import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N, x;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				//return 1 : 결과적으로 left가 오른쪽에 위치
				//return 0 : 결과적으로 left가 right와 같음
				//return -1 : 결과적으로 left가 왼쪽에 와야함
				if (o1[0]>o2[0]) {
					return 1;
				}
				else if(o1[0]==o2[0]) {
					if(o1[1]>o2[1]) {
						return 1;
					}
				}
				return -1;
			}
		 });
		for(int t=1;t<=N;t++) {
			x = Integer.parseInt(br.readLine());
			if(x!=0) {
				int[] arr = {Math.abs(x), x};
				pq.offer(arr);
			}
			else {
				if(pq.isEmpty()) {
					sb.append(0).append("\n");
					continue;
				}
				int[] num = pq.poll();
				int ans = num[1];
				sb.append(ans).append("\n");
			}
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

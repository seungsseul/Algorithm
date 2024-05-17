import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static PriorityQueue<Integer> pq;
	static int N;
	public static void main(String[] args) throws IOException {
		pq = new PriorityQueue<Integer>(new Comparator<>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) {
					return -1;
				}
				return 1;
			}
		});
		N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				pq.offer(Integer.parseInt(st.nextToken()));
			}
		}
		for(int i=1;i<N;i++) {
			pq.poll();
		}
		bw.write(String.valueOf(pq.poll()));bw.flush();bw.close();br.close();
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, tmp;
	static Map<Integer, Integer> map;
	static PriorityQueue<Integer> pq;
	public static void main(String[] args) throws IOException {
		map = new HashMap<>();
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			tmp = Integer.parseInt(st.nextToken());
			if(map.get(tmp)==null) {
				map.put(tmp, 1);
			}
			else {
				map.put(tmp, map.get(tmp)+1);
			}
		}
		pq = new PriorityQueue<Integer>(new Comparator<>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return map.get(o2)-map.get(o1);
			}
		});
		for(int key : map.keySet()) {
			pq.offer(key);
		}
		bw.write(String.valueOf(map.get(pq.poll())));bw.flush();bw.close();br.close();
	}
}

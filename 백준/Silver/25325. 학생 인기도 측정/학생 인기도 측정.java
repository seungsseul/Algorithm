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
	static StringBuilder sb = new StringBuilder();
	static Map<String, Integer> map;
	static int n;
	static String key, poll;
	public static void main(String[] args) throws IOException {
		map = new HashMap<>();
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			map.put(st.nextToken(), 0);
		}
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				key = st.nextToken();
				map.put(key, map.get(key)+1);
			}
		}
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				if(map.get(o1)==map.get(o2)) {
					return o1.compareTo(o2);
				}
				return map.get(o2)-map.get(o1);
			}
		});
		for(String key : map.keySet()) {
			pq.offer(key);
		}
		while(!pq.isEmpty()) {
			String poll = pq.poll();
			sb.append(poll).append(" ").append(map.get(poll)).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

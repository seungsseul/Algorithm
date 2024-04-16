import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static final String waring = "SYJKGW";
	static int n, T, max;
	static long N, ans;
	static Map<Long, Integer> map;
	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		for(int t=1;t<=n;t++) {
			st = new StringTokenizer(br.readLine());
			T = Integer.parseInt(st.nextToken());
			//key값 : 군사의 번호, value값 : 해당 군사의 수
			map = new HashMap<Long, Integer>();
			max = 0;
			for(int i=0;i<T;i++) {
				N = Long.parseLong(st.nextToken());
				if(map.get(N)==null) {
					map.put(N, 1);
				}
				else {
					map.put(N, map.get(N)+1);
				}
			}
			max = 0;
			for(Long key : map.keySet()) {
				if(map.get(key)>=max) {
					max = map.get(key);
					ans = key;
				}
			}
			sb.append(T/2<max ? ans : waring).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

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
	static int N, C, cnt;
	static Map<String, Integer> map;
	public static void main(String[] args) throws IOException {		
		N = Integer.parseInt(br.readLine());
		map = new HashMap<String, Integer>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());			
			map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		C = map.get("jinju");
		cnt = 0;
		for(String place : map.keySet()) {
			cnt += map.get(place)>C ? 1 : 0;
		}
		bw.write(String.valueOf(C)+"\n"+String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}

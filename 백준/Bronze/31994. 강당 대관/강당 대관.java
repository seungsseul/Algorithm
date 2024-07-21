import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static Map<String, Integer> map;
	static ArrayList<String> list;
	public static void main(String[] args) throws IOException {
		map = new HashMap<String, Integer>();
		for(int t=1;t<=7;t++) {			
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		list = new ArrayList<String>(map.keySet());
		Collections.sort(list, new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o2)-map.get(o1);
			}
		});
		bw.write(list.get(0));bw.flush();bw.close();br.close();
	}
}

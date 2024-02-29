import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();	
	static int N, M;
	static String word;
	static Map<String, Integer> map;
	static List<String> list;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new HashMap<String, Integer>();
		for(int i=0;i<N;i++) {
			word = br.readLine();
			if(word.length()<M) {
				continue;
			}
			if(map.get(word)==null) {
				map.put(word, 1);
			}
			else {
				map.put(word, map.get(word)+1);
			}
		}
		list = new ArrayList<String>(map.keySet());
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(map.get(o1)<map.get(o2)) {
					return 1;
				}
				else if(map.get(o1)==map.get(o2)) {
					if(o1.length()<o2.length()) {
						return 1;
					}
					else if(o1.length()==o2.length()) {
		               	return o1.compareTo(o2);
					}
				}
				return -1;
			}
		});
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i)).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

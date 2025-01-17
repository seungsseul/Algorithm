import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static Map<String, String> map;
	public static void main(String[] args) throws IOException {
		map = new HashMap<>();
		map.put("Algorithm", "204");
		map.put("DataAnalysis", "207");
		map.put("ArtificialIntelligence", "302");
		map.put("CyberSecurity", "B101");
		map.put("Network", "303");
		map.put("Startup", "501");
		map.put("TestStrategy", "105");
		N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			sb.append(map.get(br.readLine())).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

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
	static Map<String, Double> map;
	public static void main(String[] args) throws IOException {
		map = new HashMap<String, Double>();
		map.put("A+", 4.3);
		map.put("A0", 4.0);
		map.put("A-", 3.7);
		map.put("B+", 3.3);
		map.put("B0", 3.0);
		map.put("B-", 2.7);
		map.put("C+", 2.3);
		map.put("C0", 2.0);
		map.put("C-", 1.7);
		map.put("D+", 1.3);
		map.put("D0", 1.0);
		map.put("D-", 0.7);
		map.put("F", 0.0);
		bw.write(String.valueOf(map.get(br.readLine())));bw.flush();bw.close();br.close();
	}
}

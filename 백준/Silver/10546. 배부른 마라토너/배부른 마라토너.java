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
	static String Input;
	static Map<String, Integer> map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		map = new HashMap<>();
        for(int i=0;i<N;i++) {
            Input = br.readLine();
            if(map.get(Input)==null) {
                map.put(Input, 1);
            }else {
                map.put(Input, map.get(Input)+1);
            }
        }
        for(int i=0;i<N-1;i++) {
        	Input = br.readLine();
        	if(map.get(Input)==1) {
                map.remove(Input);
            }else {
                map.put(Input, map.get(Input)-1);
            }
        }
        for(String ans : map.keySet()) {
        	sb.append(ans).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();bw.close();br.close();
	}
}

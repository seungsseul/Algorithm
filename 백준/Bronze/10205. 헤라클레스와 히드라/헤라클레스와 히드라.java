import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int K, h;
	static String Input;
	public static void main(String[] args) throws IOException {
		K = Integer.parseInt(br.readLine());
		for(int t=1;t<=K;t++) {
			h = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "");
			Input = st.nextToken();
			for(int i=0;i<Input.length();i++) {
				h += Input.charAt(i)=='c' ? 1 : -1;
			}
			sb.append("Data").append(" ").append("Set").append(" ").append(t).append(":").append("\n").append(h).append("\n").append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

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
	static String Input;
	public static void main(String[] args) throws IOException {
		while((Input=br.readLine()) != null) {
			st = new StringTokenizer(Input);
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");			
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

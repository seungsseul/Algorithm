import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static String readline;
	public static void main(String[] args) throws IOException {
		while(true) {
			readline = br.readLine();
			if(readline.equals("0 0")) {
				break;
			}
			st = new StringTokenizer(readline);
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}

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
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		sb.append(1-Integer.parseInt(st.nextToken())).append(" ")
		.append(1-Integer.parseInt(st.nextToken())).append(" ")
		.append(2-Integer.parseInt(st.nextToken())).append(" ")
		.append(2-Integer.parseInt(st.nextToken())).append(" ")
		.append(2-Integer.parseInt(st.nextToken())).append(" ")
		.append(8-Integer.parseInt(st.nextToken())).append(" ");
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}

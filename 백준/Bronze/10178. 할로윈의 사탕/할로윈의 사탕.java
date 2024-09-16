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
	static int T, c, v;
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {			
			st = new StringTokenizer(br.readLine());
			c = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			sb.append("You get "+c/v+" piece(s) and your dad gets "+c%v+" piece(s).\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

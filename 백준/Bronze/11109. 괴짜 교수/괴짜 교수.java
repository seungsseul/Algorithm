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
	static int T, d, n, s, p;
	static String ans;
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			d = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			ans = n*p+d>n*s ? "do not parallelize" : (n*p+d<n*s ? "parallelize" : "does not matter");
			sb.append(ans).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

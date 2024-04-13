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
	static int a, b, c, d;
	public static void main(String[] args) throws IOException {
		while (true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			if(a==0 && b==0 && c==0 && d==0) {
				break;
			}
			sb.append(c-b).append(" ").append(d-a).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

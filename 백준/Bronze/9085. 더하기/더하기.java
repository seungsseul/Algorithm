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
	static int T, N, sum;
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			sum = 0;
			for(int i=0;i<N;i++) {
				sum += Integer.parseInt(st.nextToken());
			}
			sb.append(sum).append("\n");
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

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
	static String ans;
	static int N, U, L;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		U = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		ans = N>=1000 ? (U>=8000 || L>=260 ? "Very Good" : "Good") : "Bad";
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}

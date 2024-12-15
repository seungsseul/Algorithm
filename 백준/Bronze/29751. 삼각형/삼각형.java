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
	static float W, H, ans;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		W = Float.parseFloat(st.nextToken());
		H = Float.parseFloat(st.nextToken());
		ans = W*H/2;
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
}

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
	static int day, ans;
	public static void main(String[] args) throws IOException {
		day = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		ans = 0;
		while(st.hasMoreTokens()) {
			ans += Integer.parseInt(st.nextToken()) == day ? 1 : 0; 
		}
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
}

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
	static int x, y, ans;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		if(x>y) {
			ans=x+y;
		}
		else {
			ans=Math.abs(x-y);
		}
		bw.write(String.valueOf(ans));
		bw.flush();bw.close();br.close();
	}
}

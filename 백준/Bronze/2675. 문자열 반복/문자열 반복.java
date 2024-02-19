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
	static int T, num;
	static String tmp, ans;
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {			
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			tmp = st.nextToken();
			ans = "";
			for(int i=0;i<tmp.length();i++) {
				ans += String.valueOf(tmp.charAt(i)).repeat(num);
			}
			sb.append(ans).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

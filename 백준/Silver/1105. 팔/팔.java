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
	static String L, R;
	static int ans;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		L = st.nextToken();
		R = st.nextToken();
		ans = 0;
		flag = true;
		for(int i=0;i<L.length();i++) {
			if(!flag) {
				break;
			}
			ans += flag && L.charAt(i)=='8' && R.charAt(i)=='8' ? 1 : 0;
			flag = L.charAt(i)==R.charAt(i) ? true : false;
		}
		ans = L.length()==R.length() ? ans : 0;
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
}

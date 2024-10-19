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
	static int K1, K2, K3, ans1, ans2;
	static String O1, O2;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		K1 = Integer.parseInt(st.nextToken());
		O1 = st.nextToken();
		K2= Integer.parseInt(st.nextToken());
		O2 = st.nextToken();
		K3 = Integer.parseInt(st.nextToken());
		if(O1.equals("+")) {
			ans1 = K1+K2;
		}
		else if(O1.equals("-")) {
			ans1 = K1-K2;
		}
		else if(O1.equals("*")) {
			ans1 = K1*K2;
		}
		else if(O1.equals("/")) {
			ans1 = K1/K2;
		}
		if(O2.equals("+")) {
			ans1 = ans1+K3;
			ans2 = K2+K3;
		}
		else if(O2.equals("-")) {
			ans1 = ans1-K3;
			ans2 = K2-K3;
		}
		else if(O2.equals("*")) {
			ans1 = ans1*K3;
			ans2 = K2*K3;
		}
		else if(O2.equals("/")) {
			ans1 = ans1/K3;
			ans2 = K2/K3;
		}
		if(O1.equals("+")) {
			ans2 = K1+ans2;
		}
		else if(O1.equals("-")) {
			ans2 = K1-ans2;
		}
		else if(O1.equals("*")) {
			ans2 = K1*ans2;
		}
		else if(O1.equals("/")) {
			ans2 = K1/ans2;
		}
		sb.append(Math.min(ans1, ans2)).append("\n").append(Math.max(ans1, ans2));
		bw.write(sb.toString());bw.close();br.close();
	}
}

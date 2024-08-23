import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static BigInteger A, B, ans;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		A = new BigInteger(st.nextToken(), 2);
		B = new BigInteger(st.nextToken(), 2);
		ans = A.add(B);
		bw.write(ans.toString(2));bw.flush();bw.close();br.close();
	}
}

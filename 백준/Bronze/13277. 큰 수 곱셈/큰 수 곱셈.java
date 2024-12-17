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
	static BigInteger A, B;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		A = new BigInteger(st.nextToken());
		B = new BigInteger(st.nextToken());
		bw.write(A.multiply(B).toString());bw.close();br.close();
	}
}

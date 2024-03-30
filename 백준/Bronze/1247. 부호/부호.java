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
	static StringBuilder sb = new StringBuilder();
	static long N;
	static BigInteger S;
	public static void main(String[] args) throws IOException {
		for(int i=0;i<3;i++) {
			testSet();
		}
		bw.write(sb.toString());bw.close();br.close();
	}
	static void testSet() throws IOException {
		N = Long.parseLong(br.readLine());
		S = new BigInteger("0");
		for(int i=0;i<N;i++) {
			S = S.add(new BigInteger(br.readLine()));
		}
		sb.append(S.compareTo(BigInteger.ZERO)==0 ? "0" : (S.compareTo(BigInteger.ZERO)==1 ? "+" : "-")).append("\n");
	}
}

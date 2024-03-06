import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BigInteger A, B;
	static StringBuilder sb = new StringBuilder();	
	public static void main(String[] args) throws IOException {
		A = new BigInteger(br.readLine());
		B = new BigInteger(br.readLine());
		sb.append(A.add(B)).append("\n").append(A.subtract(B)).append("\n").append(A.multiply(B));
		bw.write(sb.toString());bw.close();br.close();
	}
}

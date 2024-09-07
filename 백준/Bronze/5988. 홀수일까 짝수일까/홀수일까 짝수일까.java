import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			sb.append(new BigInteger(br.readLine()).mod(new BigInteger("2")).toString().equals("0") ? "even" : "odd").append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

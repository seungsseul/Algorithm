import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] W, K;
	public static void main(String[] args) throws NumberFormatException, IOException {
		W = new int[10];
		K = new int[10];
		for(int i=0;i<10;i++) {
			W[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<10;i++) {
			K[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(W);
		Arrays.sort(K);
		sb.append(W[9]+W[8]+W[7]).append(" ").append(K[9]+K[8]+K[7]);
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}

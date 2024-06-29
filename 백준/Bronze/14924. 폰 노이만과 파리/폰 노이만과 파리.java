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
	static int S, T, D;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		S = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		bw.write(String.valueOf((D/(S*2))*T));bw.flush();bw.close();br.close();
	}
}

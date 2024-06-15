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
	static int T, S;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		if((T>=12 && T<=16) && S==0) {
			bw.write("320");
		}
		else {
			bw.write("280");
		}
		bw.flush();bw.close();br.close();
	}
}

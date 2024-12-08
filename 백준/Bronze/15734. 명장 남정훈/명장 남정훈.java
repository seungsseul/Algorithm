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
	static int L, R, A;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		A = Integer.parseInt(st.nextToken());
		while(A!=0) {
			A--;
			if(Math.min(L,R)==L) {
				L++;
			}
			else {
				R++;
			}
		}
		bw.write(String.valueOf(Math.min(L,R)*2));bw.flush();bw.close();br.close();
	}
}

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
	static int M, X, Y, ball;
	public static void main(String[] args) throws NumberFormatException, IOException {
		M = Integer.parseInt(br.readLine());
		ball = 1;
		for(int t=1;t<=M;t++) {
			st = new StringTokenizer(br.readLine());
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			if(X==ball) {
				ball=Y;
			}
			else if(Y==ball) {
				ball=X;
			}
		}
		bw.write(String.valueOf(ball));
		bw.flush();bw.close();br.close();
	}
}

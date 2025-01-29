import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String round;
	static int N, D, P;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			round = br.readLine();
			D += round.equals("D") ? 1 : 0;
			P += round.equals("P") ? 1 : 0;
			if(Math.abs(D-P)==2) {
				break;
			}
		}
		bw.write(String.valueOf(D)+":"+String.valueOf(P));
		bw.flush();bw.close();br.close();
	}
}

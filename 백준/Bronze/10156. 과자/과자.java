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
	static int K, N, M;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		K = Integer.parseInt(st.nextToken()); //과자한개의 가격
		N = Integer.parseInt(st.nextToken()); //사려고하는 과자 개수
		M = Integer.parseInt(st.nextToken()); //현재동수가 가진돈
		if(K*N<=M) {
			bw.write(String.valueOf(0));
		}
		else {
			bw.write(String.valueOf(K*N-M));
		}
		bw.flush();bw.close();br.close();
	}
}

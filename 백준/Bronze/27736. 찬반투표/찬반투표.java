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
	static int N, I, ans, num;
	static String res;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		I = 0;
		ans = 0;
		for(int i=0;i<N;i++) {
			num = Integer.parseInt(st.nextToken());
			I += num==0 ? 1 : 0;
			ans += num;
		}
		res = ans>0 ? "APPROVED" : "REJECTED";
		res = I*2>=N ? "INVALID" : res;
		bw.write(res);bw.flush();bw.close();br.close();
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int L, ans;
	public static void main(String[] args) throws IOException {
		L = Integer.parseInt(br.readLine());
		ans = L/5;
		ans += L%5==0 ? 0 : 1;
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
}

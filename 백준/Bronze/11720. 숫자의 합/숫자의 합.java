import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, ans;
	static String Input;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		Input = br.readLine();
		for(int i=0;i<N;i++) {
			ans += Character.getNumericValue(Input.charAt(i));
		}
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
}

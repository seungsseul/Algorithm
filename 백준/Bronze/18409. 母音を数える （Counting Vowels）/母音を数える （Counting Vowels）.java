import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, cnt;
	static String S;
	static final String Vowels = "aeiou";
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		S = br.readLine();
		cnt = 0;
		for(int i=0;i<N;i++) {
			cnt += Vowels.contains(String.valueOf(S.charAt(i))) ? 1 : 0;
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}

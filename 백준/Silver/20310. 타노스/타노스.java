import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String S, ans;
	static int zero, one;
	public static void main(String[] args) throws IOException {
		S = br.readLine();
		zero = 0; one = 0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='0') {
				zero++;
			}
			else {
				one++;
			}
		}
		zero/=2; one/=2;
		ans = "";
		for(int i=0;i<zero;i++) {
			ans+="0";
		}
		for(int i=0;i<one;i++) {
			ans+="1";
		}
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}

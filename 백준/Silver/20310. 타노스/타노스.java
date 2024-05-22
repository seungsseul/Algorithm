import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String S, ans;
	static char tmp;
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
		for(int i=0;i<S.length();i++) {
			tmp = S.charAt(i);
			if(tmp=='1' && one>0) {
				one--;
				continue;
			}
			if(tmp=='0' && zero<=0) {
				continue;
			}
			if(tmp=='0') {
				zero--;
			}
			ans+=String.valueOf(tmp);
			
		}
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}

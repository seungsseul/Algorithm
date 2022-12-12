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
	static int E, S, M, e, s, m, ans;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		E = Integer.parseInt(st.nextToken()); //15
		S = Integer.parseInt(st.nextToken()); //28
		M = Integer.parseInt(st.nextToken()); //19
		e=1;s=1;m=1;ans=1;
		while(ans<=7980) {
			if(e==E && s==S && m==M) {
				break;
			}
			e++;s++;m++;ans++;
			if(e%16==0) {
				e=1;
			}
			if(s%29==0) {
				s=1;
			}
			if(m%20==0) {
				m=1;
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();bw.close();br.close();
	}
}

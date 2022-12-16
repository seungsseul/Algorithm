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
	static long k,w,m;
	static int cnt;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		cnt=0;
		while(k<w) {
			w-=m;
			cnt++;
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}

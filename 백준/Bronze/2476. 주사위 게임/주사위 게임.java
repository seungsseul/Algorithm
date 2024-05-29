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
	static int N, a, b, c, tmp, max;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		max = 0;
		for(int t=1;t<=N;t++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if(a==b && b==c) {
				tmp = 10000+a*1000;
			}
			else if(a!=b && a!=c && b!=c) {
				tmp = Math.max(a,Math.max(b,c))*100;
			}
			else {
				if(a==b) {
					tmp = 1000+a*100;
				}
				else {
					if(a==c) {
						tmp = 1000+a*100;
					}
					else {
						tmp = 1000+b*100;
					}
				}
			}
			max = Math.max(tmp, max);
		}
		bw.write(String.valueOf(max));bw.flush();bw.close();br.close();
	}
}

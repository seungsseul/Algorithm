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
	static int N, K, max;
	static String res, tmp;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		max=0;
		for(int i=1;i<=K;i++) {
			res = String.valueOf(N*i);
			tmp="";
			for(int j=res.length()-1;j>=0;j--) {
				tmp+=String.valueOf(res.charAt(j));
			}
			max = Math.max(Integer.parseInt(tmp), max);
		}
		bw.write(String.valueOf(max));
		bw.flush();bw.close();br.close();
	}
}

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
	static StringBuilder sb = new StringBuilder();
	static int N, cnt, sum;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		for(int t=0;t<N;t++) {			
			st = new StringTokenizer(br.readLine());
			cnt=st.countTokens();
			sum=0;
			for(int i=0;i<cnt;i++) {
				sum+=Integer.parseInt(st.nextToken());
			}
			sb.append(sum).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}

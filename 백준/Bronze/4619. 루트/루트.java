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
	static int B, N, tmp, A;
	public static void main(String[] args) throws IOException {
		while(true) {
			st = new StringTokenizer(br.readLine());
			B = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			if(B==0 & N==0) {
				break;
			}
			tmp = (int)Math.pow(1,N);
			A = 1;
			for(int i=2;i<=1000001;i++) {
				if(Math.abs(B-tmp)<Math.abs(B-(int)Math.pow(i,N))) {
					A = i-1;
					break;
				}
				tmp = (int)Math.pow(i,N);
			}
			sb.append(A).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

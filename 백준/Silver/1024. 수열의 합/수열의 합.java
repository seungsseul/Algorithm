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
	static int N, L;
	static boolean flag;
	static long[] arr;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		loop:
		for(int i=L;i<=100;i++) {
			long num = 0;
			while(true) {
				long sum = num*i+((i-1)*i/2);
				if(sum==N) {
					flag = true;
					for(long j=num;j<i+num;j++) {
						sb.append(j).append(" ");
					}
					break loop;
				}
				if(sum>N) {
					break;
				}
				num++;
			}
		}
		if(!flag) {
			sb.setLength(0);
			sb.append(-1);
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

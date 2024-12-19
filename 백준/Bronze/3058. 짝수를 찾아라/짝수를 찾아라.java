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
	static int T, sum, num, min;
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {			
			st = new StringTokenizer(br.readLine());
			sum = 0;
			min = Integer.MAX_VALUE;
			for(int i=0;i<7;i++) {
				num = Integer.parseInt(st.nextToken());
				sum += num%2==0 ? num : 0;
				min = num%2==0 ? Math.min(num, min) : min;
			}
			sb.append(sum).append(" ").append(min).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

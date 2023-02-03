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
	static int T, a, b, max, min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			max=0;
			for(int i=1;i<=a && i<=b;i++) {
				if(a%i==0 && b%i==0) {
					max=i;
				}
			}
			min = (a*b)/max;
			sb.append(min).append(" ").append(max).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}

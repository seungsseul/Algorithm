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
	static int T;
	static double[] arr = {350.34, 230.90, 190.55, 125.30, 180.90};
	static double sum;
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			for(int i=0;i<5;i++) {
				sum += arr[i]*Integer.parseInt(st.nextToken());
			}
			sb.append("$").append(String.format("%.2f", sum)).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

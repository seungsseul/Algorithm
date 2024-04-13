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
	static int A, B, C, sum;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(br.readLine());
		if(A+B>=C*2) {
			sum=A-C+B-C;
		}
		else {
			sum=A+B;
		}
		bw.write(String.valueOf(sum));bw.flush();bw.close();br.close();
	}
}

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
	static long k, a, b, c, d;
	public static void main(String[] args) throws NumberFormatException, IOException {
		k = Long.parseLong(br.readLine());
		st = new StringTokenizer(br.readLine());
		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		d = Long.parseLong(st.nextToken());
		if(a*k+b==c*k+d) {
			bw.write("Yes "+(a*k+b));
		}
		else {
			bw.write("No");
		}
		bw.flush();bw.close();br.close();
		
	}
}

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
	static int X,L,R,min,ans;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		X = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		min=Integer.MAX_VALUE;
		ans=0;
		for(int i=L;i<=R;i++) {
			if(min>Math.abs(i-X)) {
				min=Math.abs(i-X);
				ans=i;
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		br.close();
	}
}

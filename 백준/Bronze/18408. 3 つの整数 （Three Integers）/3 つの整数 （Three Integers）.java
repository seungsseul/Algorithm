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
	static int cnt=0;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<=2;i++) {			
			if(Integer.parseInt(st.nextToken())==1) {
				cnt++;
			}
		}
		if(cnt>=2) {
			bw.write(String.valueOf(1));
		}
		else {
			bw.write(String.valueOf(2));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

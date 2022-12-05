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
	static int S,K,H;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		S = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		if((S+K+H)>=100) {
			bw.write("OK");
		}
		else {
			if(Math.min(H,(Math.min(S,K)))==S) {
				bw.write("Soongsil");
			}
			else if(Math.min(H,(Math.min(S,K)))==K) {
				bw.write("Korea");		
			}
			else {
				bw.write("Hanyang");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

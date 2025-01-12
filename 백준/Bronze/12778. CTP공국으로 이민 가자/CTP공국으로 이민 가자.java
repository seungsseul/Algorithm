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
	static String question, alpabet;
	static int T, M, number;
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {			
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			question = st.nextToken();
			st = new StringTokenizer(br.readLine());
			if(question.equals("C")) {
				for(int i=0;i<M;i++) {
					alpabet = st.nextToken();
					sb.append(alpabet.charAt(0)-64).append(" ");
				}
			}
			else {
				for(int i=0;i<M;i++) {
					number = Integer.parseInt(st.nextToken());
					sb.append((char)(number+64)).append(" ");
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

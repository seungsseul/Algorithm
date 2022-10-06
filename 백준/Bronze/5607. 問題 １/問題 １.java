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
	static int T,A,B,Ascore,Bscore;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());		
		Ascore=0;Bscore=0;
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			if(A==B) {
				Ascore+=A;Bscore+=B;
			}
			else if(A>B) {
				Ascore+=(A+B);
			}
			else {
				Bscore+=(A+B);
			}
		}
		sb.append(Ascore).append(" ").append(Bscore).append("\n");
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}

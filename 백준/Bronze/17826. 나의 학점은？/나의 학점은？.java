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
	static int myScore;
	static String ans;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		myScore = Integer.parseInt(br.readLine());
		for(int i=0;i<50;i++) {
			if(Integer.parseInt(st.nextToken())==myScore) {
				if(i<5) {
					ans = "A+";
				}
				else if(i>=5 && i<15) {
					ans = "A0";
				}
				else if(i>=15 && i<30) {
					ans = "B+";
				}
				else if(i>=30 && i<35) {
					ans = "B0";
				}
				else if(i>=35 && i<45) {
					ans = "C+";
				}
				else if(i>=45 && i<48) {
					ans = "C0";
				}
				else {
					ans = "F";
				}	
				break;
			}
		}
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}

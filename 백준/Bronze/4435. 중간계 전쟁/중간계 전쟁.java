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
	static int T, sum1, sum2, score;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			sb.append("Battle").append(" ").append(t).append(":").append(" ");
			sum1=0;sum2=0;
			st = new StringTokenizer(br.readLine());
			for(int i=1;i<=6;i++) {
				score = Integer.parseInt(st.nextToken());
				if(i==1) {
					sum1+=(score*1);
				}
				else if(i==2) {
					sum1+=(score*2);
				}
				else if(i==3) {
					sum1+=(score*3);
				}
				else if(i==4) {
					sum1+=(score*3);
				}
				else if(i==5) {
					sum1+=(score*4);
				}
				else {
					sum1+=(score*10);
				}
			}
			st = new StringTokenizer(br.readLine());
			for(int i=1;i<=7;i++) {
				score = Integer.parseInt(st.nextToken());
				if(i==1) {
					sum2+=(score*1);
				}
				else if(i==2) {
					sum2+=(score*2);
				}
				else if(i==3) {
					sum2+=(score*2);
				}
				else if(i==4) {
					sum2+=(score*2);
				}
				else if(i==5) {
					sum2+=(score*3);
				}
				else if(i==6) {
					sum2+=(score*5);
				}
				else {
					sum2+=(score*10);
				}
			}
			if(sum1>sum2) {
				sb.append("Good triumphs over Evil").append("\n");
			}
			else if(sum1<sum2) {
				sb.append("Evil eradicates all trace of Good").append("\n");
			}
			else {
				sb.append("No victor on this battle field").append("\n");
			}
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

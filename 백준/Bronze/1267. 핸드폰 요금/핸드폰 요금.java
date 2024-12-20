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
	static int N, Y, M, Y_time, M_time, time;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Y = 0;
		M = 0;
		for(int i=0;i<N;i++) {
			time = Integer.parseInt(st.nextToken());
			Y_time = 0;
			M_time = 0;
			while(true) {
				if(Y_time>=time) {
					Y += Y_time==time ? 10 : 0;
					break;
				}
				Y += 10;
				Y_time += 30;
			}
			while(true) {
				if(M_time>=time) {
					M += M_time==time ? 15 : 0;
					break;
				}
				M += 15;
				M_time += 60;
			}
		}
		if(Y==M) {
			sb.append("Y M ").append(Y);
		}
		else if(Y>M) {
			sb.append("M ").append(M);
		}
		else {
			sb.append("Y ").append(Y);
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

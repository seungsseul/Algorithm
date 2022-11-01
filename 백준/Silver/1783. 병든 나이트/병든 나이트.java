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
	static long N,M, max;
	static int[] dr = {-2,-1,1,2};
	static int[] dc = {1,2,2,1};
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		//N이 1인경우는 이동불가이므로 1
		if(N==1) {
			sb.append(1);
		}
		//N이 2인경우는 규칙에 따라 M이 홀수면 (M+1)/2, 짝수면 M/2
		else if(N==2) {
			//M이 짝수일때
			if(M%2==0) {				
				sb.append(Math.min(M/2, 4));
			}
			//M이 홀수일때
			else {
				sb.append(Math.min((M+1)/2, 4));
			}
		}
		//N이 3인 경우
		else if(N>=3) {
			if(M<7) {
				sb.append(Math.min(M, 4));
			}
			else {
				sb.append(M-2);
			}
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
	
}

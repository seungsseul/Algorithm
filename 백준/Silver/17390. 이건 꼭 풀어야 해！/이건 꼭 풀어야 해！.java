import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int N, Q, L, R, ans;
	static int[] A, sum;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		sum = new int[N];
		sum[0]=A[0];
		for(int i=1;i<N;i++) {
			sum[i] = sum[i-1]+A[i];
		}
		for(int t=1;t<=Q;t++) {
			st = new StringTokenizer(br.readLine());
			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			if(L==R) {
				ans = A[L-1];				
			}
			else {
				ans = L==1 ? sum[R-1] : sum[R-1]-sum[L-2];
			}
			sb.append(ans).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

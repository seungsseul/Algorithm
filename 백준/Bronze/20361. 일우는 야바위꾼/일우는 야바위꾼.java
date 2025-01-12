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
	static int N, X, K, A, B, ans;
	static boolean[] balls;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		balls = new boolean[N];
		balls[X-1] = true;
		for(int i=0;i<K;i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			swap(A-1, B-1);
		}
		for(int i=0;i<N;i++) {
			if(balls[i]) {
				ans = i+1;
				break;
			}
		}
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
	static void swap(int a, int b) {
		boolean tmp = balls[a];
		balls[a] = balls[b];
		balls[b] = tmp;
	}
}

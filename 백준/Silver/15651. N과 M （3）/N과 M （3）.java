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
	static int N, M;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		visited = new boolean[N+1];
		permutation(0);
		bw.write(sb.toString());bw.close();br.close();
	}
	static void permutation(int cnt) {
		if(cnt==M) {
			for(int num : arr) {				
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=1;i<=N;i++) {
			arr[cnt] = i;
			permutation(cnt+1);
		}
	}
}

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
	static int N, S, sum, cnt;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		visited = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		cnt = 0;
		for(int i=1;i<=N;i++) {			
			combination(0, 0, i);
		}
		bw.write(String.valueOf(cnt));bw.flush();bw.close();br.close();
	}
	static void combination(int start, int depth, int r) {
		if(depth==r) {
			sum = 0;
			for(int i=0;i<N;i++) {
				sum += visited[i] ? arr[i] : 0;
			}
			cnt += sum == S ? 1 : 0;
			return;
		}
		for(int i=start;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				combination(i+1, depth+1, r);
				visited[i]=false;
			}
		}
	}
}

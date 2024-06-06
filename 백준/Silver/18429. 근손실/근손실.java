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
	static int N, K, A, weight, cnt;
	static int[] kit, arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		kit = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			kit[i] = Integer.parseInt(st.nextToken());
		}
		arr = new int[N];
		visited = new boolean[N];
		cnt = 0;
		permutation(0);
		bw.write(String.valueOf(cnt));bw.flush();bw.close();br.close();
	}
	static void permutation(int start) {
		if(start==N) {
			weight = 500;
			cnt += checkWeight();
			return;
		}
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				arr[start]=i;
				permutation(start+1);
				visited[i]=false;
			}
		}
	}
	static int checkWeight() {
		for(int i=0;i<N;i++) {
			weight-=K;
			weight+=kit[arr[i]];
			if(weight<500) {
				return 0;
			}
		}
		return 1;
	}
}

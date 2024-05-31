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
	static int[] select;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		select = new int[M];
		visited = new boolean[N+1];
		permutation(0);
		bw.write(sb.toString());bw.close();br.close();
	}
	static void permutation(int choose) {
		if(choose==M) {
			for(int num : select) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=1;i<=N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				select[choose]=i;
				permutation(choose+1);
				visited[i]=false;
			}
		}
	}
}

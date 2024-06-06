import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		visited = new boolean[N];
		permutation(0);
		bw.write(sb.toString());bw.close();br.close();
	}
	private static void permutation(int start) {
		if(start==N) {
			for(int i=0;i<N;i++) {
				if(visited[i]) {
					sb.append(arr[i]).append(" ");
				}
			}
			sb.append("\n");
			return;
		}
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				arr[start]=i+1;
				permutation(start+1);
				visited[i]=false;
			}
		}
	}
}

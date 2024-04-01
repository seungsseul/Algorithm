import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int[] A;
	static int[][] Sort;
	static boolean[] visited;
	static Map<Integer, Integer> notSort;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		Sort = new int[N][2];
		visited = new boolean[N];
		notSort = new HashMap<Integer, Integer>();
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
			notSort.put(i, A[i]);
		}
		Arrays.sort(A);
		for(int i=0;i<N;i++) {
			Sort[i][0] = A[i];
			Sort[i][1] = i;
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(Sort[j][0]==notSort.get(i) && !visited[j]) {
					sb.append(Sort[j][1]).append(" ");
					visited[j]=true;
					break;
				}
			}
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

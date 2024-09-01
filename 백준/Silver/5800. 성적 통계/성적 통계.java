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
	static int K, N, max;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		K = Integer.parseInt(br.readLine());
		for(int t=1;t<=K;t++) {			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			max = 0;
			for(int i=1;i<arr.length;i++) {
				max = Math.max(arr[i]-arr[i-1], max);
			}
			sb.append("Class ").append(t).append("\n");
			sb.append("Max ").append(arr[arr.length-1]).append(", Min ").append(arr[0]).append(", Largest gap ").append(max).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

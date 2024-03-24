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
	static int N, K, mark, tmp;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=i+1;
		}
		mark = N-1;
		for(int i=0;i<K;i++) {
			swap();
		}
		for(int num : arr) {
			sb.append(num).append(" ");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
	static void swap() {
		if(mark==0 || arr[mark-1]>arr[mark]) {
			mark = N-1;
		}
		tmp = arr[mark-1];
		arr[mark-1] = arr[mark];
		arr[mark] = tmp;
		mark--;
	}
}

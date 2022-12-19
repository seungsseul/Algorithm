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
	static int N;
	static int[] arr;
	static int merge, score, max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		merge=0;
		score=0;
		max=-1;
		for(int i=N-1;i>=1;i--) {
			merge+=(arr[i]+arr[i-1]);
			score+=(arr[i]*arr[i-1]);
			arr[i-1]=arr[i]+arr[i-1];
			max=Math.max(score,max);
		}
		bw.write(String.valueOf(max));
		bw.flush();bw.close();br.close();
	}
}

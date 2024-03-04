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
	static int N, left;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			left = Integer.parseInt(st.nextToken());
			for(int j=0;j<=left;j++) {
				if(arr[j]!=0 && arr[j]<i) {
					left++;
				}
			}
			arr[left] = i;
		}
		for(int num : arr) {
			sb.append(num).append(" ");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

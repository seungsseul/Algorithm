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
	static int T, n, idx, tmp;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			n = Integer.parseInt(br.readLine());
			sb.append("Pairs").append(" ").append("for").append(" ").append(n).append(":").append(" ");
			arr = new int[n];
			idx=0;
			for(int i=1;i<n;i++) {
				arr[idx]=i;
				idx++;
			}
			if(arr.length<=2) {
				sb.append("\n");
				continue;
			}
			sb.append(arr[0]).append(" ").append(n-arr[0]);
			tmp=n-arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>=tmp || arr[i]==n-arr[i]) {
					break;
				}
				sb.append(",").append(" ").append(arr[i]).append(" ").append(n-arr[i]);
				tmp=n-arr[i];
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

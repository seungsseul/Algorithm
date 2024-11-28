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
	static int[] arr;
	public static void main(String[] args) throws IOException {
		while(true) {
			st = new StringTokenizer(br.readLine());
			arr = new int[3];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
				break;
			}
			Arrays.sort(arr);
			if(arr[0]+arr[1]<=arr[2]) {
				sb.append("Invalid").append("\n");
			}
			else if(arr[0]==arr[1] && arr[1]==arr[2]) {
				sb.append("Equilateral").append("\n");
			}
			else if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[2]!=arr[0]) {
				sb.append("Scalene").append("\n");
			}
			else {
				sb.append("Isosceles").append("\n");
			}
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

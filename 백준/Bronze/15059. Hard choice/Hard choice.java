import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[] arr1, arr2;
	static int ans;
	public static void main(String[] args) throws IOException {
		arr1 = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		arr2 = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		ans=0;
		for(int i=0;i<arr1.length;i++) {
			ans += arr2[i]>arr1[i] ? arr2[i]-arr1[i] : 0;
		}
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
}

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
	static int A,B,C;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new int[3];
		arr[0]=A;arr[1]=B;arr[2]=C;
		Arrays.sort(arr);
		bw.write(String.valueOf(arr[1]+arr[2]));
		bw.flush();bw.close();br.close();
	}
}

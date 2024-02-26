import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] arr;
	static int A, B, ans;
	public static void main(String[] args) throws IOException {
		arr = br.readLine().split("");
		if(arr.length==2) {
			ans = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
			bw.write(String.valueOf(ans));
		}
		else if(arr.length==3) {
			ans = arr[1].equals("0") ? 10+Integer.parseInt(arr[2]) : 10+Integer.parseInt(arr[0]);
			bw.write(String.valueOf(ans));
		}
		else {
			bw.write("20");
		}
		bw.flush();bw.close();br.close();
	}
}

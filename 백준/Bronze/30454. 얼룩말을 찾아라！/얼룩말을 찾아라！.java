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
	static String zebra;
	static String[] arr;
	static int N, L, black, max, ans;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		max = -1;
		ans = 1;
		for(int i=1;i<=N;i++) {
			zebra = br.readLine();
			arr = zebra.split("0");
			black = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j].equals("")) {
					continue;
				}
				black++;
			}
			if(max<=black) {
				if(max==black) {
					ans++;
					continue;
				}
				ans = 1;
				max = black;
			}
		}
		bw.write(String.valueOf(max+" "+ans));bw.flush();
		bw.close();br.close();
	}
}

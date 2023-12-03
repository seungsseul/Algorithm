import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int money = Integer.parseInt(st.nextToken());
		int chocolateBar = Integer.parseInt(st.nextToken());
		String answer = money*100 >= chocolateBar ? "Yes" : "No";
		bw.write(answer);
		bw.flush();bw.close();br.close();
	}
}
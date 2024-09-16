import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N;
	static String Input, ans;
	static ArrayList<String> list;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		list = new ArrayList<String>();
		list.add("Never gonna give you up");
		list.add("Never gonna let you down");
		list.add("Never gonna run around and desert you");
		list.add("Never gonna make you cry");
		list.add("Never gonna say goodbye");
		list.add("Never gonna tell a lie and hurt you");
		list.add("Never gonna stop");
		ans = "No";
		for(int i=0;i<N;i++) {
			if(!list.contains(br.readLine())) {
				ans = "Yes";
			}
		}
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}

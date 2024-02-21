import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int depth, next_depth;
	static String ans;
	public static void main(String[] args) throws IOException {
		depth = Integer.parseInt(br.readLine());
		ans = "";
		for(int t=1;t<=3;t++) {
			next_depth = Integer.parseInt(br.readLine());
			if(depth<next_depth && (ans.equals("") || ans.equals("Fish Rising"))) {
				ans = "Fish Rising";
				depth = next_depth;
				continue;
			}
			if(depth>next_depth && (ans.equals("") || ans.equals("Fish Diving"))) {
				ans = "Fish Diving";
				depth = next_depth;
				continue;
			}
			if(depth==next_depth && (ans.equals("") || ans.equals("Fish At Constant Depth"))) {
				ans = "Fish At Constant Depth";
				depth = next_depth;
				continue;
			}
			ans = "No Fish";
			break;
		}
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}

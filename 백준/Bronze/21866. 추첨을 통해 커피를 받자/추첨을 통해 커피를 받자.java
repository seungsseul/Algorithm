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
	static int len, sum, score;
	static String ans;
	static int[] max_score = {100, 100, 200, 200, 300, 300, 400, 400, 500};
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		len = st.countTokens();
		sum = 0;
		ans = "draw";
		for(int i=0;i<len;i++) {
			score = Integer.parseInt(st.nextToken());
			if(score>max_score[i]) {
				ans = "hacker";
				break;
			}
			sum+=score;
		}
		if(ans.equals("draw") && sum<100) {
			ans = "none";
		}
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}

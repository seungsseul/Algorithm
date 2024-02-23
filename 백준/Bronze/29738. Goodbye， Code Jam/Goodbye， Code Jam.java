import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int T, N;
	static int[] rank = {4500, 1000, 25};
	static String[] round = {"Round 1", "Round 2", "Round 3"};
	static boolean[] visited = {false, false, false};
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			sb.append("Case").append(" ").append("#").append(t).append(":").append(" ");
			N = Integer.parseInt(br.readLine());
			if(N>4500) {
				sb.append("Round 1").append("\n");
				continue;
			}
			if(N>1000) {
				sb.append("Round 2").append("\n");
				continue;
			}
			if(N>25) {
				sb.append("Round 3").append("\n");
				continue;
			}
			sb.append("World Finals").append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

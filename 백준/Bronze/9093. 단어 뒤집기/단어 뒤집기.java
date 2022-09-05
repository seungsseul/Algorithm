import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			int cnt=1;
			while(cnt<=st.countTokens()) {
				String S = st.nextToken();
				for(int j=S.length()-1;j>=0;j--) {
					sb.append(S.charAt(j));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();	
	}
}
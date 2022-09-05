import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Loop:
		for(int t=1;t<=T;t++) {
			String vps = br.readLine();
			int cnt=0;
			for(int i=0;i<vps.length();i++) {
				if(cnt<0) {
					sb.append("NO").append("\n");
					continue Loop;
				}
				if(vps.charAt(i)=='(') {
					cnt++;
				}
				else if(vps.charAt(i)==')') {
					cnt--;
				}
			}
			if(cnt==0) {
				sb.append("YES");
			}
			else {
				sb.append("NO");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
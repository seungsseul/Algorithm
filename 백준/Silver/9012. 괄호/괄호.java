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
			//배열의 길이만큼 돌려서 '('가 나오면 cnt++, ')'가 나오면 cnt--해주기
			for(int i=0;i<vps.length();i++) {
				//for문 돌다가 1번이라도 음수가 나오면 결과출력
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
			//카운트가 정확히 0이라면 YES출력
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
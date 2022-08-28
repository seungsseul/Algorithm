import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Loop1:
		for(int t=1;t<=T;t++) {
			sb.append("#").append(t).append(" ");
			String S = br.readLine();
			int[] cnt = new int[4];
			String[] card = new String[S.length()/3];
			for(int i=0;i<S.length();i+=3) {
				if(S.charAt(i)=='S') {
					cnt[0]++;
				}
				else if(S.charAt(i)=='D') {
					cnt[1]++;
				}
				else if(S.charAt(i)=='H') {
					cnt[2]++;		
				}
				else if(S.charAt(i)=='C') {
					cnt[3]++;
				}
			}
			int idx=0;
			for(int i=3;i<S.length()+1;i+=3) {
				card[idx]=S.substring(i-3, i);
				idx++;
			}
			for(int i=0;i<card.length;i++) {
				for(int j=i+1;j<card.length;j++) {
					if(card[i].equals(card[j])) {
						sb.append("ERROR").append("\n");
						continue Loop1;
					}
				}
			}
			
			
			for(int i=0;i<4;i++) {
				sb.append(13-cnt[i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
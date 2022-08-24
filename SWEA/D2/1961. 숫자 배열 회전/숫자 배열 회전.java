import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			StringBuilder sb = new StringBuilder();
			int N = sc.nextInt();
			String[][] arr = new String[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j]=sc.next();
				}
			}
			String[][] ans = new String[N][3];
			int num=0;
			int idx=0;
			for(int j=0;j<N;j++) {
				String word = "";
				for(int i=N-1;i>=0;i--) {
					word+=arr[i][j];
				}
				ans[idx][num]=word;
				idx++;
			}
			idx=0;
			num++;
			for(int i=N-1;i>=0;i--) {
				String word = "";
				for(int j=N-1;j>=0;j--) {
					word+=arr[i][j];
				}
				ans[idx][num]=word;
				idx++;
			}
			idx=0;
			num++;
			for(int j=N-1;j>=0;j--) {
				String word = "";
				for(int i=0;i<N;i++) {
					word+=arr[i][j];
				}
				ans[idx][num]=word;
				idx++;
			}
			sb.append("#").append(t).append("\n");
			for(int i=0;i<ans.length;i++) {	
				for(int j=0;j<ans[i].length;j++) {
					sb.append(ans[i][j]);
					if(j!=ans[i].length-1) {
						sb.append(" ");
					}
				}
				if(i!=ans.length-1) {					
					sb.append("\n");
				}
			}
			System.out.println(sb);
		}
		sc.close();
	}
}
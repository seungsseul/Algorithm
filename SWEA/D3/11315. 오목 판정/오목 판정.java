import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			String[][] arr = new String[N][N];
			for(int i=0;i<N;i++) {
				String line = sc.next();
				for(int j=0;j<N;j++) {
					arr[i][j] = String.valueOf(line.charAt(j));
				}
			}
//			for(int i=0;i<arr.length;i++) {
//				System.out.println(Arrays.toString(arr[i]));
//			}
			int correct=0;
			int[] dr = {-1,1,0,0,-1,-1,1,1};
			int[] dc = {0,0,-1,1,-1,1,-1,1};
			Loop1:
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(arr[i][j].equals("o")) {
						for(int k=0;k<8;k++) {
							int r = i+dr[k];
							int c = j+dc[k];
							correct=0;
							while(true) {	
								if(r>=0 && c>=0 && r<N && c<N) {
									if(arr[r][c].equals(arr[i][j])) {
										correct++;
										r+=dr[k];
										c+=dc[k];
										if(correct==4) {
											break Loop1;
										}
									}
									else {
										break;
									}
								}
								else {
									
									break;
								}
							}
						}
					}
				}
			}
//			System.out.println(correct);
			if(correct==4) {
				System.out.println("#"+t+" YES");
			}
			else {
				System.out.println("#"+t+" NO");
			}
		}
		sc.close();
	}
}

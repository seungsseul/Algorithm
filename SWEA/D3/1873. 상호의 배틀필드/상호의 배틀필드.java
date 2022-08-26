import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			String[][] map = new String[H][W];
			for(int i=0;i<H;i++) {
				String word = sc.next();
				for(int j=0;j<W;j++) {
					map[i][j]=String.valueOf(word.charAt(j));
				}
			}
			List<String> list = new ArrayList<>();
			list.add("^");list.add("v");list.add("<");list.add(">");
			int[] dr = {-1,1,0,0};
			int[] dc = {0,0,-1,1};
			int r=0;int c=0;
			int N = sc.nextInt();
			String Input = sc.next();
			int direcr = 2;int direcc = 2;
			int tmpi=0;int tmpj=0;
			Loop1:
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++) {
					tmpi=i;tmpj=j;
					if(list.contains(map[tmpi][tmpj])) {
						for(int k=0;k<N;k++) {
							if(direcr==2 && direcc==2) {
								if(map[tmpi][tmpj].equals("^")) {
									direcr = dr[0];
									direcc = dc[0];
								}
								else if(map[tmpi][tmpj].equals("v")) {
									direcr = dr[1];
									direcc = dc[1];
								}
								else if(map[tmpi][tmpj].equals("<")) {
									direcr = dr[2];
									direcc = dc[2];
								}
								else if(map[tmpi][tmpj].equals(">")) {
									direcr = dr[3];
									direcc = dc[3];
								}
							}
							if(Input.charAt(k)=='U') {
								direcr = dr[0];
								direcc = dc[0];
								r = tmpi+dr[0];
								c = tmpj+dc[0];
								map[tmpi][tmpj]="^";
								if(r>=0 && c>=0 && r<H && c<W && !(map[r][c].equals("-")) && !(map[r][c].equals("*")) && !(map[r][c].equals("#"))) {
									map[r][c]=map[tmpi][tmpj];
									map[tmpi][tmpj]=".";
									tmpi=r;
									tmpj=c;
								}
								
							}
							else if(Input.charAt(k)=='D') {
								direcr = dr[1];
								direcc = dc[1];
								r = tmpi+dr[1];
								c = tmpj+dc[1];
								map[tmpi][tmpj]="v";
								if(r>=0 && c>=0 && r<H && c<W && !(map[r][c].equals("-")) && !(map[r][c].equals("*")) && !(map[r][c].equals("#")) ) {
									map[r][c]=map[tmpi][tmpj];
									map[tmpi][tmpj]=".";
									tmpi=r;
									tmpj=c;
								}
							}
							else if(Input.charAt(k)=='L') {
								direcr = dr[2];
								direcc = dc[2];
								r = tmpi+dr[2];
								c = tmpj+dc[2];
								map[tmpi][tmpj]="<";
								if(r>=0 && c>=0 && r<H && c<W && !(map[r][c].equals("-")) && !(map[r][c].equals("*")) && !(map[r][c].equals("#")) ) {
									map[r][c]=map[tmpi][tmpj];
									map[tmpi][tmpj]=".";
									tmpi=r;
									tmpj=c;
								}
							}
							else if(Input.charAt(k)=='R') {
								direcr = dr[3];
								direcc = dc[3];
								r = tmpi+dr[3];
								c = tmpj+dc[3];
								map[tmpi][tmpj]=">";
								if(r>=0 && c>=0 && r<H && c<W && !(map[r][c].equals("-")) && !(map[r][c].equals("*")) && !(map[r][c].equals("#")) ) {
									map[r][c]=map[tmpi][tmpj];
									map[tmpi][tmpj]=".";
									tmpi=r;
									tmpj=c;
								}
							}
							else if(Input.charAt(k)=='S') {
								int tmpr=tmpi;
								int tmpc=tmpj;
								while(true) {
									tmpr = tmpr+direcr;
									tmpc = tmpc+direcc;
									if(tmpr<0 || tmpc<0 || tmpr>=H || tmpc>=W) {
										break;
									}
									if(map[tmpr][tmpc].equals("*") || map[tmpr][tmpc].equals("#")) {
										if(map[tmpr][tmpc].equals("*")) {
											map[tmpr][tmpc]=".";
											break;
										}
										else if(map[tmpr][tmpc].equals("#")) {
											break;
										}
									}
								}
								continue;
							}
						}
						break Loop1;
					}
				}
			}
			
			System.out.print("#"+t+" ");
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++) {
					System.out.print(map[i][j]);
				}
				System.out.print("\n");
			}
		}
		sc.close();
	}
}
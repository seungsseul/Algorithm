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
	static StringBuilder sb = new StringBuilder();
	static int[][] arr;
	static String k, s, od;
	static int kingR, kingC, stoneR, stoneC, N;
	static int[] dr = {0, 0, 1, -1, -1, -1, 1, 1};
	static int[] dc = {1, -1, 0, 0, 1, -1, 1, -1};
	static String[] order = {"R", "L", "B", "T", "RT", "LT", "RB", "LB"};
	static class King {
		int kr;
		int kc;
		public King(int kr, int kc) {
			this.kr = kr;
			this.kc = kc;
		}
		
	}
	static class Stone {
		int sr;
		int sc;
		public Stone(int sr, int sc) {
			super();
			this.sr = sr;
			this.sc = sc;
		}
	}
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		k = st.nextToken(); //1
		kingR = 8-Character.getNumericValue(k.charAt(1));
		kingC = ((int)(k.charAt(0))-64)-1;
		s = st.nextToken(); //2
		stoneR = 8-Character.getNumericValue(s.charAt(1));
		stoneC = ((int)(s.charAt(0))-64)-1;
		N = Integer.parseInt(st.nextToken());
		arr = new int[8][8];
		arr[kingR][kingC]=1;
		arr[stoneR][stoneC]=2;
		move(new King(kingR, kingC), new Stone(stoneR, stoneC), 1);
		loop:
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(arr[i][j]==1) {
					k = String.valueOf((char)(j+65))+String.valueOf(8-i);
					sb.append(k).append("\n");
					break loop;
				}
			}
		}
		loop:
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(arr[i][j]==2) {
					s = String.valueOf((char)(j+65))+String.valueOf(8-i);
					sb.append(s);
					break loop;
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
	static void move(King king, Stone stone, int cnt) throws IOException {
		if(cnt==N+1) {
			return;
		}
		od = br.readLine();
		for(int d=0;d<8;d++) {
			if(od.equals(order[d])) {					
				int kr = king.kr+dr[d];
				int kc = king.kc+dc[d];
				if(kr>=0 && kc>=0 && kr<8 && kc<8) {
					arr[kr][kc]+=arr[king.kr][king.kc];
					arr[king.kr][king.kc]=0;
					if(arr[kr][kc]==3) {
						if(kr+dr[d]>=0 && kc+dc[d]>=0 && kr+dr[d]<8 && kc+dc[d]<8) {
							arr[kr][kc]-=2;
							arr[kr+dr[d]][kc+dc[d]]+=2;
							move(new King(kr, kc), new Stone(kr+dr[d], kc+dc[d]), cnt+1);
						}
						else {
							arr[king.kr][king.kc]++;
							arr[kr][kc]--;
							if(cnt==N) {
								return;
							}
							move(new King(king.kr, king.kc), new Stone(stone.sr, stone.sc), cnt+1);
						}
					}
					else {						
						move(new King(kr, kc), new Stone(stone.sr, stone.sc), cnt+1);
					}
				}
				else {
					move(new King(king.kr, king.kc), new Stone(stone.sr, stone.sc), cnt+1);
				}
				break;
			}
		}
	}
}

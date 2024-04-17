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
	static int[][] map;
	static String[] king_tmp, stone_tmp; 
	static int[] king, stone;
	static int N;
	static String Input;
	static int[] dr = {0,0,-1,1,-1,-1,1,1};
	static int[] dc = {-1,1,0,0,-1,1,-1,1};
	static String[] order = {"L", "R", "T", "B", "LT", "RT", "LB", "RB"};
	public static void main(String[] args) throws IOException {
		map = new int[8][8];
		king = new int[2]; stone = new int[2];
		st = new StringTokenizer(br.readLine());
		king_tmp = st.nextToken().split("");
		king[1]=8-Integer.parseInt(king_tmp[1]);
		king[0]=king_tmp[0].charAt(0)-65;
		stone_tmp = st.nextToken().split("");
		stone[1]=8-Integer.parseInt(stone_tmp[1]);
		stone[0]=stone_tmp[0].charAt(0)-65;
		map[king[1]][king[0]]=1;
		map[stone[1]][stone[0]]=2;
		N = Integer.parseInt(st.nextToken());
		for(int t=1;t<=N;t++) {
			Input = br.readLine();
			for(int i=0;i<8;i++) {
				if(Input.equals(order[i])) {
					int nr = dr[i]+king[1];
					int nc = dc[i]+king[0];
					if(nr>=0 && nr<8 && nc>=0 && nc<8) {						
						if(map[nr][nc]==2) {
							int sr = dr[i]+nr;
							int sc = dc[i]+nc;
							if(sr>=0 && sr<8 && sc>=0 && sc<8) {
								map[nr][nc]=1;
								map[sr][sc]=2;
								map[king[1]][king[0]]=0;
								king[1]=nr; king[0]=nc;
								stone[1]=sr; stone[0]=sc;
							}
						}
						else {
							map[king[1]][king[0]]=0;
							map[nr][nc]=1;
							king[1]=nr; king[0]=nc;
						}
					}
				}
			}
		}
		sb.append((char)(king[0]+65)+""+Math.abs(king[1]-8)).append("\n");
		sb.append((char)(stone[0]+65)+""+Math.abs(stone[1]-8));
		bw.write(sb.toString());bw.close();br.close();
	}
}

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
	static int N, M, store, direc, dis, plusDis, tmpA, tmpB, ans;
	static int[][] map;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		store = Integer.parseInt(br.readLine());
		map = new int[store][2];
		for(int i=0;i<store;i++) {
			st = new StringTokenizer(br.readLine());
			direc = Integer.parseInt(st.nextToken());
			dis = Integer.parseInt(st.nextToken());
			map[i][0] = direc;
			map[i][1] = dis;
		}
		//동근
		st = new StringTokenizer(br.readLine());
		direc = Integer.parseInt(st.nextToken());
		dis = Integer.parseInt(st.nextToken());
		ans = 0;
		for(int i=0;i<store;i++) {
			if(direc==map[i][0]) {
				ans += Math.abs(dis-map[i][1]);
			}
			else if(((direc==1 || direc==2) && (map[i][0]==3 || map[i][0]==4)) || ((direc==3 || direc==4) && (map[i][0]==1 || map[i][0]==2))) {
				//북쪽
				if(direc==1) {
					//서
					if(map[i][0]==3) {
						ans += Math.abs(0-dis)+Math.abs(0-map[i][1]);
					}
					//동
					else {
						ans += Math.abs(N-dis)+Math.abs(0-map[i][1]);
					}
				}
				//남쪽
				else if(direc==2) {
					//서
					if(map[i][0]==3) {
						ans += Math.abs(0-dis)+Math.abs(M-map[i][1]);
					}
					//동
					else {
						ans += Math.abs(N-dis)+Math.abs(M-map[i][1]);
					}
				}
				//서쪽
				else if(direc==3) {
					//북
					if(map[i][0]==1) {
						ans += Math.abs(0-dis)+Math.abs(0-map[i][1]);
					}
					//남
					else {
						ans += Math.abs(M-dis)+Math.abs(0-map[i][1]);
					}
				}
				//동쪽
				else {
					//북
					if(map[i][0]==1) {
						ans += Math.abs(0-dis)+Math.abs(N-map[i][1]);
					}
					//남
					else {
						ans += Math.abs(M-dis)+Math.abs(N-map[i][1]);
					}
				}
			}
			else if((direc==1 && map[i][0]==2) || (direc==2 && map[i][0]==1) || (direc==3 && map[i][0]==4) || (direc==4 && map[i][0]==3)) {
				plusDis = (direc==1 || direc==2) ? N : M;
				ans += plusDis==N ? M : N;
				tmpA = Math.abs(0-dis)+Math.abs(0-map[i][1]);
				tmpB = Math.abs(plusDis-dis)+Math.abs(plusDis-map[i][1]);
				ans += Math.min(tmpA, tmpB);
			}
		}
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
}

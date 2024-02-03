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
	static char[][] map;
	static int N, M, N_cnt, M_cnt;
	static String Input;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		for(int i=0;i<N;i++) {
			Input = br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j]=Input.charAt(j);
			}
		}
		N_cnt=N;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]=='X') {
					N_cnt--;
					break;
				}
			}
		}
		M_cnt=M;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(map[j][i]=='X') {
					M_cnt--;
					break;
				}
			}
		}
		bw.write(String.valueOf(Math.max(N_cnt, M_cnt)));
		bw.flush();bw.close();br.close();
	}
}

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
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken())-1;
		String[][] arr = new String[N][M];
		for(int i=0;i<N;i++) {
			String Input = br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j]=String.valueOf(Input.charAt(j));
			}
		}
		int cnt=0;
		int[] dr = {D, 0};
		int[] dc = {0, D};
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j].equals(".")) {
					Loop:
					for(int d=0;d<2;d++) {
						int nr = i+dr[d];
						int nc = j+dc[d];
						if(nr<0 || nc<0 || nr>=N || nc>=M) {
							continue;
						}
						if(arr[nr][nc].equals("#")) {
							continue;
						}
						if(nr==i) {
							for(int k=1;k<=D-1;k++) {								
								if(arr[nr][nc-k].equals("#")) {
									continue Loop;
								}
							}						
						}
						if(nc==j) {
							for(int k=1;k<=D-1;k++) {
								if(arr[nr-k][nc].equals("#")) {
									continue Loop;
								}
							}
						}
						cnt++;
					}
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
}

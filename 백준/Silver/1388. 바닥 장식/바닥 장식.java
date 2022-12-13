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
	static String[][] arr;
	static int N, M, cnt;
	static String Input;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new String[N][M];
		for(int i=0;i<N;i++) {
			Input = br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j] = String.valueOf(Input.charAt(j));
			}
		}
		for(int i=0;i<N;i++) {
			if(arr[i][0].equals("-")) {
				cnt++;
			}
			
			for(int j=1;j<M;j++) {
				if(arr[i][j].equals("-")) {
					cnt++;
				}
				if(arr[i][j].equals("-") && arr[i][j-1].equals("-")) {
					cnt--;
				}
			}
		}
		for(int i=0;i<M;i++) {
			if(arr[0][i].equals("|")) {
				cnt++;
			}
			for(int j=1;j<N;j++) {
				if(arr[j][i].equals("|")) {
					cnt++;
				}
				if(arr[j][i].equals("|") && arr[j-1][i].equals("|")) {
					cnt--;
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}

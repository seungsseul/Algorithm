import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N, K;
	static char[][] arr;
	static String Input;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		for(int i=0;i<N;i++) {
			Input = br.readLine();
			for(int j=0;j<N;j++) {
				arr[i][j]=Input.charAt(j);
			}
		}
		K = Integer.parseInt(br.readLine());
		if(K==2) {
			for(int i=0;i<N;i++) {
				for(int j=N-1;j>=0;j--) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		}
		else if(K==3) {
			for(int i=N-1;i>=0;i--) {
				for(int j=0;j<N;j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		}
		else {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, A, B, X, taste;
	static int[] chai, fiveth, oneth, oneth2, fiveth2;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		chai = new int[N];
		fiveth = new int[N];
		oneth = new int[N];
		fiveth2 = new int[N];
		oneth2 = new int[N];
		for(int t=0;t<N;t++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			fiveth[t]=A;
			oneth[t]=B;
			taste+=oneth[t];
			chai[t]=B-A;
		}
		
		Arrays.sort(chai);
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(oneth[j]-fiveth[j]==chai[i]) {
					oneth2[i]=oneth[j];
					fiveth2[i]=fiveth[j];
					break;
				}
				
			}
		}
		int cnt = (X-1000*N)/4000;
		for(int i=0;fiveth2[i]>oneth2[i]&&cnt>0;i++) {
			taste-=oneth2[i];
			taste+=fiveth2[i];
			cnt--;
		}
		bw.write(String.valueOf(taste));
		bw.close();
		br.close();
	}
}

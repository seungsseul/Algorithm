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
	static int N, Q, order, tap, liter;
	static int[] waterTap;
	static boolean[] toggle;
	static long sum;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		waterTap = new int[N];
		toggle = new boolean[N];
		sum = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			waterTap[i] = Integer.parseInt(st.nextToken());
			toggle[i]=true;
			sum += waterTap[i];
		}
		sb.append(sum).append("\n");
		Q = Integer.parseInt(br.readLine());
		for(int q=0;q<Q;q++) {
			st = new StringTokenizer(br.readLine());
			order = Integer.parseInt(st.nextToken());
			if(order==1) {
				tap = Integer.parseInt(st.nextToken());
				liter = Integer.parseInt(st.nextToken());
				if(toggle[tap-1]) {					
					sum -= waterTap[tap-1];
					waterTap[tap-1]=liter;
					sum += waterTap[tap-1];
				}
				else {
					waterTap[tap-1]=liter;
				}
			}
			else {
				tap = Integer.parseInt(st.nextToken());
				toggle[tap-1] = !toggle[tap-1];
				if(!toggle[tap-1]) {					
					sum -= waterTap[tap-1];
				}
				else {
					sum += waterTap[tap-1];
				}
			}
			sb.append(sum).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

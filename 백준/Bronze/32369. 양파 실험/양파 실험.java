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
	static int N, A, B, complimentOnion, blameOnion, tmp;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		complimentOnion = 1; blameOnion = 1;
		for(int i=0;i<N;i++) {
			complimentOnion += A;
			blameOnion += B;
			if(complimentOnion<blameOnion) {
				swap();
			}
			else if(complimentOnion==blameOnion) {
				blameOnion--;
			}
		}
		sb.append(complimentOnion).append(" ").append(blameOnion);
		bw.write(sb.toString());bw.close();br.close();
	}
	static void swap() {
		tmp = complimentOnion;
		complimentOnion = blameOnion;
		blameOnion = tmp;
	}
}

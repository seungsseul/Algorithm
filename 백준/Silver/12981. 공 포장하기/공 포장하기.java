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
	static int R, G, B, box;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		G = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		box=0;
		while(true) {
			if(R==0 || G==0 || B==0) {
				break;
			}
			R--;G--;B--;box++;
		}
		if(!(R==0 && G==0 && B==0) && R<=1 && G<=1 && B<=1) {
			box++;
		}
		else {			
			box+=R/3;box+=G/3;box+=B/3;
			R=R%3;G=G%3;B=B%3;
			if(!(R==0 && G==0 && B==0) && R<=1 && G<=1 && B<=1) {
				box++;
			}
			else {				
				if(R>0) {
					box++;
				}
				if(G>0) {
					box++;
				}
				if(B>0) {
					box++;
				}
			}
		}
		bw.write(String.valueOf(box));
		bw.flush();bw.close();br.close();
	}
}

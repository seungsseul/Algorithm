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
	static int N, m, M, T, R, pulse, cnt, sport;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); //할 운동의 시간
		m = Integer.parseInt(st.nextToken()); //최소 맥박
		M = Integer.parseInt(st.nextToken()); //최대 맥박
		T = Integer.parseInt(st.nextToken()); //운동으로 인한 맥박 증가 수
		R = Integer.parseInt(st.nextToken()); //휴식으로 인한 맥박 감소 수
		pulse=m;
		cnt=0;
		sport=0;
		flag=false;
		while(true) {
			if(sport==N) {
				break;
			}
			if(pulse+T<=M) {
				pulse+=T;
				sport++;
			}
			else {
				pulse-=R;
				if(pulse<m) {
					pulse=m;
					if(pulse+T>M) {
						flag=true;
						break;
					}
				}
			}
			cnt++;
		}
		if(flag) {
			bw.write(String.valueOf(-1));
		}
		else {			
			bw.write(String.valueOf(cnt));
		}
		bw.flush();bw.close();br.close();
	}
	
}

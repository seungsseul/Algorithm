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
	static int N, K, tmp, num, cnt, ans;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); //가진 물병의 수
		K = Integer.parseInt(st.nextToken()); //한번에 옮길 수 있는 물병의 수
		num=0;
		ans=-1;
		while(true) {
			if(Math.pow(2, num)>Math.pow(10, 7)) {
				break;
			}
			if(N==Math.pow(2, num)) {
				ans=0;
				break;
			}
			num++;
		}
		if(ans==-1) {
			ans=0;
			while(true) {
				cnt=0;
				tmp=N;
				while(true) {				
					if(tmp%2!=0) {
						cnt++;
					}
					tmp=tmp/2;
					if(tmp==0) {
						break;
					}
				}
				if(cnt<=K) {
					break;
				}
				N++;
				ans++;
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();bw.close();br.close();
	}
}

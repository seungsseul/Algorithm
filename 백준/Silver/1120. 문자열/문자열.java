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
	static String A,B, tmp2;
	static int idx, cnt, max, tmp, tmp3;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		A = st.nextToken();
		B = st.nextToken();
		idx=-1;
		max=0;
		tmp=-1;
		tmp3=1;
		while(true) {
			idx++;
			cnt=0;
			if(idx+A.length()>B.length()) {
				break;
			}
			tmp3=idx;
			for(int i=0;i<A.length();i++) {
				if(A.charAt(i)==B.charAt(idx)) {
					cnt++;
				}
				idx++;
			}
			idx=tmp3;
			if(max<=cnt) {
				max=cnt;
				tmp=idx;
			}
		}
		tmp3=tmp;
		tmp=tmp+A.length();
		while(true) {
			if(tmp==B.length()) {
				break;
			}
			A+=String.valueOf(B.charAt(tmp));
			tmp++;
		}
		tmp2="";
		idx=0;
		while(true) {
			if(idx==tmp3) {
				A=tmp2+A;
				break;
			}
			tmp2+=String.valueOf(B.charAt(idx));
			idx++;
		}
		cnt=0;
		for(int i=0;i<A.length();i++) {
			if(A.charAt(i)!=B.charAt(i)) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}

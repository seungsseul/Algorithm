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
	static int N, cnt;
	static String gifticon, tmp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		for(int t=0;t<N;t++) {
			gifticon = br.readLine();
			tmp="";
			for(int i=2;i<gifticon.length();i++) {
				tmp+=gifticon.charAt(i);
			}
			if(Integer.parseInt(tmp)<=90) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}

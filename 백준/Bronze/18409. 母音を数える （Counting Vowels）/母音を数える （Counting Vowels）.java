import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, cnt;
	static String S;
	public static void main(String[] args) throws NumberFormatException, IOException {
		cnt=0;
		N = Integer.parseInt(br.readLine());
		S = br.readLine();
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='a' || S.charAt(i)=='e' || S.charAt(i)=='i' || S.charAt(i)=='o' || S.charAt(i)=='u') {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}

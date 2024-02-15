import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, cnt, idx;
	static String sottuksottuk;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		sottuksottuk = br.readLine();
		bw.write(String.valueOf(palindrome(sottuksottuk)));bw.flush();
		bw.close();br.close();
	}
	static int palindrome(String str) {
		cnt = 0;
		idx = str.length()-1;
		for(int i=0;i<str.length()/2;i++) {
			cnt += str.charAt(i)==str.charAt(idx) ? 0 : 1;
			idx--;
		}
		return cnt;	
	}
}

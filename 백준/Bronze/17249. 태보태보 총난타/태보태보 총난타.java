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
	static String Input;
	static int cnt;
	public static void main(String[] args) throws IOException {
		Input = br.readLine();
		cnt = 0;
		for(int i=0;i<Input.length();i++) {
			if(Input.charAt(i)=='(') {
				sb.append(cnt).append(" ");
				cnt = 0;
				i+=3;
				continue;
			}
			cnt += Input.charAt(i)=='@' ? 1 : 0;
		}
		sb.append(cnt);
		bw.write(sb.toString());bw.close();br.close();
	}
}

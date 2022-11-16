import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static String Input;
	static int cnt;
	public static void main(String[] args) throws IOException {
		while(true) {
			Input=br.readLine().toLowerCase();
			if(Input.equals("#")) {
				break;
			}
			cnt=0;
			for(int i=0;i<Input.length();i++) {
				if(Input.charAt(i)=='a' || Input.charAt(i)=='e' || Input.charAt(i)=='i' || Input.charAt(i)=='o' || Input.charAt(i)=='u') {
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

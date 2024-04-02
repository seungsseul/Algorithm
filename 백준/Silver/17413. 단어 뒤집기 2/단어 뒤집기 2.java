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
	static StringBuilder word = new StringBuilder();
	static StringBuilder sb = new StringBuilder();
	static String Input;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		Input = br.readLine();
		for(int i=0;i<Input.length();i++) {
			if(Input.charAt(i)=='<') {
				sb.append(word.reverse()).append('<');
				word.setLength(0);
				flag = true;
				continue;
			}
			if(Input.charAt(i)=='>') {
				sb.append(word).append('>');
				word.setLength(0);
				flag = false;
				continue;
			}
			if(Input.charAt(i)==' ' && !flag) {
				sb.append(word.reverse()).append(' ');
				word.setLength(0);
				continue;
			}
			word.append(Input.charAt(i));
		}
		if(!flag) {
			sb.append(word.reverse());
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

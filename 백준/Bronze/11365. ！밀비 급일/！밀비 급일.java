import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringBuilder ans = new StringBuilder();
	static String Input;
	public static void main(String[] args) throws IOException {
		while(true) {
			Input = br.readLine();
			if(Input.equals("END")) {
				break;
			}
			sb.append(Input);
			ans.append(sb.reverse().toString()).append("\n");
			sb.setLength(0);
		}
		bw.write(ans.toString());bw.close();br.close();
	}
}

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
	public static void main(String[] args) throws IOException {
		Input = br.readLine();
		for(int i=0;i<Input.length();i++) {
			if(i!=0 && i%10==0) {
				sb.append("\n");
			}
			sb.append(String.valueOf(Input.charAt(i)));
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

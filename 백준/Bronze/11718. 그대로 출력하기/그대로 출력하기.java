import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		String Input="";
		while((Input = br.readLine()) != null) {			
			sb.append(Input).append("\n");
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
		
	}
}

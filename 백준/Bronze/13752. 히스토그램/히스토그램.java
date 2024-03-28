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
		int k = Integer.parseInt(br.readLine());
		for(int i=0;i<k;i++) {
			sb.append("=".repeat(Integer.parseInt(br.readLine()))).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

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
		sb.append(":fan::fan::fan:").append("\n");
		sb.append(":fan::").append(br.readLine()).append("::fan:").append("\n");
		sb.append(":fan::fan::fan:");
		bw.write(sb.toString());bw.close();br.close();
	}
}

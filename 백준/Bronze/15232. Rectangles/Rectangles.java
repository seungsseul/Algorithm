import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();	
	static int R, C;
	public static void main(String[] args) throws IOException {
		R = Integer.parseInt(br.readLine());
		C = Integer.parseInt(br.readLine());
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

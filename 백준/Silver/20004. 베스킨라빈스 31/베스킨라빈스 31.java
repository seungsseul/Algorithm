import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int A;
	public static void main(String[] args) throws NumberFormatException, IOException {
		A = Integer.parseInt(br.readLine());
		for(int i=1;i<=A;i++) {
			if(30%(i+1)==0) {
				sb.append(i).append("\n");
			}
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

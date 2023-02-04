import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int n, num;
	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		while(true) {
			num = Integer.parseInt(br.readLine());
			if(num==0) {
				break;
			}
			sb.append(num).append(" ").append("is").append(" ");
			if(num<n || num%n!=0) {
				sb.append("NOT").append(" ");
			}
			sb.append("a").append(" ").append("multiple").append(" ").append("of").append(" ").append(n).append(".").append("\n");
		}
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}

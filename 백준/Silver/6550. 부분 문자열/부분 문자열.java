import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static String s, t;
	static char alpabet;
	static int idx;
	public static void main(String[] args) throws IOException {
		loopFirst:
		while(true) {
			String Input = br.readLine();
			if(Input == null) {
				break;
			}
			s = Input.split(" ")[0] ; t = Input.split(" ")[1];
			idx = 0;
			loop:
			for(int i=0;i<s.length();i++) {
				alpabet = s.charAt(i);
				for(int j=idx;j<t.length();j++) {
					if(alpabet==t.charAt(j)) {
						idx = j+1;
						continue loop;
					}
				}
				sb.append("No").append("\n");
				continue loopFirst;
			}
			sb.append("Yes").append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();

	}
	
}

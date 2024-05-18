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
	static StringBuilder sb = new StringBuilder();
	static int P;
	static int[] major;
	public static void main(String[] args) throws IOException {
		P = Integer.parseInt(br.readLine());
		major = new int[5];
		for(int i=0;i<P;i++) {
			st = new StringTokenizer(br.readLine());
			if(Integer.parseInt(st.nextToken())==1) {
				major[4]++;
			}
			else {
				major[Integer.parseInt(st.nextToken())-1]++;
			}
		}
		sb.append(major[0]+major[1]).append("\n");
		for(int i=2;i<major.length;i++) {
			sb.append(major[i]).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

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
	static String name;
	static int age, weight;
	public static void main(String[] args) throws IOException {
		while(true) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			weight = Integer.parseInt(st.nextToken());
			if(name.equals("#") && age==0 && weight==0) {
				break;
			}
			if(age>17 || weight>=80) {
				sb.append(name).append(" ").append("Senior").append("\n");
			}
			else {
				sb.append(name).append(" ").append("Junior").append("\n");
			}
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}

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
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		bw.write(String.valueOf(				
			(int)(Math.pow(Integer.parseInt(st.nextToken()),2)+
			Math.pow(Integer.parseInt(st.nextToken()),2)+
			Math.pow(Integer.parseInt(st.nextToken()),2)+
			Math.pow(Integer.parseInt(st.nextToken()),2)+
			Math.pow(Integer.parseInt(st.nextToken()),2))%10
		));
		bw.flush();bw.close();br.close();
	}
}

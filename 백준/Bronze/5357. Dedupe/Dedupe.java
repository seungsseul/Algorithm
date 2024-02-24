import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int number;
	static String Input, data;
	public static void main(String[] args) throws IOException {
		number = Integer.parseInt(br.readLine());
		for(int t=1;t<=number;t++) {
			Input = br.readLine();
			data = String.valueOf(Input.charAt(0));
			for(int i=0;i<Input.length()-1;i++) {
				data += String.valueOf(Input.charAt(i)).equals(String.valueOf(Input.charAt(i+1))) ? "": String.valueOf(Input.charAt(i+1));
			}
			sb.append(data).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

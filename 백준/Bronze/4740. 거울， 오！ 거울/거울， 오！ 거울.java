import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static String Input, tmp;
	public static void main(String[] args) throws IOException {
		while(true) {
			Input = br.readLine();
			if(Input.equals("***")) {
				break;
			}
			tmp = "";
			for(int i=Input.length()-1;i>=0;i--) {
				tmp += String.valueOf(Input.charAt(i));
			}
			sb.append(tmp).append("\n");
		}
		
		bw.write(sb.toString());bw.close();br.close();
	}
	
}

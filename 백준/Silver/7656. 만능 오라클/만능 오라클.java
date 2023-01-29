import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static String Input;
	public static void main(String[] args) throws IOException {
		Input = br.readLine();
		for(int i=0;i<Input.length();i++) {
			if(Input.charAt(i)=='W' && Input.charAt(i+1)=='h' && Input.charAt(i+2)=='a' && Input.charAt(i+3)=='t' && Input.charAt(i+4)==' ' && Input.charAt(i+5)=='i' && Input.charAt(i+6)=='s') {
				for(int j=i+4;j<Input.length();j++) {
					if(Input.charAt(j)=='.') {
						break;
					}
					if(Input.charAt(j)=='?') {
						sb.append("Forty-two");
						for(int k=i+4;k<Input.length();k++) {
							if(Input.charAt(k)=='?') {
								sb.append(".");
								break;	
							}
							sb.append(String.valueOf(Input.charAt(k)));
						}
						sb.append("\n");
						break;
					}
				}
			}
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

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
	static int sum;
	public static void main(String[] args) throws IOException {
		while(true) {			
			Input = br.readLine();
			if(Input.equals("0")) {
				break;
			}
			sum = 2;
			sum += Input.length()-1;
			for(int i=0;i<Input.length();i++) {
				if(Input.charAt(i)=='0') {
					sum += 4;
				}
				else if(Input.charAt(i)=='1') {
					sum += 2;
				}
				else {
					sum += 3;
				}
			}
			sb.append(sum).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

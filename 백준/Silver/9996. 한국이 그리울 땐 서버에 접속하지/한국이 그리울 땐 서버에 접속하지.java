import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N, point;
	static String pattern, Input, first, last, Ifirst, Ilast;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		pattern = br.readLine();
		point = pattern.indexOf("*");
		first = pattern.substring(0, point);
		last = pattern.substring(point+1);
		for(int t=1;t<=N;t++) {
			Input = br.readLine();
			if(pattern.length()-1>Input.length()) {
				sb.append("NE").append("\n");
			}
			else {			
				Ifirst = Input.substring(0, first.length());
				Ilast = Input.substring(Input.length()-last.length());
				if(first.equals(Ifirst) && last.equals(Ilast)) {
					sb.append("DA").append("\n");
				}
				else {
					sb.append("NE").append("\n");
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}

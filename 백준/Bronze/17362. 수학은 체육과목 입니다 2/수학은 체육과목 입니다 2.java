import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Long.parseLong(br.readLine());
		if (n%8==0) {
			bw.write(String.valueOf(2));
		} 
		else if (n%4==3) {
			bw.write(String.valueOf(3));
		} 
		else if (n%8==6) {
			bw.write(String.valueOf(4));
		} 
		else {
			bw.write(String.valueOf(n%8));
		}
		bw.flush();bw.close();br.close();
	}
}

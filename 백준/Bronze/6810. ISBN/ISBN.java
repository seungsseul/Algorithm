import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		bw.write("The 1-3-sum is "+String.valueOf(9 * 1 + 7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3 + Integer.parseInt(br.readLine()) * 1 + Integer.parseInt(br.readLine()) * 3 + Integer.parseInt(br.readLine()) * 1));
		bw.flush();bw.close();br.close();
	}
}

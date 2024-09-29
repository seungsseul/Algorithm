import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String Input;
	static int ans;
	public static void main(String[] args) throws IOException {
		Input = br.readLine();
		ans = Input.length();
		for(int i=1;i<=Input.length();i++) {
			if(Character.getNumericValue(Input.charAt(i-1))!=i) {
				ans = -1;
				break;
			}
		}
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
}

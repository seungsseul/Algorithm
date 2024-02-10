import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] Name;
	static String ans;
	public static void main(String[] args) throws IOException {
		Name = br.readLine().split("-");
		ans = "";
		for(String n : Name) {
			ans+=String.valueOf(n.charAt(0));
		}
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}

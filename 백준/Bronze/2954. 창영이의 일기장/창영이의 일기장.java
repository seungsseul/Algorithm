import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String Input;
	public static void main(String[] args) throws IOException {
		Input = br.readLine().replaceAll("apa", "a").replaceAll("epe", "e").replaceAll("ipi", "i").replaceAll("opo", "o").replaceAll("upu", "u");
		bw.write(Input);bw.flush();bw.close();br.close();
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int K,D,A;
	static String[] Input;
	public static void main(String[] args) throws IOException {
		Input = br.readLine().split("/");
		K = Integer.parseInt(Input[0]);
		D = Integer.parseInt(Input[1]);
		A = Integer.parseInt(Input[2]);
		if(K+A<D || D==0) {
			bw.write("hasu");
		}
		else {
			bw.write("gosu");
		}
		bw.flush();bw.close();br.close();
	}
}

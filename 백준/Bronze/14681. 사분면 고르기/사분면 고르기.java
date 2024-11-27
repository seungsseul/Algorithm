import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int x, y;
	public static void main(String[] args) throws IOException {
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(x>0 && y>0 ? 1 : x<0 && y<0 ? 3 : x>0 ? 4 : 2));
		bw.flush();bw.close();br.close();
	}
}

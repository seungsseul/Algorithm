import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int Input, score;
	public static void main(String[] args) throws IOException {
		for(int i=0;i<5;i++) {
			Input = Integer.parseInt(br.readLine());
			score+=Input>=40 ? Input : 40;
		}
		bw.write(String.valueOf(score/5));
		bw.flush();bw.close();br.close();
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int first, three, four, five, six;
	static String second;
	public static void main(String[] args) throws IOException {
		first = Integer.parseInt(br.readLine());
		second = br.readLine();
		three = first*(Character.getNumericValue(second.charAt(2)));
		four = first*(Character.getNumericValue(second.charAt(1)));
		five = first*(Character.getNumericValue(second.charAt(0)));
		six = first*Integer.parseInt(second);
		sb.append(three).append("\n").append(four).append("\n").append(five).append("\n").append(six);
		bw.write(sb.toString());bw.close();br.close();
	}
}

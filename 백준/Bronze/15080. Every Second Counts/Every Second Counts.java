import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] firstInput = br.readLine().split(":");
		String[] secondInput = br.readLine().split(":");
		int fh = Integer.parseInt(firstInput[0].trim());
		int fm = Integer.parseInt(firstInput[1].trim());
		int fs = Integer.parseInt(firstInput[2].trim());
		int sh = Integer.parseInt(secondInput[0].trim());
		int sm = Integer.parseInt(secondInput[1].trim());
		int ss = Integer.parseInt(secondInput[2].trim());
			
		int s = (sh-fh)*3600+(sm-fm)*60+ss-fs;
		s = s >= 0 ? s : s+24*3600;
		bw.write(String.valueOf(s));bw.flush();bw.close();br.close();
	}
}

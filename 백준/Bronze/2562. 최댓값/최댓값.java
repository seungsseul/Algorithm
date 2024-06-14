import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int cur, max, idx;
	public static void main(String[] args) throws IOException {
		cur = Integer.parseInt(br.readLine());
		max = cur;
		idx = 1;
		for(int t=2;t<=9;t++) {
			cur = Integer.parseInt(br.readLine());
			if(max<cur) {
				max=cur;
				idx=t;
			}
		}
		bw.write(String.valueOf(max)+"\n"+String.valueOf(idx));bw.flush();bw.close();br.close();
	}
}

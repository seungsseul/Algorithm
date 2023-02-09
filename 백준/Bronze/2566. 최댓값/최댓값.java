import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int num, max, row, col;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		max=-1;
		for(int i=0;i<9;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				num=Integer.parseInt(st.nextToken());
				if(max<=num) {
					max=num;
					row=i+1;
					col=j+1;
				}
			}
		}
		sb.append(max).append("\n").append(row).append(" ").append(col);
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

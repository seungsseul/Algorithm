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
	static StringBuilder sb = new StringBuilder();
	static String Input;
	static double N, B, M;
	static int year;
	public static void main(String[] args) throws IOException {
        while ((Input = br.readLine()) != null) {
        	st = new StringTokenizer(Input, " ");
        	N = (double)Float.parseFloat(st.nextToken());
        	B = (double)Float.parseFloat(st.nextToken());
        	M = (double)Float.parseFloat(st.nextToken());
        	year = 0;
        	while(N<=M) {
        		N = N+(N/100*B);
        		year++;
        	}
        	sb.append(year).append("\n");
        }
        bw.write(sb.toString());bw.close();br.close();
	}
}

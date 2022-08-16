import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st2.nextToken());
		int q = Integer.parseInt(st2.nextToken());
		long t = Integer.parseInt(br.readLine());
		long sR = (t + p) / w;
		long rR = (t + p) % w;
		long sC = (t + q) / h;
		long rC = (t + q) % h;		
		long aR = ( sR % 2 == 0 ) ? rR : w - rR;
		long aC = ( sC % 2 == 0 ) ? rC : h - rC;	
		StringBuilder sb = new StringBuilder();
		sb.append(aR);
		sb.append(" ");
		sb.append(aC);
		System.out.println(sb);
		br.close();
	}
}
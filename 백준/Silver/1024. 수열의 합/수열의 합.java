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
	static int N, L, num, sum;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		loop:
		for(int i=L;i<=100;i++) {
			num = (2*N)/(2*i)-(i*(i-1))/(2*i);
			sum = i*num+(i-1)*i/2;
			if(sum==N) {
				for(int j=num;j<num+i;j++) {
					if(j<0) {
						continue loop;
					}
					sb.append(j).append(" ");
				}
				flag = true;
				break;
			}
		}
		if(!flag) {
			sb.setLength(0);
			sb.append(-1);
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

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
	static double A,B,V;
	static int ans;
	static long[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		if(A==V) {
			bw.write("1");
		}
		else {
			ans = (int) Math.ceil((V-A)/(A-B)); //첫날제외 앞으로 이동할 거리를 하루동안 이동한 거리로 나눠준다.
			//소수점이 생기는 결과 고려 올림처리 (소수점이 있다는 것은 그날보다 조금더 이동해야 한다는 의미이므로)
			ans++; //첫날더해주고 출력
			bw.write(String.valueOf(ans));
		}
		bw.flush();
		bw.close();
		br.close();	
	}
}

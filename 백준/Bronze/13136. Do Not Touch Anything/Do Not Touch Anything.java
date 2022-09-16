import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double R = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		double N = Double.parseDouble(st.nextToken());
		//가로와 세로의 길이를 N의 범위로 각각 나누고 만약 나머지가 생긴다면 반올림해서 계산
		long ans =( (long) (Math.ceil(R/N)) )*( (long) (Math.ceil(C/N)));
		System.out.println(ans);
		br.close();
	}
}
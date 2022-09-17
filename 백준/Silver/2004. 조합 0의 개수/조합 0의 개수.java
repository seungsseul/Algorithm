import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//10=2*5이므로 0의 개수는 분자의 2와 5중 더 적은 값
		//조합에서는 분모또한 2와 5가 있으므로 2와 5의 분자의 수-분모의 수를 해주어야 한다
		// nCm = n! / (n-m)! m! 이므로 각각의 n!의수 - ((n-m)!의수 + m!의수) 중 더 적은 값이 0의 개수 
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int n_m = n-m;
		int tmpn = n;
		int tmpm = m;
		int tmpn_m = n_m;
		int cnt2_nume = 0;
		int cnt2_deno = 0;
		int cnt5_nume = 0;
		int cnt5_deno = 0;
		//분자의 2개수 구하기
		while(n>=2) {
			cnt2_nume+=n/2;
			n/=2;
		}
		//분모의 2개수 구하기
		while(n_m>=2) {
			cnt2_deno+=n_m/2;
			n_m/=2;
		}
		int tmp=0;
		while(m>=2) {
			tmp+=m/2;
			m/=2;
		}
		cnt2_deno = cnt2_deno+tmp;
		
		//n, m, n_m값 초기화
		n=tmpn;m=tmpm;n_m=tmpn_m;
		
		//분자의 5개수 구하기
		while(n>=5) {
			cnt5_nume+=n/5;
			n/=5;
		}
		//분모의 5개수 구하기
		while(n_m>=5) {
			cnt5_deno+=n_m/5;
			n_m/=5;
		}
		tmp=0;
		while(m>=5) {
			tmp+=m/5;
			m/=5;
		}
		cnt5_deno = cnt5_deno+tmp;
		System.out.println(Math.min(cnt5_nume-cnt5_deno, cnt2_nume-cnt2_deno));
		br.close();
	}
}
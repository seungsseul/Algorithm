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
	static int N,sum,ans;
	static int[] Time, Price;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		Time = new int[N];
		Price = new int[N];
		sum=0;
		ans=0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			Time[i]=Integer.parseInt(st.nextToken());
			Price[i]=Integer.parseInt(st.nextToken());
		}
		dfs(0,0);
		
		
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		br.close();
		
	}
	static void dfs(int idx, int sum) {
		//조건에 맞는경우 최대수익 최신화
		if(idx==N) {
			if(sum>ans) {
				ans=sum;
			}
			return;
		}
		
		//N을 넘을 경우 상담불가
		if(idx>N) {
			return;
		}
		
		//해당 상담의 기간과 걸리는 비용을 가지고 재귀
		dfs(idx+Time[idx], sum+Price[idx]);
		
		//상담을 하지않을 경우 현재비용을 가지고 다음 인덱스 탐색
		dfs(idx+1,sum);
	}
}

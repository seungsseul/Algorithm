import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, ans;
	static int[] arr = {1,5,10,50};
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		visited = new boolean[1001];
		ans = 0;
		dfs(0,0,0);
		bw.write(String.valueOf(ans));
		bw.flush();bw.close();br.close();
	}
	static void dfs(int depth, int start, int sum) {
		if(depth==N) {
			// 수의 합이 이전에 나온적 없는 수라면 count
			if(!visited[sum]) {
				ans++;
				visited[sum]=true;
			}
			return;
		}
		
		// 수의 선택의 중복을 피하기 위해 start 부터 탐색 시작
		for(int i=start;i<4;i++) {
			dfs(depth+1,i,sum+arr[i]);
		}
	}
}

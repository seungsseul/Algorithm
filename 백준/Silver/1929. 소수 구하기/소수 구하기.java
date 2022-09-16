import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[N+1];
		//M이 1일 경우 고려
		arr[1]=true;
		//2단부터 N+1의 제곱근 단까지 탐색하여 걸리는 수들은 모두 true로 전환
		for(int i=2;i<=Math.sqrt(N+1);i++) {
			for(int j=i*i;j<N+1;j+=i) {
				arr[j]=true;
			}
		}
		//인덱스 M부터 N까지 arr을 탐색해서 false이면 해당 인덱스 출력
		for(int i=M;i<=N;i++) {
			if(!arr[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		br.close();
	}
}
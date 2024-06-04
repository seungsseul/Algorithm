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
	static int N, M;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		combination(0,0);
		bw.write(sb.toString());bw.close();br.close();
	}
	static void combination(int depth, int first) {
		if(depth==M) {
			for(int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=first;i<N;i++) {
			// visited 배열은 사용하지 않음
			// 조합과는 다르게 중복이 가능하기 때문에 선택한 원소를 저장하는 배열은 필요!
			arr[depth]=i+1;
			// 현재 선택한 원소보다 뒤의 것만 선택 가능하지 않고,
			// 현재 선택한 원소를 포함하여 그 뒤의 것들을 선택 가능한 것이므로 
			// 재귀 호출에서 start로 i+1을 넘기던 조합 코드에서
			// 그냥 i를 넘기는 것으로 수정
			combination(depth+1, i);
		}
	}
}

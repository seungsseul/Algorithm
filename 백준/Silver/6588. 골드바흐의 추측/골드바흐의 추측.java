import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[1000001];
		//소수인홀수 2단부터 조건최대범위의 제곱근 단까지 탐색하여 걸리는 수들은 모두 true로 전환
		for(int i=2;i<=Math.sqrt(1000001);i++) {
			for(int j=i*i;j<1000001;j+=i) {
				arr[j]=true;
			}
		}
		List<Integer> list = new ArrayList<>();			
		//소수인홀수 범위 탐색해서 배열값이 false이면 소수이므로 리스트에 추가
		for(int i=3;i<=999999;i+=2) {
			if(!arr[i]) {
				list.add(i);
			}
		}
		while(true) {
			int N = Integer.parseInt(br.readLine());
			//0이 입력되면 종료
			if(N==0) {
				break;
			}
			boolean correct = false;
			//N에서 list.get(i)를 뺀값이 인덱스일때 배열값이 false면 소수라는 뜻
			//절댓값도 당연히 제일 큰수이므로 해당 값 출력
			//임의의 값 boolean true로 변경
			for(int i=0;i<list.size();i++) {
				if(!arr[N-list.get(i)]) {
					sb.append(N).append(" = ").append(list.get(i)).append(" + ").append(N-list.get(i)).append("\n");
					correct = true;
					break;
				}
			}
			//만약 N과 같은 요솟값이 없으면 해당 문구 반환
			if(!correct) {
				sb.append("Goldbach's conjecture is wrong.").append("\n");
				continue;
			}
		}
		System.out.println(sb);
		br.close();
	}
}

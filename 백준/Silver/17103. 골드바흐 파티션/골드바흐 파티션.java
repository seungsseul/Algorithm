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
		arr[0]=true;
		arr[1]=true;
		//2단부터 조건최대범위의 제곱근 단까지 탐색하여 걸리는 수들은 모두 true로 전환
		for(int i=2;i<=Math.sqrt(1000001);i++) {
			for(int j=i*i;j<1000001;j+=i) {
				arr[j]=true;
			}
		}
		List<Integer> list = new ArrayList<>();
		list.add(2);
		//소수인홀수 범위 탐색해서 배열값이 false이면 소수이므로 리스트에 추가
		for(int i=3;i<=999999;i+=2) {
			if(!arr[i]) {
				list.add(i);
			}
		}
		int T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			int N = Integer.parseInt(br.readLine());
			//N에서 list.get(i)를 뺀값을 인덱스로 가지는 배열이 false면 소수라는 뜻
			//N-list.get(i)가 list.get(i)보다 작아지면 중복된 경우의 수 or 음수가 될 수 있으므로 배제
			int cnt=0;
			for(int i=0;i<list.size();i++) {
				if(N-list.get(i)>=list.get(i)) {					
					if(!arr[N-list.get(i)]) {
						cnt++;
					}
				}
				else {
					break;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}

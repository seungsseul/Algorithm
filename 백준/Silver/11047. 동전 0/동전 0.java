import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int tmp=K;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			int A = Integer.parseInt(br.readLine());
			if(A<=K) {
				list.add(A);
			}
		}
		int cnt=0;
		int sum=0;
		cnt += (K/list.get(list.size()-1));
		sum += list.get(list.size()-1)*(K/list.get(list.size()-1));
		K = K%list.get(list.size()-1);
		list.remove(list.size()-1);
		while(true) {
			if(sum==tmp) {
				break;
			}
			if(K/list.get(list.size()-1)!=0) {
				cnt += (K/list.get(list.size()-1));
				sum += list.get(list.size()-1)*(K/list.get(list.size()-1));
				K = K%list.get(list.size()-1);
				list.remove(list.size()-1);
			}
			else {
				list.remove(list.size()-1);
			}
		}
		System.out.println(cnt);
		br.close();
	}
}

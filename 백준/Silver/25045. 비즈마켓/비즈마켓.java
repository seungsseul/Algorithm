import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, M, idx;
	static long ans, cus;
	static List<Long> list, list2;
	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		list = new ArrayList<>();
		list2 = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			list.add(Long.parseLong(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			list2.add(Long.parseLong(st.nextToken()));
		}
		Collections.sort(list);
		Collections.sort(list2);
		ans=0;
		idx=N-1;
		for(int i=0;i<M;i++) {
			if(idx==-1) {
				break;
			}		
			cus = list2.get(i);
			if(list.get(idx)-cus<0) {				
				continue;
			}
			ans += (list.get(idx)-cus);
			idx--;
		}
		bw.write(String.valueOf(ans));
		bw.flush();bw.close();br.close();
	}
}

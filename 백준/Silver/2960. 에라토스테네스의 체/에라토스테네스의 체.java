import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N,K,P;
	static List<Integer> list, list2;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		list = new ArrayList<Integer>();
		list2 = new ArrayList<Integer>();
		for(int i=2;i<=N;i++) {
			list.add(i);
			
		}
		while(true) {
			if(list.isEmpty()) {
				break;
			}
			P = list.get(0);
			list.remove(0);
			if(P==2 || P==3 || P==5 || P==7 || (P%2!=0 && P%3!=0 && P%5!=0 && P%7!=0)) {
				list2.add(P);
				for(int i=0;i<list.size();i++) {
					if(list.get(i)%P==0) {
						list2.add(list.get(i));
						list.remove(i);
					}
				}
			}
		}
		bw.write(String.valueOf(list2.get(K-1)));
		bw.flush();
		bw.close();
		br.close();
	}
}

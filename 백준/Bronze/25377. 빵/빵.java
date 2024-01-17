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
	static List<Integer> list;
	static int N, A, B, ans;
	public static void main(String[] args) throws IOException {
		list = new ArrayList<Integer>();
		N = Integer.parseInt(br.readLine());
		for(int t=0;t<N;t++) {			
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			if(A<=B) {
				list.add(B);
			}
		}
		Collections.sort(list);
		ans = list.isEmpty() ? -1 : list.get(0);
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
}

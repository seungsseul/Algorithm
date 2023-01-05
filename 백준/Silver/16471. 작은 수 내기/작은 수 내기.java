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
	static int N, score, max, idx;
	static List<Integer> juon, chief;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		juon = new ArrayList<>();
		chief = new ArrayList<>();
		score=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			juon.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(juon);
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			chief.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(chief);
		idx=(N+1)/2-1;
		for(int i=0;i<(N+1)/2;i++) {				
			if(chief.get(idx)>juon.get(i)) {
				score++;
			}
			idx++;
		}
		if(score>=(N+1)/2) {
			bw.write("YES");
		}
		else {
			bw.write("NO");
		}
		bw.flush();bw.close();br.close();
	}
		
}

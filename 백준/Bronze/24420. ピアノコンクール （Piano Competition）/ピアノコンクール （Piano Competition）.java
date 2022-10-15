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
	static int sum, N;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		list = new ArrayList<>();
		for(int i=0;i<N;i++) {			
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		list.remove(list.size()-1);
		list.remove(0);
		sum=0;
		for(int i=0;i<list.size();i++) {			
			sum+=list.get(i);
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}

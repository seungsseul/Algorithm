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
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static List<Integer> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		list = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken()); 
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i)).append(" ");
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

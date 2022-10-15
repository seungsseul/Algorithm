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
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		list = new ArrayList<>();
		list.add(Integer.parseInt(st.nextToken()));
		list.add(Integer.parseInt(st.nextToken()));
		list.add(Integer.parseInt(st.nextToken()));
		Collections.sort(list);
		bw.write(String.valueOf((list.get(2)-list.get(0))+(list.get(2)-list.get(1))));
		bw.flush();
		bw.close();
		br.close();
	}
}

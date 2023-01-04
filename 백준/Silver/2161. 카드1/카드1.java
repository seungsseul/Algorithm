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
	static StringBuilder sb = new StringBuilder();
	static int N;
	static List<Integer> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		list = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			list.add(i);
		}
		while(list.size()>1) {
			sb.append(list.get(0)).append(" ");
			list.remove(0);
			list.add(list.get(0));
			list.remove(0);
		}
		sb.append(list.get(0));
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}

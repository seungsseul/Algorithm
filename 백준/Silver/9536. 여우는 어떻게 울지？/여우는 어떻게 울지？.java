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
	static StringBuilder sb = new StringBuilder();
	static int T, cnt;
	static String Input, tmp;
	static List<String> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			list = new ArrayList<String>();
			cnt = st.countTokens();
			for(int i=0;i<cnt;i++) {
				list.add(st.nextToken());
			}
			while(true) {
				Input = br.readLine();
				if(Input.equals("what does the fox say?")) {
					break;
				}
				st = new StringTokenizer(Input);
				st.nextToken();
				st.nextToken();
				tmp = st.nextToken();
				for(int i=0;i<list.size();i++) {
					if(tmp.equals(list.get(i))) {
						list.remove(i);
						list.add(i, "");
					}
				}
			}
			for(int i=0;i<list.size();i++) {
				if(!list.get(i).equals("")) {					
					sb.append(list.get(i)).append(" ");
				}
			}
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}

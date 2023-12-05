import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int T, G, m;
	static int[] student;
	static List<Integer> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			G = Integer.parseInt(br.readLine());
			student = new int[G];
			for(int i=0;i<G;i++) {
				student[i] = Integer.parseInt(br.readLine());
			}
			if(student.length==1) {
				sb.append(String.valueOf(1)).append("\n");
				continue;
			}
			m = 2;
			while(true) {
				list = new ArrayList<Integer>();
				for(int i=0;i<G;i++) {
					if(list.contains(student[i]%m)) {
						break;
					}
					list.add(student[i]%m);
				}
				if(list.size()==G) {					
					sb.append(String.valueOf(m)).append("\n");
					break;
				}
				m++;
			}
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

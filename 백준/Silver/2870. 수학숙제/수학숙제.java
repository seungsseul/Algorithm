import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N, tmp_len;
	static String Input, tmp;
	static PriorityQueue<String> pq;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		pq = new PriorityQueue<>(new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length()-o2.length();
			}
		});
		for(int t=1;t<=N;t++) {			
			Input = br.readLine();
			tmp = "";
			for(int i=0;i<Input.length();i++) {
				if(Input.charAt(i)>=48 && Input.charAt(i)<=57) {
					tmp+=String.valueOf(Input.charAt(i));
				}
				else {
					if(!tmp.equals("")) {
						tmp_len = tmp.length()-1;
						for(int j=0;j<tmp_len;j++) {
							if(tmp.charAt(0)!=48) {
								break;
							}
							tmp = tmp.substring(1);
						}
						pq.offer(tmp);
						tmp = "";
					}
				}
			}
			if(!tmp.equals("")) {
				tmp_len = tmp.length()-1;
				for(int j=0;j<tmp_len;j++) {
					if(tmp.charAt(0)!=48) {
						break;
					}
					tmp = tmp.substring(1);
				}
				pq.offer(tmp);
				tmp = "";
			}
		}
		while(!pq.isEmpty()) {
			sb.append(pq.poll()).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}

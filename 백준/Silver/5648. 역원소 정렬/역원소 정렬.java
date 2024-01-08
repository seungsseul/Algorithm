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
	static int n, cnt;
	static String tmp, strNum;
	static List<Long> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		cnt=0;
		offerNum(st.countTokens());
		while(cnt<n) {
			st = new StringTokenizer(br.readLine());
			offerNum(st.countTokens());
		}
		Collections.sort(list);
		for(long num : list) {
			if(num!=0) {				
				sb.append(num).append("\n");
			}
		}
		bw.write(sb.toString());bw.close();br.close();
	}
	static void offerNum(int countTokens) {
		strNum="";
		for(int i=0;i<countTokens;i++) {
			tmp = st.nextToken();
			reverseWord(tmp);
			list.add(Long.parseLong(strNum));
			cnt++;
			strNum="";
		}
	}
	static void reverseWord(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			strNum+=String.valueOf(str.charAt(i));
		}
	}
}

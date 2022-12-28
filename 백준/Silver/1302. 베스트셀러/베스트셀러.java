import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, cnt, max;
	static String book;
	static List<String> list, ans;
	static String[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		list = new ArrayList<String>();
		ans = new ArrayList<String>();
		arr = new String[N];
		for(int i=0;i<N;i++) {
			book = br.readLine();
			arr[i]=book;
			if(!list.contains(book)) {
				list.add(book);
			}
		}
		max=0;
		for(int i=0;i<list.size();i++) {			
			cnt=0;
			for(int j=0;j<N;j++) {
				if(list.get(i).equals(arr[j])) {
					cnt++;
				}
			}
			if(max<cnt) {
				max=cnt;
				ans.clear();
				ans.add(list.get(i));
			}
			else if(max==cnt) {
				max=cnt;
				ans.add(list.get(i));
			}
		}
		Collections.sort(ans);
		bw.write(ans.get(0));bw.flush();bw.close();br.close();
	}
}

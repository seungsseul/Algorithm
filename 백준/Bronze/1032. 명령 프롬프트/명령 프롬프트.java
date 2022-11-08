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
	static int N;
	static String ans;
	static String[] arr;
	static List<Integer> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new String[N];
		list = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			arr[i]=br.readLine();
		}
		for(int i=1;i<N;i++) {
			for(int j=0;j<arr[0].length();j++) {
				if(arr[0].charAt(j)!=arr[i].charAt(j)) {
					list.add(j);
				}
			}
		}
		ans="";
		Loop:
		for(int i=0;i<arr[0].length();i++) {
			for(int j=0;j<list.size();j++) {				
				if(i==list.get(j)) {
					list.remove(j);
					ans+="?";
					continue Loop;
				}
			}
			ans+=String.valueOf(arr[0].charAt(i));
		}
		bw.write(ans);
		bw.flush();
		bw.close();
		br.close();
	}
}

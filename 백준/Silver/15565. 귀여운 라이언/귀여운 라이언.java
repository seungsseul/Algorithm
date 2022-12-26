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
	static int N, K, len, min, cnt;
	static int[] arr;
	static List<Integer> list;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[st.countTokens()];
		list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]==1) {
				list.add(i);
			}
		}
		min=Integer.MAX_VALUE;
		for(int i=K-1;i<list.size();i++) {
			len=(list.get(i)+1)-list.get(i-(K-1));
			if(min>len) {
				min=len;
			}
		}
		if(min==Integer.MAX_VALUE) {
			bw.write(String.valueOf(-1));
		}
		else {			
			bw.write(String.valueOf(min));
		}
		bw.flush();bw.close();br.close();
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, M, ans;
	static int[] arr;
	static HashSet<Integer> set;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		set = new HashSet<Integer>();
		M=0;
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			M+=arr[i];
		}
		dfs(0,0);
		ans = M-set.size()+1;
		bw.write(String.valueOf(ans));
		bw.flush();bw.close();br.close();
	}
	static void dfs(int num, int sum) {
		set.add(sum);
		if(num==N) {
			return;
		}
		
		dfs(num+1, sum+arr[num]);
		dfs(num+1, sum);
		
	}
}

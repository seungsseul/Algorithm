import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[] arr;
	static int cnt, ans;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		arr = new int[5];
		cnt=0;ans=0;
		for(int i=0;i<5;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		dfs(3);
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		br.close();
	}
	static void dfs(int num) {
		if(cnt>=3) {
			ans=num-1;
			return;
		}
		cnt=0;
		for(int i=0;i<5;i++) {
			if(num%arr[i]==0) {
				cnt++;
			}
		}
		dfs(num+1);
		
	}
}

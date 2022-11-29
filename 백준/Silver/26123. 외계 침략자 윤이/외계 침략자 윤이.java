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
	static StringBuilder sb = new StringBuilder();
	static int N, D, max;
	static long cnt;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); //건물의 개수
		D = Integer.parseInt(st.nextToken()); //윤이가 계획을 수행한 날의 수
		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		max=-1;
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		cnt=0;
		int tmp = max-D;
		if(tmp<0) {
			tmp=0;
		}
		for(int i=0;i<N;i++) {
			if(arr[i]>tmp) {				
				cnt+=(arr[i]-tmp);
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}

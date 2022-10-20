import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, arrow, cnt;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new int[1000001];
		st = new StringTokenizer(br.readLine());
		cnt=0;
		for(int i=0;i<N;i++) {
			arrow=Integer.parseInt(st.nextToken());
			if(arr[arrow]==0) {
				arr[arrow-1]++;
				cnt++;
			}
			else {
				arr[arrow]--;
				arr[arrow-1]++;
			}
		}
		System.out.println(cnt);
	}	
}

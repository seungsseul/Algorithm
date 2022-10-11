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
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[] arr = new int[1001];
		int num=1;
		int cnt=0;
		for(int i=1;i<1001;i++) {
			arr[i]=num;
			cnt++;
			if(cnt==num) {
				cnt=0;
				num++;
			}
		}
		int sum=0;
		for(int i=A;i<=B;i++) {
			sum+=arr[i];
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}

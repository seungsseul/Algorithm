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
	static int N,M,J,start,cnt;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		J = Integer.parseInt(br.readLine());
		arr = new int[J];
		
		//사과 배열에 담기
		for(int i=0;i<J;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		start=M;
		cnt=0;
		for(int i=0;i<J;i++) {
			while(true) {
				//바구니 안에 있을때
				if(arr[i]<=start && arr[i]>=start-(M-1)) {
					break;
				}
				else {
					//바구니 왼쪽에 있을때
					if(arr[i]<start) {
						cnt++;
						start--;
					}
					//바구니 오른쪽에 있을때
					else if(arr[i]>start) {
						cnt++;
						start++;
					}
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();		
	}
}

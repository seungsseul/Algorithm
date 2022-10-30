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
	static int N, A, B, C;
	static long coach; //가능한 코치수가 int범위를 벗어날 수 있으므로 long으로 설정
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		//시험장 배열에 각 응시자수 넣기
		for(int i=0;i<N;i++) {			
			A = Integer.parseInt(st.nextToken());
			arr[i]=A;
		}
		st = new StringTokenizer(br.readLine());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		coach=0;
		//각 응시장배열을 돌면서 총감독관이 커버할수 있는 사람수를 먼저 제외하고
		//나머지 값으로 부감독관이 감시할수 있는 응시자수 계산해서 coach에 더해주기
		for(int i=0;i<arr.length;i++) {
			coach++;
			arr[i]=arr[i]-B;
			if(arr[i]<=0) {
				continue;
			}
			coach+=arr[i]/C;
			arr[i]=arr[i]%C;
			if(arr[i]!=0) {
				coach++;					
			}
		}
		bw.write(String.valueOf(coach));
		bw.flush();
		bw.close();
		br.close();
	}
}

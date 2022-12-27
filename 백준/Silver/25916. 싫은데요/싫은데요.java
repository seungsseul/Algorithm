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
	static int N, M, sum, start, end, max;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); //독의 구멍개수
		M = Integer.parseInt(st.nextToken()); //햄스터의 부피
		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		sum=0;
		end=0;
		max=0;
		while(end<N) {
	        if (sum+arr[end]<=M) {
	            sum+=arr[end];
	            max=Math.max(max, sum);
	            end++;
	        } else {
	            sum-=arr[start];
	            start++;
	        }
	        if (start>end) {
	            sum+=arr[end];
	            end++;
	        }
	    }
		bw.write(String.valueOf(max));
		bw.flush();bw.close();br.close();
	}
}

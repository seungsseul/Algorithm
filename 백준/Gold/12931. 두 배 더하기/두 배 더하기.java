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
	static int N, Input, cnt, cnt2, max;
	static List<Integer> B;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		B = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			Input = Integer.parseInt(st.nextToken());
			if(Input!=0) {
				B.add(Input);
			}
		}
		cnt=0;
		max=0;
		for(int i=0;i<B.size();i++) {
			cnt2=0;
			while(true) {
				if(B.get(i)<=0) {
					break;
				}
				if(B.get(i)%2==1) {
					cnt++;
					B.set(i, B.get(i)-1);
				}
				else {
					B.set(i, B.get(i)/2);
					cnt2++;
				}
			}
			max=Math.max(max, cnt2);
		}
		cnt=cnt+max;
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
		
		
	}
}

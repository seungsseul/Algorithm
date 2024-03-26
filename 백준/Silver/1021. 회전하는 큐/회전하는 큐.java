import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static Deque<Integer> dq;
	static int N, M, now, tmp, idx, size, cnt;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		dq = new LinkedList<Integer>();
		for(int i=0;i<N;i++) {
			dq.offer(i+1);
		}
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		cnt = 0;
		idx = 0;
		for(int i=0;i<M;i++) {
			now = Integer.parseInt(st.nextToken());
			size = dq.size();
			idx = 0;
			flag = true;
			for(int j=0;j<size;j++) {
				tmp = dq.pollFirst();
				idx += flag ? 1 : 0;
				dq.offerLast(tmp);
				if(tmp==now) {
					flag = false;
				}
			}
			while(true) {
				if(dq.peekFirst()==now) {
					tmp = dq.pollFirst();	
					idx--;
					break;					
				}
				if(dq.peekLast()==now) {
					tmp = dq.pollLast();
					cnt++;
					break;
				}
				//뒤에서빼기
				if(Math.abs(dq.size()-idx)<idx-1) {
					tmp = dq.pollLast();
					dq.offerFirst(tmp);
					cnt++;
					idx++;
				}
				//앞에서빼기
				else {
					tmp = dq.pollFirst();
					dq.offerLast(tmp);
					cnt++;
					idx--;
				}
			}
		}
		bw.write(String.valueOf(cnt));bw.flush();bw.close();br.close();
	}
}

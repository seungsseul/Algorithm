import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Deque<Integer> dq = new LinkedList<>();
		for(int t=1;t<=N;t++) {
			st = new StringTokenizer(br.readLine());
			//명령어가 push일때는 뒤에 숫자가 붙으므로 아닐때와 구분
			if(st.countTokens()==2) {
				String fb = st.nextToken();
				int order = Integer.parseInt(st.nextToken());
				if(fb.equals("push_back")) {
					dq.offerLast(order);
				}
				else {
					dq.offerFirst(order);
				}
			}
			else {
				//나머지 Deque 내장함수 활용하여 구분출력
				String order = st.nextToken();
				if(order.equals("front")) {
					if(dq.isEmpty()) {
						sb.append(-1);
					}
					else {
						sb.append(dq.getFirst());
					}
				}
				else if(order.equals("back")) {
					if(dq.isEmpty()) {
						sb.append(-1);
					}
					else {
						sb.append(dq.getLast());
					}
				}
				else if(order.equals("size")) {
					sb.append(dq.size());
				}
				else if(order.equals("pop_front")) {
					if(dq.isEmpty()) {
						sb.append(-1);
					}
					else {
						sb.append(dq.pollFirst());
					}
				}
				else if(order.equals("pop_back")) {
					if(dq.isEmpty()) {
						sb.append(-1);
					}
					else {
						sb.append(dq.pollLast());
					}
				}
				else if(order.equals("empty")) {
					if(dq.isEmpty()) {
						sb.append(1);
					}
					else {
						sb.append(0);
					}
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
		br.close();
	}
}
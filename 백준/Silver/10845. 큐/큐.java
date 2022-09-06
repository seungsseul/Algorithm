import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Queue<Integer> queue = new LinkedList<>();
		int push=0;
		for(int t=1;t<=N;t++) {
			st = new StringTokenizer(br.readLine());
			//명령어가 push일때는 뒤에 숫자가 붙으므로 아닐때와 구분
			if(st.countTokens()==2) {
				st.nextToken();
				int order = Integer.parseInt(st.nextToken());
				queue.offer(order);		
				push=order;
			}
			else {
				//나머지 stack 내장함수 활용하여 구분출력
				String order = st.nextToken();
				if(order.equals("front")) {
					if(queue.isEmpty()) {
						sb.append(-1);
					}
					else {
						sb.append(queue.peek());
					}
				}
				else if(order.equals("back")) {
					if(queue.isEmpty()) {
						sb.append(-1);
					}
					else {
						sb.append(push);
					}
				}
				else if(order.equals("size")) {
					sb.append(queue.size());
				}
				else if(order.equals("pop")) {
					if(queue.isEmpty()) {
						sb.append(-1);
					}
					else {
						sb.append(queue.poll());
					}
				}
				else if(order.equals("empty")) {
					if(queue.isEmpty()) {
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
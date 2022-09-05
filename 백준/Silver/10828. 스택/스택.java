import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int t=1;t<=N;t++) {
			st = new StringTokenizer(br.readLine());
			if(st.countTokens()==2) {
				st.nextToken();
				int order = Integer.parseInt(st.nextToken());
				stack.push(order);			
			}
			else {
				String order = st.nextToken();
				if(order.equals("top")) {
					if(stack.empty()) {
						sb.append(-1);
					}
					else {
						sb.append(stack.get(stack.size()-1));
					}
				}
				else if(order.equals("size")) {
					sb.append(stack.size());
				}
				else if(order.equals("pop")) {
					if(stack.empty()) {
						sb.append(-1);
					}
					else {
						sb.append(stack.pop());
					}
				}
				else if(order.equals("empty")) {
					if(stack.empty()) {
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
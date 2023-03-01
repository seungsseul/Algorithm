import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int N, tmp, num;
	static Stack<Integer> stack;
	static Stack<Integer> idx_stack;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		stack = new Stack<>();
		idx_stack = new Stack<>();

		for(int i=1;i<=N;i++) {
			num=Integer.parseInt(st.nextToken());

			while(true) {
				if(stack.isEmpty()) {
					break;
				}
				if(stack.peek()>=num) {
					sb.append(idx_stack.peek()).append(" ");
					break;
				}
				else {					
					stack.pop();
					idx_stack.pop();
				}
			}
			if(stack.isEmpty()) {
				sb.append("0").append(" ");
			}	
			idx_stack.push(i);
			stack.push(num);
		}

		bw.write(sb.toString());bw.close();br.close();
	}
}

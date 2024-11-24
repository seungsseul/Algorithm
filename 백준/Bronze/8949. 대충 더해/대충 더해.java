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
	static int len;
	static String A, B, answer;
	static Stack<Integer> stack_A, stack_B;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		A = st.nextToken();
		B = st.nextToken();
		stack_A = new Stack<>(); stack_B = new Stack<>();
		for(int i=0;i<A.length();i++) {
			stack_A.push(Character.getNumericValue(A.charAt(i)));
		}
		for(int i=0;i<B.length();i++) {
			stack_B.push(Character.getNumericValue(B.charAt(i)));
		}
		answer = "";
		while(!(stack_A.isEmpty() && stack_B.isEmpty())) {
			if(stack_A.isEmpty()) {
				answer = String.valueOf(stack_B.pop())+answer;
				continue;
			}
			else if(stack_B.isEmpty()) {
				answer = String.valueOf(stack_A.pop())+answer;
				continue;
			}
			answer = String.valueOf(stack_A.pop() + stack_B.pop())+answer;
		}
		bw.write(answer);bw.flush();bw.close();br.close();
	} 
}

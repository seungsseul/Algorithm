import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String Input;
	static int tmp, ans;
	static Stack<Integer> stack;
	public static void main(String[] args) throws IOException {
		Input = br.readLine();
		stack = new Stack<Integer>();
		for(int i=0;i<Input.length();i++) {
			if(Input.charAt(i)==')') {
				tmp=0;
				while(true) {
					if(stack.peek()==0) {
						stack.pop();
						stack.push(tmp);
						break;
					}
					tmp+=stack.pop();
				}
			}
			else if(Input.charAt(i)=='(') {
				stack.push(0);
			}
			else if(Input.charAt(i)=='H') {
				stack.push(1);
			}
			else if(Input.charAt(i)=='C') {
				stack.push(12);
			}
			else if(Input.charAt(i)=='O') {
				stack.push(16);
			}
			//숫자
			else {
				stack.push(stack.pop()*Character.getNumericValue(Input.charAt(i)));
			}
		}
		ans=0;
		while(!stack.isEmpty()) {
			ans+=stack.pop();
		}
		bw.write(String.valueOf(ans));
		bw.flush();bw.close();br.close();
	}
}

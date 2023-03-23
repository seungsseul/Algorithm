import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        int answer = 1;
    	Stack<String> stack = new Stack<String>();
    	for(int i=0;i<s.length();i++) {
    		stack.push(String.valueOf(s.charAt(i)));
    		if(stack.size()>=2 && stack.get(stack.size()-2).equals(stack.peek())) {
    			stack.pop();
    			stack.pop();
    		}
    	}
    	if(!stack.isEmpty()) {
    		answer=0;
    	}
    	
        return answer;
    }
}
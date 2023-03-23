import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        int answer = 1;
    	Stack<String> stack = new Stack<String>();
    	for(int i=0;i<s.length();i++) {
            //스택에 하나 넣고
    		stack.push(String.valueOf(s.charAt(i)));
            //스택이 2개이상 차있고 스택의 상위두개의 수가 같다면 그 두개 빼주기
            //이런 식으로 for문이 끝날때까지 스택의 상위두개수 비교하고 같으면 그 두개 pop()
    		if(stack.size()>=2 && stack.get(stack.size()-2).equals(stack.peek())) {
    			stack.pop();
    			stack.pop();
    		}
    	}
        //이렇게 했는데도 스택에 남는 값이 있다면 짝지어 제거하기를 성공적으로 수행하지 못했으므로 0 return
    	if(!stack.isEmpty()) {
    		answer=0;
    	}
    	
        return answer;
    }
}

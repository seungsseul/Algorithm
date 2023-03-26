import java.util.Stack;
class Solution {
    boolean solution(String s) {
        //기본값 false
		boolean ans = false;
		//s의 처음과 마지막이 각각 '('와 ')'일때만 로직 실행
		if(s.charAt(0)=='(' && s.charAt(s.length()-1)==')') {			
			Stack<Character> stack = new Stack<>();
			//왼쪽괄호만 스택에 넣어주고 오른쪽괄호는 스택최상단값을 뺄지말지의 여부를 결정할 지표로만 활용
			for(int i=0;i<s.length();i++) {
				//왼쪽괄호면 스택에 넣기
				if(s.charAt(i)=='(') {
					stack.push(s.charAt(i));
				}
				//오른쪽 괄호면 스택이 비어있는지 확인하고 아니면 스택에서 왼쪽괄호 하나 빼주기
				else {
					//스택이 비어있으면 올바르지 않은 괄호이므로 false 출력
					if(stack.isEmpty()) {
						return false;
					}
					stack.pop();
				}
			}
			//위 로직을 수행하고 스택이 비어있다면 올바른 괄호란 소리므로 true 출력
			if(stack.isEmpty()) {
				ans=true;
			}
		}	
		return ans;
    }
}
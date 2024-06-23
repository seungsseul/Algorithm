import java.util.Stack;
class Solution {
    static int answer;
    static Stack<Character> stack;
    public int solution(String s) {
        answer = 0;
        stack = new Stack<>();
        for(int i=1;i<=s.length();i++) {
            s = s.substring(1)+String.valueOf(s.charAt(0));
            answer += turning(s);
            stack.clear();
        }
        return answer;
    }
    static int turning(String str) {
        stack.push(str.charAt(0));
        for(int i=1;i<str.length();i++) {
            if(stack.isEmpty()) {
                stack.push(str.charAt(i));
                continue;
            }
            if((stack.peek()=='[' && str.charAt(i)==']') || (stack.peek()=='{' && str.charAt(i)=='}') || (stack.peek()=='(' && str.charAt(i)==')')) {
                stack.pop();
                continue;
            }
            stack.push(str.charAt(i));
        }
        if(stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}
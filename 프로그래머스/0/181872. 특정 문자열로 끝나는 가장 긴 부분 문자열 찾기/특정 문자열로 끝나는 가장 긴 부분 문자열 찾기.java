import java.util.Stack;
class Solution {
    static String pop;
    static Stack<String> stack;
    public String solution(String myString, String pat) {
        stack = new Stack<>();
        for (int i=0;i<myString.length();i++) {
            stack.push(myString.substring(0,i+1));
        }
        while(!stack.isEmpty()) {
            pop = stack.pop();
            if(pop.substring(pop.length()-pat.length(), pop.length()).equals(pat)) {
                break;
            }
        }
        return pop;
    }
}
import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        int ans=0;
    	String tmp="";
    	Stack<Integer> stack = new Stack<>();
    	int idx=0;
    	while(idx<ingredient.length) {
    		stack.push(ingredient[idx]);
    		if(stack.size()>=4) {    			
    			if(stack.get(stack.size()-4)==1 && stack.get(stack.size()-3)==2 && stack.get(stack.size()-2)==3 && stack.get(stack.size()-1)==1) {
    				ans++;
    				stack.pop();stack.pop();stack.pop();stack.pop();
    			}
    		}
    		idx++;
    	}
    	return ans;
    }
}
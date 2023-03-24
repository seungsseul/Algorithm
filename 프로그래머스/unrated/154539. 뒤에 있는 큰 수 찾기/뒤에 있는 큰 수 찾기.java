import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
    	List<Integer> list = new ArrayList<>();
    	list.add(-1);
    	int max=0;
    	for(int i=numbers.length-1;i>=0;i--) {
    		if(i==numbers.length-1) {
    			stack.push(numbers[i]);
    			continue;
    		}
    		if(stack.peek()>numbers[i]) { 
    			list.add(stack.peek());
    		}
    		else {
    			stack.pop();
    			while(!stack.isEmpty()) {
    				int tmp=stack.peek();
    				if(tmp>numbers[i]) {
    					list.add(tmp);
    					break;
    				}
    				else {
    					stack.pop();
    				}
    			}
    			if(stack.isEmpty()) {
    				list.add(-1);
    			}
    		}
    		stack.push(numbers[i]);
    	}
    	int[] answer = new int[list.size()];
    	int idx=0;
    	for(int i=list.size()-1;i>=0;i--) {
    		answer[idx]=list.get(i);
    		idx++;
    	}
        return answer;
    }
}
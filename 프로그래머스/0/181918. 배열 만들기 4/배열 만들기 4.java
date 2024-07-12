import java.util.Stack;
class Solution {
    static int i;
    static Stack<Integer> stk;
    public Stack<Integer> solution(int[] arr) {
        i = 0;
        stk = new Stack<>();
        while(i<arr.length) {
            if(!stk.isEmpty()) {
                if(stk.peek()<arr[i]) {
                    stk.push(arr[i]);
                    i++;
                }
                else {
                    stk.pop();
                }
            }
            else {
                stk.push(arr[i]);
                i++;
            }
            
        }
        return stk;
    }
}
import java.util.Deque;
import java.util.LinkedList;
class Solution {
    static int len;
    static int[] answer;
    static Deque<Integer> dq;
    public int[] solution(int[] arr, int[] query) {
        dq = new LinkedList<>();
        for(int num : arr) {
            dq.offerLast(num);
        }
        for(int i=0;i<query.length;i++) {
            len = dq.size();
            if(i%2==0) {
                for(int j=len-1;j>query[i];j--) {
                    dq.pollLast();
                }
            }
            else {
                for(int j=0;j<query[i];j++) {
                    dq.pollFirst();
                }
            }
        }
        len = dq.size();
        answer = new int[len];
        for(int i=0;i<len;i++) {
            answer[i] = dq.pollFirst();
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    static int answer, poll;
    static Deque<Integer> dq;
    public int solution(int[] people, int limit) {
        answer = 0;
        dq = new LinkedList<>();
        Arrays.sort(people);
        for(int person : people) {
            dq.offer(person);
        }
        while(!dq.isEmpty()) {
            poll = dq.pollLast();
            if(dq.isEmpty()) {
                answer++;
                break;
            }
            while(poll+dq.peekFirst()<=limit) {
                poll+=dq.pollFirst();
                if(poll<=limit) {
                    break;
                }
            }
            answer++;
        }
        return answer;
    }
}
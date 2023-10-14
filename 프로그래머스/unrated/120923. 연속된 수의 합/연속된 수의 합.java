import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public Queue<Integer> solution(int num, int total) {
        Queue<Integer> q = new LinkedList<>();
        int sum=0;
        for(int i=1;i<=num;i++) {
            q.add(i);
            sum+=i;
        }
        if(sum==total) {
            return q;
        }
        while(sum<total) {
            int poll = q.poll();
            sum-=poll;
            q.add(poll+num);
            sum+=(poll+num);
            if(sum==total) {
                return q;
            }
        }
        sum=0;
        Queue<Integer> q2 = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<num-1;i++) {
            list.add(q.poll());
        }
        for(int i=list.size()-1;i>=0;i--) {
            q2.add(list.get(i));
            sum+=list.get(i);
        }
        q2.add(0);
        while(sum>total) {
            int poll = q2.poll();
            sum-=poll;
            q2.add(poll-num);
            sum+=(poll-num);
            if(sum==total) {
                break;
            }
        }
        list.clear();
        for(int i=0;i<num;i++) {
            list.add(q2.poll());
        }
        for(int i=list.size()-1;i>=0;i--) {
            q2.add(list.get(i));
        }
        return q2;
    }
}
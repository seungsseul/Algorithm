import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Comparator;
class Solution
{   
    static PriorityQueue<Integer> bpq;
    public int solution(int []A, int []B)
    {
        int answer = 0;
        bpq = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<A.length;i++) {
            bpq.offer(B[i]);
        }
        Arrays.sort(A);
        for(int i=0;i<A.length;i++) {
            answer += (A[i]*bpq.poll());
        }
        return answer;
    }
}
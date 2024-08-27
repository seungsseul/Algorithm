import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Comparator;
class Solution {
    static Map<Integer, Integer> map;
    static PriorityQueue<Integer> pq;
    public int solution(int[] rank, boolean[] attendance) {
        map = new HashMap<>();
        for(int i=0;i<rank.length;i++) {
            if(attendance[i]) {
                map.put(i, rank[i]);
            }
        }
        pq = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        for(Integer key : map.keySet()) {
            pq.offer(key);
        }
        return 10000*pq.poll() + 100*pq.poll() + pq.poll();
    }
}
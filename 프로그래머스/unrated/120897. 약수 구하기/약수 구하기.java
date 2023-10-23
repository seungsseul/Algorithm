import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                if(n/i<i) {
                    break;
                }
                if(n/i==i) {
                    answer.add(i);
                    continue;
                }
                answer.add(i);
                answer.add(n/i);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
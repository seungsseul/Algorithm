import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(int[] numLog) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "w");
        map.put(-1, "s");
        map.put(10, "d");
        map.put(-10, "a");
        String answer = "";
        for(int i=1;i<numLog.length;i++) {
            answer+=map.get(numLog[i]-numLog[i-1]);
        }    
        return answer;
    }
}
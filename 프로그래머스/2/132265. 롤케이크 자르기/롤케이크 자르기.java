import java.util.Map;
import java.util.HashMap;
class Solution {
    static int answer;
    static Map<Integer, Integer> cake1, cake2;
    public int solution(int[] topping) {
        answer = 0;
        cake1 = new HashMap<>(); cake2 = new HashMap<>();
        for(int i=0;i<topping.length;i++) {
            if(cake2.get(topping[i])!=null) {
                cake2.put(topping[i], cake2.get(topping[i])+1);
                continue;
            }
            cake2.put(topping[i], 1);
        }
        for(int i=0;i<topping.length;i++) {
            if(cake1.get(topping[i])!=null) {
                cake1.put(topping[i], cake1.get(topping[i])+1);
            }
            else {
                cake1.put(topping[i], 1);    
            }
            cake2.put(topping[i], cake2.get(topping[i])-1);
            if(cake2.get(topping[i])==0) {
                cake2.remove(topping[i]);
            }
            answer += cake1.size()==cake2.size() ? 1 : 0;
        }
        return answer;
    }
}
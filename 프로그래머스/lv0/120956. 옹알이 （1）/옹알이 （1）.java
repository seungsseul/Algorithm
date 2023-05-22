import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < babbling.length; i++) {
            String[] tmp = babbling[i].split("aya|ye|woo|ma");
            list.add(tmp);
        }
        for(int i=0;i<list.size();i++) {
            if(list.get(i).length==0) {
                answer++;
            }
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            String tmp = String.valueOf(s.charAt(i));
            if(map.get(tmp)==null) {
                map.put(tmp, 1);   
            }
            else {
                map.put(tmp,map.get(tmp)+1);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(String s_child : list) {
            if(map.get(s_child)==1) {
                answer+=s_child;
            }
        }
        return answer;
    }
}
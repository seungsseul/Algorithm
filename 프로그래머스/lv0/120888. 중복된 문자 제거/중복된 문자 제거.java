import java.util.*;
class Solution {
    public String solution(String my_string) {
        List<String> list = new ArrayList<>();
        String answer = "";
        for(int i=0;i<my_string.length();i++) {
            if(!list.contains(String.valueOf(my_string.charAt(i))))
            list.add(String.valueOf(my_string.charAt(i)));
        }
        // System.out.println(set);
        for(int i=0;i<list.size();i++) {
            answer+=list.get(i);
        }
        return answer;
    }
}
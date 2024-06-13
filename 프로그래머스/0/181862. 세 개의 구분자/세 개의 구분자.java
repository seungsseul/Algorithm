import java.util.*;
class Solution {
    static List<String> list;
    public List<String> solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        list = new ArrayList<>();
        for(int i=0;i<answer.length;i++) {
            if(!answer[i].equals("")) {
                list.add(answer[i]);
            }
        }
        if(list.isEmpty()) {
            list.add("EMPTY");
        }
        return list;
    }
}
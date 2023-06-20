import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String tmp="";
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        List<String> list = new ArrayList<>();
        for(int i=0;i<answer.length;i++) {
            if(answer[i].equals("")) {
                continue;
            }
            list.add(answer[i]);
        }
        answer = new String[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i]=list.get(i);
        }
        return answer;
    }
}
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for(int i=0;i<answer.length;i++) {
            if(answer[i].equals("")) {
                continue;
            }
            list.add(answer[i]);
        }
        return list;
    }
}
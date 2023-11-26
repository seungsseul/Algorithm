import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("");
        String tmp="";
        List<String> list = new ArrayList<>();
        for(String str : arr) {
            try {
                int num = Integer.parseInt(str);
                tmp+=str;
            } catch(NumberFormatException e) {
                if(!tmp.equals("")) {
                    answer+=Integer.parseInt(tmp);
                }
                tmp="";
                continue;
            }
        }
        if(!tmp.equals("")) {
            answer+=Integer.parseInt(tmp);
        }
        return answer;
    }
}
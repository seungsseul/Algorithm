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
                list.add(tmp);
                tmp="";
                continue;
            }
        }
        if(!tmp.equals("")) {
            list.add(tmp);
        }
        for(int i=0;i<list.size();i++) {
            if(list.get(i).equals("")) {
                continue;
            }
            answer+=Integer.parseInt(list.get(i));
        }
        return answer;
    }
}
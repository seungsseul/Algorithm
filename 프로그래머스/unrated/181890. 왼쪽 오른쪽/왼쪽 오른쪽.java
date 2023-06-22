import java.util.*;

class Solution {
    public List<String> solution(String[] str_list) {
        List<String> q = new ArrayList<>();
        boolean flag=false;
        for(int i=0;i<str_list.length;i++) {
            if(str_list[i].equals("l") && !flag) {
                break;
            }
            if(str_list[i].equals("r") && !flag) {
                flag=true;
                q.clear();
                continue;
            }
            q.add(str_list[i]);
        }
        if(str_list.length==q.size()) {
            q.clear();
        }
        return q;
    }
}
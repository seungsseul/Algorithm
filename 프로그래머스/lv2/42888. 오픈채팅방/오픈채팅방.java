import java.io.*;
import java.util.*;
class Solution {
    public List<String> solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        List<String[]> list = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        for(int i=0;i<record.length;i++) {
            String[] order = record[i].split(" ");
            String id = order[1];
            String nickname;
            String[] tmp = new String[2];
            if(order.length>2) {           
                nickname = order[2];
                if(order[0].equals("Enter")) {
                    map.put(id, nickname);
                    tmp[0]=id;
                    tmp[1]="님이 들어왔습니다.";
                    list.add(tmp);
                }
                else if(order[0].equals("Change")) {
                    map.put(id, nickname);
                }
            }
            else {
                if(order[0].equals("Leave")) {
                    tmp[0]=id;
                    tmp[1]="님이 나갔습니다.";
                    list.add(tmp);
                }   
            }
        }
        for(int i=0;i<list.size();i++) {
            ans.add(map.get(list.get(i)[0])+list.get(i)[1]);
        }
        return ans;
    }
}
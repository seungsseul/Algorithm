import java.io.*;
import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> map = new HashMap<String, String>();
        String answer = "fail";
        String id = id_pw[0];
        String pw = id_pw[1];
        for(int i=0;i<db.length;i++) {
            map.put(db[i][0], db[i][1]);
        }
        for(int i=0;i<db.length;i++) {
            if(map.get(id)!=null) {
                answer="wrong pw";
                if(map.get(id).equals(pw)) {
                    answer="login";
                    break;
                }
            }
        }
        return answer;
    }
}
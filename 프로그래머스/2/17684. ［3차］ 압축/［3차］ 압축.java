import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    static boolean flag;
    static int ascii, idx, i;
    static String before, tmp;
    static Map<String, Integer> map;
    static List<Integer> list;
    public List<Integer> solution(String msg) {
        map = new HashMap<>();
        list = new ArrayList<>();
        ascii = 65;
        for(int j=1;j<=26;j++) {
            map.put(String.valueOf((char)ascii),j);
            ascii++;
        }
        idx = 27;
        tmp = String.valueOf(msg.charAt(0));
        i=1;
        while(true) {
            System.out.println(i+" "+tmp+" "+before);
            if(i==msg.length()) {
                if(!map.containsKey(tmp)) {
                    list.add(map.get(before));
                    before="";
                    map.put(tmp, idx);
                    tmp = tmp.substring(tmp.length()-1,tmp.length());
                    idx++;
                    i--;
                    flag = true;
                }
                else {
                    list.add(map.get(tmp));
                    break;
                }
            }
            if(map.containsKey(tmp)) {
                before = tmp;
                if(!flag) {
                    tmp+=String.valueOf(msg.charAt(i));
                }
                i++;
            }
            else {
                list.add(map.get(before));
                before="";
                map.put(tmp, idx);
                tmp = tmp.substring(tmp.length()-1,tmp.length());
                idx++;
            }
        }
        return list;
    }
}
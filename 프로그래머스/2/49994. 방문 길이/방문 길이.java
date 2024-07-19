import java.util.*;
class Solution {
    static char order;
    static String tmp, reverseTmp;
    static int r, c, nr, nc;
    static int[] dr = {0,0,-1,1};
    static int[] dc = {-1,1,0,0};
    static Map<Character, Integer> map;
    static ArrayList<String> list, reverseList;
    public int solution(String dirs) {
        map = new HashMap<>();
        map.put('L',0);
        map.put('R',1);
        map.put('U',2);
        map.put('D',3);
        r = 5; c = 5;
        list = new ArrayList<>();
        reverseList = new ArrayList<>();
        for(int i=0;i<dirs.length();i++) {
            order = dirs.charAt(i);
            nr = r+dr[map.get(order)];
            nc = c+dc[map.get(order)];
            if(nr<0 || nc<0 || nr>=11 || nc>=11) {
                continue;
            }
            tmp = String.valueOf(nr+" "+nc)+String.valueOf(order);
            if(!list.contains(tmp)) {
                order = order=='U' ? 'D' : (order=='D' ? 'U' : (order=='L' ? 'R' : 'L'));
                reverseTmp = String.valueOf(r+" "+c)+String.valueOf(order);
                if(!reverseList.contains(reverseTmp) && !list.contains(reverseTmp)) {
                    reverseList.add(reverseTmp);
                    list.add(tmp);
                }
            }
            r=nr;
            c=nc;
        }
        return list.size();
    }
}
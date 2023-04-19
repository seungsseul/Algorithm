import java.util.*;
import java.io.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<players.length;i++) {
            map.put(players[i],i);
        }
        for(int i=0;i<callings.length;i++) {
            int idx = map.get(callings[i]);
            String tmp = players[idx-1];
            players[idx-1]=players[idx];
            players[idx]=tmp;
        
            map.put(callings[i], idx-1);
            map.put(players[idx], idx);
        }

        return players;
    }
}
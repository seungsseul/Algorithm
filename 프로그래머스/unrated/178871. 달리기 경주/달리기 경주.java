import java.util.*;
import java.io.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        //플레이어의 이름과 등수 해쉬맵에 저장
        for(int i=0;i<players.length;i++) {
            map.put(players[i],i);
        }
        //추월배열을 돌면서
        for(int i=0;i<callings.length;i++) {
            //해당 추월자이름의 현재 등수 저장
            int idx = map.get(callings[i]);
            //player배열에서 추월자와 추월당하는자 위치바꾸기
            String tmp = players[idx-1];
            players[idx-1]=players[idx];
            players[idx]=tmp;
            //해쉬맵에서도 추월자와 추월당하는자 
            map.put(callings[i], idx-1);
            map.put(players[idx], idx);
        }

        return players;
    }
}

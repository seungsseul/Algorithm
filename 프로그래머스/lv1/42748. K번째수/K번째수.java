import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> ans = new ArrayList<>();
        for(int t=0;t<commands.length;t++) {
            List<Integer> list = new ArrayList<>();
            int i=commands[t][0]-1;
            int j=commands[t][1]-1;
            int k=commands[t][2]-1;
            for(int p=i;p<=j;p++) {
                list.add(array[p]);
            }
            Collections.sort(list);
            ans.add(list.get(k));
        }
        int[] answer = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            answer[i]=ans.get(i);
        }
        return answer;
    }
}
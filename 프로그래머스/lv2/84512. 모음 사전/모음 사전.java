import java.io.*;
import java.util.*;

class Solution {
    static List<String> list;
    static String[] alpabet = {"A", "E", "I", "O", "U"};
    static int idx;
    public int solution(String word) {
        list = new ArrayList<String>();
        idx=0;
        for(int i=0;i<alpabet.length;i++) {
            dfs(alpabet[i]);  
        }
        int answer=0;
        for(int i=0;i<list.size();i++) {
            if(word.equals(list.get(i))) {
                answer=i+1;
                break;
            }
        }
        return answer;
    }
    static void dfs(String word) {


        if(word.length()==6) {
            if(word.charAt(4)=='U') {
                word.substring(0, word.length()-3);
                return;
            }
            word.substring(0, word.length()-2);
            return;
        }
        list.add(word);
        dfs(word+"A");
        dfs(word+"E");
        dfs(word+"I");
        dfs(word+"O");
        dfs(word+"U");
    }
}
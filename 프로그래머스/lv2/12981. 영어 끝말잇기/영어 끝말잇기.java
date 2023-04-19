import java.io.*;
import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        int cycle=0;
        int turn=0;
        for(int i=0;i<words.length;i++) {
            turn++;
            if(i%n==0) {
                cycle++;
            }
            if(list.contains(words[i])) {
                answer[0]=turn;
                answer[1]=cycle;
                break;
            }
            if(i!=0) {
                char last = list.get(list.size()-1).charAt(list.get(list.size()-1).length()-1);
                char first = words[i].charAt(0);
                if(first!=last) {
                    answer[0]=turn;
                    answer[1]=cycle;
                    break;
                }   
            }
            list.add(words[i]);
            if(turn%n==0) {
                turn=0;
            }
        }

        return answer;
    }
}
import java.util.*;
import java.io.*;
class Solution {
    static String[] word = {"aya", "ma", "woo", "ye"};
    static int answer;
    public int solution(String[] babbling) {
        answer = 0;
        for(int i=0;i<babbling.length;i++) {
            String tmp = babbling[i];
                // String tmp2 = word[j]+word[j];
                // System.out.println(tmp2);
                tmp = tmp.replaceAll("ayaaya|yeye|woowoo|mama"," ");
                tmp = tmp.replaceAll("aya|ye|woo|ma","");
            babbling[i]=tmp;
            if(babbling[i].length()==0) {
                answer++;
            }
        }
        return answer;
    }
}
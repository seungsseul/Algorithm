import java.io.*;
import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] idxArr = new int[strArr.length];
        for(int i=0;i<strArr.length;i++) {
            int len = strArr[i].length();
            idxArr[len-1]++;
        }
        answer=idxArr[0];
        for(int i=1;i<idxArr.length;i++) {
            answer = Math.max(answer, idxArr[i]);
        }
        return answer;
    }
}
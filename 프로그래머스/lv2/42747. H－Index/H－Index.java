import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int start=10000;
        while(true) {
            int cnt=0;
            for(int i=0;i<citations.length;i++) {
                if(citations[i]>=start) {
                    cnt++;
                }
            }
            if(cnt>=start && citations.length-cnt<=start) {
                break;
            }
            start--;
        }
        answer=start;
        return answer;
    }
}
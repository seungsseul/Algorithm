import java.util.*;
import java.io.*;

class Solution {
    public int solution(int left, int right) {
        int answer=0;
        while(left<=right) {
            int cnt=0;
            int tmp=left+1;
            for(int i=1;i<=left;i++) {
                if(i>tmp) {
                    break;
                }
                if(left%i==0) {
                    cnt+=2;
                    tmp=left/i;
                    if(i==tmp) {
                        cnt--;
                    }
                }
            }
            if(cnt%2==0) {
                answer+=left;
            }
            else {
                answer-=left;
            }
            left++;
        }
        return answer;
    }
}
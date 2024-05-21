import java.util.*;
class Solution {
    static int n_binaryCnt, tmpCnt;
    static String n_binary, tmp;
    public int solution(int n) {
        n_binaryCnt = 0;
        n_binary = Integer.toBinaryString(n);
        for(int i=0;i<n_binary.length();i++) {
            if(n_binary.charAt(i)=='1') {
                n_binaryCnt++;
            }
        }
        while(true) {
            n++;
            tmpCnt = 0;
            tmp = Integer.toBinaryString(n);
            for(int i=0;i<tmp.length();i++) {
                if(tmp.charAt(i)=='1') {
                    tmpCnt++;
                }
            }
            if(tmpCnt==n_binaryCnt) {
                break;   
            }
        }
        return n;
    }
}
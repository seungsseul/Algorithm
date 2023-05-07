import java.io.*;
import java.util.*;

class Solution {
    static StringBuilder sb = new StringBuilder();
    public long solution(String numbers) {
        long answer = 0;
        for(int i=0;i<numbers.length();i++) {
            if(numbers.charAt(i)=='o') {
                sb.append("1");
                i=i+2;
            }
            else if(numbers.charAt(i)=='t') {
                if(numbers.charAt(i+1)=='w') {
                    sb.append("2");
                    i=i+2;
                }
                else {
                    sb.append("3");
                    i=i+4;
                }
            }
            else if(numbers.charAt(i)=='f') {
                if(numbers.charAt(i+1)=='o') {
                    sb.append("4");
                    i=i+3;
                }
                else {
                    sb.append("5");
                    i=i+3;
                }
            }
            else if(numbers.charAt(i)=='s') {
                if(numbers.charAt(i+1)=='i') {
                    sb.append("6");
                    i=i+2;
                }
                else {
                    sb.append("7");
                    i=i+4;
                }
            }
            else if(numbers.charAt(i)=='e') {
                sb.append("8");
                i=i+4;
            }
            else if(numbers.charAt(i)=='n') {
                sb.append("9");
                i=i+3;
            }
            else if(numbers.charAt(i)=='z') {
                sb.append("0");
                i=i+3;
            }
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
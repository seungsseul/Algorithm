import java.io.*;
import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = new String[my_string.length()];
        for(int i=0;i<arr.length;i++) {
            arr[i]=String.valueOf(my_string.charAt(i));
        }
        for(int i=0;i<indices.length;i++) {
            arr[indices[i]]="0";
        }
        for(int i=0;i<arr.length;i++) {
            if(!arr[i].equals("0")) {
                answer+=arr[i];
            }
        }
        return answer;
    }
}
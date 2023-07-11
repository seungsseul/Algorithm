import java.util.*;
class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        String answer = "";
        for(int i=0;i<my_string.length();i++) {
            set.add(String.valueOf(my_string.charAt(i)));
        }
        return String.join("", set);
    }
}
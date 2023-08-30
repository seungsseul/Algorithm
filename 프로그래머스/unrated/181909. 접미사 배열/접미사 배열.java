import java.util.*;
class Solution {
    public Set<String> solution(String my_string) {
        Set<String> answer = new TreeSet<>();
        for(int i=0;i<my_string.length();i++) {
            answer.add(my_string.substring(i));
        }
        return answer;
    }
}
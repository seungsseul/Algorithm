import java.util.*;
class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<my_string.length();i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                list.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }
        Collections.sort(list);
        return list;
    }
}
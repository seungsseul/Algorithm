import java.util.*;
class Solution {
    public List<Integer> solution(String myString) {
        String[] tmp = myString.split("x",-1);
        System.out.println(Arrays.toString(tmp));
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<tmp.length;i++) {
            answer.add(tmp[i].length());
        }
        return answer;
    }
}
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        loop:
        for(int i=l;i<=r;i++) {
            String[] arr = String.valueOf(i).split("");
            for(String num : arr) {
                if(!(num.equals("0") || num.equals("5"))) {
                    continue loop;
                }
            }
            answer.add(i);
        }
        if(answer.size()==0) {
            answer.add(-1);
        }
        return answer;
    }
}
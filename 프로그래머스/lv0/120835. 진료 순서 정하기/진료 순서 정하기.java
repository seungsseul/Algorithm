import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] tmp = Arrays.copyOf(emergency, emergency.length);
        int num=tmp.length-1;
        Arrays.sort(tmp);
        int[] answer = new int[num+1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<=tmp.length;i++) {
            map.put(tmp[num], i);
            num--;
        }
                System.out.println(Arrays.toString(emergency));
        for(int i=0;i<emergency.length;i++) {
                    System.out.println(emergency[i]);
            answer[i]=map.get(emergency[i]);
        }
        return answer;
    }
}
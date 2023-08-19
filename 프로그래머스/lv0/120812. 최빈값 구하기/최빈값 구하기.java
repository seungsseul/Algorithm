import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[0];
        int now=0;
        int cnt=0;
        int max=-1;
        boolean flag=true;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++) {
            now=array[i];
            cnt++;
            if(i+1==array.length || now!=array[i+1]) {
                if(max<=cnt) {
                    if(max<cnt) {
                        list.clear();
                    }
                    max=Math.max(max,cnt);
                    answer=now;
                    list.add(answer);
                }
                cnt=0;
            }
        }
        if(list.size()>1) {
            answer=-1;
        }
        return answer;
    }
}
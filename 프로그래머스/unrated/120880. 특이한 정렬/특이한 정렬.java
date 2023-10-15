import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] arr = new int[numlist.length];
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int i=0;i<numlist.length;i++) {
            int abs = Math.abs(n-numlist[i]);
            if(map.get(abs)==null) {
                map.put(abs, numlist[i]);
            }
            else {
                map2.put(abs, numlist[i]);
            }
        }
        for(int k : map.keySet()) {
            list.add(k);
        }
        Collections.sort(list);
        int idx=0;
        for(int i=0;i<list.size();i++) {
            if(map2.get(list.get(i))!=null) {
                arr[idx]=Math.max(map2.get(list.get(i)),map.get(list.get(i)));
                arr[++idx]=Math.min(map2.get(list.get(i)),map.get(list.get(i)));
                idx++;
                continue;
            }
            arr[idx]=map.get(list.get(i));
            idx++;
            
        }
        System.out.println(map);System.out.println(map2);
        return arr;
    }
}
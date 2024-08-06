import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    static Set<Integer> set;
    static ArrayList<Integer> list;
    public ArrayList<Integer> solution(int n) {
        set = new HashSet<>();
        loop:
        for(int i=2;i<=n;i++) {
            while(true) {
                if(n%i==0) {
                    set.add(i);
                    n/=i;
                    if(n%i==0 && n/i==1) {
                        break loop;
                    }
                }
                else {
                    break;
                }
            }
        }
        list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
import java.util.*;
class Solution {
    public List<Integer> solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int kk=k;
        while(k<=n) {
            list.add(k);
            k+=kk;
        }
        return list;
    }
}
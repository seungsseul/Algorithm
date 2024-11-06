import java.util.Arrays;
import java.util.Comparator;
class Solution {
    static String[] arr;
    static String ans;
    public String solution(String s) {
        arr = new String[s.length()];
        for(int i=0;i<arr.length;i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o1.toUpperCase())) {
                    if(o2.equals(o2.toUpperCase())) {
                        return o2.compareTo(o1);
                    }
                    return 1;
                }
                if(o2.equals(o2.toUpperCase())) {
                    if(o1.equals(o1.toUpperCase())) {
                        return o2.compareTo(o1);
                    }
                    return -1;
                }
                return o2.compareTo(o1);
            }
        });
        ans = "";
        for(String alpabet : arr) {
            ans += alpabet;
        }
        return ans;
    }
}
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    static int min, idx;
    static String o1_tmp, o2_tmp, answer;
    static String[] arr;
    public String solution(int[] numbers) {
        arr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                // idx = 0;
                // for(int i=0;i<Math.min(o1.length(), o2.length());i++) {
                //     if(o1.charAt(i)!=o2.charAt(i)) {
                //         return o1.charAt(i)-o2.charAt(i);
                //     }
                //     idx = i;
                // }
                // if(o1.length()<o2.length()) {
                //     if(o1.charAt(idx)==o2.charAt(idx+1)) {
                //         return o2.length()-o1.length();
                //     }
                // }
                // else {
                //     if(o1.charAt(idx+1)==o2.charAt(idx)) {
                //         return o2.length()-o1.length();
                //     }
                // }
                // return o1.length()-o2.length();
                return (o2+o1).compareTo(o1+o2);
            }
        });
        answer = "";
        for(String num : arr) {
            answer += num;
        }
        answer = answer.charAt(0)=='0' ? "0" : answer;
        return answer;
    }
}
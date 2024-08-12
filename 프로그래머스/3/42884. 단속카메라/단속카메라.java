import java.util.Arrays;
import java.util.Comparator;
class Solution {
    static int max, answer;
    public int solution(int[][] routes) {
        Arrays.sort(routes,(o1,o2)->(o1[1]-o2[1]));
        Arrays.sort(routes, new Comparator<>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        answer = 1;
        max = routes[0][1];
        for(int i=1;i<routes.length;i++) {
            if(max<routes[i][0]) {
                max = routes[i][1];
                answer++;
            }
        }
        return answer;
    }
}
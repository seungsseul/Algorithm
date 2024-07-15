import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
class Solution {
    static int last, time;
    static boolean flag;
    static String[] arr;
    static String city;
    static Queue<Integer> q;
    public int solution(int cacheSize, String[] cities) {
        last = 0; time = 0;
        if(cacheSize==0) {
            time = cities.length*5;
        }
        else {
            arr = new String[cacheSize];
            Arrays.fill(arr, "");
            q = new LinkedList<>();
            loop:
            for(int i=0;i<cities.length;i++) {
                city = cities[i].toLowerCase();
                //페이지 부재여부 체크
                for(int j=0;j<cacheSize;j++) {
                    if(arr[j].equals(city)) {
                        time += 1;
                        q.remove(j);
                        q.offer(j);
                //         System.out.println(Arrays.toString(arr));
                // System.out.println(q);
                        continue loop;
                    }
                    if(arr[j].equals("")) {
                        flag = false;
                    }
                    if(!arr[j].equals("") && j==cacheSize-1) {
                        flag = true;
                    }
                }
                time += 5;
                if(flag) {
                    last = q.poll();
                    q.offer(last);
                    arr[last] = city;
                }
                else {
                    q.offer(last);
                    arr[last] = city;
                    if(last+1<cacheSize) {
                        last++;
                    }
                }
                // System.out.println(Arrays.toString(arr));
                // System.out.println(q);
            }   
        }
        return time;
    }
}
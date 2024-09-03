import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        if(a==b && b==c && c==d) {
            return 1111*a;
        }
        int[] arr = new int[4];
        arr[0] = a; arr[1] = b; arr[2] = c; arr[3] = d;
        Arrays.sort(arr);
        if((arr[0]!=arr[1] && arr[1]==arr[3]) || (arr[3]!=arr[2] && arr[2]==arr[0])) {
            if(arr[0]!=arr[1]) {
                return (int)Math.pow(10*arr[1]+arr[0],2);
            }
             return (int)Math.pow(10*arr[2]+arr[3],2);
        }
        if(arr[0]==arr[1] && arr[2]==arr[3]) {
            return (arr[0]+arr[2])*Math.abs(arr[0]-arr[2]);
        }
        if(arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[3]) {
            if(arr[0]==arr[1]) {
                return arr[2]*arr[3];
            }
            if(arr[1]==arr[2]) {
                return arr[0]*arr[3];
            }
            return arr[0]*arr[1];
        }
        return arr[0];
    }
}
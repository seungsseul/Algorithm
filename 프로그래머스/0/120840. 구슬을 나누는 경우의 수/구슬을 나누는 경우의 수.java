import java.util.*;
class Solution {
    public int solution(int balls, int share) {
        return (int)(factorial(balls, balls-share, 1));
    }
    static long factorial(int end, int start, int divide) {
        long result = 1;
        for(int i=start+1;i<=end;i++) {
            result *= i;
            result /= divide;
            divide++;
        }
        return result;
    }
}
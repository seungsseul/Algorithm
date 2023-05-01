import java.io.*;
import java.util.*;

class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, 0, 0, target);
        return answer;
    }
    static void dfs(int[] numbers, int current, int sum, int target) {
        if(current==numbers.length) {
            if(sum==target) {
                answer++;
            }
            return;
        }
        dfs(numbers, current+1, sum+numbers[current], target);
        dfs(numbers, current+1, sum+(numbers[current]*-1), target);
    }
}
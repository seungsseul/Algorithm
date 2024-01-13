import java.util.*;
class Solution {
    static Set<Integer> set = new TreeSet<>();
    static void combi(int[] arr, boolean[] visited, int start, int depth, int r) {
        if(depth==r) {
            int sum=0;
            for(int i=0;i<visited.length;i++) {
                if(visited[i]) {
                    sum+=arr[i];    
                }   
            }
            set.add(sum);
            System.out.println();
            return;
        }
        for(int i=start;i<arr.length;i++) {
            if(!visited[i]) {
                visited[i]=true;
                combi(arr, visited, i+1, depth+1, r);
                visited[i]=false;   
            }
        }
    }
    
    public Set<Integer> solution(int[] numbers) {
        boolean[] visited = new boolean[numbers.length];
        combi(numbers, visited, 0, 0, 2);
        return set;
    }
}
import java.util.stream.Stream;
import java.util.ArrayList;
class Solution {
    static int answer;
    static ArrayList<Integer> list;
    static boolean[] visited;
    public int solution(String numbers) {
        answer = 0;
        list = new ArrayList<>();
        visited = new boolean[7];
        for(int i=1;i<=numbers.length();i++) {
            dfs(numbers, "", i);
        }
        System.out.println(list);
        int[] ans_arr = list.stream().mapToInt(value -> value).toArray();
        loop:
        for(int num : ans_arr) {
            if(num<2) {
                continue;
            }
            for(int i=2; i*i<=num; i++) {
			    if(num % i == 0) {
                    continue loop;
                }
		    }
            System.out.println(num);
            answer++;
        }
        return answer;
    }
    static void dfs(String str, String temp, int m) {
            if(temp.length() == m){
                int num = Integer.parseInt(temp);
                if(!list.contains(num)){
                    list.add(num);
                }
            }
        
            for(int i=0; i<str.length(); i++){
                if(!visited[i]){
                    visited[i] = true;
                    temp += str.charAt(i);
                    dfs(str, temp, m);
                    visited[i] = false;
                    temp = temp.substring(0, temp.length()-1);
                }
            }
		
	}
}
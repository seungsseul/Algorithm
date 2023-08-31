class Solution {
    public int solution(String num_str) {
        String[] arr = num_str.split("");
        int answer = 0;
        for(int i=0;i<arr.length;i++) {
            answer+=Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
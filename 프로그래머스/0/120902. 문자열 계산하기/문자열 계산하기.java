class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for(int i=0;i<arr.length-1;i++) {
            if(i%2==0) {
                continue;
            }
            answer += arr[i].equals("+") ? Integer.parseInt(arr[i+1])*1 : Integer.parseInt(arr[i+1])*-1; 
        }
        return answer;
    }
}
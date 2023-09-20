class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int answer = 0;
        for(int i=1;i<arr.length;i++) {
            if(!arr[i].equals("Z") && !arr[i-1].equals("Z")) {
                answer+=Integer.parseInt(arr[i-1]);
            }
        }
        if(!arr[arr.length-1].equals("Z")) {
            answer+=Integer.parseInt(arr[arr.length-1]);   
        }
        return answer;
    }
}
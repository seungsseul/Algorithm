class Solution {
    public int solution(int n) {
        String[] numArr = String.valueOf(n).split("");
        int answer = 0;
        for(String num : numArr) {
            answer+=Integer.parseInt(num);
        }
        return answer;
    }
}
class Solution {
    public int solution(int order) {
        String tmp = String.valueOf(order);
        int answer = 0;
        for(int i=0;i<tmp.length();i++) {
            if(tmp.charAt(i)=='3' || tmp.charAt(i)=='6' || tmp.charAt(i)=='9') {
                answer++;
            }
        }
        return answer;
    }
}
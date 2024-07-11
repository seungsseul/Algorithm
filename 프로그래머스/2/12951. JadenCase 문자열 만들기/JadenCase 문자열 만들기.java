class Solution {
    static String answer;
    public String solution(String s) {
        answer = s.substring(0,1).toUpperCase();
        for(int i=1;i<s.length();i++) {
            answer += (s.charAt(i-1)==' ' && s.charAt(i)!=' ') ? String.valueOf(s.charAt(i)).toUpperCase() : String.valueOf(s.charAt(i)).toLowerCase();
        }
        return answer;
    }
}
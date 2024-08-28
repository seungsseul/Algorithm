class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0;i<myString.length();i++) {
            if(myString.length()-i<pat.length()) {
                break;
            }
            String tmp = "";
            for(int j=i;j<i+pat.length();j++) {
                tmp+=String.valueOf(myString.charAt(j));
            }
            answer += tmp.equals(pat) ? 1 : 0;
        }
        return answer;
    }
}
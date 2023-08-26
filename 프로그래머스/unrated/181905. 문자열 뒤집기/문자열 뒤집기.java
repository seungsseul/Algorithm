class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        for(int i=0;i<my_string.length();i++) {
            if(i==s) {
                for(int j=e;j>=i;j--) {
                    answer+=String.valueOf(my_string.charAt(j));
                }
                i=e;
                continue;
            }
            answer+=String.valueOf(my_string.charAt(i));
        }
        return answer;
    }
}
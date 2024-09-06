class Solution {
    String mode, answer;
    public String solution(String code) {
        mode = "0";
        answer = "";
        for(int i=0;i<code.length();i++) {
            if(mode.equals("0")) {
                if(code.charAt(i)!='1') {
                    if(i%2==0) {
                        answer+=String.valueOf(code.charAt(i));
                    }
                }
                else {
                    mode = "1";
                }
            }
            else {
                if(code.charAt(i)!='1') {
                    if(i%2!=0) {
                        answer+=String.valueOf(code.charAt(i));
                    }
                }
                else {
                    mode = "0";
                }
            }
        }
        return answer.equals("") ? "EMPTY" : answer;
    }
}
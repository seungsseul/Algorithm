class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++) {
            String str = String.valueOf(my_string.charAt(i));
            answer += my_string.charAt(i)>=97 && my_string.charAt(i)<=122 ? str.toUpperCase() : str.toLowerCase(); 
        }
        return answer;
    }
}
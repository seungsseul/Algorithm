class Solution {
    public String solution(String my_string, int m, int c) {
        String[] arr = my_string.split("");
        String answer = "";
        for(int i=0;i<my_string.length();i+=m) {
            answer+=my_string.substring(i+c-1,i+c);
        }
        return answer;
    }
}
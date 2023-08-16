class Solution {
    public String solution(int age) {
        String answer = "";
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
        int len=String.valueOf(age).length();
        for(int i=0;i<len;i++) {
            answer+=arr[String.valueOf(age).charAt(i)-'0'];
        }
        return answer;
    }
}
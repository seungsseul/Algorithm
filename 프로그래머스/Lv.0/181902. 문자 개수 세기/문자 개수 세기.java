class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0;i<my_string.length();i++) {
            if(my_string.charAt(i)>=65 && my_string.charAt(i)<=91) {
                answer[my_string.charAt(i)-65]++;   
            }
            else if(my_string.charAt(i)>=97 && my_string.charAt(i)<=123) {
                answer[my_string.charAt(i)-71]++;
            }
        }
        return answer;
    }
}
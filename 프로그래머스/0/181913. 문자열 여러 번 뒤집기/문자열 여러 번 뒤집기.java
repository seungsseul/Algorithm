class Solution {
    static String[] word, word_copy;
    static String tmp, answer;
    static int idx;
    public String solution(String my_string, int[][] queries) {
        word = new String[my_string.length()];
        word_copy = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++) {
            word[i] = String.valueOf(my_string.charAt(i));
            word_copy[i] = word[i];
        }
        for(int i=0;i<queries.length;i++) {
            idx = queries[i][0];
            for(int j=queries[i][1];j>=queries[i][0];j--) {
                word[idx] = word_copy[j];
                idx++;
            }
            for(int j=0;j<word.length;j++) {
                word_copy[j] = word[j];
            }
        }
        answer = "";
        for(String w : word) {
            answer += w;
        }
        return answer;
    }
}
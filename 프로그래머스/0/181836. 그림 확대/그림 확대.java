class Solution {
    static int idx;
    static String[] answer;
    static StringBuilder sb = new StringBuilder();
    public String[] solution(String[] picture, int k) {
        idx = -1;
        answer = new String[picture.length*k];
        for(int i=0;i<picture.length;i++) {
            for(int j=0;j<picture[i].length();j++) {
                sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
            }
            for(int j=0;j<k;j++) {
                answer[++idx] = sb.toString();
            }
            sb.setLength(0);
        }
        return answer;
    }
}
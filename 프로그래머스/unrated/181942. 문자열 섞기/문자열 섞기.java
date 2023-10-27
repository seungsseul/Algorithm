class Solution {
    public String solution(String str1, String str2) {
        String answer="";
        int len=str1.length()+str2.length();
        int idx1=0; int idx2=0;
        for(int i=0;i<len;i++) {
            if(i%2==0) {
                answer+=String.valueOf(str1.charAt(idx1));
                idx1++;
            }
            else {
                answer+=String.valueOf(str2.charAt(idx2));
                idx2++;
            }
        }
        return answer;
    }
}
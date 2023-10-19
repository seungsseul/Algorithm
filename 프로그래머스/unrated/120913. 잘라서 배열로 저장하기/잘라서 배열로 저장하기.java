class Solution {
    public String[] solution(String my_str, int n) {
        int plus=(my_str.length()%n==0 ? 0 : 1);
        String[] answer = new String[my_str.length()/n+plus];
        int start=0;
        for(int i=0;i<answer.length;i++) {
            if(start+n>=my_str.length()) {
                n=my_str.length()-start;   
            }
            answer[i]=my_str.substring(start,start+n);
            start+=n;
        }
        return answer;
    }
}
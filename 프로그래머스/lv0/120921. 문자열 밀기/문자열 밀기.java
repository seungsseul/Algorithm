class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if(!A.equals(B)) {
            int range=1;
            while(true) {
                answer++;
                String tmp = "";
                for(int i=A.length()-range;i<A.length();i++) {
                    tmp+=String.valueOf(A.charAt(i));
                }
                for(int j=0;j<A.length()-range;j++) {
                    tmp+=String.valueOf(A.charAt(j));
                }
                if(tmp.equals(A)) {
                    answer=-1;
                    break;
                }
                else if(tmp.equals(B)) {
                    break;
                }
                range++;
            }      
        }
        return answer;
    }
}
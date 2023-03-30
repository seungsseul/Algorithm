class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        //배열에서 Kim인 인덱스 찾으면 그게 답
        for(int i=0;i<seoul.length;i++) {
            if(seoul[i].equals("Kim")) {
                answer+=i;
                break;
            }
        }
        answer+="에 있다";
        return answer;
    }
}

class Solution {
    public String solution(String rsp) {
        String answer = rsp.replace("0","1").replace("5","4").replace("2","0").replace("1","5").replace("4","2");
        return answer;
    }
}
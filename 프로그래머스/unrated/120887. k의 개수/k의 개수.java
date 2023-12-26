class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i;n<=j;n++) {
            String[] strArr = String.valueOf(n).split("");
            for(int m=0;m<strArr.length;m++) {
                if(Integer.parseInt(strArr[m])==k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
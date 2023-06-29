class Solution {
    public int solution(int a, int b) {
        int a_tmp = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int b_tmp = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
        if(a_tmp>=b_tmp) {
            return a_tmp;
        }
        else {
            return b_tmp;
        }
    }
}
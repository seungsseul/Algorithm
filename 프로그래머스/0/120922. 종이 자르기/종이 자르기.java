class Solution {
    public int solution(int M, int N) {
        return (Math.min(M,N)-1)+((Math.max(M,N)-1)*Math.min(M,N));
    }
}
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[common.length-1]-common[common.length-2]==common[1]-common[0]) {
            answer=common[common.length-1]+(common[1]-common[0]);
        }
        else {
            answer=common[common.length-1]*(common[1]/common[0]);
        }
        return answer;
    }
}
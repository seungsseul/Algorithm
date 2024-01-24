class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx=n;
        for(int i=0;i<num_list.length;i++) {
            if(idx==num_list.length) {
                idx=0;
            }
            answer[i]=num_list[idx];
            idx++;
        }
        return answer;
    }
}
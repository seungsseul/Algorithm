class Solution {
    public int[] solution(int[] arr) {
        int num = 0;
        while(true) {
            if((int)Math.pow(2, num)>=arr.length) {
                break;
            }
            num++;
        }
        int[] answer = new int[(int)Math.pow(2, num)];
        for(int i=0;i<arr.length;i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}
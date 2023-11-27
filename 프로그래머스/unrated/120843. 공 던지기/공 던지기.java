class Solution {
    public int solution(int[] numbers, int k) {
        int cnt=1;int num=1;
        while(cnt<k) {
            num+=2;
            cnt++;
            if(numbers[numbers.length-1]<num) {
                num=num-numbers[numbers.length-1];
            }
        }
        return num;
    }
}
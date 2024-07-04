class Solution {
    public boolean solution(int x) {
        boolean answer = x%sumAll(x)==0 ? true : false;
        return answer;
    }
    static int sumAll(int num) {
        String[] arr = String.valueOf(num).split("");
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }
}
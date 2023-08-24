class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++) {
            if(String.valueOf(array[i]).contains("7")) {
                String str = String.valueOf(array[i]);
                for(int j=0;j<str.length();j++) {
                    if(str.charAt(j)=='7') {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
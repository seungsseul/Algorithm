class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] arr = after.split("");
        for(int i=0;i<before.length();i++) {
            String str = String.valueOf(before.charAt(i));
            for(int j=0;j<arr.length;j++) {
                if(arr[j].equals("")) {
                    continue;
                }
                if(arr[j].equals(str)) {
                    arr[j]="";
                    answer++;
                    break;
                }
            }
        }
        if(answer==after.length()) {
            return 1;
        }
        return 0;
    }
}
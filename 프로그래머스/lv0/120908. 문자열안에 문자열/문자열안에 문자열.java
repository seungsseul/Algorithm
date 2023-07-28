class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        String tmp="";
        int cnt=0;
        String[] arr = str1.split("");
        for(int i=0;i<arr.length-str2.length()+1;i++) {
            tmp="";
            for(int j=i;j<str2.length()+i;j++) {
                tmp+=arr[j];
            }
            if(tmp.equals(str2)) {
                answer=1;
                break;
            }
        }
        return answer;
    }
}
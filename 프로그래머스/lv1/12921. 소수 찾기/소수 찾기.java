class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n+1];
        arr[0]=true;arr[1]=true;
        for(int i=2;i<=n;i++) {
            if(arr[i]) {
                continue;
            }
            for(int j=i;j<=n;j+=i) {
                if(j!=i) {
                  arr[j]=true;     
                } 
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(!arr[i]) {
                answer++;
            }
        }
        return answer;
    }
}
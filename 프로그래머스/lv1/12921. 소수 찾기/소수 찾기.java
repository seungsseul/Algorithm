class Solution {
    public int solution(int n) {
        int answer = 0;
        //소수인 숫자는 false, 아닌 숫자는 true
        boolean[] arr = new boolean[n+1];
        //0과 1은 소수가 아님
        arr[0]=true;arr[1]=true;
        for(int i=2;i<=n;i++) {
            //2. 소수가 아닌 숫자는 확인할 필요없으므로 continue
            if(arr[i]) {
                continue;
            }
            //1. 해당 숫자(i)를 제외한 i의 배수를 전부 true로 변경 => 소수가 아님
            for(int j=i;j<=n;j+=i) {
                if(j!=i) {
                  arr[j]=true;     
                } 
            }
        }
        //소수 개수 세기
        for(int i=0;i<arr.length;i++) {
            if(!arr[i]) {
                answer++;
            }
        }
        return answer;
    }
}
